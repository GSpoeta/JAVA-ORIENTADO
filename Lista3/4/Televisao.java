package JAVA2;

public class Televisao implements DispositivoEletronico {

    private boolean ligada;

    @Override
    public void ligar() {
        ligada = true;
    }

    @Override
    public void desligar() {
        ligada = false;
    }

    @Override
    public String obterStatus() {
        return ligada ? "Ligada" : "Desligada";
    }
}