import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		
		// CRIAR UM hashMap
		HashMap<String, String> paises = new HashMap<String, String>();
		
		// ADICIONAR ELEMENTOS AO HashMap
		paises.put("Jap�o", "T�quio");
		paises.put("Brasil", "Bras�lia");
		paises.put("Argentina", "Buenos Aires");
		
		// OBTER DADOS ATRAV�S DA CHAVE
		System.out.println(paises.get("Brasil"));
		
		// REMOVER ITEM
		paises.remove("Jap�o");
		
		// REMOVER TODOS OS ITENS
		paises.clear();
		
		// SELECIONAR TODOS OS PA�SESrr
		System.out.println(paises);
	}
	
}
