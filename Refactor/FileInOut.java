package Refactor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInOut {

    /*
    Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn"
al fichero dado en "fileOut".
     */
    public static void main(String[] args) {
        try {
            InputStream fichero = new FileInputStream("/etc/passwd");
            byte datos[] = new byte[5];
            int dato = fichero.read(datos);
            while (dato != -1){
                System.out.print(datos.toString());
                dato = fichero.read();
            }

        } catch (FileNotFoundException e) {
            System.out.println("no existe el fichero: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("No puedo leer el fichero : " +e.getMessage());
        }
    }
}