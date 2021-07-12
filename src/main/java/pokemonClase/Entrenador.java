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
public class Entrenador extends Persona{

    private final ArrayList<Pokemon> pokemones = new ArrayList<>();
    private final ArrayList<String> medallas = new ArrayList<>();
    private final ArrayList<Objeto> mochila = new ArrayList<>();
    private final PC pc;
    private String profesión;
            
    public Entrenador(String nombre, int edad) {
        super(nombre, edad);
        pc = new PC();
    }

    public Entrenador(PC pc, String profesión, String nombre, int edad) {
        super(nombre, edad);
        this.pc = pc;
        this.profesión = profesión;
    }

    public Entrenador(PC pc, String profesión, String nombre, int edad, String descripción, String ubicación) {
        super(nombre, edad, descripción, ubicación);
        this.pc = pc;
        this.profesión = profesión;
    }
    
    
    public void capturar(Pokemon p){
        if(pokemones.size()<6){
            pokemones.add(p);
        }else{
            System.out.println("no se puede ingresar pokemon");
            pc.añadir(p);
        }
    }

    public ArrayList<Pokemon> getPokemones() {
        return pokemones;
    }

    public void añadirMedalla(String medalla) {
        medallas.add(medalla);
    }

    public void mostrarMedallas() {
        System.out.println("Las medallas obtenidas son: ");
        System.out.println(medallas);
    }
    
    
    
}
