package exercicio06;

import javax.swing.JOptionPane;


public class Principal {

	public static void main(String[] args) {
		
		String nomes [] = new String [5];
		int nsc [] = new int [5];
		String estados [] = new String [5];
		String cidades [] = new String [5];
		String endereco [] = new String [5];
		int telefone [] = new int [5];
		int celular [] = new int [5];
		String email [] = new String [5];
		int continuar = 0;
		
		for(int i=0; i<5 ;i++) {	
			
			do {
			
			nomes[i] = JOptionPane.showInputDialog(" Insira o nome do contato");
			nsc[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite sua data de nascimento"));
			estados[i] = JOptionPane.showInputDialog("Insira seu estado");
			cidades[i] = JOptionPane.showInputDialog("Insira sua cidade");
			endereco[i] = JOptionPane.showInputDialog("Insira seu endereço");
			telefone[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira seu telefone"));
			celular[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira seu numero de celular"));
			email[i] = JOptionPane.showInputDialog("Insira seu email");
			
			 continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			}while (continuar == 0);
			}
			 
		for(int i=0; i<5; i++) {
		
			if(nomes[i] == nomes [1]) {
				nomes[i]+= JOptionPane.showInputDialog("Nome já cadastrado, digite outro");
			}else if (nomes[i] == nomes [2]) {
				nomes[i]+= JOptionPane.showInputDialog("Nome já cadastrado, digite outro");
			}else if (nomes[i] == nomes [3]) {
				nomes[i]+= JOptionPane.showInputDialog("Nome já cadastrado, digite outro");
			}else if (nomes[i] == nomes [4]) {
				nomes[i]+= JOptionPane.showInputDialog("Nome já cadastrado, digite outro");
			}else if (nomes[i] == nomes [5]) {
				nomes[i]+= JOptionPane.showInputDialog("Nome já cadastrado, digite outro");
			}else if (nomes[i] == nomes [6]) {
				nomes[i]+= JOptionPane.showInputDialog("Nome já cadastrado, digite outro");
			}else if (nomes[i] == nomes [7]) {
				nomes[i]+= JOptionPane.showInputDialog("Nome já cadastrado, digite outro");
			}else if (nomes[i] == nomes [8]) {
				nomes[i]+= JOptionPane.showInputDialog("Nome já cadastrado, digite outro");
			}else if (nomes[i] == nomes [9]) {
				nomes[i]+= JOptionPane.showInputDialog("Nome já cadastrado, digite outro");
			}else if (nomes[i] == nomes [10]) {
				nomes[i]+= JOptionPane.showInputDialog("Nome já cadastrado, digite outro");
			}	
		}
			
	}

}
