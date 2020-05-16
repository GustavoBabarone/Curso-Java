package exemplo01;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		// Array List
		ArrayList<String> cursos = new ArrayList<String>();
		
		// ADICIONAR CURSOS
		cursos.add("Java");
		cursos.add("MySQL");
		cursos.add("HTML");
		cursos.add("CSS");
		cursos.add("JavaScript");
		
		// ALTERAR O CURSO
		cursos.set(4,"Angular");
		
		// PARA REMOVER O CURSO
		cursos.remove(1);
		
		// REMOVER TODOS OS CURSOS
		cursos.clear();
		
		// EXIBIR A QUANTIDADE DE CURSOS CADASTRADOS
		System.out.println("Quantidade de cursos: "+cursos.size());
		
		// LISTAR OS CURSOS
		for(String elemento : cursos) {
			System.out.println(elemento);
		}
	}
}
