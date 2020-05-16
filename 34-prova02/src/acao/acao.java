package acao;

import javax.swing.table.DefaultTableModel;

import beans.Produtos;
import dados.dados;
import principal.Principal;

public class acao {

	// SOMAR PRODUTOS
	public void somar(int indice, Produtos p) {
		dados.vetorProdutos.add(indice, p);
	}
	
	// SOMAR PRODUTOS
	public void subtrair(int indice, Produtos p) {
		dados.vetorProdutos.add(indice, p);
	}
		
	// SELECIONAR TABELA
		public DefaultTableModel selecionar() {
			
			DefaultTableModel dadosTabela = new DefaultTableModel();
			dadosTabela.addColumn("Produtos");
			dadosTabela.addColumn("Quantidade");
			
			for(int i=0; i<dados.vetorProdutos.size(); i++) {
				dadosTabela.addRow(new Object[] {
						dados.vetorProdutos.get(i).getProduto(),
						dados.vetorProdutos.get(i).getQuantidade(),
				});
			}
			return dadosTabela;
		}		
}
