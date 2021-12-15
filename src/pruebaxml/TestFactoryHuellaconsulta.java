/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaxml;

import java.util.List;
import modelo.Huelladeconsulta;


/**
 *
 * @author Jose Cogollo
 */
public class TestFactoryHuellaconsulta {
    
     public static List<Huelladeconsulta> modreport2  = null;

	//Esto para el java beans
	@SuppressWarnings("unchecked")
	public  java.util.Collection generateCollection(){
		
		java.util.Vector coleccion = new java.util.Vector();
		
		for (int i=0;i<modreport2.size();i++){
			coleccion.add(modreport2.get(i));	
		}
				
		return coleccion;
	}
	
	public void setModeloReport1(List<Huelladeconsulta> modreport2){
	this.modreport2=modreport2;	
	}
    
}
