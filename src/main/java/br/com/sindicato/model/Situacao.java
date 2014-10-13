package br.com.sindicato.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity

public class Situacao {
	//rever esse atributo
	@Column
	private String ativo;
	@Column
	private boolean vida;
	public String getAtivo() {
		return ativo;
	}
	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}
	public boolean isVida() {
		return vida;
	}
	public void setVida(boolean vida) {
		this.vida = vida;
	}

}
