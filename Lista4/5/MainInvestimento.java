package UNO;

import java.util.Scanner;

public class MainInvestimento {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do investimento: ");
        double valor = sc.nextDouble();

        System.out.print("Digite a quantidade de meses: ");
        int meses = sc.nextInt();

        System.out.println("\n1 - Poupança");
        System.out.println("2 - Fundo Imobiliário");
        System.out.print("Escolha uma opção: ");
        int opcao = sc.nextInt();

        Investimento investimento;

        if (opcao == 1) {
            investimento = new Poupanca(valor, meses);
        } else {
            investimento = new FundoImobiliario(valor, meses);
        }

        System.out.println("Rendimento obtido: R$ " + investimento.calcularRendimento());

        sc.close();
    }
}