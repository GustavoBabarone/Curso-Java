package exerc�cios02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		/* int[] numeros = new int [10];
		
		numeros[0]= Integer.parseInt(JOptionPane.showInputDialog(null, "1� n�mero"));
		numeros[1]= Integer.parseInt(JOptionPane.showInputDialog(null, "2� n�mero"));
		numeros[2]= Integer.parseInt(JOptionPane.showInputDialog(null, "3� n�mero"));
		numeros[3]= Integer.parseInt(JOptionPane.showInputDialog(null, "4� n�mero"));
		numeros[4]= Integer.parseInt(JOptionPane.showInputDialog(null, "5� n�mero"));
		numeros[5]= Integer.parseInt(JOptionPane.showInputDialog(null, "6� n�mero"));
		numeros[6]= Integer.parseInt(JOptionPane.showInputDialog(null, "7� n�mero"));
		numeros[7]= Integer.parseInt(JOptionPane.showInputDialog(null, "8� n�mero"));
		numeros[8]= Integer.parseInt(JOptionPane.showInputDialog(null, "9� n�mero"));
		numeros[9]= Integer.parseInt(JOptionPane.showInputDialog(null, "10� n�mero"));
		
		String menu = "N�meros informados:";
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
		     menu+= "\nN�meros inversos:";
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
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, (i+1) + "� numero"));
		}
	
		String menu = "N�mero na ordem inversa:\n";
		
		for(int i=9; i>-1; i--) {
			menu+= "\n" +numeros[i];
		}
	
		JOptionPane.showMessageDialog(null,  menu);
	}
}
