
/*Vendo de maneira lógica:

Por conta do "for" externo ter a condição "linha < 5", serão printados 5 linhas.

No primeiro loop externo (linha = 0):

O "loop" interno acontece 2x, no primeiro o número 1 é printado, e no começo do segundo "loop" a variável "coluna" começa valendo 1, fazendo com que a condição do "if" seja verdadeira, fazendo com que o "loop" quebre por conta do "break"
No segundo loop externo (linha = 1):

O "loop" interno acontece 3x, no primeiro e segundo os números 1 e 2 são printados, no começo do terceiro "loop" a variável "coluna" começa valendo 2, fazendo com que a condição do "if" seja verdadeira, fazendo com que o "loop" quebre por conta do "break"
No terceiro loop externo (linha = 2):

O "loop" interno acontece 4x, no primeiro, segundo e terceiro os números 1, 2 e 3 são printados, no começo do quarto "loop" a variável "coluna" começa valendo 3, fazendo com que a condição do "if" seja verdadeira, fazendo com que o "loop" quebre por conta do "break"
No quarto loop externo (linha = 3):

O "loop" interno acontece 5x, no primeiro, segundo, terceiro e quarto os números 1, 2, 3 e 4 são printados, no começo do quinto "loop" a variável "coluna" começa valendo 4, fazendo com que a condição do "if" seja verdadeira, fazendo com que o "loop" quebre por conta do "break"
No quinto loop externo (linha = 4):

O "loop" interno acontece 6x, no primeiro, segundo, terceiro, quarto e quinto os números 1, 2, 3, 4 e 5 são printados, no começo do sextp "loop" a variável "coluna" começa valendo 5, fazendo com que a condição do "if" seja verdadeira, fazendo com que o "loop" quebre por conta do "break"

*/
public class TestaLacos2 {
	
	public static void main(String[] args) {
		
		for(int linha = 0; linha < 10; linha++) {
			for(int coluna = 0; coluna <= linha; coluna++) {
			//	if(coluna > linha) {
				//	break;
				//}
				System.out.print("*");
				
				
			}
		System.out.println();
		}
	}

}
