package Copilot.CSV;

import PokemonCSV.Hard.Against;
import PokemonCSV.Hard.PokemonCSV;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Copilot.MainProfe.ruta;

public class openCSV {

    public static void main(String[] args) throws IOException, CsvException {
        CSVReader n = leerArchivo();
//        System.out.println(Arrays.toString(n));
        assert n != null;
        List<String[]> datos = n.readAll();
        ArrayList<PokemonCSV> pokemones = new ArrayList<>();
        for (String[] dato : datos) {
//            int ch = dato.lastIndexOf("]");
//            String[] abilities = abilidadInicial.substring(1, ch).split(",");
//            abilidadInicial.substring(ch + 2).split(",", 19);
//            attrAgainst[attrAgainst.length - 1] = "";

            String attrAgainst=new toString(dato).substring();
            System.out.println(attrAgainst);
//            Against aga = new Against(attrAgainst);
//
//            System.out.println(Arrays.toString(new String[]{dato[0]}));
//            String[] abilities = Arrays.toString(new String[]{dato[0]}).split(",");
//            int attack = Integer.parseInt(Arrays.toString(new String[]{dato[19]}));
//            int base_egg_steps = Integer.parseInt(Arrays.toString(new String[]{dato[20]}));
//            int base_happiness = Integer.parseInt(Arrays.toString(new String[]{dato[21]}));
//            int base_total = Integer.parseInt(Arrays.toString(new String[]{dato[22]}));
//            int capture_rate = Integer.parseInt(Arrays.toString(new String[]{dato[23]}));
//            String classfication = Arrays.toString(new String[]{dato[24]});
//            int defense = Integer.parseInt(Arrays.toString(new String[]{dato[25]}));
//            int experience_growth = Integer.parseInt(Arrays.toString(new String[]{dato[26]}));
//            double height_m = Double.parseDouble(Arrays.toString(new String[]{dato[27]}));
//            int hp = Integer.parseInt(Arrays.toString(new String[]{dato[28]}));
//            String japanese_name = Arrays.toString(new String[]{dato[29]});
//            String name = Arrays.toString(new String[]{dato[30]});
//            double percentage_male = Double.parseDouble(Arrays.toString(new String[]{dato[31]}));
//            int pokedex_number = Integer.parseInt(Arrays.toString(new String[]{dato[32]}));
//            int sp_attack = Integer.parseInt(Arrays.toString(new String[]{dato[33]}));
//            int sp_defense = Integer.parseInt(Arrays.toString(new String[]{dato[34]}));
//            int speed = Integer.parseInt(Arrays.toString(new String[]{dato[35]}));
//            String type1 = Arrays.toString(new String[]{dato[36]});
//            String type2 = Arrays.toString(new String[]{dato[37]});
//            double weight_kg = Double.parseDouble(Arrays.toString(new String[]{dato[38]}));
//            int generation = Integer.parseInt(Arrays.toString(new String[]{dato[39]}));
//            boolean is_legendary = Integer.parseInt(Arrays.toString(new String[]{dato[40]})) == 1;
//
//            pokemones.add(new PokemonCSV(abilities, aga, attack, base_egg_steps, base_happiness, base_total, capture_rate, classfication, defense, experience_growth, height_m, hp, japanese_name, name, percentage_male, pokedex_number, sp_attack, sp_defense, speed, type1, type2, weight_kg, generation, is_legendary));
        }

    for (PokemonCSV p : pokemones) {
            System.out.println(p);
        }
    }



    private static CSVReader leerArchivo() {
        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader(ruta));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return reader;
    }
}
