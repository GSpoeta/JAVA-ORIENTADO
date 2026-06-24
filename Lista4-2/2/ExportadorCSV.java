package JAVA2;

public class ExportadorCSV extends Exportador {

    @Override
    public void exportar(String dados) {
        System.out.println("Convertendo dados para CSV: " + dados);
    }

}