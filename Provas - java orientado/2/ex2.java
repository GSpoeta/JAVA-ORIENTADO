package provaa;

public class ex2 {

    protected String nome;
    protected int nivelDaForca;

    public ex2(String nome, int nivelDaForca) {
        this.nome = nome;
        this.nivelDaForca = nivelDaForca;
    }

    public void usarAForca() {
        System.out.println(nome + " O sabre esta ligado a sua força pequno jedi ");
    }
}