package JAVA222;

import java.util.Scanner;

public class Carta {

    String nome;
    String tipo;
    int hp;

    public Carta() {
        nome = "Pikachu";
        tipo = "Elétrico";
        hp = 60;
    }

    public Carta(String nome, String tipo, int hp) {
        this.nome = nome;
        this.tipo = tipo;
        this.hp = hp;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do Pokémon:");
        String nome = sc.nextLine();

        System.out.println("Tipo:");
        String tipo = sc.nextLine();

        System.out.println("HP:");
        int hp = sc.nextInt();

        Carta carta = new Carta(nome, tipo, hp);

        System.out.println("Nome: " + carta.nome);
        System.out.println("Tipo: " + carta.tipo);
        System.out.println("HP: " + carta.hp);

        sc.close();
    }
}