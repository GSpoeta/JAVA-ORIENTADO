package JAVA222;

import java.util.Scanner;

public class Sabre {

    String cor;
    boolean emiteSom;
    boolean ligado;

    public Sabre(String cor, boolean emiteSom) {
        this.cor = cor;
        this.emiteSom = emiteSom;
        this.ligado = false;
    }

    public void ligar() {
        ligado = true;

        if (emiteSom) {
            System.out.println("Vrummm! Seu sabre de luz emitiu som de batalha!");
        }
    }

    public void desligar() {
        ligado = false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Cor do sabre:");
        String cor = sc.nextLine();

        System.out.println("Emite som? (true/false)");
        boolean emiteSom = sc.nextBoolean();

        Sabre sabre = new Sabre(cor, emiteSom);

        sabre.ligar();

        sc.close();
    }
}