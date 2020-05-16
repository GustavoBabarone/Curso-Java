package pacote;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 201);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setToolTipText("Digite seu nome");
		textField.setBounds(70, 11, 151, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JTextPane txtpnNuteinha = new JTextPane();
		txtpnNuteinha.setBounds(10, 11, 50, 20);
		txtpnNuteinha.setText("nuteinha");
		contentPane.add(txtpnNuteinha);
		
		JButton btnTomouNaJabiraca = new JButton("BOT\u00C3O DA MASSA");
		btnTomouNaJabiraca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTomouNaJabiraca.setBounds(39, 58, 151, 67);
		contentPane.add(btnTomouNaJabiraca);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(407, 11, 17, 140);
		contentPane.add(scrollBar);
		
		JCheckBox chckbxVaiSeFuder = new JCheckBox("vai tomar banho");
		chckbxVaiSeFuder.setBounds(242, 10, 97, 23);
		contentPane.add(chckbxVaiSeFuder);
		
		JRadioButton rdbtnRdio = new JRadioButton("R\u00C1DIO");
		rdbtnRdio.setBounds(242, 36, 109, 23);
		contentPane.add(rdbtnRdio);
	}
}
