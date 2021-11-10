package streamAPI;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamAPI {
    public static void main(String[] args) {
        List<String> estudantes = new ArrayList<>();
        estudantes.add("Poliane");
        estudantes.add("Leandro");
        estudantes.add("Marcos");
        estudantes.add("Marcos");
        estudantes.add("Raniery");
        estudantes.add("Nayara");
        estudantes.add("Amanda");
        estudantes.add("Sabrina");
        estudantes.add("Thiago");

        //Retorna a contagem de elementos do sistema
        System.out.println("contagem: " + estudantes.stream().count());

        //Retorna o elemento com maior numero de letras
        System.out.println("Maior numero de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));

        //Retorna o elemento com menor numero de letras
        System.out.println("Menor numero de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));

        //Retorna os elementos que tem a letra R no nome
        System.out.println("Com letra r no nome: " + estudantes.stream().filter(estudante ->
                estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        //Retorna uma nova coleção, com os nomes concatenados a quantidade de letra de cada nome
        System.out.println("Retorna uma nova coleçao com a quantidade de letras: " + estudantes.stream().map(estudante ->
                estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        //Retorna somente os 3 primeiros elementos da coleção
        System.out.println("Retorna os 3 primeiros elementos: " + estudantes.stream().limit(3).collect(Collectors.toList()));

        //Exibe cada elemento no console, e depois retorna a mesma coleção
        System.out.println("Retorna os elementos: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        //Exibe cada elemento no console sem retorna outra coleção
        System.out.println("Retorna os elementos novamente: ");
        estudantes.stream().forEach(System.out::println);

        //Retorna true se todos os elementos possuem a letra W no nome
        System.out.println("Tem algum elemento com w no nome? " + estudantes.stream().allMatch(elemento -> elemento.contains("w")));

        //Retorna true se algum dos elementos possuem a letra a minúsculo no nome
        System.out.println("Tem algum elemento com a minúsculo no nome? " + estudantes.stream().anyMatch(elemento -> elemento.contains("a")));

        //Retorna true se nenhum elemento possuir a letra a minúsculo no nome
        System.out.println("Nenhum elementos apresenta a lentra a minúsculo no nome? " + estudantes.stream().noneMatch(elemeto -> elemeto.contains("a")));

        //Retorna o primeiro elemento da coleção, se existir exibe a coleção
        System.out.println("Retorna o primeiro elemento da coleção: " + estudantes.stream().findFirst().isPresent());

        //Exemplo de operaç~çao encadeada
        System.out.println("Operação encadeada");
        System.out.println(
                estudantes.stream()
                        .peek(System.out::println)
                        .map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length())))
                        .peek(System.out::println)
                        .filter(estudante -> estudante.toLowerCase().contains("r"))
                        //.collect(Collectors.toList()));
                        //.collect(Collectors.joining(" ,")));
                        //.collect(Collectors.toSet()));
                        .collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf("4") + 1))));
    }
}
