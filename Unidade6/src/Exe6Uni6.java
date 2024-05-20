import java.util.Scanner;

public class Exe6Uni6 {
    public Exe6Uni6() {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de elementos: ");
        int tamanho = sc.nextInt();
        float vetor[] = new float[tamanho];


        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número [" + (i+1) + "]: ");
            vetor[i] = sc.nextFloat();
        }
        
        System.out.print("Informe um outro valor real: ");
        float outroValor = sc.nextFloat();
        float valorTem = 0;
        
        for (int i = 0; i < vetor.length; i++) {
        if (outroValor == vetor[i]) {
            valorTem = outroValor;
        } 
        }

        if (outroValor == valorTem) {
            System.out.println("Este valor se encontra cadastrado no vetor");
        } else {
            System.out.println("Este valor não se encontra cadastrado no vetor");
        }

        sc.close();
    }
    public static void main(String[] args) {
        new Exe6Uni6();
    }
}
