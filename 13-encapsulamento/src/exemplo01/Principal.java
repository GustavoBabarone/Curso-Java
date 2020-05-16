package exemplo01;

public class Principal {

	public static void main(String[] args) {
		
		Carro c = new Carro();
		c.setFabricante("Hyndai");
		c.setModelo("HB20");
		c.setAno(2019);
		
		System.out.println(c.getFabricante());
		System.out.println(c.getModelo());
		System.out.println(c.getAno());
	}
}
