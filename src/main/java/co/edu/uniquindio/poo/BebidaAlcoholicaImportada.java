package co.edu.uniquindio.poo;

public class BebidaAlcoholicaImportada extends BebidasAlcoholicas {

    public BebidaAlcoholicaImportada(String nombre, double valor, double contenidoAlcohol) {
        super(nombre, valor, contenidoAlcohol);

    }

    @Override
    public double calcularPrecioTotal() {
        double precio;
        precio = (valor * 1.3) * (1 + (0.3 * contenidoAlcohol));
        return precio;
    }
    
}
