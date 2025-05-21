package com.sorrisoperfeito.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Paciente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String rg;
	private String endereco;
	private String telefone;
	private String data_de_nascimento;
	private String profissao;
	
	@OneToMany(mappedBy = "paciente")
	private List<Consulta> consulta;


	public Paciente(String nome, String rg, String endereco) {
		this.nome = nome;
		this.rg = rg;
		this.endereco = endereco;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getRg() {
		return rg;
	}


	public void setRg(String rg) {
		this.rg = rg;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getData_de_nascimento() {
		return data_de_nascimento;
	}


	public void setData_de_nascimento(String data_de_nascimento) {
		this.data_de_nascimento = data_de_nascimento;
	}


	public String getProfissao() {
		return profissao;
	}


	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}


	public Integer getPaciente_id() {
		return id;
	}


	public void setPaciente_id(Integer id) {
		this.id = id;
	}


	public List<Consulta> getConsulta() {
		return consulta;
	}


	public void setConsulta(List<Consulta> consulta) {
		this.consulta = consulta;
	}
	
	

}
