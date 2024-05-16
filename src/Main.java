import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aerolinea aerolinea = new Aerolinea();

        int option;
        do {
            System.out.println("Selecciona una opcion:");
            System.out.println("1. Insertar un avion");
            System.out.println("2. Insertar un viaje");
            System.out.println("3. Obten el total de pasajeros para un mes y anhoo especifico");
            System.out.println("0. Terminar");
            option = scanner.nextInt();
            switch (option) {
                case 0:
                    System.out.println("Terminando...");
                    break;
                case 1:
                    System.out.println("Introduce la cantidad de asientos del avion:");
                    Integer cantAsientos = scanner.nextInt();
                    Avion avion = new Avion(cantAsientos);
                    aerolinea.agregarAviones(new Avion[]{avion});
                    System.out.println("Avion agregado exitosamente.");
                    break;
                case 2:
                    System.out.println("Introduce la fecha de salida del viaje (formato: YYYY-MM-DD):");
                    String fechaSalida = scanner.next();
                    Viaje viaje = new Viaje();
                    viaje.setFechaSalida(LocalDate.parse(fechaSalida).atStartOfDay());
                    aerolinea.agregarViaje(new Viaje[]{viaje});
                    System.out.println("Viaje agregado exitosamente.");
                    break;
                case 3:
                    System.out.println("Introduce el mes:");
                    int mes = scanner.nextInt();
                    System.out.println("Introduce el anhoo:");
                    int anhoo = scanner.nextInt();
                    int totalPasajeros = aerolinea.cantPasajerosTotales(mes, anhoo);
                    System.out.println("Total de pasajeros para el mes " + mes + " del anhoo " + anhoo + ": " + totalPasajeros);
                    break;
                default:
                    System.out.println("Opcion no valida, intentalo de nuevo");
            }
        } while(option != 0);

        scanner.close();
    }
}
