package exercicios26;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog(null, "Qual seu nome?");
		int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual sua idade?"));
		
		if(idade > 0 && idade <  4) {
			JOptionPane.showMessageDialog(null, "Seu nome � "+nome +", voc� tem "+idade +", Beb�!");
		}else if(idade > 5 && idade < 11) {
			JOptionPane.showMessageDialog(null, "Seu nome � "+nome +", voc� tem "+idade +", Crian�a!");
		}else if(idade > 12 && idade < 14) {
			JOptionPane.showMessageDialog(null, "Seu nome � "+nome +", voc� tem "+idade +", Adolescente!");
		}else if(idade > 15 && idade < 30) {
			JOptionPane.showMessageDialog(null, "Seu nome � "+nome +", voc� tem "+idade +", Jovem!");
		}else if(idade > 31 && idade < 45) {
			JOptionPane.showMessageDialog(null, "Seu nome � "+nome +", voc� tem "+idade +", Madura!");
		}else if(idade > 46 && idade < 60) {
			JOptionPane.showMessageDialog(null, "Seu nome � "+nome +", voc� tem "+idade +", Adulto!");
		}else if(idade > 61 && idade < 75) {
			JOptionPane.showMessageDialog(null, "Seu nome � "+nome +", voc� tem "+idade +", Idoso I!");
		}else if(idade > 76 && idade < 90) {
			JOptionPane.showMessageDialog(null, "Seu nome � "+nome +", voc� tem "+idade +", Idoso II!");
		}else if(idade > 90) {
			JOptionPane.showMessageDialog(null, "Seu nome � "+nome +", voc� tem "+idade +", Idoso III!");
		}

	}

}
