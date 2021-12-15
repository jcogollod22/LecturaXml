/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaxml;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import modelo.Huelladeconsulta;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Jose Cogollo
 */
public class Lecturahuellaconsulta {
 

        public ArrayList<String[]> Obtenerhuellaconsulta() throws ParserConfigurationException, SAXException, IOException, ParseException {

        File documentXml1 = new File("D:\\Proyect\\Pruebaxml\\src\\pruebaxml\\xml3.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document documentXml = builder.parse(documentXml1);

        ArrayList<String[]> huella = new ArrayList<String[]>();

        Huelladeconsulta [] Objhuella = new Huelladeconsulta[4];

        Node Nodoprincipal = null;
        Node SubNodoTipoCuenta = null;
        Node SubNodoEstado = null;
        Node SubNodoValor = null;

        String entidad = null;
        String fecha = null;
        String sucursal = null;
        String ciudad = null;
        String fechaConsulta = null;
        String fechaCompara = null;
        String fechaLimite = null;

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

        NodeList nodoPadre = documentXml.getElementsByTagName("Informe");
        Nodoprincipal = nodoPadre.item(0);
        
        
        
        if (Nodoprincipal != null && Nodoprincipal.getNodeType() == Node.ELEMENT_NODE) {
            
            Element atributonodoInforme = (Element)Nodoprincipal;
            fechaConsulta = atributonodoInforme.getAttribute("fechaConsulta");
         
            
            for (int i = 0; i < Nodoprincipal.getChildNodes().getLength(); i++) {

                if (Nodoprincipal.getChildNodes().item(i).getNodeName().equals("Consulta")) {

                    SubNodoTipoCuenta = Nodoprincipal.getChildNodes().item(i);

                    Element AtributoCta = (Element) SubNodoTipoCuenta;
                    entidad = AtributoCta.getAttribute("entidad").replace(" ", "");
                    sucursal = AtributoCta.getAttribute("oficina");
                    ciudad = AtributoCta.getAttribute("ciudad");
                    fecha = AtributoCta.getAttribute("fecha");
                    /*
                    if (SubNodoTipoCuenta != null && SubNodoTipoCuenta.getNodeType() == Node.ELEMENT_NODE) {

                        for (int j = 0; j < SubNodoTipoCuenta.getChildNodes().getLength(); j++) {
                        
                            if (SubNodoTipoCuenta.getChildNodes().item(j).getNodeName().equals("Estado")) {

                                SubNodoEstado = SubNodoTipoCuenta.getChildNodes().item(j);

                                if (SubNodoEstado != null && SubNodoEstado.getNodeType() == Node.ELEMENT_NODE) {

                                
                                            Element Atributovalores = (Element) SubNodoEstado;

                                            fecha = Atributovalores.getAttribute("fecha");

                                        
                                    
                                }

                            }

                        }
                    }
*/
                    
                    if(fechaConsulta != null && fecha != null){
                        String[] parts = fechaConsulta.split("T");
                        fechaCompara = parts[0];
                 
          
                        LocalDate dBefore = LocalDate.parse(fecha, DateTimeFormatter.ISO_LOCAL_DATE);
                      
                        LocalDate dAfter = LocalDate.parse(fechaCompara, DateTimeFormatter.ISO_LOCAL_DATE);

                        long diff = ChronoUnit.DAYS.between(dBefore, dAfter.minusDays(180));
                     
                        if(diff <= 0){
                        String [] arreglo = {entidad,
                            fecha,
                            sucursal,
                            ciudad
                             };


                         huella.add(arreglo);
                        }
                    }

                }
                
                  

            }
            
            for (Iterator<String[]> iterator = huella.iterator(); iterator.hasNext();) {
            String[] next = iterator.next();
            System.out.println("Entidad: "+next[0]+" Fecha: "+next[1]+" Sucursal: "+next[2]+" Ciudad: "+next[3]);
                  
            } 
        }
        
        if(huella.isEmpty()){
             String [] arreglo = {entidad = "",
                            fecha = "",
                            sucursal = "",
                            ciudad = ""
                             };


                         huella.add(arreglo);
        }
            return huella;
        
        

    

    }
        
   
}
