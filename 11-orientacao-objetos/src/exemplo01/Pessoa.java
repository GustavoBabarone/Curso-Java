package exemplo01;

// CLASSE: MOLDE
public class Pessoa {

	// ATRIBUTOS: CARACTERÍSTICAS
	String nome;
	double altura, peso;
	
	// MÉTODOS: AÇÕES
	void mensagem() {
		System.out.println("Olá meu nome é "+nome);
	}
	
	double imc() {
		return peso / (altura*altura);
	}
	
}
