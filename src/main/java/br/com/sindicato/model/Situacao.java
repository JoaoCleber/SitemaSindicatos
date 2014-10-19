package br.com.sindicato.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.PrimaryKeyJoinColumn;

public class Situacao {

	private String ativo;

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
