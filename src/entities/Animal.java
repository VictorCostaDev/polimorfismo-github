package entities;

public abstract class Animal { // SUPERCLASS RAIZ E ABSTRATA
	
	// ATRIBUTOS E ENCAPSULAMENTO
	
	private Double peso;
	private Integer idade, membros;
	
	// METODOS ESPECIAIS
	
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public Integer getMembros() {
		return membros;
	}
	public void setMembros(Integer membros) {
		this.membros = membros;
	}
	
	// METODOS ABSTRATOS
	
	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirSom();
	
}
