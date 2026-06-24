package JAVA23;

import java.util.Scanner;

public class MainArmazenamento {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Disco Rígido");
        System.out.println("2 - Pen Drive");
        System.out.println("3 - Nuvem");

        int opcao = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite os dados: ");
        String dados = sc.nextLine();

        if (opcao == 1) {

            DiscoRigido disco = new DiscoRigido();
            disco.armazenarDados(dados);
            System.out.println(disco.recuperarDados());

        } else if (opcao == 2) {

            PenDrive pen = new PenDrive();
            pen.armazenarDados(dados);
            System.out.println(pen.recuperarDados());

        } else if (opcao == 3) {

            Nuvem nuvem = new Nuvem();
            nuvem.armazenarDados(dados);
            System.out.println(nuvem.recuperarDados());

        } else {
            System.out.println("Opção inválida.");
        }

        sc.close();
    }
}