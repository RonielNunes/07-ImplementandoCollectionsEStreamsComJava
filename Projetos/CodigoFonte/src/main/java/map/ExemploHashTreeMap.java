package map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploHashTreeMap {
    public static void main(String[] args) {
        TreeMap<String,String> treeCapitais = new TreeMap<>();

        treeCapitais.put("MG","Belo Horizonte");
        treeCapitais.put("RS","Porto Alegre");
        treeCapitais.put("SC","Florianópolis");
        treeCapitais.put("PR","Curitiba");
        treeCapitais.put("SP","São Paulo");
        treeCapitais.put("RJ","Rio de janeiro");

        System.out.println(treeCapitais);

        //Retorna a primeira capital no topo da árvore
        System.out.println(treeCapitais.firstKey());

        //Retorna a última capital no final da árvore
        System.out.println(treeCapitais.lastKey());

        //Retorna a primeira capital avaixo na árvore da capiral parametrizada
        System.out.println(treeCapitais.lowerKey("PR"));

        //Retorna a primeir capital acina na árvore da capital parametrizada
        System.out.println(treeCapitais.higherKey("SP"));

        //Exibe todas as capitais no console
        System.out.println(treeCapitais);


        Map.Entry<String , String> firstEntry = treeCapitais.pollFirstEntry();

        Map.Entry<String , String> lastEntry =  treeCapitais.pollLastEntry();

        //Retorna a primeira capital no topo da árvore removendo do map
        System.out.println(firstEntry.getKey() + " " + firstEntry.getValue());

        //Reetorna a primeira capital no final da árvore removendo do map
        System.out.println(lastEntry.getKey() + " " + lastEntry.getValue());

        //Exibe todas as capitais
        System.out.println(treeCapitais);

        // Navega no map
        Iterator<String> iterator = treeCapitais.keySet().iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next() + " " + treeCapitais.get(iterator.next().toString()));
        }
        System.out.println();

        for(String capital : treeCapitais.keySet()){
            System.out.println(capital + " " + treeCapitais.get(capital));
        }
        System.out.println();

        for (Map.Entry<String, String> capital: treeCapitais.entrySet()){
            System.out.println(capital.getKey() + " " + capital.getValue());
        }


    }
}
