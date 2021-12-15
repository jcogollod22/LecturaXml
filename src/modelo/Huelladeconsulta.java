/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Jose Cogollo
 */
public class Huelladeconsulta {
    
    private String entidad;
    private String fecha;
    private String sucursal;
    private String ciudad;

    public Huelladeconsulta() {
    }

    public Huelladeconsulta(String entidad, String fecha, String sucursal, String ciudad) {
        this.entidad = entidad;
        this.fecha = fecha;
        this.sucursal = sucursal;
        this.ciudad = ciudad;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

   
    
    
}
