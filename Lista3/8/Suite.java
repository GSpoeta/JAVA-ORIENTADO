package JAJA;

public class Suite implements Quarto {

    @Override
    public String obterTipo() {
        return "Suíte";
    }

    @Override
    public double obterPrecoDiaria() {
        return 500;
    }

    @Override
    public void reservar() {
        System.out.println("Suíte reservada.");
    }
}