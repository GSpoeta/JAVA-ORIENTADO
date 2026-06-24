package JAJA;

import java.util.Scanner;

public class MainHotel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Standard");
        System.out.println("2 - Luxo");
        System.out.println("3 - Suite");

        int opcao = sc.nextInt();

        switch (opcao) {

            case 1:
                QuartoStandard q1 = new QuartoStandard();
                System.out.println(q1.obterTipo());
                System.out.println("R$ " + q1.obterPrecoDiaria());
                q1.reservar();
                break;

            case 2:
                QuartoLuxo q2 = new QuartoLuxo();
                System.out.println(q2.obterTipo());
                System.out.println("R$ " + q2.obterPrecoDiaria());
                q2.reservar();
                break;

            case 3:
                Suite q3 = new Suite();
                System.out.println(q3.obterTipo());
                System.out.println("R$ " + q3.obterPrecoDiaria());
                q3.reservar();
                break;

            default:
                System.out.println("Opção inválida.");
        }

        sc.close();
    }
}