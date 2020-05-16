package beans;

public class Colaborador {

	// INSTANCIAR ATRIBUTOS
	private String colaborador, cargo;
	private boolean clubeFidelidade, planoSaude;
	private int faltas;
	private double valeTrasporte, impostoRenda, salarioLiquido, salarioBruto;
	
	// SET & GET
	public String getColaborador() {
		return colaborador;
	}
	public void setColaborador(String colaborador) {
		this.colaborador = colaborador;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public boolean isClubeFidelidade() {
		return clubeFidelidade;
	}
	public void setClubeFidelidade(boolean clubeFidelidade) {
		this.clubeFidelidade = clubeFidelidade;
	}
	public boolean isPlanoSaude() {
		return planoSaude;
	}
	public void setPlanoSaude(boolean planoSaude) {
		this.planoSaude = planoSaude;
	}
	public int getFaltas() {
		return faltas;
	}
	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}
	public double getValeTrasporte() {
		return valeTrasporte;
	}
	public void setValeTrasporte(double valeTrasporte) {
		this.valeTrasporte = valeTrasporte;
	}
	public double getImpostoRenda() {
		return impostoRenda;
	}
	public void setImpostoRenda(double impostoRenda) {
		this.impostoRenda = impostoRenda;
	}
	public double getSalarioLiquido() {
		return salarioLiquido;
	}
	public void setSalarioLiquido(double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}		
}
