package exemploprova;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		// VARIÁVEIS
		
		Object[] objetos = {"Objeto1", "Objeto2", "Objeto3"};
		String nome;
		boolean continuar = true;
		int nomes=0;
		double altura=0, peso=0, mediaaltura=0;
		int obejetos = JOptionPane.showOptionDialog(null, "Texto", "Nome da caixa", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, objetos, 0);

		// INICIO DO LAÇO
		
		do {
			
			// PERGUNTAS
			
			int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Número:"));
			altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Altura:"));
			nome = JOptionPane.showInputDialog(null, "Nome");
			
			// CONDICIONAL PARA O BOOLEAN
			
			if(numero == 0) {
				continuar = false;
				
			} // FIM DO IF
			
		}while (continuar == true); // PARA TERMINAR O BOOLEAN
		
		// INICIO DO LAÇO
		
		do {
			
			// QUANDO NECESSARIO SAIR DIGITANDO "SAIR" NO NOME
			
			nome = JOptionPane.showInputDialog(null, "Nome:");
			altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Altura:"));
			mediaaltura+=altura;
					
			// CONDICIONAL PARA SABER QUANDO TERMINAR O LAÇO
			
			if(!nome.equals("sair")) {
				nomes++;  	// CONTABILIZAR QUANTIDADE DE PESSOAS
			}
			
			// FINAL DO LAÇO
			
		}while(!nome.equals("sair"));	
		
		// VARIÁVEIS EM OBJETOS
		
		Object[] estados = {"PR", "SC"};
		Object[] cidade1 = {"CURT", "FOZ"};
		Object[] cidade2 = {"BLU", "FLORIPA"};
		
		int estado = JOptionPane.showOptionDialog(null, "Estado:", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, estados, 0);
		int cidade;
		
		// USAR SWTCH / CASE PARA CONTABILIZAR OU EXIBIR OUTROS OBJETOS
		
		switch(estado) {
		case 0:
			cidade = JOptionPane.showOptionDialog(null, "Cidade:", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, estados, 0);
		
			switch(cidade) {
			case 0:
				JOptionPane.showMessageDialog(null, "CURITIBA, MEU PAU NA TUA TIA");
			break;
			
			case 1:
				JOptionPane.showMessageDialog(null, "FOZ, SEU IGUAÇUÍNO");
			break;
			}
		break;
		}
			
		switch(estado) {
		case 1:
			cidade = JOptionPane.showOptionDialog(null, "Cidade:", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, estados, 0);
		
		switch(cidade) {
		case 0:
			JOptionPane.showMessageDialog(null, "BLUMENOIA");
		break;
		
		case 1:
			JOptionPane.showMessageDialog(null, "BLUMENOIA");
		break;
			}
		
		// perguntas
		
		long resultado=0;
		int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero"));
		
		// FOR 
		
		for(int i = numero; i > 1; i--) {
			if(i == numero) {
				resultado = i * (i-1);
				System.out.println(i+" X "+(i-1)+" = "+resultado*(i-1));
			}else {
				System.out.println(resultado+" X "+(i-1)+" = "+resultado*(i-1));
				resultado = resultado*(i-1);
			}
				
				// int i=0 começo; i <= 9 parada; decremnta ou incrementa
				
			
		}
		
		}
	}
}
