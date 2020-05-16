package exemplo05;

public class Principal {

	public static void main(String[] args) {
		
		String[][] cursos = {
								{"Java", "Desenvolvimento"},
								{"Photoshop", "Gráfica"},
								{"C#", "Desenvolvimento"},
								{"SEO", "Marketing Digital"}
							};
		
		System.out.println(cursos[0][0]+" - "+cursos[0][1]);
		System.out.println(cursos[1][0]+" - "+cursos[1][1]);
		System.out.println(cursos[2][0]+" - "+cursos[2][1]);
		System.out.println(cursos[3][0]+" - "+cursos[3][1]);
	}
}
