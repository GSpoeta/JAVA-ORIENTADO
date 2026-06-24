package JAVA2222;

import java.util.Scanner;

public class MainPagavel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Funcionário Horista");
        System.out.println("2 - Funcionário Assalariado");

        System.out.print("Escolha: ");
        int opcao = sc.nextInt();

        if (opcao == 1) {

            System.out.print("Horas trabalhadas: ");
            double horas = sc.nextDouble();

            System.out.print("Valor por hora: ");
            double valorHora = sc.nextDouble();

            FuncionarioHorista funcionario =
                    new FuncionarioHorista(horas, valorHora);

            System.out.println("Pagamento: R$ "
                    + funcionario.calcularPagamento());

        } else if (opcao == 2) {

            System.out.print("Salário: ");
            double salario = sc.nextDouble();

            FuncionarioAssalariado funcionario =
                    new FuncionarioAssalariado(salario);

            System.out.println("Pagamento: R$ "
                    + funcionario.calcularPagamento());

        } else {
            System.out.println("Opção inválida.");
        }

        sc.close();
    }
}