package provaa;

public class ex1 {

    private String nome;
    private int pontosDeVida;

    public ex1(String nome, int pontosDeVida) {
        this.nome = nome;
        this.pontosDeVida = pontosDeVida;
    }

    public String getNome() {
        return nome;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public void receberDano(int dano) {

        pontosDeVida -= dano;

        if (pontosDeVida <= 0) {
            pontosDeVida = 0;
            System.out.println("O personagem " + nome + " foi derrotado!");
        } else {
            System.out.println("O personagem " + nome
                    + " sobreviveu e ficou com "
                    + pontosDeVida + " pontos de vida.");
        }
    }
}