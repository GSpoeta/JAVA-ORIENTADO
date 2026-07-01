package JAVA2;

public class ContaCorrente extends ContaBancaria {

    private double limiteChequeEspecial;

    public ContaCorrente(String numeroConta, double saldo, double limiteChequeEspecial) {
        super(numeroConta, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo + limiteChequeEspecial) {
            saldo -= valor;
            System.out.println("Saque realizado utilizando saldo/cheque especial.");
        } else {
            System.out.println("Saldo + limite insuficientes.");
        }
    }
}