/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaxml;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.xml.parsers.ParserConfigurationException;
import modelo.Huelladeconsulta;
import org.xml.sax.SAXException;

/**
 *
 * @author Jose Cogollo
 */
public class Ejeclecturahuellaconsulta {
    
     public static void main(String[] args) throws ParserConfigurationException,
            SAXException, IOException, Exception {
         
            ArrayList<Huelladeconsulta> ListaReporte1=null;
            
            // De la clase que uso para leer el xml declaro la variable valor
            Lecturahuellaconsulta valor = new Lecturahuellaconsulta();
            //valor tiene un método  que es Lectura()
            ArrayList<String[]> informedet = valor.Obtenerhuellaconsulta();
            
           
     }
}
    

