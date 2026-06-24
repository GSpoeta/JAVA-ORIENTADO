package JAVA2;

public class ProcessadorAltaDefinicao extends ProcessadorVideo {

    @Override
    public void processar(String nomeArquivo) {
        System.out.println("Processando vídeo em Alta Definição: " + nomeArquivo);
    }

}