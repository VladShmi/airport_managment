import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * La clase Pais representa un país con un nombre, un continente al que pertenece y una lista de ciudades.
 */
public class Pais {
    private String nombre; // El nombre del país.
    private Continente continente; // El continente al que pertenece el país.
    private List<Ciudad> ciudades = new ArrayList(); // La lista de ciudades en el país.

    /**
     * Constructor de la clase Pais.
     * @param nombre El nombre del país.
     * @param continente El continente al que pertenece el país.
     */
    public Pais(String nombre, Continente continente) {
        this.nombre = nombre;
        this.continente = continente;
    }

    /**
     * Obtiene el nombre del país.
     * @return El nombre del país.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Establece el nombre del país.
     * @param nombre El nuevo nombre del país.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el continente al que pertenece el país.
     * @return El continente al que pertenece el país.
     */
    public Continente getContinente() {
        return this.continente;
    }

    /**
     * Establece el continente al que pertenece el país.
     * @param continente El nuevo continente al que pertenece el país.
     */
    public void setContinente(Continente continente) {
        this.continente = continente;
    }

    /**
     * Agrega ciudades al país.
     * @param ciudades Las ciudades a agregar.
     */
    public void agregarCiudades(Ciudad... ciudades) {
        Collections.addAll(this.ciudades, ciudades);
    }
}