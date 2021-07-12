package pokemonClase;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pancho
 */
public class Persona {
    private String nombre;
    private int edad;
    private String descripción;
    private String ubicación;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String nombre, int edad, String descripción, String ubicación) {
        this.nombre = nombre;
        this.edad = edad;
        this.descripción = descripción;
        this.ubicación = ubicación;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public void setUbicación(String ubicación) {
        this.ubicación = ubicación;
    }
    
    public void cumplirAño(){
        ++edad;
    }
    
    public void caminar(){
        System.out.println("Caminando");
    }
    
    public void hablar(String t){
        System.out.println(t);
    }
    
}
