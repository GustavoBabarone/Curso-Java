package exercícios02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int max = 100;
		int min = 0;
		int palpite;
		int contador=0;
		
		double gerarAleatório = Math.random();
		int numero = (int) Math.round(min+gerarAleatório*max);
		System.out.println(numero);
		
		do {		
			
			palpite = Integer.parseInt(JOptionPane.showInputDialog("Informe um número de 0 a 100"));
		
			if(palpite - numero <= 10 && palpite - numero >= -10) {
				JOptionPane.showMessageDialog(null, "Está perto!");
				contador++;
				
			}else if(palpite - numero <= 20 && palpite - numero >= -20) {
				JOptionPane.showMessageDialog(null, "Está longe!");
				contador++;
				
			}else if(palpite - numero < 20 && palpite - numero > -20) {
				JOptionPane.showMessageDialog(null, "Ihh rapaz, tá longe para K7!");
				contador++;
			}	
			
		}while(palpite != numero);
	
		if(palpite == numero && contador == 1) {
			JOptionPane.showMessageDialog(null, "Nossa, isso foi cagada! Com "+contador +" tentativa");
			
		}else if(palpite == numero && contador > 1 && contador <= 5) {
			JOptionPane.showMessageDialog(null, "Parabéns! Você é bom de adivinhação");
			
		}else if(palpite == numero && contador > 5 && contador <= 10) {
			JOptionPane.showMessageDialog(null, "Muito bom! Continue assim");
			
		}else if(palpite == numero && contador > 10 && contador <= 2) {
			JOptionPane.showMessageDialog(null, "Podia ser melhor! Continue tentando");
			
		}else if(palpite == numero && contador > 20) {
			JOptionPane.showMessageDialog(null, "Você é meio lerdo hein! Até uma tartaruga é melhor");		
		}
	}
}
