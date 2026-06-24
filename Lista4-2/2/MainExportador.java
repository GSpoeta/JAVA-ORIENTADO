package JAVA2;

import java.util.Scanner;

public class MainExportador {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o texto do relatório: ");
        String dados = sc.nextLine();

        System.out.println("\nFormato");
        System.out.println("1 - PDF");
        System.out.println("2 - CSV");
        System.out.println("3 - JSON");

        int opcao = sc.nextInt();

        Exportador exportador;

        switch (opcao) {
            case 1:
                exportador = new ExportadorPDF();
                break;
            case 2:
                exportador = new ExportadorCSV();
                break;
            case 3:
                exportador = new ExportadorJSON();
                break;
            default:
                System.out.println("Opção inválida!");
                sc.close();
                return;
        }

        exportador.exportar(dados);

        sc.close();
    }
}