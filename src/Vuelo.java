import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class Vuelo {
    private String origen;
    private String destino;
    private double duracionEstimadaEnMins;
    private LocalDateTime fechaDeLlegadaAproximada;
    private LocalDateTime fecha;
    private List<Pasajero> pasajeros;

    public Vuelo() {
        this.pasajeros = new ArrayList<>();
    }

    public String getOrigen() {
        return this.origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public List<Pasajero> getPasajeros() {
        return this.pasajeros;
    }

    public LocalDateTime getFecha() {
        return this.fecha;
    }

    public void agregarPasajero(Pasajero pasajero) {
        this.pasajeros.add(pasajero);
    }

    public boolean tuDestinoEs(Ciudad ciudad) {
        return this.destino.equals(ciudad.getNombre());
    }

    public double getDuracionEstimadaEnMins() {
        return this.duracionEstimadaEnMins;
    }

    public void setDuracionEstimadaEnMins(double duracionEstimadaEnMins) {
        this.duracionEstimadaEnMins = duracionEstimadaEnMins;
    }

    public int cantPasajeros() {
        return this.pasajeros.size();
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public LocalDateTime fechaDeLlegadaAproximada() {
        return this.fechaDeLlegadaAproximada;
    }

    public void setFechaDeLlegadaAproximada(LocalDateTime fechaDeLlegadaAproximada) {
        this.fechaDeLlegadaAproximada = fechaDeLlegadaAproximada;
    }
}
