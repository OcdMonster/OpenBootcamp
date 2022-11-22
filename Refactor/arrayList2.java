package Refactor;



import java.util.ArrayList;

public class arrayList2 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
//Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }
        System.out.println(numeros);

// A continuación, con otro bucle, recórrelo y elimina los numeros pares.
// Por último, vuelve a recorrerlo y muestra el ArrayList final.
        ArrayList<Integer> numeros1 = new ArrayList<Integer>();
        for (int j = 1; j <= 10; j++) {
                if (j % 2 == 0) {
                    continue;
                } else {
                    numeros1.add(j);
                }
            }
        System.out.println(numeros1);
        }
    }