package co.edu.uniquindio.poo;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        

        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Producto> productos = new ArrayList<>();
        
        BebidaAzucarada jugo = new BebidaAzucarada("HIT", 3500, 40);
        ClienteEstudiante cliente = new ClienteEstudiante("1040","Nicol", "Bedoya", "nicol06b@gmail.com", 4);
        Cafeteria cafeteria = new Cafeteria(productos, clientes, cliente);

        cafeteria.agregarCliente(cliente);

        cafeteria.agregarProducto(jugo);

        Double descuento = cafeteria.calcularTotalFactura();
        Double descuentos = cafeteria.calcularTotalFacturaConDescuento();
        System.out.println(descuento);
        System.out.println(descuentos);
        

    }
}
