import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe2Uri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();

        double π = 3.14159;

        double area = π * (raio * raio);
        DecimalFormat df = new DecimalFormat("0.0000");
        System.out.print("A = " + df.format(area));


        sc.close();
        
    }
    
}
