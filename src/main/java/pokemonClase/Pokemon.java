package pokemonClase;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author pancho
 */
public class Pokemon {
    private String nombre;
    private int numero;
    private int nivel;
    private String[] tipo;
    private int hp;
    private ArrayList<Ataque> ataques;
    private String estado;
    

    public Pokemon(String nombre, int numero, int nivel, String[] tipo) {
        this.nombre = nombre;
        this.numero = numero;
        this.nivel = nivel;
        this.tipo = tipo;
        hp = 100;
        estado = "vivo";
        ataques = new ArrayList<>();
    }
    
    public Pokemon(String datos){
        String[] atributos = datos.split(";");
        nombre = atributos[0];
        tipo = atributos[1].split("-");
        numero = Integer.parseInt(atributos[2]);
        nivel = Integer.parseInt(atributos[3]);
        hp = Integer.parseInt(atributos[4]);
        ataques = new ArrayList<>();
    }
    
    public void añadirAtaques(ArrayList<Ataque> a){
        ataques = a;
        while(ataques.size()>4){
            ataques.remove(ataques.size()-1);
        }
    }
    
    public void añadirAtaque(Ataque a, int n){
        if (ataques.size()==4) {
            ataques.remove(n);
            ataques.add(a);
        }else{
            ataques.add(a);
        }
    }

    public int getHp() {
        return hp;
    }
    
    public void setHp(int hp){
        this.hp=hp;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void saludar(String saludo){
        System.out.println(saludo);
        System.out.println(saludo);
    }
    
    public void subirNivel(){
        ++nivel;
    }
    
    public void mostrar(){
        System.out.println("------"+nombre+"------");
        System.out.println("HP: "+ hp);
        System.out.println("Nivel: "+ nivel);
        System.out.println("Tipo: "+ Arrays.toString(tipo));
    }
    
    public void atacar(Pokemon p, int ataque){
        int daño = ataques.get(ataque).usar(estado);
        System.out.println(nombre+ " ha realizado "+ ataques.get(ataque).getNombre());
        System.out.println("ha producido "+ daño+" puntos de daño");
        p.recibirAtaque(daño);
        p.recibirAtaque(ataques.get(ataque));
    }
       
    public void recibirAtaque(int a){
        if(a>=hp){
            hp=0;
            System.out.println(nombre +" se debilito");
            this.estado = "debilitado";
        }else{
            hp-=a;
            System.out.println("El hp de "+ nombre + " es de : "+ hp);
        }   
    }
    
    public void recibirAtaque(Ataque a){
        if(a.getTipo().equals("veneno")){
            if(Math.random()>0.8){
                this.estado="envenenado";
            }
        }
        if(a.getTipo().equals("hielo")){
            if(Math.random()>0.8){
                this.estado="congelado";
            }
        }
        if(a.getTipo().equals("lucha")){
            if(Math.random()>0.4){
                this.estado="confundido";
            }
        }
        if(a.getTipo().equals("psiquico")){
            if(Math.random()>0.6){
                this.estado="confundido";
            }
        }
        if(a.getTipo().equals("electrico")){
            if(Math.random()>0.6){
                this.estado="paralizado";
            }
        }
        if(a.getTipo().equals("normal")){
            if(Math.random()>0.6){
                this.estado="dormido";
            }
        }
        if(a.getTipo().equals("fuego")){
            if(Math.random()>0.6){
                this.estado="quemado";
            }
        }
    }
    
    public String toString(){
        return nombre+";"+Arrays.toString(tipo)+";"+numero+";"+nivel+";"+hp;
    }

    public String getNombre() {
        return nombre;
    }
}
