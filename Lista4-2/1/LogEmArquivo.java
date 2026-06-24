package JAVA2;

public class LogEmArquivo extends RegistradorLog {

    @Override
    public void gravar(String acao) {
        System.out.println("Salvando em Arquivo de Texto: " + acao);
    }

}