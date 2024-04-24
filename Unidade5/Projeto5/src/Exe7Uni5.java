import java.util.Scanner;

public class Exe7Uni5 {
    public Exe7Uni5() {
        Scanner sc = new Scanner(System.in);

        float n = sc.nextInt();

        int maior = 0;
        int menor = 0;

        for (int cont = 1;cont <= n; cont++) {
            n = maior;
            n = menor;
        }


        sc.close();
    }
    public static void main(String[] args) {
        new Exe7Uni5();
    }
}
