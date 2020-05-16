package principal;

import java.util.ArrayList;

import beans.Login;
import formulario.AlterarFormulario;
import formulario.CadastroFormulario;
import formulario.LoginFormulario;

public class Principal {

		// ARRAYLIST
		public static ArrayList<Login> vetorLogin = new ArrayList<Login>();
	
		public static void main(String[] args) {
		
		// INSTANCIAR UM FORMULARIO LOGIN
			LoginFormulario frame1 = new LoginFormulario();
			frame1.setVisible(true);
			
		// INSTANCIAR UM ADMINISTRADOR
		Login adm = new Login();
		adm.setNome("aaa");
		adm.setSenha("aaa");
		
		
			
			
	}
}
