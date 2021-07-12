package Maven72;
import java.util.ArrayList;


public class GestorNotas {
    public static void main(String[] args) {
        GestorArchivo ga = new GestorArchivo();
        
        Profesor p0 = new Profesor("programación", "Francisco", 26 , "masculino", "12.345.678-j");
        Profesor p1 = new Profesor("algebra", "Bobadilla", 60, "femenino", "123.345-r");
        
        ArrayList<Evaluacion> evaluaciones = new ArrayList<>();
        String[] evaluacionesTexto = ga.leerArchivo("evaluaciones").split("\n");
        for (int i = 0; i < evaluacionesTexto.length; i++) {
            evaluaciones.add(new Evaluacion(evaluacionesTexto[i]));
        }
        
        Curso c0 = new Curso("programacion", 20, 3, p0);
        Curso c1 = new Curso("Algebra", 300, 1, p1);
        
        c0.agregarEvaluacion(evaluaciones.get(0));
        c0.agregarEvaluacion(evaluaciones.get(2));
        c0.agregarEvaluacion();
        
        c1.agregarEvaluacion(evaluaciones.get(3));
        c1.agregarEvaluacion();
        
//        c0.mostrarEvaluaciones();
//        System.out.println("");
//        c1.mostrarEvaluaciones();
        c0.registrarCurso("cursos1");
        c1.registrarCurso("cursos2");
        
        System.out.println(ga.leerArchivo("cursos1"));
        System.out.println(ga.leerArchivo("cursos2"));
        
    }
    
}
