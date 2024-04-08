import java.util.Scanner;

public class Exe24Uni4 {
    public Exe24Uni4() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com 3 valores: ");
        float valor1 = sc.nextFloat();
        float valor2 = sc.nextFloat();
        float valor3 = sc.nextFloat();

        System.out.println("Escolha uma opção:");
        System.out.println("1 - escreva os 3 valores em ordem crescente");
        System.out.println("2 - escreva os 3 valores em ordem decrescente");
        System.out.println("3 - escreva os 3 valores de forma que o maior valor fique no meio");
        int opçao = sc.nextInt();

        if (valor1 > valor2 && valor1 > valor3 && valor2 > valor3); {
            System.out.println(valor1 + ", " + valor2 + ", " +valor3);
        } else if (valor2 > valor1) {
            System.out.println(valor2 + ", " + valor1 + ", " +valor3);
        }

        /*switch (opçao) {
            case 1:
            System.out.println("Entre com 3 valores: ");
            float valor1 = sc.nextFloat();
            float valor2 = sc.nextFloat();
            float valor3 = sc.nextFloat();
            if (valor1 > valor2 && valor1 > valor3 && valor2 > valor3); {
                System.out.println(valor1 + ", " + valor2 + ", " +valor3);
            } else if (valor2 > valor1 && valor2 > valor3 && valor1 > valor3); {
                System.out.println(valor2 + ", " + valor1 + ", " +valor3);
            }
        }/* */
        sc.close();
    }
    public static void main(String[] args) {
        new Exe24Uni4();
    }
}
