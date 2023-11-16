package co.edu.uniquindio.poo;

public abstract class Producto {

    protected String nombre;
    protected double valor;

    public Producto(String nombre, double valor) {

        this.nombre = nombre;
        this.valor = valor;

    }

    public abstract double calcularPrecioTotal();
    
    
    
}
