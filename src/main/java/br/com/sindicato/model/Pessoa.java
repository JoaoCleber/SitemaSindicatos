package br.com.sindicato.model;

import java.text.DateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected  long idPessoa;
	@Column (length=30, nullable=false, unique=true)
	protected String nome;
	@Column (length=11, nullable=false, unique=true)
	protected String cpf;
	@Column(length=10, nullable=false)
	protected String rg;
	@Column(length=12, nullable=false)
	protected String titulo;
	@Temporal(TemporalType.DATE)
	protected Date dataNascimento;
	@Column(length=10)
	protected String telefone;
	@Column
	protected String dependentes;
	Endereco endereco;
	
	
	
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
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getDependentes() {
		return dependentes;
	}
	public void setDependentes(String dependentes) {
		this.dependentes = dependentes;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", rg=" + rg
				+ ", titulo=" + titulo + ", dataNascimento=" + dataNascimento
				+ ", endereco=" + endereco + ", telefone=" + telefone
				+ ", dependentes=" + dependentes + "]";
	}

	
	
	
	
	

}
