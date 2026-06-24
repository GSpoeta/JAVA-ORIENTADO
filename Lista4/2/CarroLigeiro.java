package UNO;

public class CarroLigeiro extends Veiculo {

    public CarroLigeiro() {
        super(0);
    }

    @Override
    public double calcularTarifa() {
        return 3.00;
    }
}