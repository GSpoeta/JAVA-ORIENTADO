package JAVA2;

import java.util.Scanner;

public class MainDispositivo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Televisão");
        System.out.println("2 - Rádio");
        System.out.println("3 - Celular");

        int opcao = sc.nextInt();

        if (opcao == 1) {

            Televisao tv = new Televisao();
            tv.ligar();
            System.out.println(tv.obterStatus());

        } else if (opcao == 2) {

            Radio radio = new Radio();
            radio.ligar();
            System.out.println(radio.obterStatus());

        } else if (opcao == 3) {

            Celular celular = new Celular();
            celular.ligar();
            System.out.println(celular.obterStatus());

        } else {
            System.out.println("Opção inválida.");
        }

        sc.close();
    }
}