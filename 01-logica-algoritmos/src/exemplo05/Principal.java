package exemplo05;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		String nome1 = JOptionPane.showInputDialog("Nome 1");
		String nome2 = JOptionPane.showInputDialog("Nome 2");
		
		System.out.println(nome1.equals(nome2));
	}

}
