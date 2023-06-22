
public class TestaWhile {

	public static void main(String[] args) {

		int count = 0;

		while (count <= 20) {

			System.out.println("O número é " + count);
			count++;
		    }
		System.out.println(count);

	}
}

/*
O while aceita receber dois valores, true e false. O valor true mantém o loop em execução, já o false o finaliza.
Esses valores podem ser resultados de uma expressão como contador <= 10. 
Todavia, no código de Fernando, ele não incrementou a variável contador a cada iteração do while. 
Devido a esse esquecimento, a variável contador sempre mantinha o valor 1 fazendo com que o programa caísse em um loop infinito.
*/