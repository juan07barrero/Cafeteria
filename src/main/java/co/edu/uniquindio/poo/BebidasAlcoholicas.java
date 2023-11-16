package co.edu.uniquindio.poo;

public abstract class BebidasAlcoholicas extends Bebida {

    protected double contenidoAlcohol;

    public BebidasAlcoholicas(String nombre, double valor, double contenidoAlcohol) {
        super(nombre, valor);
        this.contenidoAlcohol = contenidoAlcohol;
    }

    public abstract double calcularPrecioTotal();
    
}
