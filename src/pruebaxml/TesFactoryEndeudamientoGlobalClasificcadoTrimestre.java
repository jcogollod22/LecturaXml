/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaxml;

import java.util.List;
import modelo.EndeudamientoGlobalClasificadoTrimestre;
import modelo.EndeudamientoSectFinanAsegSolidario;
import modelo.EndeudamientoSectReal;
import modelo.Huelladeconsulta;

/**
 *
 * @author Jose Cogollo
 */
public class TesFactoryEndeudamientoGlobalClasificcadoTrimestre {
    
     public static List<EndeudamientoGlobalClasificadoTrimestre> modreport5  = null;

	//Esto para el java beans
	@SuppressWarnings("unchecked")
	public  java.util.Collection generateCollection(){
		
		java.util.Vector coleccion = new java.util.Vector();
		
		for (int i=0;i<modreport5.size();i++){
			coleccion.add(modreport5.get(i));	
		}
				
		return coleccion;
	}
	
	public void setModeloReport5(List<EndeudamientoGlobalClasificadoTrimestre> modreport5){
	this.modreport5=modreport5;	
	}
}
