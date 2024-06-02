import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * La clase Tripulacion representa a un grupo de empleados que trabajan juntos en varios vuelos.
 */
public class Tripulacion {
    private String nombre; // El nombre de la tripulación.
    private List<Empleado> empleados = new ArrayList(); // La lista de empleados en la tripulación.
    private List<Vuelo> vuelos = new ArrayList(); // La lista de vuelos en los que la tripulación ha trabajado.

    /**
     * Constructor por defecto de la clase Tripulacion.
     */
    public Tripulacion() {
    }

    /**
     * Establece el nombre de la tripulación.
     * @param nombre El nuevo nombre de la tripulación.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el nombre de la tripulación.
     * @return El nombre de la tripulación.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Obtiene la lista de empleados en la tripulación.
     * @return La lista de empleados en la tripulación.
     */
    public List<Empleado> getEmpleados() {
        return this.empleados;
    }

    /**
     * Obtiene la lista de vuelos en los que la tripulación ha trabajado.
     * @return La lista de vuelos en los que la tripulación ha trabajado.
     */
    public List<Vuelo> getVuelos() {
        return this.vuelos;
    }

    /**
     * Agrega empleados a la tripulación.
     * @param empleados Los empleados a agregar.
     */
    public void agregarEmpleados(Empleado... empleados) {
        Collections.addAll(this.empleados, empleados);
    }

    /**
     * Agrega vuelos a la lista de vuelos en los que la tripulación ha trabajado.
     * @param vuelos Los vuelos a agregar.
     */
    public void agregarVuelos(Vuelo... vuelos) {
        Collections.addAll(this.vuelos, vuelos);
    }

    /**
     * Obtiene la lista de vuelos en los que la tripulación ha trabajado en un rango de fechas.
     * @param fechaInicial La fecha inicial del rango.
     * @param fechaFinal La fecha final del rango.
     * @return La lista de vuelos en el rango de fechas especificado.
     */
    private List<Vuelo> vuelosEntre(LocalDate fechaInicial, LocalDate fechaFinal) {
        return this.vuelos.stream().filter((v) -> {
            return (v.getFecha().toLocalDate().isAfter(fechaInicial) || v.getFecha().toLocalDate().isEqual(fechaInicial)) && (v.getFecha().toLocalDate().isBefore(fechaFinal) || v.getFecha().toLocalDate().isEqual(fechaFinal));
        }).collect(Collectors.toList());
    }

    /**
     * Obtiene la cantidad de vuelos en los que la tripulación ha trabajado en un rango de meses.
     * @param fechaInicial La fecha inicial del rango de meses.
     * @param fechaFinal La fecha final del rango de meses.
     * @return La cantidad de vuelos en el rango de meses especificado.
     */
    public Integer cantVuelosEnMesesEntre(LocalDate fechaInicial, LocalDate fechaFinal) {
        return this.vuelosEntre(fechaInicial, fechaFinal).size();
    }
}