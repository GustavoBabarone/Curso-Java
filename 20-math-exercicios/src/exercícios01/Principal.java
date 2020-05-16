package exerc�cios01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		// CRIAR UM FORMULARIO
		
		JFrame formulario = new JFrame();
		formulario.setTitle("Calculadora top top 10/10");
		formulario.setSize(420, 210);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setVisible(true);
		
		// BOT�O PARA SOMA		
		JButton soma = new JButton();
		soma.setText("Soma");
		soma.setBounds(10, 10, 120, 30);
		
		// A��O DO BOT�O SOMA		
		soma.addActionListener(new ActionListener() {
			
			@Override		
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o 1� n�mero"));
				int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o 2� n�mero"));
				
				JOptionPane.showMessageDialog(null, n1+" + " +n2+" = "+(n1+n2));
			}
		});
		
		// BOT�O PARA SUBTRA��O		
		JButton subtracao = new JButton();
		subtracao.setText("Subtra��o");
		subtracao.setBounds(10, 50, 120, 30);
				
		// A��O DO BOT�O SUBTRA��O		
		subtracao.addActionListener(new ActionListener() {
					
			@Override		
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o 1� n�mero"));
				int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o 2� n�mero"));
						
				JOptionPane.showMessageDialog(null, n1+" - " +n2+" = "+(n1-n2));
			}
		});
		
		// BOT�O PARA DIVIS�O		
		JButton divisao = new JButton();
		divisao.setText("Divis�o");
		divisao.setBounds(10, 90, 120, 30);
						
		// A��O DO BOT�O DIVIS�O		
		divisao.addActionListener(new ActionListener() {
							
			@Override		
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o 1� n�mero"));
				int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o 2� n�mero"));
								
				JOptionPane.showMessageDialog(null, n1+" / " +n2+" = "+(n1/n2));
			}
		});
		
		// BOT�O PARA MULTIPLICA��O		
		JButton multiplicacao = new JButton();
		multiplicacao.setText("Multiplica��o");
		multiplicacao.setBounds(10, 130, 120, 30);
								
		// A��O DO BOT�O MULTIPLICA��O		
		multiplicacao.addActionListener(new ActionListener() {
									
			@Override		
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o 1� n�mero"));
				int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o 2� n�mero"));
										
				JOptionPane.showMessageDialog(null, n1+" x " +n2+" = "+(n1*n2));
			}
		});
		
		// BOT�O PARA SENO		
		JButton seno = new JButton();
		seno.setText("Seno");
		seno.setBounds(140, 10, 120, 30);
				
		// A��O DO BOT�O SENO		
		seno.addActionListener(new ActionListener() {
					
			@Override		
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o n�mero em graus"));
						
				JOptionPane.showMessageDialog(null, "Seno de "+n1+"�" +" = " +Math.sin(n1));
			}
		});
		
		// BOT�O PARA COSSENO		
		JButton cosseno = new JButton();
		cosseno.setText("Cosseno");
		cosseno.setBounds(140, 50, 120, 30);
						
		// A��O DO BOT�O SENO		
		cosseno.addActionListener(new ActionListener() {
							
			@Override		
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o n�mero em graus"));			
				
				JOptionPane.showMessageDialog(null, "Cosseno de "+n1+"�" +" = " +Math.cos(n1));
			}
		});
		
		// BOT�O PARA TANGENTE		
		JButton tangente = new JButton();
		tangente.setText("Tangente");
		tangente.setBounds(140, 90, 120, 30);
								
		// A��O DO BOT�O TANGENTE		
		tangente.addActionListener(new ActionListener() {
									
			@Override		
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o n�mero em graus"));
										
				JOptionPane.showMessageDialog(null, "Tangente de "+n1+"�" +" = " +Math.tan(n1));
			}
		});
		
		// BOT�O PARA LOGARITMO		
		JButton log = new JButton();
		log.setText("Logaritmo");
		log.setBounds(270, 10, 120, 30);
										
		// A��O DO BOT�O LOGARITMO		
		log.addActionListener(new ActionListener() {
											
			@Override		
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o n�mero"));
												
				JOptionPane.showMessageDialog(null, "Logaritmo de "+n1 +" = " +Math.log(n1));
			}
		});
		
		// BOT�O PARA RAIZ QUADRADA		
		JButton raizquadrada = new JButton();
		raizquadrada.setText("Raiz Quadrada");
		raizquadrada.setBounds(270, 50, 120, 30);
												
		// A��O DO BOT�O RAIZ QUADRADA		
		raizquadrada.addActionListener(new ActionListener() {
													
			@Override		
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o n�mero"));
														
				JOptionPane.showMessageDialog(null, "Raiz quadrada de "+n1 +" = " +Math.sqrt(n1));
			}
		});
		
		// BOT�O PARA RAIZ CUBICA		
		JButton raizcubica = new JButton();
		raizcubica.setText("Raiz C�bica");
		raizcubica.setBounds(270, 90, 120, 30);
														
		// A��O DO BOT�O RAIZ CUBICA		
		raizcubica.addActionListener(new ActionListener() {
															
			@Override		
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o n�mero"));
																
				JOptionPane.showMessageDialog(null, "Raiz c�bica de "+n1 +" = " +Math.sqrt(n1));
			}
		});
		
		// ADICIONANDO ELEMESNTOS AO FORMULARIO		
		formulario.add(soma);
		formulario.add(subtracao);
		formulario.add(divisao);
		formulario.add(multiplicacao);
		formulario.add(seno);
		formulario.add(cosseno);
		formulario.add(tangente);
		formulario.add(log);
		formulario.add(raizquadrada);
		formulario.add(raizcubica);
	}
}
