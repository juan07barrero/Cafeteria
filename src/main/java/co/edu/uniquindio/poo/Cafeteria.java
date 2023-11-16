package co.edu.uniquindio.poo;

import java.util.ArrayList;

// Realizado por Juan José Barrero Jaramillo y Brayan David Córdoba 

public class Cafeteria {

    private ArrayList<Producto> productos;
    private ArrayList<Cliente> clientes;
    private Cliente cliente;

    public Cafeteria(ArrayList<Producto> productos, ArrayList<Cliente> clientes, Cliente cliente) {
        this.productos = productos;
        this.clientes = clientes;
        this.cliente = cliente;
    }

    public void agregarCliente(Cliente cliente) {
        if (cliente != null && !clientes.contains(cliente)) {
            clientes.add(cliente);
        }
    }

    public void agregarProducto(Producto producto) {
        if (producto != null && !productos.contains(producto)) {
            productos.add(producto);
        }
    }

    public double calcularTotalFactura() {
        double valorFactura = 0;
    
        if (productos != null) {
            for (Producto producto : productos) {
                valorFactura += producto.calcularPrecioTotal();
            }
        }
    
        return valorFactura;
    }
    

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public Cliente getCliente() {
        return cliente;
    }
    

    public double calcularTotalFacturaConDescuento() {
        double valorFactura = calcularTotalFactura();
        if (cliente != null) {
            valorFactura -= cliente.calcularDescuento();
        }
        return valorFactura;
    }
}

    

    
    

