
public class Principal {
	
	// E = ELEMENTOS DE CLASSE ( String, Double, Integer, ArrayList )
	// T = ELEMENTOS DE TIPO ( char, int, double, float, short, long )
	// K = CHAVES ( HashMap )
	// V = Valor  ( hashMap )

	
	// MÉTODO GENÉRICO
	public static <E> void listar(E[] vetor) {
		for(E elemento : vetor) {
			System.out.println(elemento+" ");
		}
	}
	
	// MÉTODO PRINCIPAL
	public static void main(String[] args) {

		// VETORES
		String[] nomes = {"Suellen", "Cleiton", "Paloma"};
		Integer[] idades = {22, 30, 17};
		Double[] alturas = {1.70, 1.77, 1.64};
		
		// CHAMAR O MÉTODO DE LISTAR
		listar(nomes);

	}

}
