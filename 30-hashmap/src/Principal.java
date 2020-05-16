import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		
		// CRIAR UM hashMap
		HashMap<String, String> paises = new HashMap<String, String>();
		
		// ADICIONAR ELEMENTOS AO HashMap
		paises.put("Japão", "Tóquio");
		paises.put("Brasil", "Brasília");
		paises.put("Argentina", "Buenos Aires");
		
		// OBTER DADOS ATRAVÉS DA CHAVE
		System.out.println(paises.get("Brasil"));
		
		// REMOVER ITEM
		paises.remove("Japão");
		
		// REMOVER TODOS OS ITENS
		paises.clear();
		
		// SELECIONAR TODOS OS PAÍSESrr
		System.out.println(paises);
	}
	
}
