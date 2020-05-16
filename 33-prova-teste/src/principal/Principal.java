package principal;

import java.util.ArrayList;

import beans.Colaborador;
import formularios.FormularioPrincipal;

public class Principal {

	// ARRAYLIST
	public static ArrayList<Colaborador> vetorColaborador = new ArrayList<Colaborador>();
	
	public static void main(String[] args) {
					
		// INSTANCIAR FORMULARIO
		FormularioPrincipal frame = new FormularioPrincipal();
		frame.setVisible(true);

	}

}
