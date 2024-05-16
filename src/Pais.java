import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pais {
    private String nombre;
    private Continente continente;
    private List<Ciudad> ciudades = new ArrayList();

    public Pais(String nombre, Continente continente) {
        this.nombre = nombre;
        this.continente = continente;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Continente getContinente() {
        return this.continente;
    }

    public void setContinente(Continente continente) {
        this.continente = continente;
    }

    public void agregarCiudades(Ciudad... ciudades) {
        Collections.addAll(this.ciudades, ciudades);
    }
}