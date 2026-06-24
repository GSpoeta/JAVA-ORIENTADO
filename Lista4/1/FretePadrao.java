package UNO;

public class FretePadrao extends Frete {

    public FretePadrao(double distanciaEmKm, double peso) {
        super(distanciaEmKm, peso);
    }

    @Override
    public double calcularCusto() {
        return (0.50 * distanciaEmKm) + (1.00 * peso);
    }
}