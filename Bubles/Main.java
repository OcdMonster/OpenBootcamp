package Bubles;

/*En este ejercicio tenéis que crear un bucle que permita concatenar textos e
imprima el resultado final por consola.
Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:
String[] nombres = {"", "", "", ""}*/


public class Main {

    public static void main(String[] args) {

        String[] nombres = {"Pedro", "Luis", "Paco", "luisa"};
        for (int i = 0; i < nombres.length; i++){
            System.out.print(nombres[i] + " ");
        }
    }
}