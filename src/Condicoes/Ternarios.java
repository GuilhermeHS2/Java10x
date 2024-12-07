package Condicoes;

public class Ternarios {
    public static void main(String[] args) {
        short numeroDeMissoes = 1;
        String nivelDoNinja = (numeroDeMissoes >= 10) ? "Esse ninja esta com mais de 10 missoes" : "Esse ninja esta com menos de 10 missos";
        System.out.println(nivelDoNinja);
    }
}
