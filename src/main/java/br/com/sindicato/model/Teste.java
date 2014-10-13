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

import br.com.sistemassindicato.hibernate.HibernateUtil;

public class Teste {

	public static void main(String[] args) throws ParseException, IllegalStateException, SystemException {
		
	
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Contribuinte contribuinte = new Contribuinte();
		contribuinte.cadastrarContribuinte(session);
		
	
		 

		//boolean verif = session.isConnected();
		//System.out.println(verif);
		

		
	}

}
