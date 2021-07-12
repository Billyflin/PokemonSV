package Maven72;

public class Profesor extends Persona{
    private String especialidad;

    public Profesor(String especialidad, String nombre, int edad, String sexo, String rut) {
        super(nombre, edad, sexo, rut);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    
}
