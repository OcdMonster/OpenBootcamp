package Interfaces;

public class Coche {

    String fabricante;
    String modelo;
    boolean electrico;
    int puertas;

    public Coche() {

    }

    public Coche(String fabricante, String modelo, boolean electrico, int puertas) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.electrico = electrico;
        this.puertas = puertas;
    }

}
