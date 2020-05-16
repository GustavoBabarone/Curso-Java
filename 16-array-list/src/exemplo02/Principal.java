package exemplo02;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		// CURSO 01
		Curso c1 = new Curso();
		c1.setNomeCurso("Java");
		c1.setAreaCurso("Desenvolvimento");
		c1.setValorCurso(2300);
		
		// CURSO 02
		Curso c2 = new Curso();
		c2.setNomeCurso("C#");
		c2.setAreaCurso("Desenvolvimento");
		c2.setValorCurso(1900);
				
		// CURSO 03
		Curso c3 = new Curso();
		c3.setNomeCurso("Photoshop");
		c3.setAreaCurso("Gráfica");
		c3.setValorCurso(600);
		
		// Array List
		ArrayList<Curso> cursos = new ArrayList<Curso>();
		cursos.add(c1);
		cursos.add(c2);
		cursos.add(c3);
		
		// LISTAR
		for(int i=0; i<cursos.size(); i++) {
			System.out.println(cursos.get(i).getNomeCurso());
		}	
	}
}
