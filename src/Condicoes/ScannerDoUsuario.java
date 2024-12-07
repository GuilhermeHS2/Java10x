package Condicoes;
import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {

        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = caixaDeTexto.nextLine();
        System.out.println("Olá, " + nome);

        System.out.print("Digite sua idade: ");
        int idade = caixaDeTexto.nextInt();
        System.out.println("Olá " + nome + " sua idade é " + idade);

        if (idade >= 18) {
            System.out.println("Ouu voce tem mais de 18, pode fazer missos de rank b");
        } else {
            System.out.println("Voce nao é maior de idade, nao pode ir para missoes fora da aldeia");
        }


        caixaDeTexto.close();
    }
}
