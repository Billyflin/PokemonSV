package Objetos;

public class Pokemon {
    private String tipo;
    private String nombre;
    private int numero;
    private int nivel;
    private int hp;
    private String estado;

    public Pokemon(String tipo, String nombre, int numero, int nivel) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.numero = numero;
        this.nivel = nivel;
        hp = 100;
        this.estado = "Saludable";
    }
    public Pokemon(String datos){
        String[] atributos= datos.split(";");
        nombre = atributos[0];
        tipo=atributos[1];
        numero = Integer.parseInt(atributos[2]);
        nivel = Integer.parseInt(atributos[3]);
        hp = Integer.parseInt(atributos[4]);

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void mostrarPKM() {
        System.out.println("---------");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Nivel: " + getNivel());
        System.out.println("Numero: " + getNumero());
        System.out.println("Hp: " + getHp());
        System.out.println("---------");

    }

    public void subirNivel(){
        ++nivel;
    }
    public void atacar(Pokemon p){
        int ataque= (int)(Math.random()*nivel-1);
        p.recibirDaño(ataque);
        System.out.println(nombre+" a hecho " + ataque+" puntos de daño a "+ p.getNombre() );

    }

    private void recibirDaño(int ataque) {
        if (ataque >= hp){
            hp=0;
            System.out.println(nombre+" se a debilitado. ");
        }else{
            hp-=ataque;
        }
    }

    public String toString(){
        return nombre+";"+tipo+";"+numero+";"+nivel+";"+hp+";"+estado;
    }
}
