package JAVA22;

import java.util.Scanner;

public class Pessoa {

    String nome;
    int idade;
    double altura;

    public void apresentar() {
        System.out.println("Nome: " + nome);
       
        
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura + "m");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pessoa p = new Pessoa();

        System.out.print("Digite o nome: ");
        p.nome = sc.nextLine();

        System.out.print("Digite a idade: ");
        p.idade = sc.nextInt();

        System.out.print("Digite a altura: ");
        p.altura = sc.nextDouble();

        p.apresentar();

        sc.close();
    }
}

