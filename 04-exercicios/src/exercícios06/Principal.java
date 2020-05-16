package exercícios06;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		// Variáveis
		
		Object[] sexos = {"Masculino", "Feminino"};
		String nome;
		int nomes=0, masc=0, fem=0, prb=0, otm=0, bom=0, sat=0, rec=0, rep=0;
		
		// Inicio do laço
		
		do {
		
			// Adquirindo informações
			
			nome = JOptionPane.showInputDialog(null, "Insira seu nome:");
			
			// Condicional
			
		if(!nome.equals("sair")) {
				nomes++;
				
		int sexo = JOptionPane.showOptionDialog(null, "Insira seu sexo:", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, sexos, 0);
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira sua 1ª nota:"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira sua 2ª nota:"));
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira sua 3ª nota:"));
		double nota4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira sua 4ª nota:"));
		
		// Contabilizar os sexos
		
		switch(sexo) {
		
		case 0:
			masc++;
		break;
		
		case 1:
			fem++;
		break;
		}
		
		// Calculo da média
		
		double media = ((nota1 + nota2 + nota3 + nota4) / 4);
		
		// Mostrar média aluno
		
		if(media == 10) {
			JOptionPane.showMessageDialog(null, "Sua média é: "+media+ ", Parabéns!");
		}else if(media >= 9 && media <= 9.9) {
			JOptionPane.showMessageDialog(null, "Sua média é: "+media+ ", Ótimo!");
		}else if(media >= 8 && media <= 8.9) {
			JOptionPane.showMessageDialog(null, "Sua média é: "+media+ ", Bom!");
		}else if(media >= 7 && media <= 7.9) {
			JOptionPane.showMessageDialog(null, "Sua média é: "+media+ ", Satisfatório");
		}else if(media >= 5 && media <=6.9) {
			JOptionPane.showMessageDialog(null, "Sua média é: "+media+ ", Recuperação");
		}else if(media < 5) {
			JOptionPane.showMessageDialog(null, "Sua média é: "+media+ ", Reprovado!");
		}
		
		// Contabilizar as médias
		
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
		
		// Final do laço
		
		}while(!nome.equals("sair"));
	
		// Resultado final da pesquisa
		
		String total = "Homens: "+((masc*100) / (masc + fem)) +" %";
			   total+= "Mulheres: "+((fem*100) / (masc + fem)) +" %";
			   total+= "\n";
			   total+= "\n"+(prb) +" alunos com média 10" +", Parabéns!"+(100 / (prb + otm + bom + sat + rec + rep) * prb) + " %";
			   total+= "\n"+(otm) +" alunos com média entre 9 e 9.9" +", Ótimo!"+(100 / (prb + otm + bom + sat + rec + rep) * otm) + " %";
			   total+= "\n"+(bom) +" alunos com média entre 8 e 8.9" +", Bom!"+(100 / (prb + otm + bom + sat + rec + rep) * bom) + " %";
			   total+= "\n"+(sat) +" alunos com média entre 7 e 7.9" +", Satisfatório!"+(100 / (prb + otm + bom + sat + rec + rep) * sat) + " %";
			   total+= "\n"+(rec) +" alunos com média entre 5 e 6.9" +", Recuperação!"+(100 / (prb + otm + bom + sat + rec + rep) * rec) + " %";
			   total+= "\n"+(rep) +" alunos com média abaixo de 5" +", Reprovado!"+(100 / (prb + otm + bom + sat + rec + rep) * rep) + " %";
			   
		JOptionPane.showMessageDialog(null, total);
	}

}
