package POO.clases;

/*En este ejercicio tendréis que crear una clase SmartDevice.

Dentro crearéis las clases hijas: SmartPhone y SmartWatch.

Agregaréis atributos tal cual tendrían esos objetos en la realidad.
Crear constructor vacío y con todos los parámetros para cada clase.
Desde una clase Main: crearéis objetos de cada una y los utilizaréis
para imprimir sus valores por consola.*/

public class SmartWatch extends SmartPhone{
    // atributos
    Boolean heartBeat;

    //contructores
    public SmartWatch(){

    }

    public SmartWatch(String fabricante, String modelo, boolean touch, int battery, String size, Boolean heartBeat) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.touch = touch;
        this.battery = battery;
        this.size = size;
        this.heartBeat = heartBeat;
    }

    //metodos

}
