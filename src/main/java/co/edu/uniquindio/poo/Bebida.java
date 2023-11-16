package co.edu.uniquindio.poo;

public abstract class Bebida extends Producto {

    public Bebida(String nombre, double valor) {
        super(nombre, valor);
    }

    @Override
    public abstract double calcularPrecioTotal();

    
    
}
