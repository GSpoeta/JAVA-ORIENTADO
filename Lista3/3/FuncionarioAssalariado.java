package JAVA2222;

public class FuncionarioAssalariado implements Pagavel {

    private double salario;

    public FuncionarioAssalariado(double salario) {
        this.salario = salario;
    }

    @Override
    public double calcularPagamento() {
        return salario;
    }
}