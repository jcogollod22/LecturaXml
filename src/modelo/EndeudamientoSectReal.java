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
public class EndeudamientoSectReal implements Serializable {

    String FCorte;
    String TipoContrato;
    double Pade;
    String Moda;
    String NrObligacion;
    String EstObliga;
    String TEntidad;
    String ClaseEntidad;
    String NombreEntidad;
    String Ciudad;
    String Sucursal;
    String EstadoTitular;
    String MrcFranquicia;
    String Clase;
    String TipoGarantia;
    String CobGarantia;
    String FechaInicio;
    String FechaTermina;
    int Pac;
    int Pag;
    int Mor;
    String Per;
    double CupoAproVlrIni;
    double CupoUtiliSal;
    double PagominimoVlrCuota;
    String SitOblCalidadDeudor;
    double VlrMoraSaldo;
    String NatuRes;
    String Rees;
    String NumeroRee;
    int MoraMax;
    String TipoPago;
    String ModoExt;
    String FechaExtin;
    String FechaPerma;
    String Comportamiento;
    String Calificacion;
    String Subtitulo;

    public EndeudamientoSectReal() {
    }

    public EndeudamientoSectReal(String FCorte, String TipoContrato, double Pade, String Moda, String NrObligacion, String EstObliga, String TEntidad, String ClaseEntidad, String NombreEntidad, String Ciudad, String Sucursal, String EstadoTitular, String MrcFranquicia, String Clase, String TipoGarantia, String CobGarantia, String FechaInicio, String FechaTermina, int Pac, int Pag, int Mor, String Per, double CupoAproVlrIni, double CupoUtiliSal, double PagominimoVlrCuota, String SitOblCalidadDeudor, double VlrMoraSaldo, String NatuRes, String Rees, String NumeroRee, int MoraMax, String TipoPago, String ModoExt, String FechaExtin, String FechaPerma, String Comportamiento, String Calificacion, String Subtitulo) {
        this.FCorte = FCorte;
        this.TipoContrato = TipoContrato;
        this.Pade = Pade;
        this.Moda = Moda;
        this.NrObligacion = NrObligacion;
        this.EstObliga = EstObliga;
        this.TEntidad = TEntidad;
        this.ClaseEntidad = ClaseEntidad;
        this.NombreEntidad = NombreEntidad;
        this.Ciudad = Ciudad;
        this.Sucursal = Sucursal;
        this.EstadoTitular = EstadoTitular;
        this.MrcFranquicia = MrcFranquicia;
        this.Clase = Clase;
        this.TipoGarantia = TipoGarantia;
        this.CobGarantia = CobGarantia;
        this.FechaInicio = FechaInicio;
        this.FechaTermina = FechaTermina;
        this.Pac = Pac;
        this.Pag = Pag;
        this.Mor = Mor;
        this.Per = Per;
        this.CupoAproVlrIni = CupoAproVlrIni;
        this.CupoUtiliSal = CupoUtiliSal;
        this.PagominimoVlrCuota = PagominimoVlrCuota;
        this.SitOblCalidadDeudor = SitOblCalidadDeudor;
        this.VlrMoraSaldo = VlrMoraSaldo;
        this.NatuRes = NatuRes;
        this.Rees = Rees;
        this.NumeroRee = NumeroRee;
        this.MoraMax = MoraMax;
        this.TipoPago = TipoPago;
        this.ModoExt = ModoExt;
        this.FechaExtin = FechaExtin;
        this.FechaPerma = FechaPerma;
        this.Comportamiento = Comportamiento;
        this.Calificacion = Calificacion;
        this.Subtitulo = Subtitulo;
    }

    public String getFCorte() {
        return FCorte;
    }

    public void setFCorte(String FCorte) {
        this.FCorte = FCorte;
    }

    public String getTipoContrato() {
        return TipoContrato;
    }

    public void setTipoContrato(String TipoContrato) {
        this.TipoContrato = TipoContrato;
    }

    public double getPade() {
        return Pade;
    }

    public void setPade(double Pade) {
        this.Pade = Pade;
    }

    public String getModa() {
        return Moda;
    }

    public void setModa(String Moda) {
        this.Moda = Moda;
    }

    public String getNrObligacion() {
        return NrObligacion;
    }

    public void setNrObligacion(String NrObligacion) {
        this.NrObligacion = NrObligacion;
    }

    public String getEstObliga() {
        return EstObliga;
    }

    public void setEstObliga(String EstObliga) {
        this.EstObliga = EstObliga;
    }

    public String getTEntidad() {
        return TEntidad;
    }

    public void setTEntidad(String TEntidad) {
        this.TEntidad = TEntidad;
    }

    public String getClaseEntidad() {
        return ClaseEntidad;
    }

    public void setClaseEntidad(String ClaseEntidad) {
        this.ClaseEntidad = ClaseEntidad;
    }

    public String getNombreEntidad() {
        return NombreEntidad;
    }

    public void setNombreEntidad(String NombreEntidad) {
        this.NombreEntidad = NombreEntidad;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getSucursal() {
        return Sucursal;
    }

    public void setSucursal(String Sucursal) {
        this.Sucursal = Sucursal;
    }

    public String getEstadoTitular() {
        return EstadoTitular;
    }

    public void setEstadoTitular(String EstadoTitular) {
        this.EstadoTitular = EstadoTitular;
    }

    public String getMrcFranquicia() {
        return MrcFranquicia;
    }

    public void setMrcFranquicia(String MrcFranquicia) {
        this.MrcFranquicia = MrcFranquicia;
    }

    public String getClase() {
        return Clase;
    }

    public void setClase(String Clase) {
        this.Clase = Clase;
    }

    public String getTipoGarantia() {
        return TipoGarantia;
    }

    public void setTipoGarantia(String TipoGarantia) {
        this.TipoGarantia = TipoGarantia;
    }

    public String getCobGarantia() {
        return CobGarantia;
    }

    public void setCobGarantia(String CobGarantia) {
        this.CobGarantia = CobGarantia;
    }

    public String getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(String FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public String getFechaTermina() {
        return FechaTermina;
    }

    public void setFechaTermina(String FechaTermina) {
        this.FechaTermina = FechaTermina;
    }

    public int getPac() {
        return Pac;
    }

    public void setPac(int Pac) {
        this.Pac = Pac;
    }

    public int getPag() {
        return Pag;
    }

    public void setPag(int Pag) {
        this.Pag = Pag;
    }

    public int getMor() {
        return Mor;
    }

    public void setMor(int Mor) {
        this.Mor = Mor;
    }

    public String getPer() {
        return Per;
    }

    public void setPer(String Per) {
        this.Per = Per;
    }

    public double getCupoAproVlrIni() {
        return CupoAproVlrIni;
    }

    public void setCupoAproVlrIni(double CupoAproVlrIni) {
        this.CupoAproVlrIni = CupoAproVlrIni;
    }

    public double getCupoUtiliSal() {
        return CupoUtiliSal;
    }

    public void setCupoUtiliSal(double CupoUtiliSal) {
        this.CupoUtiliSal = CupoUtiliSal;
    }

    public double getPagominimoVlrCuota() {
        return PagominimoVlrCuota;
    }

    public void setPagominimoVlrCuota(double PagominimoVlrCuota) {
        this.PagominimoVlrCuota = PagominimoVlrCuota;
    }

    public String getSitOblCalidadDeudor() {
        return SitOblCalidadDeudor;
    }

    public void setSitOblCalidadDeudor(String SitOblCalidadDeudor) {
        this.SitOblCalidadDeudor = SitOblCalidadDeudor;
    }

    public double getVlrMoraSaldo() {
        return VlrMoraSaldo;
    }

    public void setVlrMoraSaldo(double VlrMoraSaldo) {
        this.VlrMoraSaldo = VlrMoraSaldo;
    }

    public String getNatuRes() {
        return NatuRes;
    }

    public void setNatuRes(String NatuRes) {
        this.NatuRes = NatuRes;
    }

    public String getRees() {
        return Rees;
    }

    public void setRees(String Rees) {
        this.Rees = Rees;
    }

    public String getNumeroRee() {
        return NumeroRee;
    }

    public void setNumeroRee(String NumeroRee) {
        this.NumeroRee = NumeroRee;
    }

    public int getMoraMax() {
        return MoraMax;
    }

    public void setMoraMax(int MoraMax) {
        this.MoraMax = MoraMax;
    }

    public String getTipoPago() {
        return TipoPago;
    }

    public void setTipoPago(String TipoPago) {
        this.TipoPago = TipoPago;
    }

    public String getModoExt() {
        return ModoExt;
    }

    public void setModoExt(String ModoExt) {
        this.ModoExt = ModoExt;
    }

    public String getFechaExtin() {
        return FechaExtin;
    }

    public void setFechaExtin(String FechaExtin) {
        this.FechaExtin = FechaExtin;
    }

    public String getFechaPerma() {
        return FechaPerma;
    }

    public void setFechaPerma(String FechaPerma) {
        this.FechaPerma = FechaPerma;
    }

    public String getComportamiento() {
        return Comportamiento;
    }

    public void setComportamiento(String Comportamiento) {
        this.Comportamiento = Comportamiento;
    }

    public String getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(String Calificacion) {
        this.Calificacion = Calificacion;
    }

    public String getSubtitulo() {
        return Subtitulo;
    }

    public void setSubtitulo(String Subtitulo) {
        this.Subtitulo = Subtitulo;
    }

    
   

  

}
