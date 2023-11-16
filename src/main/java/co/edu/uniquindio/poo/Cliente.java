package co.edu.uniquindio.poo;



public abstract class Cliente {

    protected String id;
    protected String nombre;
    protected String apellido;
    protected String correo;
    

    public Cliente(String id, String nombre, String apellido, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        
    }

    public abstract double calcularDescuento();


    public String getId() {
        return id;
    }


    public String getNombre() {
        return nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public String getCorreo() {
        return correo;
    }

    

    
    
    
}
