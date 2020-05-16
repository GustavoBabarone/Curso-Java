package prova01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		// Variáveis
		
		Object[] departamentos = {"Áudio/Video", "Informática", "Vestuário"};
		
		Object[] audios = {"TVs", "Aparelhos de sons"};
		Object[] infos = {"Hardware", "Software"};
		Object[] sexos= {"Masculino", "Feminino"};
		
		Object[] tves = {"Smart TV Led 49 Samsung - R$ 4.999,99", "Smart TV 4k LG 60 - R$7.499,00 ", "Smart TV Full HD 32 Samsung - R$ 1.710,00"};
		Object[] aparelhos = {"Semp Toshiba Áudio Bright - R$ 599,99", "Mini System LG - R$ 512,00", "Mini System Philco - R$ 499,99"};
		Object[] hard = {"Placa Mãe Asus - R$ 2.000,00", "Memória Ram Corsair 4GB - R$500,00", "Mouse Multilaser - R$59,90"};
		Object[] soft = {"Windows 10  - R$500,00", "Office 2019   - R$399,99", "AutoCard 3D - R$899,50"};
		Object[] masculino = {"Camisa Social Lacoste - R$ 200,00", "Calça Jeans Calvin Klein R$ 230,00", "Camisa Social Dudalina - R$ 130,00"};
		Object[] feminino = {"Camisa Social Dudalina - R$170,00", "Calça Jeans Miss Masi - R$ 99,90", "Bermuda Dijean - R$ 74,40"};
		Object[] forma = {"A vista", "A prazo"};
		
		int tvs=0, app=0, hw=0, sw=0, masc=0, femi=0;
		
		boolean continuar = true;
		
		// Comecando o DO
				
		do {
			
			int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Bem vindo! Deseja continuar? 1-Sim 2-Não"));
			if(numero == 1) {
				continuar = false;
			}
			
		}while(continuar == true);
	
		// Começando DO das compras
		
		do {
			
			// PERGUNTA
			String nome = JOptionPane.showInputDialog(null, "Qual seu nome?");
			int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual sua idade?"));
			
			int departamento = JOptionPane.showOptionDialog(null, "Qual setor deseja?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, departamentos, 0);
			int audio, info, sexo, audioss, infoss, sexoss;
			
			switch(departamento) {
			case 0:
				audio = JOptionPane.showOptionDialog(null, "Qual tipo de produto deseja?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, audios, 0);
			
				switch(audio) {
				case 0:
					audioss = JOptionPane.showOptionDialog(null, "Qual produto deseja?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, tves, 0);
				
					switch(audioss) {
					case 0:
						JOptionPane.showOptionDialog(null, "A vista", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, forma, 0);
					break;
					
					case 1:
						JOptionPane.showOptionDialog(null, "A prazo", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, forma, 0);
					break;
					}
				break;
				}
			break;
			}
			
			switch(departamento) {
			case 0:
				audio = JOptionPane.showOptionDialog(null, "Qual produto deseja?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, audios, 0);
			
				switch(audio) {
				case 1:
					audioss = JOptionPane.showOptionDialog(null, "Qual produto deseja?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, aparelhos, 0);
					
					switch(audioss) {
						case 0:
						JOptionPane.showOptionDialog(null, "A vista", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, forma, 0);
						break;
					
						case 1:
						JOptionPane.showOptionDialog(null, "A prazo", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, forma, 0);
						break;
							}
					break;
					}
				break;	
			}
			
			switch(departamento) {
				case 1:
					info = JOptionPane.showOptionDialog(null, "Qual produto deseja?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, infos, 0);
				
					switch(info) {
					case 0:
						infoss = JOptionPane.showOptionDialog(null, "Qual produto deseja?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, hard, 0);
					
						switch(infoss) {
						case 0:
							JOptionPane.showOptionDialog(null, "A vista", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, forma, 0);
						break;
						
						case 1:
							JOptionPane.showOptionDialog(null, "A prazo", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, forma, 0);
						break;
						}
					break;
					}
				break;
			}
			
				switch(departamento) {
				case 1:
					info = JOptionPane.showOptionDialog(null, "Qual produto deseja?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, infos, 0);
					
					switch(info) {
						case 1:
							infoss = JOptionPane.showOptionDialog(null, "Qual produto deseja?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, soft, 0);
						
						switch(infoss) {
						case 0:
							JOptionPane.showOptionDialog(null, "A vista", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, forma, 0);
						break;
							
						case 1:
							JOptionPane.showOptionDialog(null, "A prazo", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, forma, 0);
						break;
						}
					break;
					}
				break;	
				}
				
				switch(departamento) {
				case 2:
					sexo = JOptionPane.showOptionDialog(null, "Qual produto deseja?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, sexos, 0);
					
					switch(sexo) {
						case 0:
							sexoss = JOptionPane.showOptionDialog(null, "Qual produto deseja?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, masculino, 0);
						
						switch(sexoss) {
						case 0:
							JOptionPane.showOptionDialog(null, "A vita", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, forma, 0);
						break;
							
						case 1:
							JOptionPane.showOptionDialog(null, "A prazo", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, forma, 0);
						break;
						}
					break;
					}
				break;
				}
				
				switch(departamento) {
				case 2:
					sexo = JOptionPane.showOptionDialog(null, "Qual produto deseja?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, sexos, 0);
					
					switch(sexo) {
					case 1:
						sexoss = JOptionPane.showOptionDialog(null, "Qual produto deseja?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, feminino, 0);
						
						switch(sexoss) {
						case 0:
							JOptionPane.showOptionDialog(null, "A vista", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, forma, 0);
						break;
						
						case 1:
							JOptionPane.showOptionDialog(null, "A prazo", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, forma, 0);
						break;
						}
					break;
					}
				break;
				}
			break;
			
			}while(continuar == true);
		}		
	}