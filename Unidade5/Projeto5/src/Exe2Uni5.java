import java.util.Scanner;

public class Exe2Uni5 {
    public Exe2Uni5() {
        Scanner sc = new Scanner(System.in);

        for (int num = 1; num <= 100; num++) {
            if (num % 2 == 0) {
                int soma = num + num;
                System.out.println(soma);
            } else {
                num = num + num;
                System.out.println(num);
            }
        }


        sc.close();
    }
    public static void main(String[] args) {
        new Exe2Uni5();
    }
}
