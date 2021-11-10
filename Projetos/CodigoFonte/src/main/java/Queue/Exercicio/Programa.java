package Queue.Exercicio;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Programa {
    public static void main(String[] args) {
        Queue<String> nomes = new LinkedList<>();
        //1
        nomes.add("Julia");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        //2
        Iterator<String> iterator = nomes.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();
        //3
        System.out.println(nomes.peek());
        System.out.println(nomes);
        //4
        System.out.println(nomes.poll());
        System.out.println(nomes);
        System.out.println();
        //5
        nomes.add("Daniel");
        System.out.println(nomes);
        iterator = nomes.iterator();
        int count = 0;
        while(iterator.hasNext()){
            if (iterator.next() == "Daniel"){
                System.out.println(count);
            }
            count++;
        }
        //6
        System.out.println(nomes.size());
        //7
        System.out.println(nomes.isEmpty());
        System.out.println(nomes.contains("Carlos"));
    }
}
