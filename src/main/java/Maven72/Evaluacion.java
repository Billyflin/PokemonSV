package Maven72;
import java.util.Date;


public class Evaluacion {
    private String tema;
    private Date fecha;
    private int puntos;
    private int nota;

    public Evaluacion(String tema, Date fecha, int puntos, int nota) {
        this.tema = tema;
        this.fecha = fecha;
        this.puntos = puntos;
        this.nota = nota;
    }

    public Evaluacion(String parametros) {
        String[] datos = parametros.split(":");
        this.tema = datos[0];
        this.fecha = new Date(Integer.parseInt(datos[1]));
        this.puntos = Integer.parseInt(datos[2]);
        this.nota = Integer.parseInt(datos[3]);
    }

    @Override
    public String toString() {
        return "Evaluacion{" + "tema=" + tema + ", fecha=" + fecha + ", puntos=" + puntos + ", nota=" + nota + '}';
    }
    
    
    
    
    
}
