package exerc�cios11denovo;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		// Variaveis
		
		Object[] cargos = {"Desenv Java J�n", "Desenv Java Ple", "Desenv Jana S�n", "Adm de Banco de Dados", "Anali J�n", "Anali Ple", "Anali S�n", "Arq de Soft", "Ger de Proj"};
		Object[] sexos = {"Masculino", "Feminino"};
		Object[] clubes = {"SIM", "N�O"};
		String nome, maiornome = null;
		int crian�a=0, velho=0, adulto=0, jovem=0, masc=0, fem=0, continuar=0, bom=0;
		int djj=0, djp=0, djs=0, abd=0, aj=0, as=0, ap=0, arq=0, gp=0, maiorsalario=0;
		// INICIO DO LA�O
		
		do {
		
		// PERGUNTAS
		
		nome = JOptionPane.showInputDialog(null, "Seu nome:");
		int cargo = JOptionPane.showOptionDialog(null, "Seu cargo:", "UAU", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, cargos, 0);
		int sexo = JOptionPane.showOptionDialog(null, "Seu sexo:", "UAU", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, sexos, 0);
		int horas = Integer.parseInt(JOptionPane.showInputDialog(null, "Horas trab:"));
		int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Sua idade:"));
		int faltas = Integer.parseInt(JOptionPane.showInputDialog(null, "Suas faltas:"));
		int filhos = Integer.parseInt(JOptionPane.showInputDialog(null, "N�mero de filhos:"));
		int clube = JOptionPane.showOptionDialog(null, "S�cio de um clube?", "UAU", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, clubes, 0);
		int salario = horas*10;
		// CONTABLIZAR MAIOR SALARIO
		
		if(salario > maiorsalario ) {
			maiorsalario = salario;
			maiornome = nome;
		}
		
		// CONTABILIZAR O CLUBE
		
		switch(clube) {
		case 0:
			bom++;
		break;
		}
		
		// CONTAGEM DE PESSOA TOTAL E FEM E MASC
		
		switch(sexo) {
		case 0:
			masc++;
		break;
		
		case 1:
			fem++;
		break;
		}
		
		switch(cargo) {
		case 0:
			djj++;
		break;
		
		case 1:
			djp++;
		break;
		
		case 2:
			djs++;
		break;
			
		case 3:
			abd++;
		break;
		
		case 4:
			aj++;
		break;
		
		case 5:
			ap++;
		break;
		
		case 6:
			as++;
		break;
		
		case 7:
			arq++;
		break;
		
		case 8:
			gp++;
		break;
		}
		
		// CONTAGEM DE FAIXA ET�RIAS
		
		if(idade >= 18 && idade <= 26) {
			crian�a++;
		}else if(idade >= 27 && idade <= 40) {
			jovem++;
		}else if(idade > 41 && idade <= 50) {
			adulto++;
		}else if(idade >= 51) {
			velho++;
		}
		
		// FINAL DO LA�O 
		
			continuar = JOptionPane.showConfirmDialog(null, "DESEJA CONTINUAR CARAIO?");
		}while(continuar == 0);
		
		String total = "Funcion�rio cadastrados:"+(masc + fem);
			   total+= "\n"; 
			   total+= "Homens: "+masc +" Mulheres: "+fem;
			   total+= "\n";
			   total+= "\nN�mero de funcion�rios com idade entre 18 a 26 anos: "+crian�a;
			   total+= "\nN�mero de funcion�rios com idade entre 27 a 40 anos: "+jovem;
			   total+= "\nN�mero de funcion�rios com idade entre 41 a 50 anos: "+adulto;
			   total+= "\nN�mero de funcion�rios com idade superior a 50 anos: "+velho;
			   total+= "\nFuncion�rio com maior salario:"+maiornome +", com R$ "+maiorsalario;
			   total+= "\nFuncion�rio que aderem ao clube: "+bom;
			   
			  JOptionPane.showMessageDialog(null, total);
	}
}
