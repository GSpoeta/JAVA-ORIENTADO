package UNO;

public class PlanoBasic extends Assinatura {

    public PlanoBasic(int numeroUsuarios) {
        super(numeroUsuarios);
    }

    @Override
    public double calcularMensalidade() {
        return 10.00 * numeroUsuarios;
    }
}