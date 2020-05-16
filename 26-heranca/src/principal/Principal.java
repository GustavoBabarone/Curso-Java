package principal;

import cargos.Analista;
import cargos.Desenvolvedor;
import cargos.Estagiario;

public class Principal {

	public static void main(String[] args) {
	
		// INSTANCIAR OBJETOS
		Desenvolvedor d = new Desenvolvedor("Desenvolvedor Jr", 2000);
		Analista a = new Analista("Analista Pleno", 4000);
		Estagiario e = new Estagiario("Estagiário", 1000);
		
		// VALE TRANSPORTE
		d.ValeTransporte();
		a.ValeTransporte();
		e.ValeTransporte();
		
		// IMPOSTO DE RENDA
		d.impostoRenda();
		a.impostoRenda();
		e.impostoRenda();

	}

}
