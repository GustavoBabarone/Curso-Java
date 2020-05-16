package trabalho01;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Principal {
	
	static int q01 = 0;
	static int q02 = 0;
	static int q03 = 0;
	static int q04 = 0;
	static int q05 = 0;
	static int q06 = 0;
	static int q07 = 0;
	static int q08 = 0;
	static int q09 = 0;
	static int q10 = 0;
	static int q11 = 0;
	static int q12 = 0;
	static int q13 = 0;
	static int q14 = 0;

	public static void main(String[] args) {
		
		JFrame formulario = new JFrame();
		formulario.setTitle("RALF'S BAKERY!");
		formulario.setSize(1000, 800);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.getContentPane().setBackground(new Color(252, 219, 136)); 

		JPanel Títulopainel = new JPanel();
		Títulopainel.setBounds(0, 0, 1000, 110);
		Títulopainel.setBackground(new Color(196, 165, 92));
		Títulopainel.setVisible(true);
				
		JButton Pão = new JButton();
		Pão.setText("Pão  R$ 2,00");
		Pão.setBounds(70, 170, 250, 30); 
		Pão.setFont(new Font("Arial", Font.PLAIN, 20));
		
		JPanel Pãopainel = new JPanel();
		Pãopainel.setBounds(690, 220, 250, 225);
		Pãopainel.setBackground(new Color(196, 165, 92));
		Pãopainel.setVisible(false);
		
		JLabel rotulopao = new JLabel();
		rotulopao.setBounds(40, 40, 80, 20);
		rotulopao.setText("Informe a quantidade de pão:");
		rotulopao.setFont(new Font("Arial", Font.PLAIN, 18));
		Pãopainel.add(rotulopao);
		
		JTextField campopao = new JTextField();
		campopao.setBounds(700, 250, 230, 20);
		campopao.setVisible(false);
		Pãopainel.add(campopao);
		
		Pão.addActionListener(new ActionListener() {
					
			@Override
			public void actionPerformed(ActionEvent e) {
				Pãopainel.setVisible(true);
				campopao.setVisible(true);
			}
		});
				
		JButton Pizza = new JButton();
		Pizza.setText("Pizza  R$ 8,00");
		Pizza.setBounds(70, 210, 250, 30); 
		Pizza.setFont(new Font("Arial", Font.PLAIN, 20));
		
		JPanel Pizzapainel = new JPanel();
		Pizzapainel.setBounds(690, 220, 250, 225);
		Pizzapainel.setBackground(new Color(196, 165, 92));
		Pizzapainel.setVisible(false);
				
		Pizza.addActionListener(new ActionListener() {
							
			@Override
			public void actionPerformed(ActionEvent e) {
				Pizzapainel.setVisible(true);
				Pãopainel.setVisible(false);
			}
		});
				
		JButton Pastel = new JButton();
		Pastel.setText("Pastel  R$ 5,00");
		Pastel.setBounds(70, 250, 250, 30); 
		Pastel.setFont(new Font("Arial", Font.PLAIN, 20));
		
		JPanel Pastelpainel = new JPanel();
		Pastelpainel.setBounds(690, 220, 250, 225);
		Pastelpainel.setBackground(new Color(196, 165, 92));
		Pastelpainel.setVisible(false);
						
		Pastel.addActionListener(new ActionListener() {
									
			@Override
			public void actionPerformed(ActionEvent e) {
				Pastelpainel.setVisible(true);		
			}
		});
		
		Pastel.addActionListener(new ActionListener() {
							
		@Override
		public void actionPerformed(ActionEvent e) {
								
			q03 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade:"));
						   
			}
		});
				
		JButton Calzone = new JButton();
		Calzone.setText("Calzone  R$ 8,00");
		Calzone.setBounds(70, 290, 250, 30); 
		Calzone.setFont(new Font("Arial", Font.PLAIN, 20));
		
		Calzone.addActionListener(new ActionListener() {
							
		@Override
		public void actionPerformed(ActionEvent e) {
								
			q04 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade:"));
						   
			}
		});
				
		JButton Coxinha = new JButton();
		Coxinha.setText("Coxinha  R$ 6,00");
		Coxinha.setBounds(70, 330, 250, 30); 
		Coxinha.setFont(new Font("Arial", Font.PLAIN, 20));
		
		Coxinha.addActionListener(new ActionListener() {
							
		@Override
		public void actionPerformed(ActionEvent e) {
								
			q05 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade:"));
						   
			}
		});
				
		JButton Hamburguer = new JButton();
		Hamburguer.setText("Hamburguer R$ 18,00");
		Hamburguer.setBounds(70, 370, 250, 30); 
		Hamburguer.setFont(new Font("Arial", Font.PLAIN, 20));
		
		Hamburguer.addActionListener(new ActionListener() {
							
		@Override
		public void actionPerformed(ActionEvent e) {
								
			q06 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade:"));
						   
			}
		});
				
		JButton Pãoqueijo = new JButton();
		Pãoqueijo.setText("Pão de queijo  R$ 5,00");
		Pãoqueijo.setBounds(70, 410, 250, 30); 
		Pãoqueijo.setFont(new Font("Arial", Font.PLAIN, 20));
		
		Pãoqueijo.addActionListener(new ActionListener() {
							
		@Override
		public void actionPerformed(ActionEvent e) {
								
			q07 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade:"));
						   
			}
		});
				
		JButton Água = new JButton();
		Água.setText("Água  R$ 4,00");
		Água.setBounds(390, 170, 250, 30); 
		Água.setFont(new Font("Arial", Font.PLAIN, 20));
		
		Água.addActionListener(new ActionListener() {
							
		@Override
		public void actionPerformed(ActionEvent e) {
								
			q08 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade:"));
						   
			}
		});
				
		JButton Café = new JButton();
		Café.setText("Café  R$ 6,00");
		Café.setBounds(390, 210, 250, 30); 
		Café.setFont(new Font("Arial", Font.PLAIN, 20));
		
		Café.addActionListener(new ActionListener() {
									
		@Override
		public void actionPerformed(ActionEvent e) {
										
			q09 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade:"));
						   
			}
		});
				
		JButton Cerveja = new JButton();
		Cerveja.setText("Cerveja  R$ 10,00");
		Cerveja.setBounds(390, 250, 250, 30); 
		Cerveja.setFont(new Font("Arial", Font.PLAIN, 20));
		
		Cerveja.addActionListener(new ActionListener() {
									
		@Override
		public void actionPerformed(ActionEvent e) {
										
			q10 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade:"));
								   
			}
		});
				
		JButton Energético = new JButton();
		Energético.setText("Energético  R$ 15,00");
		Energético.setBounds(390, 290, 250, 30); 
		Energético.setFont(new Font("Arial", Font.PLAIN, 20));
		
		Energético.addActionListener(new ActionListener() {
									
		@Override
		public void actionPerformed(ActionEvent e) {
										
			q11 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade:"));
								   
			}
		});
				
		JButton Refrigerante = new JButton();
		Refrigerante.setText("Refrigerante  R$ 7,00");
		Refrigerante.setBounds(390, 330, 250, 30); 
		Refrigerante.setFont(new Font("Arial", Font.PLAIN, 20));
		
		Refrigerante.addActionListener(new ActionListener() {
									
		@Override
		public void actionPerformed(ActionEvent e) {
										
			q12 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade:"));
								   
			}
		});
				
		JButton Achocolatado = new JButton();
		Achocolatado.setText("Achocolatado R$ 5,00");
		Achocolatado.setBounds(390, 370, 250, 30); 
		Achocolatado.setFont(new Font("Arial", Font.PLAIN, 20));
		
		Achocolatado.addActionListener(new ActionListener() {
									
		@Override
		public void actionPerformed(ActionEvent e) {
										
			q13 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade:"));
								   
			}
		});
				
		JButton Suco = new JButton();
		Suco.setText("Suco  R$ 7,00");
		Suco.setBounds(390, 410, 250, 30); 
		Suco.setFont(new Font("Arial", Font.PLAIN, 20));
		
		Suco.addActionListener(new ActionListener() {
									
		@Override
		public void actionPerformed(ActionEvent e) {
										
			q14 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade:"));
								   
			}
		});
				
		JButton botao = new JButton();
		botao.setText("Finalizar pedido");
		botao.setBounds(705, 140, 220, 50); 
		botao.setFont(new Font("Arial", Font.PLAIN, 20));
				
		botao.addActionListener(new ActionListener() {
					
		@Override
		public void actionPerformed(ActionEvent e) {
						
			String total = "" /*+nome*/ +", Seu pedido é:";
				   total+= "\n";
				   total+= "\nPão: "+q01 +" unidade(s)";
				   total+= "\nPizza: "+q02 +" unidade(s)";
				   total+= "\nPastel: "+q03 +" unidade(s)";
				   total+= "\nCalzone: "+q04 +" unidade(s)";
				   total+= "\nCoxinha: "+q05 +" unidade(s)";
				   total+= "\nHamburguer: "+q06 +" unidade(s)";
				   total+= "\nPão de queijo: "+q07 +" unidade(s)";
				   total+= "\n";
				   total+= "\nÁgua: "+q08 +" unidade(s)";
				   total+= "\nCafé: "+q09 +" unidade(s)";
				   total+= "\nCerveja: "+q10 +" unidade(s)";
				   total+= "\nEnergético: "+q11 +" unidade(s)";
				   total+= "\nRefrigerante: "+q12 +" unidade(s)";
				   total+= "\nAchocolatado: "+q13 +" unidade(s)";
				   total+= "\nSuco: "+q14 +" unidade(s)";
				   total+= "\n";
				   total+= "\nTotal da compra: R$ "+((q01*2)+(q02*8)+(q03*5)+(q04*8)+(q05*6)+(q06*18)+(q07*5)+(q08*4)+(q09*6)+(q10*10)+(q11*15)+(q12*7)+(q13*5)+(q14*7));
				   
				   JOptionPane.showMessageDialog(null, total);
				 
		 double valor;
				   
		  do {
					  
			 valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o pagamento:")); 
				  
		  if(valor < (q01*2)+(q02*8)+(q03*5)+(q04*8)+(q05*6)+(q06*18)+(q07*5)+(q08*4)+(q09*6)+(q10*10)+(q11*15)+(q12*7)+(q13*5)+(q14*7)) {
			  JOptionPane.showMessageDialog(null, "ERRO VALOR INSUFICIÊNTE!");
		  }
				   
		  }while(valor < (q01*2)+(q02*8)+(q03*5)+(q04*8)+(q05*6)+(q06*18)+(q07*5)+(q08*4)+(q09*6)+(q10*10)+(q11*15)+(q12*7)+(q13*5)+(q14*7));
		
		  double troco = ((valor) - (q01*2)+(q02*8)+(q03*5)+(q04*8)+(q05*6)+(q06*18)+(q07*5)+(q08*4)+(q09*6)+(q10*10)+(q11*15)+(q12*7)+(q13*5)+(q14*7));
		  
		  JOptionPane.showMessageDialog(null, "Seu troco é de R$ "+troco);
				   
			}
		});
				
		JLabel titulo = new JLabel();
		titulo.setBounds(120, 40, 800, 50);
		titulo.setText("BEM VINDO A RALF'S BAKERY!");
		titulo.setFont(new Font("Times New Roman", Font.PLAIN, 50));
				
		JLabel comidas = new JLabel();
		comidas.setBounds(130, 115, 150, 50);
		comidas.setText("COMIDAS");
		comidas.setFont(new Font("Times New Roman", Font.PLAIN, 30));
				
		JLabel bebidas = new JLabel();
		bebidas.setBounds(455, 115, 150, 50);
		bebidas.setText("BEBIDAS");
		bebidas.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		
		JLabel faleconosco = new JLabel();
		faleconosco.setBounds(190, 480, 200, 30);
		faleconosco.setText("Fale conosco!");
		faleconosco.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		
		JLabel nome = new JLabel();
		nome.setBounds(70, 530, 200, 30);
		nome.setText("Informe seu nome:");
		nome.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		JTextField campotxt = new JTextField();
		campotxt.setBounds(270, 530, 255, 30);
		
		JLabel dica = new JLabel();
		dica.setBounds(70, 570, 300, 30);
		dica.setText("O que podemos melhorar?");
		dica.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		JTextArea campo = new JTextArea();
				
		JScrollPane barraRolagem = new JScrollPane(campo);
		barraRolagem.setBounds(70 , 610, 455, 70);
		
		JButton enviar = new JButton();
		enviar.setText("Enviar suporte");
		enviar.setBounds(200, 700, 180, 30); 
		enviar.setFont(new Font("Arial", Font.PLAIN, 20));
				
		enviar.addActionListener(new ActionListener() {
					
			@Override
			public void actionPerformed(ActionEvent e) {
						
			String nome01 = campotxt.getText();
						
			JOptionPane.showMessageDialog(null, "Olá "+nome01 +"!" +"\nObrigado pelo apoio!");
						
			campotxt.setText("");
						
			campotxt.requestFocus();
			
			campo.setText("");
			
			}
		});

		formulario.add(titulo);
		formulario.add(comidas);
		formulario.add(bebidas);
		formulario.add(botao);
		formulario.add(Pão);
		formulario.add(Pizza);
		formulario.add(Pastel);
		formulario.add(Calzone);
		formulario.add(Coxinha);
		formulario.add(Hamburguer);
		formulario.add(Pãoqueijo);
		formulario.add(Água);
		formulario.add(Café);
		formulario.add(Cerveja);
		formulario.add(Energético);
		formulario.add(Refrigerante);
		formulario.add(Achocolatado);
		formulario.add(Suco);
		formulario.add(faleconosco);
		formulario.add(nome);
		formulario.add(campotxt);
		formulario.add(dica);
		formulario.add(barraRolagem);
		formulario.add(enviar);
		formulario.add(Pãopainel);
		formulario.add(Pizzapainel);
		formulario.add(Pastelpainel);
		formulario.add(Títulopainel);
		formulario.add(campopao);
				
		formulario.setVisible(true);
	}
}
