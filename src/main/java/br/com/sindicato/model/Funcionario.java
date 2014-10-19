package br.com.sindicato.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "funcionario")
public class Funcionario extends Pessoa {

	private String cargo;
	private double salario;

	public Funcionario() {

	}

}
