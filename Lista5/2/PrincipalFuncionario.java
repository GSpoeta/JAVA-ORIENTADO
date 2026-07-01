package JAVA2;

import java.util.Scanner;

public class PrincipalFuncionario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do desenvolvedor: ");
        String nome = sc.nextLine();

        System.out.print("Salário base: ");
        double salario = sc.nextDouble();

        System.out.print("Bônus recebido: ");
        double bonus = sc.nextDouble();

        Desenvolvedor dev = new Desenvolvedor(nome, salario, bonus);

        System.out.println("\nResumo do pagamento");
        System.out.println("Nome: " + nome);
        System.out.println("Salário final: R$ " + dev.calcularSalario());

        sc.close();
    }
}