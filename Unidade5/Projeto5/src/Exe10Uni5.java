public class Exe10Uni5 {
    public Exe10Uni5() {

        int valorVariavel = 20;
        int conta = 0;

        for (int contador = 0; contador < 10; contador++) {
            conta = valorVariavel + 25;
            conta *= conta;
            System.out.println(conta);
            valorVariavel += 10;
            valorVariavel += 40;
        }
    }
    public static void main(String[] args) {
        new Exe10Uni5();
    }
}
