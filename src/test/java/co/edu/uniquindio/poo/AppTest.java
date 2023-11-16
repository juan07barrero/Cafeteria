package co.edu.uniquindio.poo;



//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

//import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void testCalcularValorAPagarConDescuento() {

        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Producto> productos = new ArrayList<>();

        //Scanner scanner = new Scanner(System.in);
        
        
        BebidaAzucarada jugo = new BebidaAzucarada("HIT", 3500, 40);
        ClienteEstudiante cliente = new ClienteEstudiante("1040","Nicol", "Bedoya", "nicol06b@gmail.com", 4);
        Cafeteria cafeteria = new Cafeteria(productos, clientes, cliente);

        cafeteria.agregarCliente(cliente);

        cafeteria.agregarProducto(jugo);


        // Ejecución
        double valorAPagar = cafeteria.calcularTotalFacturaConDescuento();

        // Verificación
        assertEquals(4374.952, valorAPagar); 
    }
}
