/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author Jose Cogollo
 */
public class InformacionDetalladaTrimestre3 implements Serializable{
    
    String sector;
    String nombreEntidad;
    String tipoEntidad;
    String nombreEntidadOrigenCartera;
    String tipoFid;
    String numeroFideico;
    String modalidadCredito;
    String calificacion;
    String tipoMoneda;
    int numeroDeudas;
    double valorDeudas;
    double pade;
    double porcentajeGarantia;
    String tipoGarantia;
    String fechaAvaluo;
    double cuotaEsparada;
    double porcentajeCumplimiento;

    public InformacionDetalladaTrimestre3() {
    }

    public InformacionDetalladaTrimestre3(String sector, String nombreEntidad, String tipoEntidad, String nombreEntidadOrigenCartera, String tipoFid, String numeroFideico, String modalidadCredito, String calificacion, String tipoMoneda, int numeroDeudas, double valorDeudas, double pade, double porcentajeGarantia, String tipoGarantia, String fechaAvaluo, double cuotaEsparada, double porcentajeCumplimiento) {
        this.sector = sector;
        this.nombreEntidad = nombreEntidad;
        this.tipoEntidad = tipoEntidad;
        this.nombreEntidadOrigenCartera = nombreEntidadOrigenCartera;
        this.tipoFid = tipoFid;
        this.numeroFideico = numeroFideico;
        this.modalidadCredito = modalidadCredito;
        this.calificacion = calificacion;
        this.tipoMoneda = tipoMoneda;
        this.numeroDeudas = numeroDeudas;
        this.valorDeudas = valorDeudas;
        this.pade = pade;
        this.porcentajeGarantia = porcentajeGarantia;
        this.tipoGarantia = tipoGarantia;
        this.fechaAvaluo = fechaAvaluo;
        this.cuotaEsparada = cuotaEsparada;
        this.porcentajeCumplimiento = porcentajeCumplimiento;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getNombreEntidad() {
        return nombreEntidad;
    }

    public void setNombreEntidad(String nombreEntidad) {
        this.nombreEntidad = nombreEntidad;
    }

    public String getTipoEntidad() {
        return tipoEntidad;
    }

    public void setTipoEntidad(String tipoEntidad) {
        this.tipoEntidad = tipoEntidad;
    }

    public String getNombreEntidadOrigenCartera() {
        return nombreEntidadOrigenCartera;
    }

    public void setNombreEntidadOrigenCartera(String nombreEntidadOrigenCartera) {
        this.nombreEntidadOrigenCartera = nombreEntidadOrigenCartera;
    }

    public String getTipoFid() {
        return tipoFid;
    }

    public void setTipoFid(String tipoFid) {
        this.tipoFid = tipoFid;
    }

    public String getNumeroFideico() {
        return numeroFideico;
    }

    public void setNumeroFideico(String numeroFideico) {
        this.numeroFideico = numeroFideico;
    }

    public String getModalidadCredito() {
        return modalidadCredito;
    }

    public void setModalidadCredito(String modalidadCredito) {
        this.modalidadCredito = modalidadCredito;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getTipoMoneda() {
        return tipoMoneda;
    }

    public void setTipoMoneda(String tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }

    public int getNumeroDeudas() {
        return numeroDeudas;
    }

    public void setNumeroDeudas(int numeroDeudas) {
        this.numeroDeudas = numeroDeudas;
    }

    public double getValorDeudas() {
        return valorDeudas;
    }

    public void setValorDeudas(double valorDeudas) {
        this.valorDeudas = valorDeudas;
    }

    public double getPade() {
        return pade;
    }

    public void setPade(double pade) {
        this.pade = pade;
    }

    public double getPorcentajeGarantia() {
        return porcentajeGarantia;
    }

    public void setPorcentajeGarantia(double porcentajeGarantia) {
        this.porcentajeGarantia = porcentajeGarantia;
    }

    public String getTipoGarantia() {
        return tipoGarantia;
    }

    public void setTipoGarantia(String tipoGarantia) {
        this.tipoGarantia = tipoGarantia;
    }

    public String getFechaAvaluo() {
        return fechaAvaluo;
    }

    public void setFechaAvaluo(String fechaAvaluo) {
        this.fechaAvaluo = fechaAvaluo;
    }

    public double getCuotaEsparada() {
        return cuotaEsparada;
    }

    public void setCuotaEsparada(double cuotaEsparada) {
        this.cuotaEsparada = cuotaEsparada;
    }

    public double getPorcentajeCumplimiento() {
        return porcentajeCumplimiento;
    }

    public void setPorcentajeCumplimiento(double porcentajeCumplimiento) {
        this.porcentajeCumplimiento = porcentajeCumplimiento;
    }

   
    
    
}
