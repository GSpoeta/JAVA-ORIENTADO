package JAVA24;

import java.util.Scanner;

public class MainPedidos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Carrinho carrinho = new Carrinho();

        System.out.print("Nome do produto: ");
        String nome = sc.nextLine();

        System.out.print("Preço: ");
        double preco = sc.nextDouble();

        Eletronico produto = new Eletronico(nome, preco);

        produto.adicionarAoCarrinho(carrinho);

        sc.close();
    }
}