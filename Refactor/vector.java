package Refactor;

//Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y
// 3er elemento y muestra el resultado final.

import java.util.Vector;

public class vector {

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector();
        vector.add(0);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.remove(1);
        vector.remove(1);
        System.out.println(vector);
    }
   // Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000
    // elementos para ser añadidos al mismo.
    /*el array subyacente se ajusta todo el tiempo dependiendo del tamaño de la lista y se crea un nuevo array con los elementos
    que se tienen, lo que duplica el array y pude hacer lento el despliegue en la pagina*/

}
