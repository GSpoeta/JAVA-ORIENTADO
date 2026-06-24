package UNO;

public class PlanoPro extends Assinatura {

    public PlanoPro(int numeroUsuarios) {
        super(numeroUsuarios);
    }

    @Override
    public double calcularMensalidade() {

        double total = 20.00 * numeroUsuarios;

        if (numeroUsuarios > 10) {
            total = total * 0.90;
        }

        return total;
    }
}