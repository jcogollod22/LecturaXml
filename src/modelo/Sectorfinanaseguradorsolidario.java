/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Jose Cogollo
 */
public class Sectorfinanaseguradorsolidario {
    
    String fechaCorte;
    String tipoContrato;
    String moda;
    float pade;
    String numeroObligacion;
    String estadoObligacion;
    String tipoEntidad;
    String calificacionClf;
    String nombreEntidad;
    String origenCartera;
    String ciudad;
    String sucursal;
    String calificacionTitular;//Ojo no se sabe si este es el nombre
    String estadoTitular;
    String mrcFranquicia;
    String clsClase;
    String tipoGarantia;
    String cobGaratiaConsumo;
    String fechaInicio;
    String fechaTerminacion;
    int pacCootasPactadas;
    int pagCuotasPagadas;
    int morCuotasenMora;
    String per;//Ojo no se sabe si este es el nombre
    float cupoAprobadoVlrInicial;
    float cupoUltilizadoSaldoActual;
    float pagoMinimoValorCuota;
    String sitObligacionCalidadDeudor;
    float valorMoraSaldo;
    String natuRes;
    String rees;
    String NrRee;
    int moraMaximaDias;
    String tipoPago;
    String modoExt;//Ojo no se sabe de donde sale este campo
    String fechaExtincion;
    String fechaPermanencia;

    public Sectorfinanaseguradorsolidario() {
    }

    public Sectorfinanaseguradorsolidario(String fechaCorte, String tipoContrato, String moda, float pade, String numeroObligacion, String estadoObligacion, String tipoEntidad, String calificacionClf, String nombreEntidad, String origenCartera, String ciudad, String sucursal, String calificacionTitular, String estadoTitular, String mrcFranquicia, String clsClase, String tipoGarantia, String cobGaratiaConsumo, String fechaInicio, String fechaTerminacion, int pacCootasPactadas, int pagCuotasPagadas, int morCuotasenMora, String per, float cupoAprobadoVlrInicial, float cupoUltilizadoSaldoActual, float pagoMinimoValorCuota, String sitObligacionCalidadDeudor, float valorMoraSaldo, String natuRes, String rees, String NrRee, int moraMaximaDias, String tipoPago, String modoExt, String fechaExtincion, String fechaPermanencia) {
        this.fechaCorte = fechaCorte;
        this.tipoContrato = tipoContrato;
        this.moda = moda;
        this.pade = pade;
        this.numeroObligacion = numeroObligacion;
        this.estadoObligacion = estadoObligacion;
        this.tipoEntidad = tipoEntidad;
        this.calificacionClf = calificacionClf;
        this.nombreEntidad = nombreEntidad;
        this.origenCartera = origenCartera;
        this.ciudad = ciudad;
        this.sucursal = sucursal;
        this.calificacionTitular = calificacionTitular;
        this.estadoTitular = estadoTitular;
        this.mrcFranquicia = mrcFranquicia;
        this.clsClase = clsClase;
        this.tipoGarantia = tipoGarantia;
        this.cobGaratiaConsumo = cobGaratiaConsumo;
        this.fechaInicio = fechaInicio;
        this.fechaTerminacion = fechaTerminacion;
        this.pacCootasPactadas = pacCootasPactadas;
        this.pagCuotasPagadas = pagCuotasPagadas;
        this.morCuotasenMora = morCuotasenMora;
        this.per = per;
        this.cupoAprobadoVlrInicial = cupoAprobadoVlrInicial;
        this.cupoUltilizadoSaldoActual = cupoUltilizadoSaldoActual;
        this.pagoMinimoValorCuota = pagoMinimoValorCuota;
        this.sitObligacionCalidadDeudor = sitObligacionCalidadDeudor;
        this.valorMoraSaldo = valorMoraSaldo;
        this.natuRes = natuRes;
        this.rees = rees;
        this.NrRee = NrRee;
        this.moraMaximaDias = moraMaximaDias;
        this.tipoPago = tipoPago;
        this.modoExt = modoExt;
        this.fechaExtincion = fechaExtincion;
        this.fechaPermanencia = fechaPermanencia;
    }

    public String getFechaCorte() {
        return fechaCorte;
    }

    public void setFechaCorte(String fechaCorte) {
        this.fechaCorte = fechaCorte;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public String getModa() {
        return moda;
    }

    public void setModa(String moda) {
        this.moda = moda;
    }

    public float getPade() {
        return pade;
    }

    public void setPade(float pade) {
        this.pade = pade;
    }

    public String getNumeroObligacion() {
        return numeroObligacion;
    }

    public void setNumeroObligacion(String numeroObligacion) {
        this.numeroObligacion = numeroObligacion;
    }

    public String getEstadoObligacion() {
        return estadoObligacion;
    }

    public void setEstadoObligacion(String estadoObligacion) {
        this.estadoObligacion = estadoObligacion;
    }

    public String getTipoEntidad() {
        return tipoEntidad;
    }

    public void setTipoEntidad(String tipoEntidad) {
        this.tipoEntidad = tipoEntidad;
    }

    public String getCalificacionClf() {
        return calificacionClf;
    }

    public void setCalificacionClf(String calificacionClf) {
        this.calificacionClf = calificacionClf;
    }

    public String getNombreEntidad() {
        return nombreEntidad;
    }

    public void setNombreEntidad(String nombreEntidad) {
        this.nombreEntidad = nombreEntidad;
    }

    public String getOrigenCartera() {
        return origenCartera;
    }

    public void setOrigenCartera(String origenCartera) {
        this.origenCartera = origenCartera;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getCalificacionTitular() {
        return calificacionTitular;
    }

    public void setCalificacionTitular(String calificacionTitular) {
        this.calificacionTitular = calificacionTitular;
    }

    public String getEstadoTitular() {
        return estadoTitular;
    }

    public void setEstadoTitular(String estadoTitular) {
        this.estadoTitular = estadoTitular;
    }

    public String getMrcFranquicia() {
        return mrcFranquicia;
    }

    public void setMrcFranquicia(String mrcFranquicia) {
        this.mrcFranquicia = mrcFranquicia;
    }

    public String getClsClase() {
        return clsClase;
    }

    public void setClsClase(String clsClase) {
        this.clsClase = clsClase;
    }

    public String getTipoGarantia() {
        return tipoGarantia;
    }

    public void setTipoGarantia(String tipoGarantia) {
        this.tipoGarantia = tipoGarantia;
    }

    public String getCobGaratiaConsumo() {
        return cobGaratiaConsumo;
    }

    public void setCobGaratiaConsumo(String cobGaratiaConsumo) {
        this.cobGaratiaConsumo = cobGaratiaConsumo;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaTerminacion() {
        return fechaTerminacion;
    }

    public void setFechaTerminacion(String fechaTerminacion) {
        this.fechaTerminacion = fechaTerminacion;
    }

    public int getPacCootasPactadas() {
        return pacCootasPactadas;
    }

    public void setPacCootasPactadas(int pacCootasPactadas) {
        this.pacCootasPactadas = pacCootasPactadas;
    }

    public int getPagCuotasPagadas() {
        return pagCuotasPagadas;
    }

    public void setPagCuotasPagadas(int pagCuotasPagadas) {
        this.pagCuotasPagadas = pagCuotasPagadas;
    }

    public int getMorCuotasenMora() {
        return morCuotasenMora;
    }

    public void setMorCuotasenMora(int morCuotasenMora) {
        this.morCuotasenMora = morCuotasenMora;
    }

    public String getPer() {
        return per;
    }

    public void setPer(String per) {
        this.per = per;
    }

    public float getCupoAprobadoVlrInicial() {
        return cupoAprobadoVlrInicial;
    }

    public void setCupoAprobadoVlrInicial(float cupoAprobadoVlrInicial) {
        this.cupoAprobadoVlrInicial = cupoAprobadoVlrInicial;
    }

    public float getCupoUltilizadoSaldoActual() {
        return cupoUltilizadoSaldoActual;
    }

    public void setCupoUltilizadoSaldoActual(float cupoUltilizadoSaldoActual) {
        this.cupoUltilizadoSaldoActual = cupoUltilizadoSaldoActual;
    }

    public float getPagoMinimoValorCuota() {
        return pagoMinimoValorCuota;
    }

    public void setPagoMinimoValorCuota(float pagoMinimoValorCuota) {
        this.pagoMinimoValorCuota = pagoMinimoValorCuota;
    }

    public String getSitObligacionCalidadDeudor() {
        return sitObligacionCalidadDeudor;
    }

    public void setSitObligacionCalidadDeudor(String sitObligacionCalidadDeudor) {
        this.sitObligacionCalidadDeudor = sitObligacionCalidadDeudor;
    }

    public float getValorMoraSaldo() {
        return valorMoraSaldo;
    }

    public void setValorMoraSaldo(float valorMoraSaldo) {
        this.valorMoraSaldo = valorMoraSaldo;
    }

    public String getNatuRes() {
        return natuRes;
    }

    public void setNatuRes(String natuRes) {
        this.natuRes = natuRes;
    }

    public String getRees() {
        return rees;
    }

    public void setRees(String rees) {
        this.rees = rees;
    }

    public String getNrRee() {
        return NrRee;
    }

    public void setNrRee(String NrRee) {
        this.NrRee = NrRee;
    }

    public int getMoraMaximaDias() {
        return moraMaximaDias;
    }

    public void setMoraMaximaDias(int moraMaximaDias) {
        this.moraMaximaDias = moraMaximaDias;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getModoExt() {
        return modoExt;
    }

    public void setModoExt(String modoExt) {
        this.modoExt = modoExt;
    }

    public String getFechaExtincion() {
        return fechaExtincion;
    }

    public void setFechaExtincion(String fechaExtincion) {
        this.fechaExtincion = fechaExtincion;
    }

    public String getFechaPermanencia() {
        return fechaPermanencia;
    }

    public void setFechaPermanencia(String fechaPermanencia) {
        this.fechaPermanencia = fechaPermanencia;
    }
    
    
    
    
    
}
