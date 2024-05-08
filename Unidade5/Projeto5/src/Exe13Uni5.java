import java.util.Scanner;

public class Exe13Uni5 {
    public Exe13Uni5() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de paradas:");
        int QuantidaParadas = sc.nextInt();

        System.out.println("Digite o valor do odômetro antes da viagem:");
        float odometroAntesViagem = sc.nextFloat();

        for (int paradas = 0; paradas < QuantidaParadas; paradas++) {
            System.out.println("Digite o valor do odômetro:");
            float odometroDuranteViagem = sc.nextFloat();
            System.out.println("Digite a quantidade de combustível comprado:");
            float quantidadeCombustivel = sc.nextFloat();

            float quilometragemLitroParada = (odometroDuranteViagem - odometroAntesViagem) / quantidadeCombustivel;
            
        }


        sc.close();
        
    }
    public static void main(String[] args) {
        new Exe13Uni5();
    }
}
