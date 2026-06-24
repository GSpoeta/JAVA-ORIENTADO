package JAVA2;

import java.util.Scanner;

public class MainAutenticador {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== SISTEMA DE LOGIN ===");
        System.out.println("1 - Senha");
        System.out.println("2 - Biometria");
        System.out.println("3 - Token");

        System.out.print("Escolha uma opção: ");
        int opcao = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite sua credencial: ");
        String credencial = sc.nextLine();

        Autenticador autenticador;

        switch (opcao) {
            case 1:
                autenticador = new AutenticadorSenha();
                break;

            case 2:
                autenticador = new AutenticadorBiometrico();
                break;

            case 3:
                autenticador = new AutenticadorToken();
                break;

            default:
                System.out.println("Opção inválida!");
                sc.close();
                return;
        }

        autenticador.validarAcesso(credencial);

        sc.close();
    }
}