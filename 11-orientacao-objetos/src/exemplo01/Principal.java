package exemplo01;

public class Principal {

	public static void main(String[] args) {
		
		// INSTANCIAR: ( CRIAR )
		// OBJETO: RESULTADO OBTIDO ATRAVÉS DA CLASSE
		Pessoa p1 = new Pessoa();
		p1.nome = "Jenifer";
		p1.altura = 1.71;
		p1.peso = 60;
		p1.mensagem();
		double imc = p1.imc();
		System.out.println(imc);
	}
}
