package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Principal.Principal;
import acao.acao;
import beans.Jogo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FormularioPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtClassificacao;
	private JTextField txtValor;
	private JTable table;

	/**
	 * Create the frame.
	 */
	public FormularioPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 539);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// INSTANCIAR UM OBJETO DA CLASSE acao
		acao a = new acao();
		
		JLabel lblNomeDoJogo = new JLabel("Nome do jogo");
		lblNomeDoJogo.setBounds(10, 45, 90, 23);
		contentPane.add(lblNomeDoJogo);
		
		txtNome = new JTextField();
		txtNome.setBounds(110, 46, 314, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblPlataforma = new JLabel("G\u00EAnero");
		lblPlataforma.setBounds(10, 82, 90, 23);
		contentPane.add(lblPlataforma);
		
		JLabel lblPlataforma_1 = new JLabel("Plataforma");
		lblPlataforma_1.setBounds(10, 116, 90, 23);
		contentPane.add(lblPlataforma_1);
		
		JLabel lblClassificao = new JLabel("Classifica\u00E7\u00E3o");
		lblClassificao.setBounds(10, 150, 90, 23);
		contentPane.add(lblClassificao);
		
		JLabel lblVak = new JLabel("Valor");
		lblVak.setBounds(10, 181, 76, 23);
		contentPane.add(lblVak);
		
		JComboBox cbxGenero = new JComboBox();
		cbxGenero.addItem("Ação");
		cbxGenero.addItem("Aventura");
		cbxGenero.addItem("Suspense");
		cbxGenero.setBounds(110, 83, 314, 22);
		contentPane.add(cbxGenero);
		
		JComboBox cbxPlataforma = new JComboBox();
		cbxPlataforma.addItem("Xbox One");
		cbxPlataforma.addItem("Playstation 4");
		cbxPlataforma.addItem("PC");
		cbxPlataforma.setBounds(110, 116, 314, 22);
		contentPane.add(cbxPlataforma);
		
		txtClassificacao = new JTextField();
		txtClassificacao.setColumns(10);
		txtClassificacao.setBounds(110, 151, 314, 20);
		contentPane.add(txtClassificacao);
		
		txtValor = new JTextField();
		txtValor.setColumns(10);
		txtValor.setBounds(110, 182, 314, 20);
		contentPane.add(txtValor);
		
		
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			// CRIAR UM OBJETO DA CLASSE Jogo
			try {
				
				Jogo j = new Jogo();
				j.setNome(txtNome.getText());
				j.setGenero(cbxGenero.getSelectedItem().toString());
				j.setPlataforma(cbxPlataforma.getSelectedItem().toString());
				j.setClassificacao(Integer.parseInt(txtClassificacao.getText()));
				j.setValor(Double.parseDouble(txtValor.getText()));
				
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
				cbxPlataforma.setSelectedIndex(0);
				cbxGenero.setSelectedIndex(0);
				txtClassificacao.setText("");
				txtValor.setText("");
				
				// CURSOR NO CAMPO NOME DO JOGO
				txtNome.requestFocus();
			
			}
		});
		
		btnCadastrar.setBounds(10, 215, 105, 28);
		contentPane.add(btnCadastrar);
		
		JLabel lblIndice = new JLabel("ALO ");
		lblIndice.setBounds(10, 11, 48, 14);
		lblIndice.setVisible(false);
		contentPane.add(lblIndice);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// OBETER O INDICE
				int indice = Integer.parseInt(lblIndice.getText());
				
				// CHAMAR O MÉTODO DE EXCLUSÃO
				a.excluir(indice);
				
				// ATUALIZAR TABELA
				table.setModel(a.selecionar());
				
				// LIMPAR OS CAMPOS
				txtNome.setText("");
				cbxGenero.setSelectedIndex(0);
				cbxPlataforma.setSelectedIndex(0);
				txtClassificacao.setText("");
				txtValor.setText("");
				lblIndice.setText("");
				
				// CURSOR NO CAMPO NOME
				txtNome.requestFocus();
				
				// MENSAGEM
				JOptionPane.showMessageDialog(null, "Jogo excluido com sucesso!");
			}
		});
		btnExcluir.setEnabled(false);
		btnExcluir.setBounds(292, 215, 105, 28);
		contentPane.add(btnExcluir);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// OBTER O INDICE A SER ALTERADO
				int indice = Integer.parseInt(lblIndice.getText());
				
				// INSTANCIAR UM OBJETO DA CLASSE Jogo
				Jogo j = new Jogo();
				j.setNome(txtNome.getText());
				j.setGenero(cbxGenero.getSelectedItem().toString());
				j.setPlataforma(cbxPlataforma.getSelectedItem().toString());
				j.setClassificacao(Integer.parseInt(txtClassificacao.getText()));
				j.setValor(Double.parseDouble(txtValor.getText()));
				
				// REALIZAR ALTERAÇÃO
				a.alterar(indice, j);	
				
				// ATUALIZAR TABELA
				table.setModel(a.selecionar());
				
				// LIMPAR OS CAMPOS
				txtNome.setText("");
				cbxGenero.setSelectedIndex(0);
				cbxPlataforma.setSelectedIndex(0);
				txtClassificacao.setText("");
				txtValor.setText("");
				lblIndice.setText("");
				
				// ATIVAR BOTÃO CADASTRAR E DESABILITAR OS DEMAIS
				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
				
				// CURSOR NO CAMPO NOME
				txtNome.requestFocus();
				
				// MENSAGEM
				JOptionPane.showMessageDialog(null, "Jogo alterado com sucesso!");
			}
		});
		
		btnAlterar.setEnabled(false);
		btnAlterar.setBounds(150, 215, 105, 28);
		contentPane.add(btnAlterar);		
		
		JScrollPane scrollPane = new JScrollPane();
		
		scrollPane.setBounds(10, 254, 414, 235);
		contentPane.add(scrollPane);
		
		table = new JTable(a.selecionar());
		scrollPane.setViewportView(table);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				
				// OBTER O ÍNDICE SELECIONADO
				int indice = table.getSelectedRow();
				
				// OBETENDO OS DADOS DE CADA COLUNA
				String nome = table.getValueAt(indice, 0).toString();
				String genero = table.getValueAt(indice, 1).toString();
				String plataforma = table.getValueAt(indice, 2).toString();
				int classificacao = Integer.parseInt(table.getValueAt(indice, 3).toString());
				double valor = Double.parseDouble(table.getValueAt(indice, 4).toString());
				
				// ENVIANDO DADOS AO FORMULARIO	
				lblIndice.setText(String.valueOf(indice));
				txtNome.setText(nome);
				txtClassificacao.setText(String.valueOf(classificacao));
				txtValor.setText(String.valueOf(valor));		
				
				switch(genero) {
				case "Ação":
					cbxGenero.setSelectedIndex(0);
				break;
				
				case "Aventura":
					cbxGenero.setSelectedIndex(1);
				break;
				
				case "Suspense":
					cbxGenero.setSelectedIndex(2);
				break;
				}
				
				switch(plataforma) {
				case "Xbox One":
					cbxPlataforma.setSelectedIndex(0);
				break;
				
				case "Playstation 4":
					cbxPlataforma.setSelectedIndex(1);
				break;
				
				case "PC":
					cbxPlataforma.setSelectedIndex(2);
				break;
				}
				
				// ATIVAR BOTÕES DE ALTERAR E EXCLUIR E DESATIVAR O BOTÃO CADASTRAR
				btnCadastrar.setEnabled(false);
				btnAlterar.setEnabled(true);
				btnExcluir.setEnabled(true);
			}			
		});
	}
}
