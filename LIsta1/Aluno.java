package JAVA22;

import java.util.Scanner;

public class Aluno {

    String nome;
    int matricula;
    double[] notas;

    public double calcularMedia() {

        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        return soma / notas.length;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("Nome: ");
        aluno.nome = sc.nextLine();

        System.out.print("Matrícula: ");
        aluno.matricula = sc.nextInt();

        aluno.notas = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            aluno.notas[i] = sc.nextDouble();
        }

        System.out.println("Média: " + aluno.calcularMedia());

        sc.close();
    }
}