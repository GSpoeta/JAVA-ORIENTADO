package UNO;

public class Caminhao extends Veiculo {

    public Caminhao(int numeroEixos) {
        super(numeroEixos);
    }

    @Override
    public double calcularTarifa() {
        return 3.00 * numeroEixos;
    }
}