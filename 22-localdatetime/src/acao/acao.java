package acao;

import javax.swing.table.DefaultTableModel;

import Principal.Principal;
import Beans.Produto;

public class acao {
	
		// CADASTRAR JOGOS
		public void cadastrar(Produto p) {
			Principal.vetorProdutos.add(p);
		}
		
		// SELECIONAR JOGOS
		public DefaultTableModel selecionar() {
			
			DefaultTableModel dadosTabela = new DefaultTableModel();
			dadosTabela.addColumn("Nome");
			dadosTabela.addColumn("Valor");
			dadosTabela.addColumn("Estoque");			
			dadosTabela.addColumn("Data");
			dadosTabela.addColumn("Hora");
			
			for(int i=0; i<Principal.vetorProdutos.size(); i++) {
				dadosTabela.addRow(new Object[] {
						Principal.vetorProdutos.get(i).getNome(),
						Principal.vetorProdutos.get(i).getValor(),
						Principal.vetorProdutos.get(i).getQuantidade(),	
						Principal.vetorProdutos.get(i).getData(),	
						Principal.vetorProdutos.get(i).getHora(),	
				});
			}			
			return dadosTabela;
		}	
}
