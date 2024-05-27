import java.util.Scanner;

public class zExe9 {
    public zExe9() {
    Scanner sc = new Scanner(System.in);

        int sexo[] = new int[5];
        int nota[] = new int[5];
        int idade[] = new int[5];
    
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o sexo (1 = feminino, 2 = masculino) ["+ (i+1) +"]: ");
            sexo[i] = sc.nextInt();
            System.out.print("Digite a nota (zero até dez, valor inteiro) ["+ (i+1) +"]: ");
            nota[i] = sc.nextInt();
            System.out.print("Digite a idade ["+ (i+1) +"]: ");
            idade[i] = sc.nextInt();
        }
    
        sc.close();
    
        float somaNotaGeral = 0;
        float mediaGeral = 0;
        float quantidadeHomens = 0;
        float somaNotaHomens = 0;
        float mediaHomens = 0;
        float quantidadeMulheresMais50 = 0;
        float mulherMaisJovem = Float.MAX_VALUE;
        float notaMulherMaisJovem = 0;

        for (int i = 0; i < 5; i++) {
            somaNotaGeral += nota[i];
            if (sexo[i] == 2) {
                somaNotaHomens += nota[i];
                quantidadeHomens++;
            }
        }

        mediaGeral = somaNotaGeral / 5;
        System.out.println("Nota média recebida pelo cinema: " + mediaGeral);
        mediaHomens = somaNotaHomens / quantidadeHomens;
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
        new zExe9();
    }
}


