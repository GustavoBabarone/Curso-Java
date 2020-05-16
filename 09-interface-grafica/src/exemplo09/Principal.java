package exemplo09;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Principal {

	public static void main(String[] args) {
		
		// CRIAR UM FORMULARIO
		
		JFrame formulario = new JFrame();
		formulario.setTitle("Meu nono formulário");
		formulario.setSize(500, 300);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// DefautTableModel ( ENGLOBAR OS DADOS )
		
		DefaultTableModel dados = new DefaultTableModel();
		dados.addColumn("Nome");
		dados.addColumn("Idade");
		dados.addRow(new Object[] {"Yara", "26"});
		dados.addRow(new Object[] {"Tayler", "18"});
		dados.addRow(new Object[] {"Vanessa", "22"});
		dados.addRow(new Object[] {"Roan", "14"});
		
		// Jtable ( EXIBIR OS DADOS )
		
		JTable tabela = new JTable(dados);
		
		// JSronnPane ( BARRA DE ROLAGEM )
		
		JScrollPane barraRolagem = new JScrollPane(tabela);
		barraRolagem.setBounds(10, 10, 465, 230);
		
		// ADICIONAR AO FORMULÁRIO
		
		formulario.add(barraRolagem);
				
		//EXIBIR COMPONENTES
				
		formulario.setVisible(true);
	}

}
