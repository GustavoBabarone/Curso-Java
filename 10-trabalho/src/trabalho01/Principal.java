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

		JPanel T�tulopainel = new JPanel();
		T�tulopainel.setBounds(0, 0, 1000, 110);
		T�tulopainel.setBackground(new Color(196, 165, 92));
		T�tulopainel.setVisible(true);
				
		JButton P�o = new JButton();
		P�o.setText("P�o  R$ 2,00");
		P�o.setBounds(70, 170, 250, 30); 
		P�o.setFont(new Font("Arial", Font.PLAIN, 20));
		
		JPanel P�opainel = new JPanel();
		P�opainel.setBounds(690, 220, 250, 225);
		P�opainel.setBackground(new Color(196, 165, 92));
		P�opainel.setVisible(false);
		
		JLabel rotulopao = new JLabel();
		rotulopao.setBounds(40, 40, 80, 20);
		rotulopao.setText("Informe a quantidade de p�o:");
		rotulopao.setFont(new Font("Arial", Font.PLAIN, 18));
		P�opainel.add(rotulopao);
		
		JTextField campopao = new JTextField();
		campopao.setBounds(700, 250, 230, 20);
		campopao.setVisible(false);
		P�opainel.add(campopao);
		
		P�o.addActionListener(new ActionListener() {
					
			@Override
			public void actionPerformed(ActionEvent e) {
				P�opainel.setVisible(true);
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
				P�opainel.setVisible(false);
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
				
		JButton P�oqueijo = new JButton();
		P�oqueijo.setText("P�o de queijo  R$ 5,00");
		P�oqueijo.setBounds(70, 410, 250, 30); 
		P�oqueijo.setFont(new Font("Arial", Font.PLAIN, 20));
		
		P�oqueijo.addActionListener(new ActionListener() {
							
		@Override
		public void actionPerformed(ActionEvent e) {
								
			q07 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade:"));
						   
			}
		});
				
		JButton �gua = new JButton();
		�gua.setText("�gua  R$ 4,00");
		�gua.setBounds(390, 170, 250, 30); 
		�gua.setFont(new Font("Arial", Font.PLAIN, 20));
		
		�gua.addActionListener(new ActionListener() {
							
		@Override
		public void actionPerformed(ActionEvent e) {
								
			q08 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade:"));
						   
			}
		});
				
		JButton Caf� = new JButton();
		Caf�.setText("Caf�  R$ 6,00");
		Caf�.setBounds(390, 210, 250, 30); 
		Caf�.setFont(new Font("Arial", Font.PLAIN, 20));
		
		Caf�.addActionListener(new ActionListener() {
									
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
				
		JButton Energ�tico = new JButton();
		Energ�tico.setText("Energ�tico  R$ 15,00");
		Energ�tico.setBounds(390, 290, 250, 30); 
		Energ�tico.setFont(new Font("Arial", Font.PLAIN, 20));
		
		Energ�tico.addActionListener(new ActionListener() {
									
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
						
			String total = "" /*+nome*/ +", Seu pedido �:";
				   total+= "\n";
				   total+= "\nP�o: "+q01 +" unidade(s)";
				   total+= "\nPizza: "+q02 +" unidade(s)";
				   total+= "\nPastel: "+q03 +" unidade(s)";
				   total+= "\nCalzone: "+q04 +" unidade(s)";
				   total+= "\nCoxinha: "+q05 +" unidade(s)";
				   total+= "\nHamburguer: "+q06 +" unidade(s)";
				   total+= "\nP�o de queijo: "+q07 +" unidade(s)";
				   total+= "\n";
				   total+= "\n�gua: "+q08 +" unidade(s)";
				   total+= "\nCaf�: "+q09 +" unidade(s)";
				   total+= "\nCerveja: "+q10 +" unidade(s)";
				   total+= "\nEnerg�tico: "+q11 +" unidade(s)";
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
			  JOptionPane.showMessageDialog(null, "ERRO VALOR INSUFICI�NTE!");
		  }
				   
		  }while(valor < (q01*2)+(q02*8)+(q03*5)+(q04*8)+(q05*6)+(q06*18)+(q07*5)+(q08*4)+(q09*6)+(q10*10)+(q11*15)+(q12*7)+(q13*5)+(q14*7));
		
		  double troco = ((valor) - (q01*2)+(q02*8)+(q03*5)+(q04*8)+(q05*6)+(q06*18)+(q07*5)+(q08*4)+(q09*6)+(q10*10)+(q11*15)+(q12*7)+(q13*5)+(q14*7));
		  
		  JOptionPane.showMessageDialog(null, "Seu troco � de R$ "+troco);
				   
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
						
			JOptionPane.showMessageDialog(null, "Ol� "+nome01 +"!" +"\nObrigado pelo apoio!");
						
			campotxt.setText("");
						
			campotxt.requestFocus();
			
			campo.setText("");
			
			}
		});

		formulario.add(titulo);
		formulario.add(comidas);
		formulario.add(bebidas);
		formulario.add(botao);
		formulario.add(P�o);
		formulario.add(Pizza);
		formulario.add(Pastel);
		formulario.add(Calzone);
		formulario.add(Coxinha);
		formulario.add(Hamburguer);
		formulario.add(P�oqueijo);
		formulario.add(�gua);
		formulario.add(Caf�);
		formulario.add(Cerveja);
		formulario.add(Energ�tico);
		formulario.add(Refrigerante);
		formulario.add(Achocolatado);
		formulario.add(Suco);
		formulario.add(faleconosco);
		formulario.add(nome);
		formulario.add(campotxt);
		formulario.add(dica);
		formulario.add(barraRolagem);
		formulario.add(enviar);
		formulario.add(P�opainel);
		formulario.add(Pizzapainel);
		formulario.add(Pastelpainel);
		formulario.add(T�tulopainel);
		formulario.add(campopao);
				
		formulario.setVisible(true);
	}
}
