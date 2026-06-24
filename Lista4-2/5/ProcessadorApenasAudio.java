package JAVA2;

public class ProcessadorApenasAudio extends ProcessadorVideo {

    @Override
    public void processar(String nomeArquivo) {
        System.out.println("Extraindo somente o áudio do arquivo: " + nomeArquivo);
    }

}