package br.com.sindicato.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
public class Contribuinte extends Pessoa {

	// private Situacao situacao;

	@Column
	private Date dataFiliacao;
	@Column
	private double divida = 0;
	@Column
	private String processos;
	@Column
	private int matricula;
	
	
	public Contribuinte() {

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

	/*
	 * public Situacao getSituacao() { return situacao; }
	 */

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
