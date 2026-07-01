package JAVA2;

import java.util.Scanner;

public class PrincipalNotificacao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Número do destinatário: ");
        String numero = sc.nextLine();

        System.out.print("Digite a mensagem: ");
        String mensagem = sc.nextLine();

        NotificacaoSMS sms = new NotificacaoSMS(mensagem, numero);

        sms.enviar();

        sc.close();
    }
}