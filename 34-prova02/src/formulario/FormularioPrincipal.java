package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.acao;
import beans.Produtos;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Color;

public class FormularioPrincipal extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Create the frame.
	 */
	public FormularioPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 456, 657);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// CHAMAR acao
		acao a = new acao();
		
		JLabel lblIndice = new JLabel("0");
		
		JLabel lblArroz = new JLabel("Arroz");
		lblArroz.setFont(new Font("Arial", Font.PLAIN, 15));
		lblArroz.setBounds(34, 88, 59, 28);
		contentPane.add(lblArroz);
		
		JLabel lblFeijo = new JLabel("Feij\u00E3o");
		lblFeijo.setFont(new Font("Arial", Font.PLAIN, 15));
		lblFeijo.setBounds(148, 88, 59, 28);
		contentPane.add(lblFeijo);
		
		JLabel lblBatata = new JLabel("Batata");
		lblBatata.setFont(new Font("Arial", Font.PLAIN, 15));
		lblBatata.setBounds(254, 88, 59, 28);
		contentPane.add(lblBatata);
		
		JLabel lblPo = new JLabel("P\u00E3o");
		lblPo.setFont(new Font("Arial", Font.PLAIN, 15));
		lblPo.setBounds(365, 88, 39, 28);
		contentPane.add(lblPo);
		
		JLabel lblCarne = new JLabel("Carne");
		lblCarne.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCarne.setBounds(34, 195, 59, 28);
		contentPane.add(lblCarne);
		
		JLabel lblBanana = new JLabel("Banana");
		lblBanana.setFont(new Font("Arial", Font.PLAIN, 15));
		lblBanana.setBounds(148, 195, 59, 28);
		contentPane.add(lblBanana);
		
		JLabel lblMa = new JLabel("Ma\u00E7\u00E3");
		lblMa.setFont(new Font("Arial", Font.PLAIN, 15));
		lblMa.setBounds(254, 195, 59, 28);
		contentPane.add(lblMa);
		
		JLabel lblMelancia = new JLabel("Melancia");
		lblMelancia.setFont(new Font("Arial", Font.PLAIN, 15));
		lblMelancia.setBounds(358, 195, 59, 28);
		contentPane.add(lblMelancia);
		
		JButton btnArrozSomar = new JButton("+");
		btnArrozSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				// OBTER INDICE
				int indice = Integer.parseInt(lblIndice.getText());
				
				// CRIAR UM OBJETO DA CLASSE Produtos
				Produtos p = new Produtos();
				p.setProduto("Arroz");
				p.setQuantidade(Integer.parseInt("1"));
				
				// SOMAR QUANTIDADE
				a.somar(indice, p);
				
				// ATUALIZAR TABELA
				table.setModel(a.selecionar());
			
			}
		});
		btnArrozSomar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnArrozSomar.setBounds(10, 127, 89, 23);
		
		JButton btnFeijaoSomar = new JButton("+");
		btnFeijaoSomar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnFeijaoSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				// OBTER INDICE
				int indice = Integer.parseInt(lblIndice.getText());
				
				// CRIAR UM OBJETO DA CLASSE Produtos
				Produtos p = new Produtos();
				p.setProduto("Feijão");
				p.setQuantidade(Integer.parseInt("1"));
				
				// SOMAR QUANTIDADE
				a.somar(indice, p);
				
				// ATUALIZAR TABELA
				table.setModel(a.selecionar());
			
			}
		});
		btnFeijaoSomar.setBounds(125, 127, 89, 23);
		contentPane.add(btnFeijaoSomar);
		
		JButton btnBatataSomar = new JButton("+");
		btnBatataSomar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBatataSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				// OBTER INDICE
				int indice = Integer.parseInt(lblIndice.getText());
				
				// CRIAR UM OBJETO DA CLASSE Produtos
				Produtos p = new Produtos();
				p.setProduto("Batata");
				p.setQuantidade(Integer.parseInt("1"));
				
				// SOMAR QUANTIDADE
				a.somar(indice, p);
				
				// ATUALIZAR TABELA
				table.setModel(a.selecionar());
			
			}
		});
		btnBatataSomar.setBounds(234, 127, 89, 23);
		contentPane.add(btnBatataSomar);
		
		JButton btnPaoSomar = new JButton("+");
		btnPaoSomar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnPaoSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				// OBTER INDICE
				int indice = Integer.parseInt(lblIndice.getText());
				
				// CRIAR UM OBJETO DA CLASSE Produtos
				Produtos p = new Produtos();
				p.setProduto("Pão");
				p.setQuantidade(Integer.parseInt("1"));
				
				// SOMAR QUANTIDADE
				a.somar(indice, p);
				
				// ATUALIZAR TABELA
				table.setModel(a.selecionar());
			
			}
		});
		btnPaoSomar.setBounds(342, 127, 89, 23);
		contentPane.add(btnPaoSomar);
		
		JButton btnCarneSomar = new JButton("+");
		btnCarneSomar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCarneSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				// OBTER INDICE
				int indice = Integer.parseInt(lblIndice.getText());
				
				// CRIAR UM OBJETO DA CLASSE Produtos
				Produtos p = new Produtos();
				p.setProduto("Carne");
				p.setQuantidade(Integer.parseInt("1"));
				
				// SOMAR QUANTIDADE
				a.somar(indice, p);
				
				// ATUALIZAR TABELA
				table.setModel(a.selecionar());
			
			}
		});
		btnCarneSomar.setBounds(10, 234, 89, 23);
		contentPane.add(btnCarneSomar);
		
		JButton btnBananaSomar = new JButton("+");
		btnBananaSomar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBananaSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				// OBTER INDICE
				int indice = Integer.parseInt(lblIndice.getText());
				
				// CRIAR UM OBJETO DA CLASSE Produtos
				Produtos p = new Produtos();
				p.setProduto("Banana");
				p.setQuantidade(Integer.parseInt("1"));
				
				// SOMAR QUANTIDADE
				a.somar(indice, p);
				
				// ATUALIZAR TABELA
				table.setModel(a.selecionar());
			
			}
		});
		btnBananaSomar.setBounds(125, 234, 89, 23);
		contentPane.add(btnBananaSomar);
		
		JButton btnMacaSomar = new JButton("+");
		btnMacaSomar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnMacaSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				// OBTER INDICE
				int indice = Integer.parseInt(lblIndice.getText());
				
				// CRIAR UM OBJETO DA CLASSE Produtos
				Produtos p = new Produtos();
				p.setProduto("Maçã");
				p.setQuantidade(Integer.parseInt("1"));
				
				// SOMAR QUANTIDADE
				a.somar(indice, p);
				
				// ATUALIZAR TABELA
				table.setModel(a.selecionar());
				
			}
		});
		btnMacaSomar.setBounds(234, 234, 89, 23);
		contentPane.add(btnMacaSomar);
		
		JButton btnMelanciaSomar = new JButton("+");
		btnMelanciaSomar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnMelanciaSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				// OBTER INDICE
				int indice = Integer.parseInt(lblIndice.getText());
				
				// CRIAR UM OBJETO DA CLASSE Produtos
				Produtos p = new Produtos();
				p.setProduto("Melancia");
				p.setQuantidade(Integer.parseInt("1"));
				
				// SOMAR QUANTIDADE
				a.somar(indice, p);
				
				// ATUALIZAR TABELA
				table.setModel(a.selecionar());
			
			}
		});
		btnMelanciaSomar.setBounds(342, 234, 89, 23);
		contentPane.add(btnMelanciaSomar);
		
		JButton btnArrozSubtrair = new JButton("-");
		btnArrozSubtrair.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnArrozSubtrair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				// OBTER INDICE
				int indice = Integer.parseInt(lblIndice.getText());
				
				// CRIAR UM OBJETO DA CLASSE Produtos
				Produtos p = new Produtos();
				p.setProduto("Arroz");
				p.setQuantidade(Integer.parseInt("-1"));
				
				// SOMAR QUANTIDADE
				a.subtrair(indice, p);
				
				// ATUALIZAR TABELA
				table.setModel(a.selecionar());
					
			}
		});
		btnArrozSubtrair.setBounds(10, 161, 89, 23);
		contentPane.add(btnArrozSubtrair);
		
		JButton btnFeijaoSubtrair = new JButton("-");
		btnFeijaoSubtrair.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnFeijaoSubtrair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				// OBTER INDICE
				int indice = Integer.parseInt(lblIndice.getText());
				
				// CRIAR UM OBJETO DA CLASSE Produtos
				Produtos p = new Produtos();
				p.setProduto("Feijão");
				p.setQuantidade(Integer.parseInt("-1"));
				
				// SOMAR QUANTIDADE
				a.subtrair(indice, p);
				
				// ATUALIZAR TABELA
				table.setModel(a.selecionar());
			
			}
		});
		btnFeijaoSubtrair.setBounds(125, 161, 89, 23);
		contentPane.add(btnFeijaoSubtrair);
		
		JButton btnBatataSubtrair = new JButton("-");
		btnBatataSubtrair.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBatataSubtrair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				// OBTER INDICE
				int indice = Integer.parseInt(lblIndice.getText());
				
				// CRIAR UM OBJETO DA CLASSE Produtos
				Produtos p = new Produtos();
				p.setProduto("Batata");
				p.setQuantidade(Integer.parseInt("-1"));
				
				// SOMAR QUANTIDADE
				a.subtrair(indice, p);
				
				// ATUALIZAR TABELA
				table.setModel(a.selecionar());
			
			}
		});
		
		btnBatataSubtrair.setBounds(234, 161, 89, 23);
		contentPane.add(btnBatataSubtrair);
		
		JButton btnPaoSubtrair = new JButton("-");
		btnPaoSubtrair.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnPaoSubtrair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				// OBTER INDICE
				int indice = Integer.parseInt(lblIndice.getText());
				
				// CRIAR UM OBJETO DA CLASSE Produtos
				Produtos p = new Produtos();
				p.setProduto("Pão");
				p.setQuantidade(Integer.parseInt("-1"));
				
				// SOMAR QUANTIDADE
				a.subtrair(indice, p);
				
				// ATUALIZAR TABELA
				table.setModel(a.selecionar());
			
			}
		});
		btnPaoSubtrair.setBounds(342, 161, 89, 23);
		contentPane.add(btnPaoSubtrair);
		
		JButton btnCarneSubtrair = new JButton("-");
		btnCarneSubtrair.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCarneSubtrair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				// OBTER INDICE
				int indice = Integer.parseInt(lblIndice.getText());
				
				// CRIAR UM OBJETO DA CLASSE Produtos
				Produtos p = new Produtos();
				p.setProduto("Carne");
				p.setQuantidade(Integer.parseInt("-1"));
				
				// SOMAR QUANTIDADE
				a.subtrair(indice, p);
				
				// ATUALIZAR TABELA
				table.setModel(a.selecionar());
			
			}
		});
		btnCarneSubtrair.setBounds(10, 268, 89, 23);
		contentPane.add(btnCarneSubtrair);
		
		JButton btnBananaSubtrair = new JButton("-");
		btnBananaSubtrair.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBananaSubtrair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				// OBTER INDICE
				int indice = Integer.parseInt(lblIndice.getText());
				
				// CRIAR UM OBJETO DA CLASSE Produtos
				Produtos p = new Produtos();
				p.setProduto("Banana");
				p.setQuantidade(Integer.parseInt("-1"));
				
				// SOMAR QUANTIDADE
				a.subtrair(indice, p);
				
				// ATUALIZAR TABELA
				table.setModel(a.selecionar());
			
			}
		});
		btnBananaSubtrair.setBounds(125, 268, 89, 23);
		contentPane.add(btnBananaSubtrair);
		
		JButton btnMacaSubtrair = new JButton("-");
		btnMacaSubtrair.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnMacaSubtrair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				// OBTER INDICE
				int indice = Integer.parseInt(lblIndice.getText());
				
				// CRIAR UM OBJETO DA CLASSE Produtos
				Produtos p = new Produtos();
				p.setProduto("Maçã");
				p.setQuantidade(Integer.parseInt("-1"));
				
				// SOMAR QUANTIDADE
				a.subtrair(indice, p);
				
				// ATUALIZAR TABELA
				table.setModel(a.selecionar());
			
			}
		});
		btnMacaSubtrair.setBounds(234, 268, 89, 23);
		contentPane.add(btnMacaSubtrair);
		
		JButton btnMelanciaSubtrair = new JButton("-");
		btnMelanciaSubtrair.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnMelanciaSubtrair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				// OBTER INDICE
				int indice = Integer.parseInt(lblIndice.getText());
				
				// CRIAR UM OBJETO DA CLASSE Produtos
				Produtos p = new Produtos();
				p.setProduto("Melancia");
				p.setQuantidade(Integer.parseInt("-1"));
				
				// SOMAR QUANTIDADE
				a.subtrair(indice, p);
				
				// ATUALIZAR TABELA
				table.setModel(a.selecionar());
			
			}
		});
		btnMelanciaSubtrair.setBounds(342, 268, 89, 23);
		contentPane.add(btnMelanciaSubtrair);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 321, 421, 286);
		contentPane.add(scrollPane);
		
		table = new JTable(a.selecionar());
		table.setEnabled(false);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}			
		});
		scrollPane.setViewportView(table);
		
		JLabel lblMercadoDoRalf = new JLabel("MERCAD\u00C3O DO RALF");
		lblMercadoDoRalf.setFont(new Font("Arial", Font.PLAIN, 25));
		lblMercadoDoRalf.setBounds(91, 11, 273, 66);
		contentPane.add(lblMercadoDoRalf);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setForeground(Color.ORANGE);
		panel.setBounds(0, 0, 441, 71);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.ORANGE);
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(0, 88, 441, 28);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(Color.ORANGE);
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(0, 195, 441, 28);
		contentPane.add(panel_2);
		
		contentPane.add(btnArrozSomar);
		
		
		lblIndice.setBounds(468, 195, 48, 14);
		contentPane.add(lblIndice);
	}
}
