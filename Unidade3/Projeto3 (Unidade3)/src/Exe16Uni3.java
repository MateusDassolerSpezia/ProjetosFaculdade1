import java.util.Scanner;

public class Exe16Uni3 {
    public Exe16Uni3() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        int valorCompra = sc.nextInt();

        int notas100 = valorCompra / 100;
        int notas10 = ((valorCompra/10)%10);
        int notas1 = (valorCompra%10);

        System.out.println(notas100 + " notas de 100");
        System.out.println(notas10 + " notas de 10");
        System.out.println(notas1 + " notas de 1");


        sc.close();
    }
    public static void main(String[] args) {
        new Exe16Uni3();
    }
    
}
