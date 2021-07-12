package pokemonClase;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pancho
 */
public class JuegoPokemon {
    public static void main(String[] args) {
        Pokemon p0 = new Pokemon("Metapod", 12, 15, "bicho-".split("-"));
        Pokemon p1 = new Pokemon("Charmander", 4, 50, "fuego-".split("-"));
        Pokemon p2 = new Pokemon("gengar", 94, 45, "fantasma-veneno".split("-"));
        
        Ataque a0 = new Ataque("placaje", 4, "normal", 0.5, 50);
        Ataque a1 = new Ataque("lanzallama", 40, "fuego", 0.8, 15);
        Ataque a2 = new Ataque("bola sombra", 80, "fantasma", 1, 10);
        
        p0.añadirAtaque(a0, 0);
        p1.añadirAtaque(a1, 0);
        p2.añadirAtaque(a2, 0);
        
        Entrenador e0 = new Entrenador("Billy", 12);
        Lider l0 = new Lider("Roca", "Benjamin", 30);
        
        e0.capturar(p2);
        e0.capturar(p0);
        
        l0.capturar(p1);
        
        l0.getPokemones().get(0).atacar(e0.getPokemones().get(0), 0);
        l0.getPokemones().get(0).atacar(e0.getPokemones().get(0), 0);
        
        e0.getPokemones().get(0).atacar(l0.getPokemones().get(0), 0);
        e0.getPokemones().get(0).atacar(l0.getPokemones().get(0), 0);

        System.out.println(e0.getPokemones().get(0).getHp());
        System.out.println(l0.getPokemones().get(0).getHp());
        
        l0.entregarMedalla(e0);
        e0.mostrarMedallas();
        
        Enfermera enfermera = new Enfermera("Thomas",20);
        enfermera.mejorar(e0.getPokemones());
        enfermera.mejorar(l0.getPokemones());
        
        
        System.out.println("Vida de "+e0.getPokemones().get(0).getNombre()+":"+e0.getPokemones().get(0).getHp());
        System.out.println("Vida de "+l0.getPokemones().get(0).getNombre()+":"+l0.getPokemones().get(0).getHp());
        
        
    }
    
    
}
