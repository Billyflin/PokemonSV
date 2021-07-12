package pokemonClase;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author pancho
 */
class Ataque {
    private final String nombre;
    private final int daño;
    private final String tipo;
    private final double precisión;
    private int pp;
    private boolean recuperar;

    public Ataque(String nombre, int daño, String tipo, double precisión, int pp) {
        this.nombre = nombre;
        this.daño = daño;
        this.tipo = tipo;
        this.precisión = precisión;
        this.pp = pp;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }
    
    public int usar(){
       if(pp==0){
           System.out.println("ya no se puede utilizar "+ nombre);
           return 0;
       }
       --pp;
       if(Math.random()<precisión){
           System.out.println(" utilizo "+ nombre);
           return daño;
       }else{
           System.out.println(" fallo el ataque");
           return 0;
       }
            
    }
    
    public int usar(String estado){
        if(pp==0){
           System.out.println("ya no se puede utilizar "+ nombre);
           return 0;
       }
       --pp;
       double p=0;
        switch (estado) {
            case "confuso" -> p = precisión * 0.5;
            case "paralizado" -> p = precisión * 0.1;
            case "congelado", "dormido" -> {
                p = 0;
                recuperar();
            }
            case "debilitado" -> p = 0;
            default -> p = precisión;
        }
       
       if(Math.random()<p){
           System.out.println(" utilizo "+ nombre);
           return daño;
       }else{
           System.out.println(" fallo el ataque");
           return 0;
       }
    }

    private void recuperar() {
        double recuperar = Math.random()*100;
        this.recuperar= recuperar > 50;
    }
    
    
    
}
