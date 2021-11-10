package List.ExercicioFinal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Programa {
    public static void main(String[] args) {
        //List<String> nomes = Arrays.asList("Oi","Tudo");
        //List<String> nomes = List.Set("Nomes");
        List<String> nomes = new ArrayList<>();

        //Adicionando 5 nomes:
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        //Exibir nomes no console
        nomes.stream().forEach(nome -> System.out.println(nome + " "));

        //Susbstituir o nome de carlos por Robert
        alterarNome(nomes,"Carlos","Roberto");

        //Retorna o nome da posição 1
        System.out.println(nomes.get(1));

        //Remover o nome da posição 4
        nomes.remove(4);

        //Remover o nome João
        nomes.remove("João");

        //Quantidade de itens na lista
        System.out.println(nomes.size());

        //Juliano esta na lista?
        System.out.println(nomes.contains("Juliano"));

        //Nova  lista
        List<String> nomesNovos = new ArrayList<>();

        nomesNovos = nomes.stream().collect(Collectors.toList());
        nomesNovos.add("Ismael");
        nomesNovos.add("Rodrigo");

        //Verificar se tá vázia
        System.out.println(nomes.isEmpty());

        System.out.println(nomes);
        System.out.println();
        System.out.println(nomesNovos);


    }

    public static void alterarNome(List<String> nomes, final String nome, final String novoNome){
        for(int i = 0; i < nomes.size(); i++){
            if(nomes.get(i).equals(nome)){
                nomes.set(i,novoNome);
            }
        }
    }

}
