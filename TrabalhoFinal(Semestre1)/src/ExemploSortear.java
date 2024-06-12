public class ExemploSortear {

    private ExemploSortear() {
        // int sorteio;
        int sorteioLinha[] = new int[8];
        int sorteioColuna[] = new int[8];
        char navios[][] = new char[8][8];

        int sorteio = 0;
        
            /*for (int s = 0; s < 10; s++) {
                sorteioLinha[s] = sortear(0, 7);
                System.out.println("Linha: " + sorteioLinha);
                sorteioColuna[s] = sortear(0, 7);
                System.out.println("Coluna: " + sorteioColuna);
            }*/
                for (int i = 0; i < navios.length; i++) { // Linhas
                    for (int j = 0; j < navios[i].length; j++) { // Colunas
                        sorteioLinha[i] = sortear(0, 7);
                        //System.out.println("Linha: " + sorteioLinha);
                        sorteioColuna[j] = sortear(0, 7);
                        //System.out.println("Coluna: " + sorteioColuna);
                        navios[i][j] = '~';
                        navios[sorteioLinha[i]][sorteioColuna[j]] = 'N';
                        System.out.print(navios[i][j] + " ");
                    }
                    System.out.println("");
                }

       

        /*
         * int qtdOcorre0 = 0;
         * int qtdOcorre1 = 0;
         * int qtdOcorre2 = 0;
         * 
         * for (int i = 0; i < 10; i++) {
         * sorteio = sortear(0, 3);
         * switch (sorteio) {
         * case 0:
         * qtdOcorre0++;
         * break;
         * case 1:
         * qtdOcorre1++;
         * break;
         * case 2:
         * qtdOcorre2++;
         * break;
         * default:
         * System.out.println("Sorteou valor errado: " + sorteio);
         * break;
         * }
         * }
         * System.out.println("[0]: " + qtdOcorre0 + " [1]: " + qtdOcorre1 + " [2]: " +
         * qtdOcorre2);
         */
    }

    private int sortear(int inicio, int fim) {
        return (int) ((Math.random() * fim) - inicio);
    }

    public static void main(String[] args) {
        new ExemploSortear();

    }

}
