package com.sorrisoperfeito.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Dentista {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String numero_registro;
	private Set<LocalDateTime> horarios;
			
	
	@OneToMany(mappedBy = "dentista")
	private List<Consulta> consulta;
	
	
	public Dentista(String nome, String numero_registro) {
		this.nome = nome;
		this.numero_registro = numero_registro;
	}

	public Dentista() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero_registro() {
		return numero_registro;
	}

	public void setNumero_registro(String numero_registro) {
		this.numero_registro = numero_registro;
	}


	public Integer getDentista_id() {
		return id;
	}

	public void setDentista_id(Integer id) {
		this.id = id;
	}

	public List<Consulta> getConsulta() {
		return consulta;
	}

	public void setConsulta(List<Consulta> consulta) {
		this.consulta = consulta;
	}
	
}
