
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");
	   
		int idade = 10;
		int quantidadePessoas = 2;
		if (idade >= 18) {
			System.out.println("Você têm mais de 18 anos");
		    System.out.println("Seja bem vindo!");
		}
		else {
			if(quantidadePessoas >= 2) {
				System.out.println("Você é menor de idade, mas como "
						+ "está acompanhado, pode entrar!");
			}
			else {
			System.out.println("Você não pode entrar, "
					+ "pois é menor de idade!");
	
	     
		  }
       }   

	}
}
