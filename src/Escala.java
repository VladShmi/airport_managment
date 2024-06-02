/**
 * La clase Escala representa una escala en un vuelo, con un aeropuerto de escala y una duración en minutos.
 */
public class Escala {
    private Aeropuerto aeropuerto; // El aeropuerto en el que se realiza la escala.
    private Double duracionEnMins; // La duración de la escala en minutos.

    /**
     * Constructor por defecto de la clase Escala.
     */
    public Escala() {
    }

    /**
     * Obtiene el aeropuerto de la escala.
     * @return El aeropuerto de la escala.
     */
    public Aeropuerto getAeropuerto() {
        return this.aeropuerto;
    }

    /**
     * Establece el aeropuerto de la escala.
     * @param aeropuerto El nuevo aeropuerto de la escala.
     */
    public void setAeropuerto(Aeropuerto aeropuerto) {
        this.aeropuerto = aeropuerto;
    }

    /**
     * Obtiene la duración de la escala en minutos.
     * @return La duración de la escala en minutos.
     */
    public Double getDuracionEnMins() {
        return this.duracionEnMins;
    }

    /**
     * Establece la duración de la escala en minutos.
     * @param duracionEnMins La nueva duración de la escala en minutos.
     */
    public void setDuracionEnMins(Double duracionEnMins) {
        this.duracionEnMins = duracionEnMins;
    }
}