import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Viaje {
    private List<Vuelo> vuelos = new ArrayList();
    private List<Escala> escalas = new ArrayList();
    private LocalDateTime fechaSalida;
    private Aerolinea aerolinea;

    public Viaje() {
    }

    public LocalDateTime getFechaSalida() {
        return this.fechaSalida;
    }

    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Aerolinea getAerolinea() {
        return this.aerolinea;
    }

    public void setAerolinea(Aerolinea aerolinea) {
        this.aerolinea = aerolinea;
    }

    public List<Vuelo> getVuelos() {
        return this.vuelos;
    }

    public List<Escala> getEscalas() {
        return this.escalas;
    }

    public void agregarVuelos(Vuelo... vuelos) {
        Collections.addAll(this.vuelos, vuelos);
    }

    public void agregarEscalas(Escala... escalas) {
        Collections.addAll(this.escalas, escalas);
    }

    public Integer cantPasajerosTotales() {
        return this.vuelos.stream().mapToInt(Vuelo::cantPasajeros).sum();
    }

    private Double duracionTotalDeVuelosEnMins() {
        return this.vuelos.stream().mapToDouble((v) -> {
            return v.getDuracionEstimadaEnMins();
        }).sum();
    }

    private Double duracionTotalDeEscalasEnMins() {
        return this.escalas.stream().mapToDouble(Escala::getDuracionEnMins).sum();
    }

    public Double duracionTotalEnMins() {
        return this.duracionTotalDeEscalasEnMins() + this.duracionTotalDeVuelosEnMins();
    }
}
