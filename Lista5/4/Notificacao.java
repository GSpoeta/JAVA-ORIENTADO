package JAVA2;

public class Notificacao {

    protected String mensagem;
    protected String destinatario;

    public Notificacao(String mensagem, String destinatario) {
        this.mensagem = mensagem;
        this.destinatario = destinatario;
    }

    public void enviar() {
        System.out.println("Enviando notificação genérica.");
    }
}