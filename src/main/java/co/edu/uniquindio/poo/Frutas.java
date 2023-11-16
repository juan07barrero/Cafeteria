package co.edu.uniquindio.poo;

public class Frutas extends Producto {

    private int numeroKilos;

    public Frutas(String nombre, double valor, int numeroKilos) {
        super(nombre, valor);
        this.numeroKilos = numeroKilos;
    }

    @Override
    public double calcularPrecioTotal() {
        double impuestoBase = 0.07;

        double reduccionPorKiloAdicional = 0.01;

        int limiteReduccion = 3;

        double impuesto = impuestoBase;
        if (numeroKilos > limiteReduccion) {
            impuesto -= (numeroKilos - limiteReduccion) * reduccionPorKiloAdicional;
        }

        double precioTotal = valor * numeroKilos * (1 + impuesto);

        return precioTotal;

    }
    
}
