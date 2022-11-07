package POO.clases;

/*En este ejercicio tendréis que crear una clase SmartDevice.

Dentro crearéis las clases hijas: SmartPhone y SmartWatch.

Agregaréis atributos tal cual tendrían esos objetos en la realidad.
Crear constructor vacío y con todos los parámetros para cada clase.
Desde una clase Main: crearéis objetos de cada una y los utilizaréis
para imprimir sus valores por consola.*/

public class SmartDevice {

    public static void main(String[] args) {

        SmartWatch apple = new SmartWatch("Apple", "Sports Watch", true, 8000, "42mm", true);
        System.out.println("fabricante: " + apple.fabricante);
        System.out.println("modelo: " + apple.modelo);
        System.out.println("Touch: " + apple.touch);
        System.out.println("Battery: " + apple.battery);
        System.out.println("Size: " + apple.size);
        System.out.println("HeartBeat: " + apple.heartBeat);
        System.out.println(" ");

        SmartPhone samsung = new SmartPhone("Samsung", "galaxy 22", true, 10000, "6.6 inch", true);
        System.out.println("fabricante: " + samsung.fabricante);
        System.out.println("modelo: " + samsung.modelo);
        System.out.println("Touch: " + samsung.touch);
        System.out.println("Battery: " + samsung.battery);
        System.out.println("Size: " + samsung.size);
        System.out.println("Flashlight: " + samsung.flashlight);
    }
}
