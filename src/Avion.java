/**
 * La clase Avion representa un avión con su nombre y cantidad de asientos.
 */
public class Avion {
    private String nombre;
    private Integer cantAsientos;

    /**
     * Constructor de la clase Avion.
     *
     * @param cantAsientos La cantidad de asientos del avión.
     */
    public Avion(Integer cantAsientos) {
        this.cantAsientos = cantAsientos;
    }

    /**
     * Establece la cantidad de asientos del avión.
     *
     * @param cantAsientos La cantidad de asientos del avión.
     */
    public void setCantAsientos(Integer cantAsientos) {
        this.cantAsientos = cantAsientos;
    }

    /**
     * Obtiene el nombre del avión.
     *
     * @return El nombre del avión.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Establece el nombre del avión.
     *
     * @param nombre El nombre del avión.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la cantidad de asientos del avión.
     *
     * @return La cantidad de asientos del avión.
     */
    public int getCantAsientos() {
        return this.cantAsientos;
    }

    /**
     * Establece la cantidad de asientos del avión.
     *
     * @param cantAsientos La cantidad de asientos del avión.
     */
    public void setCantAsientos(int cantAsientos) {
        this.cantAsientos = cantAsientos;
    }
}
