package Set.Exercicio;

import java.util.*;

public class Programa {
    public static void main(String[] args) {
        Set<Integer> lista = new HashSet<>();
        //1
        lista.add(3);
        lista.add(88);
        lista.add(44);
        lista.add(3);

        System.out.println(lista);
        //2
        Iterator<Integer> iterator = lista.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();
        //3
        lista.remove(3);
        System.out.println(lista);
        System.out.println();
        //4
        lista.add(23);
        System.out.println(lista);
        System.out.println();
        //5
        System.out.println(lista.size());
        //6
        System.out.println(lista.isEmpty());


    }
}
