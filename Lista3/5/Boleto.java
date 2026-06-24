package JAVA2;

public class Boleto implements FormaPagamento {

    @Override
    public void efetuarPagamento(double valor) {
        System.out.println("Boleto gerado no valor de R$ " + valor);
    }
}