package exercícios11;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		// Variáveis
		
		Object[] cargos = {"Desenvolvedor Java Júnior", "Desenvolvedor Java Pleno", "Desenvolvedor Jana Sênior", "Administrador de Banco de Dados", "Analista Júnior", "Analista Pleno", "Analista Sênior", "Arquiteto de Software", "Gerente de Projetos"};
		Object[] sexos = {"Masculino", "Feminino"};
		Object[] clubes = {"Sim", "Não"};
		int continuar=0, salario=450, djj=0, djp=0, djs=0, abd=0, aj=0, ap=0, as=0, arq=0, gp=0, masculino=0, feminino=0;
		int novo=0, adulto=0, velho=0, antiguidade=0, clube1=0;
		double maiorsalario=0;
		String nomemaiorsalario = null;
		
		//Começando o Laço
		
		do {
		
		// Perguntas
			
		String nome = JOptionPane.showInputDialog(null, "Insira seu nome:");
		int cargo = JOptionPane.showOptionDialog(null, "Insira seu cargo:", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, cargos, 0);
		int hora = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de horas você trabalha:"));
		int horaextra = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de horas extras que você trabalha durante a semana:"));
		int horafinde = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de horas extras que você trabalha final de semana:"));
		int sexo = JOptionPane.showOptionDialog(null, "Insira seu sexo:", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, sexos, 0);
		int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira sua idade:"));
		int falta = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira seu número de faltas:"));
		int filho = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de filhos:"));
		int clube = JOptionPane.showOptionDialog(null, "Você é associado em algum clube?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, clubes, 0);
		
		
		// Calculando Salário
		
		if(salario <= 2000 && falta == 0) {
			JOptionPane.showMessageDialog(null, "Salário líquido: "+((salario) + (horaextra*15) + (horafinde*20) - (salario*0.89) + (filho*50) + (200)));
		}else if(salario >= 2001 && salario <= 3500 && falta == 0) {
			JOptionPane.showMessageDialog(null, "Salário líquido: "+((salario) + (horaextra*15) + (horafinde*20) - (salario*0.87) + (filho*50) + (200)));
		}else if(salario >= 3501 && salario <= 5600 && falta == 0) {
			JOptionPane.showMessageDialog(null, "Salário líquido: "+((salario) + (horaextra*15) + (horafinde*20) - (salario*0.86) + (filho*50) + (200)));
		}else if(salario >=5601 && falta == 0) {
			JOptionPane.showMessageDialog(null, "Salário líquido: "+((salario) + (horaextra*15) + (horafinde*20) - (salario*0.84) + (filho*50) + (200)));
		}else if(salario <= 2000 && falta != 0) {
			JOptionPane.showMessageDialog(null, "Salário líquido: "+((salario) + (horaextra*15) + (horafinde*20) - (salario*0.84) + filho*50));
		}else if(salario >= 2001 && salario <= 3500 && falta != 0) {
			JOptionPane.showMessageDialog(null, "Salário líquido: "+((salario) + (horaextra*15) + (horafinde*20) - (salario*0.84) + filho*50));
		}else if(salario >= 3501 && salario <= 5600 && falta != 0) {
			JOptionPane.showMessageDialog(null, "Salário líquido: "+((salario) + (horaextra*15) + (horafinde*20) - (salario*0.84) + filho*50));
		}else if(salario >=5601 && falta != 0) {
				JOptionPane.showMessageDialog(null, "Salário líquido: "+((salario) + (horaextra*15) + (horafinde*20) - (salario*0.84) + filho*50));
		}
		
		// Condição de Salário;
		
		if(salario > maiorsalario) {
			maiorsalario = salario;
			nomemaiorsalario = nome;
		}
		
		//Contabilizar os cargos
		
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
		
		// Contabilizar os sexos
		
		switch(sexo) {
		case 0:
			masculino++;
		break;
		
		case 1:
			feminino++;
		break;
		}
		
		//Contabilizar as idades
		
		if(idade >= 18 && idade <= 26) {
			novo++;
		}else if(idade >= 27 && idade <= 40) {
			adulto++;
		}else if(idade >= 41 && idade <= 50) {
			velho++;
		}else if(idade >= 51) {
			antiguidade++;
		}
		
		// Contabilizar os participantes de clubes
		
		if(clube == 0) {
			clube1++;
		}
		
		// final do DO
		
		continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
		}while(continuar == 0);
	
		// Conclusão de todos os dados coletados
		
		String resultado = "Total de funcionários cadastrados: "+(djj+djp+djs+abd+aj+ap+as+arq+gp);
			   resultado+= "\n";
			   resultado+= "\nHomens: "+((masculino * 100) / (+djj+djp+djs+abd+aj+ap+as+arq+gp)) +" %" +", Mulheres: "+((feminino * 100) / (+djj+djp+djs+abd+aj+ap+as+arq+gp)) +" %";
			   resultado+= "\n";
			   resultado+= "\nPessoas entre 18 e 26 anos: "+novo;
			   resultado+= "\nPessoas entre 27 e 40 anos: "+adulto;
			   resultado+= "\nPessoas entre 41 e 50 anos: "+velho;
			   resultado+= "\nPessoas com 51 anos ou mais: "+antiguidade;
			   resultado+= "\n";
			   resultado+= "\nDesenvolvedor Java Júnior: "+djj +" funcionários, "+((djj * 100) / (+djj+djp+djs+abd+aj+ap+as+arq+gp)) +" %";
			   resultado+= "\nDesenvolvedor Java Pleno: "+djp +" funcionários, "+((djp * 100) / (+djj+djp+djs+abd+aj+ap+as+arq+gp)) +" %";
			   resultado+= "\nDesenvolvedor Jana Sênior: "+djs +" funcionários, "+((djs * 100) / (+djj+djp+djs+abd+aj+ap+as+arq+gp)) +" %";
			   resultado+= "\nAdministrador de Banco de Dados: "+abd +" funcionários, " +((abd * 100) / (+djj+djp+djs+abd+aj+ap+as+arq+gp)) +" %";
			   resultado+= "\nAnalista Júnior: "+aj +" funcionários, "+((aj * 100) / (+djj+djp+djs+abd+aj+ap+as+arq+gp)) +" %";
			   resultado+= "\nAnalista Pleno: "+ap +" funcionários, "+((ap * 100) / (+djj+djp+djs+abd+aj+ap+as+arq+gp)) +" %";
			   resultado+= "\nAnalista Sênior: "+as +" funcionários, "+((as * 100) / (+djj+djp+djs+abd+aj+ap+as+arq+gp)) +" %";
			   resultado+= "\nArquiteto de Software: "+arq +" funcionários, "+((arq * 100) / (+djj+djp+djs+abd+aj+ap+as+arq+gp)) +" %";
			   resultado+= "\nGerente de Projetos: "+gp +" funcionários, "+((gp * 100) / (+djj+djp+djs+abd+aj+ap+as+arq+gp)) +" %";
			   resultado+= "\n";
			   resultado+= "\nNome do funcionário com maior salário líquido: " +nomemaiorsalario +", R$ " +maiorsalario;
			   resultado+= "\n";
			   resultado+= "\nFuncionários que aderem a um clube:"+clube1 +" funcionários, "+((clube1 * 100) / (+djj+djp+djs+abd+aj+ap+as+arq+gp)) +" %";
			   resultado+= "\n";
			   
			   // Exibir conclusão
			   
			   JOptionPane.showMessageDialog(null, resultado);
	}
}