package exercícios01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Object[] sexos = {"Masculino", "Feminino"};
		Object[] cargos = {"Gerente", "Atendente", "Açougueiro", "Secretária", "Almoxarife", "Padeiro", "Estagiário"};
		
		int masculino=0, feminino=0;
		int gerente=0, atendente=0, acougueiro=0, secretaria=0, almoxerife=0, padeiro=0, estagiario=0;
		int continuar = 0;
		int idade = 0;
		int maioridade = 0, menoridade = 0;
		
		do {
			
			String nome = JOptionPane.showInputDialog(null, "Qual seu nome?");
	        
			int idades = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual sua idade?"));
			int sexo = JOptionPane.showOptionDialog(null, "Qual seu gênero?","", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, sexos, 0);
			int cargo = JOptionPane.showOptionDialog(null, "Qual seu cargo?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, cargos, 0);
		
			switch(sexo) {
				case 0:
					masculino++;
				break;
				case 1:
					feminino++;
				break;
				}
			
			switch(cargo) {
				case 0:
					gerente++;
				break;
				
				case 1:
					atendente++;
				break;
				
				case 2:
					acougueiro++;
				break;
				
				case 3:
					secretaria++;
				break;
				
				case 4:
					almoxerife++;
				break;
				
				case 5:
					padeiro++;
				break;
				
				case 6:
					estagiario++;
				break;
		}
			if(idades >= 18) {
				maioridade++;
			}else {
				menoridade++;
			}
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
		}while(continuar == 0);
			
		String resultado = "Pessoas do sexo Masculino: "+masculino;
			   resultado+= "\nPessoas do sexo Feminino: "+feminino;
			   resultado+= "\n";
			   resultado+= "\nPessoas maiores de idade: "+maioridade;
			   resultado+= "\nPessoas menores de idade: "+menoridade;
			   resultado+= "\n";
			   resultado+= "\nQuantidade de cada Profissão:";
			   resultado+= "\n";
			   resultado+= "\nGerentes: "+gerente;
			   resultado+= "\nAtendente: "+atendente;
			   resultado+= "\nAçougueiro: "+acougueiro;
			   resultado+= "\nSecretária: "+secretaria;
			   resultado+= "\nAlmoxerife: "+almoxerife;
			   resultado+= "\nPadeiro: "+padeiro;
			   resultado+= "\nEstagiário: "+estagiario;
		
		JOptionPane.showMessageDialog(null, resultado);
			
			
		}

	}
