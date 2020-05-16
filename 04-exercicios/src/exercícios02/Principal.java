package exercícios02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Variáveis
		
		String nome;
		int idade, jogadores=0, idades=0;
		double peso, altura, pesos=0, maioraltura=0, maiornome=0, maiorpeso=0, maioridade=0, mediaaltura=0;
		String nomemaioridade = null, nomemaiorpeso = null, nomemaioraltura = null;
		
		//Laço
		
		do {
			
			//Perguntas
			
			nome = JOptionPane.showInputDialog("Informe seu nome");
			
			if(!nome.equals("sair")) {
				jogadores++;
				
				idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe sua idade"));
				peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe seu peso"));
				altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe sua altura"));
				mediaaltura+=altura;
			
				
				if(altura > maioraltura) {
					maioraltura = altura;
					nomemaioraltura = nome;
				}
				
				if(peso > maiorpeso) {
					maiorpeso = peso;
					nomemaiorpeso = nome;
				}
			
				if(idade > maioridade) {
					maioridade = idade;
					nomemaioridade = nome;
				}
			}
			
		}while(!nome.equals("sair"));
		
		String resultado = "Quantidade de jogadores: "+jogadores;
			   resultado+= "\nNome e altura do maior jogador: "+nomemaioraltura +", " +maioraltura;
			   resultado+= "\nNome e idade do jogador mais velho: "+nomemaioridade +", "+maioridade;
			   resultado+= "\nNome e peso do jogador mais pesado: "+nomemaiorpeso +", "+maiorpeso;
			   resultado+= "\nMédia das alturas dos jogadores: "+mediaaltura/jogadores;
			   
		JOptionPane.showMessageDialog(null, resultado);
		
	}

}
