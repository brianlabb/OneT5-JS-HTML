
public class TestaValores {

	public static void main(String[] args) { // Ctrl + <espaço> -> Preenchimento automático.
		
		int primeiro = 5;
		int segundo = 7;
		primeiro = 10;
		segundo = primeiro; // Neste caso sempre vale a última atribuição, no caso o valor 10 na vaiável inteiro primeiro.
		primeiro = 20; // atribuições não consideradas.
		
		System.out.println(segundo);
		
	}
}
