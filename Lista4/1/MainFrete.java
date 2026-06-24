package UNO;

import java.util.Scanner;

public class MainFrete {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a distância: ");
        double distancia = sc.nextDouble();

        System.out.print("Digite o peso: ");
        double peso = sc.nextDouble();

        System.out.println("1 - Padrão");
        System.out.println("2 - Expresso");
        int opcao = sc.nextInt();

        Frete frete;

        if (opcao == 1) {
            frete = new FretePadrao(distancia, peso);
        } else {
            frete = new FreteExpresso(distancia, peso);
        }

        System.out.println("Valor do frete: R$ " + frete.calcularCusto());

        sc.close();
    }
}