package JAVA22;

import java.util.Scanner;

public class ContaBancaria {

    String numeroConta;
    double saldo;
    String titular;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria();

        System.out.print("Titular: ");
        conta.titular = sc.nextLine();

        System.out.print("Número da conta: ");
        conta.numeroConta = sc.nextLine();

        System.out.print("Saldo inicial: ");
        conta.saldo = sc.nextDouble();

        System.out.print("Valor para depósito: ");
        conta.depositar(sc.nextDouble());

        System.out.println("Saldo após depósito: " + conta.saldo);

        System.out.print("Valor para saque: ");
        conta.sacar(sc.nextDouble());

        System.out.println("Saldo final: " + conta.saldo);

        sc.close();
    }
}