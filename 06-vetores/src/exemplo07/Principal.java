package exemplo07;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String[][] produtos = {
									{"Caderno","5"},
									{"Lápis","1.50"},
									{"Mochila","89.90"},
									{"Caneta","2.45"},
									{"Apontador","0.50"},
							  };

		String menu = "Escolha uma opção:\n";
		
		int i=0;
		
		for(i=0; i < produtos.length; i++) {
			menu+="\n" +(i+1)+") "+produtos[i][0];
		}
		
		menu+="\n"+(i+1)+") Sair";
		
		int opcao = 0;
		int quantidade = 0;
		double total=0;
		
		do {
			
			opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			if(opcao != 6) {
			quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do produto:"));
			}
			
			switch(opcao) {
			case 1:
				total+= quantidade * Double.parseDouble(produtos[0][1]);
			break;
			
			case 2:
				total+= quantidade * Double.parseDouble(produtos[1][1]);
			break;
			
			case 3:
				total+= quantidade * Double.parseDouble(produtos[2][1]);
			break;
			
			case 4:
				total+= quantidade * Double.parseDouble(produtos[3][1]);
			break;
			
			case 5:
				total+= quantidade * Double.parseDouble(produtos[4][1]);
			break;
			}
			
		}while(opcao != 6);
	
		JOptionPane.showMessageDialog(null, "Total a pagar R$ "+total);
	}
}
