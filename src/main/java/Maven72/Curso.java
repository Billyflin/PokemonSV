
package Maven72;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author pancho
 */
public class Curso {
    private int cupos;
    private int nivel;
    private ArrayList<Evaluacion> evaluaciones  = new ArrayList<>();
    private Profesor profesor;
    private boolean aprobado;
    private boolean activo;
    private String nombre;

    public Curso(String nombre, int cupos, int nivel, Profesor profesor) {
        this.nombre = nombre;
        this.cupos = cupos;
        this.nivel = nivel;
        this.profesor = profesor;
        this.aprobado =  false;
        this.activo =  true;
    }
    
    public void agregarEvaluacion(Evaluacion e){
        evaluaciones.add(e);
    }
    
    public void agregarEvaluacion(){
        Evaluacion e = new Evaluacion(profesor.getEspecialidad(), new Date(), 100 ,0);
        evaluaciones.add(e);
    }
    
    public void mostrarEvaluaciones(){
        for (Evaluacion e : evaluaciones) {
            System.out.println(e);
        }
    }
    
    public void registrarCurso(String ruta){
        GestorArchivo ga = new GestorArchivo();
        ga.agregarLinea(ruta, this.toString());
    }

    @Override
    public String toString() {
        return "Curso{" + "cupos=" + cupos + ", nivel=" + nivel + ", evaluaciones=" + evaluaciones + ", profesor=" + profesor + ", aprobado=" + aprobado + ", activo=" + activo + ", nombre=" + nombre + '}';
    }
    
    
}
