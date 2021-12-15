/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaxml;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import modelo.Informedetallado;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Jose Cogollo
 */
public class LecturaPartefinalXml {
    
     public ArrayList<String[]>  Lectura() throws ParserConfigurationException, SAXException, IOException{
         File documentXml1 = new File("C:\\Users\\Jose Cogollo\\OneDrive\\Documentos\\NetBeansProjects\\Pruebaxml\\src\\pruebaxml\\relacionados.xml");
         DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
         DocumentBuilder builder = factory.newDocumentBuilder();
         Document documentXml = builder.parse(documentXml1);
        
         Node Nodoprincipal = null;       
         Node SubNodoTipoCuenta = null;
         Node SubNodoValores = null;
         Node SubNodoEstado = null;
         Node SubNodoValor = null;
         Node SubNodoSobregiro = null;
         
         String fechaCuenta = "";
         String tipoContrato = "";
         String numeroCuenta = "";
         String estadoCuenta = "";
         String entidadBancaria = "";
         String ciudadCuenta = "";
         String sucursalCuenta = "";
         String fechaApertura = "";
         String chequeDevUltMes = "";
         String valorsobregiro = "";
         String diasautor = "";
         String fechapermanencia = "";
         String Detalledatos = "";
       
         
          
         ArrayList<String[]> informe = new ArrayList<String[]>();
         
         Informedetallado [] info = new Informedetallado[12];
         
         
         
         NodeList NodoPadre = documentXml.getElementsByTagName("Informe");
        Nodoprincipal = NodoPadre.item(0);
        //Valida que el nodo exista y que sea de tipo nodo
        if(Nodoprincipal != null && Nodoprincipal.getNodeType() == Node.ELEMENT_NODE){
             
            for (int i = 0; i < Nodoprincipal.getChildNodes().getLength(); i++) {
              
                if(Nodoprincipal.getChildNodes().item(i).getNodeName().equals("CuentaAhorro")){
                    
                    tipoContrato = "AHO-INDIVIDUAL";
                 
                    SubNodoTipoCuenta = Nodoprincipal.getChildNodes().item(i);
                    
                    Element AtributoCta = (Element)SubNodoTipoCuenta;
                    numeroCuenta = AtributoCta.getAttribute("numero");
                    entidadBancaria = AtributoCta.getAttribute("entidad").replace(" ", "");
                    ciudadCuenta = AtributoCta.getAttribute("ciudad");
                    sucursalCuenta = AtributoCta.getAttribute("oficina");
                    fechaApertura = AtributoCta.getAttribute("fechaApertura");
                   
                    if(SubNodoTipoCuenta != null && SubNodoTipoCuenta.getNodeType() == Node.ELEMENT_NODE){
                      
                        for (int j = 0; j < SubNodoTipoCuenta.getChildNodes().getLength(); j++) {
                            
                            
                            if(SubNodoTipoCuenta.getChildNodes().item(j).getNodeName().equals("Valores")){
                                
                                SubNodoValores = SubNodoTipoCuenta.getChildNodes().item(j);
                                
                                if(SubNodoValores != null && SubNodoValores.getNodeType() == Node.ELEMENT_NODE){
                                    
                                    for (int k = 0; k < SubNodoValores.getChildNodes().getLength(); k++) {
                                        
                                        SubNodoValor = SubNodoValores.getChildNodes().item(k);
                                        
                                        if(SubNodoValor != null && SubNodoValor.getNodeType() == Node.ELEMENT_NODE){
                                            
                                            Element FechaCta = (Element)SubNodoValor;
                                            
                                            //fechaCuenta = FechaCta.getAttribute("fecha");
                                            
                                        }
                                        
                                        
                                    }
                                }
                                
                               
                                
                            }
                    
                            if(SubNodoTipoCuenta.getChildNodes().item(j).getNodeName().equals("Estado")){
                                
                                SubNodoEstado = SubNodoTipoCuenta.getChildNodes().item(j);
                           
                                
                                if(SubNodoEstado != null && SubNodoValores.getNodeType() == Node.ELEMENT_NODE){
                                    
                                   Element Estadocta = (Element)SubNodoEstado;
                                   Element FechaCta = (Element)SubNodoEstado;
                                   
                                   String ValorEstado = "";
                                   
                                   ValorEstado = Estadocta.getAttribute("codigo");
                                   fechaCuenta = FechaCta.getAttribute("fecha");
                                   
                                    switch (ValorEstado) 
                                    {
                                        case "01":  estadoCuenta = "ACTIVA";
                                                 break;
                                        case "02":  estadoCuenta = "CANCELADA POR MAL MANEJO";
                                                 break;
                                        case "05":  estadoCuenta = "SALDADA";
                                                 break;
                                        case "06":  estadoCuenta = "EMBARGADA";
                                                 break;
                                        case "07":  estadoCuenta = "EMBARGADA-ACTIVA";
                                                 break;
                                        case "09":  estadoCuenta = "INACTIVA";
                                                 break;
                                        default: estadoCuenta = "";
                                                 break;
                                    }
                                }
                                
                            
                                
                            }
                        }
                        
                    }
                    
                    String [] arreglo = {fechaCuenta,
                        tipoContrato,
                        numeroCuenta,
                        estadoCuenta,
                        entidadBancaria,
                        ciudadCuenta,
                        sucursalCuenta,
                        fechaApertura,
                        valorsobregiro,
                        diasautor,
                        fechapermanencia,
                        chequeDevUltMes};
                    Detalledatos = ("Info Ctas : "+
                            fechaCuenta+" Tipo Contrato: "+
                            tipoContrato+"Nr Cta: "+
                            numeroCuenta+" Estado Cta: "+
                            estadoCuenta+" Entidad: "+
                            entidadBancaria+" Ciudad cta: "+
                            ciudadCuenta+" Sucursal: "+
                            sucursalCuenta+" F.Apertura: "+
                            fechaApertura+" Sobregiros: "+
                            valorsobregiro+" Dias autor: "+
                            diasautor+" Fecha permanencia: "+
                            fechapermanencia+" ChequesDev: "+
                            chequeDevUltMes); 
                    
                   informe.add(arreglo);
                    
                   
                }
                
                if(Nodoprincipal.getChildNodes().item(i).getNodeName().equals("CuentaCorriente")){
                    
                                        
                    tipoContrato = "CTE-INDIVIDUAL";
                 
                    SubNodoTipoCuenta = Nodoprincipal.getChildNodes().item(i);
                    
                    Element AtributoCta = (Element)SubNodoTipoCuenta;
                    numeroCuenta = AtributoCta.getAttribute("numero");
                    entidadBancaria = AtributoCta.getAttribute("entidad").replace(" ", "");
                    ciudadCuenta = AtributoCta.getAttribute("ciudad");
                    sucursalCuenta = AtributoCta.getAttribute("oficina");
                    fechaApertura = AtributoCta.getAttribute("fechaApertura");
                   
              
                      
                    if(SubNodoTipoCuenta != null && SubNodoTipoCuenta.getNodeType() == Node.ELEMENT_NODE){
                      
                        for (int j = 0; j < SubNodoTipoCuenta.getChildNodes().getLength(); j++) {
                            
                            
                            if(SubNodoTipoCuenta.getChildNodes().item(j).getNodeName().equals("Valores")){
                                
                                SubNodoValores = SubNodoTipoCuenta.getChildNodes().item(j);
                                
                                if(SubNodoValores != null && SubNodoValores.getNodeType() == Node.ELEMENT_NODE){
                                    
                                    for (int k = 0; k < SubNodoValores.getChildNodes().getLength(); k++) {
                                        
                                        SubNodoValor = SubNodoValores.getChildNodes().item(k);
                                        
                                        if(SubNodoValor != null && SubNodoValor.getNodeType() == Node.ELEMENT_NODE){
                                            
                                            Element Atributovalores = (Element)SubNodoValor;
                                            
                                            //fechaCuenta = Atributovalores.getAttribute("fecha");
                                            chequeDevUltMes = Atributovalores.getAttribute("cantidadChequesDevueltos");
                                            
                                        }
                                        
                                        
                                    }
                                }
                                
                               
                                
                            }
                            //
                            if(SubNodoTipoCuenta.getChildNodes().item(j).getNodeName().equals("Estado")){
                                
                                SubNodoEstado = SubNodoTipoCuenta.getChildNodes().item(j);
                           
                                
                                if(SubNodoEstado != null && SubNodoValores.getNodeType() == Node.ELEMENT_NODE){
                                    
                                   Element Estadocta = (Element)SubNodoEstado;
                                   
                                   String ValorEstado = "";
                                   
                                   ValorEstado = Estadocta.getAttribute("codigo");
                                   fechaCuenta = Estadocta.getAttribute("fecha");
                                   
                                    switch (ValorEstado) 
                                    {
                                        case "01":  estadoCuenta = "ACTIVA";
                                                 break;
                                        case "02":  estadoCuenta = "CANCELADA POR MAL MANEJO";
                                                 break;
                                        case "05":  estadoCuenta = "SALDADA";
                                                 break;
                                        case "06":  estadoCuenta = "EMBARGADA";
                                                 break;
                                        case "07":  estadoCuenta = "EMBARGADA-ACTIVA";
                                                 break;
                                        case "09":  estadoCuenta = "INACTIVA";
                                                 break;
                                        default: estadoCuenta = "";
                                                 break;
                                    }
                                }
                                                          
                            }
                      
                            if(SubNodoTipoCuenta.getChildNodes().item(j).getNodeName().equals("Sobregiro")){
                                
                                SubNodoSobregiro = SubNodoTipoCuenta.getChildNodes().item(j);
                           
                                
                                if(SubNodoSobregiro != null && SubNodoValores.getNodeType() == Node.ELEMENT_NODE){
                                    
                                   Element Atributosobregiro = (Element)SubNodoSobregiro;
                                                               
                                   valorsobregiro = Atributosobregiro.getAttribute("valor");
                                   diasautor = Atributosobregiro.getAttribute("dias");
                                   fechapermanencia = Atributosobregiro.getAttribute("fecha");
                                  
                                  
                                }
                                                          
                            }
                        }
                        
                    }
                    
                    String [] arreglo = {fechaCuenta,
                        tipoContrato,
                        numeroCuenta,
                        estadoCuenta,
                        entidadBancaria,
                        ciudadCuenta,
                        sucursalCuenta,
                        fechaApertura,
                        valorsobregiro,
                        diasautor,
                        fechapermanencia,
                        chequeDevUltMes};
                    Detalledatos = ("Info Ctas : "+
                            fechaCuenta+" Tipo Contrato: "+
                            tipoContrato+"Nr Cta: "+
                            numeroCuenta+" Estado Cta: "+
                            estadoCuenta+" Entidad: "+
                            entidadBancaria+" Ciudad cta: "+
                            ciudadCuenta+" Sucursal: "+
                            sucursalCuenta+" F.Apertura: "+
                            fechaApertura+" Sobregiros: "+
                            valorsobregiro+" Dias autor: "+
                            diasautor+" Fecha permanencia: "+
                            fechapermanencia+" ChequesDev: "+
                            chequeDevUltMes); 
                    
                   informe.add(arreglo);
                    
                   
                }
               
              
                
            }
            
            for (Iterator<String[]> iterator = informe.iterator(); iterator.hasNext();) {
                String[] next = iterator.next();
                System.out.println("Dato"+next[0]+" "+next[1]+" "+next[2]+" "+next[3]+" "+next[4]+" "+next[5]+" "+next[6]+" "+next[7]+" "+next[8]+" "+next[9]);
               
                
            }
              
                   
        }
         return informe;
       
        
  
        }
        
}


