package JAVA22;

import java.util.Scanner;

public class Funcionario {

    String nome;
    double salario;
    String departamento;

    public void aumentarSalario(double percentual) {
        salario += salario * percentual / 100;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Funcionario f = new Funcionario();

        System.out.print("Nome: ");
        f.nome = sc.nextLine();

        System.out.print("Departamento: ");
        f.departamento = sc.nextLine();

        System.out.print("Salário: ");
        f.salario = sc.nextDouble();

        System.out.print("Percentual de aumento: ");
        double percentual = sc.nextDouble();

        f.aumentarSalario(percentual);

        System.out.println("Novo salário: R$ " + f.salario);

        sc.close();
    }
}