package exercicio03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		
		
		boolean existe10 = false;
		
		int numeros [] = new int [5];
		
			for(int i=0; i<5; i++) {
				numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(i+1));
				if(numeros[i] == 10) {
					existe10 = true;
				}
			
			}
			if (existe10 == false ) {
				JOptionPane.showMessageDialog(null, "Não há número 10");
			}else {
				String msg = "O numero 10 está no(s) indice(s): ";
				for(int i=0; i<5; i++) {
					
				if(numeros[i] == 10) {
					msg+="\n"+(i+1);
					}	
				}
				JOptionPane.showMessageDialog(null, msg);
			}
	
	
			
	}

}
