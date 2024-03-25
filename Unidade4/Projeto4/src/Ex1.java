package Unidade4.Projeto4.src;

import java.util.Scanner;

public class Ex1 {
    public Ex1() {
        Scanner sc = new Scanner(System.in);

        boolean testeDengue = sc.nextBoolean();

        if (testeDengue) {
            System.out.println("É dengue");
        }

        if(!testeDengue) {
            System.out.println("Não é dengue");
        }


        sc.close();
    }
    public static void main(String[] args) {
        
    }
    
}
