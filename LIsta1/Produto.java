package JAVA22;

import java.util.Scanner;

public class Produto {

    String nome;
    double preco;
    int quantidadeEmEstoque;

    public void vender(int quantidade) {

        if (quantidade <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= quantidade;
        }
    }

    public void reporEstoque(int quantidade) {
        quantidadeEmEstoque += quantidade;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.print("Nome do produto: ");
        produto.nome = sc.nextLine();

        System.out.print("Preço: ");
        produto.preco = sc.nextDouble();

        System.out.print("Quantidade em estoque: ");
        produto.quantidadeEmEstoque = sc.nextInt();

        System.out.print("Quantidade vendida: ");
        produto.vender(sc.nextInt());

        System.out.println("Estoque atual: " + produto.quantidadeEmEstoque);

        System.out.print("Quantidade para reposição: ");
        produto.reporEstoque(sc.nextInt());

        System.out.println("Estoque final: " + produto.quantidadeEmEstoque);

        sc.close();
    }
}