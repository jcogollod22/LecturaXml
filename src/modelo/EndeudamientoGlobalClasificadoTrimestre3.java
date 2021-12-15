/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Jose Cogollo
 */
public class EndeudamientoGlobalClasificadoTrimestre3 implements Serializable{
    
     
    String entidadInformante;
    String calificacion;
    int cantidadTotalcreditos;
    double totalDeudas;
    int numeroDeudasComercial;
    double valorDeudaComercial;
    int numeroDeudasVivienda;
    double valorDeudaVivienda;
    int numeroDeudasCosumos;
    double valorDeudaConsumo;
    int numeroDeudasMicrocreditos;
    double valordeudaMicrocredito;
    String tipoGarantia;
    String fechaAvaluo;
    double valorAvaluo;
    String moneda;
    String fuente;
    double padeSector;
    String fechaTrimestre;

    public EndeudamientoGlobalClasificadoTrimestre3() {
    }

    public EndeudamientoGlobalClasificadoTrimestre3(String entidadInformante, String calificacion, int cantidadTotalcreditos, double totalDeudas, int numeroDeudasComercial, double valorDeudaComercial, int numeroDeudasVivienda, double valorDeudaVivienda, int numeroDeudasCosumos, double valorDeudaConsumo, int numeroDeudasMicrocreditos, double valordeudaMicrocredito, String tipoGarantia, String fechaAvaluo, double valorAvaluo, String moneda, String fuente, double padeSector, String fechaTrimestre) {
        this.entidadInformante = entidadInformante;
        this.calificacion = calificacion;
        this.cantidadTotalcreditos = cantidadTotalcreditos;
        this.totalDeudas = totalDeudas;
        this.numeroDeudasComercial = numeroDeudasComercial;
        this.valorDeudaComercial = valorDeudaComercial;
        this.numeroDeudasVivienda = numeroDeudasVivienda;
        this.valorDeudaVivienda = valorDeudaVivienda;
        this.numeroDeudasCosumos = numeroDeudasCosumos;
        this.valorDeudaConsumo = valorDeudaConsumo;
        this.numeroDeudasMicrocreditos = numeroDeudasMicrocreditos;
        this.valordeudaMicrocredito = valordeudaMicrocredito;
        this.tipoGarantia = tipoGarantia;
        this.fechaAvaluo = fechaAvaluo;
        this.valorAvaluo = valorAvaluo;
        this.moneda = moneda;
        this.fuente = fuente;
        this.padeSector = padeSector;
        this.fechaTrimestre = fechaTrimestre;
    }
    
    

    public String getEntidadInformante() {
        return entidadInformante;
    }

    public void setEntidadInformante(String entidadInformante) {
        this.entidadInformante = entidadInformante;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public int getCantidadTotalcreditos() {
        return cantidadTotalcreditos;
    }

    public void setCantidadTotalcreditos(int cantidadTotalcreditos) {
        this.cantidadTotalcreditos = cantidadTotalcreditos;
    }

    public double getTotalDeudas() {
        return totalDeudas;
    }

    public void setTotalDeudas(double totalDeudas) {
        this.totalDeudas = totalDeudas;
    }

    public int getNumeroDeudasComercial() {
        return numeroDeudasComercial;
    }

    public void setNumeroDeudasComercial(int numeroDeudasComercial) {
        this.numeroDeudasComercial = numeroDeudasComercial;
    }

    public double getValorDeudaComercial() {
        return valorDeudaComercial;
    }

    public void setValorDeudaComercial(double valorDeudaComercial) {
        this.valorDeudaComercial = valorDeudaComercial;
    }

    public int getNumeroDeudasVivienda() {
        return numeroDeudasVivienda;
    }

    public void setNumeroDeudasVivienda(int numeroDeudasVivienda) {
        this.numeroDeudasVivienda = numeroDeudasVivienda;
    }

    public double getValorDeudaVivienda() {
        return valorDeudaVivienda;
    }

    public void setValorDeudaVivienda(double valorDeudaVivienda) {
        this.valorDeudaVivienda = valorDeudaVivienda;
    }

    public int getNumeroDeudasCosumos() {
        return numeroDeudasCosumos;
    }

    public void setNumeroDeudasCosumos(int numeroDeudasCosumos) {
        this.numeroDeudasCosumos = numeroDeudasCosumos;
    }

    public double getValorDeudaConsumo() {
        return valorDeudaConsumo;
    }

    public void setValorDeudaConsumo(double valorDeudaConsumo) {
        this.valorDeudaConsumo = valorDeudaConsumo;
    }

    public int getNumeroDeudasMicrocreditos() {
        return numeroDeudasMicrocreditos;
    }

    public void setNumeroDeudasMicrocreditos(int numeroDeudasMicrocreditos) {
        this.numeroDeudasMicrocreditos = numeroDeudasMicrocreditos;
    }

    public double getValordeudaMicrocredito() {
        return valordeudaMicrocredito;
    }

    public void setValordeudaMicrocredito(double valordeudaMicrocredito) {
        this.valordeudaMicrocredito = valordeudaMicrocredito;
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

    public double getValorAvaluo() {
        return valorAvaluo;
    }

    public void setValorAvaluo(double valorAvaluo) {
        this.valorAvaluo = valorAvaluo;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public double getPadeSector() {
        return padeSector;
    }

    public void setPadeSector(double padeSector) {
        this.padeSector = padeSector;
    }

    public String getFechaTrimestre() {
        return fechaTrimestre;
    }

    public void setFechaTrimestre(String fechaTrimestre) {
        this.fechaTrimestre = fechaTrimestre;
    }
   

   

      
}
