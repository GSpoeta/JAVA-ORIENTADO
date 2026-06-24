package JAVA2;

public class CartaoCredito implements FormaPagamento {

    @Override
    public void efetuarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado no cartão.");
    }
}