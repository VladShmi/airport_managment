/**
 * La clase abstracta Persona representa a una persona con información básica como nombre, apellido, número de documento y tipo de documento.
 */
public abstract class Persona {
    private String nombre; // El nombre de la persona.
    private String apellido; // El apellido de la persona.
    private Integer nroDeDocumento; // El número de documento de la persona.
    private TipoDeDocumento tipoDeDocumento; // El tipo de documento de la persona.

    /**
     * Constructor por defecto de la clase Persona.
     */
    public Persona() {
    }

    /**
     * Obtiene el nombre de la persona.
     * @return El nombre de la persona.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Establece el nombre de la persona.
     * @param nombre El nuevo nombre de la persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido de la persona.
     * @return El apellido de la persona.
     */
    public String getApellido() {
        return this.apellido;
    }

    /**
     * Establece el apellido de la persona.
     * @param apellido El nuevo apellido de la persona.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtiene el número de documento de la persona.
     * @return El número de documento de la persona.
     */
    public Integer getNroDeDocumento() {
        return this.nroDeDocumento;
    }

    /**
     * Establece el número de documento de la persona.
     * @param nroDeDocumento El nuevo número de documento de la persona.
     */
    public void setNroDeDocumento(Integer nroDeDocumento) {
        this.nroDeDocumento = nroDeDocumento;
    }

    /**
     * Obtiene el tipo de documento de la persona.
     * @return El tipo de documento de la persona.
     */
    public TipoDeDocumento getTipoDeDocumento() {
        return this.tipoDeDocumento;
    }

    /**
     * Establece el tipo de documento de la persona.
     * @param tipoDeDocumento El nuevo tipo de documento de la persona.
     */
    public void setTipoDeDocumento(TipoDeDocumento tipoDeDocumento) {
        this.tipoDeDocumento = tipoDeDocumento;
    }
}