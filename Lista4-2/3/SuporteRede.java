package JAVA2;

public class SuporteRede extends TratamentoChamado {

    @Override
    public void encaminhar(String descricaoProblema) {
        System.out.println("Encaminhando para equipe de Rede: " + descricaoProblema);
    }

}