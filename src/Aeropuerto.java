import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Aeropuerto {
    private String nombre;
    private String codigoInternacional;
    private Ciudad ciudad;
    private List<Vuelo> vuelos;
    private LocalDateTime fechaDeLlegadaAproximada;

    public Aeropuerto(String nombre, String codigoInternacional, Ciudad ciudad) {
        this.ciudad = ciudad;
        this.nombre = nombre;
        this.codigoInternacional = codigoInternacional;
        this.vuelos = new ArrayList();
        ciudad.agregarAeropuertos(new Aeropuerto[]{this});
    }

    public List<Vuelo> vuelosQueLlegaronElDia(LocalDate dia) {
        return (List)this.vuelos.stream().filter((v) -> {
            return v.fechaDeLlegadaAproximada().toLocalDate().isEqual(dia);
        }).collect(Collectors.toList());
    }
}