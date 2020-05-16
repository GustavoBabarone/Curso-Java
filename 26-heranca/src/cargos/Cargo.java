package cargos;

public class Cargo {

	// ATRIBUTOS
	protected String cargo;
	protected double salario;
	
	// VALE TRANSPORTE
	public void ValeTransporte() {
		System.out.println(
		"O cargo "+cargo+", terá um desconto de Vale Transporte no valor de R$ "+salario*0.06);
	}
	
}
