package br.com.sindicato.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Contribuinte extends Pessoa {

	@Column
	@Temporal(TemporalType.DATE)
	private Date dataFiliacao;
	@Column
	private double divida = 0;

	public Contribuinte() {

	}

	public void setDataFiliacao(Date dataFiliacao) {
		this.dataFiliacao = dataFiliacao;
	}

	public void setDivida(double divida) {
		this.divida = divida;
	}

	public Date getDataFiliacao() {
		return dataFiliacao;
	}

	public double getDivida() {
		return divida;
	}

}
