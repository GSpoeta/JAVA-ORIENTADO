package provaa;

import java.util.Scanner;

public class main1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do personagem: ");
        String nome = sc.nextLine();

        
        ex1 personagem = new ex1(nome, 50);

        System.out.println("\n=== ROLETA RUSSA ===");
        System.out.println("Personagem: " + personagem.getNome());
        System.out.println("Vida inicial: "
                + personagem.getPontosDeVida());

        System.out.print("\nDigite um número de 1 a 50: ");
        int numero = sc.nextInt();

        while (numero < 1 || numero > 50) {
            System.out.print("Número inválido! Digite de 1 a 50: ");
            numero = sc.nextInt();
        }

        if (numero < 25) {

            System.out.println("\nBANG!");
            System.out.println("Você levou um tiro!");

            personagem.receberDano(51);

        } else if (numero == 25) {

            System.out.println("\nCLICK!");
            System.out.println("A bala falhou!");

        } else {

            System.out.println("\nCLICK!");
            System.out.println("A câmara estava vazia!");
        }

        
        System.out.println("\nVida atual: "
                + personagem.getPontosDeVida());

    }
}