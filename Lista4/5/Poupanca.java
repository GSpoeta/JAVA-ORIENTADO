package UNO;

public class Poupanca extends Investimento {

    public Poupanca(double valorInicial, int meses) {
        super(valorInicial, meses);
    }

    @Override
    public double calcularRendimento() {
        return valorInicial * 0.005 * meses;
    }
}