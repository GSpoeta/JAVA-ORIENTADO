package UNO;

import java.util.Scanner;

public class MainVeiculo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Motociclo");
        System.out.println("2 - Carro Ligeiro");
        System.out.println("3 - Caminhão");

        int opcao = sc.nextInt();

        Veiculo veiculo;

        if (opcao == 1) {

            veiculo = new Motociclo();
            
            

        } else if (opcao == 2) {

            veiculo = new CarroLigeiro();

        } else {

            System.out.print("Número de eixos: ");
            int eixos = sc.nextInt();

            veiculo = new Caminhao(eixos);
        }

        System.out.println("Tarifa: R$ " + veiculo.calcularTarifa());

        sc.close();
    }
}