package map.exercicio;

import java.util.HashMap;
import java.util.Map;

public class MapWithHashMap {
    //<key, valor>
    //<cidade, estado>
    private Map<String,String> cidades;

    MapWithHashMap(){
        cidades = new HashMap<>();
    }

    public void adicionarCidade(final String key, final String valor){
        cidades.put(key,valor);
    }

    public boolean removeKey(final String key){
        if(cidades.containsKey(key)){
            cidades.remove(key);
            return true;
        }else{
            return false;
        }

    }

    public boolean removeValor(final String valor){
        for (String key: cidades.keySet()){
            if(cidades.get(key) == valor){
                cidades.remove(key);
                return true;
            }
        }
        return false;

    }

    public int tamnho(){
        return cidades.size();
    }

    public void exibeSigla(){
        for (Map.Entry<String,String> entry: cidades.entrySet()){
            System.out.println(entry.getValue());
        }
    }
    public boolean verificaKey(final String key){
        if(cidades.containsKey(key)){
            return true;
        }else{
            return false;
        }
    }
    public boolean verificaValor(final String valor){
        for(String key: cidades.keySet()){
            if(cidades.get(key) == valor){
                return true;
            }
        }
        return false;
    }
}
