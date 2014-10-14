package br.com.sindicato.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Endereco {
	@Id
	@Column(length=15, nullable=false)
	protected String cidade;
	@Column(length=2, nullable=false)
	protected String uf;
	@Column(length=20, nullable=false)
	protected String rua;
	@Column(length=20, nullable=false)
	protected String bairro;
	@Basic
	protected String numeroCasa;
	
	
	
	
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getNumeroCasa() {
		return numeroCasa;
	}
	public void setNumeroCasa(String numeroCasa) {
		this.numeroCasa = numeroCasa;
	}
	
	

}
