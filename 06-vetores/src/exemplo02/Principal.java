package exemplo02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String[] nomes = new String[3];
		
		for(int i=0; i<3; i++) {
			nomes[i] = JOptionPane.showInputDialog(null, (i+1) +"º nome");
		}
		
		for(String elemento : nomes) {
			System.out.println(elemento);
		}

	}

}
