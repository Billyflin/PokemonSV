package PokemonCSV.Hard;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static Objetos.Main.RutaB;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(RutaB));
        String linea = br.readLine();
        PokemonCSV p = new PokemonCSV(linea);
        p.mostrarPKM();
    }

}
