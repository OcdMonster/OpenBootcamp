package Refactor;

//Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
public class Array {
    public static void main(String[] args) {

        String array1[] = {
                "Max",
                "Monica",
                "Andre",
                "Erika"
        };

        for (String i : array1) {
            System.out.println(i);
        }
    }
}