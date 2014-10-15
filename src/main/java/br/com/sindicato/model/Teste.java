package br.com.sindicato.model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import javax.transaction.SystemException;

import org.hibernate.Hibernate;
import org.hibernate.Session;

import br.com.sindicato.daos.ContribuinteDao;
import br.com.sistemassindicato.hibernate.HibernateUtil;

public class Teste {

	public static void main(String[] args) {
		try {
			
			Session session = HibernateUtil.getSessionFactory().openSession();
			//Contribuinte contribuinte = new Contribuinte();
			
			
			
			boolean verif = session.isConnected();
			System.out.println(verif);
			
			/*ContribuinteDao cd = new ContribuinteDao();
			Scanner scanner = new Scanner(System.in);
			Contribuinte c = new Contribuinte();
			System.out.println("digite o nome");
			*///c.setNome(scanner.next());
			
			
			
			//cd.inserirContribuinte(c);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	
	
		
		
		//Contribuinte contribuinte = new Contribuinte();
		//contribuinte.cadastrarContribuinte(session);
		//boolean verif = session.isConnected();
		//System.out.println(verif);
		

		
	}

}
