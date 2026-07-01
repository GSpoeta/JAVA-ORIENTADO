package JAVA2;

public class Assinatura {

    protected String emailUsuario;
    protected double valorMensal;

    public Assinatura(String emailUsuario, double valorMensal) {
        this.emailUsuario = emailUsuario;
        this.valorMensal = valorMensal;
    }

    public void exibirBeneficios() {
        System.out.println("E-mail: " + emailUsuario);
        System.out.println("Mensalidade: R$ " + valorMensal);
    }
}