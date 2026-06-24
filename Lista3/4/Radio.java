package JAVA2;

public class Radio implements DispositivoEletronico {

    private boolean ligado;

    @Override
    public void ligar() {
        ligado = true;
    }

    @Override
    public void desligar() {
        ligado = false;
    }

    @Override
    public String obterStatus() {
        return ligado ? "Ligado" : "Desligado";
    }
}