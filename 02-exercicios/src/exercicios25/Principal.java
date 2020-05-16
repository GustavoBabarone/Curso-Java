package exercicios25;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		int hora = Integer.parseInt(JOptionPane.showInputDialog(null, "Que horas s�o? (sem considerar os minutos)"));
		
		if(hora <= 6 && hora >= 0) {
			JOptionPane.showMessageDialog(null, "Boa madrugada!");
		}else if(hora <= 11 && hora >= 7) {
			JOptionPane.showMessageDialog(null, "Bom Dia!");
		}else if(hora <= 18 && hora >= 12) {
			JOptionPane.showMessageDialog(null, "Boa Tarde!");
		}else if(hora <= 23 && hora >= 19) {
			JOptionPane.showMessageDialog(null, "Boa Noite!");
		}
	}
}
