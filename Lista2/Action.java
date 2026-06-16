package JAVA222;

import java.util.Scanner;

public class Action {

    private String personagem;
    private double tamanhoEmCm;
    private int condicaoPintura;

    public String getPersonagem() {
        return personagem;
    }

    public void setPersonagem(String personagem) {
        this.personagem = personagem;
    }

    public double getTamanhoEmCm() {
        return tamanhoEmCm;
    }

    public void setTamanhoEmCm(double tamanhoEmCm) {
        this.tamanhoEmCm = tamanhoEmCm;
    }

    public int getCondicaoPintura() {
        return condicaoPintura;
    }

    public void setCondicaoPintura(int nota) {

        if (nota >= 0 && nota <= 100) {
            condicaoPintura = nota;
        } else {
            condicaoPintura = 100;
            System.out.println("Valor inválido! Ajustado para 100.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Action boneco = new Action();

        System.out.println("Personagem:");
        boneco.setPersonagem(sc.nextLine());

        System.out.println("Tamanho em cm:");
        boneco.setTamanhoEmCm(sc.nextDouble());

        System.out.println("Condição da pintura (0 a 100):");
        boneco.setCondicaoPintura(sc.nextInt());

        System.out.println("Personagem: " + boneco.getPersonagem());
        System.out.println("Tamanho: " + boneco.getTamanhoEmCm() + " cm");
        System.out.println("Condição: " + boneco.getCondicaoPintura());

        sc.close();
    }
}
