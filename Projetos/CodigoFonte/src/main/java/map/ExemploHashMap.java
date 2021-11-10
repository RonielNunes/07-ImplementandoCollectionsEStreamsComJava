package map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {
        Map<String, Integer> campeoesMundialFifa = new HashMap<>();
        //Adiciona os campeões mundiais fifa no mapa
        campeoesMundialFifa.put("Brasil",5);
        campeoesMundialFifa.put("Alemanha",4);
        campeoesMundialFifa.put("Itália",4);
        campeoesMundialFifa.put("Uruguai",5);
        campeoesMundialFifa.put("Argentina",5);
        campeoesMundialFifa.put("França",2);
        campeoesMundialFifa.put("Inglaterra",1);
        campeoesMundialFifa.put("Espanha",1);

        System.out.println(campeoesMundialFifa);
        //Atualiza o valor para a chave Brasil
        campeoesMundialFifa.put("Brasil",6);
        System.out.println(campeoesMundialFifa);
        System.out.println();

        //Retorna a argentina
        System.out.println(campeoesMundialFifa.get("Argentina"));
        System.out.println();

        //Retorna se existe ou não um campeão França
        System.out.println(campeoesMundialFifa.containsKey("França"));

        //Remove o campeão frança
        campeoesMundialFifa.remove("França");
        System.out.println(campeoesMundialFifa);

        //Retorna se tem o valor 6
        System.out.println(campeoesMundialFifa.containsValue(6));

        //Retorna o tamanho
        System.out.println(campeoesMundialFifa.size());

        //Navega pelos registros

        for (Map.Entry<String,Integer> entry: campeoesMundialFifa.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println();
        for(String key: campeoesMundialFifa.keySet()){
            System.out.println(key + " " + campeoesMundialFifa.get(key));
        }
    }
}
