package PokemonCSV.Hard;

import Objetos.Gestor;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import static Objetos.Main.Ruta;
import static Objetos.Main.RutaB;

public class Main2 {
    public static void main(String[] args) throws IOException {
        Gestor ga = new Gestor();
        String archivo = ga.leerArchivo(RutaB);
        String[] attrPokemon= archivo.split("\n");
        int n = ga.leerArchivo(RutaB).split("\n").length;
        StringBuilder sb = new StringBuilder("");
        ArrayList<PokemonCSV> pokemon = new ArrayList<PokemonCSV>();
        for (int i = 1; i < 17; i++) {
            String abilidadInicial = attrPokemon[i].replace("\"","");
            abilidadInicial = abilidadInicial.replace("\'","");
            int ch =abilidadInicial.lastIndexOf("]");
            String[] abilities = abilidadInicial.substring(1,ch).split(",");
            String[] atributo=abilidadInicial.substring(ch+2).split(",",19);
            atributo[atributo.length - 1]="";
//            System.out.println(abilidadInicial);
            System.out.println(Arrays.asList(atributo));
            Against aga = new Against(atributo);
            System.out.println(Arrays.asList(abilities));

        }


    }

}
