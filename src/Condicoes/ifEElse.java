package Condicoes;

public class ifEElse {
    public static void main(String[] args) {


        String nome = "Naruto";
        int idade = 14;
        boolean hokage = false;
        short numeroDeMissoes = 11;
        String rank;


        //se (condicao) {faca isso}

        if (numeroDeMissoes > 10 && idade > 15  ) {
            System.out.println("Rank: Chunnin");

        } else if (numeroDeMissoes >= 20 ) {
            System.out.println("Rank: Jounin");
        }

        else {
            System.out.println("Rank: Gennim");
        }
    }
}
