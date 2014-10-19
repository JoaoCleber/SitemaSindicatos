package br.com.sindicato.model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import javax.transaction.SystemException;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.sindicato.daos.ContribuinteDao;
import br.com.sistemassindicato.hibernate.HibernateUtil;

public class Teste {

	public static void main(String[] args) {

		
	/*	  Session session = HibernateUtil.getSessionFactory().openSession();
		  
		  boolean t = session.isConnected(); 
		  System.out.println(t);
		 */

		Contribuinte c = new Contribuinte();
		ContribuinteDao cd = new ContribuinteDao();
		c.setNome("carlos");
		cd.inserirContribuinte(c);

	}

}
