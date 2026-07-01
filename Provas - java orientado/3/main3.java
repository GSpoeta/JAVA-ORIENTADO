package provaa;

import java.util.Scanner;

public class main3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== TRANSFORMERS BATTLE SYSTEM ===");
        System.out.println("Escolha seu robô:");
        System.out.println("1 - Optimus");
        System.out.println("2 - Bumblebee");
        System.out.println("3 - Megatron");

        System.out.print("Opção: ");
        int opcao = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o nome do robô: ");
        String nome = sc.nextLine();

        ex3 robo;

        if (opcao == 1) {
            robo = new Optimus3(nome);
        } else if (opcao == 2) {
            robo = new Bumblebee3(nome);
        } else {
            robo = new Megatron3(nome);
        }

        System.out.println("\n=== INICIANDO TRANSFORMAÇÃO ===\n");

        robo.transformar();


    }
}