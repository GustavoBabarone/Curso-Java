package exemplo04;

public class Principal {

	public static void main(String[] args) {
		
		int[] numeros = {9, 5, 3, 8, 1};
		
		int maiornumero=0;
		
		for(int i1=0; i1<4; i1++) {
			
			for(int i2=i1 + 1; i2<5; i2++) {
				
				if(numeros[i2] < numeros[i1]) {
					maiornumero = numeros[i1];
					numeros[i1] = numeros[i2];
					numeros[i2] = maiornumero;
				}
			}
		}

		for(int n : numeros) {
			System.out.println(n);
		}
	}
}
