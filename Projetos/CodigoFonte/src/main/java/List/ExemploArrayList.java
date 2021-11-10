package List;

import java.util.*;

public class ExemploArrayList {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Poliane");
        lista.add("Anna");
        lista.add("Amanda");
        lista.add("Leticia");
        lista.add("Paula");
        lista.add("Juliana");
        System.out.println("Métodos");
        System.out.println("lista " + lista);
        Collections.sort(lista);//Ordenação simples por texto

        System.out.println("lista.sort() :" + lista);

        lista.set(1,"Ana"); //Método de atulização no index desejado
        System.out.println("lista.set(1,'Ana') " + lista);

        lista.remove(1); //Remoção do elemento 1
        System.out.println("lista.remove(1) " + lista);

        lista.remove("Juliana"); //Remoção do elemento juliana
        System.out.println("lista.remove('juliana') " + lista);

        System.out.println("lista.get(0) " + lista.get(0)); //Retorna o elemnto da lista na posição desejada

        System.out.println("lista.size() " + lista.size());

        System.out.println("lista.contains('Anderson') " + lista.contains("Anderson"));

        System.out.println("lista.isEmpty() " + lista.isEmpty());

        System.out.println("lista.indexOf('Poliane'): " + lista.indexOf("Poliane"));

        lista.clear();//Limpa a lista
        System.out.println("lista.clear()");

        System.out.println();
        System.out.println("Formas de declarar listas");
        List<String > nomes = Arrays.asList("Bruno", "Bruna","Marcos","Morone","Keliye","Jovan");
        List<String> sobrenomes = List.of("Souza","Martin", "Correio", "Coelho", "Pinheiro", "Jordan");
        System.out.println();

        System.out.println("Formas de percorrer uma lista");

        System.out.println("Foreach");
        for(String nome: nomes){
            System.out.println(nome);
        }
        System.out.println();

        System.out.println("For");
        for (int i =0; i < sobrenomes.size(); i++){
            System.out.println(sobrenomes.get(i));
        }
        System.out.println();

        System.out.println("Interator");
        Iterator<String> iterator =  nomes.iterator();
        while(iterator.hasNext()){ //retorna true se houver obj
            System.out.println(iterator.next()); //Retorna o objeto da interacao
        }

    }
}
