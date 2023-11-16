package co.edu.uniquindio.poo;

public class BebidasAlcoholicasNacionales extends BebidasAlcoholicas {

    public BebidasAlcoholicasNacionales(String nombre, double valor,  double contenidoAlcohol) {
        super(nombre, valor, contenidoAlcohol);
    }

    @Override
    public double calcularPrecioTotal() {
       double precio;
       double impuesto = 2;
       precio = (valor*impuesto);
       return precio;

    }
    
}
