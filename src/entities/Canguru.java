package entities;

public class Canguru extends Mamifero { // Heranca para diferenca

	// Sobreposição (Polimorfismo)
	
	@Override
	public void locomover() {
		System.out.println("Saltando");
	}
	
	// Metodo publico
	
	public void usarBolsa() {
		System.out.println("Usando Bolsa");
	}
}
