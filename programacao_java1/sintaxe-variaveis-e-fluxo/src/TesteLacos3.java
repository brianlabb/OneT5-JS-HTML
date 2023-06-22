public class TesteLacos3 {
    public static void main(String args[]) {
        for(int linha = 0; linha < 8; linha++) {
            for (int coluna = 0; coluna < 8; coluna++) {
                if (coluna > linha) {
                    break;
                }
                System.out.print(coluna+1);
            }
            System.out.println();
        }
    }
}