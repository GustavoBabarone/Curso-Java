package exercicios07;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o n�mero desejado"));
		
		String mensagem = "0 x "+numero +" = " +numero*0;
		       mensagem+= "\n1 x "+numero +" = " +numero*1;
		       mensagem+= "\n2 x "+numero +" = " +numero*2;
		       mensagem+= "\n3 x "+numero +" = " +numero*3;
		       mensagem+= "\n4 x "+numero +" = " +numero*4;
		       mensagem+= "\n5 x "+numero +" = " +numero*5;
		       mensagem+= "\n6 x "+numero +" = " +numero*6;
		       mensagem+= "\n7 x "+numero +" = " +numero*7;
		       mensagem+= "\n8 x "+numero +" = " +numero*8;
		       mensagem+= "\n9 x "+numero +" = " +numero*9;
		       mensagem+= "\n10 x "+numero +" = " +numero*10;
		       
		JOptionPane.showMessageDialog(null, mensagem);
	}

}
