package provaa;

public class Bruxo5 {

    private String nome;
    private Varinha5 varinha;

    public Bruxo5(String nome, Varinha5 varinha) {
        this.nome = nome;
        this.varinha = varinha;
    }

    public void lancarFeitico(String feitico) {
        System.out.println(nome +
                " agitou a sua varinha de " +
                varinha.getMadeira() +
                " e lançou: " +
                feitico + "!");
    }
}