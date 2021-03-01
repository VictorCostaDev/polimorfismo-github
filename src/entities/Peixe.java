package entities;

public class Peixe extends Animal {

	
	// ATRIBUTOS E ENCAPSULAMENTO
	
	private String corEscama;
	
	// METODOS ESPECIAIS
	
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	// SOBREPOSIÇÃO DE METODOS ABSTRATOS DA SUPERCLASSE
	
	@Override
	public void locomover() {
		System.out.println("Nadando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo Substâncias");
	}

	@Override
	public void emitirSom() {
		System.out.println("Peixe não faz som");
	}

	// METODOS PUBLICOS
	
	public void soltarBolha() {
		System.out.println("Soltando bolha");
	}
}
