/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
//modelo.Informedetallado

import java.io.Serializable;

/**
 *
 * @author Jose Cogollo
 */
public class Informedetallado implements Serializable{
    
        private String fechaCuenta;
        private String tipoContrato;
        private String numeroCuenta;
        private String estadoCuenta;
        private String entidadBancaria;
        private String ciudadCuenta;
        private String sucursalCuenta;
        private String fechaApertura;
        private String chequeDevUltMes;
        private String valorsobregiro;
        private String diasautor;
        private String fechapermanencia;
      

    public Informedetallado() {
    }

    public Informedetallado(String fechaCuenta, String tipoContrato, String numeroCuenta, String estadoCuenta, String entidadBancaria, String ciudadCuenta, String sucursalCuenta, String fechaApertura, String chequeDevUltMes, String valorsobregiro, String diasautor, String fechapermanencia) {
        this.fechaCuenta = fechaCuenta;
        this.tipoContrato = tipoContrato;
        this.numeroCuenta = numeroCuenta;
        this.estadoCuenta = estadoCuenta;
        this.entidadBancaria = entidadBancaria;
        this.ciudadCuenta = ciudadCuenta;
        this.sucursalCuenta = sucursalCuenta;
        this.fechaApertura = fechaApertura;
        this.chequeDevUltMes = chequeDevUltMes;
        this.valorsobregiro = valorsobregiro;
        this.diasautor = diasautor;
        this.fechapermanencia = fechapermanencia;
    }

    public String getFechaCuenta() {
        return fechaCuenta;
    }

    public void setFechaCuenta(String fechaCuenta) {
        this.fechaCuenta = fechaCuenta;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getEstadoCuenta() {
        return estadoCuenta;
    }

    public void setEstadoCuenta(String estadoCuenta) {
        this.estadoCuenta = estadoCuenta;
    }

    public String getEntidadBancaria() {
        return entidadBancaria;
    }

    public void setEntidadBancaria(String entidadBancaria) {
        this.entidadBancaria = entidadBancaria;
    }

    public String getCiudadCuenta() {
        return ciudadCuenta;
    }

    public void setCiudadCuenta(String ciudadCuenta) {
        this.ciudadCuenta = ciudadCuenta;
    }

    public String getSucursalCuenta() {
        return sucursalCuenta;
    }

    public void setSucursalCuenta(String sucursalCuenta) {
        this.sucursalCuenta = sucursalCuenta;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public String getChequeDevUltMes() {
        return chequeDevUltMes;
    }

    public void setChequeDevUltMes(String chequeDevUltMes) {
        this.chequeDevUltMes = chequeDevUltMes;
    }

    public String getValorsobregiro() {
        return valorsobregiro;
    }

    public void setValorsobregiro(String valorsobregiro) {
        this.valorsobregiro = valorsobregiro;
    }

    public String getDiasautor() {
        return diasautor;
    }

    public void setDiasautor(String diasautor) {
        this.diasautor = diasautor;
    }

    public String getFechapermanencia() {
        return fechapermanencia;
    }

    public void setFechapermanencia(String fechapermanencia) {
        this.fechapermanencia = fechapermanencia;
    }

         
}
