package br.com.sindicato.daos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.annotations.SQLDelete;

import br.com.sindicato.model.Endereco;
import br.com.sistemassindicato.hibernate.HibernateUtil;

public class EnderecoDao {

	private SessionFactory factory;

	public void inserirEndereco(Endereco endereco) {
		Session session = HibernateUtil.getSessionFactory();
		Transaction tx = session.beginTransaction();
		try {

			session.save(endereco);
			tx.commit();
			session.flush();
			session.close();
		} catch (Exception e) {

			e.printStackTrace();
			tx.rollback();

		}

	}

	public void atualizarEndereco(Endereco endereco) {
		Session session = factory.openSession();
		try {

			session.update(endereco);
			session.flush();
			session.close();

		} catch (Exception e) {
			System.out.println(e);
			session.close();
		}
	}

	 
	public void deletarEndereco(Endereco endereco) {
		Session session = factory.openSession();
		try {

			session.delete(endereco);
			session.flush();
			session.close();

		} catch (Exception e) {
			System.out.println(e);
			session.close();
		}

	}

	public void listarEndereco() {

	}

}
