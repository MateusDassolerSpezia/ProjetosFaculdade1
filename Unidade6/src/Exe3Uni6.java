import java.util.Scanner;

public class Exe3Uni6 {
    public Exe3Uni6() {
        Scanner sc = new Scanner(System.in);

        float vetor1[] = new float[12];

        ler(sc, vetor1);
        float modificaoVetor[] = modificacao(vetor1);
        escrever(modificaoVetor);


        sc.close();
    }

    public void ler(Scanner sc, float vetor[]) {
        System.out.println("Popular vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número [" + (i+1) + "]: ");
            vetor[i] = sc.nextFloat();
        }
    }
        

    public float[] modificacao(float vetor[]) {
        float vetor2[] = new float[12];
        for (int i = 0; i < vetor2.length; i++) {
            if (vetor[i] % 2 == 0) {
                vetor2[i] = vetor[i] + vetor[i] * 0.02f;
            } else {
                vetor2[i] = vetor[i] + vetor[i] * 0.05f;
            }
        }
        return vetor2;
    }

    public void escrever(float vetor2[]) {
        for (int i = 0; i < vetor2.length; i++) {
            System.out.println(vetor2[i]);
        }
    }

    

    
    public static void main(String[] args) {
        new Exe3Uni6();
    }
}
