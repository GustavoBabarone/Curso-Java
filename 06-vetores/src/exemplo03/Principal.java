package exemplo03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String[] nomes = new String[20];
		int[] idades = new int[20];
		
		int continuar=0;

		int indice=0;
		
		do {
			nomes[indice] = JOptionPane.showInputDialog(null, "Informe seu nome:");
			idades[indice] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe sua idade:"));
			
			indice++;
			
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
		}while(continuar == 0);
		
		String exibir = "Usuários cadastrados:\n";
		
		for(int i=0; i<nomes.length; i++) {
			if(nomes[i] != null) {
				exibir+= "\nNome: " +nomes[i];
				exibir+= "\nIdade: " +idades[i];
				exibir+= "\n";
			}
		}
		JOptionPane.showMessageDialog(null, exibir);
	}
}
