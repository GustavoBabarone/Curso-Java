package exercícios02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String frase = JOptionPane.showInputDialog(null, "Insira uma frase/palavra: ");
		int vogais=0;
		
		for(int i=0; i<frase.length(); i++) {
			
			if(frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u' || frase.charAt(i) == 'A' || frase.charAt(i) == 'E' || frase.charAt(i) == 'I' || frase.charAt(i) == 'O' || frase.charAt(i) == 'U') {
				vogais++;
			}				
		}
		
		JOptionPane.showMessageDialog(null, "Numero de vogais: "+vogais);		
	}
}
