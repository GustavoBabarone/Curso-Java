package pagamento;

public class Credito extends Debito{

	//M�TODO DE TRIBUTOS
	public void tributos(double valor) {
		System.out.println(valor*0.04);
	}

	// M�TODO MENSAGEM
	public void msg() {
		System.out.println("Reescrevendo o m�todo msg");
	}

}
