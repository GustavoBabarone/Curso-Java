package colaborador;

public class Colaborador extends Pessoa {

	// ATRIBUTOS
	private String cargoColaborador;
	private double salarioColaborador;
	
	// CONSTRUTOR
	public Colaborador(String nomePessoa, String enderecoPessoa, int idadePessoa, String cargoColaborador, double salarioColaborador) {
		
		super(nomePessoa, enderecoPessoa, idadePessoa);
		
		this.cargoColaborador = cargoColaborador;
		this.salarioColaborador = salarioColaborador;
			
		exibirDadosColaborador();		
	}
	
	// MÉTODO PARA EXIBIR DADOS DO COLABORADOR
	public void exibirDadosColaborador() {
		System.out.println("Cargo "+cargoColaborador);
		System.out.println("Salário: "+salarioColaborador);
	}
	
}
