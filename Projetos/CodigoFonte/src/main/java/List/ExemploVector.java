package List;

import java.util.List;
import java.util.Vector;

public class ExemploVector {
    public static void main(String[] args) {
        List<String> esportes = new Vector<>();

        //Adicona 5 esportes no vector
        esportes.add("Futebol");
        esportes.add("Tênis de mesa");
        esportes.add("Ping pong");
        esportes.add("Basquetebol");
        esportes.add("Handebol");

        //Altera o valor da posição 2 do vector
        esportes.set(3,"Voleibol");

        //Remove o esporte da posição 4
        esportes.remove(4);
        esportes.remove("Tênis de mesa");

        //Retorna elemento do primeiro index
        System.out.println(esportes.get(0));
        System.out.println();

        //Navegando pelos esportes
        for(String esporte: esportes){
            System.out.println(esporte);
        }
    }
}
