import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Ciudad {
    private String nombre;
    private Pais pais;
    private List<Aeropuerto> aeropuertos = new ArrayList();

    public Ciudad(String nombre, Pais pais) {
        this.pais = pais;
        this.nombre = nombre;
        pais.agregarCiudades(new Ciudad[]{this});
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return this.pais;
    }

    public void agregarAeropuertos(Aeropuerto... aeropuertos) {
        Collections.addAll(this.aeropuertos, aeropuertos);
    }

    public Integer cantDeAeropuertos() {
        return this.aeropuertos.size();
    }

    public Integer cantPasajerosQueLlegaronElDia(LocalDate dia) {
        List<Vuelo> vuelosQueLlegaronEseDia = (List)this.aeropuertos.stream().flatMap((a) -> {
            return a.vuelosQueLlegaronElDia(dia).stream();
        }).collect(Collectors.toList());
        return vuelosQueLlegaronEseDia.stream().mapToInt((v) -> {
            return v.cantPasajeros();
        }).sum();
    }
}