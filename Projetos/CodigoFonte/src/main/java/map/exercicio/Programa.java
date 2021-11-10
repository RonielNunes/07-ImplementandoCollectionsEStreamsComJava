package map.exercicio;

public class Programa {
    public static void main(String[] args) {
        MapWithHashMap map = new MapWithHashMap();
        //adicionando estados
        map.adicionarCidade("Acre", "SC");
        map.adicionarCidade("Alagoas", "AL");
        map.adicionarCidade("Amapá", "AP");
        map.adicionarCidade("Amazonas", "AM");
        map.adicionarCidade("Bahia", "BA");
        map.adicionarCidade("Ceará", "CE");
        map.adicionarCidade("Espírito", "ES");
        map.adicionarCidade("Goiás", "GO");
        map.adicionarCidade("Maranhão", "MA");
        map.adicionarCidade("Mato Grosso", "MT");
        map.adicionarCidade("Mato Grosso do Sul", "MS");
        map.adicionarCidade("Minas Gerais", "MG");
        map.adicionarCidade("Pará", "PA");
        map.adicionarCidade("Paraíba", "PB");
        map.adicionarCidade("Paraná", "PR");
        map.adicionarCidade("Pernambuco", "PE");
        map.adicionarCidade("Piauí", "PI");
        map.adicionarCidade("Rio de Janeiro", "RJ");
        map.adicionarCidade("Rio Grande do Norte", "RN");
        map.adicionarCidade("Rio Grando do Sul", "RS");
        map.adicionarCidade("Rondônia", "RO");
        map.adicionarCidade("Roraima", "RR");
        map.adicionarCidade("Santa Catarina", "SC");
        map.adicionarCidade("São Paulo", "SP");
        map.adicionarCidade("Sergipe", "SE");
        map.adicionarCidade("Tocantins", "TO");

        //2
        System.out.println("REMOVE KEY: " + map.removeKey("Minas Gerais"));
        //3
        map.adicionarCidade("Distrito Federal", "DF");
        //3
        System.out.println("TAMANHO: " + map.tamnho());
        //4
        System.out.println("REMOVE KEY: " + map.removeKey("Mato Grosso do Sul"));
        //5
        map.exibeSigla();
        //6
        System.out.println("Verifica valor: " + map.verificaValor("SC"));
        //7
        System.out.println("Verifica key: "+  map.verificaKey("Maranhão"));

    }


}
