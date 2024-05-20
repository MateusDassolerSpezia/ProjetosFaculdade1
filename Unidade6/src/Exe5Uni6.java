import java.util.Scanner;

public class Exe5Uni6 {
    public Exe5Uni6() {

        char resposta1[] = new char[5];
        char resposta2[] = new char[5];
        int resultado[] = new int[5];


        Scanner sc = new Scanner(System.in);

        System.out.println("Gosta de música sertaneja?\n" + 
        "Gosta de futebol?\n" + 
        "Gosta de seriados?\n" + 
        "Gosta de redes sociais?\n" +
        "Gosta da Oktoberfest?\n" + 
        "------------------------");
        System.out.println("Responda as perguntas com SIM, NÃO ou IND (indiferente):");
        for (int i = 0; i < resposta1.length; i++) {
            System.out.print("Pergunta " + (i+1) + ": ");
            resposta1[i] = sc.next().toUpperCase().charAt(0);
        }

        System.out.println("Responda as perguntas com SIM, NÃO ou IND (indiferente):");
        for (int i = 0; i < resposta2.length; i++) {
            System.out.print("Pergunta " + (i+1) + ": ");
            resposta2[i] = sc.next().toUpperCase().charAt(0);
        }

        sc.close();

        float afinidade = 0;
        for (int i = 0; i < resultado.length; i++) {
        if (resposta1[i] == resposta2[i]) {
            afinidade += 3;
        } else if (resposta1[i] == 'I' && resposta2[i] == 'S' || resposta1[i] == 'I' && resposta2[i] == 'N') {
            afinidade += 1;
        } else if (resposta2[i] == 'I' && resposta1[i] == 'S' || resposta2[i] == 'I' && resposta1[i] == 'N') {
            afinidade += 1;
        } else if (resposta1[i] == 'S' && resposta2[i] == 'N' || resposta2[i] == 'S' && resposta1[i] == 'N') {
            afinidade += -2;
        }
        }

        if (afinidade == 15) {
            System.out.println("Casem!");
        } else if (afinidade <= 14 && afinidade >= 10) {
            System.out.println("Vocês têm muita coisa em comum!");
        } else if (afinidade <= 9 && afinidade >= 5) {
            System.out.println("Talvez não dê certo :(");
        } else if (afinidade <= 4 && afinidade >= 0) {
            System.out.println("Vale um encontro.");
        } else if (afinidade <= -1 && afinidade >= -9) {
            System.out.println("Melhor não perder tempo");
        } else if (afinidade <= -10) {
            System.out.println("Vocês se odeiam!");
        }

    
    }
    public static void main(String[] args) {
        new Exe5Uni6();
    }
}
