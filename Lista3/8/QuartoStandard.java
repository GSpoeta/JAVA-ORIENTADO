package JAJA;

public class QuartoStandard implements Quarto {

    @Override
    public String obterTipo() {
        return "Standard";
    }

    @Override
    public double obterPrecoDiaria() {
        return 150;
    }

    @Override
    public void reservar() {
        System.out.println("Quarto Standard reservado.");
    }
}