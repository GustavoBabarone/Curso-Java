package Principal;

import java.util.ArrayList;

import Beans.Produto;
import formulario.FormularioPrincipal;

public class Principal {
		
		// ARRAYLIST
		public static ArrayList<Produto> vetorProdutos = new ArrayList<Produto>();
		
		public static void main(String[] args) {
			
			// INSTANCIAR UM FORMULARIO		
			FormularioPrincipal frame = new FormularioPrincipal();
			frame.setVisible(true);
				
	}
}


