package Maven72;
public class Persona {
    private String nombre;
    private int edad;
    private String sexo;
    private String rut;

    public Persona(String nombre, int edad, String sexo, String rut) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.rut = rut;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", rut=" + rut + '}';
    }
    
    
    
    
    
    
    
}
