
package entidades;

import java.time.LocalDate;

public class Dieta {
    private int idDieta;
    private String nombre;
    private Paciente paciente;
    private LocalDate fechaInicial;
    private double pesoInicial;
    private double pesoBuscado;
    private double pesoFinal;
    private String genero;
    private double altura;
    private LocalDate fechaFinal;
    private boolean estado;

    public Dieta() {
    }

    public Dieta(int idDieta, String nombre, Paciente paciente, LocalDate fechaInicial, double pesoInicial, double pesoBuscado, double pesoFinal, String genero, double altura, LocalDate fechaFinal, boolean estado) {
        this.idDieta = idDieta;
        this.nombre = nombre;
        this.paciente = paciente;
        this.fechaInicial = fechaInicial;
        this.pesoInicial = pesoInicial;
        this.pesoBuscado = pesoBuscado;
        this.pesoFinal = pesoFinal;
        this.genero = genero;
        this.altura = altura;
        this.fechaFinal = fechaFinal;
        this.estado = estado;
    }

    public Dieta(String nombre, Paciente paciente, LocalDate fechaInicial, double pesoInicial, double pesoBuscado, double pesoFinal, String genero, double altura, LocalDate fechaFinal, boolean estado) {
        this.nombre = nombre;
        this.paciente = paciente;
        this.fechaInicial = fechaInicial;
        this.pesoInicial = pesoInicial;
        this.pesoBuscado = pesoBuscado;
        this.pesoFinal = pesoFinal;
        this.genero = genero;
        this.altura = altura;
        this.fechaFinal = fechaFinal;
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPesoBuscado() {
        return pesoBuscado;
    }

    public void setPesoBuscado(double pesoBuscado) {
        this.pesoBuscado = pesoBuscado;
    }



    public int getIdDieta() {
        return idDieta;
    }

    public void setIdDieta(int idDieta) {
        this.idDieta = idDieta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public LocalDate getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(LocalDate fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public double getPesoInicial() {
        return pesoInicial;
    }

    public void setPesoInicial(double pesoInicial) {
        this.pesoInicial = pesoInicial;
    }

    public double getPesoFinal() {
        return pesoFinal;
    }

    public void setPesoFinal(double pesoFinal) {
        this.pesoFinal = pesoFinal;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    @Override
    public String toString() {
        return "Dieta{" + "nombre dieta=" + nombre + ", nombre paciente=" + paciente.getNombre() + ", apellido paciente=" + paciente.getApellido() + ", fechaInicial=" + fechaInicial + ", pesoInicial=" + pesoInicial + ", pesoBuscado=" + pesoBuscado + ", pesoFinal=" + pesoFinal + ", genero=" + genero + ", altura=" + altura + ", fechaFinal=" + fechaFinal + '}';
    }
     
    
}
