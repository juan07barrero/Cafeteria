package co.edu.uniquindio.poo;

public class Dulce extends Producto {

    private double cantidadAzucar;

    public Dulce(String nombre, double valor, double cantidadAzucar) {

        super(nombre, valor);
        this.cantidadAzucar = cantidadAzucar;
        
    }

    @Override
    public double calcularPrecioTotal() {
        
        double precio;
        double impuesto = 0.50;

        if(cantidadAzucar > 50){
            impuesto = 0.60;
        }

        precio = valor + (valor * impuesto);
         return precio;

    }

    


    
}
