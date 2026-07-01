package provaa;

import java.util.Scanner;

public class main5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a madeira da varinha: ");
        String madeira = sc.nextLine();

        System.out.print("Digite o núcleo da varinha: ");
        String nucleo = sc.nextLine();

        Varinha5 varinha = new Varinha5(madeira, nucleo);

        System.out.print("Digite o nome do bruxo: ");
        String nome = sc.nextLine();

        Bruxo5 bruxo = new Bruxo5(nome, varinha);

        System.out.println("\n=== MUNDO DA MAGIA ===\n");

        bruxo.lancarFeitico("Expelliarmus");

        sc.close();
    }
}