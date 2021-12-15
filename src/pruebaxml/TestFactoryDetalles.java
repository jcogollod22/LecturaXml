/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaxml;

import java.util.List;

import modelo.Informedetallado;

/**
 *
 * @author Jose Cogollo
 */
public class TestFactoryDetalles {
    
    public static List<Informedetallado> modreport1  = null;

	//Esto para el java beans
	@SuppressWarnings("unchecked")
	public  java.util.Collection generateCollection(){
		
		java.util.Vector coleccion = new java.util.Vector();
		
		for (int i=0;i<modreport1.size();i++){
			coleccion.add(modreport1.get(i));	
		}
				
		return coleccion;
	}
	
	public void setModeloReport1(List<Informedetallado> modreport1){
	this.modreport1=modreport1;	
	}
    
}
