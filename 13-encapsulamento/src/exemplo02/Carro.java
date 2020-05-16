package exemplo02;

public class Carro {

	// ATRIBUTOS 
	private String modelo, fabricante;
	private int ano;
	
	// CONSTRUTOR
	public Carro(String modelo, String fabricante, int ano) {
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.ano = ano;
		
		exibirdados();
	}

	// EXIBIR DADOS 
	private void exibirdados() {
		System.out.println(modelo);
		System.out.println(fabricante);
		System.out.println(ano);
	}
}
