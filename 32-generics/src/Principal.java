
public class Principal {
	
	// E = ELEMENTOS DE CLASSE ( String, Double, Integer, ArrayList )
	// T = ELEMENTOS DE TIPO ( char, int, double, float, short, long )
	// K = CHAVES ( HashMap )
	// V = Valor  ( hashMap )

	
	// M�TODO GEN�RICO
	public static <E> void listar(E[] vetor) {
		for(E elemento : vetor) {
			System.out.println(elemento+" ");
		}
	}
	
	// M�TODO PRINCIPAL
	public static void main(String[] args) {

		// VETORES
		String[] nomes = {"Suellen", "Cleiton", "Paloma"};
		Integer[] idades = {22, 30, 17};
		Double[] alturas = {1.70, 1.77, 1.64};
		
		// CHAMAR O M�TODO DE LISTAR
		listar(nomes);

	}

}
