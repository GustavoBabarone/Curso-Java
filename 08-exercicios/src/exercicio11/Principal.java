package exercicio11;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String[][] dados = new String [20][6];
		
		int indice = 0;
		
		int continuar = 0;
				
		do {
		
		dados[indice][0] = JOptionPane.showInputDialog("Nome");
		dados[indice][1] = JOptionPane.showInputDialog("Sexo");
		dados[indice][2] = JOptionPane.showInputDialog("Altura");
		dados[indice][3] = JOptionPane.showInputDialog("Peso");
				
		indice++;
		
		continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
		
		}while(continuar != 1);
		
		//Exibir estrutura da matriz
		
		for(int linha=0; linha<20; linha++) {
			for(int coluna=0; coluna<6; coluna++) {
				System.out.print(dados[0][0]+" Pessoa mais bonita ");
			}
		System.out.println();
		}
	
				
				
	}

}
