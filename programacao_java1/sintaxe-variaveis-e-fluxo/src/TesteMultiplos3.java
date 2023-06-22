
public class TesteMultiplos3 {
	
	public static void main(String[] args) {
		int fator;
		int valor = 3;
		
	System.out.print("Os números divisíveis por 3 são: [");

		for(int numero = 1; numero <= 100; numero ++) {
			if(numero % valor == 0) {
			    fator = numero;
				System.out.print(fator+",");
				}
			
		}	System.out.print("].");


	}

}
