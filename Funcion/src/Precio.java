/*Para este ejercicio tendréis que crear una función
 que reciba un precio y devuelva el precio con el IVA incluido.¨*/
public class Precio {

    public static void main(String[] args) {
        double Total = operacion(100, .16);
        System.out.println(Total);
    }
    static double operacion(double num1, double iva){
        return num1 + (num1* iva);
    }
}