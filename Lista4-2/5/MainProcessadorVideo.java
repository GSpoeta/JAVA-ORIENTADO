package JAVA2;

import java.util.Scanner;

public class MainProcessadorVideo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do arquivo de vídeo: ");
        String arquivo = sc.nextLine();

        System.out.println("\n=== TIPO DE PROCESSAMENTO ===");
        System.out.println("1 - Alta Definição");
        System.out.println("2 - Mobile");
        System.out.println("3 - Apenas Áudio");

        System.out.print("Escolha uma opção: ");
        int opcao = sc.nextInt();

        ProcessadorVideo processador;

        switch (opcao) {
            case 1:
                processador = new ProcessadorAltaDefinicao();
                break;

            case 2:
                processador = new ProcessadorMobile();
                break;

            case 3:
                processador = new ProcessadorApenasAudio();
                break;

            default:
                System.out.println("Opção inválida!");
                sc.close();
                return;
        }

        processador.processar(arquivo);

        sc.close();
    }
}