package principal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import pagamento.Credito;
import pagamento.Debito;

public class Principal {

	public static void main(String[] args) {
		
		// Poli    --> Varias/Muitas
		// Morphus --> Formas
		
		// OBJETO
		Debito d = new Credito();
		d.tributos(100);
		d.msg();
		
		/* EXEMPLO DE POLIMORFISMO DA CLASSE Java.util
		
		List<String> nomes = new ArrayList<String>();
		List<String> cidades = new LinkedList<String>(); */

	}

}
