import java.util.Scanner;

public class Exe16Uni5 {
    public Exe16Uni5() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a altura:");
        float altura = sc.nextFloat();

        System.out.println("Digite o gênero (masculino, feminino ou outro):");
        char genero = sc.next().toUpperCase().charAt(0);

        float mediaAltura = 0;

        while (altura != 0) {
            if (genero == 'F') {
                altura += altura;
                mediaAltura = altura;
            }
            System.out.println("Digite a altura:");
            altura = sc.nextFloat();
            System.out.println("Digite o gênero (masculino, feminino ou outro):");
            genero = sc.next().toUpperCase().charAt(0);
        }

        System.out.println(mediaAltura);

        sc.close();
    }
    public static void main(String[] args) {
        new Exe16Uni5();
    }
}
