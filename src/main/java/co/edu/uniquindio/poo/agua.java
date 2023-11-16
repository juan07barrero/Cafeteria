package co.edu.uniquindio.poo;

public class agua extends Bebida {

    public agua(String nombre, double valor) {
        super(nombre, valor);
    }

    @Override
    public double calcularPrecioTotal() {
        return valor;
    }
    
}
