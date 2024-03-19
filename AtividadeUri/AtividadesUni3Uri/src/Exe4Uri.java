import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe4Uri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   

        double notaA = sc.nextDouble();
        double notaB = sc.nextDouble();

        double media = (notaA * 3.5 + notaB * 7.5) / 11;
        DecimalFormat df = new DecimalFormat("0.00000");
        System.out.println("MEDIA = " + df.format(media));

        sc.close();
    
    }
    
}
