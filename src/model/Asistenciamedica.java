package model;
// Generated 23-ene-2019 19:23:42 by Hibernate Tools 4.3.1

import java.math.BigDecimal;
import java.util.Date;
import model.enums.TipoAsistencia;

/**
 * Asistenciamedica generated by hbm2java
 */
public class Asistenciamedica implements java.io.Serializable {

    private Integer idAsistenciaMedica;
    private Seguro seguro;
    private String breveDescripcion;
    private String lugar;
    private String explicacion;
    private TipoAsistencia tipoAsistencia;
    private Date fecha;
    private Date hora;
    private BigDecimal importe;
    private Integer idx;

    public Asistenciamedica() {
    }

    public Asistenciamedica(Seguro seguro, String breveDescripcion, String lugar, String explicacion, Date fecha, Date hora, BigDecimal importe, Integer idx) {
        this.seguro = seguro;
        this.breveDescripcion = breveDescripcion;
        this.lugar = lugar;
        this.explicacion = explicacion;
        this.fecha = fecha;
        this.hora = hora;
        this.importe = importe;
        this.idx = idx;
    }

    public TipoAsistencia getTipoAsistencia() {
        return tipoAsistencia;
    }

    public void setTipoAsistencia(TipoAsistencia tipoAsistencia) {
        this.tipoAsistencia = tipoAsistencia;
    }

    public Integer getIdAsistenciaMedica() {
        return this.idAsistenciaMedica;
    }

    public TipoAsistencia getAsis() {
        return tipoAsistencia;
    }

    public void setAsis(TipoAsistencia asis) {
        this.tipoAsistencia = asis;
    }

    public void setIdAsistenciaMedica(Integer idAsistenciaMedica) {
        this.idAsistenciaMedica = idAsistenciaMedica;
    }

    public Seguro getSeguro() {
        return this.seguro;
    }

    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }

    public String getBreveDescripcion() {
        return this.breveDescripcion;
    }

    public void setBreveDescripcion(String breveDescripcion) {
        this.breveDescripcion = breveDescripcion;
    }

    public String getLugar() {
        return this.lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getExplicacion() {
        return this.explicacion;
    }

    public void setExplicacion(String explicacion) {
        this.explicacion = explicacion;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return this.hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public BigDecimal getImporte() {
        return this.importe;
    }

    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }

    public Integer getIdx() {
        return this.idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

}
