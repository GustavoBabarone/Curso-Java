package exercicio08;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
	
	//Vetores	
	 int matriz [][] = new int [6][5];
	 //int numeros [] = new int [30];
	 int i=0, par=0, impar=0, media=0,nmm=0;
	 
	 
	 //Pergunta
	 for(int linha=0; linha<6; linha++) {
			for(int coluna=0; coluna<5; coluna++) {
	 matriz[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Insirir numero!")); 
			
	 
	 
	 //Ver é par
	 if (matriz[linha][coluna] % 2 == 0) {
		 par++;
	 }else {
		 impar++;
	 }
	 	 
	 		 
		 //Numeros maiores ou iguais a media
		 if (matriz[linha][coluna] >= media) {
			 nmm++;
		 }
		 }
	     }
		 
	 //Ver a media
	 
	 for(int linha=0; linha<6; linha++) {
			for(int coluna=0; coluna<5; coluna++) {
		media+= (matriz[linha][coluna])/30;
	 }
}
	 
	 //Matriz
	 for(int linha=0; linha <6; linha++) {
		 
		 for(int coluna=0; coluna <5; coluna++) {
			 matriz [linha] [coluna] = matriz[linha][coluna];
			 
		 }
		 
	 }
	 
	 //Resposta
	 String exibir = "Resultados";
	 exibir+= "\nNumeros pares"+par;
	 exibir+= "\nNumeros impares"+impar;
	 exibir+= "\nMedia dos numeros informados"+media;
	 exibir+= "\nQuantidade de numeros maiories ou iguais a media"+nmm;
	 
	 JOptionPane.showMessageDialog(null, exibir);
	 
	//Exibir estrutura
	 for(int linha=0; linha<6; linha++) {
			for(int coluna=0; coluna<5; coluna++) {
				System.out.print(matriz[linha][coluna]+" ");
			}
			System.out.println();
	 }

			
	}

}
