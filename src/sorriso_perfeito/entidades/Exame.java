package sorriso_perfeito.entidades;

public class Exame extends Servico {
	
	private String medida_preventiva;
	private int tipo_de_exame;
	
	public Exame(String medida_preventiva, int tipo_de_exame, String descricao, double preco) {
		super(descricao, preco);
		this.medida_preventiva = medida_preventiva;
		this.tipo_de_exame = tipo_de_exame;
	}

	public String getMedida_preventiva() {
		return medida_preventiva;
	}

	public void setMedida_preventiva(String medida_preventiva) {
		this.medida_preventiva = medida_preventiva;
	}

	public int getTipo_de_exame() {
		return tipo_de_exame;
	}

	public void setTipo_de_exame(int tipo_de_exame) {
		this.tipo_de_exame = tipo_de_exame;
	}
	
	
	
	

}
