package Objetos;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Gestor{
        //ContarCaracteres
        public void contarLetrasArchivo(String ruta){
            Path directorio = Paths.get(ruta);
            int count;
            String contenido=leerArchivo(directorio.toString());
            count = contenido.trim().length();
            System.out.println("El total de caracteres es : "+count);
            System.out.println("Sin ; es: "+contenido.trim().chars().filter(ch -> ch != ';').count());
        }

        public void contarLineas(String ruta) throws FileNotFoundException {
            BufferedReader bf = new BufferedReader(new FileReader(ruta));
            System.out.println("El archivo tiene " + bf.lines().count() + " lineas");
        }


        //Crear un directorio
        public void crearDirectorio(String ruta) {
            Path directorio = Paths.get(ruta);
            if (Files.exists(directorio)) {
                System.out.println("el directorio ya existe");
            } else {
                try {
                    Files.createDirectories(directorio);
                    System.out.println("el directorio fue creado");
                } catch (IOException e) {
                    System.out.println("el directorio no pudo ser creado");
                }
            }
        }

        //crear un archivo
        public void crearArchivo(String ruta, String contenido) {
            Path archivo = Paths.get(ruta);
            try {
                Files.write(archivo, contenido.getBytes());
                System.out.println("El archivo fue creado exitosamente");
            } catch (IOException e) {
                System.out.println("El archivo no pudo ser creado");
            }
        }

        //leer un archivo
        public String leerArchivo(String ruta) {
            Path archivo = Paths.get(ruta);
            String contenido = "";
            try {
                contenido = new String(Files.readAllBytes(archivo));
            } catch (IOException e) {
                System.out.println("El archivo no pudo ser leido");
            }
            return contenido;
        }

        //eliminar un archivo
        public void eliminarArchivo(String ruta) {
            Path archivo = Paths.get(ruta);
            try {
                Files.deleteIfExists(archivo);
                System.out.println("El archivo fue eliminado exitosamente");
            } catch (IOException e) {
                System.out.println("El archivo no pudo ser eliminado");
            }
        }

        //copiar un archivo
        public void copiarArchivo(String ruta, String newRuta) {
            Path archivo = Paths.get(ruta);
            Path newArchivo = Paths.get(newRuta);
            try {
                Files.copy(archivo, newArchivo);
                System.out.println("El archivo fue creado con exito");
            } catch (IOException e) {
                System.out.println("El archivo no pudo ser copiado");
            }

        }

        //nuevaLinea
        public void nuevaLinea(String ruta, String contenido) {
            String oldContenido = leerArchivo(ruta);
            crearArchivo(ruta, oldContenido + "\n" + contenido);
        }

        public String[] listaArchivos(String ruta) {
            File f = new File(ruta);
            return f.list();
        }

    public void contarPalabras(String Ruta) {
        int contador = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(Ruta));
            String linea = br.readLine();
            while (linea != null) {
                System.out.println(linea);
                String[] palabras = linea.split(";");//.split(";");
                contador += palabras.length;
                linea = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nPalabras contadas: " + contador);

    }
}
