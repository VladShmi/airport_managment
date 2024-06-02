import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * La clase Vuelo representa un vuelo entre un origen y un destino, con una duración estimada, fechas y una lista de pasajeros.
 */
public class Vuelo {
    private String origen; // El origen del vuelo.
    private String destino; // El destino del vuelo.
    private double duracionEstimadaEnMins; // La duración estimada del vuelo en minutos.
    private LocalDateTime fechaDeLlegadaAproximada; // La fecha de llegada aproximada del vuelo.
    private LocalDateTime fecha; // La fecha de salida del vuelo.
    private List<Pasajero> pasajeros; // La lista de pasajeros del vuelo.

    /**
     * Constructor por defecto de la clase Vuelo.
     */
    public Vuelo() {
        this.pasajeros = new ArrayList<>();
    }

    /**
     * Obtiene el origen del vuelo.
     * @return El origen del vuelo.
     */
    public String getOrigen() {
        return this.origen;
    }

    /**
     * Establece el origen del vuelo.
     * @param origen El nuevo origen del vuelo.
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    /**
     * Obtiene el destino del vuelo.
     * @return El destino del vuelo.
     */
    public String getDestino() {
        return this.destino;
    }

    /**
     * Establece el destino del vuelo.
     * @param destino El nuevo destino del vuelo.
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * Obtiene la lista de pasajeros del vuelo.
     * @return La lista de pasajeros del vuelo.
     */
    public List<Pasajero> getPasajeros() {
        return this.pasajeros;
    }

    /**
     * Obtiene la fecha de salida del vuelo.
     * @return La fecha de salida del vuelo.
     */
    public LocalDateTime getFecha() {
        return this.fecha;
    }

    /**
     * Agrega un pasajero al vuelo.
     * @param pasajero El pasajero a agregar.
     */
    public void agregarPasajero(Pasajero pasajero) {
        this.pasajeros.add(pasajero);
    }

    /**
     * Verifica si el destino del vuelo es una ciudad específica.
     * @param ciudad La ciudad a verificar.
     * @return true si el destino del vuelo es la ciudad especificada, false de lo contrario.
     */
    public boolean tuDestinoEs(Ciudad ciudad) {
        return this.destino.equals(ciudad.getNombre());
    }

    /**
     * Obtiene la duración estimada del vuelo en minutos.
     * @return La duración estimada del vuelo en minutos.
     */
    public double getDuracionEstimadaEnMins() {
        return this.duracionEstimadaEnMins;
    }

    /**
     * Establece la duración estimada del vuelo en minutos.
     * @param duracionEstimadaEnMins La nueva duración estimada del vuelo en minutos.
     */
    public void setDuracionEstimadaEnMins(double duracionEstimadaEnMins) {
        this.duracionEstimadaEnMins = duracionEstimadaEnMins;
    }

    /**
     * Obtiene la cantidad de pasajeros en el vuelo.
     * @return La cantidad de pasajeros en el vuelo.
     */
    public int cantPasajeros() {
        return this.pasajeros.size();
    }

    /**
     * Establece la fecha de salida del vuelo.
     * @param fecha La nueva fecha de salida del vuelo.
     */
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene la fecha de llegada aproximada del vuelo.
     * @return La fecha de llegada aproximada del vuelo.
     */
    public LocalDateTime fechaDeLlegadaAproximada() {
        return this.fechaDeLlegadaAproximada;
    }

    /**
     * Establece la fecha de llegada aproximada del vuelo.
     * @param fechaDeLlegadaAproximada La nueva fecha de llegada aproximada del vuelo.
     */
    public void setFechaDeLlegadaAproximada(LocalDateTime fechaDeLlegadaAproximada) {
        this.fechaDeLlegadaAproximada = fechaDeLlegadaAproximada;
    }
}