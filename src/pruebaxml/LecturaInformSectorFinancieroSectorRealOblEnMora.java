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
public class LecturaInformSectorFinancieroSectorRealOblEnMora {

    public ArrayList<String[]> LecturaSectorfinanaseguradorsolidario() throws ParserConfigurationException, SAXException, IOException {
        File documentXml1 = new File("C:\\Users\\Jose Cogollo\\OneDrive\\Documentos\\NetBeansProjects\\Pruebaxml\\src\\pruebaxml\\relacionados.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document documentXml = builder.parse(documentXml1);

        ArrayList<String[]> Infosectorfinanasegsolidario = new ArrayList<String[]>();

        Node nodoPrincipal = null;
        Node subNodoCuentaCartera = null;
        Node subNodoCaracteristicas = null;
        Node subNodoValores = null;
        Node subNodoEstados = null;
        Node subNodoValor = null;
        Node subNodoEstadoCuenta = null;
        Node subNodoEstadoOrigen = null;
        Node subNodoEstadoPago = null;
        Node subNodoEstadoCuentaTarjetaCredito = null;
        Node subNodoEstadoOrigenTarjetaCredito = null;
        Node subNodoEstadoPagoTarjetaCredito = null;
        Node subNodoTarjetaCredito = null;
        Node subNodoCaracteristicasTarjetasCredito = null;
        Element atributosCuentaCartera = null;
        Element atributosNodoCaracteristicas = null;
        Element atributosNodoCaracteristicasTarjCredito = null;
        Element atributosNodoEstadoPagoTerjetaCredito = null;
        Element AtributosCaracteristicasTarjetasCredito = null;
        Element atributosSubnodoValor = null;
        Element atributosSubnodoValorTotal = null;
        Element atributosEstadoCuenta = null;
        Element atributosEstadoOrigen = null;

        String fechaCorte = "";
        String tipoContrato = "";
        String moda;
        double pade = 0;
        String numeroObligacion = "";
        String estadoObligacion = "";
        String estadoObligacionV = "";
        String tipoEntidad = "";
        String tipoEntidadV = "";
        String calificacionClf = "";
        String calificacion = "";
        String nombreEntidad = "";
        String origenCartera = "";
        String ciudad = "";
        String sucursal = "";
        String calificacionTitular = "";//Ojo no se sabe si este es el nombre
        String estadoTitular = "";
        String estadoTitularV = "";
        String mrcFranquicia = "";
        String mrcFranquiciaV = "";
        String clsClase = "";
        String clsClaseV = "";
        String tipoGarantia = "";
        String tipoGarantiaV = "";
        String cobGaratiaConsumo = "";
        String fechaInicio = "";
        String fechaTerminacion = "";
        int pacCootasPactadas = 0;
        int pagCuotasPagadas = 0;
        int morCuotasenMora = 0;
        String per = "";
        String perV = "";
        double cupoAprobadoVlrInicial = 0;
        double cupoUltilizadoSaldoActual = 0;
        double cupoUltilizadoSaldoActualTotal = 0;
        double pagoMinimoValorCuota = 0;
        String sitObligacionCalidadDeudor;
        String sitObligacionCalidadDeudorV;
        double valorMoraSaldo = 0;
        String natuRes = "";
        String rees = "";
        String reesV = "";
        String NrRee = "";
        int moraMaximaDias = 0;
        String tipoPago = "";
        String tipoPagoV = "";
        String modoExt = "";
        String modoExtV = "";
        String fechaExtincion = "";
        String fechaPermanencia = "";
        String sector = "";
        String sectorTarjCredito = "";
        int estadoPago = 0;
        String estadoPago2 = "";
        int estadoPagoTarjCredito = 0;
        String comportamiento = "";
        String Subtitulo = "";
        int Contador = 0;
       
    

        NodeList nodoPadre = documentXml.getElementsByTagName("Informe");
        nodoPrincipal = nodoPadre.item(0);

        if (nodoPrincipal != null && nodoPrincipal.getNodeType() == Node.ELEMENT_NODE) {

            //TOTALES
            for (int i = 0; i < nodoPrincipal.getChildNodes().getLength(); i++) {
                if (nodoPrincipal.getChildNodes().item(i).getNodeName().equals("CuentaCartera")) {
                    subNodoCuentaCartera = nodoPrincipal.getChildNodes().item(i);
                    if (subNodoCuentaCartera != null && subNodoCuentaCartera.getNodeType() == Node.ELEMENT_NODE) {
                        atributosCuentaCartera = (Element) subNodoCuentaCartera;
                        sector = atributosCuentaCartera.getAttribute("sector");

                        if (sector.equals("3")||sector.equals("4")) {

                            for (int j = 0; j < subNodoCuentaCartera.getChildNodes().getLength(); j++) {
                                if (subNodoCuentaCartera.getChildNodes().item(j).getNodeName().equals("Caracteristicas")) {
                                    subNodoCaracteristicas = subNodoCuentaCartera.getChildNodes().item(j);
                                    if (subNodoCaracteristicas != null && subNodoCaracteristicas.getNodeType() == Node.ELEMENT_NODE) {
                                        atributosNodoCaracteristicas = (Element) subNodoCaracteristicas;

                                    }
                                }
                                if (subNodoCuentaCartera.getChildNodes().item(j).getNodeName().equals("Valores")) {
                                    subNodoValores = subNodoCuentaCartera.getChildNodes().item(j);
                                    if (subNodoValores != null && subNodoValores.getNodeType() == Node.ELEMENT_NODE) {

                                        for (int k = 0; k < subNodoValores.getChildNodes().getLength(); k++) {
                                            subNodoValor = subNodoValores.getChildNodes().item(k);
                                            if (subNodoValor != null && subNodoValor.getNodeType() == Node.ELEMENT_NODE) {
                                                atributosSubnodoValorTotal = (Element) subNodoValor;
                                                
                                            }
                                        }
                                    }

                                }
                                if (subNodoCuentaCartera.getChildNodes().item(j).getNodeName().equals("Estados")) {
                                    subNodoEstados = subNodoCuentaCartera.getChildNodes().item(j);
                                    if (subNodoEstados != null && subNodoEstados.getNodeType() == Node.ELEMENT_NODE) {
                                        for (int l = 0; l < subNodoEstados.getChildNodes().getLength(); l++) {

                                            if (subNodoEstados.getChildNodes().item(l).getNodeName().equals("EstadoPago")) {
                                                subNodoEstadoPago = subNodoEstados.getChildNodes().item(l);
                                                Element AtributosEstadoPago = (Element) subNodoEstadoPago;
                                                estadoPago = Integer.parseInt(AtributosEstadoPago.getAttribute("codigo"));
                                                if (estadoPago>=13 && estadoPago<=47) {
                                                    cupoUltilizadoSaldoActualTotal = cupoUltilizadoSaldoActualTotal + Double.parseDouble(atributosSubnodoValorTotal.getAttribute("saldoActual"));
                                                   
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

            for (int i = 0; i < nodoPrincipal.getChildNodes().getLength(); i++) {
                if (nodoPrincipal.getChildNodes().item(i).getNodeName().equals("CuentaCartera")) {
                    subNodoCuentaCartera = nodoPrincipal.getChildNodes().item(i);
                    if (subNodoCuentaCartera != null && subNodoCuentaCartera.getNodeType() == Node.ELEMENT_NODE) {
                        atributosCuentaCartera = (Element) subNodoCuentaCartera;
                        sector = atributosCuentaCartera.getAttribute("sector");

                        if (sector.equals("3")||sector.equals("4")) {

                            for (int j = 0; j < subNodoCuentaCartera.getChildNodes().getLength(); j++) {
                                if (subNodoCuentaCartera.getChildNodes().item(j).getNodeName().equals("Caracteristicas")) {
                                    subNodoCaracteristicas = subNodoCuentaCartera.getChildNodes().item(j);
                                    if (subNodoCaracteristicas != null && subNodoCaracteristicas.getNodeType() == Node.ELEMENT_NODE) {
                                        atributosNodoCaracteristicas = (Element) subNodoCaracteristicas;

                                    }
                                }
                                if (subNodoCuentaCartera.getChildNodes().item(j).getNodeName().equals("Valores")) {
                                    subNodoValores = subNodoCuentaCartera.getChildNodes().item(j);
                                    if (subNodoValores != null && subNodoValores.getNodeType() == Node.ELEMENT_NODE) {

                                        for (int k = 0; k < subNodoValores.getChildNodes().getLength(); k++) {
                                            subNodoValor = subNodoValores.getChildNodes().item(k);
                                            if (subNodoValor != null && subNodoValor.getNodeType() == Node.ELEMENT_NODE) {
                                                atributosSubnodoValor = (Element) subNodoValor;

                                            }
                                        }
                                    }

                                }
                                if (subNodoCuentaCartera.getChildNodes().item(j).getNodeName().equals("Estados")) {
                                    subNodoEstados = subNodoCuentaCartera.getChildNodes().item(j);
                                    if (subNodoEstados != null && subNodoEstados.getNodeType() == Node.ELEMENT_NODE) {
                                        for (int l = 0; l < subNodoEstados.getChildNodes().getLength(); l++) {
                                            if (subNodoEstados.getChildNodes().item(l).getNodeName().equals("EstadoCuenta")) {
                                                subNodoEstadoPago = subNodoEstados.getChildNodes().item(l);
                                                atributosEstadoCuenta = (Element) subNodoEstadoPago;
                                            }
                                            if (subNodoEstados.getChildNodes().item(l).getNodeName().equals("EstadoOrigen")) {
                                                subNodoEstadoOrigen = subNodoEstados.getChildNodes().item(l);
                                                atributosEstadoOrigen = (Element) subNodoEstadoOrigen;
                                            }
                                            if (subNodoEstados.getChildNodes().item(l).getNodeName().equals("EstadoPago")) {
                                                subNodoEstadoPago = subNodoEstados.getChildNodes().item(l);
                                                Element AtributosEstadoPago = (Element) subNodoEstadoPago;
                                                estadoPago = Integer.parseInt(AtributosEstadoPago.getAttribute("codigo"));
                                                if (estadoPago>=13 && estadoPago<=47) {
                                                    
                                                    fechaCorte = AtributosEstadoPago.getAttribute("fecha");
                                                    tipoContrato = atributosNodoCaracteristicas.getAttribute("tipoCuenta");
                                                    moda = atributosNodoCaracteristicas.getAttribute("tipoCuenta");

                                                    numeroObligacion = atributosCuentaCartera.getAttribute("numero");
                                                    estadoObligacionV = atributosEstadoCuenta.getAttribute("codigo");
                                                    tipoEntidadV = atributosCuentaCartera.getAttribute("sector");
                                                    cobGaratiaConsumo = "";//Segun correo del 19-10-2021 enviado por Kenneth Vega manifiesta que En el XML no se encuentra el porcentaje que cubre la garantía en la cuenta del registro 
                                                    natuRes = "";//En correo manifestaron que queda en blanco por que no se encuentra en el archivo además Falta tabla 29
                                                    reesV = atributosEstadoOrigen.getAttribute("codigo");
                                                    modoExtV = AtributosEstadoPago.getAttribute("codigo");
                                                    fechaPermanencia = "";//No se encuentra en la ruta del XML según correo
                                                    NrRee = "";//Segpun correo por temas normativos o se permite ver cuantas veces una cuenta ha sido restructurada por lo tanto queda vacío.
                                                    ciudad = atributosCuentaCartera.getAttribute("ciudad");
                                                    calificacion = atributosCuentaCartera.getAttribute("calificacion");
                                                    nombreEntidad = atributosCuentaCartera.getAttribute("entidad");
                                                    sucursal = atributosCuentaCartera.getAttribute("oficina");
                                                    origenCartera = atributosCuentaCartera.getAttribute("entidad");
                                                    estadoTitularV = atributosNodoCaracteristicas.getAttribute("calidadDeudor");
                                                    tipoGarantiaV = atributosNodoCaracteristicas.getAttribute("garantia");//Se deberia homolgar con tabla 11 pero Falta tabla 11 segun correo se homologa con tabla 49
                                                    fechaInicio = atributosCuentaCartera.getAttribute("fechaApertura");
                                                    fechaTerminacion = atributosCuentaCartera.getAttribute("fechaVencimiento");
                                                    pacCootasPactadas = Integer.parseInt(atributosSubnodoValor.getAttribute("totalCuotas"));
                                                    pagCuotasPagadas = Integer.parseInt(atributosSubnodoValor.getAttribute("cuotasCanceladas"));
                                                    morCuotasenMora = Integer.parseInt(atributosSubnodoValor.getAttribute("cuotasMora"));
                                                    cupoAprobadoVlrInicial = Double.parseDouble(atributosSubnodoValor.getAttribute("valorInicial"));
                                                    cupoUltilizadoSaldoActual = Double.parseDouble(atributosSubnodoValor.getAttribute("saldoActual"));
                                                    pade = (cupoUltilizadoSaldoActual / cupoUltilizadoSaldoActualTotal) * 100;
                                                    if (pade > 0 && pade <= 1) {
                                                        pade = 1;
                                                    } else {
                                                        pade = Math.round((cupoUltilizadoSaldoActual / cupoUltilizadoSaldoActualTotal) * 100.0);
                                                    }

                                                    pagoMinimoValorCuota = Double.parseDouble(atributosSubnodoValor.getAttribute("cuota"));
                                                    sitObligacionCalidadDeudorV = atributosNodoCaracteristicas.getAttribute("calidadDeudor");
                                                    valorMoraSaldo = Double.parseDouble(atributosSubnodoValor.getAttribute("saldoMora"));
                                                    moraMaximaDias = Integer.parseInt(atributosSubnodoValor.getAttribute("diasMora"));
                                                    perV = atributosSubnodoValor.getAttribute("periodicidad");
                                                    tipoPagoV = atributosCuentaCartera.getAttribute("formaPago");
                                                    fechaExtincion = atributosCuentaCartera.getAttribute("fechaVencimiento");
                                                    comportamiento = atributosCuentaCartera.getAttribute("comportamiento").replace("N"," |N").replace("-"," |");

                                                    //Homologación tabla #14 Calificación de Tarjetas de crédito y cuentas cartera
                                                    switch (calificacion) {
                                                        case "1":
                                                            calificacionClf = "A";
                                                            break;
                                                        case "2":
                                                            calificacionClf = "B";
                                                            break;
                                                        case "3":
                                                            calificacionClf = "C";
                                                            break;
                                                        case "4":
                                                            calificacionClf = "D";
                                                            break;
                                                        case "5":
                                                            calificacionClf = "E";
                                                            break;
                                                        case "6":
                                                            calificacionClf = "AA";
                                                            break;
                                                        case "7":
                                                            calificacionClf = "BB";
                                                            break;
                                                        case "8":
                                                            calificacionClf = "CC";
                                                            break;
                                                        case "9":
                                                            calificacionClf = "K";
                                                            break;
                                                        default:
                                                            calificacionClf = "";
                                                            break;
                                                    }

                                                    //Homologación tabla #6 Códigos del Garante
                                                    switch (estadoTitularV) {
                                                        case "00":
                                                            estadoTitular = "Deudor Principal";
                                                            break;
                                                        case "01":
                                                            estadoTitular = "Codeudor";
                                                            break;
                                                        case "03":
                                                            estadoTitular = "Codeudor";
                                                            break;
                                                        case "04":
                                                            estadoTitular = "Avalista";
                                                            break;
                                                        case "05":
                                                            estadoTitular = "Deudor solidario";
                                                            break;
                                                        case "06":
                                                            estadoTitular = "Coarrendatario";
                                                            break;
                                                        case "07":
                                                            estadoTitular = "Otros Garantes";
                                                            break;
                                                        case "08":
                                                            estadoTitular = "Fiador";
                                                            break;
                                                        case "09":
                                                            estadoTitular = "No Aplica";
                                                            break;
                                                        case "95":
                                                            estadoTitular = "No Aplica";
                                                            break;
                                                        case "96":
                                                            estadoTitular = "Cotitular";
                                                            break;
                                                        case "97":
                                                            estadoTitular = "Comunal";
                                                            break;
                                                        case "98":
                                                            estadoTitular = "No Aplica";
                                                            break;
                                                        case "99":
                                                            estadoTitular = "No Aplica";
                                                            break;
                                                        default:
                                                            estadoTitular = "";
                                                            break;
                                                    }

                                                    //Homologación tabla #6 Códigos del Garante
                                                    switch (sitObligacionCalidadDeudorV) {
                                                        case "00":
                                                            sitObligacionCalidadDeudor = "Deudor Principal";
                                                            break;
                                                        case "01":
                                                            sitObligacionCalidadDeudor = "Codeudor";
                                                            break;
                                                        case "03":
                                                            sitObligacionCalidadDeudor = "Codeudor";
                                                            break;
                                                        case "04":
                                                            sitObligacionCalidadDeudor = "Avalista";
                                                            break;
                                                        case "05":
                                                            sitObligacionCalidadDeudor = "Deudor solidario";
                                                            break;
                                                        case "06":
                                                            sitObligacionCalidadDeudor = "Coarrendatario";
                                                            break;
                                                        case "07":
                                                            sitObligacionCalidadDeudor = "Otros Garantes";
                                                            break;
                                                        case "08":
                                                            sitObligacionCalidadDeudor = "Fiador";
                                                            break;
                                                        case "09":
                                                            sitObligacionCalidadDeudor = "No Aplica";
                                                            break;
                                                        case "95":
                                                            sitObligacionCalidadDeudor = "No Aplica";
                                                            break;
                                                        case "96":
                                                            sitObligacionCalidadDeudor = "Cotitular";
                                                            break;
                                                        case "97":
                                                            sitObligacionCalidadDeudor = "Comunal";
                                                            break;
                                                        case "98":
                                                            sitObligacionCalidadDeudor = "No Aplica";
                                                            break;
                                                        case "99":
                                                            sitObligacionCalidadDeudor = "No Aplica";
                                                            break;
                                                        default:
                                                            sitObligacionCalidadDeudor = "";
                                                            break;
                                                    }

                                                    //Homologación tabla #7 Modalidad de pago
                                                    switch (perV) {
                                                        case "0":
                                                            per = "No informó";
                                                            break;
                                                        case "1":
                                                            per = "Mensual";
                                                            break;
                                                        case "2":
                                                            per = "Bimensual";
                                                            break;
                                                        case "3":
                                                            per = "Trimestral";
                                                            break;
                                                        case "4":
                                                            per = "Semestral";
                                                            break;
                                                        case "5":
                                                            per = "Anual";
                                                            break;
                                                        case "6":
                                                            per = "Al vencimiento";
                                                            break;
                                                        case "9":
                                                            per = "Otro";
                                                            break;
                                                        default:
                                                            per = "";
                                                            break;
                                                    }

                                                    //Homologación tabla #48 Código Sector
                                                    switch (tipoEntidadV) {
                                                        case "1":
                                                            tipoEntidad = "Financiero";
                                                            break;
                                                        case "2":
                                                            tipoEntidad = "Cooperativo";
                                                            break;
                                                        case "3":
                                                            tipoEntidad = "Real";
                                                            break;
                                                        case "4":
                                                            tipoEntidad = "Telecomunicaciones";
                                                            break;

                                                        default:
                                                            tipoEntidad = "";
                                                            break;
                                                    }

                                                    //Homologación tabla #43 Estado de la cuenta
                                                    switch (estadoObligacionV) {
                                                        case "00":
                                                            estadoObligacion = "Entidad no reportó";
                                                            break;
                                                        case "01":
                                                            estadoObligacion = "Al día";
                                                            break;
                                                        case "02":
                                                            estadoObligacion = "En Mora";
                                                            break;
                                                        case "03":
                                                            estadoObligacion = "Pago Total";
                                                            break;
                                                        case "04":
                                                            estadoObligacion = "Pago Judicial";
                                                            break;
                                                        case "05":
                                                            estadoObligacion = "Dudoso Recaudo";
                                                            break;
                                                        case "06":
                                                            estadoObligacion = "Castigada";
                                                            break;
                                                        case "07":
                                                            estadoObligacion = "Dación en pago";
                                                            break;
                                                        case "08":
                                                            estadoObligacion = "Cancelada Voluntariamente";
                                                            break;
                                                        case "09":
                                                            estadoObligacion = "Cancelada por mal manejo";
                                                            break;
                                                        case "10":
                                                            estadoObligacion = "Prescripción";
                                                            break;
                                                        case "11":
                                                            estadoObligacion = "Cancelada por la entidad";
                                                            break;
                                                        case "12":
                                                            estadoObligacion = "Cancelada por reestructuración/refinanciación";
                                                            break;
                                                        case "13":
                                                            estadoObligacion = "Cancelada por venta";
                                                            break;
                                                        case "14":
                                                            estadoObligacion = "Insoluta";
                                                            break;
                                                        case "15":
                                                            estadoObligacion = "Cancelada por siniestro";
                                                            break;
                                                        case "16":
                                                            estadoObligacion = "Cancelada por Liquidación Patrimonial";
                                                            break;

                                                        default:
                                                            estadoObligacion = "";
                                                            break;
                                                    }

                                                    //Homologación tabla #44 Estado de Origen
                                                    switch (reesV) {
                                                        case "0":
                                                            rees = "Normal. Creación por apertura";
                                                            break;
                                                        case "1":
                                                            rees = "Reestructurada";
                                                            break;
                                                        case "2":
                                                            rees = "Refinanciada";
                                                            break;
                                                        case "3":
                                                            rees = "Transferida de otro producto";
                                                            break;
                                                        case "4":
                                                            rees = "Comprada";
                                                            break;

                                                        default:
                                                            rees = "";
                                                            break;
                                                    }

                                                    //Homologación tabla #49 De garantías endeudamiento global clasificado
                                                    switch (tipoGarantiaV) {
                                                        case "0":
                                                            tipoGarantia = "Sin Gar";
                                                            break;
                                                        case "1":
                                                            tipoGarantia = "No Idóneo";
                                                            break;
                                                        case "2":
                                                            tipoGarantia = "Bienes raices";
                                                            break;
                                                        case "3":
                                                            tipoGarantia = "Otr Prend";
                                                            break;
                                                        case "4":
                                                            tipoGarantia = "Pign Renta";
                                                            break;
                                                        case "5":
                                                            tipoGarantia = "Gar Sober Nación";
                                                            break;
                                                        case "6":
                                                            tipoGarantia = "Cont Irrev Fiduc";
                                                            break;
                                                        case "7":
                                                            tipoGarantia = "Fing";
                                                            break;
                                                        case "8":
                                                            tipoGarantia = "Carta Crédito";
                                                            break;
                                                        case "9":
                                                            tipoGarantia = "Otr Gar";
                                                            break;
                                                        case "10":
                                                            tipoGarantia = "Fag";
                                                            break;
                                                        case "11":
                                                            tipoGarantia = "Personal";
                                                            break;
                                                        case "12":
                                                            tipoGarantia = "Bien Leasi No Inmob";
                                                            break;
                                                        case "13":
                                                            tipoGarantia = "Bien Leasi Inmob";
                                                            break;
                                                        case "14":
                                                            tipoGarantia = "Prenda Titulo";
                                                            break;
                                                        case "15":
                                                            tipoGarantia = "Depósitos";
                                                            break;
                                                        case "16":
                                                            tipoGarantia = "Seg Créditos";
                                                            break;

                                                        default:
                                                            tipoGarantia = "";
                                                            break;
                                                    }

                                                    //Homologación tabla #18 Forma de pago total cartera
                                                    switch (tipoPagoV) {
                                                        case "0":
                                                            tipoPago = "Vigente";
                                                            break;
                                                        case "1":
                                                            tipoPago = "Proceso ejecutivo";
                                                            break;
                                                        case "2":
                                                            tipoPago = "Bienes raices";
                                                            break;
                                                        case "3":
                                                            tipoPago = "Mandamiento de pago";
                                                            break;
                                                        case "4":
                                                            tipoPago = "Reestructuración";
                                                            break;
                                                        case "5":
                                                            tipoPago = "Dación en pago";
                                                            break;
                                                        case "6":
                                                            tipoPago = "Cesión";
                                                            break;
                                                        case "7":
                                                            tipoPago = "Donación";
                                                            break;
                                                        case "8":
                                                            tipoPago = "Insoluta";
                                                            break;
                                                        case "9":
                                                            tipoPago = "Prescrita";
                                                            break;

                                                        default:
                                                            tipoPago = "";
                                                            break;
                                                    }
                                                   
                                                     //Homologación tabla #4 Estados de pago para Tarjeta/Cartera
                                                    switch (modoExtV) {
                                                        case "00":
                                                            modoExt = "NO DISPONBLE";
                                                            break;
                                                        case "01":
                                                            modoExt = "AL DIA";
                                                            break;
                                                        case "02":
                                                            modoExt = "T NO ENTREGADA";
                                                            break;
                                                        case "03":
                                                            modoExt = "CANCEL. MM";
                                                            break;
                                                        case "04":
                                                            modoExt = "T.ROBADA";
                                                            break;
                                                        case "05":
                                                            modoExt = "CANCELADA VOL.";
                                                            break;
                                                        case "06":
                                                            modoExt = "CANCELADA MX";
                                                            break;
                                                        case "07":
                                                            modoExt = "T.EXTRAVIADA";
                                                            break;
                                                        case "08":
                                                            modoExt = "PAGO VOL";
                                                            break;
                                                        case "09":
                                                            modoExt = "PAGO VOL.MX 30";
                                                            break;
                                                        case "10":
                                                            modoExt = "PAGO VOL MX 60";
                                                            break;
                                                          case "11":
                                                            modoExt = "PAGO VOL MX 90";
                                                            break;
                                                        case "12":
                                                            modoExt = "PAGO COL MX 120";
                                                            break;
                                                        case "19":
                                                            modoExt = "ESTA EN MORA 90";
                                                            break;
                                                        case "20":
                                                            modoExt = "ESTA EN MORA 120";
                                                            break;
                                                        case "21":
                                                            modoExt = "FM 60 ESTA M 30";
                                                            break;
                                                        case "22":
                                                            modoExt = "FM 90 ESTA M 30";
                                                            break;
                                                        case "23":
                                                            modoExt = "FM 90 ESTA M 60";
                                                            break;
                                                        case "24":
                                                            modoExt = "FM 120 ESTA M 30";
                                                            break;
                                                        case "25":
                                                            modoExt = "FM 120 ESTA M 60";
                                                            break;
                                                        case "26":
                                                            modoExt = "FM 120 ESTA M 90";
                                                            break;
                                                        case "27":
                                                            modoExt = "RM 30 ESTA M 60";
                                                            break;
                                                         case "28":
                                                            modoExt = "RM 30 ESTA M 90";
                                                            break;
                                                          case "29":
                                                            modoExt = "RM 30 ESTA M 120";
                                                            break;
                                                        case "30":
                                                            modoExt = "RM 60 ESTA M 30";
                                                            break;
                                                        case "31":
                                                            modoExt = "RM 60 ESTA M 60";
                                                            break;
                                                        case "32":
                                                            modoExt = "RM 60 ESTA M 90";
                                                            break;
                                                        case "33":
                                                            modoExt = "RM 60 ESTA M 120";
                                                            break;
                                                        case "34":
                                                            modoExt = "RM 90 ESTA M 30";
                                                            break;
                                                        case "35":
                                                            modoExt = "RM 90 ESTA M 60";
                                                            break;
                                                        case "36":
                                                            modoExt = "RM 90 ESTA M 90";
                                                            break;
                                                        case "37":
                                                            modoExt = "RM 90 ESTA M 120";
                                                            break;
                                                        case "38":
                                                            modoExt = "RM 120 ESTA M 30";
                                                            break;
                                                        case "39":
                                                            modoExt = "RM 120 ESTA M 60";
                                                            break;

                                                        default:
                                                            modoExt = "";
                                                            break;
                                                    }
                                                    
                                                    
                                                    if (Contador == 0) {
                                                        Subtitulo = "**OBLIGACIONES EN MORA";
                                                    } else {
                                                        Subtitulo = "";
                                                    }
                                                   

                                                    String[] arreglo = {fechaCorte,
                                                        tipoContrato,
                                                        "" + pade,
                                                        moda,
                                                        numeroObligacion,
                                                        estadoObligacion,
                                                        tipoEntidad,
                                                        clsClase,
                                                        nombreEntidad,
                                                        ciudad,
                                                        sucursal,
                                                        estadoTitular,
                                                        mrcFranquicia,
                                                        clsClase,
                                                        tipoGarantia,
                                                        cobGaratiaConsumo,
                                                        fechaInicio,
                                                        fechaTerminacion,
                                                        "" + pacCootasPactadas,
                                                        "" + pagCuotasPagadas,
                                                        "" + morCuotasenMora,
                                                        per,
                                                        "" + cupoAprobadoVlrInicial,
                                                        "" + cupoUltilizadoSaldoActual,
                                                        "" + pagoMinimoValorCuota,
                                                        sitObligacionCalidadDeudor,
                                                        "" + valorMoraSaldo,
                                                        natuRes,
                                                        rees,
                                                        NrRee,
                                                        "" + moraMaximaDias,
                                                        tipoPago,
                                                        modoExt,
                                                        fechaExtincion,
                                                        fechaPermanencia,
                                                        comportamiento,
                                                        calificacionClf,
                                                        Subtitulo};
                                                    //String[] arreglo = {Columna1,Columna2,Columna3,Columna4,Columna5,Columna6,Columna7,Columna8,Columna9,Columna10,Columna11,Columna12,Columna13,Columna14,Columna15,Columna16,Columna17,Columna18,Columna19};
                                                    //System.out.println((Columna1+", "+Columna2+" "+Columna3+" "+Columna4+" "+Columna5+" "+Columna6+" "+Columna7+" "+Columna8+" "+Columna9+" "+Columna10+" "+Columna11+" "+Columna12+" "+Columna13+" "+Columna14+" "+Columna15+" "+Columna16+" "+Columna17+" "+Columna18));
                                                    Infosectorfinanasegsolidario.add(arreglo);
                                                    Contador = Contador + 1;
                                                }

                                            }

                                        }

                                    }

                                }
                            }
                        }
                    }

                }
                if (nodoPrincipal.getChildNodes().item(i).getNodeName().equals("TarjetaCredito")) {
                    subNodoTarjetaCredito = nodoPrincipal.getChildNodes().item(i);
                    if (subNodoTarjetaCredito != null && subNodoTarjetaCredito.getNodeType() == Node.ELEMENT_NODE) {
                        atributosNodoCaracteristicasTarjCredito = (Element) subNodoTarjetaCredito;
                        sectorTarjCredito = atributosNodoCaracteristicasTarjCredito.getAttribute("sector");
                        if (sectorTarjCredito.equals("3")||sectorTarjCredito.equals("4")) {
                            for (int j = 0; j < subNodoTarjetaCredito.getChildNodes().getLength(); j++) {
                                if (subNodoTarjetaCredito.getChildNodes().item(j).getNodeName().equals("Caracteristicas")) {
                                    subNodoCaracteristicasTarjetasCredito = subNodoTarjetaCredito.getChildNodes().item(j);
                                    AtributosCaracteristicasTarjetasCredito = (Element) subNodoCaracteristicasTarjetasCredito;

                                }
                                if (subNodoTarjetaCredito.getChildNodes().item(j).getNodeName().equals("Valores")) {

                                }
                                if (subNodoTarjetaCredito.getChildNodes().item(j).getNodeName().equals("Estados")) {

                                    for (int k = 0; k < subNodoTarjetaCredito.getChildNodes().getLength(); k++) {
                                        subNodoEstadoCuentaTarjetaCredito = subNodoTarjetaCredito.getChildNodes().item(j);
                                        if (subNodoEstadoCuentaTarjetaCredito != null && subNodoEstadoCuentaTarjetaCredito.getNodeType() == Node.ELEMENT_NODE) {

                                            if (subNodoEstadoCuentaTarjetaCredito.getChildNodes().item(k).getNodeName().equals("EstadoCuenta")) {

                                            }
                                            if (subNodoEstadoCuentaTarjetaCredito.getChildNodes().item(k).getNodeName().equals("EstadoOrigen")) {

                                            }
                                            if (subNodoEstadoCuentaTarjetaCredito.getChildNodes().item(k).getNodeName().equals("EstadoPago")) {
                                                subNodoEstadoPagoTarjetaCredito = subNodoEstadoCuentaTarjetaCredito.getChildNodes().item(k);
                                                atributosNodoEstadoPagoTerjetaCredito = (Element) subNodoEstadoPagoTarjetaCredito;
                                                estadoPagoTarjCredito = Integer.parseInt(atributosNodoEstadoPagoTerjetaCredito.getAttribute("codigo"));

                                                if (estadoPagoTarjCredito>=13 && estadoPagoTarjCredito<=47) {

                                                    mrcFranquiciaV = AtributosCaracteristicasTarjetasCredito.getAttribute("franquicia");
                                                    clsClaseV = AtributosCaracteristicasTarjetasCredito.getAttribute("clase");

                                                    //Homologación tabla #39 Franquicia de tarjeta de Crédito
                                                    switch (mrcFranquiciaV) {
                                                        case "0":
                                                            mrcFranquicia = "No reportado";
                                                            break;
                                                        case "":
                                                            mrcFranquicia = "No reportado";
                                                            break;
                                                        case "1":
                                                            mrcFranquicia = "American Express";
                                                            break;
                                                        case "2":
                                                            mrcFranquicia = "Visa";
                                                            break;
                                                        case "3":
                                                            mrcFranquicia = "Master Card";
                                                            break;
                                                        case "4":
                                                            mrcFranquicia = "Diners";
                                                            break;
                                                        case "5":
                                                            mrcFranquicia = "Privada";
                                                            break;
                                                        default:
                                                            mrcFranquicia = "";
                                                            break;
                                                    }

                                                    //Homologación tabla #40 Clase de tarjeta de Crédito
                                                    switch (clsClaseV) {
                                                        case "0":
                                                            clsClase = "No reportado";
                                                            break;
                                                        case "":
                                                            clsClase = "No reportado";
                                                            break;
                                                        case "1":
                                                            clsClase = "Clásica";
                                                            break;
                                                        case "2":
                                                            clsClase = "Gold";
                                                            break;
                                                        case "3":
                                                            clsClase = "Platinum";
                                                            break;
                                                        case "4":
                                                            clsClase = "Otra";
                                                            break;

                                                        default:
                                                            clsClase = "";
                                                            break;
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
        for (Iterator<String[]> iterator = Infosectorfinanasegsolidario.iterator(); iterator.hasNext();) {
            String[] next = iterator.next();
            //System.out.println(next[0]+"*******"+next[1]);
        }
       
        if (Infosectorfinanasegsolidario.isEmpty()) {
            String[] arreglo = {fechaCorte,
                tipoContrato,
                "" + pade,
                moda = "",
                numeroObligacion,
                estadoObligacion,
                tipoEntidad,
                clsClase,
                nombreEntidad,
                ciudad,
                sucursal,
                estadoTitular,
                mrcFranquicia,
                clsClase,
                tipoGarantia,
                cobGaratiaConsumo,
                fechaInicio,
                fechaTerminacion,
                "" + pacCootasPactadas,
                "" + pagCuotasPagadas,
                "" + morCuotasenMora,
                per,
                "" + cupoAprobadoVlrInicial,
                "" + cupoUltilizadoSaldoActual,
                "" + pagoMinimoValorCuota,
                sitObligacionCalidadDeudor = "",
                "" + valorMoraSaldo,
                natuRes,
                rees,
                NrRee,
                "" + moraMaximaDias,
                tipoPago,
                modoExt,
                fechaExtincion,
                fechaPermanencia,
                comportamiento,
                calificacionClf,
                Subtitulo = "**OBLIGACIONES EN MORA"};

            Infosectorfinanasegsolidario.add(arreglo);
        }
        return Infosectorfinanasegsolidario;
    }

}
