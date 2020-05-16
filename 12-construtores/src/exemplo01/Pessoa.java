package exemplo01;

public class Pessoa {

	// MÉTODO CONSTRUTOR
		Pessoa() {
			System.out.println("Construtor ok!");
	}
	
		// MÉTODO CONSTRUTOR
		Pessoa(String nome) {
			System.out.println(nome);	
	}

		// MÉTODO CONSTRUTOR
		Pessoa(String nome, int idade) {
			System.out.println(nome +" " +idade);
	}
}
