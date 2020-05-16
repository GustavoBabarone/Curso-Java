package exercicios24;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual seu 1� n�mero?"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual seu 2� n�mero?"));
		int n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual seu 3� n�mero?"));
		
		if((n1 < n2 && n1 < n3) && (n2 > n1 && n2 < n3) && (n3 > n2 && n3 > n1)) {
			
			JOptionPane.showMessageDialog(null, n1 +"\n"+n2+ "\n"+n3);
			
			
			
		}else if((n1 < n2 && n1 < n3) && (n3 > n1 && n3 < n2) && (n2 > n1 && n2 > n3)) {
			
			JOptionPane.showMessageDialog(null, n1 +"\n"+n3+ "\n"+n2);
			
			
			
		}else if((n2 < n1 && n2 < n3) && (n1 > n2 && n1 < n3) && (n3 > n2 && n3 > n1)) {
			
			JOptionPane.showMessageDialog(null, n2 +"\n"+n1+ "\n"+n3);
			
			
			
		}else if((n2 < n1 && n2 < n3) && (n3 > n2 && n3 < n1) && (n1 > n2 && n1 > n3)) {
			
			JOptionPane.showMessageDialog(null, n2 +"\n"+n3+ "\n"+n1);
			
			
			
		}else if((n3 < n1 && n3 < n2) && (n1 > n3 && n1 < n2) && (n2 > n1 && n2 > n3)) {
			
			JOptionPane.showMessageDialog(null, n3 +"\n"+n1+ "\n"+n2);
			
			
			
		}else if((n3 < n1 && n3 < n2) && (n2 > n3 && n2 < n1) && (n1 > n2 && n1 > n3)) {
			
			JOptionPane.showMessageDialog(null, n3 +"\n"+n2+ "\n"+n1);
			
			
			
		}
	}

}
