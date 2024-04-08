import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe27Uni4 {
    public Exe27Uni4() {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Digite o horário de chegada: ");
        System.out.print("Hora(s): ");
        int horasChegada = sc.nextInt();
        System.out.print("Minuto(s): ");
        int minutosChegada = sc.nextInt();

        System.out.println("Digite o horário de saída: ");
        System.out.print("Hora(s): ");
        int horasSaida = sc.nextInt();
        System.out.print("Minuto(s): ");
        int minutosSaida = sc.nextInt();


        int horasEstacionado = (horasSaida - horasChegada);
        int minutosEstacionado = (minutosSaida - minutosChegada);
        System.out.println("tempo estacionado: " + horasEstacionado + "h" + minutosEstacionado);

        float valorPagar = 0;

        /*if (horasEstacionado <= 1 && minutosEstacionado < 30) {
            System.out.println("Preço a pagar: R$ 5,00");
        } else if (horasEstacionado <= 1 && minutosEstacionado >= 30) {
            System.out.println("Preço a pagar: R$ " + df.format((horasEstacionado + 1) * 5));
        } else if (horasEstacionado == 2 && minutosEstacionado < 30) {
            System.out.println("Preço a pagar: R$ " + df.format(horasEstacionado * 5));
        } else if (horasEstacionado == 2 && minutosEstacionado >= 30) {
            System.out.println("Preço a pagar: R$ " + df.format((horasEstacionado + 1) * 7.5));
        } else if (horasEstacionado == 3 && minutosEstacionado < 30) {
            System.out.println("Preço a pagar: R$ " + df.format(horasEstacionado * 7.5));
        } else if (horasEstacionado == 3 && minutosEstacionado >= 30) {
            System.out.println("Preço a pagar: R$ " + df.format((horasEstacionado + 1) * 7.5));
        } else if (horasEstacionado == 4 && minutosEstacionado < 30) {
            System.out.println("Preço a pagar: R$ " + df.format(horasEstacionado * 7.5));
        } else if (horasEstacionado == 4 && minutosEstacionado >= 30) {
            System.out.println("Preço a pagar: R$ " + df.format((horasEstacionado + 1) * 10));
        } else if (horasEstacionado >= 5 && minutosEstacionado < 30) {
            System.out.println("Preço a pagar: R$ " + df.format(horasEstacionado * 10));
        } else if (horasEstacionado >= 5 && minutosEstacionado >= 30) {
            System.out.println("Preço a pagar: R$ " + df.format((horasEstacionado + 1) * 10));
        } /* */

        if (minutosEstacionado >= 30) {
            horasEstacionado += 1;
        } 
        
        if (horasEstacionado == 0 || horasEstacionado == 1) {
            valorPagar = 5;
        } else if (horasEstacionado == 2) {
            valorPagar = 10;
        } else if (horasEstacionado == 3) {
            valorPagar = 22.5f;
        } else if (horasEstacionado == 4){
            valorPagar = 30;
        } else if (horasEstacionado >= 5) {
            valorPagar = horasEstacionado * 10;
        } 

        switch (horasEstacionado) {
            case 0: 
            case 1:
                valorPagar = 5;
                break;
            case 2:
                valorPagar = 10;
                break;
            case 3:
                valorPagar = 22.5f;
                break;
            case 4: 
                valorPagar = 30;
                break;
            default: //>=5
                int horasMais = horasEstacionado - 4;
                valorPagar = 30 + (10 * horasMais);
                break;
        }

        System.out.println("Preço a pagar: R$ " + df.format(valorPagar));

        sc.close();
    }
    public static void main(String[] args) {
        new Exe27Uni4();
    }
}
