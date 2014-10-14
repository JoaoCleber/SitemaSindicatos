package br.com.sindicato.daos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import br.com.sindicato.model.Funcionario;

public class FuncionarioDao {
	
private SessionFactory factory;
	
	
	
	public void inserirContribuinte(Funcionario funcionario){
		Session session = factory.openSession();
		try {
			
			session.save(funcionario);
			session.flush();
			session.close();
		} catch (Exception e) {
			
			System.out.println(e);
			session.close();
			
		}
		
	
		
	}
	public void atualizarContribuinte(Funcionario funcionario){
		Session session = factory.openSession();
		try {
			
			session.update(funcionario);
			session.flush();
			session.close();
			
		} catch (Exception e) {
			System.out.println(e);
			session.close();
		}
	}
	public void deletarContribuinte(Funcionario funcionario){
		Session session = factory.openSession();
		try {
			
			session.delete(funcionario);
			session.flush();
			session.close();
			
		} catch (Exception e) {
			System.out.println(e);
			session.close();
		}
		
		
	}
	public void listarFuncionario(){
		
	}


}
