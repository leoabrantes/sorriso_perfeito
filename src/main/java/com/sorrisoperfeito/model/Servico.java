package com.sorrisoperfeito.model;


public class Servico {
	
	private String descricao;
	private double preco;
	
	public Servico() {
	}

	public Servico(String descricao, double preco) {
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public void registrarServico() {
		
	}
	
	public void recuperarServico() {
		
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}



}
