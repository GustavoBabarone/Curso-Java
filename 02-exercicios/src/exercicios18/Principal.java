package exercicios18;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		double l1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o 1� lado?"));
		double l2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o 2� lado?"));
		double l3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o 3� lado?"));
		
		if((l1 > (l2 + l3)) || (l2 > (l1 + l3)) || (l3 > (l1 + l2))) {
			JOptionPane.showMessageDialog(null, "Esse tr�ingulo n�o existe!");
		}else if(l1 == l2 && l1 == l3 || l2 == l1 && l2 == l3 || l3 == l1 && l3 == l2) {
			JOptionPane.showMessageDialog(null,  "Esse tri�ngulo � equil�tero");
		}else if(l1 != l2 && l1 != l3 || l2 != l1 && l2 != l3 || l3 != l1 && l3 != l2) {
			JOptionPane.showMessageDialog(null,  "Esse tri�ngulo � escaleno");
		}else if(l1 == l2 && l1 != l3 || l2 == l2 && l2 != l3 || l3 == l1 && l3 != l2) {
			JOptionPane.showMessageDialog(null,  "Esse tri�ngulo � is�celes");
		}
		
	}

}
