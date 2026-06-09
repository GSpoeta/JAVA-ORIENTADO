import java.util.Scanner;

public class Carro {

    String marca;
    String modelo;
    int ano;
    boolean ligado;

    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        ligado = false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Carro carro = new Carro();

        System.out.print("Marca: ");
        carro.marca = sc.nextLine();

        System.out.print("Modelo: ");
        carro.modelo = sc.nextLine();

        System.out.print("Ano: ");
        carro.ano = sc.nextInt();

        carro.ligar();
        System.out.println("Carro ligado: " + carro.ligado);

        carro.desligar();
        System.out.println("Carro ligado: " + carro.ligado);

        sc.close();
    }
}