
package entidades;

public class Comida {
    private String nombre;
    private String detalle;
    private int cantCalorias;
    private int idComida;
    private boolean estado;

    public Comida() {
    }

    
    

    public Comida(String nombre, String detalle, int cantCalorias, int idComida, boolean estado) {
        this.nombre = nombre;
        this.detalle = detalle;
        this.cantCalorias = cantCalorias;
        this.idComida = idComida;
        this.estado = estado;
    }

    public Comida(String nombre, String detalle, int cantCalorias, boolean estado) {
        this.nombre = nombre;
        this.detalle = detalle;
        this.cantCalorias = cantCalorias;
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getCantCalorias() {
        return cantCalorias;
    }

    public void setCantCalorias(int cantCalorias) {
        this.cantCalorias = cantCalorias;
    }

    public int getIdComida() {
        return idComida;
    }

    public void setIdComida(int idComida) {
        this.idComida = idComida;
    }
    
    @Override
    public String toString() {
        return "Comida{" + "nombre=" + nombre + ", detalle=" + detalle + ", cantCalorias=" + cantCalorias + ", idComida=" + idComida + ", estado=" + estado + '}';
    }
}
