/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaxml;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Jose Cogollo
 */
public class LecturaEndeudamientoGlobalClasificadoTrimestreUnoFT {

    @SuppressWarnings("empty-statement")
    public ArrayList<String[]> LecturaSectorfinanaseguradorsolidario() throws ParserConfigurationException, SAXException, IOException {
        File documentXml1 = new File("C:\\Users\\Jose Cogollo\\OneDrive\\Documentos\\NetBeansProjects\\Pruebaxml\\src\\pruebaxml\\relacionados.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document documentXml = builder.parse(documentXml1);

        ArrayList<String[]> EndeudamientoGlobalClasificadoTrimestreUno = new ArrayList<String[]>();
        ArrayList<String[]> EndeudamientoGlobalClasificadoTrimestreUno1 = new ArrayList<String[]>();

        Node nodoPrincipal = null;
        Node subNodoInfoAgregada = null;
        Node subNodoResumenEndeudamiento = null;
        Node subNodoTrimestre = null;
        Node subNodoInfoAgregadaMicrocredito = null;
        Node subNodoEvolucionDeuda = null;
        Node subNodoEvolucionDeudaSector = null;
        Node subNodoEvolucionDeudaTipoCuenta = null;
        Node subNodoEvolucionDeudaValorTrimestre = null;
        Node subNodoSector = null;
        Node subNodoCatera = null;
        Element atributoNodoTrimestre = null;
        Element atributosNodoSector = null;
        Element atributosNodoCartera = null;
        Element atributosNodoEvolucionDeudaSector = null;
        Element AtributosNodoEvolucionDeudaTipoCuenta = null;
        Element atributosNodoEvolucionDeudaValorTrimestre = null;

        String fechaTrimestre = null;
        int cantidadReportes = 0;
        String calificacion = "";
        String tipoMont = "";
        int numeroDeudasComercial = 0;
        int numeroDeudasCosumos = 0;
        int numeroDeudasVivienda = 0;
        int numeroDeudasMicrocreditos = 0;
        double valorDeudaComercial = 0;
        double valorDeudaConsumo = 0;
        double valorDeudaVivienda = 0;
        double valordeudaMicrocredito = 0;
        double totalDeudas = 0;
        double padeParticipacion = 0;
        double porcentajeCubrimientoComercial = 0;
        double porcentajeCubrimientoConsumo = 0;
        double porcentajeCubrimientoVivieda = 0;
        double porcentajeCubrimientoMicrocredito = 0;
        String etiquetaTipoMondeda = "";
        String etiquetaContingenciaNumero = "";
        String etiquetaValor = "";
        String etiquetaCuotaEsperada = "";
        String etiquetaPorcentajeCumplimiento = "";
        String tipoMoneda = "";
        int numeroContigencia = 0;
        double Valor = 0;
        double CuotaEsperada = 0;
        double porcetajeCumplimiento = 0;
        int Contador = 0;
        String Fecha1 = "";
        String Fecha2 = "";
        String Fecha3 = "";
        int cantidadRepor = 0;
        double valorReporte = 0;
        int cantDeudas = 0;
        double valorDeuda = 0;
        int sector = 0;
        String tipoCatera = "";
        int ContadorCantDeudas = 0;
        String[] arreglof = null;

        NodeList nodoPadre = documentXml.getElementsByTagName("Informe");
        nodoPrincipal = nodoPadre.item(0);

        if (nodoPrincipal != null && nodoPrincipal.getNodeType() == Node.ELEMENT_NODE) {

            // CONSULTA DE FECHAS
            for (int i = 0; i < nodoPrincipal.getChildNodes().getLength(); i++) {
                if (nodoPrincipal.getChildNodes().item(i).getNodeName().equals("InfoAgregada")) {
                    subNodoInfoAgregada = nodoPrincipal.getChildNodes().item(i);
                    if (subNodoInfoAgregada != null && subNodoInfoAgregada.getNodeType() == Node.ELEMENT_NODE) {
                        for (int j = 0; j < subNodoInfoAgregada.getChildNodes().getLength(); j++) {
                            if (subNodoInfoAgregada.getChildNodes().item(j).getNodeName().equals("ResumenEndeudamiento")) {
                                subNodoResumenEndeudamiento = subNodoInfoAgregada.getChildNodes().item(j);
                                if (subNodoResumenEndeudamiento != null && subNodoResumenEndeudamiento.getNodeType() == Node.ELEMENT_NODE) {
                                    for (int k = 0; k < subNodoResumenEndeudamiento.getChildNodes().getLength(); k++) {
                                        if (subNodoResumenEndeudamiento.getChildNodes().item(k).getNodeName().equals("Trimestre")) {
                                            subNodoTrimestre = subNodoResumenEndeudamiento.getChildNodes().item(k);
                                            if (subNodoTrimestre != null && subNodoTrimestre.getNodeType() == Node.ELEMENT_NODE) {
                                                atributoNodoTrimestre = (Element) subNodoTrimestre;
                                                Contador = Contador + 1;
                                                if (Contador == 1) {
                                                    Fecha1 = atributoNodoTrimestre.getAttribute("fecha");

                                                } else if (Contador == 2) {
                                                    Fecha2 = atributoNodoTrimestre.getAttribute("fecha");

                                                } else if (Contador == 3) {
                                                    Fecha3 = atributoNodoTrimestre.getAttribute("fecha");
                                                    break;
                                                }

                                                for (int l = 0; l < subNodoTrimestre.getChildNodes().getLength(); l++) {
                                                    if (subNodoTrimestre.getChildNodes().item(l).getNodeName().equals("Sector")) {
                                                        subNodoSector = subNodoTrimestre.getChildNodes().item(l);
                                                        if (subNodoSector != null && subNodoSector.getNodeType() == Node.ELEMENT_NODE) {
                                                            atributosNodoSector = (Element) subNodoSector;

                                                            for (int m = 0; m < subNodoSector.getChildNodes().getLength(); m++) {
                                                                if (subNodoSector.getChildNodes().item(m).getNodeName().equals("Cartera")) {
                                                                    subNodoCatera = subNodoSector.getChildNodes().item(m);
                                                                    if (subNodoCatera != null) {
                                                                        atributosNodoCartera = (Element) subNodoCatera;

                                                                        fechaTrimestre = atributoNodoTrimestre.getAttribute("fecha");
                                                                        if (Fecha1.equals(fechaTrimestre)) {

                                                                            cantidadRepor = Integer.parseInt(atributosNodoCartera.getAttribute("numeroCuentas"));
                                                                            valorReporte = Double.parseDouble(atributosNodoCartera.getAttribute("valor"));

                                                                            if (cantidadRepor > 0 && valorReporte > 0) {
                                                                                cantidadReportes = cantidadReportes + 1;

                                                                            }

                                                                        }

                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }

                                                }

                                            }

                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            //VALIDACIÓN FECHA MAYOR
            if (Fecha1.compareTo(Fecha2) > 0 && Fecha1.compareTo(Fecha3) > 0) {
                Fecha1 = Fecha1;

            }
            if (Fecha2.compareTo(Fecha1) > 0 && Fecha2.compareTo(Fecha3) > 0) {
                Fecha1 = Fecha2;
            }
            if (Fecha3.compareTo(Fecha1) > 0 && Fecha3.compareTo(Fecha2) > 0) {
                Fecha1 = Fecha3;
            }
            if (Fecha2.compareTo(Fecha1) < 0 && Fecha2.compareTo(Fecha3) > 0) {
                Fecha2 = Fecha2;
            }
            if (Fecha3.compareTo(Fecha2) < 0 && Fecha3.compareTo(Fecha1) < 0) {
                Fecha3 = Fecha3;
            }

            System.out.print("" + Fecha1 + "\n");
            System.out.print("" + cantidadReportes + "\n");

            if (subNodoResumenEndeudamiento != null && subNodoResumenEndeudamiento.getNodeType() == Node.ELEMENT_NODE) {
                for (int k = 0; k < subNodoResumenEndeudamiento.getChildNodes().getLength(); k++) {
                    if (subNodoResumenEndeudamiento.getChildNodes().item(k).getNodeName().equals("Trimestre")) {
                        subNodoTrimestre = subNodoResumenEndeudamiento.getChildNodes().item(k);
                        if (subNodoTrimestre != null && subNodoTrimestre.getNodeType() == Node.ELEMENT_NODE) {
                            atributoNodoTrimestre = (Element) subNodoTrimestre;
                            fechaTrimestre = atributoNodoTrimestre.getAttribute("fecha");

                            if (Fecha1.equals(fechaTrimestre)) {

                                for (int l = 0; l < subNodoTrimestre.getChildNodes().getLength(); l++) {
                                    if (subNodoTrimestre.getChildNodes().item(l).getNodeName().equals("Sector")) {
                                        subNodoSector = subNodoTrimestre.getChildNodes().item(l);
                                        
                                        if (subNodoSector != null && subNodoSector.getNodeType() == Node.ELEMENT_NODE) {
                                            atributosNodoSector = (Element) subNodoSector;
                                            sector = Integer.parseInt(atributosNodoSector.getAttribute("codigoSector"));
                                            if (sector == 1) {
                                                ContadorCantDeudas = 0;
                                                for (int m = 0; m < subNodoSector.getChildNodes().getLength(); m++) {
                                                    if (subNodoSector.getChildNodes().item(m).getNodeName().equals("Cartera")) {
                                                        subNodoCatera = subNodoSector.getChildNodes().item(m);
                                                        if (subNodoCatera != null) {
                                                            atributosNodoCartera = (Element) subNodoCatera;

                                                            tipoCatera = atributosNodoCartera.getAttribute("tipo");

                                                            if (tipoCatera.equals("Comercial")) {
                                                                numeroDeudasComercial = Integer.parseInt(atributosNodoCartera.getAttribute("numeroCuentas"));
                                                                valorDeudaComercial = Double.parseDouble(atributosNodoCartera.getAttribute("valor"));
                                                               
                                                            }
                                                            if (tipoCatera.equals("Consumo")) {
                                                                numeroDeudasCosumos = Integer.parseInt(atributosNodoCartera.getAttribute("numeroCuentas"));
                                                                valorDeudaConsumo = Double.parseDouble(atributosNodoCartera.getAttribute("valor"));
                                                            }
                                                            if (tipoCatera.equals("Hipotecario")) {
                                                                numeroDeudasVivienda = Integer.parseInt(atributosNodoCartera.getAttribute("numeroCuentas"));
                                                                valorDeudaVivienda = Double.parseDouble(atributosNodoCartera.getAttribute("valor"));
                                                            }
                                                             
                                                             if (tipoCatera.equals("MicrocrÃ©dito")) {
                                                                numeroDeudasMicrocreditos = Integer.parseInt(atributosNodoCartera.getAttribute("numeroCuentas"));
                                                                valordeudaMicrocredito = Double.parseDouble(atributosNodoCartera.getAttribute("valor"));
                                                               System.out.println("CIALCANT: " 
                                                                       + numeroDeudasComercial 
                                                                       + " CONSCANT: " 
                                                                       + numeroDeudasCosumos 
                                                                       + " VIVICANT: " 
                                                                       + numeroDeudasVivienda 
                                                                       + " MICRCANT: " 
                                                                       + numeroDeudasMicrocreditos
                                                                       +" | CIALVLR: " 
                                                                       + valorDeudaComercial 
                                                                       + " CONSVLR: " 
                                                                       + valorDeudaConsumo 
                                                                       + " VIVIVLR: " 
                                                                       + valorDeudaVivienda 
                                                                       + " MICRVLR: " 
                                                                       + valordeudaMicrocredito);
                                                            }
                                                             
                                                            
                                                            
                                                            
                                                        }

                                                    }

                                                }
                                            }
                                            if (sector == 3) {
                                                ContadorCantDeudas = 0;
                                                for (int m = 0; m < subNodoSector.getChildNodes().getLength(); m++) {
                                                    if (subNodoSector.getChildNodes().item(m).getNodeName().equals("Cartera")) {
                                                        subNodoCatera = subNodoSector.getChildNodes().item(m);
                                                        if (subNodoCatera != null) {
                                                            atributosNodoCartera = (Element) subNodoCatera;

                                                            tipoCatera = atributosNodoCartera.getAttribute("tipo");

                                                            if (tipoCatera.equals("Comercial")) {
                                                                numeroDeudasComercial = Integer.parseInt(atributosNodoCartera.getAttribute("numeroCuentas"));
                                                                valorDeudaComercial = Double.parseDouble(atributosNodoCartera.getAttribute("valor"));
                                                               
                                                            }
                                                            if (tipoCatera.equals("Consumo")) {
                                                                numeroDeudasCosumos = Integer.parseInt(atributosNodoCartera.getAttribute("numeroCuentas"));
                                                                valorDeudaConsumo = Double.parseDouble(atributosNodoCartera.getAttribute("valor"));
                                                            }
                                                            if (tipoCatera.equals("Hipotecario")) {
                                                                numeroDeudasVivienda = Integer.parseInt(atributosNodoCartera.getAttribute("numeroCuentas"));
                                                                valorDeudaVivienda = Double.parseDouble(atributosNodoCartera.getAttribute("valor"));
                                                            }
                                                             
                                                             if (tipoCatera.equals("MicrocrÃ©dito")) {
                                                                numeroDeudasMicrocreditos = Integer.parseInt(atributosNodoCartera.getAttribute("numeroCuentas"));
                                                                valordeudaMicrocredito = Double.parseDouble(atributosNodoCartera.getAttribute("valor"));
                                                               System.out.println("CIALCANT: " 
                                                                       + numeroDeudasComercial 
                                                                       + " CONSCANT: " 
                                                                       + numeroDeudasCosumos 
                                                                       + " VIVICANT: " 
                                                                       + numeroDeudasVivienda 
                                                                       + " MICRCANT: " 
                                                                       + numeroDeudasMicrocreditos
                                                                       +" | CIALVLR: " 
                                                                       + valorDeudaComercial 
                                                                       + " CONSVLR: " 
                                                                       + valorDeudaConsumo 
                                                                       + " VIVIVLR: " 
                                                                       + valorDeudaVivienda 
                                                                       + " MICRVLR: " 
                                                                       + valordeudaMicrocredito);
                                                            }
                                                             
                                                            
                                                            
                                                        }

                                                    }

                                                }
                                            }
                                            if (sector == 4) {
                                                ContadorCantDeudas = 0;
                                                for (int m = 0; m < subNodoSector.getChildNodes().getLength(); m++) {
                                                    if (subNodoSector.getChildNodes().item(m).getNodeName().equals("Cartera")) {
                                                        subNodoCatera = subNodoSector.getChildNodes().item(m);
                                                        if (subNodoCatera != null) {
                                                            atributosNodoCartera = (Element) subNodoCatera;

                                                            tipoCatera = atributosNodoCartera.getAttribute("tipo");

                                                            if (tipoCatera.equals("Comercial")) {
                                                                numeroDeudasComercial = Integer.parseInt(atributosNodoCartera.getAttribute("numeroCuentas"));
                                                                valorDeudaComercial = Double.parseDouble(atributosNodoCartera.getAttribute("valor"));
                                                               
                                                            }
                                                            if (tipoCatera.equals("Consumo")) {
                                                                numeroDeudasCosumos = Integer.parseInt(atributosNodoCartera.getAttribute("numeroCuentas"));
                                                                valorDeudaConsumo = Double.parseDouble(atributosNodoCartera.getAttribute("valor"));
                                                            }
                                                            if (tipoCatera.equals("Hipotecario")) {
                                                                numeroDeudasVivienda = Integer.parseInt(atributosNodoCartera.getAttribute("numeroCuentas"));
                                                                valorDeudaVivienda = Double.parseDouble(atributosNodoCartera.getAttribute("valor"));
                                                            }
                                                             
                                                             if (tipoCatera.equals("MicrocrÃ©dito")) {
                                                                numeroDeudasMicrocreditos = Integer.parseInt(atributosNodoCartera.getAttribute("numeroCuentas"));
                                                                valordeudaMicrocredito = Double.parseDouble(atributosNodoCartera.getAttribute("valor"));
                                                               System.out.println("CIALCANT: " 
                                                                       + numeroDeudasComercial 
                                                                       + " CONSCANT: " 
                                                                       + numeroDeudasCosumos 
                                                                       + " VIVICANT: " 
                                                                       + numeroDeudasVivienda 
                                                                       + " MICRCANT: " 
                                                                       + numeroDeudasMicrocreditos
                                                                       +" | CIALVLR: " 
                                                                       + valorDeudaComercial 
                                                                       + " CONSVLR: " 
                                                                       + valorDeudaConsumo 
                                                                       + " VIVIVLR: " 
                                                                       + valorDeudaVivienda 
                                                                       + " MICRVLR: " 
                                                                       + valordeudaMicrocredito);
                                                            }
                                                             
                                                            
                                                            
                                                            
                                                        }

                                                    }

                                                }
                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }

                }

                //EndeudamientoGlobalClasificadoTrimestreUno.add(arreglof);
            }

        }
//        for (Iterator<String[]> iterator = EndeudamientoGlobalClasificadoTrimestreUno.iterator(); iterator.hasNext();) {
//            String[] next = iterator.next();
//            System.out.println("CIAL: " + next[0] + " CONS: " + next[1] + " VIVI: " + next[2] + " MICR: " + next[3]);
//
//        }

        return EndeudamientoGlobalClasificadoTrimestreUno;
    }

}
