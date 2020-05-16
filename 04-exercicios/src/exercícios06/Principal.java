package exerc�cios06;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		// Vari�veis
		
		Object[] sexos = {"Masculino", "Feminino"};
		String nome;
		int nomes=0, masc=0, fem=0, prb=0, otm=0, bom=0, sat=0, rec=0, rep=0;
		
		// Inicio do la�o
		
		do {
		
			// Adquirindo informa��es
			
			nome = JOptionPane.showInputDialog(null, "Insira seu nome:");
			
			// Condicional
			
		if(!nome.equals("sair")) {
				nomes++;
				
		int sexo = JOptionPane.showOptionDialog(null, "Insira seu sexo:", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, sexos, 0);
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira sua 1� nota:"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira sua 2� nota:"));
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira sua 3� nota:"));
		double nota4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira sua 4� nota:"));
		
		// Contabilizar os sexos
		
		switch(sexo) {
		
		case 0:
			masc++;
		break;
		
		case 1:
			fem++;
		break;
		}
		
		// Calculo da m�dia
		
		double media = ((nota1 + nota2 + nota3 + nota4) / 4);
		
		// Mostrar m�dia aluno
		
		if(media == 10) {
			JOptionPane.showMessageDialog(null, "Sua m�dia �: "+media+ ", Parab�ns!");
		}else if(media >= 9 && media <= 9.9) {
			JOptionPane.showMessageDialog(null, "Sua m�dia �: "+media+ ", �timo!");
		}else if(media >= 8 && media <= 8.9) {
			JOptionPane.showMessageDialog(null, "Sua m�dia �: "+media+ ", Bom!");
		}else if(media >= 7 && media <= 7.9) {
			JOptionPane.showMessageDialog(null, "Sua m�dia �: "+media+ ", Satisfat�rio");
		}else if(media >= 5 && media <=6.9) {
			JOptionPane.showMessageDialog(null, "Sua m�dia �: "+media+ ", Recupera��o");
		}else if(media < 5) {
			JOptionPane.showMessageDialog(null, "Sua m�dia �: "+media+ ", Reprovado!");
		}
		
		// Contabilizar as m�dias
		
		if(media == 10) {
			prb++;
		}else if(media >= 9 && media <= 9.9) {
			otm++;
		}else if(media >= 8 && media <= 8.9) {
			bom++;
		}else if(media >= 7 && media <= 7.9) {
			sat++;
		}else if(media >= 5 && media <= 6.9) {
			rec++;
		}else if(media <= 4.9) {
			rep++;
		}
		
		
		} // Final do if nome
		
		// Final do la�o
		
		}while(!nome.equals("sair"));
	
		// Resultado final da pesquisa
		
		String total = "Homens: "+((masc*100) / (masc + fem)) +" %";
			   total+= "Mulheres: "+((fem*100) / (masc + fem)) +" %";
			   total+= "\n";
			   total+= "\n"+(prb) +" alunos com m�dia 10" +", Parab�ns!"+(100 / (prb + otm + bom + sat + rec + rep) * prb) + " %";
			   total+= "\n"+(otm) +" alunos com m�dia entre 9 e 9.9" +", �timo!"+(100 / (prb + otm + bom + sat + rec + rep) * otm) + " %";
			   total+= "\n"+(bom) +" alunos com m�dia entre 8 e 8.9" +", Bom!"+(100 / (prb + otm + bom + sat + rec + rep) * bom) + " %";
			   total+= "\n"+(sat) +" alunos com m�dia entre 7 e 7.9" +", Satisfat�rio!"+(100 / (prb + otm + bom + sat + rec + rep) * sat) + " %";
			   total+= "\n"+(rec) +" alunos com m�dia entre 5 e 6.9" +", Recupera��o!"+(100 / (prb + otm + bom + sat + rec + rep) * rec) + " %";
			   total+= "\n"+(rep) +" alunos com m�dia abaixo de 5" +", Reprovado!"+(100 / (prb + otm + bom + sat + rec + rep) * rep) + " %";
			   
		JOptionPane.showMessageDialog(null, total);
	}

}
