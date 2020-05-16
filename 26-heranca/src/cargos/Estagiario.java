package cargos;

public class Estagiario extends Cargo {
	
	// CONSTRUTOR
	public Estagiario (String cargo, double salario) {
		this.cargo = cargo;
		this.salario = salario;
	}

	// IMPOSTO DE RENDA
	public void impostoRenda() {
		System.out.println("Não há imposto de renda para estagiário.");
	}
	
}
