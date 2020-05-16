package exemplo03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {
		
		//Criar um formulário
		
		JFrame formulario = new JFrame();
		formulario.setTitle("Meu terceiro formulário");
		formulario.setSize(500, 300);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		//Criar um rótulo
		
		JLabel rotulo = new JLabel();
		rotulo.setBounds(30, 30, 150, 20);
		rotulo.setText("Informe seu nome");
	
		//Criar um campo de texto
		
		JTextField campo = new JTextField();
		campo.setBounds(180, 30, 290, 20);
		
		//Criar um botão
		
		JButton botao = new JButton();
		botao.setText("Botão");
		botao.setBounds(180, 70, 100, 30);
		
		//Ação no botão
		
		botao.addActionListener(new ActionListener() {
			
			@Override
			
			public void actionPerformed(ActionEvent e) {
				
				//Obter o nome informado
				
				String nome = campo.getText();
				
				//Exibir uma mensagem
				
				JOptionPane.showMessageDialog(null, "Olá "+nome);
				
				//Limpar o campo de texto
				
				campo.setText("");
				
				//Deixar o cursor selecionado no campo
				
				campo.requestFocus();
				
			}
		});
		
		//Adicionar elementos ao formulário
		
		formulario.add(rotulo);
		formulario.add(campo);
		formulario.add(botao);
	
		//Exibir formulário e seus componentes internos
		
		formulario.setVisible(true);
		
		
	}

}
