
package entidades;

public class Paciente {
    private String nombre;
    private int dni;
    private String Domicilio;
    private String telefono;
    private int idPaciente;

    public Paciente() {
    }

    public Paciente(String nombre, int dni, String Domicilio, String telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.Domicilio = Domicilio;
        this.telefono = telefono;
    }

    public Paciente(String nombre, int dni, String Domicilio, String telefono, int idPaciente) {
        this.nombre = nombre;
        this.dni = dni;
        this.Domicilio = Domicilio;
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
        return Domicilio;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
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
    
    
}
