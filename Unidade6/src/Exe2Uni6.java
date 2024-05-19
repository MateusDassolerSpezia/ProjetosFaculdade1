import java.util.Scanner;

public class Exe2Uni6 {
    public Exe2Uni6() {

        float numeros[] = new float[12];
        float soma = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");   
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
        soma += numeros[i];
        }
        float media = soma / 12;

        System.out.println("A média dos valores é: " + media);
        System.out.println("Valores maiores que a média:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > media) {
                System.out.println(numeros[i]);
            }
        }


        sc.close();
    }
    public static void main(String[] args) {
        new Exe2Uni6();
    }
}
