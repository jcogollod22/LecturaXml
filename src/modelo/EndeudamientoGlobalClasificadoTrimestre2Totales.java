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
public class EndeudamientoGlobalClasificadoTrimestre2Totales implements Serializable{
    
    String fechaTrimestre;
    int totalCreditos;
    double saldoTotal;
    int totalCreditosComerciales;
    double totalDeudasComerciales;
    int totalCreditosHipotecario;
    double totalDeudasHipotecario;
    int totalCreditosConsumo;
    double totalDeudasConsumo;
    int totalCreditosMicrocredito;
    double totalDeudasMicrocreditos;
    String sector;

    public EndeudamientoGlobalClasificadoTrimestre2Totales() {
    }

    public EndeudamientoGlobalClasificadoTrimestre2Totales(String fechaTrimestre, int totalCreditos, double saldoTotal, int totalCreditosComerciales, double totalDeudasComerciales, int totalCreditosHipotecario, double totalDeudasHipotecario, int totalCreditosConsumo, double totalDeudasConsumo, int totalCreditosMicrocredito, double totalDeudasMicrocreditos, String sector) {
        this.fechaTrimestre = fechaTrimestre;
        this.totalCreditos = totalCreditos;
        this.saldoTotal = saldoTotal;
        this.totalCreditosComerciales = totalCreditosComerciales;
        this.totalDeudasComerciales = totalDeudasComerciales;
        this.totalCreditosHipotecario = totalCreditosHipotecario;
        this.totalDeudasHipotecario = totalDeudasHipotecario;
        this.totalCreditosConsumo = totalCreditosConsumo;
        this.totalDeudasConsumo = totalDeudasConsumo;
        this.totalCreditosMicrocredito = totalCreditosMicrocredito;
        this.totalDeudasMicrocreditos = totalDeudasMicrocreditos;
        this.sector = sector;
    }

    public String getFechaTrimestre() {
        return fechaTrimestre;
    }

    public void setFechaTrimestre(String fechaTrimestre) {
        this.fechaTrimestre = fechaTrimestre;
    }

    public int getTotalCreditos() {
        return totalCreditos;
    }

    public void setTotalCreditos(int totalCreditos) {
        this.totalCreditos = totalCreditos;
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public int getTotalCreditosComerciales() {
        return totalCreditosComerciales;
    }

    public void setTotalCreditosComerciales(int totalCreditosComerciales) {
        this.totalCreditosComerciales = totalCreditosComerciales;
    }

    public double getTotalDeudasComerciales() {
        return totalDeudasComerciales;
    }

    public void setTotalDeudasComerciales(double totalDeudasComerciales) {
        this.totalDeudasComerciales = totalDeudasComerciales;
    }

    public int getTotalCreditosHipotecario() {
        return totalCreditosHipotecario;
    }

    public void setTotalCreditosHipotecario(int totalCreditosHipotecario) {
        this.totalCreditosHipotecario = totalCreditosHipotecario;
    }

    public double getTotalDeudasHipotecario() {
        return totalDeudasHipotecario;
    }

    public void setTotalDeudasHipotecario(double totalDeudasHipotecario) {
        this.totalDeudasHipotecario = totalDeudasHipotecario;
    }

    public int getTotalCreditosConsumo() {
        return totalCreditosConsumo;
    }

    public void setTotalCreditosConsumo(int totalCreditosConsumo) {
        this.totalCreditosConsumo = totalCreditosConsumo;
    }

    public double getTotalDeudasConsumo() {
        return totalDeudasConsumo;
    }

    public void setTotalDeudasConsumo(double totalDeudasConsumo) {
        this.totalDeudasConsumo = totalDeudasConsumo;
    }

    public int getTotalCreditosMicrocredito() {
        return totalCreditosMicrocredito;
    }

    public void setTotalCreditosMicrocredito(int totalCreditosMicrocredito) {
        this.totalCreditosMicrocredito = totalCreditosMicrocredito;
    }

    public double getTotalDeudasMicrocreditos() {
        return totalDeudasMicrocreditos;
    }

    public void setTotalDeudasMicrocreditos(double totalDeudasMicrocreditos) {
        this.totalDeudasMicrocreditos = totalDeudasMicrocreditos;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
    
    
}
