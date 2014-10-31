package br.com.sindicato.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import br.com.sindicato.model.Contribuinte;
import br.com.sindicato.model.Funcionario;
import br.com.sistemassindicato.hibernate.HibernateUtil;

public class FuncionarioDao {

	Session session = HibernateUtil.getSessionFactory();
	
	public void inserirFuncionario(Funcionario funcionario) {

		Transaction tx = session.beginTransaction();
		try {

			session.saveOrUpdate(funcionario);
			tx.commit();
			session.flush();
			session.close();
		} catch (Exception e) {

			e.printStackTrace();
			tx.rollback();

		}

	}

	public void atualizarFuncionario(Session session, int id, String nome,
			String cpf, String rg, String tituloEleitor, String telefone,
			String dependentes, String cargo, double salario) {

		Transaction tx = session.beginTransaction();
		Funcionario funcionarioPesq = (Funcionario) session.load(
				Funcionario.class, id);

		funcionarioPesq.setNome(nome);
		funcionarioPesq.setCpf(cpf);
		funcionarioPesq.setRg(rg);
		funcionarioPesq.setTitulo(tituloEleitor);
		funcionarioPesq.setTelefone(telefone);
		funcionarioPesq.setDependentes(dependentes);
		funcionarioPesq.setCargo(cargo);
		funcionarioPesq.setSalario(salario);

		try {

			session.update(funcionarioPesq);
			tx.commit();
			session.flush();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
	}

	public void deletarFuncionario(Session session, int id) {

		Transaction tx = session.beginTransaction();
		Funcionario funcionarioPesq = (Funcionario) session.load(
				Funcionario.class, id);

		try {

			session.delete(funcionarioPesq);
			tx.commit();
			session.flush();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}

	}

	public List<Funcionario> listarFuncionario() {
		return session.createCriteria(Funcionario.class).list();
	}

	public Funcionario buscarPorId(int id) {
		Funcionario retorno;
		retorno = (Funcionario) session.get(Funcionario.class, id);
		return retorno;
	}
}
