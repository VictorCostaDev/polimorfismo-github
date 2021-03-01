package entities;

public class Ave extends Animal { // HERANCA PARA DIFERENCA

	// ATRIBUTOS E ENCAPSULAMENTO
	
	private String corPena;
	
	// METODOS ESPECIAIS
	
	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
	
	// METODOS DE SOBREPOSIÇÃO(POLIMORFISMO)
	
	@Override
	public void locomover() {
		System.out.println("Voando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo Frutas");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de Ave");
	} 
	
	// Metodos publicos e especificos da classe Ave
	
	public void fazerNinho() {
		System.out.println("Construiu um ninho");
	}

}
