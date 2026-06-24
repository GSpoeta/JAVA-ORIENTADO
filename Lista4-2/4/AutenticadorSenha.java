package JAVA2;

public class AutenticadorSenha extends Autenticador {

    @Override
    public void validarAcesso(String credencial) {
        System.out.println("Validando senha informada: " + credencial);
    }

}