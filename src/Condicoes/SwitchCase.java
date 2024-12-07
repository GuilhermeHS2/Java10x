package Condicoes;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um Personagem:  ");
        System.out.println("1 - Naruto");
        System.out.println("2 - Boruto");
        System.out.println("3 - Sasuke");

        int escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Naruto");
                break;
            case 2:
               System.out.println("Boruto");
                 break;
            case 3:
                System.out.println("Sasuke");
                break;

            default:
                System.out.println("Escolha umas das 3 opcoes validas");


        }



        sc.close();
    }
}
