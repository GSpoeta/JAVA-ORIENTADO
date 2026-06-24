package JAVA2;

public class LogNaNuvem extends RegistradorLog {

    @Override
    public void gravar(String acao) {
        System.out.println("Salvando na Nuvem: " + acao);
    }

}