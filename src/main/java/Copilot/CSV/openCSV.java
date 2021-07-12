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

            double against_bug = Double.parseDouble(Arrays.toString(new String[]{dato[1]}).replaceFirst("\\[", "").replaceFirst("]", ""));
            double against_dark = Double.parseDouble(Arrays.toString(new String[]{dato[2]}).replaceFirst("\\[", "").replaceFirst("]", ""));
            double against_dragon = Double.parseDouble(Arrays.toString(new String[]{dato[3]}).replaceFirst("\\[", "").replaceFirst("]", ""));
            double against_electric = Double.parseDouble(Arrays.toString(new String[]{dato[4]}).replaceFirst("\\[", "").replaceFirst("]", ""));
            double against_fairy = Double.parseDouble(Arrays.toString(new String[]{dato[5]}).replaceFirst("\\[", "").replaceFirst("]", ""));
            double against_fight = Double.parseDouble(Arrays.toString(new String[]{dato[6]}).replaceFirst("\\[", "").replaceFirst("]", ""));
            double against_fire = Double.parseDouble(Arrays.toString(new String[]{dato[7]}).replaceFirst("\\[", "").replaceFirst("]", ""));
            double against_flying = Double.parseDouble(Arrays.toString(new String[]{dato[8]}).replaceFirst("\\[", "").replaceFirst("]", ""));
            double against_ghost = Double.parseDouble(Arrays.toString(new String[]{dato[9]}).replaceFirst("\\[", "").replaceFirst("]", ""));
            double against_grass = Double.parseDouble(Arrays.toString(new String[]{dato[10]}).replaceFirst("\\[", "").replaceFirst("]", ""));
            double against_ground = Double.parseDouble(Arrays.toString(new String[]{dato[11]}).replaceFirst("\\[", "").replaceFirst("]", ""));
            double against_ice = Double.parseDouble(Arrays.toString(new String[]{dato[12]}).replaceFirst("\\[", "").replaceFirst("]", ""));
            double against_normal = Double.parseDouble(Arrays.toString(new String[]{dato[13]}).replaceFirst("\\[", "").replaceFirst("]", ""));
            double against_poison = Double.parseDouble(Arrays.toString(new String[]{dato[14]}).replaceFirst("\\[", "").replaceFirst("]", ""));
            double against_psychic = Double.parseDouble(Arrays.toString(new String[]{dato[15]}).replaceFirst("\\[", "").replaceFirst("]", ""));
            double against_rock = Double.parseDouble(Arrays.toString(new String[]{dato[16]}).replaceFirst("\\[", "").replaceFirst("]", ""));
            double against_steel = Double.parseDouble(Arrays.toString(new String[]{dato[17]}).replaceFirst("\\[", "").replaceFirst("]", ""));
            double against_water = Double.parseDouble(Arrays.toString(new String[]{dato[18]}).replaceFirst("\\[", "").replaceFirst("]", ""));
//              Against Se Escribe Bien
            Against aga = new Against(against_bug,against_dark,against_dragon,against_electric,against_fairy,against_fight,against_fire,against_flying,against_ghost,against_grass,against_ground,against_ice,against_normal,against_poison,against_psychic,against_rock,against_steel,against_water);

//              Declaracion Parametros Pokemon
//            String[] abilities = Arrays.toString(new String[]{dato[0]}).split(",");
//            int attack = Integer.parseInt(Arrays.toString(new String[]{dato[19]}).replaceFirst("\\[", "").replaceFirst("]", ""));
//            int base_egg_steps = Integer.parseInt(Arrays.toString(new String[]{dato[20]}).replaceFirst("\\[", "").replaceFirst("]", ""));
//            int base_happiness = Integer.parseInt(Arrays.toString(new String[]{dato[21]}).replaceFirst("\\[", "").replaceFirst("]", ""));
//            int base_total = Integer.parseInt(Arrays.toString(new String[]{dato[22]}).replaceFirst("\\[", "").replaceFirst("]", ""));
//            int capture_rate = Integer.parseInt(Arrays.toString(new String[]{dato[23]}).replaceFirst("\\[", "").replaceFirst("]", ""));
//            String classfication = Arrays.toString(new String[]{dato[24]});
//            int defense = Integer.parseInt(Arrays.toString(new String[]{dato[25]}).replaceFirst("\\[", "").replaceFirst("]", ""));
//            int experience_growth = Integer.parseInt(Arrays.toString(new String[]{dato[26]}).replaceFirst("\\[", "").replaceFirst("]", ""));
            if(Arrays.toString(new String[]{dato[27]}).equals("")){
                double height_m= Double.parseDouble("0.0");
                System.out.println("esta vacio");
            }else{
                double height_m = Double.parseDouble(Arrays.toString(new String[]{dato[27]}).replaceFirst("\\[", "").replaceFirst("]", ""));

            }
//            System.out.println(Double.parseDouble(Arrays.toString(new String[]{dato[27]}).replaceFirst("\\[", "").replaceFirst("]", "")));
//            int hp = Integer.parseInt(Arrays.toString(new String[]{dato[28]}).replaceFirst("\\[", "").replaceFirst("]", ""));
//            String japanese_name = Arrays.toString(new String[]{dato[29]});
//            String name = Arrays.toString(new String[]{dato[30]});
//            double percentage_male = Double.parseDouble(Arrays.toString(new String[]{dato[31]}).replaceFirst("\\[", "").replaceFirst("]", ""));
//            int pokedex_number = Integer.parseInt(Arrays.toString(new String[]{dato[32]}).replaceFirst("\\[", "").replaceFirst("]", ""));
//            int sp_attack = Integer.parseInt(Arrays.toString(new String[]{dato[33]}).replaceFirst("\\[", "").replaceFirst("]", ""));
//            int sp_defense = Integer.parseInt(Arrays.toString(new String[]{dato[34]}).replaceFirst("\\[", "").replaceFirst("]", ""));
//            int speed = Integer.parseInt(Arrays.toString(new String[]{dato[35]}).replaceFirst("\\[", "").replaceFirst("]", ""));
//            String type1 = Arrays.toString(new String[]{dato[36]});
//            String type2 = Arrays.toString(new String[]{dato[37]});
//            double weight_kg = Double.parseDouble(Arrays.toString(new String[]{dato[38]}).replaceFirst("\\[", "").replaceFirst("]", ""));
//            int generation = Integer.parseInt(Arrays.toString(new String[]{dato[39]}).replaceFirst("\\[", "").replaceFirst("]", ""));
//            boolean is_legendary = Integer.parseInt(Arrays.toString(new String[]{dato[40]}).replaceFirst("\\[", "").replaceFirst("]", "")) == 1;
//
//            pokemones.add(new PokemonCSV(abilities, aga, attack, base_egg_steps, base_happiness, base_total, capture_rate, classfication, defense, experience_growth, height_m, hp, japanese_name, name, percentage_male, pokedex_number, sp_attack, sp_defense, speed, type1, type2, weight_kg, generation, is_legendary));
        }

//    for (PokemonCSV p : pokemones) {
//            System.out.println(p);
//        }
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
