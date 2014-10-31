package br.com.sindicato.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.annotations.SQLDelete;

import br.com.sindicato.model.Contribuinte;
import br.com.sistemassindicato.hibernate.HibernateUtil;

public class ContribuinteDao {

	private static final Class Contribuinte = null;
	Session session = HibernateUtil.getSessionFactory();

	public void inserirContribuinte(Contribuinte contribuinte) {

		Transaction tx = session.beginTransaction();

		try {
			session.save(contribuinte);
			tx.commit();
			session.flush();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}

	}

	public void atualizarContribuinte(Session session, int id, String nome,
			String cpf, String rg, String tituloEleitor, String telefone,
			String dependentes) {

		Transaction tx = session.beginTransaction();
		Contribuinte contribuintePesq = (Contribuinte) session.load(
				Contribuinte.class, id);

		contribuintePesq.setNome(nome);
		contribuintePesq.setCpf(cpf);
		contribuintePesq.setRg(rg);
		contribuintePesq.setTitulo(tituloEleitor);
		contribuintePesq.setTelefone(telefone);
		contribuintePesq.setDependentes(dependentes);

		try {

			session.update(contribuintePesq);
			tx.commit();
			session.flush();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
	}

	public void deletarContribuinte(Session session, int id) {

		Transaction tx = session.beginTransaction();
		Contribuinte contribuintePesq = (Contribuinte) session.load(
				Contribuinte.class, id);

		try {

			session.delete(contribuintePesq);

			tx.commit();
			session.flush();
			session.close();

		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
			tx.rollback();
		}

	}

	public List<Contribuinte> listarContribuinte() {
		return session.createCriteria(Contribuinte.class).list();
	}

	public Contribuinte buscarPorId(int id) {
		Contribuinte retorno;
		retorno = (Contribuinte) session.get(Contribuinte.class, id);
		return retorno;
	}

}
