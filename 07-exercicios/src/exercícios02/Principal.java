package exercícios02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		/* int[] numeros = new int [10];
		
		numeros[0]= Integer.parseInt(JOptionPane.showInputDialog(null, "1º número"));
		numeros[1]= Integer.parseInt(JOptionPane.showInputDialog(null, "2º número"));
		numeros[2]= Integer.parseInt(JOptionPane.showInputDialog(null, "3º número"));
		numeros[3]= Integer.parseInt(JOptionPane.showInputDialog(null, "4º número"));
		numeros[4]= Integer.parseInt(JOptionPane.showInputDialog(null, "5º número"));
		numeros[5]= Integer.parseInt(JOptionPane.showInputDialog(null, "6º número"));
		numeros[6]= Integer.parseInt(JOptionPane.showInputDialog(null, "7º número"));
		numeros[7]= Integer.parseInt(JOptionPane.showInputDialog(null, "8º número"));
		numeros[8]= Integer.parseInt(JOptionPane.showInputDialog(null, "9º número"));
		numeros[9]= Integer.parseInt(JOptionPane.showInputDialog(null, "10º número"));
		
		String menu = "Números informados:";
		     menu+= "\n" +numeros[0];
		     menu+= "\n" +numeros[1];
		     menu+= "\n" +numeros[2];
		     menu+= "\n" +numeros[3];
		     menu+= "\n" +numeros[4];
		     menu+= "\n" +numeros[5];
		     menu+= "\n" +numeros[6];
		     menu+= "\n" +numeros[7];
		     menu+= "\n" +numeros[8];
		     menu+= "\n" +numeros[9];
		     menu+= "\n";
		     menu+= "\nNúmeros inversos:";
		     menu+= "\n"+numeros[9];
		     menu+= "\n"+numeros[8];
		     menu+= "\n"+numeros[7];
		     menu+= "\n"+numeros[6];
		     menu+= "\n"+numeros[5];
		     menu+= "\n"+numeros[4];
		     menu+= "\n"+numeros[3];
		     menu+= "\n"+numeros[2];
		     menu+= "\n"+numeros[1];
		     menu+= "\n"+numeros[0];
		     
		     JOptionPane.showMessageDialog(null, menu); */
		
		int[] numeros = new int[10];
		
		for(int i=0; i<10; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, (i+1) + "º numero"));
		}
	
		String menu = "Número na ordem inversa:\n";
		
		for(int i=9; i>-1; i--) {
			menu+= "\n" +numeros[i];
		}
	
		JOptionPane.showMessageDialog(null,  menu);
	}
}
