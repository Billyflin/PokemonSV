package Objetos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static String Ruta="C:\\Users\\Billy\\IdeaProjects\\PokemonSV\\src\\lib";
    public static String RutaC="C:\\Users\\Billy\\IdeaProjects\\PokemonSV\\src\\lib\\Pokemones.csv";
    public static String RutaB="C:\\Users\\Billy\\IdeaProjects\\PokemonSV\\src\\lib\\pokemon.csv";
    public static void main(String[] args) throws IOException {
        Pokemon p0= new Pokemon("Fuego","Charizard",6,60);
        Pokemon p1= new Pokemon("Agua","Blastoise",9,50);
        Gestor ga = new Gestor();
        p1.mostrarPKM();
        p0.mostrarPKM();

        BufferedReader br = new BufferedReader(new FileReader(RutaC));
        String linea = br.readLine();
        Pokemon p2=new Pokemon(linea);
        p2.mostrarPKM();
    }
}
