import java.util.Scanner;

public class Exe34Uni5 {
    public Exe34Uni5() {
        Scanner sc = new Scanner(System.in);

        float precoDiaria = 50;
        float valorMais15Dias = 5;
        float valor15Dias = 6.50f;
        float valorMenos15Dias = 7.50f;

        int opcao = 0;
        do {
            System.out.println("Escolha uma opção: \r\n" +
            "(1) encerrar a conta de um hóspede;\r\n" + 
            "(2) verificar número de contas encerradas;\r\n" + 
            "(3) sair.");
            opcao = sc.nextInt();

            switch (opcao) {
                case '1':
                System.out.println("Digite o nome do hóspede");
                String nome = sc.next();
                System.out.println("Digite o número de diárias: ");
                int diarias = sc.nextInt();
                if(diarias > 15){
                    precoDiaria += (diarias * valorMais15Dias);
                    }	
                    else if(diarias == 15){
                    precoDiaria += (diarias * valor15Dias);
                    }
                    else{
                    precoDiaria += (diarias * valorMenos15Dias);
                    }
                System.out.println("O total a ser pago por " + nome + "é de R$ " + precoDiaria);
                    break;
            }
        } while (opcao != 3);

        
        sc.close();
    }
    public static void main(String[] args) {
        new Exe34Uni5();
    }
}
