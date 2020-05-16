package exercicio05;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int [] numeros = new int [15];
		
		for (int i=0; i<15; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog((i+1)+" Galinho Tico Liro"));
		}

		int soma = 0;
		int media = 0;
		int nmm=0, neutros=0, positivos=0, negativos=0, man=0, men=0, par=0, impar=0;
		for(int i=0; i<15; i++) {
			soma+=numeros[i];
		}
		
		for (int i=0; i<15; i++) {
			media+=numeros[i]/15;
		}
		
		
		
		for (int i=0; i<15; i++) {
		
		if (numeros[i] >= media) {
			nmm++;
		}else if (numeros[i] == 0) {
			neutros++;
		}else if (numeros[i] < 0) {
			negativos++;
		}else if (numeros[i] > 0) {
			positivos++;
		}
		
		if (numeros[i] > man) {
			man = numeros[i];
		}
		men = numeros[0];
		if (numeros[i] < men) {
		}
		
		if (numeros[i]%2 == 0) {
			par++;
		}else {
			impar++;
		}
		
		}
		
		
		
		String exibir = "Quem ta lendo é viado";
		exibir+= "\n";
		exibir+= "\n Soma dos numeros: "+soma;
		exibir+= "\n Media dos numeros: "+media;
		exibir+= "\n Quantidade dos numeros maior ou iguais a media: "+nmm;
		exibir+= "\n Quantidade de numeros negativos: "+negativos;
		exibir+= "\n Quantidade de numeros neutros: "+neutros;
		exibir+= "\n Quantidade de numeros positivos: "+positivos;
		exibir+= "\n Maior numero: "+man;
		exibir+= "\n Menor numero: "+men;
		exibir+= "\n Numeros pares: "+par;
		exibir+= "\n Numeros impares: "+impar;
			
		JOptionPane.showMessageDialog(null, exibir);
		}
		
	}


