package JAVA24;

import java.util.ArrayList;

public class Carrinho implements CarrinhoCompras {

    private ArrayList<Produto> produtos = new ArrayList<>();

    @Override
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println(produto.obterNome() + " adicionado ao carrinho.");
    }
}