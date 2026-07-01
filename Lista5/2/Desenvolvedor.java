package JAVA2;

public class Desenvolvedor extends Funcionario {

    private double bonusPorProjeto;

    public Desenvolvedor(String nome, double salarioBase, double bonusPorProjeto) {
        super(nome, salarioBase);
        this.bonusPorProjeto = bonusPorProjeto;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonusPorProjeto;
    }
}