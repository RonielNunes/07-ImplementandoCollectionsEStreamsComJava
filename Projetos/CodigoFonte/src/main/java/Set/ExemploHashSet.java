package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args) {
        Set<Double> notasAlunos = new HashSet<>();

        //Adiciona as notas no set
        notasAlunos.add(9.0);
        notasAlunos.add(8.0);
        notasAlunos.add(4.0);
        notasAlunos.add(3.0);
        notasAlunos.add(6.0);
        notasAlunos.add(7.0);
        notasAlunos.add(1.0);

        System.out.println(notasAlunos);

        //remove
        notasAlunos.remove(1.0);

        System.out.println(notasAlunos);

        //quantidade intes
        System.out.println(notasAlunos.size());

        //Navegando em todos os itens do iterator
        Iterator<Double> iterator = notasAlunos.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();
        for(Double nota : notasAlunos){
            System.out.println(nota);
        }
        System.out.println();

        //Limpa
        notasAlunos.clear();
        //Retorna se o set está vazio
        System.out.println(notasAlunos.isEmpty());

    }
}
