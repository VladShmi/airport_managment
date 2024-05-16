public abstract class Persona {
    private String nombre;
    private String apellido;
    private Integer nroDeDocumento;
    private TipoDeDocumento tipoDeDocumento;

    public Persona() {
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

    public Integer getNroDeDocumento() {
        return this.nroDeDocumento;
    }

    public void setNroDeDocumento(Integer nroDeDocumento) {
        this.nroDeDocumento = nroDeDocumento;
    }

    public TipoDeDocumento getTipoDeDocumento() {
        return this.tipoDeDocumento;
    }

    public void setTipoDeDocumento(TipoDeDocumento tipoDeDocumento) {
        this.tipoDeDocumento = tipoDeDocumento;
    }
}
