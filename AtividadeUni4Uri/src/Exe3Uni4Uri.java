import java.util.Scanner;

public class Exe3Uni4Uri {
    public Exe3Uni4Uri() {
        Scanner sc = new Scanner(System.in);

        float x = sc.nextFloat();
        float y = sc.nextFloat();

        if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        } else if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x > 0 || x < 0 && y == 0) {
            System.out.println("Eixo X");
        } else if (x == 0 && y > 0 || y < 0) {
            System.out.println("Eixo Y");
        }


        sc.close();
    }
    public static void main(String[] args) {
        new Exe3Uni4Uri();
    }
}
