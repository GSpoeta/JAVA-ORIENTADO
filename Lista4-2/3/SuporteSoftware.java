package JAVA2;

public class SuporteSoftware extends TratamentoChamado {

    @Override
    public void encaminhar(String descricaoProblema) {
        System.out.println("Encaminhando para equipe de Software: " + descricaoProblema);
    }

}