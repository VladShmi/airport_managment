import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * La clase Ciudad representa una ciudad que contiene aeropuertos.
 */
public class Ciudad {
    private String nombre;
    private Pais pais;
    private List<Aeropuerto> aeropuertos = new ArrayList<>();

    /**
     * Constructor de la clase Ciudad.
     *
     * @param nombre El nombre de la ciudad.
     * @param pais   El país al que pertenece la ciudad.
     */
    public Ciudad(String nombre, Pais pais) {
        this.pais = pais;
        this.nombre = nombre;
        pais.agregarCiudades(new Ciudad[]{this});
    }

    /**
     * Obtiene el nombre de la ciudad.
     *
     * @return El nombre de la ciudad.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Establece el nombre de la ciudad.
     *
     * @param nombre El nombre de la ciudad.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el país al que pertenece la ciudad.
     *
     * @return El país al que pertenece la ciudad.
     */
    public Pais getPais() {
        return this.pais;
    }

    /**
     * Agrega aeropuertos a la ciudad.
     *
     * @param aeropuertos Los aeropuertos a agregar.
     */
    public void agregarAeropuertos(Aeropuerto... aeropuertos) {
        Collections.addAll(this.aeropuertos, aeropuertos);
    }

    /**
     * Obtiene la cantidad de aeropuertos en la ciudad.
     *
     * @return La cantidad de aeropuertos.
     */
    public Integer cantDeAeropuertos() {
        return this.aeropuertos.size();
    }

    /**
     * Obtiene la cantidad de pasajeros que llegaron a la ciudad en una fecha específica.
     *
     * @param dia La fecha en la que se desea buscar la cantidad de pasajeros.
     * @return La cantidad de pasajeros que llegaron en la fecha especificada.
     */
    public Integer cantPasajerosQueLlegaronElDia(LocalDate dia) {
        List<Vuelo> vuelosQueLlegaronEseDia = this.aeropuertos.stream()
                .flatMap(a -> a.vuelosQueLlegaronElDia(dia).stream())
                .collect(Collectors.toList());
        return vuelosQueLlegaronEseDia.stream()
                .mapToInt(Vuelo::cantPasajeros)
                .sum();
    }
}