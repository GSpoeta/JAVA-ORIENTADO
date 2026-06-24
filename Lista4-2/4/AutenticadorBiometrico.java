package JAVA2;

public class AutenticadorBiometrico extends Autenticador {

    @Override
    public void validarAcesso(String credencial) {
        System.out.println("Lendo impressão digital para a credencial: " + credencial);
    }

}