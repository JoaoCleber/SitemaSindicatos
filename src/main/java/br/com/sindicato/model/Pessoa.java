package br.com.sindicato.model;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "pessoa")
public class Pessoa implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int idPessoa;

	private String nome;

	private String cpf;

	private String rg;

	private String titulo;

	// private String dataNascimento;

	private String telefone;

	private String dependentes;
	@OneToOne(mappedBy = "pessoa")
	private Endereco endereco;

	public Pessoa() {

	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public int getIdPessoa(int idPessoa) {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getTelefone() {
		return telefone;
	}

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
