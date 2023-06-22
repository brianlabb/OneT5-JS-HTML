
public class TestaPontoFlutuante {
	
	public static void main(String[] args) {
		
		double salario;
		salario = 1250.70;
		
		System.out.println(" O meu salário é R$:" + salario);

		double divisao = 3.14 / 2;
		System.out.println(divisao);
		
		int outraDivisao = 5 / 2;
		
		System.out.println(outraDivisao);
		
		double novaTentativa = 5 / 2;  // Apesar de ser um double, uma divisão entre inteiros retorna um inteiro. 
		System.out.println(novaTentativa);
	
		double outraTentativa = 5.0 / 2;// Aqui como forçamos uma divisão de um double por um inteiro, o resultado será um double
		System.out.println(outraTentativa);
	}

}
