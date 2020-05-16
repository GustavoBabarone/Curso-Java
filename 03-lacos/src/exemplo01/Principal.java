package exemplo01;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {

		//Obter o número
		int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número"));
		
		//Tabuada
		String tabuada = "A tabuada de "+numero +" é";
		
		//Laço
		int indice = 0;
		while(indice <= 10) {
			  tabuada+= "\n"+numero*indice;
			  indice++;
		}
		
		//Exibir
		JOptionPane.showMessageDialog(null, tabuada);
	}

}
