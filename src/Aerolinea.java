import java.util.ArrayList;
import java.util.List;

public class Aerolinea {
    private List<Vuelo> vuelos;

    public Aerolinea() {
        this.vuelos = new ArrayList<>();
    }

    public void agregarVuelo(Vuelo vuelo) {
        this.vuelos.add(vuelo);
    }

    public void agregarPasajeroAVuelo(String origen, String destino, Pasajero pasajero) {
        for (Vuelo vuelo : vuelos) {
            if (vuelo.getOrigen().equals(origen) && vuelo.getDestino().equals(destino)) {
                vuelo.getPasajeros().add(pasajero);
                return;
            }
        }
        System.out.println("No se encontró el vuelo con el origen " + origen + " y destino " + destino);
    }

    public void mostrarVuelos() {
        for (Vuelo vuelo : this.vuelos) {
            System.out.println("Origen: " + vuelo.getOrigen() + ", Destino: " + vuelo.getDestino());
        }
    }

    public void mostrarPasajerosDeVuelo(String origen, String destino) {
        for (Vuelo vuelo : vuelos) {
            if (vuelo.getOrigen().equals(origen) && vuelo.getDestino().equals(destino)) {
                List<Pasajero> pasajeros = vuelo.getPasajeros();
                for (Pasajero pasajero : pasajeros) {
                    System.out.println(pasajero.getNombre() + " " + pasajero.getApellido());
                }
                return;
            }
        }
        System.out.println("No se encontró el vuelo con el origen " + origen + " y destino " + destino);
    }
}