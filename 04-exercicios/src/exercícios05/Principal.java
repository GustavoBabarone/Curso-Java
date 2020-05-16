package exercícios05;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

/*      String produto = JOptionPane.showInputDialog(null, "Insira o nome do produto:");
		int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o valor do produto?"));
		
		String tabela = "A tabela de preços do(a) "+produto +" é";
			   tabela+= "\n1 x "+valor*0.95 +" = "+valor*0.95*1;
			   tabela+= "\n2 x "+valor*0.90 +" = "+valor*0.90*2;
			   tabela+= "\n3 x "+valor*0.85 +" = "+valor*0.85*3;
			   tabela+= "\n4 x "+valor*0.80 +" = "+valor*0.80*4;
			   tabela+= "\n5 x "+valor*0.75 +" = "+valor*0.75*5;
			   tabela+= "\n6 x "+valor*0.70 +" = "+valor*0.70*6;
			   tabela+= "\n7 x "+valor*0.65 +" = "+valor*0.65*7;
			   tabela+= "\n8 x "+valor*0.60 +" = "+valor*0.60*8;
			   tabela+= "\n9 x "+valor*0.55 +" = "+valor*0.55*9;
			   tabela+= "\n10 x "+valor*0.50 +" = "+valor*0.50*10;
	
			   JOptionPane.showMessageDialog(null,  tabela);       */
	
		
		String produto = JOptionPane.showInputDialog(null, "Insira o nome do produto:");
		double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual valor do seu produto?"));
		double desconto = 0.95;
			
		String tabela = "";
		DecimalFormat df = new DecimalFormat("#.00");
		
		for(int indice = 1; indice <= 10; indice++) {
			tabela += "\n" +indice +" X "+df.format(valor*desconto) +" = " +df.format(valor*desconto*indice);
			desconto-= 0.05;	
			
		}
			JOptionPane.showMessageDialog(null, tabela);

	}
}
