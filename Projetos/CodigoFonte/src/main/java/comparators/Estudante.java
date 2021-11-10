package comparators;

import org.jetbrains.annotations.NotNull;

public class Estudante implements Comparable<Estudante>{
    private final String nome;
    private final Integer idade;

    public Estudante(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome(){return nome;}
    public  Integer getIdade(){return idade;}

    @Override
    public String toString(){ return nome+  " " + idade; }

    @Override //ComparaTo retorna um inteiro 0 igusl -1 ou 1
    public int compareTo(@NotNull Estudante estudante) {
        return this.getIdade() - estudante.getIdade();
    }
}
