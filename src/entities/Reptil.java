package entities;

public class Reptil extends Animal { // HERANÇA PARA DIFERENÇA

	// ATRIBUTOS E ENCAPSULAMENTO
	
	private String corEscama;
	
	// METODOS ESPECIAIS
	
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	// SOBREPOSIÇÃO DE METODOS ABSTRATOS DA SUPERCLASS

	@Override
	public void locomover() {
		System.out.println("Rastejando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo Fruta");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de Réptil");
	} 

}
