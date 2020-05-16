package exercicios03;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua nota 1"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua nota 2"));
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua nota 3"));
		double nota4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua nota 4"));
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if(media >= 7) {
			JOptionPane.showMessageDialog(null,"Aprovado com média "+media +" parabéns!");
		}else if((media >= 5) && (media<= 6.9)) {
			JOptionPane.showMessageDialog(null, "Em exame com média "+media +" vai estudar!");
		}else if((media >= 0) && (media <= 4.9)) {
			JOptionPane.showMessageDialog(null,"Reprovado com média "+media +", tente de novo ano que vem :(");
		}
	}

}
