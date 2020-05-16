package acao;

import javax.swing.table.DefaultTableModel;

import Principal.Principal;
import beans.Jogo;

public class acao {

	// CADASTRAR JOGOS
	public void cadastrar(Jogo j) {
		Principal.vetorJogos.add(j);
	}
	
	// SELECIONAR JOGOS
	public DefaultTableModel selecionar() {
		
		DefaultTableModel dadosTabela = new DefaultTableModel();
		dadosTabela.addColumn("Nome");
		dadosTabela.addColumn("Gênero");
		dadosTabela.addColumn("Plataforma");
		dadosTabela.addColumn("Classificação");
		dadosTabela.addColumn("Valor");
		
		for(int i=0; i<Principal.vetorJogos.size(); i++) {
			dadosTabela.addRow(new Object[] {
					Principal.vetorJogos.get(i).getNome(),
					Principal.vetorJogos.get(i).getGenero(),
					Principal.vetorJogos.get(i).getPlataforma(),
					Principal.vetorJogos.get(i).getClassificacao(),
					Principal.vetorJogos.get(i).getValor(),
			});
		}
		
		return dadosTabela;
	}	

	// EXCLUIR JOGO
	public void excluir(int indice) {
		Principal.vetorJogos.remove(indice);
	}
	
	// ALTERAR JOGO
	public void alterar(int indice, Jogo j) {
		Principal.vetorJogos.set(indice, j);
	}
	
}
