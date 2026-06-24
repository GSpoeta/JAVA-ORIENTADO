package JAVA2;

public class ExportadorJSON extends Exportador {

    @Override
    public void exportar(String dados) {
        System.out.println("Convertendo dados para JSON: " + dados);
    }

}