import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * La clase Viaje representa un conjunto de vuelos y escalas que forman parte de un viaje, con una fecha de salida y una aerolínea.
 */
public class Viaje {
    private List<Vuelo> vuelos = new ArrayList(); // La lista de vuelos del viaje.
    private List<Escala> escalas = new ArrayList(); // La lista de escalas del viaje.
    private LocalDateTime fechaSalida; // La fecha de salida del viaje.
    private Aerolinea aerolinea; // La aerolínea del viaje.

    /**
     * Constructor por defecto de la clase Viaje.
     */
    public Viaje() {
    }

    /**
     * Obtiene la fecha de salida del viaje.
     * @return La fecha de salida del viaje.
     */
    public LocalDateTime getFechaSalida() {
        return this.fechaSalida;
    }

    /**
     * Establece la fecha de salida del viaje.
     * @param fechaSalida La nueva fecha de salida del viaje.
     */
    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    /**
     * Obtiene la aerolínea del viaje.
     * @return La aerolínea del viaje.
     */
    public Aerolinea getAerolinea() {
        return this.aerolinea;
    }

    /**
     * Establece la aerolínea del viaje.
     * @param aerolinea La nueva aerolínea del viaje.
     */
    public void setAerolinea(Aerolinea aerolinea) {
        this.aerolinea = aerolinea;
    }

    /**
     * Obtiene la lista de vuelos del viaje.
     * @return La lista de vuelos del viaje.
     */
    public List<Vuelo> getVuelos() {
        return this.vuelos;
    }

    /**
     * Obtiene la lista de escalas del viaje.
     * @return La lista de escalas del viaje.
     */
    public List<Escala> getEscalas() {
        return this.escalas;
    }

    /**
     * Agrega vuelos al viaje.
     * @param vuelos Los vuelos a agregar.
     */
    public void agregarVuelos(Vuelo... vuelos) {
        Collections.addAll(this.vuelos, vuelos);
    }

    /**
     * Agrega escalas al viaje.
     * @param escalas Las escalas a agregar.
     */
    public void agregarEscalas(Escala... escalas) {
        Collections.addAll(this.escalas, escalas);
    }

    /**
     * Obtiene la cantidad total de pasajeros en todos los vuelos del viaje.
     * @return La cantidad total de pasajeros en todos los vuelos del viaje.
     */
    public Integer cantPasajerosTotales() {
        return this.vuelos.stream().mapToInt(Vuelo::cantPasajeros).sum();
    }

    /**
     * Calcula la duración total de todos los vuelos del viaje en minutos.
     * @return La duración total de todos los vuelos del viaje en minutos.
     */
    private Double duracionTotalDeVuelosEnMins() {
        return this.vuelos.stream().mapToDouble(Vuelo::getDuracionEstimadaEnMins).sum();
    }

    /**
     * Calcula la duración total de todas las escalas del viaje en minutos.
     * @return La duración total de todas las escalas del viaje en minutos.
     */
    private Double duracionTotalDeEscalasEnMins() {
        return this.escalas.stream().mapToDouble(Escala::getDuracionEnMins).sum();
    }

    /**
     * Obtiene la duración total del viaje en minutos, sumando la duración de los vuelos y escalas.
     * @return La duración total del viaje en minutos.
     */
    public Double duracionTotalEnMins() {
        return this.duracionTotalDeEscalasEnMins() + this.duracionTotalDeVuelosEnMins();
    }

    /**
     * Agrega un vuelo al viaje.
     * @param vuelo El vuelo a agregar.
     */
    public void agregarVuelo(Vuelo vuelo) {
        this.vuelos.add(vuelo);
    }
}