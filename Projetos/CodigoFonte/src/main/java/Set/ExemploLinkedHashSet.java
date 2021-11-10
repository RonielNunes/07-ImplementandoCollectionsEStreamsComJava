package Set;


import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> sequenciaNumerica= new LinkedHashSet<>();

        //Adicionando os números no LHS
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(5);
        sequenciaNumerica.add(6);
        sequenciaNumerica.add(7);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(9);
        sequenciaNumerica.add(9);

        System.out.println(sequenciaNumerica);

        //Remove o número do set
        sequenciaNumerica.remove(9);

        //Retorna a quantidade de elementos
        System.out.println(sequenciaNumerica.size());
        System.out.println();

        //Navega em todos os itens do iterator
        Iterator<Integer> iterator = sequenciaNumerica.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();
        for(Integer numero: sequenciaNumerica){
            System.out.println(numero);
        }
        System.out.println();

        //Retorna se o set está vazio ou não
        System.out.println(sequenciaNumerica.isEmpty());

    }
}
