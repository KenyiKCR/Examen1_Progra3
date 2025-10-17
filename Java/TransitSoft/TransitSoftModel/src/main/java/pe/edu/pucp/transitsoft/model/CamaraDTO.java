package pe.edu.pucp.transitsoft.model;

public class CamaraDTO {
    private Integer id;
    private String modelo;
    private String codigoSerie;
    private Long latitud;
    private Long longitud;

    public CamaraDTO() {
        this.id = null;
        this.modelo = null;
        this.codigoSerie = null;
        this.latitud = null;
        this.longitud = null;
    }
    
    public CamaraDTO(Integer id, String modelo, String codigoSerie, Long latitud, Long longitud) {
        this.id = id;
        this.modelo = modelo;
        this.codigoSerie = codigoSerie;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCodigoSerie() {
        return codigoSerie;
    }

    public void setCodigoSerie(String codigoSerie) {
        this.codigoSerie = codigoSerie;
    }

    public Long getLatitud() {
        return latitud;
    }

    public void setLatitud(Long latitud) {
        this.latitud = latitud;
    }

    public Long getLongitud() {
        return longitud;
    }

    public void setLongitud(Long longitud) {
        this.longitud = longitud;
    }
}