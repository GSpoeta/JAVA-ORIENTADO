package JAVA2;

import java.util.Scanner;

public class PrincipalConta {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Número da conta: ");
        String numero = sc.nextLine();

        ContaCorrente conta = new ContaCorrente(numero, 0, 500);

        System.out.print("Valor para depósito: ");
        double deposito = sc.nextDouble();
        conta.depositar(deposito);

        System.out.print("Valor para saque: ");
        double saque = sc.nextDouble();
        conta.sacar(saque);

        System.out.println("Saldo atual: R$ " + conta.getSaldo());

        sc.close();
    }
}