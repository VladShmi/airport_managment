public class Empleado extends Persona {
    private Cargo cargo;
    private Aerolinea empleador;

    public Empleado() {
    }

    public Cargo getCargo() {
        return this.cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Aerolinea getEmpleador() {
        return this.empleador;
    }

    public void setEmpleador(Aerolinea empleador) {
        this.empleador = empleador;
    }
}
