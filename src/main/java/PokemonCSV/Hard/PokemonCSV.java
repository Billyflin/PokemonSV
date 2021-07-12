package PokemonCSV.Hard;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class PokemonCSV {
    private String[] abilities;
    private Against against;
    private int attack;
    private int base_egg_steps;
    private int base_happiness;
    private int base_total;
    private int capture_rate;
    private String classfication;
    private int defense;
    private int experience_growth;
    private double height_m;
    private int hp;
    private String japanese_name;
    private String name;
    private double percentage_male;
    private int pokedex_number;
    private int sp_attack;
    private int sp_defense;
    private int speed;
    private String type1;
    private String type2;
    private double weight_kg;
    private int generation;
    private boolean is_legendary;

    public PokemonCSV(String[] atributos) {
        this.attack = Integer.parseInt(atributos[20]);
        this.base_egg_steps = Integer.parseInt(atributos[21]);
        this.base_happiness = Integer.parseInt(atributos[22]);
        this.base_total = Integer.parseInt(atributos[23]);
        this.capture_rate = Integer.parseInt(atributos[24]);
        this.classfication = atributos[25];
        this.defense = Integer.parseInt(atributos[26]);
        this.experience_growth = Integer.parseInt(atributos[27]);
        this.height_m = Double.parseDouble(atributos[28]);
        this.hp = Integer.parseInt(atributos[29]);
        this.japanese_name = atributos[30];
        this.name = atributos[31];
        this.percentage_male = Double.parseDouble(atributos[32]);
        this.pokedex_number = Integer.parseInt(atributos[33]);
        this.sp_attack = Integer.parseInt(atributos[34]);
        this.sp_defense = Integer.parseInt(atributos[35]);
        this.speed = Integer.parseInt(atributos[36]);
        this.type1 = atributos[37];
        this.type2 = atributos[38];
        this.weight_kg = Double.parseDouble(atributos[39]);
        this.generation = Integer.parseInt(atributos[40]);
        this.is_legendary = Integer.parseInt(atributos[41]) == 1;

    }

    public PokemonCSV(String[] abilities, double against_bug, double against_dragon, double against_electric, double against_fairy, double against_fight, double against_fire, double against_flying, double against_ghost, double against_grass, double against_ground, double against_ice, double against_normal, double against_poison, double against_psychic, double against_rock, double against_steel, double against_water, int attack, int base_egg_steps, int base_happiness, int base_total, int capture_rate, String classfication, int defense, int experience_growth, double height_m, int hp, String japanese_name, String name, double percentage_male, int pokedex_number, int sp_attack, int sp_defense, int speed, String type1, String type2, double weight_kg, int generation, boolean is_legendary) {
        this.abilities = abilities;
        this.attack = attack;
        this.base_egg_steps = base_egg_steps;
        this.base_happiness = base_happiness;
        this.base_total = base_total;
        this.capture_rate = capture_rate;
        this.classfication = classfication;
        this.defense = defense;
        this.experience_growth = experience_growth;
        this.height_m = height_m;
        this.hp = hp;
        this.japanese_name = japanese_name;
        this.name = name;
        this.percentage_male = percentage_male;
        this.pokedex_number = pokedex_number;
        this.sp_attack = sp_attack;
        this.sp_defense = sp_defense;
        this.speed = speed;
        this.type1 = type1;
        this.type2 = type2;
        this.weight_kg = weight_kg;
        this.generation = generation;
        this.is_legendary = is_legendary;
    }

    public PokemonCSV(String[] abilities, Against aga, int attack, int base_egg_steps, int base_happiness, int base_total, int capture_rate, String classfication, int defense, int experience_growth, double height_m, int hp, String japanese_name, String name, double percentage_male, int pokedex_number, int sp_attack, int sp_defense, int speed, String type1, String type2, double weight_kg, int generation, boolean is_legendary) {
        this.abilities = abilities;
        this.attack = attack;
        this.base_egg_steps = base_egg_steps;
        this.base_happiness = base_happiness;
        this.base_total = base_total;
        this.capture_rate = capture_rate;
        this.classfication = classfication;
        this.defense = defense;
        this.experience_growth = experience_growth;
        this.height_m = height_m;
        this.hp = hp;
        this.japanese_name = japanese_name;
        this.name = name;
        this.percentage_male = percentage_male;
        this.pokedex_number = pokedex_number;
        this.sp_attack = sp_attack;
        this.sp_defense = sp_defense;
        this.speed = speed;
        this.type1 = type1;
        this.type2 = type2;
        this.weight_kg = weight_kg;
        this.generation = generation;
        this.is_legendary = is_legendary;
    }

    public String[] getAbilities() {
        return abilities;
    }

    public void setAbilities(String[] abilities) {
        this.abilities = abilities;
    }


    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getBase_egg_steps() {
        return base_egg_steps;
    }

    public void setBase_egg_steps(int base_egg_steps) {
        this.base_egg_steps = base_egg_steps;
    }

    public int getBase_happiness() {
        return base_happiness;
    }

    public void setBase_happiness(int base_happiness) {
        this.base_happiness = base_happiness;
    }

    public int getBase_total() {
        return base_total;
    }

    public void setBase_total(int base_total) {
        this.base_total = base_total;
    }

    public int getCapture_rate() {
        return capture_rate;
    }

    public void setCapture_rate(int capture_rate) {
        this.capture_rate = capture_rate;
    }

    public String getClassfication() {
        return classfication;
    }

    public void setClassfication(String classfication) {
        this.classfication = classfication;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getExperience_growth() {
        return experience_growth;
    }

    public void setExperience_growth(int experience_growth) {
        this.experience_growth = experience_growth;
    }

    public double getHeight_m() {
        return height_m;
    }

    public void setHeight_m(double height_m) {
        this.height_m = height_m;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getJapanese_name() {
        return japanese_name;
    }

    public void setJapanese_name(String japanese_name) {
        this.japanese_name = japanese_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPercentage_male() {
        return percentage_male;
    }

    public void setPercentage_male(double percentage_male) {
        this.percentage_male = percentage_male;
    }

    public int getPokedex_number() {
        return pokedex_number;
    }

    public void setPokedex_number(int pokedex_number) {
        this.pokedex_number = pokedex_number;
    }

    public int getSp_attack() {
        return sp_attack;
    }

    public void setSp_attack(int sp_attack) {
        this.sp_attack = sp_attack;
    }

    public int getSp_defense() {
        return sp_defense;
    }

    public void setSp_defense(int sp_defense) {
        this.sp_defense = sp_defense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public double getWeight_kg() {
        return weight_kg;
    }

    public void setWeight_kg(double weight_kg) {
        this.weight_kg = weight_kg;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public boolean isIs_legendary() {
        return is_legendary;
    }

    public void setIs_legendary(boolean is_legendary) {
        this.is_legendary = is_legendary;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append( abilities)
                .append( attack)
                .append( base_egg_steps)
                .append( base_happiness)
                .append( base_total)
                .append( capture_rate)
                .append( classfication)
                .append( defense)
                .append( experience_growth)
                .append( height_m)
                .append( hp)
                .append( japanese_name)
                .append( name)
                .append( percentage_male)
                .append( pokedex_number)
                .append( sp_attack)
                .append( sp_defense)
                .append( speed)
                .append( type1)
                .append( type2)
                .append( weight_kg)
                .append( generation)
                .append( is_legendary)
                .toString();
    }

    public void mostrarPKM() {
        System.out.println("---------");
        System.out.println("Nombre: " + getName());
        System.out.println("Tipo: " + getType1());
        System.out.println("Generacion: " + getGeneration());
        System.out.println("Numero: " + getPokedex_number());
        System.out.println("Hp: " + getHp());
        System.out.println("---------");
    }
}


