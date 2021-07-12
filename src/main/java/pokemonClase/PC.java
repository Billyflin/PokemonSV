package pokemonClase;

import java.util.ArrayList;


public class PC {
    private final ArrayList<Pokemon> pokemones = new ArrayList<>();
    private final ArrayList<Objeto> objetos = new ArrayList<>();
    
    public void añadir(Pokemon p){
        pokemones.add(p);
    }
    
    public void añadir(Objeto o){
        objetos.add(o);
    }

    public ArrayList<Pokemon> getPokemones() {
        return pokemones;
    }

    public ArrayList<Objeto> getObjetos() {
        return objetos;
    }
    
    public Pokemon seleccionarPokemon(int i){
        Pokemon p = pokemones.get(i);
        pokemones.remove(i);
        return p;
    }
    
    public Objeto seleccionarObjeto(int i){
        Objeto o = objetos.get(i);
        objetos.remove(i);
        return o;
    }
}
