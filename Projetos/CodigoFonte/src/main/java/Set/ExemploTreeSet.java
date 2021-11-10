package Set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeCapitais = new TreeSet<>();

        treeCapitais.add("Belo Horizonte");
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de janeiro");

        System.out.println(treeCapitais);

        //Retorna a primeira capital no topo da árvore
        System.out.println(treeCapitais.first());

        //Retorna a última capital no final da árvore
        System.out.println(treeCapitais.last());

        //Retorna a primeira capital avaixo na árvore da capiral parametrizada
        System.out.println(treeCapitais.lower("São Paulo"));

        //Retorna a primeir capital acina na árvore da capital parametrizada
        System.out.println(treeCapitais.higher("São Paulo"));

        //Exibe todas as capitais no console
        System.out.println(treeCapitais);

        //Primeira retorna e removida do set
        System.out.println(treeCapitais.pollFirst());

        //Ultima retornana e remove do set
        System.out.println(treeCapitais.pollLast());

        //Exibe todas as capitais
        System.out.println(treeCapitais);

        Iterator<String> iterator = treeCapitais.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
