import java.util.ArrayList;
import java.util.List;

/**
 * La clase Aerolinea representa una aerolínea que gestiona una lista de vuelos.
 */
public class Aerolinea {
    private List<Vuelo> vuelos;

    /**
     * Constructor de la clase Aerolinea.
     * Inicializa la lista de vuelos.
     */
    public Aerolinea() {
        this.vuelos = new ArrayList<>();
    }

    /**
     * Agrega un vuelo a la lista de vuelos.
     *
     * @param vuelo El vuelo a agregar.
     */
    public void agregarVuelo(Vuelo vuelo) {
        this.vuelos.add(vuelo);
    }

    /**
     * Agrega un pasajero a un vuelo específico.
     *
     * @param origen    El origen del vuelo.
     * @param destino   El destino del vuelo.
     * @param pasajero  El pasajero a agregar al vuelo.
     */
    public void agregarPasajeroAVuelo(String origen, String destino, Pasajero pasajero) {
        for (Vuelo vuelo : vuelos) {
            if (vuelo.getOrigen().equals(origen) && vuelo.getDestino().equals(destino)) {
                vuelo.getPasajeros().add(pasajero);
                return;
            }
        }
        System.out.println("No se encontró el vuelo con el origen " + origen + " y destino " + destino);
    }

    /**
     * Muestra todos los vuelos de la aerolínea.
     */
    public void mostrarVuelos() {
        for (Vuelo vuelo : this.vuelos) {
            System.out.println("Origen: " + vuelo.getOrigen() + ", Destino: " + vuelo.getDestino());
        }
    }

    /**
     * Muestra todos los pasajeros de un vuelo específico.
     *
     * @param origen    El origen del vuelo.
     * @param destino   El destino del vuelo.
     */
    public void mostrarPasajerosDeVuelo(String origen, String destino) {
        for (Vuelo vuelo : vuelos) {
            if (vuelo.getOrigen().equals(origen) && vuelo.getDestino().equals(destino)) {
                List<Pasajero> pasajeros = vuelo.getPasajeros();
                for (Pasajero pasajero : pasajeros) {
                    System.out.println(pasajero.getNombre() + " " + pasajero.getApellido());
                }
                return;
            }
        }
        System.out.println("No se encontró el vuelo con el origen " + origen + " y destino " + destino);
    }
}
