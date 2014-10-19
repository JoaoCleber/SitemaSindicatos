package br.com.sindicato.daos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import br.com.sindicato.model.Instituicao;

public class InstituicaoDao {

	private SessionFactory factory;

	public void inserirInstituicao(Instituicao instituicao) {
		Session session = factory.openSession();
		try {

			session.save(instituicao);
			session.flush();
			session.close();
		} catch (Exception e) {

			System.out.println(e);
			session.close();

		}

	}

	public void atualizarInstituicao(Instituicao instituicao) {
		Session session = factory.openSession();
		try {

			session.update(instituicao);
			session.flush();
			session.close();

		} catch (Exception e) {
			System.out.println(e);
			session.close();
		}
	}

	public void deletarInstituicai(Instituicao instituicao) {
		Session session = factory.openSession();
		try {

			session.delete(instituicao);
			session.flush();
			session.close();

		} catch (Exception e) {
			System.out.println(e);
			session.close();
		}

	}

	public void listarInstituicao() {

	}

}
