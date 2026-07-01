package JAVA2;

import java.util.Scanner;

public class PrincipalVeiculo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Placa do carro: ");
        String placa = sc.nextLine();

        System.out.print("Ano de fabricação: ");
        int ano = sc.nextInt();

        sc.nextLine();

        System.out.print("Oferece água? (sim/nao): ");
        String resposta = sc.nextLine();

        boolean agua = resposta.equalsIgnoreCase("sim");

        CarroVIP carro = new CarroVIP(placa, ano, agua);

        carro.exibirBeneficios();

        System.out.println("Taxa final: R$ " + carro.calcularTaxaUso());

        sc.close();
    }
}