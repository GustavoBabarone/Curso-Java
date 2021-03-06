package exemplo07;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Principal {

	public static void main(String[] args) {
		
		// CRIAR UM FORMULARIO
		
		JFrame formulario = new JFrame();
		formulario.setTitle("Meu s�timo formul�rio");
		formulario.setSize(500, 300);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// JRadio Button
		
		JRadioButton rbt01 = new JRadioButton("Op��o 01");
		rbt01.setBounds(10, 10, 100, 20);
		rbt01.setActionCommand("Op��o 01 ativa");
		
		JRadioButton rbt02 = new JRadioButton("Op��o 02");
		rbt02.setBounds(10, 40, 100, 20);
		rbt02.setActionCommand("Op��o 02 ativa");
		
		JRadioButton rbt03 = new JRadioButton("Op��o 03");
		rbt03.setBounds(10, 70, 100, 20);
		rbt03.setActionCommand("Op��o 03 ativa");
		
		// AGRUPAR JRadio Button
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rbt01);
		bg.add(rbt02);
		bg.add(rbt03);
		
		// BOT�O
		
		JButton botao = new JButton("Verificar");
		botao.setBounds(10, 110, 150, 20);
		
		// A��O NO BOT�O
		
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Obter o comand
				String valor = bg.getSelection().getActionCommand();
				
				// Exibir o valor
				
				JOptionPane.showMessageDialog(null, valor);
			}
		});
		
		// Adicionar elementos ao formulario
		
		formulario.add(rbt01);
		formulario.add(rbt02);
		formulario.add(rbt03);
		formulario.add(botao);
		
		//Exibir componentes
		
		formulario.setVisible(true);

	}

}
