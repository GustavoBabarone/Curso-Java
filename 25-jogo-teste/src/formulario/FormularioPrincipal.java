package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.acao;
import beans.Jogo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
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
		setBounds(100, 100, 450, 577);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// INSTANCIAR
		acao a = new acao();
		
		JLabel lblNome = new JLabel("Nome do Jogo:");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNome.setBounds(10, 29, 95, 29);
		contentPane.add(lblNome);
		
		JLabel lblGenero = new JLabel("G\u00EAnero:");
		lblGenero.setFont(new Font("Arial", Font.PLAIN, 12));
		lblGenero.setBounds(10, 69, 95, 29);
		contentPane.add(lblGenero);
		
		JLabel lblPlataforma = new JLabel("Plataforma:");
		lblPlataforma.setFont(new Font("Arial", Font.PLAIN, 12));
		lblPlataforma.setBounds(10, 109, 95, 29);
		contentPane.add(lblPlataforma);
		
		JLabel lblClassificao = new JLabel("Classifica\u00E7\u00E3o:");
		lblClassificao.setFont(new Font("Arial", Font.PLAIN, 12));
		lblClassificao.setBounds(10, 149, 95, 29);
		contentPane.add(lblClassificao);
		
		JLabel lblValor = new JLabel("Valor:");
		lblValor.setFont(new Font("Arial", Font.PLAIN, 12));
		lblValor.setBounds(10, 189, 95, 29);
		contentPane.add(lblValor);
		
		txtNome = new JTextField();
		txtNome.setBounds(133, 33, 291, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtClassificacao = new JTextField();
		txtClassificacao.setColumns(10);
		txtClassificacao.setBounds(133, 153, 291, 20);
		contentPane.add(txtClassificacao);
		
		txtValor = new JTextField();
		txtValor.setColumns(10);
		txtValor.setBounds(133, 193, 291, 20);
		contentPane.add(txtValor);
		
		JComboBox cbxGenero = new JComboBox();
		cbxGenero.setBounds(133, 72, 291, 20);
		contentPane.add(cbxGenero);
		cbxGenero.addItem("Ação");
		cbxGenero.addItem("Suspense");
		cbxGenero.addItem("Aventura");
		
		JComboBox cbxPlataforma = new JComboBox();
		cbxPlataforma.setBounds(133, 112, 291, 20);
		contentPane.add(cbxPlataforma);
		cbxPlataforma.addItem("Playstation 4");
		cbxPlataforma.addItem("Xbox One");
		cbxPlataforma.addItem("PC");
		
		JLabel lblIndice = new JLabel("nada");
		lblIndice.setBounds(0, 0, 48, 14);
		contentPane.add(lblIndice);
	
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			//INSTANCIAR OBEJETO DA CLASSE Jogo
				try {
					
					Jogo j = new Jogo();
					j.setNome(txtNome.getText());
					j.setGenero(cbxGenero.getSelectedItem().toString());
					j.setPlataforma(cbxPlataforma.getSelectedItem().toString());
					j.setClassificacao(Integer.parseInt(txtClassificacao.getText()));
					j.setValor(Double.parseDouble(txtValor.getText()));
					
				// REALIZAR CADASTRO
					a.cadastrar(j);
					
					// ATUALIZAR TABELA
					table.setModel(a.selecionar());
					
					JOptionPane.showMessageDialog(null, "JOGO CADASTRADO");				
				}catch(Exception erro){
					JOptionPane.showMessageDialog(null, "ERRO TENTE NOVAMENTE");
				}
			
				// LIMPAR OS CAMPOS
				txtNome.setText("");
				cbxGenero.setSelectedItem(0);
				cbxPlataforma.setSelectedItem(0);
				txtClassificacao.setText("");
				txtValor.setText("");
				
				// DEIXAR CURSOR NO LOCAL SELECIONADO
				txtNome.requestFocus();
				
			}
		});
		btnCadastrar.setBounds(28, 249, 95, 37);
		contentPane.add(btnCadastrar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 310, 414, 217);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
			
				//
			
			}
		});
		scrollPane.setViewportView(table);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			// OBTER INDICE SELECIONADO
				int indice = Integer.parseInt(lblIndice.getText());
				
			// CHAMAR MÉTODO DE EXCLUSÃO
				a.excluir(indice);
				
			// ATUALIZAR TABELA
				table.setModel(a.selecionar());
				
			// LIMPAR OS CAMPOS
				txtNome.setText("");
				cbxGenero.setSelectedItem(0);
				cbxPlataforma.setSelectedItem(0);
				txtClassificacao.setText("");
				txtValor.setText("");
				
			// DEIXAR CURSOR NO CAMPO SELECIONADO
				txtNome.requestFocus();
			
			}
		});
		btnExcluir.setBounds(299, 249, 95, 37);
		contentPane.add(btnExcluir);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			//
			
			}
		});
		btnAlterar.setBounds(164, 249, 95, 37);
		contentPane.add(btnAlterar);	
	}
}
