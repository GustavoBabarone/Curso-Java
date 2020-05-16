package exercícios05;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int[] numeros = new int[15];
		
		for(int i=0; i<15; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, (i+1) +"º Número"));
			
		}
		
		int soma = 0;
		int media = 0, par=0, impar=0;
		int maiornumeross=0, positivo=0, negativo=0, neutro=0, maiornumero=0, menornumero=0;
		
		for(int i=0; i<15; i++) {
			soma+=numeros[i];
		}
		
		for(int i=0; i<15; i++) {
			
		if(media <= numeros[i]) {
			maiornumeross++;
		}
		
		if(numeros[i] == 0) {
			neutro++;
		}
		
		if(numeros[i] > 0) {
			positivo++;
			
		}
		
		if(numeros[i] < 0) {
			negativo++;
		}
		
		}
		
		for(int i=0; i<15; i++) {
		if(numeros[i] > maiornumero) {
			maiornumero = numeros[i];
		}
		
		}
		
		for(int i=0; i<15; i++) {
			
				menornumero = numeros[0];
				if(numeros[i] < menornumero) {
		}
			
			if(numeros[i] % 2 == 0) {
				par++;
			}else {
				impar++;
			}
		
		}
		String menu = "Número informados:\n";
		
		for(int i=0; i < numeros.length; i++) {
			menu+="\n"+numeros[i];
		}
		menu+= "\n";
		menu+= "\nSoma dos nº: "+soma;
		menu+= "\nMédia dos nº: "+(soma / 15);
		menu+= "\nQuantidade de nº maiores ou igual 0: "+maiornumeross;
		menu+= "\nQuantidade de nº positivos: "+positivo;
		menu+= "\nQuantidade de nº negativos: "+negativo;
		menu+= "\nQuandidade de nº neutros: "+neutro;
		menu+= "\nMaior número: "+maiornumero;
		menu+= "\nMenor número: "+menornumero;
		menu+= "\nNúmeros pares: "+par;
		menu+= "\nNúmeros ímpares: "+impar;
		
		JOptionPane.showMessageDialog(null, menu);
	}
}