package co.edu.uniquindio.poo;


import java.util.Scanner;

public class ClienteProfesor extends Cliente {

    

    private String categoria;

    public ClienteProfesor(String id, String nombre, String apellido, String correo,
     String categoria) {
        super(id, nombre, apellido, correo);
        this.categoria = categoria;
    }

    @Override
    public double calcularDescuento() {
        double descuento;
        switch (categoria.toUpperCase()) {
            case "AUXILIAR":
                descuento = 0.03;
            case "ASISTENTE":
                descuento = 0.05;
            case "ASOCIADO":
                descuento = 0.10;
            case "TITULAR":
                descuento =  0.16;
            default:
                descuento = 0;    
        }

        return descuento;



    }

    

}

    