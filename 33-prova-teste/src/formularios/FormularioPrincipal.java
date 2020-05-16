package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.acao;
import beans.Colaborador;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class FormularioPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField txtColaborador;
	private JTextField txtSalarioBruto;
	private JTextField txtValeTransporte;
	private JTextField txtImpostoRenda;
	private JTextField txtSalarioLiquido;
	private JTable table;

	/**
	 * Create the frame.
	 */
	public FormularioPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 200, 592, 549);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// INSTANCIAR acao
		acao a = new acao();
		
		JLabel lblColaborador = new JLabel("Colaborador");
		lblColaborador.setBounds(10, 11, 89, 27);
		contentPane.add(lblColaborador);
		
		JLabel lblNewLabel = new JLabel("S\u00E1lario Bruto");
		lblNewLabel.setBounds(10, 47, 89, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Vale Transporte");
		lblNewLabel_1.setBounds(10, 85, 99, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Faltas no m\u00EAs");
		lblNewLabel_2.setBounds(10, 123, 89, 27);
		contentPane.add(lblNewLabel_2);
		
		txtColaborador = new JTextField();
		txtColaborador.setBounds(101, 14, 163, 20);
		contentPane.add(txtColaborador);
		txtColaborador.setColumns(10);
		
		txtSalarioBruto = new JTextField();
		txtSalarioBruto.setEnabled(false);
		txtSalarioBruto.setColumns(10);
		txtSalarioBruto.setBounds(101, 50, 163, 20);
		contentPane.add(txtSalarioBruto);
		
		txtValeTransporte = new JTextField();
		txtValeTransporte.setEnabled(false);
		txtValeTransporte.setColumns(10);
		txtValeTransporte.setBounds(133, 88, 131, 20);
		contentPane.add(txtValeTransporte);
		
		JSpinner spinFaltas = new JSpinner();
		spinFaltas.setBounds(101, 126, 53, 20);
		contentPane.add(spinFaltas);
		
		JCheckBox chcbxValeTransporte = new JCheckBox("");
		chcbxValeTransporte.setBounds(105, 87, 22, 23);
		contentPane.add(chcbxValeTransporte);
		
		JLabel lblCargo = new JLabel("Cargo");
		lblCargo.setBounds(288, 14, 53, 21);
		contentPane.add(lblCargo);
		
		JCheckBox chcbxClubeFidelidade = new JCheckBox("Clube fidelidade ");
		chcbxClubeFidelidade.setBounds(298, 49, 120, 23);
		contentPane.add(chcbxClubeFidelidade);
		
		JCheckBox chcbxPlanoSaude = new JCheckBox("Plano de sa\u00FAde ");
		chcbxPlanoSaude.setBounds(444, 49, 120, 23);
		contentPane.add(chcbxPlanoSaude);
		
		JComboBox cbxCargo = new JComboBox();
		cbxCargo.setBounds(336, 13, 228, 22);
		cbxCargo.addItem("Estagiário");
		cbxCargo.addItem("Desenvolvedor Jr");
		cbxCargo.addItem("Desenvolvedor Pleno");
		cbxCargo.addItem("Desenvolvedor Sênior");
		cbxCargo.addItem("Analista de Sistemas Jr");
		cbxCargo.addItem("Analista de Sistemas Pleno");
		cbxCargo.addItem("Analista de Sistemas Sênior");
		cbxCargo.addItem("Arquiteto de Software");
		contentPane.add(cbxCargo);
		cbxCargo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// OBTER SALARIO BRUTO DE ACORDO COM O CARGO
				txtSalarioBruto.setText(String.valueOf(a.obterSalarioBruto(cbxCargo.getSelectedIndex())));
				
				// OBTER PROCENTAGEM DE VALE TRANSPORTE
				txtValeTransporte.setText(String.valueOf(a.obterValeTransporte(cbxCargo.getSelectedIndex())));
				
				// OBTER PROCENTAGEM IMPOSTO DE RENDA
				txtImpostoRenda.setText(String.valueOf(a.obterImpostoRenda(cbxCargo.getSelectedIndex())));
				
				// OBTER PROCENTAGEM SALARIO LIQUIDO
				txtSalarioLiquido.setText(String.valueOf(a.obterSalarioLiquido(cbxCargo.getSelectedIndex())));
		
			
			}
		});
	
		
		
		JLabel lblImpostoDeRenda = new JLabel("Imposto de renda");
		lblImpostoDeRenda.setBounds(288, 88, 109, 21);
		contentPane.add(lblImpostoDeRenda);
		
		txtImpostoRenda = new JTextField();
		txtImpostoRenda.setEnabled(false);
		txtImpostoRenda.setBounds(394, 88, 170, 20);
		contentPane.add(txtImpostoRenda);
		txtImpostoRenda.setColumns(10);
		
		JLabel lblSalrioLquido = new JLabel("Sal\u00E1rio L\u00EDquido");
		lblSalrioLquido.setBounds(288, 123, 109, 27);
		contentPane.add(lblSalrioLquido);
		
		txtSalarioLiquido = new JTextField();
		txtSalarioLiquido.setEnabled(false);
		txtSalarioLiquido.setColumns(10);
		txtSalarioLiquido.setBounds(394, 126, 170, 20);
		contentPane.add(txtSalarioLiquido);
		
		JButton btnCadastrar = new JButton("Cadastrar Colaborador");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				// CRIAR UM OBJETO DA CLASSE Colaborador
				try {
					
					Colaborador c = new Colaborador();
					c.setColaborador(txtColaborador.getText());
					c.setImpostoRenda(Double.parseDouble(txtImpostoRenda.getText().toString()));
					c.setSalarioBruto(Double.parseDouble(txtSalarioBruto.getText().toString()));
					c.setSalarioLiquido(Double.parseDouble(txtSalarioLiquido.getText()));
					c.setValeTrasporte(Double.parseDouble(txtValeTransporte.getText().toString()));
					c.setCargo(cbxCargo.getSelectedItem().toString());	
					//c.setFaltas(Integer.parseInt(spinFaltas.getModel().toString()));
					
					// CADASTRAR
					a.cadastrar(c);
					
					// ATUALIZAR TABELA
					table.setModel(a.selecionar());
					
					// MENSAGEM
					JOptionPane.showMessageDialog(null, "Colabrador cadastrado com sucesso");
				}catch(Exception erro) {
					JOptionPane.showMessageDialog(null, "Erro, tente novamente");
				}
				
				// LIMPAR OS DADOS
				txtColaborador.setText("");
				txtImpostoRenda.setText("");
				txtSalarioBruto.setText("");
				txtSalarioLiquido.setText("");
				txtValeTransporte.setText("");
				cbxCargo.setSelectedIndex(0);
				
				// DEIXAR CURSOR NO CAMPO SELECIONADO
				txtColaborador.requestFocus();
			}
		});
		btnCadastrar.setBounds(20, 172, 170, 35);
		contentPane.add(btnCadastrar);
		
		JButton btnEstatsticas = new JButton("Estat\u00EDsticas");
		btnEstatsticas.setBounds(207, 172, 170, 35);
		contentPane.add(btnEstatsticas);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 232, 554, 267);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setEnabled(false);
		scrollPane.setViewportView(table);
	}
}
