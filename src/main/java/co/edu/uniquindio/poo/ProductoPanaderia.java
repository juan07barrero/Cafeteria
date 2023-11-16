package co.edu.uniquindio.poo;

public class ProductoPanaderia extends Producto {

    private boolean conservantes;

    public ProductoPanaderia(String nombre, double valor, boolean conservantes) {
        super(nombre, valor);
        this.conservantes = conservantes;
    }

    @Override
    public double calcularPrecioTotal() {
        
        double precio = 0;
        double impuesto = 0;

        if(conservantes == true){
            impuesto = 0.18;
        }

        precio = valor + (valor * impuesto);
        return precio;
    }
    
 

    public boolean isConservantes() {
        return conservantes;
    }   
}
