package br.com.sindicato.daos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import br.com.sindicato.model.Endereco;

public class EnderecoDao {

	private SessionFactory factory;

	public void inserirEndereco(Endereco endereco) {
		Session session = factory.openSession();
		try {

			session.save(endereco);
			session.flush();
			session.close();
		} catch (Exception e) {

			System.out.println(e);
			session.close();

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
