package acao;

import javax.swing.table.DefaultTableModel;

import beans.Login;
import principal.Principal;

public class acao {
	
	// OBTER DADOS DO USUARIO
	public Usuario obterDados(String usuario, String senha){
		
		Usuario u =  new Usuario();
		u.setUsuario(nome);
		u.setSenha(senha);	
		
		for(int i=0; i<Principal.vetorLogin.size(); i++) {
			String usuarioVetor = Principal.vetorLogin.get(i).getNome();
			String senhaVetor = Principal.vetorLogin.get(i).getSenha();
				
			if(nome.equals(usuarioVetor) && senha.equals(senhaVetor)) {
				u.setTipo(Principal.vetorLogin.get(i).getTipo());
			}
		}
	}
	
	// CADASTRAR LOGINS
	public void cadastrar(Login l) {
		Principal.vetorLogin.add(l);
	}
	
	// SELECIONAR LOGINS
	public DefaultTableModel selecionar() {
		
		DefaultTableModel loginsTabela = new DefaultTableModel();
		loginsTabela.addColumn("Nome do usuário");
		loginsTabela.addColumn("Senha");
		loginsTabela.addColumn("Tipo de usuário");
		loginsTabela.addColumn("E-mail");
		
		for(int i=0; i<Principal.vetorLogin.size(); i++) {
			loginsTabela.addRow(new Object[] {
					Principal.vetorLogin.get(i).getNome(),
					Principal.vetorLogin.get(i).getSenha(),
					Principal.vetorLogin.get(i).getTipo(),
					Principal.vetorLogin.get(i).getEmail(),								
			});
		}	
			return loginsTabela;	
	}
		
	// EXCLUIR LOGINS
	public void excluir(int indice) {
		Principal.vetorLogin.remove(indice);
	}
	
	// ALTERAR LOGINS
	public void alterar(int indice, Login l) {
		Principal.vetorLogin.set(indice, l);
	}			
}
