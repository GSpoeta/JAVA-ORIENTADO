package JAVA2;

import java.util.Scanner;

public class MainChamado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Descreva o problema: ");
        String problema = sc.nextLine();

        System.out.println("\nCategoria");
        System.out.println("1 - Hardware");
        System.out.println("2 - Rede");
        System.out.println("3 - Software");

        int opcao = sc.nextInt();

        TratamentoChamado chamado;

        switch (opcao) {
            case 1:
                chamado = new SuporteHardware();
                break;
            case 2:
                chamado = new SuporteRede();
                break;
            case 3:
                chamado = new SuporteSoftware();
                break;
            default:
                System.out.println("Opção inválida!");
                sc.close();
                return;
        }

        chamado.encaminhar(problema);

        sc.close();
    }
}