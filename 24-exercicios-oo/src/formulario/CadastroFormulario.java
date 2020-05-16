package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import acao.acao;
import beans.Login;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class CadastroFormulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtSenha;
	private JTextField txtEmail;
	
	/**
	 * Create the frame.
	 */
	public CadastroFormulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 200, 534, 327);
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
		contentPane.add(cbxTipoUsuário);
		
		JButton btnCadastrar = new JButton("Cadastrar novo usu\u00E1rio");
		btnCadastrar.setFont(new Font("Arial", Font.PLAIN, 17));
		btnCadastrar.setBackground(Color.LIGHT_GRAY);
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				try {
				// CRIAR OBJETO DA CLASSE logins
				Login l = new Login();
				l.setNome(txtNome.getText());
				l.setSenha(txtSenha.getText());
				l.setEmail(txtEmail.getText());
				l.setTipo(cbxTipoUsuário.getSelectedItem().toString());
			
				// CADASTRAR
				a.cadastrar(l);
				
				// ATUALIZAR TABELA
				AlterarFormulario.table.setModel(a.selecionar());
				
					JOptionPane.showMessageDialog(null, "Novo usuário cadastrado com sucesso");
				}catch(Exception erro) {
					JOptionPane.showMessageDialog(null, "Erro, tente novamente");
				}
			
				// LIMPAR OS CAMPOS
				txtNome.setText("");
				txtSenha.setText("");
				txtEmail.setText("");
				cbxTipoUsuário.setSelectedItem(0);
				
				// DEIXAR CURSOR NO CAMPO SELECIONADO
				txtNome.requestFocus();
			
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
	}
}
