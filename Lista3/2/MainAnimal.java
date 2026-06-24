package JAVA2222;

import java.util.Scanner;

public class MainAnimal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Cachorro");
        System.out.println("2 - Gato");
        System.out.println("3 - Vaca");
        System.out.print("Escolha um animal: ");

        int opcao = sc.nextInt();

        switch (opcao) {

            case 1:
                Cachorro cachorro = new Cachorro();
                cachorro.emitirSom();
                break;

            case 2:
                Gato gato = new Gato();
                gato.emitirSom();
                break;

            case 3:
                Vaca Vaca = new Vaca();
                Vaca.emitirSom();
                break;

            default:
                System.out.println("Opção inválida.");
        }

        sc.close();
    }
}