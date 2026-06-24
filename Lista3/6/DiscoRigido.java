package JAVA23;

public class DiscoRigido implements DispositivoArmazenamento {

    private String dados;

    @Override
    public void armazenarDados(String dados) {
        this.dados = dados;
    }

    @Override
    public String recuperarDados() {
        return dados;
    }
}