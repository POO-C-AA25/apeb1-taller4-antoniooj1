
package Taller4;

public class Problema5_Cliente {
    String nombre;
    String tipoEjercicio;
    int duracion;
    boolean cumplio;

    public Problema5_Cliente(String nombre, String tipoEjercicio, int duracion, boolean cumplio) {
        this.nombre = nombre;
        this.tipoEjercicio = tipoEjercicio;
        this.duracion = duracion;
        this.cumplio = cumplio;
    }

    public boolean rutinaCompletada() {
        return cumplio;
    }
}
