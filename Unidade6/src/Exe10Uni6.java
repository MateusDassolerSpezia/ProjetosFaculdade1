import java.util.Scanner;

public class Exe10Uni6 {
    public Exe10Uni6() {
        Scanner sc = new Scanner(System.in);

        int numeros[] = new int[5];

        //int numero = 0;

        int opcao = 0;
        do {
            System.out.println("Escolha uma opção:\n1 - Incluir valor (no fim do vetor)\n2 - Pesquisar valor\n3 - Alterar valor\n4 - Excluir valor\n5 - Mostrar valores\n6 - Ordenar valores\n7 - Inverter valores\n8 - Sair do sistema");
            opcao = sc.nextInt();

            int tamanho = 0;

            switch (opcao) {
                case 1:
                tamanho = incluirValor(numeros, sc, tamanho);
                break;
                case 2:
                System.out.println("Digite um número para busca: ");
                int numeroBusca = sc.nextInt();
                if (pesquisarValor(numeroBusca, numeros)) {
                    System.out.println("Está no vetor\n");
                } else { 
                    System.out.println("Não está no vetor\n");
                } break;
                case 3:
                alterarValor(numeros, sc);
                case 4:
                case 5:
                case 6:
                case 7:
            }
        } while (opcao != 8);

        sc.close();
    }

    private int incluirValor(int vetor[], Scanner sc, int tamanho) {
        if (tamanho < vetor.length) {
        System.out.println("inclua um valor no fim do vetor");
        vetor[tamanho] = sc.nextInt();
        tamanho++;
        System.out.println("Valor incluido no vetor");
        } else {
            System.out.println("Número não incluído no vetor");
        }
        return tamanho;
    }

    private boolean pesquisarValor(int numero, int vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                return true;
            }
        }
        return false;
    }

    private void alterarValor(int vetor[], Scanner sc) {
        System.out.println("Digite uma posição para ser alterada:");
        int posicao = sc.nextInt();
        System.out.println("Digite um valor para ser alterado:");
        vetor[posicao - 1] = sc.nextInt();


    }

    private void excluirValor(int vetor[]) {

    }

    private void mostrarValor(int vetor[]) {

    }

    private void ordenarValor(int vetor[]) {

    }

    private void inverterValor(int vetor[]) {

    }

    public static void main(String[] args) {
        new Exe10Uni6();
    }
}
