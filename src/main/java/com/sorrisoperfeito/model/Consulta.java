package com.sorrisoperfeito.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Consulta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDateTime dataHora;
	private boolean realizada;
	   

	    @ManyToOne
	    @JoinColumn(name = "paciente_id")
	    private Paciente paciente;

	    @ManyToOne
	    @JoinColumn(name = "dentista_id")
	    private Dentista dentista;
	
	
	public Consulta() {
	}

	public Consulta(LocalDateTime dataHora, boolean realizada) {
		this.dataHora = dataHora;
		this.realizada = realizada;
	}
	
	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	public boolean isRealizada() {
		return realizada;
	}

	public void setRealizada(boolean realizada) {
		this.realizada = realizada;
	}
	
}
