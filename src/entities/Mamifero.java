package entities;

public class Mamifero extends Animal {
	
	// ATRIBUTOS E ENCAPSULAMENTO
	
	private String corPelo;
	
	// METODOS ESPECIAIS 

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	// METODOS ABSTRATOS (SOBREPOSTOS)
	
	@Override
	public void locomover() {
		System.out.println("Correndo");
	}

	@Override
	public void alimentar() {
		System.out.println("Mamando");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de mamífero");
	}

}
