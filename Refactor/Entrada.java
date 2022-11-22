package Refactor;


import java.awt.datatransfer.StringSelection;

public class Entrada {

    //Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
    public static void main(String[] args) {
        System.out.println(reverse("Hola mundo"));
    }

    public static String reverse(String cadena) {
        String resultado = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            resultado += cadena.charAt(i);
        }
        return resultado;
    }

}

