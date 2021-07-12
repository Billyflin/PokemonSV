package pokemonClase;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pancho
 */
public class Enfermera extends Persona{

    public Enfermera(String nombre, int edad) {
        super(nombre, edad);
    }
    
    public void mejorar(Pokemon p){
        p.setHp(100);
        p.setEstado("saludable");
    }
    
    public void mejorar(ArrayList<Pokemon> p){
        for (Pokemon pokemon : p) {
            mejorar(pokemon);
        }
    }
    
}
