package UNO;

public class PlanoEnterprise extends Assinatura {

    public PlanoEnterprise(int numeroUsuarios) {
        super(numeroUsuarios);
    }

    @Override
    public double calcularMensalidade() {
        return 500.00;
    }
}