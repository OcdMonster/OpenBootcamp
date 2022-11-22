package Refactor;

//Crea un ArrayList de tipo String, con 4 elementos.
// Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.

import java.util.ArrayList;
import java.util.LinkedList;

public class arrayList {

    public static void main(String[] args) {
        ArrayList<String> lista =  new ArrayList<String>();
        lista.add("Max");
        lista.add("Monica");
        lista.add("Andre");
        lista.add("Romina");

        LinkedList<String> listaEnlazada = new LinkedList<String>();
        listaEnlazada.add("Max");
        listaEnlazada.add("Monica");
        listaEnlazada.add("Andre");
        listaEnlazada.add("Romina");

        for (String i : lista) {
            System.out.println(i);
            }

        for (String j : listaEnlazada) {
            System.out.println(j);
        }
    }
}
