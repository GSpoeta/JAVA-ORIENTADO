package JAVA2;

import java.util.Scanner;

public class MainPagamento {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Cartão");
        System.out.println("2 - Boleto");
        System.out.println("3 - Dinheiro");

        int opcao = sc.nextInt();

        System.out.print("Digite o valor: ");
        double valor = sc.nextDouble();

        switch (opcao) {

            case 1:
                CartaoCredito cartao = new CartaoCredito();
                cartao.efetuarPagamento(valor);
                break;

            case 2:
                Boleto boleto = new Boleto();
                boleto.efetuarPagamento(valor);
                break;

            case 3:
                Dinheiro dinheiro = new Dinheiro();
                dinheiro.efetuarPagamento(valor);
                break;

            default:
                System.out.println("Opção inválida.");
        }

        sc.close();
    }
}