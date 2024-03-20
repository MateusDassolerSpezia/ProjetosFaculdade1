import java.util.Scanner;

public class Exe12Uri {
    public Exe12Uri() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        int valor = sc.nextInt();

        System.out.print(valor);

        sc.close();
    }
    public static void main(String[] args) {
        new Exe12Uri();
    }
}
