package Refactor;

//Crea una función DividePorCero. Esta, debe generar una excepción ("throws")
// a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main",
// por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
// Finalmente, mostraremos en cualquier caso: "Demo de código".

public class divideCero {

    public static void main(String[] args) {

        try {
            DividePorCero(10, 0);
            System.out.println("Demo de código");
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        }
            }

    static void DividePorCero(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
    }
}