package co.edu.uniquindio.poo;

public class BebidaAzucarada extends Bebida {

    private double cantidadAzucar;

    public BebidaAzucarada(String nombre, double valor, double cantidadAzucar) {
        super(nombre, valor);
        this.cantidadAzucar = cantidadAzucar;
    }

    @Override
    public double calcularPrecioTotal() {

        double impuesto = 0.05;
        double precio;
        
        if(cantidadAzucar > 35){
            impuesto = 0.25;
        }
        precio = valor + (valor * impuesto);
        return precio;
    
    }
    
}
