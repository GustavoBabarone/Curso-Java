package exemplo10;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {
		
		// Criar um formul�rio
		
		JFrame formulario = new JFrame();
		formulario.setTitle("Meu quinto formul�rio");
		formulario.setSize(500, 300);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		// Bot�es 
				
		JButton btn01 = new JButton("Caixa 1");
		btn01.setBounds(10, 10, 150, 20);
				
		// Pain�is
				
		JPanel caixa01 = new JPanel();
		caixa01.setBounds(10, 40, 300, 150);
		caixa01.setBackground(Color.YELLOW);
		caixa01.setVisible(false);
		caixa01.setLayout(null);
				
		JTextField a = new JTextField();
		a.setBounds(10, 40, 100, 50);				
		caixa01.add(a);
								
		// A��es dos bot�es
				
		btn01.addActionListener(new ActionListener() {
					
			@Override
			public void actionPerformed(ActionEvent e) {
				caixa01.setVisible(true);
																
			}
		});
				
		// Adicionar elemntos ao formul�rio
				
		formulario.add(btn01);			
		formulario.add(caixa01);
								
		// Exibir componentes
				
		formulario.setVisible(true);
				
	}

}
