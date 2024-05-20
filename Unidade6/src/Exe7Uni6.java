import java.util.Scanner;

public class Exe7Uni6 {
    public Exe7Uni6() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de elementos (max. 20): ");
        int tamanho = sc.nextInt();
        int vetor[] = new int[tamanho];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número [" + (i+1) + "]: ");
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            int bolha = 0;
            int indice = 0;
            tamanho = tamanho - 1;
            while (indice < tamanho) {
                if (vetor[i] > vetor[i+1]) {
                    bolha = vetor[i];
                    vetor[i] = vetor[i+1];
                    vetor[i+1] = bolha;
                    indice = 0;
                } else {
                    indice = indice + 1;
                }
        }
        for (i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
        
    

        /*int bolha;
        int indice = 0;

        for (int i = 0; i < vetor.length; i++) {
        while (indice < (tamanho - 1)) {
            if (vetor[i] > vetor[i+1]) {
                bolha = vetor[i];
                vetor[i] = vetor[i+1];
                vetor[i+1] = bolha;
                indice = 0;
            } else {
                indice = indice + 1;
            }
        }
        System.out.println(vetor[i]);
    }*/

        

        sc.close();
    }
    public static void main(String[] args) {
        new Exe7Uni6();
    }
}
