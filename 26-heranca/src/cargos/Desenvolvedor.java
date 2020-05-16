package cargos;

public class Desenvolvedor extends Cargo {
	
	// CONSTRUTOR
	public Desenvolvedor (String cargo, double salario) {
		this.cargo = cargo;
		this.salario = salario;
	}

	// IMPOSTO DE RENDA
	public void impostoRenda() {
		System.out.println(cargo+" terá que pagar R$ "+salario*0.10+" de imposto de renda.");
	}
	
}
