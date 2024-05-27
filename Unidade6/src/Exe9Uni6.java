import java.util.Scanner;

public class Exe9Uni6 {
    public Exe9Uni6() {

    
        Scanner sc = new Scanner(System.in);

        int sexo[] = new int[5];
        int nota[] = new int[5];
        int idade[] = new int[5];

        System.out.println("Digite o seu sexo (1 = feminino, 2 = masculino):\n" + 
        "Digite uma nota para o cinema (zero até dez, valor inteiro):\n" +
        "Digite sua idade:");

        ler(sexo, nota, idade, sc);
        
        sc.close();
    }

    private void ler(int s[], int n[], int id[], Scanner sc) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Sexo ["+ (i+1) +"]:");
            s[i] = sc.nextInt();
            System.out.println("Nota ["+ (i+1) +"]:");
            n[i] = sc.nextInt();
            System.out.println("Idade ["+ (i+1) +"]:");
            id[i] = sc.nextInt();
        }
    }

    private float calculos(int s[], int n[], int id[]) {
        float somaGeral = 0;
        float mediaGeral = 0;
        float quantidadeHomens = 0;
        float somaHomens = 0;
        float mediaHomens = 0;
        float quantidadeMulheresMais50 = 0;
        float mulherMaisJovem = Float.MAX_VALUE;
        float notaMulherMaisJovem = 0;

        for (int i = 0; i < 5; i++) {
            somaGeral += n[i];
            if (s[i] == 2) {
                somaHomens += n[i];
                quantidadeHomens++;
            }
        }

        mediaGeral = somaGeral / 5;
        System.out.println("Nota média recebida pelo cinema: " + mediaGeral);
        mediaHomens = somaHomens / quantidadeHomens;
        System.out.println("Nota média atribuida pelos homens: " + mediaHomens);

        for (int i = 0; i < 5; i++) {
            if (id[i] < mulherMaisJovem && s[i] == 1) {
                mulherMaisJovem = id[i];
            }
            if (mulherMaisJovem == id[i] && s[i] == 1) {
                notaMulherMaisJovem = n[i];
            }
        }
        System.out.println("Nota atribuída pela mulher mais jovem: " + notaMulherMaisJovem);

        for (int i = 0; i < 5; i++) {
            if (s[i] == 1 && id[i] > 50 && n[i] > mediaGeral) {
                quantidadeMulheresMais50++;
            }
        }

        System.out.println(quantidadeMulheresMais50 + " mulher(es) com mais de 50 anos deram nota superior a média recebida pelo cinema");

        return mediaGeral;
        return mediaHomens;
        return notaMulherMaisJovem;
        return quantidadeMulheresMais50;

    }

    
    public static void main(String[] args) {
        new Exe9Uni6();
    }
}
