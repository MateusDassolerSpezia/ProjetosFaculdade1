import java.util.Scanner;

public class Exe2Uni6 {
    public Exe2Uni6() {

        float vetor[] = new float[12];
        float media = 0;
        
        ler(vetor);
        float ve = media(vetor, media);
        escrever(ve);

    }

    private void ler(float[] vetor){    
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");   
            vetor[i] = sc.nextFloat();
        }

        sc.close();
    }

    private float media(float vetor[], float media) {
        float soma = 0;
        for (int i = 0; i < vetor.length; i++) {
        soma += vetor[i];
        }
        media = soma / 12;
        System.out.println("A média dos valores é: " + media);
        return media;
    }

    private void escrever(float v[], float media) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] > media) {
                System.out.println(v[i]);
            }
        }
    }


        
    
    public static void main(String[] args) {
        new Exe2Uni6();
    }
}
