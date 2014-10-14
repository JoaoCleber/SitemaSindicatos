package br.com.sindicato.model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;

@Entity
@PrimaryKeyJoinColumn(name="idPessoa")
public class Contribuinte extends Pessoa{
	@Id
	private long idContribuinte;
	@Column
	private Situacao situacao;
	@Column
	private Date dataFiliacao;
	@Column
	private double divida = 0;
	@Column
	private String processos;
	@Column
	private int matricula;
	
	
	public static void cadastrarContribuinte(Session session) throws ParseException, IllegalStateException, SystemException {
		
		Contribuinte contribuinte = new Contribuinte();
		Endereco endereco = new Endereco();
		Situacao situacao = new Situacao();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o nome");
		contribuinte.setNome(scanner.next());
		System.out.println("Digite o Cpf");
		contribuinte.setCpf(scanner.next());
		System.out.println("Digite o RG");
		contribuinte.setRg(scanner.next());
		System.out.println("Digite Titulo");
		contribuinte.setTitulo(scanner.next());
		
		
		//VER ESSA DATA
		
		System.out.println("Data de Nascimento");
		String data = scanner.next();
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		Date dt = df.parse(data);
		contribuinte.setDataNascimento(df);
		
		
		
		System.out.println("Telefone");
		contribuinte.setTelefone(scanner.next());
		
		
		
		System.out.println("======ENDERECO=======");
		
		System.out.println("Digite a Cidade");
		endereco.setCidade(scanner.next());
		System.out.println("UF");
		endereco.setUf(scanner.next());
		System.out.println("Digite o Bairro");
		endereco.setBairro(scanner.next());
		System.out.println("Numero");
		endereco.setNumeroCasa(scanner.next());
		System.out.println("algum dependente");
		contribuinte.setDependentes(scanner.next());
		
		//SITUAÇÃO
		System.out.println("Ativo");
		situacao.setAtivo(scanner.next());
		System.out.println("Ta vivo");
		situacao.setVida(scanner.nextBoolean());
		
		
	
		org.hibernate.Transaction tx = null;
		try {
			
			tx = session.beginTransaction();
			session.save(contribuinte);
			tx.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		
		}
	public void AtualizarContribuinte(Contribuinte contribuinte, Session session){
		
				
		
		
				
	}
	public void DeletarContribuinte(Contribuinte contribuinte){
		
		
		
	}
	
	
	public void gerarDivida(Date dataFiliacao) throws ParseException{
		
		Date data = new Date();
		int diaAtual = data.getDate();
		int mesAtual = data.getMonth()+1;
		
		String diaEmes = String.valueOf(diaAtual +"/"+ mesAtual);
		DateFormat dateformat = new SimpleDateFormat("dd/MM");
		Date date = dateformat.parse(diaEmes);
		if (dataFiliacao.equals(date) ) {
			//falta finalizar
			
		}
	
		
		
	}
	



	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}


	public void setDataFiliacao(Date dataFiliacao) {
		this.dataFiliacao = dataFiliacao;
	}


	public void setDivida(double divida) {
		this.divida = divida;
	}


	public void setProcessos(String processos) {
		this.processos = processos;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public Situacao getSituacao() {
		return situacao;
	}


	public Date getDataFiliacao() {
		return dataFiliacao;
	}


	public double getDivida() {
		return divida;
	}


	public String getProcessos() {
		return processos;
	}


	public int getMatricula() {
		return matricula;
	}



	
}
