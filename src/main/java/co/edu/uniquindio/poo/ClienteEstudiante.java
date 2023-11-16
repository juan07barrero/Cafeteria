package co.edu.uniquindio.poo;



public class ClienteEstudiante extends Cliente {

    private int semestre;

    public ClienteEstudiante(String id, String nombre, String apellido, String correo, int semestre) {
        super(id, nombre, apellido, correo);
        this.semestre = semestre;
    }

    @Override
    public double calcularDescuento() {
        double descuento = 0.012;
        descuento = 0.012 * semestre;
        return descuento;
        
    }
    
}
