package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Beans.Produto;
import acao.acao;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class FormularioPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField txtQuantidade;
	private JTextField txtValor;
	private JTextField txtNome;
	private JTable table;
	private JButton btnMostrar;

	/**
	 * Create the frame.
	 */
	public FormularioPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// INSTANCIAR UM OBJETO DA CLASSE acao
		acao a = new acao();
		
		JLabel lblNome = new JLabel("Nome do produto:");
		lblNome.setBounds(10, 11, 106, 14);
		contentPane.add(lblNome);
		
		JLabel lblValor = new JLabel("Valor do produto:");
		lblValor.setBounds(10, 36, 106, 14);
		contentPane.add(lblValor);
		
		JLabel lblQuantidade = new JLabel("Quantidade em estoque:");
		lblQuantidade.setBounds(10, 61, 156, 14);
		contentPane.add(lblQuantidade);
		
		txtQuantidade = new JTextField();
		txtQuantidade.setBounds(164, 58, 260, 20);
		contentPane.add(txtQuantidade);
		txtQuantidade.setColumns(10);
		
		txtValor = new JTextField();
		txtValor.setColumns(10);
		txtValor.setBounds(164, 33, 260, 20);
		contentPane.add(txtValor);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(164, 8, 260, 20);
		contentPane.add(txtNome);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				// CRIAR UM OBJETO DA CLASSE Produto
				try {
					
					Produto j = new Produto();
					j.setNome(txtNome.getText());
					j.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
					j.setValor(Double.parseDouble(txtValor.getText()));
					
					// OBTER DATA E HORA COMPLETA
					LocalDateTime tempo = LocalDateTime.now();
					
					// OBTER DIA-MÊS-ANO & HORA-MIN
					int dia = tempo.getDayOfMonth();
					int mes = tempo.getMonthValue();
					int ano = tempo.getYear();
					int hora = tempo.getHour();
					int min = tempo.getMinute();
					
					j.setData(dia+"/"+mes+"/"+ano);
					j.setHora(hora+":"+min);
					
					//REALIZAR O CADASTRO
					a.cadastrar(j);
					
					// ATUALIZAR A TABELA
					table.setModel(a.selecionar());
					
					// MENSAGEM
					JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
				}catch(Exception erro) {
					JOptionPane.showMessageDialog(null, "Falha ao cadastrar, tente novamente");
				}						
					
					// LIMPAR OS CAMPOS
					txtNome.setText("");
					txtQuantidade.setText("");
					txtValor.setText("");
					
					// CURSOR NO CAMPO NOME DO JOGO
					txtNome.requestFocus();											
			}
		});
		btnCadastrar.setBounds(62, 99, 106, 23);
		contentPane.add(btnCadastrar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 145, 414, 228);
		contentPane.add(scrollPane);
		scrollPane.setVisible(false);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			scrollPane.setVisible(true);
				
			}
		});
		
		btnMostrar.setBounds(244, 99, 106, 23);
		contentPane.add(btnMostrar);
	}
}
