import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * La clase Aeropuerto representa un aeropuerto con sus vuelos y su ciudad.
 */
public class Aeropuerto {
    private String nombre;
    private String codigoInternacional;
    private Ciudad ciudad;
    private List<Vuelo> vuelos;
    private LocalDateTime fechaDeLlegadaAproximada;

    /**
     * Constructor de la clase Aeropuerto.
     *
     * @param nombre                El nombre del aeropuerto.
     * @param codigoInternacional   El código internacional del aeropuerto.
     * @param ciudad                La ciudad donde se encuentra el aeropuerto.
     */
    public Aeropuerto(String nombre, String codigoInternacional, Ciudad ciudad) {
        this.ciudad = ciudad;
        this.nombre = nombre;
        this.codigoInternacional = codigoInternacional;
        this.vuelos = new ArrayList<>();
        ciudad.agregarAeropuertos(new Aeropuerto[]{this});
    }

    /**
     * Obtiene una lista de vuelos que llegaron al aeropuerto en una fecha específica.
     *
     * @param dia La fecha en la que se desea buscar los vuelos.
     * @return Una lista de vuelos que llegaron en la fecha especificada.
     */
    public List<Vuelo> vuelosQueLlegaronElDia(LocalDate dia) {
        return this.vuelos.stream().filter(v -> v.fechaDeLlegadaAproximada().toLocalDate().isEqual(dia)).collect(Collectors.toList());
    }
}
