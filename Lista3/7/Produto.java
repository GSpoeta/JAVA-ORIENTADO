package JAVA24;

public interface Produto {

    String obterNome();

    double obterPreco();

    void adicionarAoCarrinho(CarrinhoCompras carrinho);
}