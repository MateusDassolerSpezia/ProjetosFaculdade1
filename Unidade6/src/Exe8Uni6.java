import java.util.Scanner;

public class Exe8Uni6 {
    public Exe8Uni6() {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de elementos (max. 20): ");
        int tamanho = sc.nextInt();
        float vetor[] = new float[tamanho];


        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número [" + (i+1) + "]: ");
            vetor[i] = sc.nextFloat();
        }

        sc.close();

    }
    public static void main(String[] args) {
        new Exe8Uni6();
    }
}
