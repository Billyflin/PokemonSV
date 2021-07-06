package Objetos;

import java.io.FileNotFoundException;

public class Main {
    public static String Ruta="C:\\Users\\Billy\\IdeaProjects\\PokemonSV\\src\\lib";
    public static String RutaC="C:\\Users\\Billy\\IdeaProjects\\PokemonSV\\src\\lib\\Pokemones.csv";
    public static void main(String[] args) throws FileNotFoundException {
        Pokemon p0= new Pokemon("Fuego","Charizard",6,60);
        Pokemon p1= new Pokemon("Agua","Blastoise",9,50);
        Gestor ga = new Gestor();
        p1.mostrarPKM();
        p0.mostrarPKM();
        p1.atacar(p0);
        p0.mostrarPKM();
        p1.mostrarPKM();
        ga.crearDirectorio(Ruta);
        ga.crearArchivo(RutaC,p0.toString());
        ga.nuevaLinea(RutaC,p1.toString());
        ga.contarLetrasArchivo(RutaC);
        ga.contarLineas(RutaC);
        ga.contarPalabras(RutaC);
    }
}
