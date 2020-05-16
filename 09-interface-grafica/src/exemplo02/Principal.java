package exemplo02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Criar um formulário
		
				JFrame formulario = new JFrame();
				formulario.setTitle("Meu segundo formulário");
				formulario.setSize(500, 300);
				formulario.setLocationRelativeTo(null);
				formulario.setLayout(null);
				formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				formulario.setVisible(true);
		
		//Botão
				JButton botao = new JButton();
				botao.setText("Enviar");
				//botao.setSize(100, 30);
				botao.setBounds(180, 100, 100, 30);
				
				//Ação no botao
				
				botao.addActionListener(new ActionListener() {
					
					@Override
					
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null, "Olá");
						
					}
				});
				
		//Adicionar botão ao formulario
				
				formulario.add(botao);
				
				
	}

}
