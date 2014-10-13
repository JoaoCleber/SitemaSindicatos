package br.com.sindicato.model;

import java.util.List;

public class Instituicao {

	private String cnpj;
	private String nomeInstituicao;
	private String dataFundacao;
	private Endereco endereco;
	private String telefone;
	private String email;
	private Caixa caixa;
	
	private List <Funcionario> funcionarios;
	private List <Contribuinte> contibruintes;
	
	public Caixa getCaixa() {
		return caixa;
	}

	public void setCaixa(Caixa caixa) {
		this.caixa = caixa;
	}

	
	public String getCnpj() {
		return cnpj;
	}
	
	public String getNomeInstituicao() {
		return nomeInstituicao;
	}
	
	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}
	
	public String getDataFundacao() {
		return dataFundacao;
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
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	
	public List<Contribuinte> getContibruintes() {
		return contibruintes;
	}
	
	
	
}
