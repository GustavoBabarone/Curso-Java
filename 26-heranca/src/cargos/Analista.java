package cargos;

public class Analista extends Cargo {
	
	// CONSTRUTOR
	public Analista (String cargo, double salario) {
		this.cargo = cargo;
		this.salario = salario;
	}

	// IMPOSTO DE RENDA
	public void impostoRenda() {
		System.out.println(cargo+" terá que pagar R$ "+salario*0.20+" de imposto de renda.");
	}
	
}
