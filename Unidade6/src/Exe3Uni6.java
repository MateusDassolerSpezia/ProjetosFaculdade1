import java.util.Scanner;

public class Exe3Uni6 {
    public Exe3Uni6() {

        float vetor1[] = new float[12];
        float vetor2[] = new float[12];

        Scanner sc = new Scanner(System.in);

        System.out.println("Popular vetor:");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Número [" + (i+1) + "]: ");
            vetor1[i] = sc.nextInt();
        }

        sc.close();


        for (int i = 0; i < vetor2.length; i++) {
            if (vetor1[i] % 2 == 0) {
                vetor2[i] = vetor1[i] + vetor1[i] * 0.02f;
            } else {
                vetor2[i] = vetor1[i] + vetor1[i] * 0.05f;
            }
        }

        for (int i = 0; i < vetor2.length; i++) {
            System.out.println(vetor2[i]);
        }

    }

    
    public static void main(String[] args) {
        new Exe3Uni6();
    }
}
