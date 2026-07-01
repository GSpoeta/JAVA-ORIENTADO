package provaa;

public class sub2 extends ex2 {

    private String corDoSabre;

    public sub2(String nome, int nivelDaForca, String corDoSabre) {
        super(nome, nivelDaForca);
        this.corDoSabre = corDoSabre;
    }

    public String getCorDoSabre() {
        return corDoSabre;
    }
}