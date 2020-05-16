package acao;

import javax.swing.table.DefaultTableModel;

import beans.Colaborador;
import principal.Principal;

public class acao {
	
	// CADASTRAR
	public void cadastrar(Colaborador c) {
		Principal.vetorColaborador.add(c);
	}
	
	// TABELA
	public DefaultTableModel selecionar() {
		
		DefaultTableModel dadosTabela = new DefaultTableModel();
		dadosTabela.addColumn("Colaborador");
		dadosTabela.addColumn("Salário Líquido");
		
		for(int i=0; i<Principal.vetorColaborador.size(); i++) {
			dadosTabela.addRow(new Object[] {
					Principal.vetorColaborador.get(i).getColaborador(),
					Principal.vetorColaborador.get(i).getSalarioLiquido(),
			});
		}
		
		return dadosTabela;
	}

	// MÉTODO OBTER SALARIO BRUTO
	public double obterSalarioBruto(int selectedItem) {

		double salario = 0;
		
		if(selectedItem == 0) {
			salario = 900;
		}else if(selectedItem == 1) {
			salario = 1300;
		}else if(selectedItem == 2) {
			salario = 1800;
		}else if(selectedItem == 3) {
			salario = 2400;
		}else if(selectedItem == 4) {
			salario = 2700;
		}else if(selectedItem == 5) {
			salario = 3200;
		}else if(selectedItem == 6) {
			salario = 3600;
		}else if(selectedItem == 7) {
			salario = 4400;
		}	
			return salario;		
	}	

	// MÉTODO OBTER VALE TRANSPORTE
	public double obterValeTransporte(int selectedItem) {
		
		double valeTransporte = 0;
		
		if(selectedItem == 0) {
			valeTransporte = (900*0.06);
		}else if(selectedItem == 1) {
			valeTransporte = (1300*0.06);
		}else if(selectedItem == 2) {
			valeTransporte = (1800*0.06);
		}else if(selectedItem == 3) {
			valeTransporte = (2400*0.06);
		}else if(selectedItem == 4) {
			valeTransporte = (2700*0.06);
		}else if(selectedItem == 5) {
			valeTransporte = (3200*0.06);
		}else if(selectedItem == 6) {
			valeTransporte = (3600*0.06);
		}else if(selectedItem == 7) {
			valeTransporte = (4400*0.06);
		}
			return valeTransporte;
	}
	
	// MÉTODO OBTER IMPOSTO DE RENDA
	public double obterImpostoRenda(int selectedItem) {
		
		double impostoRenda = 0;
		
		if(selectedItem == 0) {
			impostoRenda = (900*0);
		}else if(selectedItem == 1) {
			impostoRenda = (1300*0.04);
		}else if(selectedItem == 2) {
			impostoRenda = (1800*0.055);
		}else if(selectedItem == 3) {
			impostoRenda = (2400*0.06);
		}else if(selectedItem == 4) {
			impostoRenda = (2700*0.065);
		}else if(selectedItem == 5) {
			impostoRenda = (3200*0.07);
		}else if(selectedItem == 6) {
			impostoRenda = (3600*0.075);
		}else if(selectedItem == 7) {
			impostoRenda = (4400*0.08);
		}
			return impostoRenda;
	}	

	// MÉTODO OBTER SALÁRIO LÍQUIDO
	public double obterSalarioLiquido(int selectedItem) {
		
		double salarioLiquido = 0;
		
		if(selectedItem == 0) {
			salarioLiquido = (900 - (900*0.06));
		}else if(selectedItem == 1) {
			salarioLiquido = (1300 - (1300*0.06) - (1300*0.04));
		}else if(selectedItem == 2) {
			salarioLiquido = (1800 - (1800*0.06) - (1800*0.055));
		}else if(selectedItem == 3) {
			salarioLiquido = (2400 - (2400*0.06) - (2400*0.06));
		}else if(selectedItem == 4) {
			salarioLiquido = (2700 - (2700*0.06) - (2700*0.065));
		}else if(selectedItem == 5) {
			salarioLiquido = (3200 - (3200*0.06) - (3200*0.07));
		}else if(selectedItem == 6) {
			salarioLiquido = (3600 - (3600*0.06) - (3600*0.075));
		}else if(selectedItem == 7) {
			salarioLiquido = (4400 - (4400*0.06) - (4400*0.08));
		}
			return salarioLiquido;
	}	

	// MÉTODO OBTER CLUBE FIDELIDADE
	public double valeTransporte(boolean checkbox,double salarioBruto){

		double valeTransporte = checkbox == true ? salarioBruto * 0.06 : 0;
		if(checkbox == false) {
			salarioBruto = salarioBruto / 0.06;
		}
		return valeTransporte;
	}
	
	// MÉTODO OBTER PLANO SAÚDE
	public double planoSaude(boolean checkbox2,double salarioBruto){

		double planoSaude = checkbox2 == true ? salarioBruto * 0.03 : 0;
		
		return planoSaude;

	}
	
	// MÉTODO OBTER CLUBE FIDELIDADE
	public double Clube(boolean checkbox3,double salarioBruto){

		double clubeFidelidade = checkbox3 == true ? (+ 100) : (- 100);
	
		return clubeFidelidade;

}
	

}
