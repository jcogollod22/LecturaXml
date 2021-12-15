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
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import modelo.EndeudamientoGlobalClasificadoTrimestre;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Jose Cogollo
 */
public class LecturaEndeudamientoGlobalClasificadoTrimestreUno {

    @SuppressWarnings("empty-statement")
    public ArrayList<String[]> EndeudamientoGlobalClasificadoTrimestre(String fechaTrimestre, String sectorConsulta) throws ParserConfigurationException, SAXException, IOException, ParseException {
        File documentXml1 = new File("C:\\Users\\Jose Cogollo\\OneDrive\\Documentos\\NetBeansProjects\\Pruebaxml\\src\\pruebaxml\\relacionados.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document documentXml = builder.parse(documentXml1);

        ArrayList<String[]> EndeudamientoGlobalClasificadoTrimestreUno = new ArrayList<String[]>();

        Node nodoPrincipal = null;
        Node subNodoEndeudamientoGlobal = null;
        Node subNodoEntidad = null;
        Node subNodoGarantia = null;
        Element atributoNodoEndeudamientoGlobal = null;
        Element atributosNodoEntidad = null;
        Element atributosNodoGarantia = null;

        String fechaRegistro = "";
        Date fechaFormateada;
        String entidadInformante = "";
        String entidadReporta = "";
        String calificacion = "";
        String calificacionVal = "";
        int cantidadTotalcreditos = 0;
        double totalDeudas = 0;
        int numeroCreditos = 0;
        int numeroDeudasComercial = 0;
        int numeroDeudasCosumos = 0;
        int numeroDeudasVivienda = 0;
        int numeroDeudasMicrocreditos = 0;
        double valorCredito = 0;
        double valorDeudaComercial = 0;
        double valorDeudaConsumo = 0;
        double valorDeudaVivienda = 0;
        double valordeudaMicrocredito = 0;

        
        String tipoGarantia = "";
        String tipoGarantiaDescripcion = "";
        String tipoGarantiaReg = "";
        String fechaAvaluo = "";
        double valorAvaluo = 0;
        double valorAvaluoRes = 0;
        String moneda = "";
        String monedaResult = "";
        String sector = "";
        String tipoCredito = "";
        String fuente = "";
        String fuenteResult = "";
        String fuenteHomologada = "";
        String modalidadPago = "";
        String sectorDescripcion = "";

        NodeList nodoPadre = documentXml.getElementsByTagName("Informe");
        nodoPrincipal = nodoPadre.item(0);

        Date date = new Date();
        SimpleDateFormat fomato = new SimpleDateFormat("yyyy-MM-dd");

        if (nodoPrincipal != null && nodoPrincipal.getNodeType() == Node.ELEMENT_NODE) {

            // CONSULTA DE FECHAS
            for (int i = 0; i < nodoPrincipal.getChildNodes().getLength(); i++) {
                if (nodoPrincipal.getChildNodes().item(i).getNodeName().equals("EndeudamientoGlobal")) {
                    subNodoEndeudamientoGlobal = nodoPrincipal.getChildNodes().item(i);
                    if (subNodoEndeudamientoGlobal != null && subNodoEndeudamientoGlobal.getNodeType() == Node.ELEMENT_NODE) {
                        atributoNodoEndeudamientoGlobal = (Element) subNodoEndeudamientoGlobal;

                        for (int j = 0; j < subNodoEndeudamientoGlobal.getChildNodes().getLength(); j++) {

                            numeroCreditos = 0;
                            valorCredito = 0;

                            if (subNodoEndeudamientoGlobal.getChildNodes().item(j).getNodeName().equals("Garantia")) {
                                subNodoGarantia = subNodoEndeudamientoGlobal.getChildNodes().item(j);
                                if (subNodoGarantia != null && subNodoGarantia.getNodeType() == Node.ELEMENT_NODE) {
                                    atributosNodoGarantia = (Element) subNodoGarantia;
                                    tipoGarantiaReg = atributosNodoGarantia.getAttribute("tipo");
                                    valorAvaluoRes = Double.parseDouble(atributosNodoGarantia.getAttribute("valor"));
                                }
                            }

                            if (subNodoEndeudamientoGlobal.getChildNodes().item(j).getNodeName().equals("Entidad")) {
                                subNodoEntidad = subNodoEndeudamientoGlobal.getChildNodes().item(j);
                                if (subNodoEntidad != null && subNodoEntidad.getNodeType() == Node.ELEMENT_NODE) {
                                    atributosNodoEntidad = (Element) subNodoEntidad;

                                    //LIMPIADO DE VARIABLES
                                    numeroDeudasCosumos = 0;
                                    numeroDeudasComercial = 0;
                                    numeroDeudasMicrocreditos = 0;
                                    numeroDeudasVivienda = 0;
                                    valorDeudaConsumo = 0;
                                    valorDeudaComercial = 0;
                                    valordeudaMicrocredito = 0;
                                    valorDeudaVivienda = 0;

                                    sector = atributosNodoEntidad.getAttribute("sector").replace(" ", "");
                                    calificacionVal = atributoNodoEndeudamientoGlobal.getAttribute("calificacion");
                                    tipoCredito = atributoNodoEndeudamientoGlobal.getAttribute("tipoCredito");
                                    numeroCreditos = Integer.parseInt(atributoNodoEndeudamientoGlobal.getAttribute("numeroCreditos"));
                                    valorCredito = Double.parseDouble(atributoNodoEndeudamientoGlobal.getAttribute("saldoPendiente"));
                                    entidadReporta = atributosNodoEntidad.getAttribute("nombre").replace(" ", "").replace("0", "").replace(">", "");
                                    monedaResult = atributoNodoEndeudamientoGlobal.getAttribute("moneda");
                                    fuenteResult = atributoNodoEndeudamientoGlobal.getAttribute("fuente");

                                    //Homologación tabla tipo garantia
                                    switch (tipoGarantiaReg) {
                                        case "0":
                                            tipoGarantiaDescripcion = "SIN GAR";
                                            break;
                                        case "1":
                                            tipoGarantiaDescripcion = "NO IDON";
                                            break;
                                        case "2":
                                            tipoGarantiaDescripcion = "BIENES RAICES";
                                            break;
                                        case "3":
                                            tipoGarantiaDescripcion = "OTR PREND";
                                            break;
                                        case "4":
                                            tipoGarantiaDescripcion = "PIGN RENTA";
                                            break;
                                        case "5":
                                            tipoGarantiaDescripcion = "GAR SOBER NACION";
                                            break;
                                        case "6":
                                            tipoGarantiaDescripcion = "CONT IRREV FIDUC";
                                            break;
                                        case "7":
                                            tipoGarantiaDescripcion = "FNG";
                                            break;
                                        case "8":
                                            tipoGarantiaDescripcion = "CARTA CRÉD";
                                            break;
                                        case "9":
                                            tipoGarantiaDescripcion = "OTR GAR";
                                            break;
                                        case "10":
                                            tipoGarantiaDescripcion = "FAG";
                                            break;
                                        case "11":
                                            tipoGarantiaDescripcion = "PERSONAL";
                                            break;
                                        case "12":
                                            tipoGarantiaDescripcion = "BIEN LEASI NO INMOB";
                                            break;
                                        case "13":
                                            tipoGarantiaDescripcion = "BIEN LEASI INMOB";
                                            break;
                                        case "14":
                                            tipoGarantiaDescripcion = "PRENSA TITULO";
                                            break;
                                        case "15":
                                            tipoGarantiaDescripcion = "DEPOSITOS";
                                            break;
                                        case "16":
                                            tipoGarantiaDescripcion = "SEG CREDITO";
                                            break;
                                        default:
                                            tipoGarantiaDescripcion = "";
                                            break;
                                    }

                                    //Homologación tabla # 46 Tipo de fuente endeudamiento Global
                                    switch (fuenteResult) {
                                        case "S":
                                            fuenteHomologada = "Superintendencia";
                                            break;
                                        case "DC":
                                            fuenteHomologada = "Datacrédito";
                                            break;
                                        default:
                                            fuenteHomologada = "";
                                            break;
                                    }

                                    if (tipoCredito != null && tipoCredito.equals("CMR") && sector.equals(sectorConsulta)) {

                                        entidadInformante = entidadReporta;
                                        calificacion = calificacionVal;
                                        numeroDeudasComercial = numeroCreditos;
                                        valorDeudaComercial = valorCredito;
                                        tipoGarantia = tipoGarantiaDescripcion;
                                        valorAvaluo = valorAvaluoRes;
                                        moneda = monedaResult;
                                        fuente = fuenteHomologada;
                                        modalidadPago = "COMER";

                                    }
                                    if (tipoCredito != null && tipoCredito.equals("HIP") && sector.equals(sectorConsulta)) {

                                        entidadInformante = entidadReporta;
                                        calificacion = calificacionVal;
                                        numeroDeudasVivienda = numeroCreditos;
                                        valorDeudaVivienda = valorCredito;
                                        tipoGarantia = tipoGarantiaDescripcion;
                                        valorAvaluo = valorAvaluoRes;
                                        moneda = monedaResult;
                                        fuente = fuenteHomologada;
                                        modalidadPago = "VIVI";

                                    }
                                    if (tipoCredito != null && tipoCredito.equals("MIC") && sector.equals(sectorConsulta)) {

                                        entidadInformante = entidadReporta;
                                        calificacion = calificacionVal;
                                        numeroDeudasMicrocreditos = numeroCreditos;
                                        valordeudaMicrocredito = valorCredito;
                                        tipoGarantia = tipoGarantiaDescripcion;
                                        valorAvaluo = valorAvaluoRes;
                                        moneda = monedaResult;
                                        fuente = fuenteHomologada;
                                        modalidadPago = "MICRO";

                                    }
                                    if (tipoCredito != null && tipoCredito.equals("CNS") && sector.equals(sectorConsulta)) {

                                        entidadInformante = entidadReporta;
                                        calificacion = calificacionVal;
                                        numeroDeudasCosumos = numeroCreditos;
                                        valorDeudaConsumo = valorCredito;
                                        tipoGarantia = tipoGarantiaDescripcion;
                                        valorAvaluo = valorAvaluoRes;
                                        moneda = monedaResult;
                                        fuente = fuenteHomologada;
                                        modalidadPago = "CONS";

                                    }

                                    fechaRegistro = atributoNodoEndeudamientoGlobal.getAttribute("fechaReporte");
                                    fechaFormateada = fomato.parse(fechaRegistro);
                                    LocalDate localDate = fechaFormateada.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                                    int year = localDate.getYear();
                                    int month = localDate.getMonthValue();

                                    cantidadTotalcreditos = numeroDeudasComercial + numeroDeudasVivienda + numeroDeudasMicrocreditos + numeroDeudasCosumos;
                                    totalDeudas = valorDeudaComercial + valorDeudaVivienda + valordeudaMicrocredito + valorDeudaConsumo;

                                
                                    if (sector.equals(sectorConsulta) && fechaRegistro.equals(fechaTrimestre)) {
                                        //System.out.println("3"+entidadInformante+""+calificacion+""+cantidadTotalcreditos+""+totalDeudas+""+numeroDeudasComercial+""+valorDeudaComercial+""+numeroDeudasVivienda+""+valorDeudaVivienda+""+numeroDeudasCosumos+""+valorDeudaConsumo+""+numeroDeudasMicrocreditos+" "+valordeudaMicrocredito+" "+tipoGarantia+" "+fechaAvaluo+" "+valorAvaluo+" "+moneda+" "+fuente+" "+modalidadPago);
                                        sectorDescripcion = "";
                                        if (sector.equals("1")) {
                                            sectorDescripcion = "Financiero";
                                        }
                                        if (sector.equals("2")) {
                                            sectorDescripcion = "Cooperativo";
                                        }
                                        if (sector.equals("3")) {
                                            sectorDescripcion = "Real";
                                        }
                                        if (sector.equals("4")) {
                                            sectorDescripcion = "Telecomunicaciones";
                                        }

                                        String arreglo[] = {entidadInformante, calificacion, "" + cantidadTotalcreditos, "" + totalDeudas, "" + numeroDeudasComercial, "" + valorDeudaComercial, "" + numeroDeudasVivienda, "" + valorDeudaVivienda, "" + numeroDeudasCosumos, "" + valorDeudaConsumo, "" + numeroDeudasMicrocreditos, "" + valordeudaMicrocredito, tipoGarantia, fechaAvaluo, "" + valorAvaluo, moneda, fuente, modalidadPago, sectorDescripcion};
                                        EndeudamientoGlobalClasificadoTrimestreUno.add(arreglo);

                                    }

                                }

                            }

                        }
                    }
                }
            }

        }
        return EndeudamientoGlobalClasificadoTrimestreUno;
    }

    @SuppressWarnings("empty-statement")
    public ArrayList<String[]> EndeudamientoGlobalClasificadoTrimestreTotales(String fechaTrimestre, String sectorConsulta) throws ParserConfigurationException, SAXException, IOException, ParseException {
        File documentXml1 = new File("C:\\Users\\Jose Cogollo\\OneDrive\\Documentos\\NetBeansProjects\\Pruebaxml\\src\\pruebaxml\\relacionados.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document documentXml = builder.parse(documentXml1);

        ArrayList<String[]> EndeudamientoGlobalClasificadoTrimestreUno = new ArrayList<String[]>();

        Node nodoPrincipal = null;
        Node subNodoEndeudamientoGlobal = null;
        Node subNodoEntidad = null;
        Node subNodoGarantia = null;
        Element atributoNodoEndeudamientoGlobal = null;
        Element atributosNodoEntidad = null;
        Element atributosNodoGarantia = null;

        String fechaRegistro = "";
        Date fechaFormateada;
        String entidadInformante = "";
        String entidadReporta = "";
        String calificacion = "";
        String calificacionVal = "";
        int cantidadTotalcreditos = 0;
        double totalDeudas = 0;
        int numeroCreditos = 0;
        int numeroDeudasComercial = 0;
        int numeroDeudasCosumos = 0;
        int numeroDeudasVivienda = 0;
        int numeroDeudasMicrocreditos = 0;
        double valorCredito = 0;
        double valorDeudaComercial = 0;
        double valorDeudaConsumo = 0;
        double valorDeudaVivienda = 0;
        double valordeudaMicrocredito = 0;
 
        String tipoGarantia = "";
        String tipoGarantiaDescripcion = "";
        String tipoGarantiaReg = "";
        String fechaAvaluo = "";
        double valorAvaluo = 0;
        double valorAvaluoRes = 0;
        String moneda = "";
        String monedaResult = "";
        String nitAct = "";
        String sector = "";
        String tipoCredito = "";
        String fuente = "";
        String fuenteResult = "";
        String fuenteHomologada = "";

        String fechaTrimestreReporte = "";
        int totalCreditos = 0;
        double saldoTotal = 0;
        int totalCreditosComerciales = 0;
        double totalDeudasComerciales = 0;
        int totalCreditosHipotecario = 0;
        double totalDeudasHipotecario = 0;
        int totalCreditosConsumo = 0;
        double totalDeudasConsumo = 0;
        int totalCreditosMicrocredito = 0;
        double totalDeudasMicrocreditos = 0;
        String sectorDescripcion = "";
        int cantidadEntidadesReportan = 0;

        NodeList nodoPadre = documentXml.getElementsByTagName("Informe");
        nodoPrincipal = nodoPadre.item(0);

        SimpleDateFormat fomato = new SimpleDateFormat("yyyy-MM-dd");

        if (nodoPrincipal != null && nodoPrincipal.getNodeType() == Node.ELEMENT_NODE) {

            // CONSULTA DE FECHAS
            for (int i = 0; i < nodoPrincipal.getChildNodes().getLength(); i++) {
                if (nodoPrincipal.getChildNodes().item(i).getNodeName().equals("EndeudamientoGlobal")) {
                    subNodoEndeudamientoGlobal = nodoPrincipal.getChildNodes().item(i);
                    if (subNodoEndeudamientoGlobal != null && subNodoEndeudamientoGlobal.getNodeType() == Node.ELEMENT_NODE) {
                        atributoNodoEndeudamientoGlobal = (Element) subNodoEndeudamientoGlobal;

                        for (int j = 0; j < subNodoEndeudamientoGlobal.getChildNodes().getLength(); j++) {

                            numeroCreditos = 0;
                            valorCredito = 0;

                            if (subNodoEndeudamientoGlobal.getChildNodes().item(j).getNodeName().equals("Garantia")) {
                                subNodoGarantia = subNodoEndeudamientoGlobal.getChildNodes().item(j);
                                if (subNodoGarantia != null && subNodoGarantia.getNodeType() == Node.ELEMENT_NODE) {
                                    atributosNodoGarantia = (Element) subNodoGarantia;
                                    tipoGarantiaReg = atributosNodoGarantia.getAttribute("tipo");
                                    valorAvaluoRes = Double.parseDouble(atributosNodoGarantia.getAttribute("valor"));
                                }
                            }

                            if (subNodoEndeudamientoGlobal.getChildNodes().item(j).getNodeName().equals("Entidad")) {
                                subNodoEntidad = subNodoEndeudamientoGlobal.getChildNodes().item(j);
                                if (subNodoEntidad != null && subNodoEntidad.getNodeType() == Node.ELEMENT_NODE) {
                                    atributosNodoEntidad = (Element) subNodoEntidad;

                                    //LIMPIADO DE VARIABLES
                                    numeroDeudasCosumos = 0;
                                    numeroDeudasComercial = 0;
                                    numeroDeudasMicrocreditos = 0;
                                    numeroDeudasVivienda = 0;
                                    valorDeudaConsumo = 0;
                                    valorDeudaComercial = 0;
                                    valordeudaMicrocredito = 0;
                                    valorDeudaVivienda = 0;

                                    sector = atributosNodoEntidad.getAttribute("sector").replace(" ", "");
                                    calificacionVal = atributoNodoEndeudamientoGlobal.getAttribute("calificacion");
                                    tipoCredito = atributoNodoEndeudamientoGlobal.getAttribute("tipoCredito");
                                    numeroCreditos = Integer.parseInt(atributoNodoEndeudamientoGlobal.getAttribute("numeroCreditos"));
                                    valorCredito = Double.parseDouble(atributoNodoEndeudamientoGlobal.getAttribute("saldoPendiente"));
                                    entidadReporta = atributosNodoEntidad.getAttribute("nombre").replace(" ", "").replace("0", "");
                                    monedaResult = atributoNodoEndeudamientoGlobal.getAttribute("moneda");
                                    fuenteResult = atributoNodoEndeudamientoGlobal.getAttribute("fuente");

                                    //Homologación tabla tipo garantia
                                    switch (tipoGarantiaReg) {
                                        case "0":
                                            tipoGarantiaDescripcion = "SIN GAR";
                                            break;
                                        case "1":
                                            tipoGarantiaDescripcion = "NO IDON";
                                            break;
                                        case "2":
                                            tipoGarantiaDescripcion = "BIENES RAICES";
                                            break;
                                        case "3":
                                            tipoGarantiaDescripcion = "OTR PREND";
                                            break;
                                        case "4":
                                            tipoGarantiaDescripcion = "PIGN RENTA";
                                            break;
                                        case "5":
                                            tipoGarantiaDescripcion = "GAR SOBER NACION";
                                            break;
                                        case "6":
                                            tipoGarantiaDescripcion = "CONT IRREV FIDUC";
                                            break;
                                        case "7":
                                            tipoGarantiaDescripcion = "FNG";
                                            break;
                                        case "8":
                                            tipoGarantiaDescripcion = "CARTA CRÉD";
                                            break;
                                        case "9":
                                            tipoGarantiaDescripcion = "OTR GAR";
                                            break;
                                        case "10":
                                            tipoGarantiaDescripcion = "FAG";
                                            break;
                                        case "11":
                                            tipoGarantiaDescripcion = "PERSONAL";
                                            break;
                                        case "12":
                                            tipoGarantiaDescripcion = "BIEN LEASI NO INMOB";
                                            break;
                                        case "13":
                                            tipoGarantiaDescripcion = "BIEN LEASI INMOB";
                                            break;
                                        case "14":
                                            tipoGarantiaDescripcion = "PRENSA TITULO";
                                            break;
                                        case "15":
                                            tipoGarantiaDescripcion = "DEPOSITOS";
                                            break;
                                        case "16":
                                            tipoGarantiaDescripcion = "SEG CREDITO";
                                            break;
                                        default:
                                            tipoGarantiaDescripcion = "";
                                            break;
                                    }

                                    //Homologación tabla # 46 Tipo de fuente endeudamiento Global
                                    switch (fuenteResult) {
                                        case "S":
                                            fuenteHomologada = "Superintendencia";
                                            break;
                                        case "DC":
                                            fuenteHomologada = "Datacrédito";
                                            break;
                                        default:
                                            fuenteHomologada = "";
                                            break;
                                    }

                                    if (tipoCredito != null && tipoCredito.equals("CMR") && sector.equals(sectorConsulta)) {

                                        entidadInformante = entidadReporta;
                                        calificacion = calificacionVal;
                                        numeroDeudasComercial = numeroCreditos;
                                        valorDeudaComercial = valorCredito;
                                        tipoGarantia = tipoGarantiaDescripcion;
                                        valorAvaluo = valorAvaluoRes;
                                        moneda = monedaResult;
                                        fuente = fuenteHomologada;

                                    }
                                    if (tipoCredito != null && tipoCredito.equals("HIP") && sector.equals(sectorConsulta)) {

                                        entidadInformante = entidadReporta;
                                        calificacion = calificacionVal;
                                        numeroDeudasVivienda = numeroCreditos;
                                        valorDeudaVivienda = valorCredito;
                                        tipoGarantia = tipoGarantiaDescripcion;
                                        valorAvaluo = valorAvaluoRes;
                                        moneda = monedaResult;
                                        fuente = fuenteHomologada;

                                    }
                                    if (tipoCredito != null && tipoCredito.equals("MIC") && sector.equals(sectorConsulta)) {

                                        entidadInformante = entidadReporta;
                                        calificacion = calificacionVal;
                                        numeroDeudasMicrocreditos = numeroCreditos;
                                        valordeudaMicrocredito = valorCredito;
                                        tipoGarantia = tipoGarantiaDescripcion;
                                        valorAvaluo = valorAvaluoRes;
                                        moneda = monedaResult;
                                        fuente = fuenteHomologada;

                                    }
                                    if (tipoCredito != null && tipoCredito.equals("CNS") && sector.equals(sectorConsulta)) {

                                        entidadInformante = entidadReporta;
                                        calificacion = calificacionVal;
                                        numeroDeudasCosumos = numeroCreditos;
                                        valorDeudaConsumo = valorCredito;
                                        tipoGarantia = tipoGarantiaDescripcion;
                                        valorAvaluo = valorAvaluoRes;
                                        moneda = monedaResult;
                                        fuente = fuenteHomologada;

                                    }

                                    nitAct = atributosNodoEntidad.getAttribute("nit");
                                    fechaRegistro = atributoNodoEndeudamientoGlobal.getAttribute("fechaReporte");
                                    fechaFormateada = fomato.parse(fechaRegistro);
                                    LocalDate localDate = fechaFormateada.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                                    int year = localDate.getYear();
                                    int month = localDate.getMonthValue();

                                    cantidadTotalcreditos = numeroDeudasComercial + numeroDeudasVivienda + numeroDeudasMicrocreditos + numeroDeudasCosumos;
                                    totalDeudas = valorDeudaComercial + valorDeudaVivienda + valordeudaMicrocredito + valorDeudaConsumo;

                                    if (sector.equals(sectorConsulta) && fechaRegistro.equals(fechaTrimestre)) {
                                        sectorDescripcion = "";
                                        fechaTrimestreReporte = year + "/" + month;
                                        totalCreditos = totalCreditos + cantidadTotalcreditos;
                                        saldoTotal = saldoTotal + totalDeudas;
                                        totalCreditosComerciales = totalCreditosComerciales + numeroDeudasComercial;
                                        totalDeudasComerciales = totalDeudasComerciales + valorDeudaComercial;
                                        totalCreditosHipotecario = totalCreditosHipotecario + numeroDeudasVivienda;
                                        totalDeudasHipotecario = totalDeudasHipotecario + valorDeudaVivienda;
                                        totalCreditosConsumo = totalCreditosConsumo + numeroDeudasCosumos;
                                        totalDeudasConsumo = totalDeudasConsumo + valorDeudaConsumo;
                                        totalCreditosMicrocredito = totalCreditosMicrocredito + numeroDeudasMicrocreditos;
                                        totalDeudasMicrocreditos = totalDeudasMicrocreditos + valordeudaMicrocredito;
                                        if (sector.equals("1")) {
                                            sectorDescripcion = "Financiero";
                                        }
                                        if (sector.equals("2")) {
                                            sectorDescripcion = "Cooperativo";
                                        }
                                        if (sector.equals("3")) {
                                            sectorDescripcion = "Real";
                                        }
                                        if (sector.equals("4")) {
                                            sectorDescripcion = "Telecomunicaciones";
                                        }
                                        cantidadEntidadesReportan = cantidadEntidadesReportan + 1;

                                    }

                                    
                                }

                            }

                        }
                    }
                }

            }

            if (!sectorDescripcion.equals("")) {
                String arreglo[] = {fechaTrimestreReporte, calificacion, "" + totalCreditos, "" + saldoTotal, "" + totalCreditosComerciales, "" + totalDeudasComerciales, "" + totalCreditosHipotecario, "" + totalDeudasHipotecario, "" + totalCreditosConsumo, "" + totalDeudasConsumo, "" + totalCreditosMicrocredito, "" + totalDeudasMicrocreditos, tipoGarantia, fechaAvaluo, "" + valorAvaluo, moneda, fuente, "" + cantidadEntidadesReportan, sectorDescripcion};
                EndeudamientoGlobalClasificadoTrimestreUno.add(arreglo);
            }

        }
        return EndeudamientoGlobalClasificadoTrimestreUno;
    }

    //PARA CONSULTAR LISTA DE FECHAS 
    @SuppressWarnings("empty-statement")
    public ArrayList<String> EndeudamientoGlobalClasificadoTrimestreFechas() throws ParserConfigurationException, SAXException, IOException, ParseException {
        File documentXml1 = new File("C:\\Users\\Jose Cogollo\\OneDrive\\Documentos\\NetBeansProjects\\Pruebaxml\\src\\pruebaxml\\relacionados.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document documentXml = builder.parse(documentXml1);

        ArrayList<String> FechasReporte = new ArrayList<String>();

        Node nodoPrincipal = null;
        Node subNodoEndeudamientoGlobal = null;
        Element atributoNodoEndeudamientoGlobal = null;

        String fechaRegistro = "";
        Date fechaFormateada;

        
        NodeList nodoPadre = documentXml.getElementsByTagName("Informe");
        nodoPrincipal = nodoPadre.item(0);

        Date date = new Date();
        SimpleDateFormat fomato = new SimpleDateFormat("yyyy-MM-dd");

        if (nodoPrincipal != null && nodoPrincipal.getNodeType() == Node.ELEMENT_NODE) {

            // CONSULTA DE FECHAS
            for (int i = 0; i < nodoPrincipal.getChildNodes().getLength(); i++) {
                if (nodoPrincipal.getChildNodes().item(i).getNodeName().equals("EndeudamientoGlobal")) {
                    subNodoEndeudamientoGlobal = nodoPrincipal.getChildNodes().item(i);
                    if (subNodoEndeudamientoGlobal != null && subNodoEndeudamientoGlobal.getNodeType() == Node.ELEMENT_NODE) {
                        atributoNodoEndeudamientoGlobal = (Element) subNodoEndeudamientoGlobal;

                        fechaRegistro = atributoNodoEndeudamientoGlobal.getAttribute("fechaReporte");
                        fechaFormateada = fomato.parse(fechaRegistro);
                        LocalDate localDate = fechaFormateada.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                        int year = localDate.getYear();
                        int month = localDate.getMonthValue();
                        
                  
                        FechasReporte.add(fechaRegistro);
                        
                    }
                }
            }
        }
        

        return FechasReporte;
    }

}
