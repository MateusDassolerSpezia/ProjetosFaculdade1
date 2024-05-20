import java.util.Scanner;

public class Exe5Uni6 {
    public Exe5Uni6() {

        String perguntas[] = new String[5];
        //String perguntas[] = {"Gosta de música sertaneja?" , "Gosta de futebol" , "Gosta de seriados"};  "SE FOR UM VALOR FIXO"
        char resposta1[] = new char[5];
        char resposta2[] = new char[5];
        int resultado[] = new int[5];


        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < perguntas.length; i++) {
            System.out.println("Qual a pergunta?");
            perguntas[i] = sc.next();
        }
    

    
        /*System.out.println("Rapaz: responda as perguntas com SIM, NÃO ou IND (indiferente):");
        for (int i = 0; i < resposta1.length; i++) {
            System.out.println(perguntas[i]);
            resposta1[i] = sc.next().toUpperCase().charAt(0);
        }
       
    
        System.out.println("Moça: Responda as perguntas com SIM, NÃO ou IND (indiferente):");
        for (int i = 0; i < resposta2.length; i++) {
            System.out.println(perguntas[i]);
            resposta2[i] = sc.next().toUpperCase().charAt(0);
        }*/

        sc.close();

        float afinidade = 0;
        for (int i = 0; i < resultado.length; i++) {
        if (resposta1[i] == resposta2[i]) {
            afinidade += 3;
        } else if ((resposta1[i] == 'I' && resposta2[i] == 'S' || resposta1[i] == 'I' && resposta2[i] == 'N') || (resposta2[i] == 'I' && resposta1[i] == 'S' || resposta2[i] == 'I' && resposta1[i] == 'N')) {
            afinidade += 1;
        } else if (resposta1[i] == 'S' && resposta2[i] == 'N' || resposta2[i] == 'S' && resposta1[i] == 'N') {
            afinidade += -2;
        }
        }

        if (afinidade == 15) {
            System.out.println("Casem!");
        } else if (afinidade >= 10 && afinidade <= 14) {
            System.out.println("Vocês têm muita coisa em comum!");
        } else if (afinidade >= 5 && afinidade <= 9) {
            System.out.println("Talvez não dê certo :(");
        } else if (afinidade >= 0 && afinidade <= 4) {
            System.out.println("Vale um encontro.");
        } else if (afinidade >= -9 && afinidade <= -1) {
            System.out.println("Melhor não perder tempo");
        } else if (afinidade <= -10) {
            System.out.println("Vocês se odeiam!");
        }

    }
    
    public static void main(String[] args) {
        new Exe5Uni6();
    }
}
