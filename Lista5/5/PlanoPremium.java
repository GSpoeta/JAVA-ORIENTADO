package JAVA2;

public class PlanoPremium extends Assinatura {

    private boolean qualidade4K;

    public PlanoPremium(String emailUsuario, double valorMensal, boolean qualidade4K) {
        super(emailUsuario, valorMensal);
        this.qualidade4K = qualidade4K;
    }

    @Override
    public void exibirBeneficios() {

        super.exibirBeneficios();

        if (qualidade4K) {
            System.out.println("Qualidade: 4K");
        }

        System.out.println("Sem anúncios.");
    }
}