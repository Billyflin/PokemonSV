package Copilot;

import Objetos.Gestor;
import PokemonCSV.Hard.Against;
import PokemonCSV.Hard.PokemonCSV;

import java.util.ArrayList;
import java.util.Arrays;


public class MainProfe {
    public static String ruta = "C:\\Users\\Billy\\OneDrive\\Documentos\\GitHub\\PokemonSV\\src\\lib\\pokemon.csv";
//    public static void main(String[] args) {
//        Gestor ga = new Gestor();
//        String archivo = ga.leerArchivo(ruta);
//        String[] attrPokemon = archivo.split("\n");
//        int n = archivo.split("\n").length;
//
//        ArrayList<PokemonCSV> pokemones = new ArrayList<>();
//        for (int i = 1; i < n; i++) {
//
//            String abilidadInicial = attrPokemon[i].replace("\"", "");
//            abilidadInicial = abilidadInicial.replace("'", "");
//            int ch = abilidadInicial.lastIndexOf("]");
//            String[] abilities = abilidadInicial.substring(1, ch).split(",");
//            String[] attrAgainst = abilidadInicial.substring(ch + 2).split(",", 19);
//            attrAgainst[attrAgainst.length - 1] = "";
//            Against aga = new Against(attrAgainst);
//            int attack = Integer.parseInt(abilidadInicial.substring(ch + 2).split(",")[20]);
//            System.out.println(attack);

//            System.out.println(attack);
//            int attack = Integer.parseInt(AttrStr[20]);
//            int base_egg_steps = Integer.parseInt(AttrStr[21]);
//            int base_happiness = Integer.parseInt(AttrStr[22]);
//            int base_total = Integer.parseInt(AttrStr[23]);
//            int capture_rate = Integer.parseInt(AttrStr[24]);
//            String classfication = AttrStr[25];
//            int defense = Integer.parseInt(AttrStr[26]);
//            int experience_growth = Integer.parseInt(AttrStr[27]);
//            double height_m = Double.parseDouble(AttrStr[28]);
//            int hp = Integer.parseInt(AttrStr[29]);
//            String japanese_name = AttrStr[30];
//            String name = AttrStr[31];
//            double percentage_male = Double.parseDouble(AttrStr[32]);
//            int pokedex_number = Integer.parseInt(AttrStr[33]);
//            int sp_attack = Integer.parseInt(AttrStr[34]);
//            int sp_defense = Integer.parseInt(AttrStr[35]);
//            int speed = Integer.parseInt(AttrStr[36]);
//            String type1 = AttrStr[37];
//            String type2 = AttrStr[38];
//            double weight_kg = Double.parseDouble(AttrStr[28]);
//            int generation = Integer.parseInt(AttrStr[40]);
//            boolean is_legendary = Integer.parseInt(AttrStr[41]) == 1;
//
//            pokemones.add(new PokemonCSV(abilities, aga, attack, base_egg_steps, base_happiness, base_total, capture_rate, classfication, defense, experience_growth, height_m, hp, japanese_name, name, percentage_male, pokedex_number, sp_attack, sp_defense, speed, type1, type2, weight_kg, generation, is_legendary));
//
//        }
//
//        for (PokemonCSV p : pokemones) {
//            System.out.println(p);
//        }
//
//    }
}
