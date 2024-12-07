package Desafios;

public class Desafio01 {
    public static void main(String[] args) {


    String nome1 = "Naruto";
    String nome2 = "Sasuke";
    String nome3 = "Sakura";

    int idade1 = 15;
    int idade2 = 16;
    int idade3 = 17;

    String nomeDaMissao = "Vila da nevoa";
    String nivelDificuldade = "B";
    String status = "Em andamento";


    System.out.println("Os Ninjas" + nome1 + nome2 + nome3 + "Vao pegar uma missao de rank" + nivelDificuldade);

    System.out.println("quem nao tiver idade nao vai na missao");

        if (idade1 >= 15) {
            System.out.println("Missao inconcluida O ninja Naruto nao tem idade para concluir essa missao");
        } else if (idade2 >= 16) {
            System.out.println("Missao Concluida");
        } else if (idade3 >= 17) {
            System.out.println("Missao Concluida");
        }

    }
}
