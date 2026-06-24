package UNO;

public class FreteExpresso extends Frete {

    public FreteExpresso(double distanciaEmKm, double peso) {
        super(distanciaEmKm, peso);
    }

    @Override
    public double calcularCusto() {
        return (1.20 * distanciaEmKm) + (2.00 * peso);
    }
}