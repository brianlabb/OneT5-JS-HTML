
public class TestaConversao {
	
	public static void main (String[] args) {
		
		double salario = 1270.50;  // Chamamos essa sintaxe  de "Casting"
		int valor = (int) salario; // É possível forçar um inteiro a receber um double, colocando (int)
		System.out.println(valor); // Desse modo vai realizar o cálculo, mas o valor é arredondado para um inteiro.
		
		long numeroGrande = 45123578894L;
		short valorPequeno = 2131;
		byte b = 127;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println(total);
		
		float pontoFlutuante = 3.14f / 2;
	// ou pode ser escrito tbm assim
	// float pontoFlutuante = (float) 3.14 / 2;
		System.out.println(pontoFlutuante);
	}

}
