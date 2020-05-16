package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.acao;
import beans.Login;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;

public class LoginFormulario extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the frame.
	 */
	public LoginFormulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 200, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBemVindoAo = new JLabel("Bem Vindo ao Club Xvidros  An\u00F4nimos!");
		lblBemVindoAo.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblBemVindoAo.setBounds(23, 10, 415, 45);
		contentPane.add(lblBemVindoAo);
		
		JLabel lblNomeDeUsurio = new JLabel("Nome de usu\u00E1rio:");
		lblNomeDeUsurio.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNomeDeUsurio.setBounds(20, 100, 155, 30);
		contentPane.add(lblNomeDeUsurio);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 17));
		lblSenha.setBounds(20, 140, 125, 30);
		contentPane.add(lblSenha);
		
		textField = new JTextField();
		textField.setBounds(162, 107, 246, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(162, 147, 246, 20);
		contentPane.add(textField_1);		
		
		JButton btnEntar = new JButton("Entrar");
		btnEntar.setBackground(Color.LIGHT_GRAY);
		btnEntar.setFont(new Font("Arial", Font.PLAIN, 17));
		btnEntar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				boolean existe = a.logar(txt)
				
				if(existe == false) {
					JOptionPane.showMessageDialog(null, "Usuáios ou senhas incorretos");
				
					// INSTANCIAR UM FORMULARIO CADASTRO DE USUÁRIO
					CadastroFormulario frame2 = new CadastroFormulario();
					frame2.setVisible(true);
							
					// INSTANCIAR UM FORMULARIO ALTERAR 
					AlterarFormulario frame3 = new AlterarFormulario();
					frame3.setVisible(true);
				
				}else {
					Usuaio u = a.obterDados(txtUsuario.getText(), txtSenha.getText());
					
					// INSTANCIAR UM FORMULARIO ALTERAR 
					AlterarFormulario frame3 = new AlterarFormulario();
					frame3.setVisible(true);
				}
				
			}
		});
		btnEntar.setBounds(150, 208, 125, 30);
		contentPane.add(btnEntar);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 434, 63);
		contentPane.add(panel);
	}
}
