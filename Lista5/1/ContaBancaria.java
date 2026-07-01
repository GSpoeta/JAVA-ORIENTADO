package JAVA2;

public class ContaBancaria {

    protected String numeroConta;
    protected double saldo;

    public ContaBancaria(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado!");
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado!");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}