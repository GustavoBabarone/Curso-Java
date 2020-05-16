package exercícios01;

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
		
		// BOTÃO PARA SOMA		
		JButton soma = new JButton();
		soma.setText("Soma");
		soma.setBounds(10, 10, 120, 30);
		
		// AÇÃO DO BOTÃO SOMA		
		soma.addActionListener(new ActionListener() {
			
			@Override		
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o 1º número"));
				int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o 2º número"));
				
				JOptionPane.showMessageDialog(null, n1+" + " +n2+" = "+(n1+n2));
			}
		});
		
		// BOTÃO PARA SUBTRAÇÂO		
		JButton subtracao = new JButton();
		subtracao.setText("Subtração");
		subtracao.setBounds(10, 50, 120, 30);
				
		// AÇÃO DO BOTÃO SUBTRAÇÂO		
		subtracao.addActionListener(new ActionListener() {
					
			@Override		
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o 1º número"));
				int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o 2º número"));
						
				JOptionPane.showMessageDialog(null, n1+" - " +n2+" = "+(n1-n2));
			}
		});
		
		// BOTÃO PARA DIVISÃO		
		JButton divisao = new JButton();
		divisao.setText("Divisão");
		divisao.setBounds(10, 90, 120, 30);
						
		// AÇÃO DO BOTÃO DIVISÃO		
		divisao.addActionListener(new ActionListener() {
							
			@Override		
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o 1º número"));
				int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o 2º número"));
								
				JOptionPane.showMessageDialog(null, n1+" / " +n2+" = "+(n1/n2));
			}
		});
		
		// BOTÃO PARA MULTIPLICAÇÃO		
		JButton multiplicacao = new JButton();
		multiplicacao.setText("Multiplicação");
		multiplicacao.setBounds(10, 130, 120, 30);
								
		// AÇÃO DO BOTÃO MULTIPLICAÇÃO		
		multiplicacao.addActionListener(new ActionListener() {
									
			@Override		
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o 1º número"));
				int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o 2º número"));
										
				JOptionPane.showMessageDialog(null, n1+" x " +n2+" = "+(n1*n2));
			}
		});
		
		// BOTÃO PARA SENO		
		JButton seno = new JButton();
		seno.setText("Seno");
		seno.setBounds(140, 10, 120, 30);
				
		// AÇÃO DO BOTÃO SENO		
		seno.addActionListener(new ActionListener() {
					
			@Override		
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o número em graus"));
						
				JOptionPane.showMessageDialog(null, "Seno de "+n1+"°" +" = " +Math.sin(n1));
			}
		});
		
		// BOTÃO PARA COSSENO		
		JButton cosseno = new JButton();
		cosseno.setText("Cosseno");
		cosseno.setBounds(140, 50, 120, 30);
						
		// AÇÃO DO BOTÃO SENO		
		cosseno.addActionListener(new ActionListener() {
							
			@Override		
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o número em graus"));			
				
				JOptionPane.showMessageDialog(null, "Cosseno de "+n1+"°" +" = " +Math.cos(n1));
			}
		});
		
		// BOTÃO PARA TANGENTE		
		JButton tangente = new JButton();
		tangente.setText("Tangente");
		tangente.setBounds(140, 90, 120, 30);
								
		// AÇÃO DO BOTÃO TANGENTE		
		tangente.addActionListener(new ActionListener() {
									
			@Override		
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o número em graus"));
										
				JOptionPane.showMessageDialog(null, "Tangente de "+n1+"°" +" = " +Math.tan(n1));
			}
		});
		
		// BOTÃO PARA LOGARITMO		
		JButton log = new JButton();
		log.setText("Logaritmo");
		log.setBounds(270, 10, 120, 30);
										
		// AÇÃO DO BOTÃO LOGARITMO		
		log.addActionListener(new ActionListener() {
											
			@Override		
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o número"));
												
				JOptionPane.showMessageDialog(null, "Logaritmo de "+n1 +" = " +Math.log(n1));
			}
		});
		
		// BOTÃO PARA RAIZ QUADRADA		
		JButton raizquadrada = new JButton();
		raizquadrada.setText("Raiz Quadrada");
		raizquadrada.setBounds(270, 50, 120, 30);
												
		// AÇÃO DO BOTÃO RAIZ QUADRADA		
		raizquadrada.addActionListener(new ActionListener() {
													
			@Override		
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o número"));
														
				JOptionPane.showMessageDialog(null, "Raiz quadrada de "+n1 +" = " +Math.sqrt(n1));
			}
		});
		
		// BOTÃO PARA RAIZ CUBICA		
		JButton raizcubica = new JButton();
		raizcubica.setText("Raiz Cúbica");
		raizcubica.setBounds(270, 90, 120, 30);
														
		// AÇÃO DO BOTÃO RAIZ CUBICA		
		raizcubica.addActionListener(new ActionListener() {
															
			@Override		
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o número"));
																
				JOptionPane.showMessageDialog(null, "Raiz cúbica de "+n1 +" = " +Math.sqrt(n1));
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
