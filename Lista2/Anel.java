package JAVA222;

import java.util.Scanner;

public class Anel {

    String material;
    int tamanhoAro;
    boolean inscricaoVisivel;

    public Anel(String material, int tamanhoAro) {
        this.material = material;
        this.tamanhoAro = tamanhoAro;
        this.inscricaoVisivel = false;
    }

    public void jogarNoFogo() {

        inscricaoVisivel = true;

        System.out.println("Um Anel para a todos governar, Um Anel para encontrá-los...");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Material: ");
        String material = sc.nextLine();

        System.out.print("Tamanho do aro: ");
        int tamanhoAro = sc.nextInt();

        Anel anel = new Anel(material, tamanhoAro);

        System.out.println("\n=== RÉPLICA DO ANEL ÚNICO ===");
        System.out.println("Material: " + anel.material);
        System.out.println("Tamanho do aro: " + anel.tamanhoAro);
        System.out.println("Inscrição visível: " + anel.inscricaoVisivel);

        System.out.println("\nJogando o anel no fogo...");
        anel.jogarNoFogo();

        System.out.println("Inscrição visível: " + anel.inscricaoVisivel);

        sc.close();
    }
}