import java.util.Scanner;

public class Exe9Uni5 {
    public Exe9Uni5() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de alunos:");
        int n = sc.nextInt();

        int quantidade20 = 0;

        for (int cont = 1; cont <= n; cont ++) {
            System.out.println("Digite os nomes alunos:");
            String nome = sc.nextLine();
            System.out.println("Digite as idades dos alunos");
            int idade = sc.nextInt();
        
            if (idade == 18) {
                System.out.println(nome);
            } else if (idade > 20) {
                quantidade20 += cont;
                System.out.println(quantidade20);
            }
        
        }

        


        sc.close();
    }
    public static void main(String[] args) {
        new Exe9Uni5();
    }
}
