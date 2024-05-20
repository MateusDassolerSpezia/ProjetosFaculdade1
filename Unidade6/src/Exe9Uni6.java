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


        for (int i = 0; i < 5; i++) {
            System.out.println("Sexo ["+ (i+1) +"]:");
            sexo[i] = sc.nextInt();
            System.out.println("Nota ["+ (i+1) +"]:");
            nota[i] = sc.nextInt();
            System.out.println("Idade ["+ (i+1) +"]:");
            idade[i] = sc.nextInt();
        }

        sc.close();

        float somaGeral = 0;
        float mediaGeral = 0;
        float quantidadeHomens = 0;
        float somaHomens = 0;
        float mediaHomens = 0;
        float quantidadeMulheresMais50 = 0;
        float mulherMaisJovem = Float.MAX_VALUE;
        float notaMulherMaisJovem = 0;

        for (int i = 0; i < 5; i++) {
            somaGeral += nota[i];
            if (sexo[i] == 2) {
                somaHomens += nota[i];
                quantidadeHomens++;
            }
        }

        mediaGeral = somaGeral / 5;
        System.out.println("Nota média recebida pelo cinema: " + mediaGeral);
        mediaHomens = somaHomens / quantidadeHomens;
        System.out.println("Nota média atribuida pelos homens: " + mediaHomens);

        for (int i = 0; i < 5; i++) {
            if (idade[i] < mulherMaisJovem && sexo[i] == 1) {
                mulherMaisJovem = idade[i];
            }
            if (mulherMaisJovem == idade[i] && sexo[i] == 1) {
                notaMulherMaisJovem = nota[i];
            }
        }
        System.out.println("Nota atribuída pela mulher mais jovem: " + notaMulherMaisJovem);

        for (int i = 0; i < 5; i++) {
            if (sexo[i] == 1 && idade[i] > 50 && nota[i] > mediaGeral) {
                quantidadeMulheresMais50++;
            }
        }

        System.out.println(quantidadeMulheresMais50 + " mulher(es) com mais de 50 anos deram nota superior a média recebida pelo cinema");

    }
    public static void main(String[] args) {
        new Exe9Uni6();
    }
}
