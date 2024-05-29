import java.util.Scanner;

public class zExe9 {
    public zExe9() {
    Scanner sc = new Scanner(System.in);

    int notasHomens[] = new int[30];
    int notasMulheres[] = new int[30];
    int idadesMulheres[] = new int[30];
    
    inicializarVetores(notasMulheres, notasHomens, idadesMulheres);
    ler(sc, notasMulheres, notasHomens, idadesMulheres);
    
    sc.close();
}

private int quantidadeValores(int vetor[]) {
    int quantidade = 0;
    for (int i = 0; i < vetor.lenght; i++) {
        if (vetor[i] != -1) {
            
        }
    }
}

private inicializarVetores(int mulheres[], int homens[], int idadeMulheres[]) {
    for (int i = 0; i < mulheres.length; i++) {

    }
}

private void ler(Scanner sc, int mulheres[], int homens[], int idadeMulheres[]) {
    int qtdHomens = 0;
    int qtdMulheres = 0;
    
    System.out.println("Iniciando preenchimento das 30 pessoas");
    for (int i = 0; i < 5; i++) {
        System.out.print("Sexo (1-F ou 2-M):");
        int sexo = sc.nextInt();
        System.out.print("Nota (0 a 10):");
        int nota = sc.nextInt();
        System.out.print("Idade:");
    }
        
      }


    public static void main(String[] args) {
        new zExe9();
    }
}
