package exemplo08;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Principal {

	public static void main(String[] args) {
		
		// CRIAR UM FORMULARIO
		
		JFrame formulario = new JFrame();
		formulario.setTitle("Meu oitavo formulário");
		formulario.setSize(500, 300);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// CAMPO
		
		JTextArea campo = new JTextArea();
		
		// BARRA DE ROLAGEM
		
		JScrollPane barraRolagem = new JScrollPane(campo);
		barraRolagem.setBounds(10 , 10, 470, 250);
		
		// ADICIONAR AO FORMULARIO
		
		formulario.add(barraRolagem);
		
		//EXIBIR COMPONENTES
		
		formulario.setVisible(true);
	}

}
