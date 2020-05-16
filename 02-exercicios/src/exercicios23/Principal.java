package exercicios23;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual seu peso?"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual sua altura?"));
		double imc = (peso / (altura*altura));
		
		if(imc <= 17) {
			JOptionPane.showMessageDialog(null, "Seu IMC �: "+imc +", sua situa��o �: Muito abaixo do peso!");
		}else if(imc > 17 && imc <= 18.49) {
			JOptionPane.showMessageDialog(null, "Seu IMC �: "+imc +", sua situa��o �: Abaixo do peso!");
		}else if(imc >= 18.5 && imc <= 24.99) {
			JOptionPane.showMessageDialog(null, "Seu IMC �: "+imc +", sua situa��o �: Peso normal!");
		}else if(imc >= 25 && imc <= 29.99) {
			JOptionPane.showMessageDialog(null, "Seu IMC �: "+imc +", sua situa��o �: Acima do peso!");
		}else if(imc >= 30 && imc <= 34.99) {
			JOptionPane.showMessageDialog(null, "Seu IMC �: "+imc +", sua situa��o �: Obesidade I");
		}else if(imc >= 35 && imc <= 39.99) {
			JOptionPane.showMessageDialog(null, "Seu IMC �: "+imc +", sua situa��o �: Obesidade II (severa)!");
		}else if(imc >= 40) {
			JOptionPane.showMessageDialog(null, "Seu IMC �: "+imc +", sua situa��o �: Obesidade III (m�rbida)!");
		}

	}

}
