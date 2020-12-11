
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis Carlos Flores
 */
public class Programas {
    private String nombre;
    private int puntuacion;
    private String fecha;
    private String tipo;
    private String genero;

    public Programas() {
    }

    public Programas(String nombre, int puntuacion, String fecha, String tipo, String genero) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.fecha = fecha;
        this.tipo = tipo;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Programas{" + "nombre=" + nombre + ", puntuacion=" + puntuacion + ", fecha=" + fecha + ", tipo=" + tipo + ", genero=" + genero + '}';
    }
    
}
