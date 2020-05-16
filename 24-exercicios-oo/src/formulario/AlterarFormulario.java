package formulario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import acao.acao;
import beans.Login;

import javax.swing.JScrollPane;
import javax.swing.JTable;

public class AlterarFormulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtSenha;
	private JTextField txtEmail;
	public static JTable table;

	/**
	 * Create the frame.
	 */
	public AlterarFormulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 200, 534, 591);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// INSTANCIAR AÇÃO
		acao a = new acao();
		
		JLabel lblNome = new JLabel("Nome de usu\u00E1rio:");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNome.setBounds(40, 80, 160, 23);
		contentPane.add(lblNome);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 17));
		lblSenha.setBounds(40, 114, 102, 27);
		contentPane.add(lblSenha);
		
		JLabel lblTipoUsurio = new JLabel("Tipo de usu\u00E1rio:");
		lblTipoUsurio.setFont(new Font("Arial", Font.PLAIN, 17));
		lblTipoUsurio.setBounds(40, 152, 140, 27);
		contentPane.add(lblTipoUsurio);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Arial", Font.PLAIN, 17));
		lblEmail.setBounds(40, 189, 102, 22);
		contentPane.add(lblEmail);
		
		txtNome = new JTextField();
		txtNome.setBounds(210, 80, 280, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtSenha = new JTextField();
		txtSenha.setColumns(10);
		txtSenha.setBounds(210, 116, 280, 20);
		contentPane.add(txtSenha);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(210, 192, 280, 20);
		contentPane.add(txtEmail);
		
		JComboBox cbxTipoUsuário = new JComboBox();
		cbxTipoUsuário.setBounds(210, 153, 280, 22);
		cbxTipoUsuário.addItem("Administrador");
		cbxTipoUsuário.addItem("Simples");
		cbxTipoUsuário.setEnabled(false);
		contentPane.add(cbxTipoUsuário);
		
		JLabel lblIndice = new JLabel("nada");
		lblIndice.setBounds(10, 11, 48, 14);
		contentPane.add(lblIndice);
		
		JButton btnCadastrar = new JButton("Alterar dados");
		btnCadastrar.setFont(new Font("Arial", Font.PLAIN, 17));
		btnCadastrar.setBackground(Color.LIGHT_GRAY);
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				// OBTER O INDICE A SER ALTERADO
				int indice = Integer.parseInt(lblIndice.getText());
				
				// INSTANCIAR UM OBJETO DA CLASSE Login
				Login l = new Login();
				l.setNome(txtNome.getText());
				l.setSenha(txtSenha.getText());
				l.setEmail(txtEmail.getText());
				
				// REALIZAR ALTERAÇÃO
				a.alterar(indice, l);	
				
				// ATUALIZAR TABELA
				table.setModel(a.selecionar());
				
				// LIMPAR OS CAMPOS
				txtNome.setText("");
				txtSenha.setText("");
				txtEmail.setText("");
				lblIndice.setText("");
				
				// CURSOR NO CAMPO NOME
				txtNome.requestFocus();
				
				// MENSAGEM
				JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso!");
			}
		});

		btnCadastrar.setBounds(142, 235, 225, 29);
		contentPane.add(btnCadastrar);
		
		JLabel lblClubXvidrosAnnimos = new JLabel("Club Xvidros  An\u00F4nimos");
		lblClubXvidrosAnnimos.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblClubXvidrosAnnimos.setBounds(132, 11, 251, 46);
		contentPane.add(lblClubXvidrosAnnimos);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 518, 64);
		contentPane.add(panel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 283, 498, 258);
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
				String senha = table.getValueAt(indice, 1).toString();			
				String tipo = table.getValueAt(indice, 2).toString();
				String email = table.getValueAt(indice, 3).toString();
				
				// ENVIANDO DADOS AO FORMULARIO	
				lblIndice.setText(String.valueOf(indice));
				txtNome.setText(nome);
				txtSenha.setText(String.valueOf(senha));
				txtEmail.setText(String.valueOf(email));
				
				switch(tipo) {
				case "Administrador":
					cbxTipoUsuário.setSelectedIndex(0);
				break;
				
				case "Simples":
					cbxTipoUsuário.setSelectedIndex(1);
				}
			}			
		});
	}
}
