package exercícios03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String verbo = JOptionPane.showInputDialog(null, "Insira um verbo: ");
		String fim = "ar";
		String comeco = "";
		
		if(verbo.endsWith(fim)) {
			
			String menu = "Conjulgação do verbo: "+verbo +"\n";
			
		for(int i=0; i<verbo.length()-2; i++) {
			comeco += verbo.charAt(i);
			
			}
		
			menu+= "\nEu "+comeco +"o";
			menu+= "\nTu "+comeco +"as";
			menu+= "\nEle "+comeco +"a";
			menu+= "\nNós "+comeco +"amos";
			menu+= "\nVós "+comeco +"áis";
			menu+= "\nEles "+comeco +"am";
			
		JOptionPane.showMessageDialog(null, menu);
		
		}else {
			JOptionPane.showMessageDialog(null, "COLOCA UM VERBO O SUA ANTA");
		}

	}
}
