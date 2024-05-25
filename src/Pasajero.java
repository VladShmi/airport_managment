import java.util.Collections;
import java.util.List;

public class Pasajero extends Persona {
    private String nombre;
    private String apellido;
    private List<Vuelo> vuelos;
    private Integer nroDePasaporte;
    private Pais nacionalidad;

    public Pasajero(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Integer getNroDePasaporte() {
        return this.nroDePasaporte;
    }

    public void setNroDePasaporte(Integer nroDePasaporte) {
        this.nroDePasaporte = nroDePasaporte;
    }

    public Pais getNacionalidad() {
        return this.nacionalidad;
    }

    public void setNacionalidad(Pais nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public List<Vuelo> getVuelos() {
        return this.vuelos;
    }

    public void agregarVuelos(Vuelo... vuelos) {
        Collections.addAll(this.vuelos, vuelos);
    }

    public Integer cantVuelosTotales() {
        return this.vuelos.size();
    }

    public Integer cantVecesQueVisitaste(Ciudad unaCiudad) {
        return (int) this.vuelos.stream().filter((v) -> {
            return v.tuDestinoEs(unaCiudad);
        }).count();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
