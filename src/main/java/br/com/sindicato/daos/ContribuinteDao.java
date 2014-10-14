package br.com.sindicato.daos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mysql.jdbc.PreparedStatement;

import br.com.sindicato.model.Contribuinte;
import br.com.sindicato.model.Endereco;

public class ContribuinteDao {
	
	private SessionFactory factory;
	
	
	
	public void inserirContribuinte(Contribuinte contribuinte){
		Session session = factory.openSession();
		try {
			
			session.save(contribuinte);
			session.flush();
			session.close();
		} catch (Exception e) {
			
			System.out.println(e);
			session.close();
			
		}
		
	
		
	}
	public void atualizarContribuinte(Contribuinte contribuinte){
		Session session = factory.openSession();
		try {
			
			session.update(contribuinte);
			session.flush();
			session.close();
			
		} catch (Exception e) {
			System.out.println(e);
			session.close();
		}
	}
	public void deletarContribuinte(Contribuinte contribuinte){
		Session session = factory.openSession();
		try {
			
			session.delete(contribuinte);
			session.flush();
			session.close();
			
		} catch (Exception e) {
			System.out.println(e);
			session.close();
		}
		
		
	}
	public void listarContribuinte(){
		
	}

}
