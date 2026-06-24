package JAVA2;

import java.util.Scanner;

public class MainLog {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a ação realizada: ");
        String acao = sc.nextLine();

        System.out.println("\nDestino do Log");
        System.out.println("1 - Arquivo");
        System.out.println("2 - Banco de Dados");
        System.out.println("3 - Nuvem");

        int opcao = sc.nextInt();

        RegistradorLog log;

        switch (opcao) {
            case 1:
                log = new LogEmArquivo();
                break;
            case 2:
                log = new LogEmBancoDeDados();
                break;
            case 3:
                log = new LogNaNuvem();
                break;
            default:
                System.out.println("Opção inválida!");
                sc.close();
                return;
        }

        log.gravar(acao);

        sc.close();
    }
}