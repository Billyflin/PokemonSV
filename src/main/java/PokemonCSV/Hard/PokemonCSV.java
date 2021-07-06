package PokemonCSV.Hard;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class PokemonCSV {
    public String[] abilities;
    public double against_bug;
    public double against_dragon;
    public double against_electric;
    public double against_fairy;
    public double against_fight;
    public double against_fire;
    public double against_flying;
    public double against_ghost;
    public double against_grass;
    public double against_ground;
    public double against_ice;
    public double against_normal;
    public double against_poison;
    public double against_psychic;
    public double against_rock;
    public double against_steel;
    public double against_water;
    public int attack;
    public int base_egg_steps;
    public int base_happiness;
    public int base_total;
    public int capture_rate;
    public String classfication;
    public int defense;
    public int experience_growth;
    public double height_m;
    public int hp;
    public String japanese_name;
    public String name;
    public double percentage_male;
    public int pokedex_number;
    public int sp_attack;
    public int sp_defense;
    public int speed;
    public String type1;
    public String type2;
    public double weight_kg;
    public int generation;
    public boolean is_legendary;

    public PokemonCSV(String[] abilities, double against_bug, double against_dragon, double against_electric, double against_fairy, double against_fight, double against_fire, double against_flying, double against_ghost, double against_grass, double against_ground, double against_ice, double against_normal, double against_poison, double against_psychic, double against_rock, double against_steel, double against_water, int attack, int base_egg_steps, int base_happiness, int base_total, int capture_rate, String classfication, int defense, int experience_growth, double height_m, int hp, String japanese_name, String name, double percentage_male, int pokedex_number, int sp_attack, int sp_defense, int speed, String type1, String type2, double weight_kg, int generation, boolean is_legendary) {
        this.abilities = abilities;
        this.against_bug = against_bug;
        this.against_dragon = against_dragon;
        this.against_electric = against_electric;
        this.against_fairy = against_fairy;
        this.against_fight = against_fight;
        this.against_fire = against_fire;
        this.against_flying = against_flying;
        this.against_ghost = against_ghost;
        this.against_grass = against_grass;
        this.against_ground = against_ground;
        this.against_ice = against_ice;
        this.against_normal = against_normal;
        this.against_poison = against_poison;
        this.against_psychic = against_psychic;
        this.against_rock = against_rock;
        this.against_steel = against_steel;
        this.against_water = against_water;
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

    public double getAgainst_bug() {
        return against_bug;
    }

    public void setAgainst_bug(double against_bug) {
        this.against_bug = against_bug;
    }

    public double getAgainst_dragon() {
        return against_dragon;
    }

    public void setAgainst_dragon(double against_dragon) {
        this.against_dragon = against_dragon;
    }

    public double getAgainst_electric() {
        return against_electric;
    }

    public void setAgainst_electric(double against_electric) {
        this.against_electric = against_electric;
    }

    public double getAgainst_fairy() {
        return against_fairy;
    }

    public void setAgainst_fairy(double against_fairy) {
        this.against_fairy = against_fairy;
    }

    public double getAgainst_fight() {
        return against_fight;
    }

    public void setAgainst_fight(double against_fight) {
        this.against_fight = against_fight;
    }

    public double getAgainst_fire() {
        return against_fire;
    }

    public void setAgainst_fire(double against_fire) {
        this.against_fire = against_fire;
    }

    public double getAgainst_flying() {
        return against_flying;
    }

    public void setAgainst_flying(double against_flying) {
        this.against_flying = against_flying;
    }

    public double getAgainst_ghost() {
        return against_ghost;
    }

    public void setAgainst_ghost(double against_ghost) {
        this.against_ghost = against_ghost;
    }

    public double getAgainst_grass() {
        return against_grass;
    }

    public void setAgainst_grass(double against_grass) {
        this.against_grass = against_grass;
    }

    public double getAgainst_ground() {
        return against_ground;
    }

    public void setAgainst_ground(double against_ground) {
        this.against_ground = against_ground;
    }

    public double getAgainst_ice() {
        return against_ice;
    }

    public void setAgainst_ice(double against_ice) {
        this.against_ice = against_ice;
    }

    public double getAgainst_normal() {
        return against_normal;
    }

    public void setAgainst_normal(double against_normal) {
        this.against_normal = against_normal;
    }

    public double getAgainst_poison() {
        return against_poison;
    }

    public void setAgainst_poison(double against_poison) {
        this.against_poison = against_poison;
    }

    public double getAgainst_psychic() {
        return against_psychic;
    }

    public void setAgainst_psychic(double against_psychic) {
        this.against_psychic = against_psychic;
    }

    public double getAgainst_rock() {
        return against_rock;
    }

    public void setAgainst_rock(double against_rock) {
        this.against_rock = against_rock;
    }

    public double getAgainst_steel() {
        return against_steel;
    }

    public void setAgainst_steel(double against_steel) {
        this.against_steel = against_steel;
    }

    public double getAgainst_water() {
        return against_water;
    }

    public void setAgainst_water(double against_water) {
        this.against_water = against_water;
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
                .append(",", abilities)
                .append(",", against_bug)
                .append(",", against_dragon)
                .append(",", against_electric)
                .append(",", against_fairy)
                .append(",", against_fight)
                .append(",", against_fire)
                .append(",", against_flying)
                .append(",", against_ghost)
                .append(",", against_grass)
                .append(",", against_ground)
                .append(",", against_ice)
                .append(",", against_normal)
                .append(",", against_poison)
                .append(",", against_psychic)
                .append(",", against_rock)
                .append(",", against_steel)
                .append(",", against_water)
                .append(",", attack)
                .append(",", base_egg_steps)
                .append(",", base_happiness)
                .append(",", base_total)
                .append(",", capture_rate)
                .append(",", classfication)
                .append(",", defense)
                .append(",", experience_growth)
                .append(",", height_m)
                .append(",", hp)
                .append(",", japanese_name)
                .append(",", name)
                .append(",", percentage_male)
                .append(",", pokedex_number)
                .append(",", sp_attack)
                .append(",", sp_defense)
                .append(",", speed)
                .append(",", type1)
                .append(",", type2)
                .append(",", weight_kg)
                .append(",", generation)
                .append(",", is_legendary)
                .toString();
    }
}


