package UNO;

import java.util.Scanner;

public class MainAssinatura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de usuários: ");
        int usuarios = sc.nextInt();

        System.out.println("1 - Basic");
        System.out.println("2 - Pro");
        System.out.println("3 - Enterprise");

        int opcao = sc.nextInt();

        Assinatura assinatura;

        if (opcao == 1) {
            assinatura = new PlanoBasic(usuarios);
        } else if (opcao == 2) {
            assinatura = new PlanoPro(usuarios);
        } else {
            assinatura = new PlanoEnterprise(usuarios);
        }

        System.out.println("Mensalidade: R$ " + assinatura.calcularMensalidade());

        sc.close();
    }
}