package Principal;

import java.util.ArrayList;

import beans.Jogo;
import formulario.FormularioPrincipal;

public class Principal {
		
		// ARRAYLIST
		public static ArrayList<Jogo> vetorJogos = new ArrayList<Jogo>();
		
		public static void main(String[] args) {
		
		// INSTANCIAR UM FORMULARIO
		FormularioPrincipal frame = new FormularioPrincipal();
		frame.setVisible(true);

	}

}
