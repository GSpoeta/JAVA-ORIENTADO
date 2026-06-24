package UNO;

public abstract class SeguroVida {

    protected int idade;
    protected double valorCobertura;

    public SeguroVida(int idade, double valorCobertura) {
        this.idade = idade;
        this.valorCobertura = valorCobertura;
    }

    public abstract double calcularPremio();
}