package JAVA2;

import java.util.Scanner;

public class PrincipalAssinatura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu e-mail: ");
        String email = sc.nextLine();

        PlanoPremium premium = new PlanoPremium(email, 59.90, true);

        premium.exibirBeneficios();

        sc.close();
    }
}