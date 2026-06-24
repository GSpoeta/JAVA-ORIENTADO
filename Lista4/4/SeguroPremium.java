package UNO;

public class SeguroPremium extends SeguroVida {

    public SeguroPremium(int idade, double valorCobertura) {
        super(idade, valorCobertura);
    }

    @Override
    public double calcularPremio() {
        return valorCobertura * 0.08;
    }
}