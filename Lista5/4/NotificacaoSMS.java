package JAVA2;

public class NotificacaoSMS extends Notificacao {

    public NotificacaoSMS(String mensagem, String destinatario) {
        super(mensagem, destinatario);
    }

    @Override
    public void enviar() {

        if (mensagem.length() <= 160) {
            System.out.println("SMS enviado para " + destinatario);
            System.out.println("Mensagem: " + mensagem);
        } else {
            System.out.println("Erro: SMS excede 160 caracteres.");
        }
    }
}