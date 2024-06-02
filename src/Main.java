import java.util.Scanner;

/**
 * La clase principal para ejecutar el sistema de gestión de aerolíneas.
 */
public class Main {
    /**
     * El método principal para ejecutar la aplicación.
     *
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aerolinea aerolinea = new Aerolinea();

        int option;
        do {
            System.out.println("Selecciona una opcion:");
            System.out.println("1. Agregar un vuelo");
            System.out.println("2. Agregar un pasajero a un vuelo");
            System.out.println("3. Mostrar todos los vuelos");
            System.out.println("4. Mostrar todos los pasajeros de un vuelo");
            System.out.println("0. Terminar");
            option = scanner.nextInt();
            switch (option) {
                case 0:
                    System.out.println("Terminando...");
                    break;
                case 1:
                    System.out.println("Agregar un vuelo");
                    System.out.println("Ingrese el origen del vuelo:");
                    String origen = scanner.next();
                    System.out.println("Ingrese el destino del vuelo:");
                    String destino = scanner.next();
                    Vuelo vuelo = new Vuelo();
                    vuelo.setOrigen(origen);
                    vuelo.setDestino(destino);
                    aerolinea.agregarVuelo(vuelo);
                    System.out.println("Vuelo agregado exitosamente");
                    break;
                case 2:
                    System.out.println("Agregar un pasajero a un vuelo");
                    System.out.println("Ingrese el nombre del pasajero:");
                    String nombrePasajero = scanner.next();
                    System.out.println("Ingrese el apellido del pasajero:");
                    scanner.nextLine();
                    String apellidoPasajero = scanner.nextLine();
                    Pasajero pasajero = new Pasajero(nombrePasajero, apellidoPasajero);
                    System.out.println("Ingrese el origen del vuelo:");
                    String origenVuelo = scanner.next();
                    System.out.println("Ingrese el destino del vuelo:");
                    String destinoVuelo = scanner.next();
                    aerolinea.agregarPasajeroAVuelo(origenVuelo, destinoVuelo, pasajero);
                    System.out.println("Pasajero agregado exitosamente");
                    break;
                case 3:
                    System.out.println("Mostrar todos los vuelos");
                    aerolinea.mostrarVuelos();
                    break;
                case 4:
                    System.out.println("Mostrar todos los pasajeros de un vuelo");
                    System.out.println("Ingrese el origen del vuelo:");
                    String origenVueloPasajeros = scanner.next();
                    System.out.println("Ingrese el destino del vuelo:");
                    String destinoVueloPasajeros = scanner.next();
                    aerolinea.mostrarPasajerosDeVuelo(origenVueloPasajeros, destinoVueloPasajeros);
                    break;
                default:
                    System.out.println("Opcion no valida, intentalo de nuevo");
            }
        } while (option != 0);

        scanner.close();
    }
}
