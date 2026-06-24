package JAVA2222;

import java.util.Scanner;

public class MainConta {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o saldo inicial: ");
        double saldo = sc.nextDouble();

        ContaCorrente conta = new ContaCorrente(saldo);

        System.out.print("Valor para depositar: ");
        double deposito = sc.nextDouble();

        conta.depositar(deposito);

        System.out.print("Valor para sacar: ");
        double saque = sc.nextDouble();

        conta.sacar(saque);

        System.out.println("Saldo final: R$ " + conta.getSaldo());

        sc.close();
    }
}