package exemplo05;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Principal {

	public static void main(String[] args) {
		
		//Criar um formulário
		
		JFrame formulario = new JFrame();
		formulario.setTitle("Meu quinto formulário");
		formulario.setSize(500, 300);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Botôes 
		
		JButton btn01 = new JButton("Caixa 1");
		btn01.setBounds(10, 10, 150, 20);
		
		JButton btn02 = new JButton("Caixa 2");
		btn02.setBounds(190, 10, 150, 20);
		
		// Painéis
		
		JPanel caixa01 = new JPanel();
		caixa01.setBounds(10, 40, 300, 150);
		caixa01.setBackground(Color.YELLOW);
		caixa01.setVisible(false);
		
		JPanel caixa02 = new JPanel();
		caixa02.setBounds(10, 40, 300, 150);
		caixa02.setBackground(Color.BLUE);
		
		// Adicionando botão na caixa02
		
		JButton botao = new JButton("Enviar");
		botao.setSize(100, 30);
		caixa02.add(botao);
		
		// Ações dos botões
		
		btn01.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				caixa01.setVisible(true);
				caixa02.setVisible(false);
			}
		});
		
		btn02.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				caixa01.setVisible(false);
				caixa02.setVisible(true);
			}
		});
		
		// Adicionar elemntos ao formulário
		
		formulario.add(btn01);
		formulario.add(btn02);
		formulario.add(caixa01);
		formulario.add(caixa02);
		
		
		//Exibir componentes
		
		formulario.setVisible(true);
		
	}

}
