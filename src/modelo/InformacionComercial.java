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
public class InformacionComercial {
    
    //VARIABLES PARA DATOS INFORMACION COMERCIAL
        
        InformacionComercial a = null;
        
        public String Nombreraiz = "";
        public String Tipoidentificacion = "";
        public String Identificacion = "";
        public String Razonsocial = "";
        public String Actividadeconomica = "";
        public String Estadodocumento = "";
        public String Fechaexpedicion = "";
        public String Lugarexpedicion = "";
        public String Edadminima = "";
        public String Edadmaxima = "";
        public String Rangoedad = "";
        public String Fecha = "";
        public String Horaconsulta = "";
        public String Fechaconsulta = "";
        public String Usuarioconsulta = "";
        public String Nomerodeinforme = "";
        
        //VARIABLES PARA SCORE
        
        public String Score = "";
        
         /*VARIABLES PARA RESUMEN ENDEUDAMIENTO COMO PRINCIPAL
        SECCION TOTALES(CANTIDAD Y SALDO TOTAL*/
        public int TarjcreditoCantTotalesPpal = 0;
        public double TarjcreditoSaldoTotalesPpal = 0;
        public int SectorFinanCantTotalesPpal = 0;
        public double SectorFinanSaldoTotalesPpal = 0;
        public int SectorSolidCantTotalesPpal = 0;
        public double SectorSolidSaldoTotalesPpal = 0;
        public int SectorRealCantTotalesPpal = 0;
        public double SectorRealSaldoTotalesPpal = 0;
        public int SaldoTotalPpalCantTotalesPpal = 0;
        public double SaldoTotalPpalSaldoTotalesPpal = 0;

        /*VARIABLES PARA RESUMEN ENDEUDAMIENTO COMO COEDUDOR
        SECCION TOTALES(CANTIDAD Y SALDO TOTAL*/
        public int TarjcreditoCantTotalesCoe = 0;
        public double TarjcreditoSaldoTotalesCoe = 0;
        public int SectorFinanCantTotalesCoe = 0;
        public double SectorFinanSaldoTotalesCoe = 0;
        public int SectorSolidCantTotalesCoe = 0;
        public double SectorSolidSaldoTotalesCoe = 0;
        public int SectorRealCantTotalesCoe = 0;
        public double SectorRealSaldoTotalesCoe = 0;
        public int SaldoTotalPpalCantTotalesCoe = 0;
        public double SaldoTotalPpalSaldoTotalesCoe = 0;

        //TOTALES RESUMEN PRINCIPAL Y COEDUDOR
        public int ResumenTotalCantTotalesPpalyCoe = 0;
        public double ResumenTotalSaldoTotalesPpalyCoe = 0;

        //INFORMACION CUENTAS AL DIA Y MORA
        public double TarjcreditoPadeOblaldiaPpal = 0;
        public int TarjcreditoCantOblaldiaPpal = 0;
        public double TarjcreditoSaldoTotalOblaldiaPpal = 0;
        public int TarjcreditoCantOblenmoraPpal = 0;
        public double TarjcreditoSaldoTotalenmoraPpal = 0;
        public double TarjcreditoCuotaOblenmoraPpal = 0;
        public int SectorFinanCantOblaldiaPpal = 0;
        public int SectorFinanCantOblenmoraPpal = 0;
        public double SectorFinanSaldoTotalOblaldiaPpal = 0;
        public double SectorFinanSaldoTotalenmoraPpal = 0;
        public double SectorFinanCuotaOblenmoraPpal = 0;
        public int SectorSolidCantOblaldiaPpal = 0;
        public int SectorSolidCantOblenmoraPpal = 0;
        public double SectorSolidCuotaOblenmoraPpal = 0;
        public double SectorSolidSaldoTotalOblaldiaPpal = 0;
        public double SectorSolidSaldoTotalenmoraPpal = 0;
        public double SectorFinanPadeOblaldiaPpal = 0;
        public double SectorSolidPadeOblaldiaPpal = 0;
        public int SectorRealCantOblaldiaPpal = 0;
        public int SectorRealCantOblenmoraPpal = 0;
        public double SectorRealCuotaOblenmoraPpal = 0;
        public double SectorRealSaldoTotalOblaldiaPpal = 0;
        public double SectorRealSaldoTotalenmoraPpal = 0;
        public double SectorRealPadeOblaldiaPpal = 0;
        public double TarjcreditoCuotaPpal = 0;
        public double TarjcreditoValenmoraPpal = 0;
        public double SectorFinanCuotaPpal = 0;
        public double SectorFinanValenmoraPpal = 0;
        public double SectorSolidCuotaPpal = 0;
        public double SectorSolidValenmoraPpal = 0;
        public double SectorRealCuotaPpal = 0;
        public double SectorRealValenmoraPpal = 0;
        public double SaldoTotalPpalPadeOblaldiaPpal = 0;
        public double SaldoTotalPpalPadeOblaldiaPpal2 = 0;
        public int SaldoTotalPpalCantOblaldiaPpal = 0;
        public double SaldoTotalPpalSaldoTotalOblaldiaPpal = 0;
        public double SaldoTotalPpalCuotaOblenmoraPpal = 0;
        public int SaldoTotalPpalCantOblenmoraPpal = 0;
        public double SaldoTotalPpalSaldoTotalenmoraPpal = 0;
        public double SaldoTotalPpalCuotaPpal = 0;
        public double SaldoTotalPpalValenmoraPpal = 0;
        public int TarjcreditoCantOblaldiaCoe = 0;
        public double TarjcreditoSaldoTotalOblaldiaCoe = 0;
        public double TarjcreditoPadeOblaldiaCoe = 0;
        public int SectorFinanCantOblaldiaCoe = 0;
        public double SectorFinanSaldoTotalOblaldiaCoe = 0;
        public double SectorFinanPadeOblaldiaCoe = 0;
        public double SectorSolidSaldoTotalOblaldiaCoe = 0;
        public double SectorSolidPadeOblaldiaCoe = 0;
        public int SectorRealCantOblaldiaCoe = 0;
        public double SectorRealSaldoTotalOblaldiaCoe = 0;
        public double SectorRealPadeOblaldiaCoe = 0;
        public int TarjcreditoCantOblenmoraCoe = 0;
        public double TarjcreditoSaldoTotalenmoraCoe = 0;
        public double SectorFinanCuotaOblenmoraCoe = 0;
        public double SectorSolidCuotaOblenmoraCoe = 0;
        public int SectorSolidCantOblenmoraCoe = 0;
        public double SectorSolidSaldoTotalenmoraCoe = 0;
        public double SectorRealCuotaOblenmoraCoe = 0;
        public int SectorRealCantOblenmoraCoe = 0;
        public double SectorRealSaldoTotalenmoraCoe = 0;
        public double TarjcreditoCuotaCoe = 0;
        public double TarjcreditoValenmoraCoe = 0;
        public double SectorFinanCuotaCoe = 0;
        public double SectorFinanValenmoraCoe = 0;
        public double SectorSolidCuotaCoe = 0;
        public double SectorSolidValenmoraCoe = 0;
        public double SectorRealCuotaCoe = 0;
        public double SectorRealValenmoraCoe = 0;
        public double SaldoTotalPadeOblaldiaCoe2 = 0;
        public double SaldoTotalPadeOblaldiaCoe = 0;
        public int SaldoTotalCantOblaldiaCoe = 0;
        public double SaldoTotalSaldoTotalOblaldiaCoe = 0;
        public double SaldoTotalCuotaOblenmoraCoe = 0;
        public double TarjcreditoCuotaOblenmoraCoe = 0;
        public int SaldoTotalCantOblenmoraCoe = 0;
        public int SectorFinanCantOblenmoraCoe = 0;
        public double SectorFinanSaldoTotalenmoraCoe = 0;
        public double SaldoTotalCuotaCoe = 0;
        public double SaldoTotalValenmoraCoe = 0;
        public int SectorSolidCantOblaldiaCoe = 0;
        public double ResumenTotalPadeOblaldiaPpal = 0;
        public double ResumenTotalCantOblaldiaPpal = 0;
        public double ResumenTotalSaldoTotalOblaldiaPpal = 0;
        public double ResumenTotalCuotaOblenmoraPpal = 0;
        public double ResumenTotalCantOblenmoraPpal = 0;
        public double ResumenTotalSaldoTotalenmoraPpal = 0;
        public double ResumenTotalCuotaPpal = 0;
        public double ResumenTotalValenmoraPpal = 0;
        
        public String Indicadordepago = "";
        public String Politica = "";
        public String Probabilidadnopago = "";
        public String Probabilidadmora = "";
        public double SaldoTotalCantTotalesCoe = 0;
        public double SaldoTotalSaldoTotalesCoe = 0;
        public double SaldoTotalSaldoTotalenmoraCoe = 0;
        public double ResumenTotalPadeOblaldiaPpalyCoe = 0;
        public int ResumenTotalCantOblaldiaPpalyCoe = 0;
        public double ResumenTotalSaldoTotalOblaldiaPpalyCoe = 0;
        public double ResumenTotalCuotaOblenmoraPpalyCoe = 0;
        public double ResumenTotalCantOblenmoraPpalyCoe = 0;
        public double ResumenTotalSaldoTotalenmoraPpalyCoe = 0;
        public double ResumenTotalCuotaPpalyCoe = 0;
        public double ResumenTotalValenmoraPpalyCoe = 0;

    public InformacionComercial() {
    }

    public InformacionComercial getA() {
        return a;
    }

    public void setA(InformacionComercial a) {
        this.a = a;
    }

    public String getNombreraiz() {
        return Nombreraiz;
    }

    public void setNombreraiz(String Nombreraiz) {
        this.Nombreraiz = Nombreraiz;
    }

    public String getTipoidentificacion() {
        return Tipoidentificacion;
    }

    public void setTipoidentificacion(String Tipoidentificacion) {
        this.Tipoidentificacion = Tipoidentificacion;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getRazonsocial() {
        return Razonsocial;
    }

    public void setRazonsocial(String Razonsocial) {
        this.Razonsocial = Razonsocial;
    }

    public String getActividadeconomica() {
        return Actividadeconomica;
    }

    public void setActividadeconomica(String Actividadeconomica) {
        this.Actividadeconomica = Actividadeconomica;
    }

    public String getEstadodocumento() {
        return Estadodocumento;
    }

    public void setEstadodocumento(String Estadodocumento) {
        this.Estadodocumento = Estadodocumento;
    }

    public String getFechaexpedicion() {
        return Fechaexpedicion;
    }

    public void setFechaexpedicion(String Fechaexpedicion) {
        this.Fechaexpedicion = Fechaexpedicion;
    }

    public String getLugarexpedicion() {
        return Lugarexpedicion;
    }

    public void setLugarexpedicion(String Lugarexpedicion) {
        this.Lugarexpedicion = Lugarexpedicion;
    }

    public String getEdadminima() {
        return Edadminima;
    }

    public void setEdadminima(String Edadminima) {
        this.Edadminima = Edadminima;
    }

    public String getEdadmaxima() {
        return Edadmaxima;
    }

    public void setEdadmaxima(String Edadmaxima) {
        this.Edadmaxima = Edadmaxima;
    }

    public String getRangoedad() {
        return Rangoedad;
    }

    public void setRangoedad(String Rangoedad) {
        this.Rangoedad = Rangoedad;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getHoraconsulta() {
        return Horaconsulta;
    }

    public void setHoraconsulta(String Horaconsulta) {
        this.Horaconsulta = Horaconsulta;
    }

    public String getFechaconsulta() {
        return Fechaconsulta;
    }

    public void setFechaconsulta(String Fechaconsulta) {
        this.Fechaconsulta = Fechaconsulta;
    }

    public String getUsuarioconsulta() {
        return Usuarioconsulta;
    }

    public void setUsuarioconsulta(String Usuarioconsulta) {
        this.Usuarioconsulta = Usuarioconsulta;
    }

    public String getNomerodeinforme() {
        return Nomerodeinforme;
    }

    public void setNomerodeinforme(String Nomerodeinforme) {
        this.Nomerodeinforme = Nomerodeinforme;
    }

    public String getScore() {
        return Score;
    }

    public void setScore(String Score) {
        this.Score = Score;
    }

    public int getTarjcreditoCantTotalesPpal() {
        return TarjcreditoCantTotalesPpal;
    }

    public void setTarjcreditoCantTotalesPpal(int TarjcreditoCantTotalesPpal) {
        this.TarjcreditoCantTotalesPpal = TarjcreditoCantTotalesPpal;
    }

    public double getTarjcreditoSaldoTotalesPpal() {
        return TarjcreditoSaldoTotalesPpal;
    }

    public void setTarjcreditoSaldoTotalesPpal(double TarjcreditoSaldoTotalesPpal) {
        this.TarjcreditoSaldoTotalesPpal = TarjcreditoSaldoTotalesPpal;
    }

    public int getSectorFinanCantTotalesPpal() {
        return SectorFinanCantTotalesPpal;
    }

    public void setSectorFinanCantTotalesPpal(int SectorFinanCantTotalesPpal) {
        this.SectorFinanCantTotalesPpal = SectorFinanCantTotalesPpal;
    }

    public double getSectorFinanSaldoTotalesPpal() {
        return SectorFinanSaldoTotalesPpal;
    }

    public void setSectorFinanSaldoTotalesPpal(double SectorFinanSaldoTotalesPpal) {
        this.SectorFinanSaldoTotalesPpal = SectorFinanSaldoTotalesPpal;
    }

    public int getSectorSolidCantTotalesPpal() {
        return SectorSolidCantTotalesPpal;
    }

    public void setSectorSolidCantTotalesPpal(int SectorSolidCantTotalesPpal) {
        this.SectorSolidCantTotalesPpal = SectorSolidCantTotalesPpal;
    }

    public double getSectorSolidSaldoTotalesPpal() {
        return SectorSolidSaldoTotalesPpal;
    }

    public void setSectorSolidSaldoTotalesPpal(double SectorSolidSaldoTotalesPpal) {
        this.SectorSolidSaldoTotalesPpal = SectorSolidSaldoTotalesPpal;
    }

    public int getSectorRealCantTotalesPpal() {
        return SectorRealCantTotalesPpal;
    }

    public void setSectorRealCantTotalesPpal(int SectorRealCantTotalesPpal) {
        this.SectorRealCantTotalesPpal = SectorRealCantTotalesPpal;
    }

    public double getSectorRealSaldoTotalesPpal() {
        return SectorRealSaldoTotalesPpal;
    }

    public void setSectorRealSaldoTotalesPpal(double SectorRealSaldoTotalesPpal) {
        this.SectorRealSaldoTotalesPpal = SectorRealSaldoTotalesPpal;
    }

    public int getSaldoTotalPpalCantTotalesPpal() {
        return SaldoTotalPpalCantTotalesPpal;
    }

    public void setSaldoTotalPpalCantTotalesPpal(int SaldoTotalPpalCantTotalesPpal) {
        this.SaldoTotalPpalCantTotalesPpal = SaldoTotalPpalCantTotalesPpal;
    }

    public double getSaldoTotalPpalSaldoTotalesPpal() {
        return SaldoTotalPpalSaldoTotalesPpal;
    }

    public void setSaldoTotalPpalSaldoTotalesPpal(double SaldoTotalPpalSaldoTotalesPpal) {
        this.SaldoTotalPpalSaldoTotalesPpal = SaldoTotalPpalSaldoTotalesPpal;
    }

    public int getTarjcreditoCantTotalesCoe() {
        return TarjcreditoCantTotalesCoe;
    }

    public void setTarjcreditoCantTotalesCoe(int TarjcreditoCantTotalesCoe) {
        this.TarjcreditoCantTotalesCoe = TarjcreditoCantTotalesCoe;
    }

    public double getTarjcreditoSaldoTotalesCoe() {
        return TarjcreditoSaldoTotalesCoe;
    }

    public void setTarjcreditoSaldoTotalesCoe(double TarjcreditoSaldoTotalesCoe) {
        this.TarjcreditoSaldoTotalesCoe = TarjcreditoSaldoTotalesCoe;
    }

    public int getSectorFinanCantTotalesCoe() {
        return SectorFinanCantTotalesCoe;
    }

    public void setSectorFinanCantTotalesCoe(int SectorFinanCantTotalesCoe) {
        this.SectorFinanCantTotalesCoe = SectorFinanCantTotalesCoe;
    }

    public double getSectorFinanSaldoTotalesCoe() {
        return SectorFinanSaldoTotalesCoe;
    }

    public void setSectorFinanSaldoTotalesCoe(double SectorFinanSaldoTotalesCoe) {
        this.SectorFinanSaldoTotalesCoe = SectorFinanSaldoTotalesCoe;
    }

    public int getSectorSolidCantTotalesCoe() {
        return SectorSolidCantTotalesCoe;
    }

    public void setSectorSolidCantTotalesCoe(int SectorSolidCantTotalesCoe) {
        this.SectorSolidCantTotalesCoe = SectorSolidCantTotalesCoe;
    }

    public double getSectorSolidSaldoTotalesCoe() {
        return SectorSolidSaldoTotalesCoe;
    }

    public void setSectorSolidSaldoTotalesCoe(double SectorSolidSaldoTotalesCoe) {
        this.SectorSolidSaldoTotalesCoe = SectorSolidSaldoTotalesCoe;
    }

    public int getSectorRealCantTotalesCoe() {
        return SectorRealCantTotalesCoe;
    }

    public void setSectorRealCantTotalesCoe(int SectorRealCantTotalesCoe) {
        this.SectorRealCantTotalesCoe = SectorRealCantTotalesCoe;
    }

    public double getSectorRealSaldoTotalesCoe() {
        return SectorRealSaldoTotalesCoe;
    }

    public void setSectorRealSaldoTotalesCoe(double SectorRealSaldoTotalesCoe) {
        this.SectorRealSaldoTotalesCoe = SectorRealSaldoTotalesCoe;
    }

    public int getSaldoTotalPpalCantTotalesCoe() {
        return SaldoTotalPpalCantTotalesCoe;
    }

    public void setSaldoTotalPpalCantTotalesCoe(int SaldoTotalPpalCantTotalesCoe) {
        this.SaldoTotalPpalCantTotalesCoe = SaldoTotalPpalCantTotalesCoe;
    }

    public double getSaldoTotalPpalSaldoTotalesCoe() {
        return SaldoTotalPpalSaldoTotalesCoe;
    }

    public void setSaldoTotalPpalSaldoTotalesCoe(double SaldoTotalPpalSaldoTotalesCoe) {
        this.SaldoTotalPpalSaldoTotalesCoe = SaldoTotalPpalSaldoTotalesCoe;
    }

    public int getResumenTotalCantTotalesPpalyCoe() {
        return ResumenTotalCantTotalesPpalyCoe;
    }

    public void setResumenTotalCantTotalesPpalyCoe(int ResumenTotalCantTotalesPpalyCoe) {
        this.ResumenTotalCantTotalesPpalyCoe = ResumenTotalCantTotalesPpalyCoe;
    }

    public double getResumenTotalSaldoTotalesPpalyCoe() {
        return ResumenTotalSaldoTotalesPpalyCoe;
    }

    public void setResumenTotalSaldoTotalesPpalyCoe(double ResumenTotalSaldoTotalesPpalyCoe) {
        this.ResumenTotalSaldoTotalesPpalyCoe = ResumenTotalSaldoTotalesPpalyCoe;
    }

    public double getTarjcreditoPadeOblaldiaPpal() {
        return TarjcreditoPadeOblaldiaPpal;
    }

    public void setTarjcreditoPadeOblaldiaPpal(double TarjcreditoPadeOblaldiaPpal) {
        this.TarjcreditoPadeOblaldiaPpal = TarjcreditoPadeOblaldiaPpal;
    }

    public int getTarjcreditoCantOblaldiaPpal() {
        return TarjcreditoCantOblaldiaPpal;
    }

    public void setTarjcreditoCantOblaldiaPpal(int TarjcreditoCantOblaldiaPpal) {
        this.TarjcreditoCantOblaldiaPpal = TarjcreditoCantOblaldiaPpal;
    }

    public double getTarjcreditoSaldoTotalOblaldiaPpal() {
        return TarjcreditoSaldoTotalOblaldiaPpal;
    }

    public void setTarjcreditoSaldoTotalOblaldiaPpal(double TarjcreditoSaldoTotalOblaldiaPpal) {
        this.TarjcreditoSaldoTotalOblaldiaPpal = TarjcreditoSaldoTotalOblaldiaPpal;
    }

    public int getTarjcreditoCantOblenmoraPpal() {
        return TarjcreditoCantOblenmoraPpal;
    }

    public void setTarjcreditoCantOblenmoraPpal(int TarjcreditoCantOblenmoraPpal) {
        this.TarjcreditoCantOblenmoraPpal = TarjcreditoCantOblenmoraPpal;
    }

    public double getTarjcreditoSaldoTotalenmoraPpal() {
        return TarjcreditoSaldoTotalenmoraPpal;
    }

    public void setTarjcreditoSaldoTotalenmoraPpal(double TarjcreditoSaldoTotalenmoraPpal) {
        this.TarjcreditoSaldoTotalenmoraPpal = TarjcreditoSaldoTotalenmoraPpal;
    }

    public double getTarjcreditoCuotaOblenmoraPpal() {
        return TarjcreditoCuotaOblenmoraPpal;
    }

    public void setTarjcreditoCuotaOblenmoraPpal(double TarjcreditoCuotaOblenmoraPpal) {
        this.TarjcreditoCuotaOblenmoraPpal = TarjcreditoCuotaOblenmoraPpal;
    }

    public int getSectorFinanCantOblaldiaPpal() {
        return SectorFinanCantOblaldiaPpal;
    }

    public void setSectorFinanCantOblaldiaPpal(int SectorFinanCantOblaldiaPpal) {
        this.SectorFinanCantOblaldiaPpal = SectorFinanCantOblaldiaPpal;
    }

    public int getSectorFinanCantOblenmoraPpal() {
        return SectorFinanCantOblenmoraPpal;
    }

    public void setSectorFinanCantOblenmoraPpal(int SectorFinanCantOblenmoraPpal) {
        this.SectorFinanCantOblenmoraPpal = SectorFinanCantOblenmoraPpal;
    }

    public double getSectorFinanSaldoTotalOblaldiaPpal() {
        return SectorFinanSaldoTotalOblaldiaPpal;
    }

    public void setSectorFinanSaldoTotalOblaldiaPpal(double SectorFinanSaldoTotalOblaldiaPpal) {
        this.SectorFinanSaldoTotalOblaldiaPpal = SectorFinanSaldoTotalOblaldiaPpal;
    }

    public double getSectorFinanSaldoTotalenmoraPpal() {
        return SectorFinanSaldoTotalenmoraPpal;
    }

    public void setSectorFinanSaldoTotalenmoraPpal(double SectorFinanSaldoTotalenmoraPpal) {
        this.SectorFinanSaldoTotalenmoraPpal = SectorFinanSaldoTotalenmoraPpal;
    }

    public double getSectorFinanCuotaOblenmoraPpal() {
        return SectorFinanCuotaOblenmoraPpal;
    }

    public void setSectorFinanCuotaOblenmoraPpal(double SectorFinanCuotaOblenmoraPpal) {
        this.SectorFinanCuotaOblenmoraPpal = SectorFinanCuotaOblenmoraPpal;
    }

    public int getSectorSolidCantOblaldiaPpal() {
        return SectorSolidCantOblaldiaPpal;
    }

    public void setSectorSolidCantOblaldiaPpal(int SectorSolidCantOblaldiaPpal) {
        this.SectorSolidCantOblaldiaPpal = SectorSolidCantOblaldiaPpal;
    }

    public int getSectorSolidCantOblenmoraPpal() {
        return SectorSolidCantOblenmoraPpal;
    }

    public void setSectorSolidCantOblenmoraPpal(int SectorSolidCantOblenmoraPpal) {
        this.SectorSolidCantOblenmoraPpal = SectorSolidCantOblenmoraPpal;
    }

    public double getSectorSolidCuotaOblenmoraPpal() {
        return SectorSolidCuotaOblenmoraPpal;
    }

    public void setSectorSolidCuotaOblenmoraPpal(double SectorSolidCuotaOblenmoraPpal) {
        this.SectorSolidCuotaOblenmoraPpal = SectorSolidCuotaOblenmoraPpal;
    }

    public double getSectorSolidSaldoTotalOblaldiaPpal() {
        return SectorSolidSaldoTotalOblaldiaPpal;
    }

    public void setSectorSolidSaldoTotalOblaldiaPpal(double SectorSolidSaldoTotalOblaldiaPpal) {
        this.SectorSolidSaldoTotalOblaldiaPpal = SectorSolidSaldoTotalOblaldiaPpal;
    }

    public double getSectorSolidSaldoTotalenmoraPpal() {
        return SectorSolidSaldoTotalenmoraPpal;
    }

    public void setSectorSolidSaldoTotalenmoraPpal(double SectorSolidSaldoTotalenmoraPpal) {
        this.SectorSolidSaldoTotalenmoraPpal = SectorSolidSaldoTotalenmoraPpal;
    }

    public double getSectorFinanPadeOblaldiaPpal() {
        return SectorFinanPadeOblaldiaPpal;
    }

    public void setSectorFinanPadeOblaldiaPpal(double SectorFinanPadeOblaldiaPpal) {
        this.SectorFinanPadeOblaldiaPpal = SectorFinanPadeOblaldiaPpal;
    }

    public double getSectorSolidPadeOblaldiaPpal() {
        return SectorSolidPadeOblaldiaPpal;
    }

    public void setSectorSolidPadeOblaldiaPpal(double SectorSolidPadeOblaldiaPpal) {
        this.SectorSolidPadeOblaldiaPpal = SectorSolidPadeOblaldiaPpal;
    }

    public int getSectorRealCantOblaldiaPpal() {
        return SectorRealCantOblaldiaPpal;
    }

    public void setSectorRealCantOblaldiaPpal(int SectorRealCantOblaldiaPpal) {
        this.SectorRealCantOblaldiaPpal = SectorRealCantOblaldiaPpal;
    }

    public int getSectorRealCantOblenmoraPpal() {
        return SectorRealCantOblenmoraPpal;
    }

    public void setSectorRealCantOblenmoraPpal(int SectorRealCantOblenmoraPpal) {
        this.SectorRealCantOblenmoraPpal = SectorRealCantOblenmoraPpal;
    }

    public double getSectorRealCuotaOblenmoraPpal() {
        return SectorRealCuotaOblenmoraPpal;
    }

    public void setSectorRealCuotaOblenmoraPpal(double SectorRealCuotaOblenmoraPpal) {
        this.SectorRealCuotaOblenmoraPpal = SectorRealCuotaOblenmoraPpal;
    }

    public double getSectorRealSaldoTotalOblaldiaPpal() {
        return SectorRealSaldoTotalOblaldiaPpal;
    }

    public void setSectorRealSaldoTotalOblaldiaPpal(double SectorRealSaldoTotalOblaldiaPpal) {
        this.SectorRealSaldoTotalOblaldiaPpal = SectorRealSaldoTotalOblaldiaPpal;
    }

    public double getSectorRealSaldoTotalenmoraPpal() {
        return SectorRealSaldoTotalenmoraPpal;
    }

    public void setSectorRealSaldoTotalenmoraPpal(double SectorRealSaldoTotalenmoraPpal) {
        this.SectorRealSaldoTotalenmoraPpal = SectorRealSaldoTotalenmoraPpal;
    }

    public double getSectorRealPadeOblaldiaPpal() {
        return SectorRealPadeOblaldiaPpal;
    }

    public void setSectorRealPadeOblaldiaPpal(double SectorRealPadeOblaldiaPpal) {
        this.SectorRealPadeOblaldiaPpal = SectorRealPadeOblaldiaPpal;
    }

    public double getTarjcreditoCuotaPpal() {
        return TarjcreditoCuotaPpal;
    }

    public void setTarjcreditoCuotaPpal(double TarjcreditoCuotaPpal) {
        this.TarjcreditoCuotaPpal = TarjcreditoCuotaPpal;
    }

    public double getTarjcreditoValenmoraPpal() {
        return TarjcreditoValenmoraPpal;
    }

    public void setTarjcreditoValenmoraPpal(double TarjcreditoValenmoraPpal) {
        this.TarjcreditoValenmoraPpal = TarjcreditoValenmoraPpal;
    }

    public double getSectorFinanCuotaPpal() {
        return SectorFinanCuotaPpal;
    }

    public void setSectorFinanCuotaPpal(double SectorFinanCuotaPpal) {
        this.SectorFinanCuotaPpal = SectorFinanCuotaPpal;
    }

    public double getSectorFinanValenmoraPpal() {
        return SectorFinanValenmoraPpal;
    }

    public void setSectorFinanValenmoraPpal(double SectorFinanValenmoraPpal) {
        this.SectorFinanValenmoraPpal = SectorFinanValenmoraPpal;
    }

    public double getSectorSolidCuotaPpal() {
        return SectorSolidCuotaPpal;
    }

    public void setSectorSolidCuotaPpal(double SectorSolidCuotaPpal) {
        this.SectorSolidCuotaPpal = SectorSolidCuotaPpal;
    }

    public double getSectorSolidValenmoraPpal() {
        return SectorSolidValenmoraPpal;
    }

    public void setSectorSolidValenmoraPpal(double SectorSolidValenmoraPpal) {
        this.SectorSolidValenmoraPpal = SectorSolidValenmoraPpal;
    }

    public double getSectorRealCuotaPpal() {
        return SectorRealCuotaPpal;
    }

    public void setSectorRealCuotaPpal(double SectorRealCuotaPpal) {
        this.SectorRealCuotaPpal = SectorRealCuotaPpal;
    }

    public double getSectorRealValenmoraPpal() {
        return SectorRealValenmoraPpal;
    }

    public void setSectorRealValenmoraPpal(double SectorRealValenmoraPpal) {
        this.SectorRealValenmoraPpal = SectorRealValenmoraPpal;
    }

    public double getSaldoTotalPpalPadeOblaldiaPpal() {
        return SaldoTotalPpalPadeOblaldiaPpal;
    }

    public void setSaldoTotalPpalPadeOblaldiaPpal(double SaldoTotalPpalPadeOblaldiaPpal) {
        this.SaldoTotalPpalPadeOblaldiaPpal = SaldoTotalPpalPadeOblaldiaPpal;
    }

    public double getSaldoTotalPpalPadeOblaldiaPpal2() {
        return SaldoTotalPpalPadeOblaldiaPpal2;
    }

    public void setSaldoTotalPpalPadeOblaldiaPpal2(double SaldoTotalPpalPadeOblaldiaPpal2) {
        this.SaldoTotalPpalPadeOblaldiaPpal2 = SaldoTotalPpalPadeOblaldiaPpal2;
    }

    public int getSaldoTotalPpalCantOblaldiaPpal() {
        return SaldoTotalPpalCantOblaldiaPpal;
    }

    public void setSaldoTotalPpalCantOblaldiaPpal(int SaldoTotalPpalCantOblaldiaPpal) {
        this.SaldoTotalPpalCantOblaldiaPpal = SaldoTotalPpalCantOblaldiaPpal;
    }

    public double getSaldoTotalPpalSaldoTotalOblaldiaPpal() {
        return SaldoTotalPpalSaldoTotalOblaldiaPpal;
    }

    public void setSaldoTotalPpalSaldoTotalOblaldiaPpal(double SaldoTotalPpalSaldoTotalOblaldiaPpal) {
        this.SaldoTotalPpalSaldoTotalOblaldiaPpal = SaldoTotalPpalSaldoTotalOblaldiaPpal;
    }

    public double getSaldoTotalPpalCuotaOblenmoraPpal() {
        return SaldoTotalPpalCuotaOblenmoraPpal;
    }

    public void setSaldoTotalPpalCuotaOblenmoraPpal(double SaldoTotalPpalCuotaOblenmoraPpal) {
        this.SaldoTotalPpalCuotaOblenmoraPpal = SaldoTotalPpalCuotaOblenmoraPpal;
    }

    public int getSaldoTotalPpalCantOblenmoraPpal() {
        return SaldoTotalPpalCantOblenmoraPpal;
    }

    public void setSaldoTotalPpalCantOblenmoraPpal(int SaldoTotalPpalCantOblenmoraPpal) {
        this.SaldoTotalPpalCantOblenmoraPpal = SaldoTotalPpalCantOblenmoraPpal;
    }

    public double getSaldoTotalPpalSaldoTotalenmoraPpal() {
        return SaldoTotalPpalSaldoTotalenmoraPpal;
    }

    public void setSaldoTotalPpalSaldoTotalenmoraPpal(double SaldoTotalPpalSaldoTotalenmoraPpal) {
        this.SaldoTotalPpalSaldoTotalenmoraPpal = SaldoTotalPpalSaldoTotalenmoraPpal;
    }

    public double getSaldoTotalPpalCuotaPpal() {
        return SaldoTotalPpalCuotaPpal;
    }

    public void setSaldoTotalPpalCuotaPpal(double SaldoTotalPpalCuotaPpal) {
        this.SaldoTotalPpalCuotaPpal = SaldoTotalPpalCuotaPpal;
    }

    public double getSaldoTotalPpalValenmoraPpal() {
        return SaldoTotalPpalValenmoraPpal;
    }

    public void setSaldoTotalPpalValenmoraPpal(double SaldoTotalPpalValenmoraPpal) {
        this.SaldoTotalPpalValenmoraPpal = SaldoTotalPpalValenmoraPpal;
    }

    public int getTarjcreditoCantOblaldiaCoe() {
        return TarjcreditoCantOblaldiaCoe;
    }

    public void setTarjcreditoCantOblaldiaCoe(int TarjcreditoCantOblaldiaCoe) {
        this.TarjcreditoCantOblaldiaCoe = TarjcreditoCantOblaldiaCoe;
    }

    public double getTarjcreditoSaldoTotalOblaldiaCoe() {
        return TarjcreditoSaldoTotalOblaldiaCoe;
    }

    public void setTarjcreditoSaldoTotalOblaldiaCoe(double TarjcreditoSaldoTotalOblaldiaCoe) {
        this.TarjcreditoSaldoTotalOblaldiaCoe = TarjcreditoSaldoTotalOblaldiaCoe;
    }

    public double getTarjcreditoPadeOblaldiaCoe() {
        return TarjcreditoPadeOblaldiaCoe;
    }

    public void setTarjcreditoPadeOblaldiaCoe(double TarjcreditoPadeOblaldiaCoe) {
        this.TarjcreditoPadeOblaldiaCoe = TarjcreditoPadeOblaldiaCoe;
    }

    public int getSectorFinanCantOblaldiaCoe() {
        return SectorFinanCantOblaldiaCoe;
    }

    public void setSectorFinanCantOblaldiaCoe(int SectorFinanCantOblaldiaCoe) {
        this.SectorFinanCantOblaldiaCoe = SectorFinanCantOblaldiaCoe;
    }

    public double getSectorFinanSaldoTotalOblaldiaCoe() {
        return SectorFinanSaldoTotalOblaldiaCoe;
    }

    public void setSectorFinanSaldoTotalOblaldiaCoe(double SectorFinanSaldoTotalOblaldiaCoe) {
        this.SectorFinanSaldoTotalOblaldiaCoe = SectorFinanSaldoTotalOblaldiaCoe;
    }

    public double getSectorFinanPadeOblaldiaCoe() {
        return SectorFinanPadeOblaldiaCoe;
    }

    public void setSectorFinanPadeOblaldiaCoe(double SectorFinanPadeOblaldiaCoe) {
        this.SectorFinanPadeOblaldiaCoe = SectorFinanPadeOblaldiaCoe;
    }

    public double getSectorSolidSaldoTotalOblaldiaCoe() {
        return SectorSolidSaldoTotalOblaldiaCoe;
    }

    public void setSectorSolidSaldoTotalOblaldiaCoe(double SectorSolidSaldoTotalOblaldiaCoe) {
        this.SectorSolidSaldoTotalOblaldiaCoe = SectorSolidSaldoTotalOblaldiaCoe;
    }

    public double getSectorSolidPadeOblaldiaCoe() {
        return SectorSolidPadeOblaldiaCoe;
    }

    public void setSectorSolidPadeOblaldiaCoe(double SectorSolidPadeOblaldiaCoe) {
        this.SectorSolidPadeOblaldiaCoe = SectorSolidPadeOblaldiaCoe;
    }

    public int getSectorRealCantOblaldiaCoe() {
        return SectorRealCantOblaldiaCoe;
    }

    public void setSectorRealCantOblaldiaCoe(int SectorRealCantOblaldiaCoe) {
        this.SectorRealCantOblaldiaCoe = SectorRealCantOblaldiaCoe;
    }

    public double getSectorRealSaldoTotalOblaldiaCoe() {
        return SectorRealSaldoTotalOblaldiaCoe;
    }

    public void setSectorRealSaldoTotalOblaldiaCoe(double SectorRealSaldoTotalOblaldiaCoe) {
        this.SectorRealSaldoTotalOblaldiaCoe = SectorRealSaldoTotalOblaldiaCoe;
    }

    public double getSectorRealPadeOblaldiaCoe() {
        return SectorRealPadeOblaldiaCoe;
    }

    public void setSectorRealPadeOblaldiaCoe(double SectorRealPadeOblaldiaCoe) {
        this.SectorRealPadeOblaldiaCoe = SectorRealPadeOblaldiaCoe;
    }

    public int getTarjcreditoCantOblenmoraCoe() {
        return TarjcreditoCantOblenmoraCoe;
    }

    public void setTarjcreditoCantOblenmoraCoe(int TarjcreditoCantOblenmoraCoe) {
        this.TarjcreditoCantOblenmoraCoe = TarjcreditoCantOblenmoraCoe;
    }

    public double getTarjcreditoSaldoTotalenmoraCoe() {
        return TarjcreditoSaldoTotalenmoraCoe;
    }

    public void setTarjcreditoSaldoTotalenmoraCoe(double TarjcreditoSaldoTotalenmoraCoe) {
        this.TarjcreditoSaldoTotalenmoraCoe = TarjcreditoSaldoTotalenmoraCoe;
    }

    public double getSectorFinanCuotaOblenmoraCoe() {
        return SectorFinanCuotaOblenmoraCoe;
    }

    public void setSectorFinanCuotaOblenmoraCoe(double SectorFinanCuotaOblenmoraCoe) {
        this.SectorFinanCuotaOblenmoraCoe = SectorFinanCuotaOblenmoraCoe;
    }

    public double getSectorSolidCuotaOblenmoraCoe() {
        return SectorSolidCuotaOblenmoraCoe;
    }

    public void setSectorSolidCuotaOblenmoraCoe(double SectorSolidCuotaOblenmoraCoe) {
        this.SectorSolidCuotaOblenmoraCoe = SectorSolidCuotaOblenmoraCoe;
    }

    public int getSectorSolidCantOblenmoraCoe() {
        return SectorSolidCantOblenmoraCoe;
    }

    public void setSectorSolidCantOblenmoraCoe(int SectorSolidCantOblenmoraCoe) {
        this.SectorSolidCantOblenmoraCoe = SectorSolidCantOblenmoraCoe;
    }

    public double getSectorSolidSaldoTotalenmoraCoe() {
        return SectorSolidSaldoTotalenmoraCoe;
    }

    public void setSectorSolidSaldoTotalenmoraCoe(double SectorSolidSaldoTotalenmoraCoe) {
        this.SectorSolidSaldoTotalenmoraCoe = SectorSolidSaldoTotalenmoraCoe;
    }

    public double getSectorRealCuotaOblenmoraCoe() {
        return SectorRealCuotaOblenmoraCoe;
    }

    public void setSectorRealCuotaOblenmoraCoe(double SectorRealCuotaOblenmoraCoe) {
        this.SectorRealCuotaOblenmoraCoe = SectorRealCuotaOblenmoraCoe;
    }

    public int getSectorRealCantOblenmoraCoe() {
        return SectorRealCantOblenmoraCoe;
    }

    public void setSectorRealCantOblenmoraCoe(int SectorRealCantOblenmoraCoe) {
        this.SectorRealCantOblenmoraCoe = SectorRealCantOblenmoraCoe;
    }

    public double getSectorRealSaldoTotalenmoraCoe() {
        return SectorRealSaldoTotalenmoraCoe;
    }

    public void setSectorRealSaldoTotalenmoraCoe(double SectorRealSaldoTotalenmoraCoe) {
        this.SectorRealSaldoTotalenmoraCoe = SectorRealSaldoTotalenmoraCoe;
    }

    public double getTarjcreditoCuotaCoe() {
        return TarjcreditoCuotaCoe;
    }

    public void setTarjcreditoCuotaCoe(double TarjcreditoCuotaCoe) {
        this.TarjcreditoCuotaCoe = TarjcreditoCuotaCoe;
    }

    public double getTarjcreditoValenmoraCoe() {
        return TarjcreditoValenmoraCoe;
    }

    public void setTarjcreditoValenmoraCoe(double TarjcreditoValenmoraCoe) {
        this.TarjcreditoValenmoraCoe = TarjcreditoValenmoraCoe;
    }

    public double getSectorFinanCuotaCoe() {
        return SectorFinanCuotaCoe;
    }

    public void setSectorFinanCuotaCoe(double SectorFinanCuotaCoe) {
        this.SectorFinanCuotaCoe = SectorFinanCuotaCoe;
    }

    public double getSectorFinanValenmoraCoe() {
        return SectorFinanValenmoraCoe;
    }

    public void setSectorFinanValenmoraCoe(double SectorFinanValenmoraCoe) {
        this.SectorFinanValenmoraCoe = SectorFinanValenmoraCoe;
    }

    public double getSectorSolidCuotaCoe() {
        return SectorSolidCuotaCoe;
    }

    public void setSectorSolidCuotaCoe(double SectorSolidCuotaCoe) {
        this.SectorSolidCuotaCoe = SectorSolidCuotaCoe;
    }

    public double getSectorSolidValenmoraCoe() {
        return SectorSolidValenmoraCoe;
    }

    public void setSectorSolidValenmoraCoe(double SectorSolidValenmoraCoe) {
        this.SectorSolidValenmoraCoe = SectorSolidValenmoraCoe;
    }

    public double getSectorRealCuotaCoe() {
        return SectorRealCuotaCoe;
    }

    public void setSectorRealCuotaCoe(double SectorRealCuotaCoe) {
        this.SectorRealCuotaCoe = SectorRealCuotaCoe;
    }

    public double getSectorRealValenmoraCoe() {
        return SectorRealValenmoraCoe;
    }

    public void setSectorRealValenmoraCoe(double SectorRealValenmoraCoe) {
        this.SectorRealValenmoraCoe = SectorRealValenmoraCoe;
    }

    public double getSaldoTotalPadeOblaldiaCoe2() {
        return SaldoTotalPadeOblaldiaCoe2;
    }

    public void setSaldoTotalPadeOblaldiaCoe2(double SaldoTotalPadeOblaldiaCoe2) {
        this.SaldoTotalPadeOblaldiaCoe2 = SaldoTotalPadeOblaldiaCoe2;
    }

    public double getSaldoTotalPadeOblaldiaCoe() {
        return SaldoTotalPadeOblaldiaCoe;
    }

    public void setSaldoTotalPadeOblaldiaCoe(double SaldoTotalPadeOblaldiaCoe) {
        this.SaldoTotalPadeOblaldiaCoe = SaldoTotalPadeOblaldiaCoe;
    }

    public int getSaldoTotalCantOblaldiaCoe() {
        return SaldoTotalCantOblaldiaCoe;
    }

    public void setSaldoTotalCantOblaldiaCoe(int SaldoTotalCantOblaldiaCoe) {
        this.SaldoTotalCantOblaldiaCoe = SaldoTotalCantOblaldiaCoe;
    }

    public double getSaldoTotalSaldoTotalOblaldiaCoe() {
        return SaldoTotalSaldoTotalOblaldiaCoe;
    }

    public void setSaldoTotalSaldoTotalOblaldiaCoe(double SaldoTotalSaldoTotalOblaldiaCoe) {
        this.SaldoTotalSaldoTotalOblaldiaCoe = SaldoTotalSaldoTotalOblaldiaCoe;
    }

    public double getSaldoTotalCuotaOblenmoraCoe() {
        return SaldoTotalCuotaOblenmoraCoe;
    }

    public void setSaldoTotalCuotaOblenmoraCoe(double SaldoTotalCuotaOblenmoraCoe) {
        this.SaldoTotalCuotaOblenmoraCoe = SaldoTotalCuotaOblenmoraCoe;
    }

    public double getTarjcreditoCuotaOblenmoraCoe() {
        return TarjcreditoCuotaOblenmoraCoe;
    }

    public void setTarjcreditoCuotaOblenmoraCoe(double TarjcreditoCuotaOblenmoraCoe) {
        this.TarjcreditoCuotaOblenmoraCoe = TarjcreditoCuotaOblenmoraCoe;
    }

    public int getSaldoTotalCantOblenmoraCoe() {
        return SaldoTotalCantOblenmoraCoe;
    }

    public void setSaldoTotalCantOblenmoraCoe(int SaldoTotalCantOblenmoraCoe) {
        this.SaldoTotalCantOblenmoraCoe = SaldoTotalCantOblenmoraCoe;
    }

    public int getSectorFinanCantOblenmoraCoe() {
        return SectorFinanCantOblenmoraCoe;
    }

    public void setSectorFinanCantOblenmoraCoe(int SectorFinanCantOblenmoraCoe) {
        this.SectorFinanCantOblenmoraCoe = SectorFinanCantOblenmoraCoe;
    }

    public double getSectorFinanSaldoTotalenmoraCoe() {
        return SectorFinanSaldoTotalenmoraCoe;
    }

    public void setSectorFinanSaldoTotalenmoraCoe(double SectorFinanSaldoTotalenmoraCoe) {
        this.SectorFinanSaldoTotalenmoraCoe = SectorFinanSaldoTotalenmoraCoe;
    }

    public double getSaldoTotalCuotaCoe() {
        return SaldoTotalCuotaCoe;
    }

    public void setSaldoTotalCuotaCoe(double SaldoTotalCuotaCoe) {
        this.SaldoTotalCuotaCoe = SaldoTotalCuotaCoe;
    }

    public double getSaldoTotalValenmoraCoe() {
        return SaldoTotalValenmoraCoe;
    }

    public void setSaldoTotalValenmoraCoe(double SaldoTotalValenmoraCoe) {
        this.SaldoTotalValenmoraCoe = SaldoTotalValenmoraCoe;
    }

    public int getSectorSolidCantOblaldiaCoe() {
        return SectorSolidCantOblaldiaCoe;
    }

    public void setSectorSolidCantOblaldiaCoe(int SectorSolidCantOblaldiaCoe) {
        this.SectorSolidCantOblaldiaCoe = SectorSolidCantOblaldiaCoe;
    }

    public double getResumenTotalPadeOblaldiaPpal() {
        return ResumenTotalPadeOblaldiaPpal;
    }

    public void setResumenTotalPadeOblaldiaPpal(double ResumenTotalPadeOblaldiaPpal) {
        this.ResumenTotalPadeOblaldiaPpal = ResumenTotalPadeOblaldiaPpal;
    }

    public double getResumenTotalCantOblaldiaPpal() {
        return ResumenTotalCantOblaldiaPpal;
    }

    public void setResumenTotalCantOblaldiaPpal(double ResumenTotalCantOblaldiaPpal) {
        this.ResumenTotalCantOblaldiaPpal = ResumenTotalCantOblaldiaPpal;
    }

    public double getResumenTotalSaldoTotalOblaldiaPpal() {
        return ResumenTotalSaldoTotalOblaldiaPpal;
    }

    public void setResumenTotalSaldoTotalOblaldiaPpal(double ResumenTotalSaldoTotalOblaldiaPpal) {
        this.ResumenTotalSaldoTotalOblaldiaPpal = ResumenTotalSaldoTotalOblaldiaPpal;
    }

    public double getResumenTotalCuotaOblenmoraPpal() {
        return ResumenTotalCuotaOblenmoraPpal;
    }

    public void setResumenTotalCuotaOblenmoraPpal(double ResumenTotalCuotaOblenmoraPpal) {
        this.ResumenTotalCuotaOblenmoraPpal = ResumenTotalCuotaOblenmoraPpal;
    }

    public double getResumenTotalCantOblenmoraPpal() {
        return ResumenTotalCantOblenmoraPpal;
    }

    public void setResumenTotalCantOblenmoraPpal(double ResumenTotalCantOblenmoraPpal) {
        this.ResumenTotalCantOblenmoraPpal = ResumenTotalCantOblenmoraPpal;
    }

    public double getResumenTotalSaldoTotalenmoraPpal() {
        return ResumenTotalSaldoTotalenmoraPpal;
    }

    public void setResumenTotalSaldoTotalenmoraPpal(double ResumenTotalSaldoTotalenmoraPpal) {
        this.ResumenTotalSaldoTotalenmoraPpal = ResumenTotalSaldoTotalenmoraPpal;
    }

    public double getResumenTotalCuotaPpal() {
        return ResumenTotalCuotaPpal;
    }

    public void setResumenTotalCuotaPpal(double ResumenTotalCuotaPpal) {
        this.ResumenTotalCuotaPpal = ResumenTotalCuotaPpal;
    }

    public double getResumenTotalValenmoraPpal() {
        return ResumenTotalValenmoraPpal;
    }

    public void setResumenTotalValenmoraPpal(double ResumenTotalValenmoraPpal) {
        this.ResumenTotalValenmoraPpal = ResumenTotalValenmoraPpal;
    }

    public String getIndicadordepago() {
        return Indicadordepago;
    }

    public void setIndicadordepago(String Indicadordepago) {
        this.Indicadordepago = Indicadordepago;
    }

    public String getPolitica() {
        return Politica;
    }

    public void setPolitica(String Politica) {
        this.Politica = Politica;
    }

    public String getProbabilidadnopago() {
        return Probabilidadnopago;
    }

    public void setProbabilidadnopago(String Probabilidadnopago) {
        this.Probabilidadnopago = Probabilidadnopago;
    }

    public String getProbabilidadmora() {
        return Probabilidadmora;
    }

    public void setProbabilidadmora(String Probabilidadmora) {
        this.Probabilidadmora = Probabilidadmora;
    }

    public double getSaldoTotalCantTotalesCoe() {
        return SaldoTotalCantTotalesCoe;
    }

    public void setSaldoTotalCantTotalesCoe(double SaldoTotalCantTotalesCoe) {
        this.SaldoTotalCantTotalesCoe = SaldoTotalCantTotalesCoe;
    }

    public double getSaldoTotalSaldoTotalesCoe() {
        return SaldoTotalSaldoTotalesCoe;
    }

    public void setSaldoTotalSaldoTotalesCoe(double SaldoTotalSaldoTotalesCoe) {
        this.SaldoTotalSaldoTotalesCoe = SaldoTotalSaldoTotalesCoe;
    }

    public double getSaldoTotalSaldoTotalenmoraCoe() {
        return SaldoTotalSaldoTotalenmoraCoe;
    }

    public void setSaldoTotalSaldoTotalenmoraCoe(double SaldoTotalSaldoTotalenmoraCoe) {
        this.SaldoTotalSaldoTotalenmoraCoe = SaldoTotalSaldoTotalenmoraCoe;
    }

    public double getResumenTotalPadeOblaldiaPpalyCoe() {
        return ResumenTotalPadeOblaldiaPpalyCoe;
    }

    public void setResumenTotalPadeOblaldiaPpalyCoe(double ResumenTotalPadeOblaldiaPpalyCoe) {
        this.ResumenTotalPadeOblaldiaPpalyCoe = ResumenTotalPadeOblaldiaPpalyCoe;
    }

    public int getResumenTotalCantOblaldiaPpalyCoe() {
        return ResumenTotalCantOblaldiaPpalyCoe;
    }

    public void setResumenTotalCantOblaldiaPpalyCoe(int ResumenTotalCantOblaldiaPpalyCoe) {
        this.ResumenTotalCantOblaldiaPpalyCoe = ResumenTotalCantOblaldiaPpalyCoe;
    }

    public double getResumenTotalSaldoTotalOblaldiaPpalyCoe() {
        return ResumenTotalSaldoTotalOblaldiaPpalyCoe;
    }

    public void setResumenTotalSaldoTotalOblaldiaPpalyCoe(double ResumenTotalSaldoTotalOblaldiaPpalyCoe) {
        this.ResumenTotalSaldoTotalOblaldiaPpalyCoe = ResumenTotalSaldoTotalOblaldiaPpalyCoe;
    }

    public double getResumenTotalCuotaOblenmoraPpalyCoe() {
        return ResumenTotalCuotaOblenmoraPpalyCoe;
    }

    public void setResumenTotalCuotaOblenmoraPpalyCoe(double ResumenTotalCuotaOblenmoraPpalyCoe) {
        this.ResumenTotalCuotaOblenmoraPpalyCoe = ResumenTotalCuotaOblenmoraPpalyCoe;
    }

    public double getResumenTotalCantOblenmoraPpalyCoe() {
        return ResumenTotalCantOblenmoraPpalyCoe;
    }

    public void setResumenTotalCantOblenmoraPpalyCoe(double ResumenTotalCantOblenmoraPpalyCoe) {
        this.ResumenTotalCantOblenmoraPpalyCoe = ResumenTotalCantOblenmoraPpalyCoe;
    }

    public double getResumenTotalSaldoTotalenmoraPpalyCoe() {
        return ResumenTotalSaldoTotalenmoraPpalyCoe;
    }

    public void setResumenTotalSaldoTotalenmoraPpalyCoe(double ResumenTotalSaldoTotalenmoraPpalyCoe) {
        this.ResumenTotalSaldoTotalenmoraPpalyCoe = ResumenTotalSaldoTotalenmoraPpalyCoe;
    }

    public double getResumenTotalCuotaPpalyCoe() {
        return ResumenTotalCuotaPpalyCoe;
    }

    public void setResumenTotalCuotaPpalyCoe(double ResumenTotalCuotaPpalyCoe) {
        this.ResumenTotalCuotaPpalyCoe = ResumenTotalCuotaPpalyCoe;
    }

    public double getResumenTotalValenmoraPpalyCoe() {
        return ResumenTotalValenmoraPpalyCoe;
    }

    public void setResumenTotalValenmoraPpalyCoe(double ResumenTotalValenmoraPpalyCoe) {
        this.ResumenTotalValenmoraPpalyCoe = ResumenTotalValenmoraPpalyCoe;
    }
    
    
}
