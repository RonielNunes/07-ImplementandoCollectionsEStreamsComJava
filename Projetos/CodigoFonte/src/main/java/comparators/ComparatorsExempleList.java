package comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExempleList {
    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();
        estudantes.add(new Estudante("Poliane",23));
        estudantes.add(new Estudante("Leandro",17));
        estudantes.add(new Estudante("Marcos",30));
        estudantes.add(new Estudante("Marcos",24));
        estudantes.add(new Estudante("Raniery",23));
        estudantes.add(new Estudante("Nayara",22));
        estudantes.add(new Estudante("Amanda",22));
        estudantes.add(new Estudante("Sabrina",21));
        estudantes.add(new Estudante("Thiago",19));

        System.out.println("Ordem da inserção");
        System.out.println(estudantes);

        estudantes.sort((first,second)->first.getIdade() - second.getIdade());
        System.out.println("Ordem natural dos números - idade");
        System.out.println(estudantes);

        estudantes.sort((first,second) -> second.getIdade() - first.getIdade());
        System.out.println("Ordem reversa do números - idade");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));

        System.out.println("Ordem natural dos números - method reference");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println("Ordem reversa dos números - method reference");
        System.out.println(estudantes);


        Collections.sort(estudantes);
        System.out.println("Interface Comparable");
        System.out.println(estudantes);

        Collections.sort(estudantes,new EstudanteOrdemIdadeReversaComparator());
        System.out.println("Interface Comparator");
        System.out.println(estudantes);
    }
}
