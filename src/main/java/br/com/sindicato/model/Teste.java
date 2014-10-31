package br.com.sindicato.model;

import java.util.List;

import org.hibernate.Session;

import br.com.sindicato.daos.ContribuinteDao;
import br.com.sindicato.daos.FuncionarioDao;
import br.com.sistemassindicato.hibernate.HibernateUtil;

public class Teste {

	public static void main(String[] args) {

	
		Contribuinte c = new Contribuinte();
		Contribuinte cont2 = new Contribuinte();
		Endereco end = new Endereco();
		
		ContribuinteDao cd = new ContribuinteDao();
	
		Contribuinte testa = cd.buscarPorId(1671168);
		System.out.println(testa.getNome());

	}

}
