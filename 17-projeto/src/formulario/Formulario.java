package formulario;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import modelo.Pessoa;

public class Formulario {

	// ArrayList
	public static ArrayList<Pessoa> vetorPessoa = new ArrayList<Pessoa>();
	
	// DefaultTableModel
	DefaultTableModel dados = new DefaultTableModel();
	
	// CONSTRUTOR
	public Formulario() {
		
		JFrame f = new JFrame("Projeto base");
		f.setSize(400, 500);
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.add(painelListarDados());
		f.add(painelCadastro());
		f.setVisible(true);
	}	
	
	// MÉTODO DE PAINEL PARA CADASTRO
	private JPanel painelCadastro() {
	
		JPanel p = new JPanel();
		p.setBounds(10, 10, 362, 250);
		p.setLayout(null);
		p.setBorder(BorderFactory.createLineBorder(Color.GRAY));
	
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 10, 50, 20);
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(10, 50, 50, 20);
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(10, 90, 100, 20);
		
		JTextField txtNome = new JTextField();
		txtNome.setBounds(70, 10, 280, 20);
		JTextField txtIdade = new JTextField();
		txtIdade.setBounds(70, 50, 280, 20);
		JTextField txtCidade = new JTextField();
		txtCidade.setBounds(70, 90, 280, 20);
		
		JButton btn = new JButton("Cadastrar");
		btn.setBounds(130, 130, 100, 20);
		
		// AÇÃO DO BOTÃO
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// OBTER OS DADOS
				String nome = txtNome.getText();
				int idade = Integer.parseInt(txtIdade.getText());
				String cidade = txtCidade.getText();
				
				// OBJETO
				Pessoa p = new Pessoa();
				p.setNome(nome);
				p.setIdade(idade);
				p.setCidade(cidade);
				
				// ADICIONAR AO ArrayList
				vetorPessoa.add(p);
				
				// LIMPAR DO DefaultTabelModel
				dados.setRowCount(0);
				
				// ADICIONAR AO DefaultTableModel
				for(int i=0; i<vetorPessoa.size(); i++) {
					dados.addRow(new Object[] {
							vetorPessoa.get(i).getNome(),
							vetorPessoa.get(i).getIdade(),
							vetorPessoa.get(i).getCidade(),		
					});
				}
			
				// LIMPAR OS CAMPOS
				txtNome.setText("");
				txtIdade.setText("");
				txtCidade.setText("");
				
				// CURSOR NO CAMPO DE NOME
				txtNome.requestFocus();
			
			}
		});
		
		p.add(lblNome);
		p.add(lblIdade);
		p.add(lblCidade);
		p.add(txtNome);
		p.add(txtIdade);
		p.add(txtCidade);
		p.add(btn);	
	
		return p;
	}
	
	// MÉTODO DE PAINEL PARA LISTAR OS DADOS
	private JPanel painelListarDados() {
		JPanel p = new JPanel();
		p.setBounds(10, 200, 362, 250);
		p.setLayout(null);
		p.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		
		JScrollPane barra = new JScrollPane(tabela());
		barra.setSize(362, 250);
		
		p.add(barra);
		
		return p;
	}

	// MÉTODO DE TABELA
	private JTable tabela() {
		
		//DADOS
	
		dados.addColumn("Nome");
		dados.addColumn("Idade");
		dados.addColumn("Cidade");
		dados.addRow(new Object[] {"Ana", 16, "Blumenau"});
		dados.addRow(new Object[] {"Douglas", 32, "Blumenau"});
		dados.addRow(new Object[] {"Rebeca", 19, "Gaspar"});
		
		// TABELA
		JTable tabela = new JTable(dados);
		
		return tabela;
	}
}
