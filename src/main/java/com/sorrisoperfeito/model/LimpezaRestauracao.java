package com.sorrisoperfeito.model;

public class LimpezaRestauracao extends Servico {
		
		private String material_usado;
		private String dente_tratado;
		
		public LimpezaRestauracao(String material_usado, String dente_tratado, String descricao, double preco) {
			super(descricao, preco);
			this.material_usado = material_usado;
			this.dente_tratado = dente_tratado;
		}

		public String getMaterial_usado() {
			return material_usado;
		}

		public void setMaterial_usado(String material_usado) {
			this.material_usado = material_usado;
		}

		public String getDente_tratado() {
			return dente_tratado;
		}

		public void setDente_tratado(String dente_tratado) {
			this.dente_tratado = dente_tratado;
		}
		
		
		
		

}
