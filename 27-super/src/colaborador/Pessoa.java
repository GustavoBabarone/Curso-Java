package colaborador;

public class Pessoa {

	// ATRIBUTOS
	private String nomePessoa, enderecoPessoa;
	private int idadePessoa;
	
	// CONSTRUTOR
	public Pessoa(String nomePessoa, String enderecoPessoa, int idadePessoa) {
		this.nomePessoa = nomePessoa;
		this.enderecoPessoa = enderecoPessoa;
		this.idadePessoa = idadePessoa;
		
		exibirDadosPessoa();
	}
	
	// MÉTODO PARA EXIBIR DADOS PESSOAIS
	private void exibirDadosPessoa() {
		System.out.println("Nome: "+nomePessoa);
		System.out.println("Endereço: "+enderecoPessoa);
		System.out.println("Idade: "+idadePessoa);
	}
	
}
