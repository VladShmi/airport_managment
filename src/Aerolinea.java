import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Aerolinea {
    private String nombre;
    private List<Avion> aviones = new ArrayList();
    private List<Viaje> viajes = new ArrayList();

    public Aerolinea() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public List<Avion> getAviones() {
        return this.aviones;
    }

    public List<Viaje> getViajes() {
        return this.viajes;
    }

    public void agregarViaje(Viaje... viajes) {
        Viaje[] var2 = viajes;
        int var3 = viajes.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            Viaje viaje = var2[var4];
            viaje.setAerolinea(this);
        }

        Collections.addAll(this.viajes, viajes);
    }

    public void agregarAviones(Avion... aviones) {
        Collections.addAll(this.aviones, aviones);
    }

    private List<Viaje> viajesDelAnioMes(Integer anio, Integer mes) {
        return (List)this.viajes.stream().filter((v) -> {
            return v.getFechaSalida().getYear() == anio && v.getFechaSalida().getMonthValue() == mes;
        }).collect(Collectors.toList());
    }

    public Integer cantPasajerosTotales(Integer mes, Integer anio) {
        return this.viajesDelAnioMes(anio, mes).stream().mapToInt(Viaje::cantPasajerosTotales).sum();
    }
}