package UNO;

public class SeguroStandard extends SeguroVida {

    public SeguroStandard(int idade, double valorCobertura) {
        super(idade, valorCobertura);
    }

    @Override
    public double calcularPremio() {

        double premio = valorCobertura * 0.05;

        if (idade > 50) {
            premio += 200.00;
        }

        return premio;
    }
}