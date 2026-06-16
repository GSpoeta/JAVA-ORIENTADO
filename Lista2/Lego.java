package JAVA222;

import java.util.Scanner;

public class Lego {

    private int totalPecas;
    private int pecasMontadas;
    private boolean manualDisponivel;

    public int getTotalPecas() {
        return totalPecas;
    }

    public void setTotalPecas(int totalPecas) {
        this.totalPecas = totalPecas;
    }

    public int getPecasMontadas() {
        return pecasMontadas;
    }

    public void setPecasMontadas(int pecasMontadas) {
        this.pecasMontadas = pecasMontadas;
    }

    public boolean getManualDisponivel() {
        return manualDisponivel;
    }

    public void setManualDisponivel(boolean manualDisponivel) {
        this.manualDisponivel = manualDisponivel;
    }

    public void exibirProgresso() {

        System.out.println("=== PROGRESSO DA MONTAGEM ===");
        System.out.println("Peças montadas: " + pecasMontadas);
        System.out.println("Total de peças: " + totalPecas);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Lego lego = new Lego();

        System.out.println("Total de peças:");
        lego.setTotalPecas(sc.nextInt());

        System.out.println("Peças montadas:");
        lego.setPecasMontadas(sc.nextInt());

        System.out.println("Manual disponível? (true/false)");
        lego.setManualDisponivel(sc.nextBoolean());

        lego.exibirProgresso();

        sc.close();
    }
}