package exemplo01;

// CLASSE: MOLDE
public class Pessoa {

	// ATRIBUTOS: CARACTER�STICAS
	String nome;
	double altura, peso;
	
	// M�TODOS: A��ES
	void mensagem() {
		System.out.println("Ol� meu nome � "+nome);
	}
	
	double imc() {
		return peso / (altura*altura);
	}
	
}
