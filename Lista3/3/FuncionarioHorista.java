package JAVA2222;

public class FuncionarioHorista implements Pagavel {

    private double horasTrabalhadas;
    private double valorHora;

    public FuncionarioHorista(double horasTrabalhadas, double valorHora) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularPagamento() {
        return horasTrabalhadas * valorHora;
    }
}