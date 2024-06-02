/**
 * El enum TipoDeDocumento define los diferentes tipos de documentos de identidad.
 */
public enum TipoDeDocumento {
    DNI, // Documento Nacional de Identidad.
    LIBRETA_CIVICA, // Libreta Cívica.
    LIBRETA_ENROLAMIENTO, // Libreta de Enrolamiento.
    CEDULA; // Cédula de Identidad.

    /**
     * Constructor privado del enum TipoDeDocumento.
     */
    private TipoDeDocumento() {
    }
}