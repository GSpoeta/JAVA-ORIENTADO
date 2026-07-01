package JAVA2;

public class CarroVIP extends Veiculo {

    private boolean ofereceAgua;

    public CarroVIP(String placa, int anoFabricacao, boolean ofereceAgua) {
        super(placa, anoFabricacao);
        this.ofereceAgua = ofereceAgua;
    }

    @Override
    public double calcularTaxaUso() {
        return super.calcularTaxaUso() + 15;
    }

    public void exibirBeneficios() {
        if (ofereceAgua) {
            System.out.println("O motorista oferece água.");
        } else {
            System.out.println("O motorista não oferece água.");
        }
    }
}