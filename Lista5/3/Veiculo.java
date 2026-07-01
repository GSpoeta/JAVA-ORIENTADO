package JAVA2;

public class Veiculo {

    protected String placa;
    protected int anoFabricacao;

    public Veiculo(String placa, int anoFabricacao) {
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
    }

    public double calcularTaxaUso() {
        return 10.0;
    }
}