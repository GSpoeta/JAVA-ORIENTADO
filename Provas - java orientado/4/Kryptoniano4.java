package provaa;

public class Kryptoniano4 extends heroi4 implements voo4 {

    public Kryptoniano4(String nome) {
        super(nome);
    }

    @Override
    public void voar() {
        System.out.println(nome +
                " ergueu o punho e levantou voo para os céus em super velocidade!");
    }
}