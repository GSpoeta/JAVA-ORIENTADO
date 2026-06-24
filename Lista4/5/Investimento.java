package UNO;

public abstract class Investimento {

    protected double valorInicial;
    protected int meses;

    public Investimento(double valorInicial, int meses) {
        this.valorInicial = valorInicial;
        this.meses = meses;
    }

    public abstract double calcularRendimento();
}