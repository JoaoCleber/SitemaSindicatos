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
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "pessoa")
public class Pessoa implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column
	private long idPessoa;
	@Column
	private String nome;
	@Column
	private String cpf;
	@Column
	private String rg;

	private String titulo;

	// private Date dataNascimento;

	private String telefone;

	private String dependentes;

	// Endereco endereco;

	public Pessoa() {

	}

	public long getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(long idPessoa) {
		this.idPessoa = idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getTelefone() {
		return telefone;
	}

	@OneToMany
	// public void setDataNascimento(Date dataNascimento) {
	// this.dataNascimento = dataNascimento;
	// }
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

	// public Date getDataNascimento() {
	// return dataNascimento;
	// }
	public void setDataNascimento(DateFormat df) {
		// this.dataNascimento = dataNascimento;
	}

	/*
	 * public Endereco getEndereco() { return endereco; } public void
	 * setEndereco(Endereco endereco) { this.endereco = endereco; } public
	 * String getTelefone() { return telefone;
	 */// }
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getDependentes() {
		return dependentes;
	}

	public void setDependentes(String dependentes) {
		this.dependentes = dependentes;
	}

	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", rg=" + rg
				+ ", titulo=" + titulo + ", dataNascimento=" + ", endereco="
				+ ", telefone=" + telefone + ", dependentes=" + dependentes
				+ "]";
	}

}
