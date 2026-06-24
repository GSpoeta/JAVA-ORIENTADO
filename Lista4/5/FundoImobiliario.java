package UNO;

public class FundoImobiliario extends Investimento {

    public FundoImobiliario(double valorInicial, int meses) {
        super(valorInicial, meses);
    }

    @Override
    public double calcularRendimento() {
        return (valorInicial * 0.012 * meses) - (15.00 * meses);
    }
}