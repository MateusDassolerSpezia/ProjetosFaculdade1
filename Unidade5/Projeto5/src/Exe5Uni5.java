//import java.util.Scanner;

public class Exe5Uni5 {
    public Exe5Uni5() {
        //Scanner sc = new Scanner(System.in);

        //float n = sc.nextFloat();
        float numeros = 8;
        float progressao = 6;

        for (float n = 0; n <= 7; n++) {
            numeros += 2; 
            numeros += progressao;
            progressao = (progressao + 1) * 2;
            System.out.println(numeros);
        }


        //sc.close();

    }
    public static void main(String[] args) {
        new Exe5Uni5();
    }
}
