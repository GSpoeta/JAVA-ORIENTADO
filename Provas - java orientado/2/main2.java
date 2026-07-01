package provaa;

import java.util.Scanner;

public class main2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do Jedi: ");
        String nome = sc.nextLine();

        System.out.print("Digite o nível da Força: ");
        int nivel = sc.nextInt();

        sc.nextLine(); 

        System.out.print("Digite a cor do sabre: ");
        String cor = sc.nextLine();

        sub2 mestre = new sub2(nome, nivel, cor);

        System.out.println("\n=== CAMINHO DA FORÇA ===");
        System.out.println("Nome: " + mestre.nome);
        System.out.println("Nível da Força: " + mestre.nivelDaForca);
        System.out.println("Cor do Sabre: " + mestre.getCorDoSabre());

        System.out.println();
        mestre.usarAForca();


    }
}