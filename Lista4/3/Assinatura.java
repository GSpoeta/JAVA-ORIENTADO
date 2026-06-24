package UNO;

public abstract class Assinatura {

    protected int numeroUsuarios;

    public Assinatura(int numeroUsuarios) {
        this.numeroUsuarios = numeroUsuarios;
    }

    public abstract double calcularMensalidade();
}