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

    /**
     * Agrega un pasajero a un vuelo específico de la aerolínea.
     * @param origen El origen del vuelo.
     * @param destino El destino del vuelo.
     * @param pasajero El pasajero a agregar al vuelo.
     */
    public void agregarPasajeroAVuelo(String origen, String destino, Pasajero pasajero) {
        for (Vuelo vuelo : vuelos) {
            if (vuelo.getOrigen().equals(origen) && vuelo.getDestino().equals(destino)) {
                vuelo.agregarPasajero(pasajero);
                return;
            }
        }
        System.out.println("No se encontró el vuelo con el origen y destino especificados.");
    }

    /**
     * Muestra la información de todos los vuelos de la aerolínea.
     */
    public void mostrarVuelos() {
        for (Vuelo vuelo : vuelos) {
            System.out.println("Origen: " + vuelo.getOrigen() + ", Destino: " + vuelo.getDestino());
        }
    }

    /**
     * Muestra la información de los pasajeros de un vuelo específico.
     * @param origen El origen del vuelo.
     * @param destino El destino del vuelo.
     */
    public void mostrarPasajerosDeVuelo(String origen, String destino) {
        for (Vuelo vuelo : vuelos) {
            if (vuelo.getOrigen().equals(origen) && vuelo.getDestino().equals(destino)) {
                for (Pasajero pasajero : vuelo.getPasajeros()) {
                    System.out.println("Nombre: " + pasajero.getNombre() + ", Apellido: " + pasajero.getApellido());
                }
                return;
            }
        }
        System.out.println("No se encontró el vuelo con el origen y destino especificados.");
    }
}