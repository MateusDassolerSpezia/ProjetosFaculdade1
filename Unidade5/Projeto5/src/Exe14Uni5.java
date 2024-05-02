import java.util.Scanner;

public class Exe14Uni5 {
    public Exe14Uni5() {
        Scanner sc = new Scanner(System.in);

        for (int mercadorias = 1; mercadorias <= 20; mercadorias++) {
            System.out.println("Digite o nome da mercadoria: ");
            String nome = sc.nextLine();
            System.out.println("Digite o preço de compra: ");
            float PC = sc.nextFloat();
            System.out.println("Digite o preço de venda: ");
            float PV = sc.nextFloat();

            float lucro = (PV - PC) / PC * 100;

            if (lucro < 10) {
                System.out.println(nome + " tem um lucro de menos de 10%");
            } else if (lucro >= 10 && lucro <= 20) {
                System.out.println(nome + " tem um lucro entre 10% e 20%");
            } else if (lucro > 20) {
                System.out.println(nome + " tem um lucro de mais de 20%");
            }

            
        }

        System.out.println();


        sc.close();
    }
    public static void main(String[] args) {
        new Exe14Uni5();
    }
}
