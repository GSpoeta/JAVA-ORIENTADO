package JAVA2;

public class ProcessadorMobile extends ProcessadorVideo {

    @Override
    public void processar(String nomeArquivo) {
        System.out.println("Comprimindo vídeo para poupar dados móveis: " + nomeArquivo);
    }

}