public class Avion {
    private String nombre;
    private Integer cantAsientos;

    public Avion(Integer cantAsientos) {
        this.cantAsientos = cantAsientos;
    }

    public void setCantAsientos(Integer cantAsientos) {
        this.cantAsientos = cantAsientos;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantAsientos() {
        return this.cantAsientos;
    }

    public void setCantAsientos(int cantAsientos) {
        this.cantAsientos = cantAsientos;
    }
}