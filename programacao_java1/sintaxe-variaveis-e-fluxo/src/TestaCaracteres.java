
public class TestaCaracteres {

	public static void main(String[] args) {
		
		char letra = 'a';
		System.out.println(letra);
	
	    char valor = 66; // Aqui ele interpreta o valor da tabela Asc, no caso 66 é o B
	    System.out.println(valor);
	    
	    char somar = (char) (valor + 1);// se não informar que é um char, o compilador vai
	    System.out.println(somar); // entender que seria uma soma de um inteiro com um char
	                              // gerando o erro de compilação. 
	
	    String palavra = " Alura cursos online de tecnologia ";
	    System.out.println(palavra);

	    palavra = palavra + 2023; // No tipo String ele converte qualquer valor(2023) em string
	    System.out.println(palavra); // concatenando os dados.
	 
	
	} 
}
