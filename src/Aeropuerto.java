import java.util.ArrayList;
import java.util.List;

/**
 * La clase Aeropuerto representa un aeropuerto con un nombre, una lista de vuelos y una lista de aerolíneas.
 */
public class Aeropuerto {
    private String nombre; // El nombre del aeropuerto.
    private List<Vuelo> vuelos = new ArrayList<>(); // La lista de vuelos en el aeropuerto.
    private List<Aerolinea> aerolineas = new ArrayList<>(); // La lista de aerolíneas en el aeropuerto.

    /**
     * Constructor de la clase Aeropuerto.
     * @param nombre El nombre del aeropuerto.
     */
    public Aeropuerto(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Agrega un vuelo a la lista de vuelos del aeropuerto.
     * @param vuelo El vuelo a agregar.
     */
    public void agregarVuelo(Vuelo vuelo) {
        this.vuelos.add(vuelo);
    }

    /**
     * Elimina un vuelo de la lista de vuelos del aeropuerto.
     * @param vuelo El vuelo a eliminar.
     */
    public void eliminarVuelo(Vuelo vuelo) {
        this.vuelos.remove(vuelo);
    }

    /**
     * Agrega una aerolínea a la lista de aerolíneas del aeropuerto.
     * @param aerolinea La aerolínea a agregar.
     */
    public void agregarAerolinea(Aerolinea aerolinea) {
        this.aerolineas.add(aerolinea);
    }

    /**
     * Elimina una aerolínea de la lista de aerolíneas del aeropuerto.
     * @param aerolinea La aerolínea a eliminar.
     */
    public void eliminarAerolinea(Aerolinea aerolinea) {
        this.aerolineas.remove(aerolinea);
    }
}