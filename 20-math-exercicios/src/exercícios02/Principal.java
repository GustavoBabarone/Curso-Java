package exerc�cios02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int max = 100;
		int min = 0;
		int palpite;
		int contador=0;
		
		double gerarAleat�rio = Math.random();
		int numero = (int) Math.round(min+gerarAleat�rio*max);
		System.out.println(numero);
		
		do {		
			
			palpite = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero de 0 a 100"));
		
			if(palpite - numero <= 10 && palpite - numero >= -10) {
				JOptionPane.showMessageDialog(null, "Est� perto!");
				contador++;
				
			}else if(palpite - numero <= 20 && palpite - numero >= -20) {
				JOptionPane.showMessageDialog(null, "Est� longe!");
				contador++;
				
			}else if(palpite - numero < 20 && palpite - numero > -20) {
				JOptionPane.showMessageDialog(null, "Ihh rapaz, t� longe para K7!");
				contador++;
			}	
			
		}while(palpite != numero);
	
		if(palpite == numero && contador == 1) {
			JOptionPane.showMessageDialog(null, "Nossa, isso foi cagada! Com "+contador +" tentativa");
			
		}else if(palpite == numero && contador > 1 && contador <= 5) {
			JOptionPane.showMessageDialog(null, "Parab�ns! Voc� � bom de adivinha��o");
			
		}else if(palpite == numero && contador > 5 && contador <= 10) {
			JOptionPane.showMessageDialog(null, "Muito bom! Continue assim");
			
		}else if(palpite == numero && contador > 10 && contador <= 2) {
			JOptionPane.showMessageDialog(null, "Podia ser melhor! Continue tentando");
			
		}else if(palpite == numero && contador > 20) {
			JOptionPane.showMessageDialog(null, "Voc� � meio lerdo hein! At� uma tartaruga � melhor");		
		}
	}
}
