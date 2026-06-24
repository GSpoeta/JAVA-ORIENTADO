package UNO;

import java.util.Scanner;

public class MainSeguro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade do cliente: ");
        int idade = sc.nextInt();

        System.out.print("Digite o valor da cobertura: ");
        double valorCobertura = sc.nextDouble();

        System.out.println("\n1 - Seguro Standard");
        System.out.println("2 - Seguro Premium");
        System.out.print("Escolha uma opção: ");
        int opcao = sc.nextInt();

        SeguroVida seguro;

        if (opcao == 1) {
            seguro = new SeguroStandard(idade, valorCobertura);
        } else {
            seguro = new SeguroPremium(idade, valorCobertura);
        }

        System.out.println("Prêmio anual: R$ " + seguro.calcularPremio());

        sc.close();
    }
}