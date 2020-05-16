package pagamento;

public class Credito extends Debito{

	//MÉTODO DE TRIBUTOS
	public void tributos(double valor) {
		System.out.println(valor*0.04);
	}

	// MÉTODO MENSAGEM
	public void msg() {
		System.out.println("Reescrevendo o método msg");
	}

}
