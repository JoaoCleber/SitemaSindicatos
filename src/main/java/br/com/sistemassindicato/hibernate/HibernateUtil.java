package br.com.sistemassindicato.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import br.com.sindicato.model.Contribuinte;
import br.com.sindicato.model.Pessoa;

public class HibernateUtil {

	private static SessionFactory sessionFactory;
	
	static {

		
		Configuration configuration = new Configuration().configure();
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
		
	}
	
	public static Session getSessionFactory() {
		return sessionFactory.openSession();
	}
	

	
}
