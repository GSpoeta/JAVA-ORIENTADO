package JAVA2;

public class AutenticadorToken extends Autenticador {

    @Override
    public void validarAcesso(String credencial) {
        System.out.println("Validando token de acesso: " + credencial);
    }

}