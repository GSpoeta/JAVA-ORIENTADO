package JAVA2;

public class Dinheiro implements FormaPagamento {

    @Override
    public void efetuarPagamento(double valor) {
        System.out.println("Pagamento em dinheiro de R$ " + valor);
    }
}