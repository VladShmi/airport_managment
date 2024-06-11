import java.util.ArrayList;
import java.util.List;

/**
 * La clase Aerolinea representa una aerolínea con un nombre, una lista de vuelos y una lista de pasajeros.
 */
public class Aerolinea {
    private String nombre; // El nombre de la aerolínea.
    private List<Vuelo> vuelos = new ArrayList<>(); // La lista de vuelos de la aerolínea.
    private List<Pasajero> pasajeros = new ArrayList<>(); // La lista de pasajeros de la aerolínea.

    /**
     * Constructor de la clase Aerolinea.
     * @param nombre El nombre de la aerolínea.
     */
    public Aerolinea(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Agrega un vuelo a la lista de vuelos de la aerolínea.
     * @param vuelo El vuelo a agregar.
     */
    public void agregarVuelo(Vuelo vuelo) {
        this.vuelos.add(vuelo);
    }

    /**
     * Elimina un vuelo de la lista de vuelos de la aerolínea.
     * @param vuelo El vuelo a eliminar.
     */
    public void eliminarVuelo(Vuelo vuelo) {
        this.vuelos.remove(vuelo);
    }

    /**
     * Agrega un pasajero a la lista de pasajeros de la aerolínea.
     * @param pasajero El pasajero a agregar.
     */
    public void agregarPasajero(Pasajero pasajero) {
        this.pasajeros.add(pasajero);
    }

    /**
     * Elimina un pasajero de la lista de pasajeros de la aerolínea.
     * @param pasajero El pasajero a eliminar.
     */
    public void eliminarPasajero(Pasajero pasajero) {
        this.pasajeros.remove(pasajero);
    }
}
