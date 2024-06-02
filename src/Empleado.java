/**
 * La clase Empleado representa a un individuo empleado en una aerolínea, extendiendo la clase Persona.
 */
public class Empleado extends Persona {
    private Cargo cargo; // El cargo del empleado en la aerolínea.
    private Aerolinea empleador; // La aerolínea que emplea al empleado.

    /**
     * Constructor por defecto de la clase Empleado.
     */
    public Empleado() {
    }

    /**
     * Obtiene el cargo del empleado.
     * @return El cargo del empleado.
     */
    public Cargo getCargo() {
        return this.cargo;
    }

    /**
     * Establece el cargo del empleado.
     * @param cargo El nuevo cargo del empleado.
     */
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    /**
     * Obtiene el empleador del empleado.
     * @return La aerolínea que emplea al empleado.
     */
    public Aerolinea getEmpleador() {
        return this.empleador;
    }

    /**
     * Establece el empleador del empleado.
     * @param empleador La nueva aerolínea empleadora del empleado.
     */
    public void setEmpleador(Aerolinea empleador) {
        this.empleador = empleador;
    }
}