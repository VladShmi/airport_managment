import java.util.Collections;
import java.util.List;

/**
 * La clase Pasajero representa a una persona que viaja en vuelos, con información como nombre, apellido, número de pasaporte, nacionalidad y una lista de vuelos.
 */
public class Pasajero extends Persona {
    private String nombre; // El nombre del pasajero.
    private String apellido; // El apellido del pasajero.
    private List<Vuelo> vuelos; // La lista de vuelos del pasajero.
    private Integer nroDePasaporte; // El número de pasaporte del pasajero.
    private Pais nacionalidad; // La nacionalidad del pasajero.

    /**
     * Constructor de la clase Pasajero.
     * @param nombre El nombre del pasajero.
     * @param apellido El apellido del pasajero.
     */
    public Pasajero(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    /**
     * Obtiene el número de pasaporte del pasajero.
     * @return El número de pasaporte del pasajero.
     */
    public Integer getNroDePasaporte() {
        return this.nroDePasaporte;
    }

    /**
     * Establece el número de pasaporte del pasajero.
     * @param nroDePasaporte El nuevo número de pasaporte del pasajero.
     */
    public void setNroDePasaporte(Integer nroDePasaporte) {
        this.nroDePasaporte = nroDePasaporte;
    }

    /**
     * Obtiene la nacionalidad del pasajero.
     * @return La nacionalidad del pasajero.
     */
    public Pais getNacionalidad() {
        return this.nacionalidad;
    }

    /**
     * Establece la nacionalidad del pasajero.
     * @param nacionalidad La nueva nacionalidad del pasajero.
     */
    public void setNacionalidad(Pais nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * Obtiene la lista de vuelos del pasajero.
     * @return La lista de vuelos del pasajero.
     */
    public List<Vuelo> getVuelos() {
        return this.vuelos;
    }

    /**
     * Agrega vuelos a la lista del pasajero.
     * @param vuelos Los vuelos a agregar.
     */
    public void agregarVuelos(Vuelo... vuelos) {
        Collections.addAll(this.vuelos, vuelos);
    }

    /**
     * Obtiene la cantidad total de vuelos del pasajero.
     * @return La cantidad total de vuelos del pasajero.
     */
    public Integer cantVuelosTotales() {
        return this.vuelos.size();
    }

    /**
     * Obtiene la cantidad de veces que el pasajero visitó una ciudad en sus vuelos.
     * @param unaCiudad La ciudad a consultar.
     * @return La cantidad de veces que el pasajero visitó la ciudad.
     */
    public Integer cantVecesQueVisitaste(Ciudad unaCiudad) {
        return (int) this.vuelos.stream().filter((v) -> {
            return v.tuDestinoEs(unaCiudad);
        }).count();
    }

    /**
     * Obtiene el nombre del pasajero.
     * @return El nombre del pasajero.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Establece el nombre del pasajero.
     * @param nombre El nuevo nombre del pasajero.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido del pasajero.
     * @return El apellido del pasajero.
     */
    public String getApellido() {
        return this.apellido;
    }

    /**
     * Establece el apellido del pasajero.
     * @param apellido El nuevo apellido del pasajero.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}