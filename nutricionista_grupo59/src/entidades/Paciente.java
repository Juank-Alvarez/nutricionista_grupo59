
package entidades;

public class Paciente {
    private String nombre;
    private String apellido;
    private int dni;
    private String domicilio;
    private String telefono;
    private int idPaciente;

    public Paciente() {
    }

    public Paciente(String nombre, int dni, String Domicilio, String telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = Domicilio;
        this.telefono = telefono;
    }

    public Paciente(String nombre, int dni, String Domicilio, String telefono, int idPaciente) {
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = Domicilio;
        this.telefono = telefono;
        this.idPaciente = idPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
}