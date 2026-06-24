package UNO;

public class Motociclo extends Veiculo {

    public Motociclo() {
        super(0);
    }

    @Override
    public double calcularTarifa() {
        return 1.50;
    }
}