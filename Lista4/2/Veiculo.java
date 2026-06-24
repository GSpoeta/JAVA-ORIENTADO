package UNO;

public abstract class Veiculo {

    protected int numeroEixos;

    public Veiculo(int numeroEixos) {
        this.numeroEixos = numeroEixos;
    }

    public abstract double calcularTarifa();
}