package JAVA2;

public class ExportadorPDF extends Exportador {

    @Override
    public void exportar(String dados) {
        System.out.println("Gerando páginas e bloqueando edição para: " + dados);
    }

}