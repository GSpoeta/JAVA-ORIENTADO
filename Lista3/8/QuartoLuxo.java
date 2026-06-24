package JAJA;

public class QuartoLuxo implements Quarto {

    @Override
    public String obterTipo() {
        return "Luxo";
    }

    @Override
    public double obterPrecoDiaria() {
        return 300;
    }

    @Override
    public void reservar() {
        System.out.println("Quarto Luxo reservado.");
    }
}