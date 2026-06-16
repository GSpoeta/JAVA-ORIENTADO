package JAVA222;

import java.util.Scanner;

public class Gamer {

    private String processador;
    private int memoriaRAM;
    private boolean rgbLigado;

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public boolean getRgbLigado() {
        return rgbLigado;
    }

    public void setRgbLigado(boolean rgbLigado) {
        this.rgbLigado = rgbLigado;
    }

    public void ativarModoOverclock() {

        rgbLigado = true;

        System.out.println("\n=== MODO OVERCLOCK ATIVADO ===");
        System.out.println("Processador: " + processador);
        System.out.println("Memória RAM: " + memoriaRAM + " GB");
        System.out.println("RGB Ligado: " + rgbLigado);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Gamer pc = new Gamer();

        System.out.print("Processador: ");
        pc.setProcessador(sc.nextLine());

        System.out.print("Memória RAM (GB): ");
        pc.setMemoriaRAM(sc.nextInt());

        pc.ativarModoOverclock();

        sc.close();
    }
}