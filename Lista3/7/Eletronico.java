package JAVA24;

public class Eletronico implements Produto {

    private String nome;
    private double preco;

    public Eletronico(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String obterNome() {
        return nome;
    }

    @Override
    public double obterPreco() {
        return preco;
    }

    @Override
    public void adicionarAoCarrinho(CarrinhoCompras carrinho) {
        carrinho.adicionarProduto(this);
    }
}