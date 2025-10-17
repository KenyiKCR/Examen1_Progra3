/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transitsoft.model;

/**
 *
 * @author USUARIO
 */
public class CamaraDTO {

    private Integer id;
    private String modelo;
    private String codigoSerie;
    private Integer latitud;
    private Integer longitud;

    public CamaraDTO(Integer id, String modelo, String codigoSerie, Integer latitud, Integer longitud) {
        this.id = id;
        this.modelo = modelo;
        this.codigoSerie = codigoSerie;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public CamaraDTO() {
        this.id = null;
        this.modelo = null;
        this.codigoSerie = null;
        this.latitud = null;
        this.longitud = null;
    }

    public CamaraDTO(CamaraDTO camara) {
        this.id = camara.id;
        this.modelo = camara.modelo;
        this.codigoSerie = camara.codigoSerie;
        this.latitud = camara.latitud;
        this.longitud = camara.longitud;
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

    public Integer getLatitud() {
        return latitud;
    }

    public void setLatitud(Integer latitud) {
        this.latitud = latitud;
    }

    public Integer getLongitud() {
        return longitud;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }

}
