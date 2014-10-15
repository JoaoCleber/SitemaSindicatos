package br.com.sindicato.model;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


public class Pessoa {
	
	
	private long idPessoa;

	
	private String nome;
	
	private String cpf;
	
	private String rg;
	
	private String titulo;
	
	private Date dataNascimento;
	
	private String telefone;
	
	private String dependentes;
	//Endereco endereco;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(DateFormat df) {
		//this.dataNascimento = dataNascimento;
	}
	/*public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	*///}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getDependentes() {
		return dependentes;
	}
	public void setDependentes(String dependentes) {
		this.dependentes = dependentes;
	}
	
	/*public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", rg=" + rg
				+ ", titulo=" + titulo + ", dataNascimento=" + dataNascimento
				+ ", endereco=" + endereco + ", telefone=" + telefone
				+ ", dependentes=" + dependentes + "]";
	*///}



	
	
	
	
	

}
