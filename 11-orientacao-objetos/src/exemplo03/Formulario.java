package exemplo03;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Formulario {

	// MÉTODO PARA EXIBIR UM JFrame
	void formulario() {
		
		JFrame f = new JFrame("Meu formularo");
		f.setSize(500, 300);
		f.setLocationRelativeTo(null);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.add(painel1());
		f.setVisible(true);
	
	}
		
	// MÉTODO PARA JPanel
		JPanel painel1() {
			
			JPanel p = new JPanel();
			p.setBounds(10, 60, 464, 180);
			p.setLayout(null);
			p.setBackground(Color.RED);
			
			// BOTÃO
			JButton btn = new JButton();
			for(int i=0; i<3; i++) {
					btn = new JButton();
					btn.setBounds(i*120, 10, 100, 20);
					btn.setText("Botão: "+(i+1));
					p.add(btn);
			}
		return p;
	}		
}
