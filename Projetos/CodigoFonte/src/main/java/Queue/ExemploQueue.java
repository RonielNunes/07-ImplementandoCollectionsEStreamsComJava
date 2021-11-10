package Queue;

import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class ExemploQueue {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.add("Patricia");
        fila.add("Roberto");
        fila.add("Flávio");
        fila.add("Pamela");
        fila.add("Anderson");

        System.out.println(fila);
        //FIFO

        //mostra e remove o first element in struct
        String clienteASerAtendido = fila.poll();
        System.out.println(clienteASerAtendido);
        System.out.println(fila);

        //fila.clear();

        //Retorna o primeiro elemento e não remove, se tiver vazio retorna null
        String primeiroCliente = fila.peek();
        System.out.println(primeiroCliente);
        System.out.println(fila);


        //retorna o primeiro elemento e não remove e retorna exception
        try{
            String primeiroClienteOuErro = fila.element();
            System.out.println(primeiroClienteOuErro);
            System.out.println(fila);
        }catch (NoSuchElementException e){
            System.out.println("Lista vazia");
            //e.printStackTrace();
        }

        Iterator<String> iterator = fila.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
