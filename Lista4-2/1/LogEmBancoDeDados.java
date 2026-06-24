package JAVA2;

public class LogEmBancoDeDados extends RegistradorLog {

    @Override
    public void gravar(String acao) {
        System.out.println("Salvando no Banco de Dados: " + acao);
    }

}