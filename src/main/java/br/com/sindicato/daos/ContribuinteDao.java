package br.com.sindicato.daos;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mysql.jdbc.PreparedStatement;

import br.com.sindicato.model.Contribuinte;
import br.com.sindicato.model.Endereco;

public class ContribuinteDao {

	private SessionFactory factory;

	public ContribuinteDao() {
		factory = new Configuration().addClass(Contribuinte.class)
				.buildSessionFactory();

	}

	public void inserirContribuinte(Contribuinte contribuinte) {
		Session session = factory.openSession();
		session.beginTransaction();

		try {

			session.save(contribuinte);
			session.flush();
			session.close();
		} catch (Exception e) {

			System.out.println(e);
			session.close();

		}

	}

	public void atualizarContribuinte(Contribuinte contribuinte) {
		Session session = factory.openSession();
		session.beginTransaction();
		try {

			session.update(contribuinte);
			session.flush();
			session.close();

		} catch (Exception e) {
			System.out.println(e);
			session.close();
		}
	}

	public void deletarContribuinte(Contribuinte contribuinte) {
		Session session = factory.openSession();
		session.beginTransaction();
		try {

			session.delete(contribuinte);
			session.flush();
			session.close();

		} catch (Exception e) {
			System.out.println(e);
			session.close();
		}

	}

	public List<Contribuinte> listarContribuinte() {
		Session session = factory.openSession();
		session.beginTransaction();

		Query consulta = (Query) session
				.createQuery("select contribuinte from Contribuinte contribuinte");
		List<Contribuinte> contribuintes = consulta.getResultList();
		session.flush();
		session.close();

		return contribuintes;
	}

}
