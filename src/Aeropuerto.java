import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Aeropuerto {
    private String nombre;
    private String codigoInternacional;
    private Ciudad ciudad;
    private List<Vuelo> vuelos;

    public Aeropuerto(String nombre, String codigoInternacional, Ciudad ciudad) {
        this.ciudad = ciudad;
        this.nombre = nombre;
        this.codigoInternacional = codigoInternacional;
        this.vuelos = new ArrayList();
        ciudad.agregarAeropuertos(new Aeropuerto[]{this});
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public Ciudad getCiudad() {
        return this.ciudad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getCodigoInternacional() {
        return this.codigoInternacional;
    }

    public void agregarVuelos(Vuelo... vuelos) {
        Collections.addAll(this.vuelos, vuelos);
    }

    public Integer cantVuelosQuePartieronElDia(LocalDate dia) {
        return (int)this.vuelos.stream().filter((v) -> {
            return v.getFecha().toLocalDate().isEqual(dia);
        }).count();
    }

    public List<Vuelo> vuelosQueLlegaronElDia(LocalDate dia) {
        return (List)this.vuelos.stream().filter((v) -> {
            return v.fechaDeLlegadaAproximada().toLocalDate().isEqual(dia);
        }).collect(Collectors.toList());
    }

    public Integer cantVuelosQueLlegaronElDia(LocalDate dia) {
        return this.vuelosQueLlegaronElDia(dia).size();
    }

    public boolean estasEn(Ciudad unaCiudad) {
        return this.ciudad.equals(unaCiudad);
    }
}