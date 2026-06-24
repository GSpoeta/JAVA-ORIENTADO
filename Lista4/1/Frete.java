package UNO;

public abstract class Frete {

    protected double distanciaEmKm;
    protected double peso;

    public Frete(double distanciaEmKm, double peso) {
        this.distanciaEmKm = distanciaEmKm;
        this.peso = peso;
    }

    public abstract double calcularCusto();
}