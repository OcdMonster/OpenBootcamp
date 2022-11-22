package Refactor;

//Crea un array bidimensional de enteros y recórrelo, mostrando la posición y
// el valor de cada elemento en ambas dimensiones.
public class ArrayBidimensional {

    public static void main(String[] args) {

        int arrayBi[][] = new int[4][4];
        arrayBi[0][0] = 1;
        arrayBi[0][1] = 2;
        arrayBi[0][2] = 3;
        arrayBi[0][3] = 4;
        arrayBi[1][0] = 10;
        arrayBi[1][1] = 20;
        arrayBi[1][2] = 30;
        arrayBi[1][3] = 40;

        for (int i = 0; i < arrayBi.length; i++){
            System.out.println("valor de i: "+ i);

            for(int j = 0; j <arrayBi[1].length; j++){
                System.out.println("valor de i = " + i + ", posicion de j = "+ j);
                System.out.println(arrayBi[i][j]);
            }
        }
    }
}
