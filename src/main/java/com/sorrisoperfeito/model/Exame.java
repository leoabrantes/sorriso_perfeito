package com.sorrisoperfeito.model;

import com.sorrisoperfeito.enums.TipoExame;

public class Exame extends Servico {
	
	private TipoExame tipoExame;
	private String salaExame;
	
	public Exame(String descricao, double price, TipoExame tipoExame, String salaExame) {
		super(descricao, price);
		this.tipoExame = tipoExame;
		this.salaExame = salaExame;
	}

	public TipoExame getTipoExame() {
		return tipoExame;
	}

	public void setTipoExame(TipoExame tipoExame) {
		this.tipoExame = tipoExame;
	}

	public String getSalaExame() {
		return salaExame;
	}

	public void setSalaExame(String salaExame) {
		this.salaExame = salaExame;
	}
	

}
