import java.util.Scanner;

public class TrabalhoFinal {
    public TrabalhoFinal() {
        Scanner sc = new Scanner(System.in);

        char agua[][] = new char[8][8];

        for (int i = 0; i < agua.length; i++) { //Linhas
            for (int j = 0; j < agua[i].length; j++) { //Colunas
                agua[i][j] = '~';
                System.out.print(agua[i][j] + " ");
            }
            System.out.println("");
        }


        sc.close();
    }

    private void inicializacaoTabuleiro(char agua[]) {
        
}

    private void posicionamnetoNavios() {

}

    private void interacaoJogador() {

}

    private void feedbackAtaque() {

}

    private void condicaoVitoria() {
    
}

    public static void main(String[] args) {
        new TrabalhoFinal();
    }
}
