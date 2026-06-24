package JAVA2;

public class SuporteHardware extends TratamentoChamado {

    @Override
    public void encaminhar(String descricaoProblema) {
        System.out.println("Enviando técnico fisicamente para avaliar: " + descricaoProblema);
    }

}