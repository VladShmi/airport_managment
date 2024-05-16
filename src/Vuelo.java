import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Vuelo {
    private Aeropuerto origen;
    private Aeropuerto destino;
    private LocalDateTime fecha;
    private Double duracionEstimadaEnMins;
    private Integer cantAsientosOfrecidos;
    private Avion avion;
    private List<Pasajero> pasajeros = new ArrayList();
    private Tripulacion tripulacion;

    public Vuelo() {
    }

    public Aeropuerto getOrigen() {
        return this.origen;
    }

    public void setOrigen(Aeropuerto origen) {
        this.origen = origen;
    }

    public Aeropuerto getDestino() {
        return this.destino;
    }

    public void setDestino(Aeropuerto destino) {
        this.destino = destino;
        destino.agregarVuelos(new Vuelo[]{this});
    }

    public LocalDateTime getFecha() {
        return this.fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Double getDuracionEstimadaEnMins() {
        return this.duracionEstimadaEnMins;
    }

    public void setDuracionEstimadaEnMins(Double duracionEstimadaEnMins) {
        this.duracionEstimadaEnMins = duracionEstimadaEnMins;
    }

    public Integer getCantAsientosOfrecidos() {
        return this.cantAsientosOfrecidos;
    }

    public void setCantAsientosOfrecidos(Integer cantAsientosOfrecidos) {
        this.cantAsientosOfrecidos = cantAsientosOfrecidos;
    }

    public Avion getAvion() {
        return this.avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public List<Pasajero> getPasajeros() {
        return this.pasajeros;
    }

    public Tripulacion getTripulacion() {
        return this.tripulacion;
    }

    public void setTripulacion(Tripulacion tripulacion) {
        tripulacion.agregarVuelos(new Vuelo[]{this});
        this.tripulacion = tripulacion;
    }

    public void agregarPasajeros(Pasajero... pasajeros) {
        Collections.addAll(this.pasajeros, pasajeros);
    }

    public LocalDateTime fechaDeLlegadaAproximada() {
        return this.fecha.plusMinutes(this.duracionEstimadaEnMins.longValue());
    }

    public Double capacidadRealOcupadaPorPasajeros() {
        return (double)this.cantPasajeros() * 100.0 / (double)this.avion.getCantAsientos();
    }

    public Integer cantPasajeros() {
        return this.pasajeros.size();
    }

    public boolean tuDestinoEs(Ciudad unaCiudad) {
        return this.destino.estasEn(unaCiudad);
    }
}
