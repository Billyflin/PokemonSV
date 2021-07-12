package pokemonClase;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pancho
 */
public class Lider extends Entrenador{
    private final String medalla;

    public Lider(String medalla, String nombre, int edad) {
        super(nombre, edad);
        this.medalla = medalla;
    }
    
    
    public void entregarMedalla(Entrenador e){
        e.añadirMedalla(medalla);
        System.out.println("la medalla ha sido entregada");
    }
    
}
