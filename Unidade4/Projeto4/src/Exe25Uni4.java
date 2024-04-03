import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe25Uni4 {
    public Exe25Uni4() {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Soma de dois números");
        System.out.println("2 - Diferença entre dois números");
        System.out.println("3 - Produto entre dois números");
        System.out.println("4 - Divisão entre dois números (o denominador não pode ser zero)");

        int opçao = sc.nextInt();

        if (opçao == 1) {
            System.out.println("Digite dois números");
            float num1 = sc.nextFloat();
            float num2 = sc.nextFloat();
            System.out.println("A soma desses números é " + df.format(num1 + num2));
        } else if (opçao == 2) {
            System.out.println("Digite dois numeros");
            float num1 = sc.nextFloat();
            float num2 = sc.nextFloat();
            System.out.println("A diferença desses números é " + df.format(num1 - num2));
        } else if (opçao == 3) {
            System.out.println("Digite dois numeros");
            float num1 = sc.nextFloat();
            float num2 = sc.nextFloat();
            System.out.println("O produto desses números é " + df.format(num1 * num2));
        } else if (opçao == 4) {
            System.out.println("Digite dois numeros:");
            float num1 = sc.nextFloat();
            float num2 = sc.nextFloat();
            System.out.println("A divisão desses números é " + df.format(num1 / num2));
        }

       

        sc.close();
    }
    public static void main(String[] args) {
        new Exe25Uni4();
    }
}
