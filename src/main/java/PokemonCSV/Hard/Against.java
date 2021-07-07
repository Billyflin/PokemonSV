package PokemonCSV.Hard;

import java.security.PublicKey;

public class Against {
    private double against_bug;
    private double against_dark;
    private double against_dragon;
    private double against_electric;
    private double against_fairy;
    private double against_fight;
    private double against_fire;
    private double against_flying;
    private double against_ghost;
    private double against_grass;
    private double against_ground;
    private double against_ice;
    private double against_normal;
    private double against_poison;
    private double against_psychic;
    private double against_rock;
    private double against_steel;
    private double against_water;


    public Against(double against_bug, double against_dark, double against_dragon, double against_electric, double against_fairy, double against_fight, double against_fire, double against_flying, double against_ghost, double against_grass, double against_ground, double against_ice, double against_normal, double against_poison, double against_psychic, double against_rock, double against_steel, double against_water) {
        this.against_bug = against_bug;
        this.against_dark = against_dark;
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
    }
    public Against(String[] atributos){
        this.against_bug = Double.parseDouble(atributos[0]);
        this.against_dragon = Double.parseDouble(atributos[1]);
        this.against_electric = Double.parseDouble(atributos[2]);
        this.against_fairy = Double.parseDouble(atributos[3]);
        this.against_fight = Double.parseDouble(atributos[4]);
        this.against_fire = Double.parseDouble(atributos[5]);
        this.against_flying = Double.parseDouble(atributos[6]);
        this.against_ghost = Double.parseDouble(atributos[7]);
        this.against_grass = Double.parseDouble(atributos[8]);
        this.against_ground = Double.parseDouble(atributos[9]);
        this.against_ice = Double.parseDouble(atributos[10]);
        this.against_normal = Double.parseDouble(atributos[11]);
        this.against_poison = Double.parseDouble(atributos[12]);
        this.against_psychic = Double.parseDouble(atributos[13]);
        this.against_rock = Double.parseDouble(atributos[14]);
        this.against_steel = Double.parseDouble(atributos[15]);
        this.against_water = Double.parseDouble(atributos[16]);
    }

    public double getAgainst_bug() {
        return against_bug;
    }

    public double getAgainst_dark() {
        return against_dark;
    }

    public double getAgainst_dragon() {
        return against_dragon;
    }

    public double getAgainst_electric() {
        return against_electric;
    }

    public double getAgainst_fairy() {
        return against_fairy;
    }

    public double getAgainst_fight() {
        return against_fight;
    }

    public double getAgainst_fire() {
        return against_fire;
    }

    public double getAgainst_flying() {
        return against_flying;
    }

    public double getAgainst_ghost() {
        return against_ghost;
    }

    public double getAgainst_grass() {
        return against_grass;
    }

    public double getAgainst_ground() {
        return against_ground;
    }

    public double getAgainst_ice() {
        return against_ice;
    }

    public double getAgainst_normal() {
        return against_normal;
    }

    public double getAgainst_poison() {
        return against_poison;
    }

    public double getAgainst_psychic() {
        return against_psychic;
    }

    public double getAgainst_rock() {
        return against_rock;
    }

    public double getAgainst_steel() {
        return against_steel;
    }

    public double getAgainst_water() {
        return against_water;
    }
}

