/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaxml;

import java.io.File;
import modelo.Informaciondatacredito;
import java.io.IOException;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import java.net.URL;
import java.sql.Array;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Iterator;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import jdk.nashorn.internal.objects.NativeArray;
import modelo.Informedetallado;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


/**
 *
 * @author Jose Cogollo
 */
public class Lecturaserfi {

    public static void main(String[] args) throws ParserConfigurationException,
            SAXException, IOException {

                 File documentXml1 = new File("C:\\Users\\Jose Cogollo\\OneDrive\\Documentos\\NetBeansProjects\\Pruebaxml\\src\\pruebaxml\\relacionados.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document documentXml = builder.parse(documentXml1);

        //NodeList nodeList = document.getDocumentElement().getChildNodes();
        /*
        NodeList nodeList = documentXml.getDocumentElement().getElementsByTagName("Impuestos");
        double suma = 0;
        int cant = 0;
        String Id = "";
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node != null && node.getNodeType() == Node.ELEMENT_NODE) {
                Element elem = (Element) node;
                Id = elem.getAttribute("tipoimpuesto");

                if (Id.equals("Principal")) {

                    NodeList impuesto = documentXml.getDocumentElement().getElementsByTagName("Impuesto");
                    Node resultimpuesto = impuesto.item(i);
                    if (resultimpuesto != null && resultimpuesto.getNodeType() == Node.ELEMENT_NODE) {
                        Element element2 = (Element) resultimpuesto;

                        String valor = element2.getAttribute("Base");

                        suma = suma + Double.parseDouble(valor);
                        if (Double.parseDouble(valor) > 0) {
                            cant = cant + 1;
                        }
                    }
                }

            }

        }
*/
       //VARIABLES PARA DATOS INFORMACION COMERCIAL
        
       Informaciondatacredito a = new Informaciondatacredito();
    
        String Nombreraiz = "";
        String Tipoidentificacion = "";
        String Identificacion = "";
        String Razonsocial = "";
        String Actividadeconomica = "";
        String Estadodocumento = "";
        String Fechaexpedicion = "";
        String Lugarexpedicion = "";
        String Edadminima = "";
        String Edadmaxima = "";
        String Rangoedad = "";
        String Fecha = "";
        String Horaconsulta = "";
        String Fechaconsulta = "";
        String Usuarioconsulta = "COMF SERFINANSA-SERVICIOS FINANCIEROS";
        String Nomerodeinforme = "";
        
        //VARIABLES PARA SCORE
        
        String Score = "";

        /*VARIABLES PARA RESUMEN ENDEUDAMIENTO COMO PRINCIPAL
        SECCION TOTALES(CANTIDAD Y SALDO TOTAL*/
        int TarjcreditoCantTotalesPpal = 0;
        double TarjcreditoSaldoTotalesPpal = 0;
        int SectorFinanCantTotalesPpal = 0;
        double SectorFinanSaldoTotalesPpal = 0;
        int SectorSolidCantTotalesPpal = 0;
        double SectorSolidSaldoTotalesPpal = 0;
        int SectorRealCantTotalesPpal = 0;
        double SectorRealSaldoTotalesPpal = 0;
        int SaldoTotalPpalCantTotalesPpal = 0;
        double SaldoTotalPpalSaldoTotalesPpal = 0;

        /*VARIABLES PARA RESUMEN ENDEUDAMIENTO COMO COEDUDOR
        SECCION TOTALES(CANTIDAD Y SALDO TOTAL*/
        int TarjcreditoCantTotalesCoe = 0;
        double TarjcreditoSaldoTotalesCoe = 0;
        int SectorFinanCantTotalesCoe = 0;
        double SectorFinanSaldoTotalesCoe = 0;
        int SectorSolidCantTotalesCoe = 0;
        double SectorSolidSaldoTotalesCoe = 0;
        int SectorRealCantTotalesCoe = 0;
        double SectorRealSaldoTotalesCoe = 0;
        int SaldoTotalPpalCantTotalesCoe = 0;
        double SaldoTotalPpalSaldoTotalesCoe = 0;

        //TOTALES RESUMEN PRINCIPAL Y COEDUDOR
        int ResumenTotalCantTotalesPpalyCoe = 0;
        double ResumenTotalSaldoTotalesPpalyCoe = 0;

        //INFORMACION CUENTAS AL DIA Y MORA
        double TarjcreditoPadeOblaldiaPpal = 0;
        int TarjcreditoCantOblaldiaPpal = 0;
        double TarjcreditoSaldoTotalOblaldiaPpal = 0;
        int TarjcreditoCantOblenmoraPpal = 0;
        double TarjcreditoSaldoTotalenmoraPpal = 0;
        double TarjcreditoCuotaOblenmoraPpal = 0;
        int SectorFinanCantOblaldiaPpal = 0;
        int SectorFinanCantOblenmoraPpal = 0;
        double SectorFinanSaldoTotalOblaldiaPpal = 0;
        double SectorFinanSaldoTotalenmoraPpal = 0;
        double SectorFinanCuotaOblenmoraPpal = 0;
        int SectorSolidCantOblaldiaPpal = 0;
        int SectorSolidCantOblenmoraPpal = 0;
        double SectorSolidCuotaOblenmoraPpal = 0;
        double SectorSolidSaldoTotalOblaldiaPpal = 0;
        double SectorSolidSaldoTotalenmoraPpal = 0;
        double SectorFinanPadeOblaldiaPpal = 0;
        double SectorSolidPadeOblaldiaPpal = 0;
        int SectorRealCantOblaldiaPpal = 0;
        int SectorRealCantOblenmoraPpal = 0;
        double SectorRealCuotaOblenmoraPpal = 0;
        double SectorRealSaldoTotalOblaldiaPpal = 0;
        double SectorRealSaldoTotalenmoraPpal = 0;
        double SectorRealPadeOblaldiaPpal = 0;
        double TarjcreditoCuotaPpal = 0;
        double TarjcreditoValenmoraPpal = 0;
        double SectorFinanCuotaPpal = 0;
        double SectorFinanValenmoraPpal = 0;
        double SectorSolidCuotaPpal = 0;
        double SectorSolidValenmoraPpal = 0;
        double SectorRealCuotaPpal = 0;
        double SectorRealValenmoraPpal = 0;
        double SaldoTotalPpalPadeOblaldiaPpal = 0;
        double SaldoTotalPpalPadeOblaldiaPpal2 = 0;
        int SaldoTotalPpalCantOblaldiaPpal = 0;
        double SaldoTotalPpalSaldoTotalOblaldiaPpal = 0;
        double SaldoTotalPpalCuotaOblenmoraPpal = 0;
        int SaldoTotalPpalCantOblenmoraPpal = 0;
        double SaldoTotalPpalSaldoTotalenmoraPpal = 0;
        double SaldoTotalPpalCuotaPpal = 0;
        double SaldoTotalPpalValenmoraPpal = 0;
        int TarjcreditoCantOblaldiaCoe = 0;
        double TarjcreditoSaldoTotalOblaldiaCoe = 0;
        double TarjcreditoPadeOblaldiaCoe = 0;
        int SectorFinanCantOblaldiaCoe = 0;
        double SectorFinanSaldoTotalOblaldiaCoe = 0;
        double SectorFinanPadeOblaldiaCoe = 0;
        double SectorSolidSaldoTotalOblaldiaCoe = 0;
        double SectorSolidPadeOblaldiaCoe = 0;
        int SectorRealCantOblaldiaCoe = 0;
        double SectorRealSaldoTotalOblaldiaCoe = 0;
        double SectorRealPadeOblaldiaCoe = 0;
        int TarjcreditoCantOblenmoraCoe = 0;
        double TarjcreditoSaldoTotalenmoraCoe = 0;
        double SectorFinanCuotaOblenmoraCoe = 0;
        double SectorSolidCuotaOblenmoraCoe = 0;
        int SectorSolidCantOblenmoraCoe = 0;
        double SectorSolidSaldoTotalenmoraCoe = 0;
        double SectorRealCuotaOblenmoraCoe = 0;
        int SectorRealCantOblenmoraCoe = 0;
        double SectorRealSaldoTotalenmoraCoe = 0;
        double TarjcreditoCuotaCoe = 0;
        double TarjcreditoValenmoraCoe = 0;
        double SectorFinanCuotaCoe = 0;
        double SectorFinanValenmoraCoe = 0;
        double SectorSolidCuotaCoe = 0;
        double SectorSolidValenmoraCoe = 0;
        double SectorRealCuotaCoe = 0;
        double SectorRealValenmoraCoe = 0;
        double SaldoTotalPadeOblaldiaCoe2 = 0;
        double SaldoTotalPadeOblaldiaCoe = 0;
        int SaldoTotalCantOblaldiaCoe = 0;
        double SaldoTotalSaldoTotalOblaldiaCoe = 0;
        double SaldoTotalCuotaOblenmoraCoe = 0;
        double TarjcreditoCuotaOblenmoraCoe = 0;
        int SaldoTotalCantOblenmoraCoe = 0;
        int SectorFinanCantOblenmoraCoe = 0;
        double SectorFinanSaldoTotalenmoraCoe = 0;
        double SaldoTotalCuotaCoe = 0;
        double SaldoTotalValenmoraCoe = 0;
        int SectorSolidCantOblaldiaCoe = 0;
        
        Node Endeudamiento = null;
        Node SubNodociclosector = null;
        Node SubNodotipocuenta = null;
        Node SubNodotipousuario = null;
        Node SubNodocuenta = null;
        double Saldocuenta = 0, Saldotarjetacredito = 0,
                Saldototalcuentassectorfinanciero = 0,
                Saldototalcuentassectorsolidario = 0,
                Saldototalcuentassectorreal = 0,
                Saldototaltotalescuentasprincipal = 0;
        int Contadortarjetas = 0,
                Cantidadcuentasesctorfinanciero = 0,
                Cantidadcuentasesctorsolidario = 0,
                Cantidadcuentasesctorreal = 0,
                Cantidadsumatotalescuentasprincipal = 0;

        double c = 0,
                Saldototalcuentassectorfinancierocoe = 0,
                Saldototalcuentassectorsolidariocoe = 0,
                Saldototalcuentassectorrealcoe = 0,
                Saldototaltotalescuentascoedudor = 0,
                Saldototaltotalesresumencuentascoedudor = 0;
        int Contadortarjetascoe = 0,
                Cantidadcuentasesctorfinancierocoe = 0,
                Cantidadcuentasesctorsolidariocoe = 0,
                Cantidadcuentasesctorrealcoe = 0,
                Cantidadsumatotalescuentascoedudor = 0,
                Cantidadsumatotalesresumencuentascoedudor = 0;

        // CUENTAS AL DIA
        int CantTarjetasaldiappal = 0,
                CantTarjetasenmorappal = 0,
                Cantidadcuentasaldiasectorfinanciero = 0,
                Cantidadcuentasenmorasectorfinanciero = 0,
                Cantidadcuentassectorsolidarioaldia = 0,
                Cantidadcuentassectorsolidarioenmora = 0,
                Cantidadcuentassectorrealaldia = 0,
                Cantidadcuentassectorrealenmora = 0,
                SubtotalCantObligaaldiaPpalSuma = 0,
                SubtotalCantObligaenmoraPpalSuma = 0,
                CantTarjetasaldiappalcoe = 0,
                CantTarjetasenmorappalcoe = 0,
                Cantidadcuentasaldiasectorfinancierocoe = 0,
                Cantidadcuentasenmorasectorfinancierocoe = 0,
                Cantidadcuentassectorsolidarioaldiacoe = 0,
                Cantidadcuentassectorsolidarioenmoracoe = 0,
                Cantidadcuentassectorrealaldiacoe = 0,
                Cantidadcuentassectorrealenmoracoe = 0;

        double Saldocuentaestadotarjetaaldia = 0,
                Saldocuentaestadotarjetaenmora = 0,
                SaldoTarjetacreditoaldiappal = 0,
                Tarjetacreditopadeppal = 0,
                SaldoTarjetacreditoenmorappal = 0,
                Cuotamestrajetacreditoenmora = 0,
                Valorcuotatarjetacreditoppalsuma = 0,
                Valorcuotatarjetacreditoppal = 0,
                Valorenmoratarjetacreditoppalsuma = 0,
                Valorenmoratarjetacreditoppal = 0,
                Valorcuotasectorfinancieroppalsuma = 0,
                Valorcuotasectorfinancieroppal = 0,
                Valorenmorasectorfinancieropalsuma = 0,
                Valorenmorasectorfinancieroppal = 0,
                SaldocuotaenmoraTDC = 0,
                Padesectorfinancieroppal = 0,
                Saldocuentaalfiasectorfinanciero = 0,
                Saldocuotaenmorasectorfinancierosuma = 0,
                SaldocuotamesmoradiSectorFinanciero = 0,
                Saldocuentaaldiasectorfinanciero = 0,
                Saldocuentaenmorasectorfinanciero = 0,
                SaldoTotalCuotaaldiaSectorFinan = 0,
                SaldoTotalCuotaenmoraSectorFinan = 0,
                Padesectorsolidario = 0,
                Saldocuentaaldiasectorsolidario = 0,
                Saldocuentaenmorasectorsolidario = 0,
                SaldoTotalCuotaaldiaSectorSolidario = 0,
                SaldoTotalCuotaenmoraSectorSolidario = 0,
                Padesectorreal = 0,
                Saldocuentaaldiasectorsreal = 0,
                SaldoTotalCuotaaldiaSectorReal = 0,
                Saldocuentaenmorasectorreal = 0,
                SaldoTotalCuotaenmoraSectorReal = 0,
                Cuotamesenmorasectorrealsuma = 0,
                CuotamesEnmoraSectorReal = 0,
                Cuotamesenmorasectorsolidariosuma = 0,
                CuotamesEnmoraSectorSolidario = 0,
                Valorcuotasectorsolidarioprincipalsuma = 0,
                Valorcuotasectorsolidarioprincipal = 0,
                Valorenmorasectorsolidarioprincipalsuma = 0,
                Valorenmorasectorsolidarioprincipal = 0,
                Valorcuotasectorrealprincipalsuma = 0,
                Valorcuotasectorrealprincipal = 0,
                Valorenmorasectorrealprincipalsuma = 0,
                Valorenmorasectorrealprincipal = 0,
                SubtotalPadePpalSuma = 0,
                SubtotalObligacionesaldiasaldoPpalSuma = 0,
                SubtotalCuotaObligacionesenmoraPpalSuma = 0,
                SubtotalObligacionesenmorasaldoPpalSuma = 0,
                SubtotalCuotaPpalSuma = 0,
                SubtotalEnmoraPpalSuma = 0,
                Saldocuentaestadotarjetaaldiacoe = 0,
                SaldoTarjetacreditoaldiappalcoe = 0,
                SaldocuotaenmoraTDCcoe = 0,
                Cuotamestrajetacreditoenmoracoe = 0,
                Saldocuentaestadotarjetaenmoracoe = 0,
                SaldoTarjetacreditoenmorappalcoe = 0,
                Valorcuotatarjetacreditoppalsumacoe = 0,
                Valorcuotatarjetacreditoppalcoe = 0,
                Valorenmoratarjetacreditoppalsumacoe = 0,
                Valorenmoratarjetacreditoppalcoe = 0,
                SaldocuotamesmoradiSectorFinancierocoe = 0,
                Saldocuotaenmorasectorfinancierosumacoe = 0,
                Saldocuentaaldiasectorfinancierocoe = 0,
                SaldoTotalCuotaaldiaSectorFinancoe = 0,
                Saldocuentaenmorasectorfinancierocoe = 0,
                SaldoTotalCuotaenmoraSectorFinancoe = 0,
                Valorcuotasectorfinancieroppalsumacoe = 0,
                Valorcuotasectorfinancieroppalcoe = 0,
                Valorenmorasectorfinancieropalsumacoe = 0,
                Valorenmorasectorfinancieroppalcoe = 0,
                Saldocuentaaldiasectorsolidariocoe = 0,
                SaldoTotalCuotaaldiaSectorSolidariocoe = 0,
                Cuotamesenmorasectorsolidariosumacoe = 0,
                CuotamesEnmoraSectorSolidariocoe = 0,
                Saldocuentaenmorasectorsolidariocoe = 0,
                SaldoTotalCuotaenmoraSectorSolidariocoe = 0,
                Valorcuotasectorsolidarioprincipalsumacoe = 0,
                Valorcuotasectorsolidarioprincipalcoe = 0,
                Valorenmorasectorsolidarioprincipalsumacoe = 0,
                Valorenmorasectorsolidarioprincipalcoe = 0,
                Saldocuentaaldiasectorsrealcoe = 0,
                SaldoTotalCuotaaldiaSectorRealcoe = 0,
                Cuotamesenmorasectorrealsumacoe = 0,
                CuotamesEnmoraSectorRealcoe = 0,
                Saldocuentaenmorasectorrealcoe = 0,
                SaldoTotalCuotaenmoraSectorRealcoe = 0,
                Valorcuotasectorrealprincipalsumacoe = 0,
                Valorcuotasectorrealprincipalcoe = 0,
                Valorenmorasectorrealprincipalsumacoe = 0,
                Valorenmorasectorrealprincipalcoe = 0,
                Tarjetacreditopadecoe = 0,
                Padesectorsolidariocoe = 0,
                Padesectorrealcoe = 0,
                Padesectorfinancierocoe = 0,
                SaldoTarjetacreditoenmoracoe = 0,
                Saldotarjetacreditocoe = 0,
                Valorcuotatarjetacreditocoe = 0;


                String sectorFinancieroppal = "";
                String totalcomoprincipal = "";
                String sectorCooperativoppal = "";
                String sectorRealppal = "";
          
         Node Nodoprincipal = null;       
         Node SubNodoTipoCuenta = null;
         Node SubNodoValores = null;
         Node SubNodoEstado = null;
         Node SubNodoValor = null;
         Node SubNodoSobregiro = null;
         
         String FechaCuenta = "";
         String TipoContrato = "";
         String NumeroCuenta = "";
         String EstadoCuenta = "";
         String EntidadBancaria = "";
         String CiudadCuenta = "";
         String SucursalCuenta = "";
         String FechaApertura = "";
         int ChequeDevUltMes = 0;
         double Valorsobregiro = 0;
         int Diasautor = 0;
         String Fechapermanencia = "";
         String Detalledatos = "";
       
         
         ArrayList<String[]> informe = new ArrayList<String[]>();
         
         Informedetallado [] datosinforme = new Informedetallado[12];
         
               

        DecimalFormat formatea = new DecimalFormat("###,###.##");
        DecimalFormat df = new DecimalFormat("###");

        NodeList Nodoendeudamientoactual = documentXml.getElementsByTagName("EndeudamientoActual");
        Endeudamiento = Nodoendeudamientoactual.item(0);
        //Valida que el nodo exista y que sea de tipo nodo
        if (Endeudamiento != null && Endeudamiento.getNodeType() == Node.ELEMENT_NODE) {
            for (int i = 0; i < Endeudamiento.getChildNodes().getLength(); i++) {

                if (Endeudamiento.getChildNodes().item(i).getNodeName().equals("Sector")) {
                    SubNodociclosector = Endeudamiento.getChildNodes().item(i);
                    //Valida que el nodo exista y que sea de tipo nodo
                    if (SubNodociclosector != null && SubNodociclosector.getNodeType() == Node.ELEMENT_NODE) {
                        Element Atributosector = (Element) SubNodociclosector;
                        //SEGMENTO CANTIDADES Y SALDOS TOTALES COMO PRINCIAL
                        //<<SEGMENTO DE CODIGO PARA SACAR LOS DATOS DE TARJETAS DE CRÉDITOS COMO PPAL>>
                        if (Atributosector.getAttribute("codSector").equals("1")) {
                            for (int j = 0; j < SubNodociclosector.getChildNodes().getLength(); j++) {
                                if (SubNodociclosector.getChildNodes().item(j).getNodeName().equals("TipoCuenta")) {
                                    SubNodotipocuenta = SubNodociclosector.getChildNodes().item(j);
                                    //Valida que el nodo exista y que sea de tipo nodo
                                    if (SubNodotipocuenta != null && SubNodotipocuenta.getNodeType() == Node.ELEMENT_NODE) {
                                        Element Atributotipocuenta = (Element) SubNodotipocuenta;
                                        //VALIDA QUE SOLO SEA TIPO DE CUENTA TARJETA DE CREDITO
                                        if (Atributotipocuenta.getAttribute("tipoCuenta").equals("TDC")) {
                                            for (int k = 0; k < SubNodotipocuenta.getChildNodes().getLength(); k++) {
                                                if (SubNodotipocuenta.getChildNodes().item(k).getNodeName().equals("Usuario")) {
                                                    SubNodotipousuario = SubNodotipocuenta.getChildNodes().item(k);
                                                    //Valida que el nodo exista y que sea de tipo nodo
                                                    if (SubNodotipousuario != null && SubNodotipousuario.getNodeType() == Node.ELEMENT_NODE) {
                                                        Element Atributonodousuario = (Element) SubNodotipousuario;
                                                        if (Atributonodousuario.getAttribute("tipoUsuario").equals("Principal")) {
                                                            for (int l = 0; l < SubNodotipousuario.getChildNodes().getLength(); l++) {
                                                                if (SubNodotipousuario.getChildNodes().item(l).getNodeName().equals("Cuenta")) {
                                                                    //Valida que el nodo exista y que sea de tipo nodo
                                                                    SubNodocuenta = SubNodotipousuario.getChildNodes().item(l);
                                                                    if (SubNodocuenta != null && SubNodocuenta.getNodeType() == Node.ELEMENT_NODE) {
                                                                        Element Atributonodocuenta = (Element) SubNodocuenta;
                                                                        Saldocuenta = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));

                                                                        if (Saldocuenta > 0) {
                                                                            //Obtiene la cantidad de tarjetas sin tener en cuenta cual esta al dia o en mora
                                                                            Saldotarjetacredito = Saldotarjetacredito + Saldocuenta;
                                                                            Contadortarjetas = Contadortarjetas + 1;

                                                                            String estadotarjetppal = Atributonodocuenta.getAttribute("estadoActual");

                                                                            //Valida el estado de la tarjeta
                                                                            if (estadotarjetppal.equals("Al dÃ­a")) {
                                                                                CantTarjetasaldiappal = CantTarjetasaldiappal + 1;
                                                                                Saldocuentaestadotarjetaaldia = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                                SaldoTarjetacreditoaldiappal = SaldoTarjetacreditoaldiappal + Saldocuentaestadotarjetaaldia;

                                                                            }
                                                                            if (estadotarjetppal.equals("En mora")) {
                                                                                //Obtener valorcuota mes
                                                                                SaldocuotaenmoraTDC = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));
                                                                                //Obtner valor de la cuota mes
                                                                                Cuotamestrajetacreditoenmora = Cuotamestrajetacreditoenmora + SaldocuotaenmoraTDC;
                                                                                CantTarjetasenmorappal = CantTarjetasenmorappal + 1;
                                                                                Saldocuentaestadotarjetaenmora = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                                SaldoTarjetacreditoenmorappal = SaldoTarjetacreditoenmorappal + Saldocuentaestadotarjetaenmora;

                                                                            }

                                                                            //Valor cuota 
                                                                            Valorcuotatarjetacreditoppalsuma = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));
                                                                            Valorcuotatarjetacreditoppal = Valorcuotatarjetacreditoppal + Valorcuotatarjetacreditoppalsuma;

                                                                            //Valor en mora
                                                                            Valorenmoratarjetacreditoppalsuma = Double.parseDouble(Atributonodocuenta.getAttribute("saldoMora"));
                                                                            Valorenmoratarjetacreditoppal = Valorenmoratarjetacreditoppal + Valorenmoratarjetacreditoppalsuma;

                                                                        }
                                                                    }
                                                                }
                                                            }

                                                        }
                                                    }

                                                }

                                            }
                                        }
                                        //VALIDA TODO TIPO DE CUENTA SIN INCLUIR TARJETA DE CREDITO PRINCIPAL
                                        if (!Atributotipocuenta.getAttribute("tipoCuenta").equals("TDC")) {
                                            for (int k = 0; k < SubNodotipocuenta.getChildNodes().getLength(); k++) {
                                                if (SubNodotipocuenta.getChildNodes().item(k).getNodeName().equals("Usuario")) {
                                                    SubNodotipousuario = SubNodotipocuenta.getChildNodes().item(k);
                                                    //Valida que el nodo exista y que sea de tipo nodo
                                                    if (SubNodotipousuario != null && SubNodotipousuario.getNodeType() == Node.ELEMENT_NODE) {
                                                        Element Atributonodousuario = (Element) SubNodotipousuario;
                                                        if (Atributonodousuario.getAttribute("tipoUsuario").equals("Principal")) {
                                                            for (int l = 0; l < SubNodotipousuario.getChildNodes().getLength(); l++) {
                                                                if (SubNodotipousuario.getChildNodes().item(l).getNodeName().equals("Cuenta")) {
                                                                    //Valida que el nodo exista y que sea de tipo nodo
                                                                    SubNodocuenta = SubNodotipousuario.getChildNodes().item(l);
                                                                    if (SubNodocuenta != null && SubNodocuenta.getNodeType() == Node.ELEMENT_NODE) {
                                                                        Element Atributonodocuenta = (Element) SubNodocuenta;
                                                                        Saldocuenta = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));

                                                                        if (Saldocuenta > 0) {
                                                                            Saldototalcuentassectorfinanciero = Saldototalcuentassectorfinanciero + Saldocuenta;
                                                                            Cantidadcuentasesctorfinanciero = Cantidadcuentasesctorfinanciero + 1;
                                                                            //Obtner valor de la cuota mes

                                                                            SaldocuotamesmoradiSectorFinanciero = SaldocuotamesmoradiSectorFinanciero + Saldocuotaenmorasectorfinancierosuma;
                                                                            String estadotarjetppal = Atributonodocuenta.getAttribute("estadoActual");

                                                                            //Valida el estado de la tarjeta
                                                                            if (estadotarjetppal.equals("Al dÃ­a")) {
                                                                                Cantidadcuentasaldiasectorfinanciero = Cantidadcuentasaldiasectorfinanciero + 1;
                                                                                Saldocuentaaldiasectorfinanciero = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                                SaldoTotalCuotaaldiaSectorFinan = SaldoTotalCuotaaldiaSectorFinan + Saldocuentaaldiasectorfinanciero;
                                                                            }
                                                                            if (estadotarjetppal.equals("En mora")) {
                                                                                //Obtener valor cuota mes
                                                                                Saldocuotaenmorasectorfinancierosuma = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));
                                                                                //Obtner valor de la cuota mes
                                                                                SaldocuotamesmoradiSectorFinanciero = SaldocuotamesmoradiSectorFinanciero + Saldocuotaenmorasectorfinancierosuma;
                                                                                Cantidadcuentasenmorasectorfinanciero = Cantidadcuentasenmorasectorfinanciero + 1;
                                                                                Saldocuentaenmorasectorfinanciero = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                                SaldoTotalCuotaenmoraSectorFinan = SaldoTotalCuotaenmoraSectorFinan + Saldocuentaenmorasectorfinanciero;
                                                                            }

                                                                            //Valor cuota 
                                                                            Valorcuotasectorfinancieroppalsuma = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));
                                                                            Valorcuotasectorfinancieroppal = Valorcuotasectorfinancieroppal + Valorcuotasectorfinancieroppalsuma;

                                                                            //Valor en mora
                                                                            Valorenmorasectorfinancieropalsuma = Double.parseDouble(Atributonodocuenta.getAttribute("saldoMora"));
                                                                            Valorenmorasectorfinancieroppal = Valorenmorasectorfinancieroppal + Valorenmorasectorfinancieropalsuma;
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
                        //<<SEGMENTO DE CODIGO PARA SACAR LOS DATOS SEL SECTOR SOLIDARIO PRINCIPAL>>
                        if (Atributosector.getAttribute("codSector").equals("2")) {
                            for (int j = 0; j < SubNodociclosector.getChildNodes().getLength(); j++) {
                                if (SubNodociclosector.getChildNodes().item(j).getNodeName().equals("TipoCuenta")) {
                                    SubNodotipocuenta = SubNodociclosector.getChildNodes().item(j);
                                    //Valida que el nodo exista y que sea de tipo nodo
                                    if (SubNodotipocuenta != null && SubNodotipocuenta.getNodeType() == Node.ELEMENT_NODE) {
                                        Element Atributotipocuenta = (Element) SubNodotipocuenta;
                                        //OJO VALIDAR TIPOS DE TARJETAS
                                        if (!Atributotipocuenta.getAttribute("tipoCuenta").equals("TDC")) {
                                        for (int k = 0; k < SubNodotipocuenta.getChildNodes().getLength(); k++) {
                                            if (SubNodotipocuenta.getChildNodes().item(k).getNodeName().equals("Usuario")) {
                                                SubNodotipousuario = SubNodotipocuenta.getChildNodes().item(k);
                                                //Valida que el nodo exista y que sea de tipo nodo
                                                if (SubNodotipousuario != null && SubNodotipousuario.getNodeType() == Node.ELEMENT_NODE) {
                                                    Element Atributonodousuario = (Element) SubNodotipousuario;
                                                    if (Atributonodousuario.getAttribute("tipoUsuario").equals("Principal")) {
                                                        for (int l = 0; l < SubNodotipousuario.getChildNodes().getLength(); l++) {
                                                            if (SubNodotipousuario.getChildNodes().item(l).getNodeName().equals("Cuenta")) {
                                                                //Valida que el nodo exista y que sea de tipo nodo
                                                                SubNodocuenta = SubNodotipousuario.getChildNodes().item(l);
                                                                if (SubNodocuenta != null && SubNodocuenta.getNodeType() == Node.ELEMENT_NODE) {
                                                                    Element Atributonodocuenta = (Element) SubNodocuenta;
                                                                    Saldocuenta = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                    if (Saldocuenta > 0) {
                                                                        Saldototalcuentassectorsolidario = Saldototalcuentassectorsolidario + Saldocuenta;
                                                                        Cantidadcuentasesctorsolidario = Cantidadcuentasesctorsolidario + 1;

                                                                        String estadocuenta = Atributonodocuenta.getAttribute("estadoActual");

                                                                        if (estadocuenta.equals("Al dÃ­a")) {
                                                                            Cantidadcuentassectorsolidarioaldia = Cantidadcuentassectorsolidarioaldia + 1;
                                                                            Saldocuentaaldiasectorsolidario = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                            SaldoTotalCuotaaldiaSectorSolidario = SaldoTotalCuotaaldiaSectorSolidario + Saldocuentaaldiasectorsolidario;

                                                                        }
                                                                        if (estadocuenta.equals("En mora")) {
                                                                            //Obtener valor cuota mes
                                                                            Cuotamesenmorasectorsolidariosuma = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));
                                                                            //Obtner valor de la cuota mes
                                                                            CuotamesEnmoraSectorSolidario = CuotamesEnmoraSectorSolidario + Cuotamesenmorasectorsolidariosuma;
                                                                            Cantidadcuentassectorsolidarioenmora = Cantidadcuentassectorsolidarioenmora + 1;
                                                                            Saldocuentaenmorasectorsolidario = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                            SaldoTotalCuotaenmoraSectorSolidario = SaldoTotalCuotaenmoraSectorSolidario + Saldocuentaenmorasectorsolidario;

                                                                        }

                                                                        //Valor cuota 
                                                                        Valorcuotasectorsolidarioprincipalsuma = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));
                                                                        Valorcuotasectorsolidarioprincipal = Valorcuotasectorsolidarioprincipal + Valorcuotasectorsolidarioprincipalsuma;

                                                                        //Valor en mora
                                                                        Valorenmorasectorsolidarioprincipalsuma = Double.parseDouble(Atributonodocuenta.getAttribute("saldoMora"));
                                                                        Valorenmorasectorsolidarioprincipal = Valorenmorasectorsolidarioprincipal + Valorenmorasectorsolidarioprincipalsuma;
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

                        //<<SEGMENTO DE CODIGO PARA SACAR LOS DATOS SEL SECTOR REAL PRINCIPAL>>
                        if (Atributosector.getAttribute("codSector").equals("3")) {
                            for (int j = 0; j < SubNodociclosector.getChildNodes().getLength(); j++) {
                                if (SubNodociclosector.getChildNodes().item(j).getNodeName().equals("TipoCuenta")) {
                                    SubNodotipocuenta = SubNodociclosector.getChildNodes().item(j);
                                    //Valida que el nodo exista y que sea de tipo nodo
                                    if (SubNodotipocuenta != null && SubNodotipocuenta.getNodeType() == Node.ELEMENT_NODE) {
                                        Element Atributotipocuenta = (Element) SubNodotipocuenta;
                                        //OJO VALIDAR TIPOS DE TARJETAS
                                        if (!Atributotipocuenta.getAttribute("tipoCuenta").equals("TDC")) {
                                        for (int k = 0; k < SubNodotipocuenta.getChildNodes().getLength(); k++) {
                                            if (SubNodotipocuenta.getChildNodes().item(k).getNodeName().equals("Usuario")) {
                                                SubNodotipousuario = SubNodotipocuenta.getChildNodes().item(k);
                                                //Valida que el nodo exista y que sea de tipo nodo
                                                if (SubNodotipousuario != null && SubNodotipousuario.getNodeType() == Node.ELEMENT_NODE) {
                                                    Element Atributonodousuario = (Element) SubNodotipousuario;
                                                    if (Atributonodousuario.getAttribute("tipoUsuario").equals("Principal")) {
                                                        for (int l = 0; l < SubNodotipousuario.getChildNodes().getLength(); l++) {
                                                            if (SubNodotipousuario.getChildNodes().item(l).getNodeName().equals("Cuenta")) {
                                                                //Valida que el nodo exista y que sea de tipo nodo
                                                                SubNodocuenta = SubNodotipousuario.getChildNodes().item(l);
                                                                if (SubNodocuenta != null && SubNodocuenta.getNodeType() == Node.ELEMENT_NODE) {
                                                                    Element Atributonodocuenta = (Element) SubNodocuenta;
                                                                    Saldocuenta = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                    if (Saldocuenta > 0) {
                                                                        Saldototalcuentassectorreal = Saldototalcuentassectorreal + Saldocuenta;
                                                                        Cantidadcuentasesctorreal = Cantidadcuentasesctorreal + 1;

                                                                        String estadocuenta = Atributonodocuenta.getAttribute("estadoActual");

                                                                        if (estadocuenta.equals("Al dÃ­a")) {
                                                                            Cantidadcuentassectorrealaldia = Cantidadcuentassectorrealaldia + 1;
                                                                            Saldocuentaaldiasectorsreal = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                            SaldoTotalCuotaaldiaSectorReal = SaldoTotalCuotaaldiaSectorReal + Saldocuentaaldiasectorsreal;
                                                                        }
                                                                        if (estadocuenta.equals("En mora")) {
                                                                            //Obtener valor cuota mes
                                                                            Cuotamesenmorasectorrealsuma = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));
                                                                            //Obtner valor de la cuota mes
                                                                            CuotamesEnmoraSectorReal = CuotamesEnmoraSectorReal + Cuotamesenmorasectorrealsuma;
                                                                            Cantidadcuentassectorrealenmora = Cantidadcuentassectorrealenmora + 1;
                                                                            Saldocuentaenmorasectorreal = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                            SaldoTotalCuotaenmoraSectorReal = SaldoTotalCuotaenmoraSectorReal + Saldocuentaenmorasectorreal;
                                                                        }

                                                                        //Valor cuota 
                                                                        Valorcuotasectorrealprincipalsuma = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));
                                                                        Valorcuotasectorrealprincipal = Valorcuotasectorrealprincipal + Valorcuotasectorrealprincipalsuma;

                                                                        //Valor en mora
                                                                        Valorenmorasectorrealprincipalsuma = Double.parseDouble(Atributonodocuenta.getAttribute("saldoMora"));
                                                                        Valorenmorasectorrealprincipal = Valorenmorasectorrealprincipal + Valorenmorasectorrealprincipalsuma;

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

                        //SEGMENTO CANTIDADES Y SALDOS TOTALES COMO CODEUDOR
                        //<<SEGMENTO DE CODIGO PARA SACAR LOS DATOS DE TARJETAS DE CRÉDITOS COMO CODEUDOR>>
                        if (Atributosector.getAttribute("codSector").equals("1")) {
                            for (int j = 0; j < SubNodociclosector.getChildNodes().getLength(); j++) {
                                if (SubNodociclosector.getChildNodes().item(j).getNodeName().equals("TipoCuenta")) {
                                    SubNodotipocuenta = SubNodociclosector.getChildNodes().item(j);
                                    //Valida que el nodo exista y que sea de tipo nodo
                                    if (SubNodotipocuenta != null && SubNodotipocuenta.getNodeType() == Node.ELEMENT_NODE) {
                                        Element Atributotipocuenta = (Element) SubNodotipocuenta;
                                        //VALIDA QUE SOLO SEA TIPO DE CUENTA TARJETA DE CREDITO
                                        if (Atributotipocuenta.getAttribute("tipoCuenta").equals("TDC")) {
                                            for (int k = 0; k < SubNodotipocuenta.getChildNodes().getLength(); k++) {
                                                if (SubNodotipocuenta.getChildNodes().item(k).getNodeName().equals("Usuario")) {
                                                    SubNodotipousuario = SubNodotipocuenta.getChildNodes().item(k);
                                                    //Valida que el nodo exista y que sea de tipo nodo
                                                    if (SubNodotipousuario != null && SubNodotipousuario.getNodeType() == Node.ELEMENT_NODE) {
                                                        Element Atributonodousuario = (Element) SubNodotipousuario;
                                                        if (Atributonodousuario.getAttribute("tipoUsuario").equals("Codeudor")) {
                                                            for (int l = 0; l < SubNodotipousuario.getChildNodes().getLength(); l++) {
                                                                if (SubNodotipousuario.getChildNodes().item(l).getNodeName().equals("Cuenta")) {
                                                                    //Valida que el nodo exista y que sea de tipo nodo
                                                                    SubNodocuenta = SubNodotipousuario.getChildNodes().item(l);
                                                                    if (SubNodocuenta != null && SubNodocuenta.getNodeType() == Node.ELEMENT_NODE) {
                                                                        Element Atributonodocuenta = (Element) SubNodocuenta;
                                                                        Saldocuenta = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));

                                                                        if (Saldocuenta > 0) {
                                                                            //Obtiene la cantidad de tarjetas sin tener en cuenta cual esta al dia o en mora
                                                                            Saldotarjetacreditocoe = Saldotarjetacreditocoe + Saldocuenta;
                                                                            Contadortarjetascoe = Contadortarjetascoe + 1;

                                                                            String estadotarjetppal = Atributonodocuenta.getAttribute("estadoActual");

                                                                            //Valida el estado de la tarjeta
                                                                            if (estadotarjetppal.equals("Al dÃ­a")) {
                                                                                CantTarjetasaldiappalcoe = CantTarjetasaldiappalcoe + 1;
                                                                                Saldocuentaestadotarjetaaldiacoe = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                                SaldoTarjetacreditoaldiappalcoe = SaldoTarjetacreditoaldiappalcoe + Saldocuentaestadotarjetaaldiacoe;

                                                                            }
                                                                            if (estadotarjetppal.equals("En mora")) {
                                                                                //Obtener valorcuota mes
                                                                                SaldocuotaenmoraTDCcoe = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));
                                                                                //Obtner valor de la cuota mes
                                                                                Cuotamestrajetacreditoenmoracoe = Cuotamestrajetacreditoenmoracoe + SaldocuotaenmoraTDCcoe;
                                                                                CantTarjetasenmorappalcoe = CantTarjetasenmorappalcoe + 1;
                                                                                Saldocuentaestadotarjetaenmoracoe = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                                SaldoTarjetacreditoenmorappalcoe = SaldoTarjetacreditoenmorappalcoe + Saldocuentaestadotarjetaenmoracoe;

                                                                            }

                                                                            //Valor cuota 
                                                                            Valorcuotatarjetacreditoppalsumacoe = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));
                                                                            Valorcuotatarjetacreditoppalcoe = Valorcuotatarjetacreditoppalcoe + Valorcuotatarjetacreditoppalsumacoe;

                                                                            //Valor en mora
                                                                            Valorenmoratarjetacreditoppalsumacoe = Double.parseDouble(Atributonodocuenta.getAttribute("saldoMora"));
                                                                            Valorenmoratarjetacreditoppalcoe = Valorenmoratarjetacreditoppalcoe + Valorenmoratarjetacreditoppalsumacoe;

                                                                        }
                                                                    }
                                                                }
                                                            }

                                                        }
                                                    }

                                                }

                                            }
                                        }
                                        //VALIDA TODO TIPO DE CUENTA SIN INCLUIR TARJETA DE CREDITO CODEUDOR
                                        if (!Atributotipocuenta.getAttribute("tipoCuenta").equals("TDC")) {
                                            for (int k = 0; k < SubNodotipocuenta.getChildNodes().getLength(); k++) {
                                                if (SubNodotipocuenta.getChildNodes().item(k).getNodeName().equals("Usuario")) {
                                                    SubNodotipousuario = SubNodotipocuenta.getChildNodes().item(k);
                                                    //Valida que el nodo exista y que sea de tipo nodo
                                                    if (SubNodotipousuario != null && SubNodotipousuario.getNodeType() == Node.ELEMENT_NODE) {
                                                        Element Atributonodousuario = (Element) SubNodotipousuario;
                                                        if (Atributonodousuario.getAttribute("tipoUsuario").equals("Codeudor")) {
                                                            for (int l = 0; l < SubNodotipousuario.getChildNodes().getLength(); l++) {
                                                                if (SubNodotipousuario.getChildNodes().item(l).getNodeName().equals("Cuenta")) {
                                                                    //Valida que el nodo exista y que sea de tipo nodo
                                                                    SubNodocuenta = SubNodotipousuario.getChildNodes().item(l);
                                                                    if (SubNodocuenta != null && SubNodocuenta.getNodeType() == Node.ELEMENT_NODE) {
                                                                        Element Atributonodocuenta = (Element) SubNodocuenta;
                                                                        Saldocuenta = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));

                                                                        if (Saldocuenta > 0) {
                                                                            Saldototalcuentassectorfinancierocoe = Saldototalcuentassectorfinancierocoe + Saldocuenta;
                                                                            Cantidadcuentasesctorfinancierocoe = Cantidadcuentasesctorfinancierocoe + 1;
                                                                            //Obtner valor de la cuota mes

                                                                            SaldocuotamesmoradiSectorFinancierocoe = SaldocuotamesmoradiSectorFinancierocoe + Saldocuotaenmorasectorfinancierosumacoe;
                                                                            String estadotarjetppal = Atributonodocuenta.getAttribute("estadoActual");

                                                                            //Valida el estado de la tarjeta
                                                                            if (estadotarjetppal.equals("Al dÃ­a")) {
                                                                                Cantidadcuentasaldiasectorfinancierocoe = Cantidadcuentasaldiasectorfinancierocoe + 1;
                                                                                Saldocuentaaldiasectorfinancierocoe = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                                SaldoTotalCuotaaldiaSectorFinancoe = SaldoTotalCuotaaldiaSectorFinancoe + Saldocuentaaldiasectorfinancierocoe;
                                                                            }
                                                                            if (estadotarjetppal.equals("En mora")) {
                                                                                //Obtener valor cuota mes
                                                                                Saldocuotaenmorasectorfinancierosumacoe = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));
                                                                                //Obtner valor de la cuota mes
                                                                                SaldocuotamesmoradiSectorFinancierocoe = SaldocuotamesmoradiSectorFinancierocoe + Saldocuotaenmorasectorfinancierosumacoe;
                                                                                Cantidadcuentasenmorasectorfinancierocoe = Cantidadcuentasenmorasectorfinancierocoe + 1;
                                                                                Saldocuentaenmorasectorfinancierocoe = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                                SaldoTotalCuotaenmoraSectorFinancoe = SaldoTotalCuotaenmoraSectorFinancoe + Saldocuentaenmorasectorfinancierocoe;
                                                                            }

                                                                            //Valor cuota 
                                                                            Valorcuotasectorfinancieroppalsumacoe = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));
                                                                            Valorcuotasectorfinancieroppalcoe = Valorcuotasectorfinancieroppalcoe + Valorcuotasectorfinancieroppalsumacoe;

                                                                            //Valor en mora
                                                                            Valorenmorasectorfinancieropalsumacoe = Double.parseDouble(Atributonodocuenta.getAttribute("saldoMora"));
                                                                            Valorenmorasectorfinancieroppalcoe = Valorenmorasectorfinancieroppalcoe + Valorenmorasectorfinancieropalsumacoe;
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
                        //<<SEGMENTO DE CODIGO PARA SACAR LOS DATOS SEL SECTOR SOLIDARIO CODEUDOR>>
                        if (Atributosector.getAttribute("codSector").equals("2")) {
                            for (int j = 0; j < SubNodociclosector.getChildNodes().getLength(); j++) {
                                if (SubNodociclosector.getChildNodes().item(j).getNodeName().equals("TipoCuenta")) {
                                    SubNodotipocuenta = SubNodociclosector.getChildNodes().item(j);
                                    //Valida que el nodo exista y que sea de tipo nodo
                                    if (SubNodotipocuenta != null && SubNodotipocuenta.getNodeType() == Node.ELEMENT_NODE) {
                                        Element Atributotipocuenta = (Element) SubNodotipocuenta;
                                        //OJO VALIDAR TIPOS DE TARJETAS
                                       if (!Atributotipocuenta.getAttribute("tipoCuenta").equals("TDC")) {
                                        for (int k = 0; k < SubNodotipocuenta.getChildNodes().getLength(); k++) {
                                            if (SubNodotipocuenta.getChildNodes().item(k).getNodeName().equals("Usuario")) {
                                                SubNodotipousuario = SubNodotipocuenta.getChildNodes().item(k);
                                                //Valida que el nodo exista y que sea de tipo nodo
                                                if (SubNodotipousuario != null && SubNodotipousuario.getNodeType() == Node.ELEMENT_NODE) {
                                                    Element Atributonodousuario = (Element) SubNodotipousuario;
                                                    if (Atributonodousuario.getAttribute("tipoUsuario").equals("Codeudor")) {
                                                        for (int l = 0; l < SubNodotipousuario.getChildNodes().getLength(); l++) {
                                                            if (SubNodotipousuario.getChildNodes().item(l).getNodeName().equals("Cuenta")) {
                                                                //Valida que el nodo exista y que sea de tipo nodo
                                                                SubNodocuenta = SubNodotipousuario.getChildNodes().item(l);
                                                                if (SubNodocuenta != null && SubNodocuenta.getNodeType() == Node.ELEMENT_NODE) {
                                                                    Element Atributonodocuenta = (Element) SubNodocuenta;
                                                                    Saldocuenta = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                    if (Saldocuenta > 0) {
                                                                        Saldototalcuentassectorsolidariocoe = Saldototalcuentassectorsolidariocoe + Saldocuenta;
                                                                        Cantidadcuentasesctorsolidariocoe = Cantidadcuentasesctorsolidariocoe + 1;

                                                                        String estadocuenta = Atributonodocuenta.getAttribute("estadoActual");

                                                                        if (estadocuenta.equals("Al dÃ­a")) {
                                                                            Cantidadcuentassectorsolidarioaldiacoe = Cantidadcuentassectorsolidarioaldiacoe + 1;
                                                                            Saldocuentaaldiasectorsolidariocoe = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                            SaldoTotalCuotaaldiaSectorSolidariocoe = SaldoTotalCuotaaldiaSectorSolidariocoe + Saldocuentaaldiasectorsolidariocoe;
                                                                       
                                                                        }
                                                                        if (estadocuenta.equals("En mora")) {
                                                                            //Obtener valor cuota mes
                                                                            Cuotamesenmorasectorsolidariosumacoe = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));
                                                                            //Obtner valor de la cuota mes
                                                                            CuotamesEnmoraSectorSolidariocoe = CuotamesEnmoraSectorSolidariocoe + Cuotamesenmorasectorsolidariosumacoe;
                                                                            Cantidadcuentassectorsolidarioenmoracoe = Cantidadcuentassectorsolidarioenmoracoe + 1;
                                                                            Saldocuentaenmorasectorsolidariocoe = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                            SaldoTotalCuotaenmoraSectorSolidariocoe = SaldoTotalCuotaenmoraSectorSolidariocoe + Saldocuentaenmorasectorsolidariocoe;

                                                                        }

                                                                        //Valor cuota 
                                                                        Valorcuotasectorsolidarioprincipalsumacoe = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));
                                                                        Valorcuotasectorsolidarioprincipalcoe = Valorcuotasectorsolidarioprincipalcoe + Valorcuotasectorsolidarioprincipalsumacoe;

                                                                        //Valor en mora
                                                                        Valorenmorasectorsolidarioprincipalsumacoe = Double.parseDouble(Atributonodocuenta.getAttribute("saldoMora"));
                                                                        Valorenmorasectorsolidarioprincipalcoe = Valorenmorasectorsolidarioprincipalcoe + Valorenmorasectorsolidarioprincipalsumacoe;
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

                        //<<SEGMENTO DE CODIGO PARA SACAR LOS DATOS SEL SECTOR REAL CODEUDOR>>
                        if (Atributosector.getAttribute("codSector").equals("3")) {
                            for (int j = 0; j < SubNodociclosector.getChildNodes().getLength(); j++) {
                                if (SubNodociclosector.getChildNodes().item(j).getNodeName().equals("TipoCuenta")) {
                                    SubNodotipocuenta = SubNodociclosector.getChildNodes().item(j);
                                    //Valida que el nodo exista y que sea de tipo nodo
                                    if (SubNodotipocuenta != null && SubNodotipocuenta.getNodeType() == Node.ELEMENT_NODE) {
                                        Element Atributotipocuenta = (Element) SubNodotipocuenta;
                                        //OJO VALIDAR TIPOS DE TARJETAS
                                        if (!Atributotipocuenta.getAttribute("tipoCuenta").equals("TDC")) {
                                        for (int k = 0; k < SubNodotipocuenta.getChildNodes().getLength(); k++) {
                                            if (SubNodotipocuenta.getChildNodes().item(k).getNodeName().equals("Usuario")) {
                                                SubNodotipousuario = SubNodotipocuenta.getChildNodes().item(k);
                                                //Valida que el nodo exista y que sea de tipo nodo
                                                if (SubNodotipousuario != null && SubNodotipousuario.getNodeType() == Node.ELEMENT_NODE) {
                                                    Element Atributonodousuario = (Element) SubNodotipousuario;
                                                    if (Atributonodousuario.getAttribute("tipoUsuario").equals("Codeudor")) {
                                                        for (int l = 0; l < SubNodotipousuario.getChildNodes().getLength(); l++) {
                                                            if (SubNodotipousuario.getChildNodes().item(l).getNodeName().equals("Cuenta")) {
                                                                //Valida que el nodo exista y que sea de tipo nodo
                                                                SubNodocuenta = SubNodotipousuario.getChildNodes().item(l);
                                                                if (SubNodocuenta != null && SubNodocuenta.getNodeType() == Node.ELEMENT_NODE) {
                                                                    Element Atributonodocuenta = (Element) SubNodocuenta;
                                                                    Saldocuenta = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                    if (Saldocuenta > 0) {
                                                                        Saldototalcuentassectorrealcoe = Saldototalcuentassectorrealcoe + Saldocuenta;
                                                                        Cantidadcuentasesctorrealcoe = Cantidadcuentasesctorrealcoe + 1;

                                                                        String estadocuenta = Atributonodocuenta.getAttribute("estadoActual");

                                                                        if (estadocuenta.equals("Al dÃ­a")) {
                                                                            Cantidadcuentassectorrealaldiacoe = Cantidadcuentassectorrealaldiacoe + 1;
                                                                            Saldocuentaaldiasectorsrealcoe = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                            SaldoTotalCuotaaldiaSectorRealcoe = SaldoTotalCuotaaldiaSectorRealcoe + Saldocuentaaldiasectorsrealcoe;
                                                                        }
                                                                        
                                                                        if (estadocuenta.equals("En mora")) {
                                                                            //Obtener valor cuota mes
                                                                            Cuotamesenmorasectorrealsumacoe = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));
                                                                            //Obtner valor de la cuota mes
                                                                            CuotamesEnmoraSectorRealcoe = CuotamesEnmoraSectorRealcoe + Cuotamesenmorasectorrealsumacoe;
                                                                            Cantidadcuentassectorrealenmoracoe = Cantidadcuentassectorrealenmoracoe + 1;
                                                                            Saldocuentaenmorasectorrealcoe = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                            SaldoTotalCuotaenmoraSectorRealcoe = SaldoTotalCuotaenmoraSectorRealcoe + Saldocuentaenmorasectorrealcoe;
                                                                        }

                                                                        //Valor cuota 
                                                                        Valorcuotasectorrealprincipalsumacoe = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));
                                                                        Valorcuotasectorrealprincipalcoe = Valorcuotasectorrealprincipalcoe + Valorcuotasectorrealprincipalsumacoe;

                                                                        //Valor en mora
                                                                        Valorenmorasectorrealprincipalsumacoe = Double.parseDouble(Atributonodocuenta.getAttribute("saldoMora"));
                                                                        Valorenmorasectorrealprincipalcoe = Valorenmorasectorrealprincipalcoe + Valorenmorasectorrealprincipalsumacoe;

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

       


        //Valida que el nodo exista y que sea de tipo nodo
        if (Endeudamiento != null && Endeudamiento.getNodeType() == Node.ELEMENT_NODE) {
            for (int i = 0; i < Endeudamiento.getChildNodes().getLength(); i++) {

                if (Endeudamiento.getChildNodes().item(i).getNodeName().equals("Sector")) {
                    SubNodociclosector = Endeudamiento.getChildNodes().item(i);
                    //Valida que el nodo exista y que sea de tipo nodo
                    if (SubNodociclosector != null && SubNodociclosector.getNodeType() == Node.ELEMENT_NODE) {
                        Element Atributosector = (Element) SubNodociclosector;
                        //SEGMENTO CANTIDADES Y SALDOS TOTALES COMO PRINCIAL
                        //<<SEGMENTO DE CODIGO PARA SACAR LOS DATOS DE TARJETAS DE CRÉDITOS COMO PPAL>>
                        if (Atributosector.getAttribute("codSector").equals("1")) {
                            for (int j = 0; j < SubNodociclosector.getChildNodes().getLength(); j++) {
                                if (SubNodociclosector.getChildNodes().item(j).getNodeName().equals("TipoCuenta")) {
                                    SubNodotipocuenta = SubNodociclosector.getChildNodes().item(j);
                                    //Valida que el nodo exista y que sea de tipo nodo
                                    if (SubNodotipocuenta != null && SubNodotipocuenta.getNodeType() == Node.ELEMENT_NODE) {
                                        Element Atributotipocuenta = (Element) SubNodotipocuenta;
                                        //VALIDA QUE SOLO SEA TIPO DE CUENTA TARJETA DE CREDITO
                                        if (Atributotipocuenta.getAttribute("tipoCuenta").equals("TDC")) {
                                            for (int k = 0; k < SubNodotipocuenta.getChildNodes().getLength(); k++) {
                                                if (SubNodotipocuenta.getChildNodes().item(k).getNodeName().equals("Usuario")) {
                                                    SubNodotipousuario = SubNodotipocuenta.getChildNodes().item(k);
                                                    //Valida que el nodo exista y que sea de tipo nodo
                                                    if (SubNodotipousuario != null && SubNodotipousuario.getNodeType() == Node.ELEMENT_NODE) {
                                                        Element Atributonodousuario = (Element) SubNodotipousuario;
                                                        if (Atributonodousuario.getAttribute("tipoUsuario").equals("Principal")) {
                                                            for (int l = 0; l < SubNodotipousuario.getChildNodes().getLength(); l++) {
                                                                if (SubNodotipousuario.getChildNodes().item(l).getNodeName().equals("Cuenta")) {
                                                                    //Valida que el nodo exista y que sea de tipo nodo
                                                                    SubNodocuenta = SubNodotipousuario.getChildNodes().item(l);
                                                                    if (SubNodocuenta != null && SubNodocuenta.getNodeType() == Node.ELEMENT_NODE) {
                                                                        Element Atributonodocuenta = (Element) SubNodocuenta;
                                                                        Saldocuenta = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));

                                                                        if (Saldocuenta > 0) {
                                                                            //Obtiene la cantidad de tarjetas sin tener en cuenta cual esta al dia o en mora
                                                                            Saldotarjetacredito = Saldotarjetacredito + Saldocuenta;
                                                                            Contadortarjetas = Contadortarjetas + 1;

                                                                            String estadotarjetppal = Atributonodocuenta.getAttribute("estadoActual");

                                                                            //Valida el estado de la tarjeta
                                                                            if (estadotarjetppal.equals("Al dÃ­a")) {
                                                                                CantTarjetasaldiappal = CantTarjetasaldiappal + 1;
                                                                                Saldocuentaestadotarjetaaldia = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                                SaldoTarjetacreditoaldiappal = SaldoTarjetacreditoaldiappal + Saldocuentaestadotarjetaaldia;

                                                                            }
                                                                            if (estadotarjetppal.equals("En mora")) {
                                                                                //Obtener valorcuota mes
                                                                                SaldocuotaenmoraTDC = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));
                                                                                //Obtner valor de la cuota mes
                                                                                Cuotamestrajetacreditoenmora = Cuotamestrajetacreditoenmora + SaldocuotaenmoraTDC;
                                                                                CantTarjetasenmorappal = CantTarjetasenmorappal + 1;
                                                                                Saldocuentaestadotarjetaenmora = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                                SaldoTarjetacreditoenmorappal = SaldoTarjetacreditoenmorappal + Saldocuentaestadotarjetaenmora;

                                                                            }

                                                                            //Valor cuota 
                                                                            Valorcuotatarjetacreditoppalsuma = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));
                                                                            Valorcuotatarjetacreditoppal = Valorcuotatarjetacreditoppal + Valorcuotatarjetacreditoppalsuma;

                                                                            //Valor en mora
                                                                            Valorenmoratarjetacreditoppalsuma = Double.parseDouble(Atributonodocuenta.getAttribute("saldoMora"));
                                                                            Valorenmoratarjetacreditoppal = Valorenmoratarjetacreditoppal + Valorenmoratarjetacreditoppalsuma;

                                                                        }
                                                                    }
                                                                }
                                                            }

                                                        }
                                                    }

                                                }

                                            }
                                        }
                                        //VALIDA TODO TIPO DE CUENTA SIN INCLUIR TARJETA DE CREDITO PRINCIPAL
                                        if (!Atributotipocuenta.getAttribute("tipoCuenta").equals("TDC")) {
                                            for (int k = 0; k < SubNodotipocuenta.getChildNodes().getLength(); k++) {
                                                if (SubNodotipocuenta.getChildNodes().item(k).getNodeName().equals("Usuario")) {
                                                    SubNodotipousuario = SubNodotipocuenta.getChildNodes().item(k);
                                                    //Valida que el nodo exista y que sea de tipo nodo
                                                    if (SubNodotipousuario != null && SubNodotipousuario.getNodeType() == Node.ELEMENT_NODE) {
                                                        Element Atributonodousuario = (Element) SubNodotipousuario;
                                                        if (Atributonodousuario.getAttribute("tipoUsuario").equals("Principal")) {
                                                            for (int l = 0; l < SubNodotipousuario.getChildNodes().getLength(); l++) {
                                                                if (SubNodotipousuario.getChildNodes().item(l).getNodeName().equals("Cuenta")) {
                                                                    //Valida que el nodo exista y que sea de tipo nodo
                                                                    SubNodocuenta = SubNodotipousuario.getChildNodes().item(l);
                                                                    if (SubNodocuenta != null && SubNodocuenta.getNodeType() == Node.ELEMENT_NODE) {
                                                                        Element Atributonodocuenta = (Element) SubNodocuenta;
                                                                        Saldocuenta = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));

                                                                        if (Saldocuenta > 0) {
                                                                            Saldototalcuentassectorfinanciero = Saldototalcuentassectorfinanciero + Saldocuenta;
                                                                            Cantidadcuentasesctorfinanciero = Cantidadcuentasesctorfinanciero + 1;
                                                                            //Obtner valor de la cuota mes

                                                                            SaldocuotamesmoradiSectorFinanciero = SaldocuotamesmoradiSectorFinanciero + Saldocuotaenmorasectorfinancierosuma;
                                                                            String estadotarjetppal = Atributonodocuenta.getAttribute("estadoActual");

                                                                            //Valida el estado de la tarjeta
                                                                            if (estadotarjetppal.equals("Al dÃ­a")) {
                                                                                Cantidadcuentasaldiasectorfinanciero = Cantidadcuentasaldiasectorfinanciero + 1;
                                                                                Saldocuentaaldiasectorfinanciero = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                                SaldoTotalCuotaaldiaSectorFinan = SaldoTotalCuotaaldiaSectorFinan + Saldocuentaaldiasectorfinanciero;
                                                                            }
                                                                            if (estadotarjetppal.equals("En mora")) {
                                                                                //Obtener valor cuota mes
                                                                                Saldocuotaenmorasectorfinancierosuma = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));
                                                                                //Obtner valor de la cuota mes
                                                                                SaldocuotamesmoradiSectorFinanciero = SaldocuotamesmoradiSectorFinanciero + Saldocuotaenmorasectorfinancierosuma;
                                                                                Cantidadcuentasenmorasectorfinanciero = Cantidadcuentasenmorasectorfinanciero + 1;
                                                                                Saldocuentaenmorasectorfinanciero = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                                SaldoTotalCuotaenmoraSectorFinan = SaldoTotalCuotaenmoraSectorFinan + Saldocuentaenmorasectorfinanciero;
                                                                            }

                                                                            //Valor cuota 
                                                                            Valorcuotasectorfinancieroppalsuma = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));
                                                                            Valorcuotasectorfinancieroppal = Valorcuotasectorfinancieroppal + Valorcuotasectorfinancieroppalsuma;

                                                                            //Valor en mora
                                                                            Valorenmorasectorfinancieropalsuma = Double.parseDouble(Atributonodocuenta.getAttribute("saldoMora"));
                                                                            Valorenmorasectorfinancieroppal = Valorenmorasectorfinancieroppal + Valorenmorasectorfinancieropalsuma;
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
                        //<<SEGMENTO DE CODIGO PARA SACAR LOS DATOS SEL SECTOR SOLIDARIO PRINCIPAL>>
                        if (Atributosector.getAttribute("codSector").equals("2")) {
                            for (int j = 0; j < SubNodociclosector.getChildNodes().getLength(); j++) {
                                if (SubNodociclosector.getChildNodes().item(j).getNodeName().equals("TipoCuenta")) {
                                    SubNodotipocuenta = SubNodociclosector.getChildNodes().item(j);
                                    //Valida que el nodo exista y que sea de tipo nodo
                                    if (SubNodotipocuenta != null && SubNodotipocuenta.getNodeType() == Node.ELEMENT_NODE) {
                                        Element Atributotipocuenta = (Element) SubNodotipocuenta;
                                        //OJO VALIDAR TIPOS DE TARJETAS
                                        if (!Atributotipocuenta.getAttribute("tipoCuenta").equals("TDC")) {
                                        for (int k = 0; k < SubNodotipocuenta.getChildNodes().getLength(); k++) {
                                            if (SubNodotipocuenta.getChildNodes().item(k).getNodeName().equals("Usuario")) {
                                                SubNodotipousuario = SubNodotipocuenta.getChildNodes().item(k);
                                                //Valida que el nodo exista y que sea de tipo nodo
                                                if (SubNodotipousuario != null && SubNodotipousuario.getNodeType() == Node.ELEMENT_NODE) {
                                                    Element Atributonodousuario = (Element) SubNodotipousuario;
                                                    if (Atributonodousuario.getAttribute("tipoUsuario").equals("Principal")) {
                                                        for (int l = 0; l < SubNodotipousuario.getChildNodes().getLength(); l++) {
                                                            if (SubNodotipousuario.getChildNodes().item(l).getNodeName().equals("Cuenta")) {
                                                                //Valida que el nodo exista y que sea de tipo nodo
                                                                SubNodocuenta = SubNodotipousuario.getChildNodes().item(l);
                                                                if (SubNodocuenta != null && SubNodocuenta.getNodeType() == Node.ELEMENT_NODE) {
                                                                    Element Atributonodocuenta = (Element) SubNodocuenta;
                                                                    Saldocuenta = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                    if (Saldocuenta > 0) {
                                                                        Saldototalcuentassectorsolidario = Saldototalcuentassectorsolidario + Saldocuenta;
                                                                        Cantidadcuentasesctorsolidario = Cantidadcuentasesctorsolidario + 1;

                                                                        String estadocuenta = Atributonodocuenta.getAttribute("estadoActual");

                                                                        if (estadocuenta.equals("Al dÃ­a")) {
                                                                            Cantidadcuentassectorsolidarioaldia = Cantidadcuentassectorsolidarioaldia + 1;
                                                                            Saldocuentaaldiasectorsolidario = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                            SaldoTotalCuotaaldiaSectorSolidario = SaldoTotalCuotaaldiaSectorSolidario + Saldocuentaaldiasectorsolidario;

                                                                        }
                                                                        if (estadocuenta.equals("En mora")) {
                                                                            //Obtener valor cuota mes
                                                                            Cuotamesenmorasectorsolidariosuma = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));
                                                                            //Obtner valor de la cuota mes
                                                                            CuotamesEnmoraSectorSolidario = CuotamesEnmoraSectorSolidario + Cuotamesenmorasectorsolidariosuma;
                                                                            Cantidadcuentassectorsolidarioenmora = Cantidadcuentassectorsolidarioenmora + 1;
                                                                            Saldocuentaenmorasectorsolidario = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                            SaldoTotalCuotaenmoraSectorSolidario = SaldoTotalCuotaenmoraSectorSolidario + Saldocuentaenmorasectorsolidario;

                                                                        }

                                                                        //Valor cuota 
                                                                        Valorcuotasectorsolidarioprincipalsuma = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));
                                                                        Valorcuotasectorsolidarioprincipal = Valorcuotasectorsolidarioprincipal + Valorcuotasectorsolidarioprincipalsuma;

                                                                        //Valor en mora
                                                                        Valorenmorasectorsolidarioprincipalsuma = Double.parseDouble(Atributonodocuenta.getAttribute("saldoMora"));
                                                                        Valorenmorasectorsolidarioprincipal = Valorenmorasectorsolidarioprincipal + Valorenmorasectorsolidarioprincipalsuma;
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

                        //<<SEGMENTO DE CODIGO PARA SACAR LOS DATOS SEL SECTOR REAL PRINCIPAL>>
                        if (Atributosector.getAttribute("codSector").equals("3")) {
                            for (int j = 0; j < SubNodociclosector.getChildNodes().getLength(); j++) {
                                if (SubNodociclosector.getChildNodes().item(j).getNodeName().equals("TipoCuenta")) {
                                    SubNodotipocuenta = SubNodociclosector.getChildNodes().item(j);
                                    //Valida que el nodo exista y que sea de tipo nodo
                                    if (SubNodotipocuenta != null && SubNodotipocuenta.getNodeType() == Node.ELEMENT_NODE) {
                                        Element Atributotipocuenta = (Element) SubNodotipocuenta;
                                        //OJO VALIDAR TIPOS DE TARJETAS
                                        if (!Atributotipocuenta.getAttribute("tipoCuenta").equals("TDC")) {
                                        for (int k = 0; k < SubNodotipocuenta.getChildNodes().getLength(); k++) {
                                            if (SubNodotipocuenta.getChildNodes().item(k).getNodeName().equals("Usuario")) {
                                                SubNodotipousuario = SubNodotipocuenta.getChildNodes().item(k);
                                                //Valida que el nodo exista y que sea de tipo nodo
                                                if (SubNodotipousuario != null && SubNodotipousuario.getNodeType() == Node.ELEMENT_NODE) {
                                                    Element Atributonodousuario = (Element) SubNodotipousuario;
                                                    if (Atributonodousuario.getAttribute("tipoUsuario").equals("Principal")) {
                                                        for (int l = 0; l < SubNodotipousuario.getChildNodes().getLength(); l++) {
                                                            if (SubNodotipousuario.getChildNodes().item(l).getNodeName().equals("Cuenta")) {
                                                                //Valida que el nodo exista y que sea de tipo nodo
                                                                SubNodocuenta = SubNodotipousuario.getChildNodes().item(l);
                                                                if (SubNodocuenta != null && SubNodocuenta.getNodeType() == Node.ELEMENT_NODE) {
                                                                    Element Atributonodocuenta = (Element) SubNodocuenta;
                                                                    Saldocuenta = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                    if (Saldocuenta > 0) {
                                                                        Saldototalcuentassectorreal = Saldototalcuentassectorreal + Saldocuenta;
                                                                        Cantidadcuentasesctorreal = Cantidadcuentasesctorreal + 1;

                                                                        String estadocuenta = Atributonodocuenta.getAttribute("estadoActual");

                                                                        if (estadocuenta.equals("Al dÃ­a")) {
                                                                            Cantidadcuentassectorrealaldia = Cantidadcuentassectorrealaldia + 1;
                                                                            Saldocuentaaldiasectorsreal = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                            SaldoTotalCuotaaldiaSectorReal = SaldoTotalCuotaaldiaSectorReal + Saldocuentaaldiasectorsreal;
                                                                        }
                                                                        if (estadocuenta.equals("En mora")) {
                                                                            //Obtener valor cuota mes
                                                                            Cuotamesenmorasectorrealsuma = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));
                                                                            //Obtner valor de la cuota mes
                                                                            CuotamesEnmoraSectorReal = CuotamesEnmoraSectorReal + Cuotamesenmorasectorrealsuma;
                                                                            Cantidadcuentassectorrealenmora = Cantidadcuentassectorrealenmora + 1;
                                                                            Saldocuentaenmorasectorreal = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                            SaldoTotalCuotaenmoraSectorReal = SaldoTotalCuotaenmoraSectorReal + Saldocuentaenmorasectorreal;
                                                                        }

                                                                        //Valor cuota 
                                                                        Valorcuotasectorrealprincipalsuma = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));
                                                                        Valorcuotasectorrealprincipal = Valorcuotasectorrealprincipal + Valorcuotasectorrealprincipalsuma;

                                                                        //Valor en mora
                                                                        Valorenmorasectorrealprincipalsuma = Double.parseDouble(Atributonodocuenta.getAttribute("saldoMora"));
                                                                        Valorenmorasectorrealprincipal = Valorenmorasectorrealprincipal + Valorenmorasectorrealprincipalsuma;

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

                        //SEGMENTO CANTIDADES Y SALDOS TOTALES COMO CODEUDOR
                        //<<SEGMENTO DE CODIGO PARA SACAR LOS DATOS DE TARJETAS DE CRÉDITOS COMO CODEUDOR>>
                        if (Atributosector.getAttribute("codSector").equals("1")) {
                            for (int j = 0; j < SubNodociclosector.getChildNodes().getLength(); j++) {
                                if (SubNodociclosector.getChildNodes().item(j).getNodeName().equals("TipoCuenta")) {
                                    SubNodotipocuenta = SubNodociclosector.getChildNodes().item(j);
                                    //Valida que el nodo exista y que sea de tipo nodo
                                    if (SubNodotipocuenta != null && SubNodotipocuenta.getNodeType() == Node.ELEMENT_NODE) {
                                        Element Atributotipocuenta = (Element) SubNodotipocuenta;
                                        //VALIDA QUE SOLO SEA TIPO DE CUENTA TARJETA DE CREDITO
                                        if (Atributotipocuenta.getAttribute("tipoCuenta").equals("TDC")) {
                                            for (int k = 0; k < SubNodotipocuenta.getChildNodes().getLength(); k++) {
                                                if (SubNodotipocuenta.getChildNodes().item(k).getNodeName().equals("Usuario")) {
                                                    SubNodotipousuario = SubNodotipocuenta.getChildNodes().item(k);
                                                    //Valida que el nodo exista y que sea de tipo nodo
                                                    if (SubNodotipousuario != null && SubNodotipousuario.getNodeType() == Node.ELEMENT_NODE) {
                                                        Element Atributonodousuario = (Element) SubNodotipousuario;
                                                        if (Atributonodousuario.getAttribute("tipoUsuario").equals("Codeudor")) {
                                                            for (int l = 0; l < SubNodotipousuario.getChildNodes().getLength(); l++) {
                                                                if (SubNodotipousuario.getChildNodes().item(l).getNodeName().equals("Cuenta")) {
                                                                    //Valida que el nodo exista y que sea de tipo nodo
                                                                    SubNodocuenta = SubNodotipousuario.getChildNodes().item(l);
                                                                    if (SubNodocuenta != null && SubNodocuenta.getNodeType() == Node.ELEMENT_NODE) {
                                                                        Element Atributonodocuenta = (Element) SubNodocuenta;
                                                                        Saldocuenta = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));

                                                                        if (Saldocuenta > 0) {
                                                                            //Obtiene la cantidad de tarjetas sin tener en cuenta cual esta al dia o en mora
                                                                            Saldotarjetacreditocoe = Saldotarjetacreditocoe + Saldocuenta;
                                                                            Contadortarjetascoe = Contadortarjetascoe + 1;

                                                                            String estadotarjetppal = Atributonodocuenta.getAttribute("estadoActual");

                                                                            //Valida el estado de la tarjeta
                                                                            if (estadotarjetppal.equals("Al dÃ­a")) {
                                                                                CantTarjetasaldiappalcoe = CantTarjetasaldiappalcoe + 1;
                                                                                Saldocuentaestadotarjetaaldiacoe = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                                SaldoTarjetacreditoaldiappalcoe = SaldoTarjetacreditoaldiappalcoe + Saldocuentaestadotarjetaaldiacoe;

                                                                            }
                                                                            if (estadotarjetppal.equals("En mora")) {
                                                                                //Obtener valorcuota mes
                                                                                SaldocuotaenmoraTDCcoe = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));
                                                                                //Obtner valor de la cuota mes
                                                                                Cuotamestrajetacreditoenmoracoe = Cuotamestrajetacreditoenmoracoe + SaldocuotaenmoraTDCcoe;
                                                                                CantTarjetasenmorappalcoe = CantTarjetasenmorappalcoe + 1;
                                                                                Saldocuentaestadotarjetaenmoracoe = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                                SaldoTarjetacreditoenmorappalcoe = SaldoTarjetacreditoenmorappalcoe + Saldocuentaestadotarjetaenmoracoe;

                                                                            }

                                                                            //Valor cuota 
                                                                            Valorcuotatarjetacreditoppalsumacoe = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));
                                                                            Valorcuotatarjetacreditoppalcoe = Valorcuotatarjetacreditoppalcoe + Valorcuotatarjetacreditoppalsumacoe;

                                                                            //Valor en mora
                                                                            Valorenmoratarjetacreditoppalsumacoe = Double.parseDouble(Atributonodocuenta.getAttribute("saldoMora"));
                                                                            Valorenmoratarjetacreditoppalcoe = Valorenmoratarjetacreditoppalcoe + Valorenmoratarjetacreditoppalsumacoe;

                                                                        }
                                                                    }
                                                                }
                                                            }

                                                        }
                                                    }

                                                }

                                            }
                                        }
                                        //VALIDA TODO TIPO DE CUENTA SIN INCLUIR TARJETA DE CREDITO CODEUDOR
                                        if (!Atributotipocuenta.getAttribute("tipoCuenta").equals("TDC")) {
                                            for (int k = 0; k < SubNodotipocuenta.getChildNodes().getLength(); k++) {
                                                if (SubNodotipocuenta.getChildNodes().item(k).getNodeName().equals("Usuario")) {
                                                    SubNodotipousuario = SubNodotipocuenta.getChildNodes().item(k);
                                                    //Valida que el nodo exista y que sea de tipo nodo
                                                    if (SubNodotipousuario != null && SubNodotipousuario.getNodeType() == Node.ELEMENT_NODE) {
                                                        Element Atributonodousuario = (Element) SubNodotipousuario;
                                                        if (Atributonodousuario.getAttribute("tipoUsuario").equals("Codeudor")) {
                                                            for (int l = 0; l < SubNodotipousuario.getChildNodes().getLength(); l++) {
                                                                if (SubNodotipousuario.getChildNodes().item(l).getNodeName().equals("Cuenta")) {
                                                                    //Valida que el nodo exista y que sea de tipo nodo
                                                                    SubNodocuenta = SubNodotipousuario.getChildNodes().item(l);
                                                                    if (SubNodocuenta != null && SubNodocuenta.getNodeType() == Node.ELEMENT_NODE) {
                                                                        Element Atributonodocuenta = (Element) SubNodocuenta;
                                                                        Saldocuenta = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));

                                                                        if (Saldocuenta > 0) {
                                                                            Saldototalcuentassectorfinancierocoe = Saldototalcuentassectorfinancierocoe + Saldocuenta;
                                                                            Cantidadcuentasesctorfinancierocoe = Cantidadcuentasesctorfinancierocoe + 1;
                                                                            //Obtner valor de la cuota mes

                                                                            SaldocuotamesmoradiSectorFinancierocoe = SaldocuotamesmoradiSectorFinancierocoe + Saldocuotaenmorasectorfinancierosumacoe;
                                                                            String estadotarjetppal = Atributonodocuenta.getAttribute("estadoActual");

                                                                            //Valida el estado de la tarjeta
                                                                            if (estadotarjetppal.equals("Al dÃ­a")) {
                                                                                Cantidadcuentasaldiasectorfinancierocoe = Cantidadcuentasaldiasectorfinancierocoe + 1;
                                                                                Saldocuentaaldiasectorfinancierocoe = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                                SaldoTotalCuotaaldiaSectorFinancoe = SaldoTotalCuotaaldiaSectorFinancoe + Saldocuentaaldiasectorfinancierocoe;
                                                                            }
                                                                            if (estadotarjetppal.equals("En mora")) {
                                                                                //Obtener valor cuota mes
                                                                                Saldocuotaenmorasectorfinancierosumacoe = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));
                                                                                //Obtner valor de la cuota mes
                                                                                SaldocuotamesmoradiSectorFinancierocoe = SaldocuotamesmoradiSectorFinancierocoe + Saldocuotaenmorasectorfinancierosumacoe;
                                                                                Cantidadcuentasenmorasectorfinancierocoe = Cantidadcuentasenmorasectorfinancierocoe + 1;
                                                                                Saldocuentaenmorasectorfinancierocoe = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                                SaldoTotalCuotaenmoraSectorFinancoe = SaldoTotalCuotaenmoraSectorFinancoe + Saldocuentaenmorasectorfinancierocoe;
                                                                            }

                                                                            //Valor cuota 
                                                                            Valorcuotasectorfinancieroppalsumacoe = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));
                                                                            Valorcuotasectorfinancieroppalcoe = Valorcuotasectorfinancieroppalcoe + Valorcuotasectorfinancieroppalsumacoe;

                                                                            //Valor en mora
                                                                            Valorenmorasectorfinancieropalsumacoe = Double.parseDouble(Atributonodocuenta.getAttribute("saldoMora"));
                                                                            Valorenmorasectorfinancieroppalcoe = Valorenmorasectorfinancieroppalcoe + Valorenmorasectorfinancieropalsumacoe;
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
                        //<<SEGMENTO DE CODIGO PARA SACAR LOS DATOS SEL SECTOR SOLIDARIO CODEUDOR>>
                        if (Atributosector.getAttribute("codSector").equals("2")) {
                            for (int j = 0; j < SubNodociclosector.getChildNodes().getLength(); j++) {
                                if (SubNodociclosector.getChildNodes().item(j).getNodeName().equals("TipoCuenta")) {
                                    SubNodotipocuenta = SubNodociclosector.getChildNodes().item(j);
                                    //Valida que el nodo exista y que sea de tipo nodo
                                    if (SubNodotipocuenta != null && SubNodotipocuenta.getNodeType() == Node.ELEMENT_NODE) {
                                        Element Atributotipocuenta = (Element) SubNodotipocuenta;
                                        //OJO VALIDAR TIPOS DE TARJETAS
                                       if (!Atributotipocuenta.getAttribute("tipoCuenta").equals("TDC")) {
                                        for (int k = 0; k < SubNodotipocuenta.getChildNodes().getLength(); k++) {
                                            if (SubNodotipocuenta.getChildNodes().item(k).getNodeName().equals("Usuario")) {
                                                SubNodotipousuario = SubNodotipocuenta.getChildNodes().item(k);
                                                //Valida que el nodo exista y que sea de tipo nodo
                                                if (SubNodotipousuario != null && SubNodotipousuario.getNodeType() == Node.ELEMENT_NODE) {
                                                    Element Atributonodousuario = (Element) SubNodotipousuario;
                                                    if (Atributonodousuario.getAttribute("tipoUsuario").equals("Codeudor")) {
                                                        for (int l = 0; l < SubNodotipousuario.getChildNodes().getLength(); l++) {
                                                            if (SubNodotipousuario.getChildNodes().item(l).getNodeName().equals("Cuenta")) {
                                                                //Valida que el nodo exista y que sea de tipo nodo
                                                                SubNodocuenta = SubNodotipousuario.getChildNodes().item(l);
                                                                if (SubNodocuenta != null && SubNodocuenta.getNodeType() == Node.ELEMENT_NODE) {
                                                                    Element Atributonodocuenta = (Element) SubNodocuenta;
                                                                    Saldocuenta = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                    if (Saldocuenta > 0) {
                                                                        Saldototalcuentassectorsolidariocoe = Saldototalcuentassectorsolidariocoe + Saldocuenta;
                                                                        Cantidadcuentasesctorsolidariocoe = Cantidadcuentasesctorsolidariocoe + 1;

                                                                        String estadocuenta = Atributonodocuenta.getAttribute("estadoActual");

                                                                        if (estadocuenta.equals("Al dÃ­a")) {
                                                                            Cantidadcuentassectorsolidarioaldiacoe = Cantidadcuentassectorsolidarioaldiacoe + 1;
                                                                            Saldocuentaaldiasectorsolidariocoe = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                            SaldoTotalCuotaaldiaSectorSolidariocoe = SaldoTotalCuotaaldiaSectorSolidariocoe + Saldocuentaaldiasectorsolidariocoe;
                                                                       
                                                                        }
                                                                        if (estadocuenta.equals("En mora")) {
                                                                            //Obtener valor cuota mes
                                                                            Cuotamesenmorasectorsolidariosumacoe = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));
                                                                            //Obtner valor de la cuota mes
                                                                            CuotamesEnmoraSectorSolidariocoe = CuotamesEnmoraSectorSolidariocoe + Cuotamesenmorasectorsolidariosumacoe;
                                                                            Cantidadcuentassectorsolidarioenmoracoe = Cantidadcuentassectorsolidarioenmoracoe + 1;
                                                                            Saldocuentaenmorasectorsolidariocoe = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                            SaldoTotalCuotaenmoraSectorSolidariocoe = SaldoTotalCuotaenmoraSectorSolidariocoe + Saldocuentaenmorasectorsolidariocoe;

                                                                        }

                                                                        //Valor cuota 
                                                                        Valorcuotasectorsolidarioprincipalsumacoe = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));
                                                                        Valorcuotasectorsolidarioprincipalcoe = Valorcuotasectorsolidarioprincipalcoe + Valorcuotasectorsolidarioprincipalsumacoe;

                                                                        //Valor en mora
                                                                        Valorenmorasectorsolidarioprincipalsumacoe = Double.parseDouble(Atributonodocuenta.getAttribute("saldoMora"));
                                                                        Valorenmorasectorsolidarioprincipalcoe = Valorenmorasectorsolidarioprincipalcoe + Valorenmorasectorsolidarioprincipalsumacoe;
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

                        //<<SEGMENTO DE CODIGO PARA SACAR LOS DATOS SEL SECTOR REAL CODEUDOR>>
                        if (Atributosector.getAttribute("codSector").equals("3")) {
                            for (int j = 0; j < SubNodociclosector.getChildNodes().getLength(); j++) {
                                if (SubNodociclosector.getChildNodes().item(j).getNodeName().equals("TipoCuenta")) {
                                    SubNodotipocuenta = SubNodociclosector.getChildNodes().item(j);
                                    //Valida que el nodo exista y que sea de tipo nodo
                                    if (SubNodotipocuenta != null && SubNodotipocuenta.getNodeType() == Node.ELEMENT_NODE) {
                                        Element Atributotipocuenta = (Element) SubNodotipocuenta;
                                        //OJO VALIDAR TIPOS DE TARJETAS
                                        if (!Atributotipocuenta.getAttribute("tipoCuenta").equals("TDC")) {
                                        for (int k = 0; k < SubNodotipocuenta.getChildNodes().getLength(); k++) {
                                            if (SubNodotipocuenta.getChildNodes().item(k).getNodeName().equals("Usuario")) {
                                                SubNodotipousuario = SubNodotipocuenta.getChildNodes().item(k);
                                                //Valida que el nodo exista y que sea de tipo nodo
                                                if (SubNodotipousuario != null && SubNodotipousuario.getNodeType() == Node.ELEMENT_NODE) {
                                                    Element Atributonodousuario = (Element) SubNodotipousuario;
                                                    if (Atributonodousuario.getAttribute("tipoUsuario").equals("Codeudor")) {
                                                        for (int l = 0; l < SubNodotipousuario.getChildNodes().getLength(); l++) {
                                                            if (SubNodotipousuario.getChildNodes().item(l).getNodeName().equals("Cuenta")) {
                                                                //Valida que el nodo exista y que sea de tipo nodo
                                                                SubNodocuenta = SubNodotipousuario.getChildNodes().item(l);
                                                                if (SubNodocuenta != null && SubNodocuenta.getNodeType() == Node.ELEMENT_NODE) {
                                                                    Element Atributonodocuenta = (Element) SubNodocuenta;
                                                                    Saldocuenta = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                    if (Saldocuenta > 0) {
                                                                        Saldototalcuentassectorrealcoe = Saldototalcuentassectorrealcoe + Saldocuenta;
                                                                        Cantidadcuentasesctorrealcoe = Cantidadcuentasesctorrealcoe + 1;

                                                                        String estadocuenta = Atributonodocuenta.getAttribute("estadoActual");

                                                                        if (estadocuenta.equals("Al dÃ­a")) {
                                                                            Cantidadcuentassectorrealaldiacoe = Cantidadcuentassectorrealaldiacoe + 1;
                                                                            Saldocuentaaldiasectorsrealcoe = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                            SaldoTotalCuotaaldiaSectorRealcoe = SaldoTotalCuotaaldiaSectorRealcoe + Saldocuentaaldiasectorsrealcoe;
                                                                        }
                                                                        if (estadocuenta.equals("En mora")) {
                                                                            //Obtener valor cuota mes
                                                                            Cuotamesenmorasectorrealsumacoe = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));
                                                                            //Obtner valor de la cuota mes
                                                                            CuotamesEnmoraSectorRealcoe = CuotamesEnmoraSectorRealcoe + Cuotamesenmorasectorrealsumacoe;
                                                                            Cantidadcuentassectorrealenmoracoe = Cantidadcuentassectorrealenmoracoe + 1;
                                                                            Saldocuentaenmorasectorrealcoe = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                            SaldoTotalCuotaenmoraSectorRealcoe = SaldoTotalCuotaenmoraSectorRealcoe + Saldocuentaenmorasectorrealcoe;
                                                                        }

                                                                        //Valor cuota 
                                                                        Valorcuotasectorrealprincipalsumacoe = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));
                                                                        Valorcuotasectorrealprincipalcoe = Valorcuotasectorrealprincipalcoe + Valorcuotasectorrealprincipalsumacoe;

                                                                        //Valor en mora
                                                                        Valorenmorasectorrealprincipalsumacoe = Double.parseDouble(Atributonodocuenta.getAttribute("saldoMora"));
                                                                        Valorenmorasectorrealprincipalcoe = Valorenmorasectorrealprincipalcoe + Valorenmorasectorrealprincipalsumacoe;

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

            //Captura de datos resumen endeudamiento como principal datos totales;
            TarjcreditoCantTotalesPpal = Contadortarjetas;
            TarjcreditoSaldoTotalesPpal = Saldotarjetacredito;
            SectorFinanCantTotalesPpal = Cantidadcuentasesctorfinanciero;
            SectorFinanSaldoTotalesPpal = Saldototalcuentassectorfinanciero;
            SectorSolidCantTotalesPpal = Cantidadcuentasesctorsolidario;
            SectorSolidSaldoTotalesPpal = Saldototalcuentassectorsolidario;
            SectorRealCantTotalesPpal = Cantidadcuentasesctorreal;
            SectorRealSaldoTotalesPpal = Saldototalcuentassectorreal;
            //Suma de totales
            Cantidadsumatotalescuentasprincipal = Contadortarjetas + Cantidadcuentasesctorfinanciero + Cantidadcuentasesctorsolidario + Cantidadcuentasesctorreal;
            Saldototaltotalescuentasprincipal = Saldotarjetacredito + Saldototalcuentassectorfinanciero + Saldototalcuentassectorsolidario + Saldototalcuentassectorreal;
            SaldoTotalPpalCantTotalesPpal = Cantidadsumatotalescuentasprincipal;
            SaldoTotalPpalSaldoTotalesPpal = Saldototaltotalescuentasprincipal;

            //Captura de datos resumen endeudamiento como coedudor datos totales;
            TarjcreditoCantTotalesCoe = Contadortarjetascoe;
            TarjcreditoSaldoTotalesCoe = Saldotarjetacreditocoe;
            SectorFinanCantTotalesCoe = Cantidadcuentasesctorfinancierocoe;
            SectorFinanSaldoTotalesCoe = Saldototalcuentassectorfinancierocoe;
            SectorSolidCantTotalesCoe = Cantidadcuentasesctorsolidariocoe;
            SectorSolidSaldoTotalesCoe = Saldototalcuentassectorsolidariocoe;
            SectorRealCantTotalesCoe = Cantidadcuentasesctorrealcoe;
            SectorRealSaldoTotalesCoe = Saldototalcuentassectorrealcoe;
            //Suma de totales
            Cantidadsumatotalescuentascoedudor = Contadortarjetascoe + Cantidadcuentasesctorfinancierocoe + Cantidadcuentasesctorsolidariocoe + Cantidadcuentasesctorrealcoe;
            Saldototaltotalescuentascoedudor = Saldotarjetacreditocoe + Saldototalcuentassectorfinancierocoe + Saldototalcuentassectorsolidariocoe + Saldototalcuentassectorrealcoe;
            SaldoTotalPpalCantTotalesCoe = Cantidadsumatotalescuentascoedudor;
            SaldoTotalPpalSaldoTotalesCoe = Saldototaltotalescuentascoedudor;

            //Totales para Principal y Coedudor
            Cantidadsumatotalesresumencuentascoedudor = Cantidadsumatotalescuentasprincipal + Cantidadsumatotalescuentascoedudor;
            Saldototaltotalesresumencuentascoedudor = Saldototaltotalescuentasprincipal + Saldototaltotalescuentascoedudor;

            ResumenTotalCantTotalesPpalyCoe = Cantidadsumatotalesresumencuentascoedudor;
            ResumenTotalSaldoTotalesPpalyCoe = Saldototaltotalesresumencuentascoedudor;

            //Obtener datos de cuentas al día principal
            TarjcreditoCantOblaldiaPpal = CantTarjetasaldiappal;
            TarjcreditoSaldoTotalOblaldiaPpal = SaldoTarjetacreditoaldiappal;
            Tarjetacreditopadeppal = ((((SaldoTarjetacreditoaldiappal) / Saldototaltotalescuentasprincipal)) * 100);
            if(Tarjetacreditopadeppal>0){
                TarjcreditoPadeOblaldiaPpal = Math.round(Tarjetacreditopadeppal);
            }else{
                TarjcreditoPadeOblaldiaPpal = 0; 
            }            

            SectorFinanCantOblaldiaPpal = Cantidadcuentasaldiasectorfinanciero;
            SectorFinanSaldoTotalOblaldiaPpal = SaldoTotalCuotaaldiaSectorFinan;
            Padesectorfinancieroppal = ((((SaldoTotalCuotaaldiaSectorFinan) / Saldototaltotalescuentasprincipal)) * 100);
            if(Padesectorfinancieroppal>0){
            SectorFinanPadeOblaldiaPpal = Math.round(Padesectorfinancieroppal);
            }else{
            SectorFinanPadeOblaldiaPpal = 0; 
            }

            SectorSolidCantOblaldiaPpal = Cantidadcuentassectorsolidarioaldia;
            SectorSolidSaldoTotalOblaldiaPpal = SaldoTotalCuotaaldiaSectorSolidario;
            Padesectorsolidario = ((((SaldoTotalCuotaaldiaSectorSolidario) / Saldototaltotalescuentasprincipal)) * 100);
            if(Padesectorsolidario>0){
                SectorSolidPadeOblaldiaPpal = Math.round(Padesectorsolidario);
            }else{
                SectorSolidPadeOblaldiaPpal = 0;
            }

            SectorRealCantOblaldiaPpal = Cantidadcuentassectorrealaldia;
            SectorRealSaldoTotalOblaldiaPpal = SaldoTotalCuotaaldiaSectorReal;
            Padesectorreal = ((((SaldoTotalCuotaaldiaSectorReal) / Saldototaltotalescuentasprincipal)) * 100);
            if(Padesectorreal>0){
                SectorRealPadeOblaldiaPpal = Math.round(Padesectorreal);
            }else{
                SectorRealPadeOblaldiaPpal = 0;
            }

            //Obtener datos de cuentas en mora principal
            TarjcreditoCantOblenmoraPpal = CantTarjetasenmorappal;
            TarjcreditoSaldoTotalenmoraPpal = SaldoTarjetacreditoenmorappal;
            TarjcreditoCuotaOblenmoraPpal = Cuotamestrajetacreditoenmora;

            SectorFinanCuotaOblenmoraPpal = SaldocuotamesmoradiSectorFinanciero;
            SectorFinanCantOblenmoraPpal = Cantidadcuentasenmorasectorfinanciero;
            SectorFinanSaldoTotalenmoraPpal = SaldoTotalCuotaenmoraSectorFinan;

            SectorSolidCuotaOblenmoraPpal = CuotamesEnmoraSectorSolidario;
            SectorSolidCantOblenmoraPpal = Cantidadcuentassectorsolidarioenmora;
            SectorSolidSaldoTotalenmoraPpal = SaldoTotalCuotaenmoraSectorSolidario;

            SectorRealCuotaOblenmoraPpal = CuotamesEnmoraSectorReal;
            SectorRealCantOblenmoraPpal = Cantidadcuentassectorrealenmora;
            SectorRealSaldoTotalenmoraPpal = SaldoTotalCuotaenmoraSectorReal;

            //Obtener valores cuota y valor en mora principal
            TarjcreditoCuotaPpal = Valorcuotatarjetacreditoppal;
            TarjcreditoValenmoraPpal = Valorenmoratarjetacreditoppal;

            SectorFinanCuotaPpal = Valorcuotasectorfinancieroppal;
            SectorFinanValenmoraPpal = Valorenmorasectorfinancieroppal;

            SectorSolidCuotaPpal = Valorcuotasectorsolidarioprincipal;
            SectorSolidValenmoraPpal = Valorenmorasectorsolidarioprincipal;

            SectorRealCuotaPpal = Valorcuotasectorrealprincipal;
            SectorRealValenmoraPpal = Valorenmorasectorrealprincipal;

            //SUBTOTALES FINALES PRINCIPAL
            SaldoTotalPpalPadeOblaldiaPpal2 = (Tarjetacreditopadeppal
                    + Padesectorfinancieroppal
                    + Padesectorsolidario
                    + Padesectorreal);
            if(SaldoTotalPpalPadeOblaldiaPpal2>0){
                SaldoTotalPpalPadeOblaldiaPpal = Math.round(SaldoTotalPpalPadeOblaldiaPpal2);
            }else{
                SaldoTotalPpalPadeOblaldiaPpal  = 0;
            }

            SaldoTotalPpalCantOblaldiaPpal = CantTarjetasaldiappal
                    + Cantidadcuentasaldiasectorfinanciero
                    + Cantidadcuentassectorsolidarioaldia
                    + Cantidadcuentassectorrealaldia;

            SaldoTotalPpalSaldoTotalOblaldiaPpal = SaldoTarjetacreditoaldiappal
                    + SaldoTotalCuotaaldiaSectorFinan
                    + SaldoTotalCuotaaldiaSectorSolidario
                    + SaldoTotalCuotaaldiaSectorReal;

            //Totales en mora
            SaldoTotalPpalCuotaOblenmoraPpal = Cuotamestrajetacreditoenmora
                    + SaldocuotamesmoradiSectorFinanciero
                    + CuotamesEnmoraSectorSolidario
                    + CuotamesEnmoraSectorReal;

            SaldoTotalPpalCantOblenmoraPpal = CantTarjetasenmorappal
                    + Cantidadcuentasenmorasectorfinanciero
                    + Cantidadcuentassectorsolidarioenmora
                    + Cantidadcuentassectorrealenmora;

            SaldoTotalPpalSaldoTotalenmoraPpal = SaldoTarjetacreditoenmorappal
                    + SaldoTotalCuotaenmoraSectorFinan
                    + SaldoTotalCuotaenmoraSectorSolidario
                    + SaldoTotalCuotaenmoraSectorReal;

            SaldoTotalPpalCuotaPpal = Valorcuotatarjetacreditoppal
                    + Valorcuotasectorfinancieroppal
                    + Valorcuotasectorsolidarioprincipal
                    + Valorcuotasectorrealprincipal;

            SaldoTotalPpalValenmoraPpal = Valorenmoratarjetacreditoppal
                    + Valorenmorasectorfinancieroppal
                    + Valorenmorasectorsolidarioprincipal
                    + Valorenmorasectorrealprincipal;

            //Obtener datos de cuentas al día codeudor
            TarjcreditoCantOblaldiaCoe = CantTarjetasaldiappalcoe;
            TarjcreditoSaldoTotalOblaldiaCoe = SaldoTarjetacreditoaldiappalcoe;
            Tarjetacreditopadecoe = ((((SaldoTarjetacreditoaldiappalcoe) / Saldototaltotalescuentascoedudor)) * 100);
            if(Tarjetacreditopadecoe>0){
                TarjcreditoPadeOblaldiaCoe = Math.round(Tarjetacreditopadecoe);
            }else{
                TarjcreditoPadeOblaldiaCoe = 0;
            }
                      
           
            SectorFinanCantOblaldiaCoe = Cantidadcuentasaldiasectorfinancierocoe;
            SectorFinanSaldoTotalOblaldiaCoe = SaldoTotalCuotaaldiaSectorFinancoe;
            Padesectorfinancierocoe = ((((SaldoTotalCuotaaldiaSectorFinancoe) / Saldototaltotalescuentascoedudor)) * 100);
            if(Padesectorfinancierocoe>0){
                SectorFinanPadeOblaldiaCoe = Math.round(Padesectorfinancierocoe);
            }else{
                SectorFinanPadeOblaldiaCoe = 0;
            }
            
            SectorSolidCantOblaldiaCoe = Cantidadcuentassectorsolidarioaldiacoe;
            SectorSolidSaldoTotalOblaldiaCoe = SaldoTotalCuotaaldiaSectorSolidariocoe;
            Padesectorsolidariocoe = ((((SaldoTotalCuotaaldiaSectorSolidariocoe) / Saldototaltotalescuentascoedudor)) * 100);
            if(Padesectorsolidariocoe>0){
                SectorSolidPadeOblaldiaCoe = Math.round(Padesectorsolidariocoe);
            }else{
                SectorSolidPadeOblaldiaCoe = 0;
            }
                     
            SectorRealCantOblaldiaCoe = Cantidadcuentassectorrealaldiacoe;
            SectorRealSaldoTotalOblaldiaCoe = SaldoTotalCuotaaldiaSectorRealcoe;
            Padesectorrealcoe = ((((SaldoTotalCuotaaldiaSectorRealcoe) / Saldototaltotalescuentascoedudor)) * 100);
            if(Padesectorrealcoe>0){
                SectorRealPadeOblaldiaCoe = Math.round(Padesectorrealcoe);
            }else{
                SectorRealPadeOblaldiaCoe = 0; 
            }
                    
            //Obtener datos de cuentas en mora codeudor
            TarjcreditoCantOblenmoraCoe = CantTarjetasenmorappalcoe;
            TarjcreditoSaldoTotalenmoraCoe = SaldoTarjetacreditoenmorappalcoe;
            TarjcreditoCuotaOblenmoraCoe = Cuotamestrajetacreditoenmoracoe;

            SectorFinanCuotaOblenmoraCoe = SaldocuotamesmoradiSectorFinancierocoe;
            SectorFinanCantOblenmoraCoe = Cantidadcuentasenmorasectorfinancierocoe;
            SectorFinanSaldoTotalenmoraCoe = SaldoTotalCuotaenmoraSectorFinancoe;

            SectorSolidCuotaOblenmoraCoe = CuotamesEnmoraSectorSolidariocoe;
            SectorSolidCantOblenmoraCoe = Cantidadcuentassectorsolidarioenmoracoe;
            SectorSolidSaldoTotalenmoraCoe = SaldoTotalCuotaenmoraSectorSolidariocoe;

            SectorRealCuotaOblenmoraCoe = CuotamesEnmoraSectorRealcoe;
            SectorRealCantOblenmoraCoe = Cantidadcuentassectorrealenmoracoe;
            SectorRealSaldoTotalenmoraCoe = SaldoTotalCuotaenmoraSectorRealcoe;

            //Obtener valores cuota y valor en mora codeudor
            TarjcreditoCuotaCoe =  Valorcuotatarjetacreditoppalcoe;
            TarjcreditoValenmoraCoe = Valorenmoratarjetacreditoppalcoe;

            SectorFinanCuotaCoe = Valorcuotasectorfinancieroppalcoe;
            SectorFinanValenmoraCoe = Valorenmorasectorfinancieroppalcoe;

            SectorSolidCuotaCoe = Valorcuotasectorsolidarioprincipalcoe;
            SectorSolidValenmoraCoe = Valorenmorasectorsolidarioprincipalcoe;

            SectorRealCuotaCoe = Valorcuotasectorrealprincipalcoe;
            SectorRealValenmoraCoe = Valorenmorasectorrealprincipalcoe;

            //SUBTOTALES FINALES CODEUDOR
            
            SaldoTotalPadeOblaldiaCoe2 = Tarjetacreditopadecoe
                    + Padesectorfinancierocoe
                    + Padesectorsolidariocoe
                    + Padesectorrealcoe;
            if(SaldoTotalPadeOblaldiaCoe2>0){
                SaldoTotalPadeOblaldiaCoe = Math.round(SaldoTotalPadeOblaldiaCoe2);
            }else{
                SaldoTotalPadeOblaldiaCoe = 0;
            }

            SaldoTotalCantOblaldiaCoe = (CantTarjetasaldiappalcoe
                    + Cantidadcuentasaldiasectorfinancierocoe
                    + Cantidadcuentassectorsolidarioaldiacoe
                    + Cantidadcuentassectorrealaldiacoe);

            SaldoTotalSaldoTotalOblaldiaCoe = (SaldoTarjetacreditoaldiappalcoe
                    + SaldoTotalCuotaaldiaSectorFinancoe
                    + SaldoTotalCuotaaldiaSectorSolidariocoe
                    + SaldoTotalCuotaaldiaSectorRealcoe);
  
            //Totales en mora
            SaldoTotalCuotaOblenmoraCoe = (Cuotamestrajetacreditoenmoracoe
                    + SaldocuotamesmoradiSectorFinancierocoe
                    + CuotamesEnmoraSectorSolidariocoe
                    + CuotamesEnmoraSectorRealcoe);

            SaldoTotalCantOblenmoraCoe = (CantTarjetasenmorappalcoe
                    + Cantidadcuentasenmorasectorfinancierocoe
                    + Cantidadcuentassectorsolidarioenmoracoe
                    + Cantidadcuentassectorrealenmoracoe);

            SectorRealSaldoTotalenmoraCoe = (SaldoTarjetacreditoenmorappalcoe
                    + SaldoTotalCuotaenmoraSectorFinancoe
                    + SaldoTotalCuotaenmoraSectorSolidariocoe
                    + SaldoTotalCuotaenmoraSectorRealcoe);

            SaldoTotalCuotaCoe = (Valorcuotatarjetacreditoppalcoe
                    + Valorcuotasectorfinancieroppalcoe
                    + Valorcuotasectorsolidarioprincipalcoe
                    + Valorcuotasectorrealprincipalcoe);

            SaldoTotalValenmoraCoe = (Valorenmoratarjetacreditoppalcoe
                    + Valorenmorasectorfinancieroppalcoe
                    + Valorenmorasectorsolidarioprincipalcoe
                    + Valorenmorasectorrealprincipalcoe);


            //FORMATO FECHA
            String[] parts = Fechaconsulta.split("T");
            Fecha = parts[0];
            //Horaconsulta = parts[1];
            /*
            System.err.println(
                    "RAIZ XML:" + Nombreraiz
                    + "\nTIPO ID: " + Tipoidentificacion
                    + "\nNUMERO ID:" + Identificacion
                    + "\nNOMBRE APELLIDOS:" + Razonsocial
                    + "\nACTIVIDAD ECONÓMICA:" + Actividadeconomica
                    + "\nESTADO ID:" + Estadodocumento
                    + "\nFECHA DE EXPEDICIÓN:" + Fechaexpedicion
                    + "\nLUGAR DE EXPEDICIÓN:" + Lugarexpedicion
                    + "\nRANGO DE EDAD:" + Rangoedad
                    + "\nFECHA CONSULTA:" + Fecha
                    + //"\nHORA CONSULTA:"+Horaconsulta.replace(" ", "")+
                    "\nUSUARIO:" + Usuarioconsulta
                    + "\nNÚMERO INFORME:" + Nomerodeinforme
                    + "\n\nINFORMACIÓN SCORE\n*****************************"
                    + "\nSCORE:" + Score
                    + "\n\nRESUMEN ENDEUDAMIENTO\nRESUMEN OBLIGACIONES (COMO PRINCIPAL)\n****************************"
                    + "\n\nCantidad Tarjetas de Crédito   :" + TarjcreditoCantTotalesPpal//
                    + "\nSaldo Tarjetas de Crédito      :" + TarjcreditoSaldoTotalesPpal
                    + "\nCantidad Sector Financiero     :" + SectorFinanCantTotalesPpal
                    + "\nSaldo Sector Financiero        :" + SectorFinanSaldoTotalesPpal
                    + "\nCantidad Sector Solidario      :" + SectorSolidCantTotalesPpal
                    + "\nSaldo Sector Solidario         :" + SectorSolidSaldoTotalesPpal
                    + "\nCantidad Sector Real           :" + SectorRealCantTotalesPpal
                    + "\nSaldo Sector Real              :" + SectorRealSaldoTotalesPpal
                    + "\nSubtotal Cantidad              :" + SaldoTotalPpalCantTotalesPpal
                    + "\nSubtotal Saldo                 :" + SaldoTotalPpalSaldoTotalesPpal
                    + "\n\nRESUMEN ENDEUDAMIENTO\nRESUMEN OBLIGACIONES (COMO COEDUDOR)\n****************************"
                    + "\n\nCantidad Tarjetas de Crédito   :" + TarjcreditoCantTotalesCoe
                    + "\nSaldo Tarjetas de Crédito      :" + TarjcreditoSaldoTotalesCoe
                    + "\nCantidad Sector Financiero     :" + SectorFinanCantTotalesCoe
                    + "\nSaldo Sector Financiero        :" + SectorFinanSaldoTotalesCoe
                    + "\nCantidad Sector Solidario      :" + SectorSolidCantTotalesCoe
                    + "\nSaldo Sector Solidario         :" + SectorSolidSaldoTotalesCoe
                    + "\nCantidad Sector Real           :" + SectorRealCantTotalesCoe
                    + "\nSaldo Sector Real              :" + SectorRealSaldoTotalesCoe
                    + "\nSubtotal Cantidad              :" + SaldoTotalPpalCantTotalesCoe
                    + "\nSubtotal Saldo Ppal            :" + SaldoTotalPpalSaldoTotalesCoe
                    + "\n\nRESUMEN TOTAL DE OBLIGACIONES CANTIDADES Y SALGO\n"
                    + "\nTotal Cantidad Ppal y Coe      :" + ResumenTotalCantTotalesPpalyCoe
                    + "\nTotal Saldo Ppal y Coe         :" + ResumenTotalSaldoTotalesPpalyCoe
                    + "\n\nOBLIGACIONES AL DIA PPAL\n\n"
                    + "\nPade tarj crédito al dia Ppal  :" + TarjcreditoPadeOblaldiaPpal
                    + "\nCantidad Tarj   de Cred al día :" + TarjcreditoCantOblaldiaPpal
                    + "\nSaldo Tarjetas de Cred al día  :" + TarjcreditoSaldoTotalOblaldiaPpal
                    + "\nPade Sector financiero al día  :" + SectorFinanPadeOblaldiaPpal
                    + "\nCant cuentas sect Finan al día :" + SectorFinanCantOblaldiaPpal
                    + "\nSaldo cuentas sect Finan al día:" + SectorFinanSaldoTotalOblaldiaPpal
                    + "\nPade Sector Solidario al día   :" + SectorSolidPadeOblaldiaPpal
                    + "\nCant cuentas sect Solida al día:" + SectorSolidCantOblaldiaPpal
                    + "\nSaldo cuenta sect Solida al día:" + SectorSolidSaldoTotalOblaldiaPpal
                    + "\nPade Sector Real al día        :" + SectorRealPadeOblaldiaPpal
                    + "\nCant cuentas sect Real al día  :" + SectorRealCantOblaldiaPpal
                    + "\nSaldo cuentas sect Real al día :" + SectorRealSaldoTotalOblaldiaPpal
                    + "\n\nOBLIGACIONES EN MORA PPAL\n"
                    + "\nValor cuota mes tarjeta    mora:" + TarjcreditoCuotaOblenmoraPpal
                    + "\nCantidad Tarje  de Cred en mora:" + TarjcreditoCantOblenmoraPpal
                    + "\nSaldo Tarjetas de Cred en mora :" + TarjcreditoSaldoTotalenmoraPpal
                    + "\nCuota mes sector Finan en mora :" + SectorFinanCuotaOblenmoraPpal
                    + "\nCanti cuentas secto Finan mora :" + SectorFinanCantOblenmoraPpal
                    + "\nSaldo cuentas secto Finan mora :" + SectorFinanSaldoTotalenmoraPpal
                    + "\nCuota mes sector solidario mora:" + SectorSolidCuotaOblenmoraPpal
                    + "\nCantidad  cuentas sector Solid :" + SectorSolidCantOblenmoraPpal
                    + "\nSaldo  cuentas sector Solidari :" + SectorSolidSaldoTotalenmoraPpal
                    + "\nCuota mes sector real mora     :" + SectorRealCuotaOblenmoraPpal
                    + "\nCantidad  cuentas sector Real  :" + SectorRealCantOblenmoraPpal
                    + "\nSaldo  cuentas sector Real     :" + SectorRealSaldoTotalenmoraPpal
                    + "\n\nCUOTA Y VALOR EN MORA PPAL\n"
                    + "\nValor cuota  Tarje Ppal        :" + TarjcreditoCuotaPpal
                    + "\nValor en mora Tarje Ppal       :" + TarjcreditoValenmoraPpal
                    + "\nValor cuota Sect Finan Ppal    :" + SectorFinanCuotaPpal
                    + "\nValor en mora Sect Finan Ppal  :" + SectorFinanValenmoraPpal
                    + "\nValor cuota Sect Solid Ppal    :" + SectorSolidCuotaPpal
                    + "\nValor en mora Sect Solid Ppal  :" + SectorSolidValenmoraPpal
                    + "\nValor cuota Sect Real Ppal     :" + SectorRealCuotaPpal
                    + "\nValor en mora Sect Real Ppal   :" + SectorRealValenmoraPpal
                    + "\n\nSUB TOTALES PRINCIPAL        "
                    + "\n\nSub total Pade                 :" +SaldoTotalPpalPadeOblaldiaPpal
                    + "\nSub total Obl cant cuentas     :" + SaldoTotalPpalCantOblaldiaPpal
                    + "\nSub total Obl saldos  al día   :" + SaldoTotalPpalSaldoTotalOblaldiaPpal
                    + "\nSub total Obl cuota en mora    :" + SaldoTotalPpalCuotaOblenmoraPpal
                    + "\nSub total Cant Obl cta en mora :" + SaldoTotalPpalCantOblenmoraPpal
                    + "\nSub total Saldo cuota en mora  :" + SaldoTotalPpalSaldoTotalenmoraPpal
                    + "\nSub total cuota  en mora       :" + SaldoTotalPpalCuotaPpal
                    + "\nSub total valor  en mora       :" + SaldoTotalPpalValenmoraPpal
                    + "\n\nOBLIGACIONES AL DIA COE\n\n"
                    + "\nPade tarj crédito al dia Coe    :" + TarjcreditoPadeOblaldiaCoe
                    + "\nCantidad Tarj   de Cred al día :" + TarjcreditoCantOblaldiaCoe
                    + "\nSaldo Tarjetas de Cred al día  :" + TarjcreditoSaldoTotalOblaldiaCoe
                    + "\nPade Sector financiero al día  :" + SectorFinanPadeOblaldiaCoe
                    + "\nCant cuentas sect Finan al día :" + SectorFinanCantOblaldiaCoe
                    + "\nSaldo cuentas sect Finan al día:" + SectorFinanSaldoTotalOblaldiaCoe
                    + "\nPade Sector Solidario al día   :" + SectorSolidPadeOblaldiaCoe
                    + "\nCant cuentas sect Solida al día:" + SectorSolidCantOblaldiaCoe
                    + "\nSaldo cuenta sect Solida al día:" + SectorSolidSaldoTotalOblaldiaCoe
                    + "\nPade Sector Real al día        :" + SectorRealPadeOblaldiaCoe
                    + "\nCant cuentas sect Real al día  :" + SectorRealCantOblaldiaCoe
                    + "\nSaldo cuentas sect Real al día :" + SectorRealSaldoTotalOblaldiaCoe
                    + "\n\nOBLIGACIONES EN MORA CODEUDOR\n"
                    + "\nValor cuota mes tarjeta    mora:" + TarjcreditoCuotaOblenmoraCoe
                    + "\nCantidad Tarje  de Cred en mora:" + TarjcreditoCantOblenmoraCoe
                    + "\nSaldo Tarjetas de Cred en mora :" + TarjcreditoSaldoTotalenmoraCoe
                    + "\nCuota mes sector Finan en mora :" + SectorFinanCuotaOblenmoraCoe
                    + "\nCanti cuentas secto Finan mora :" + SectorFinanCantOblenmoraCoe
                    + "\nSaldo cuentas secto Finan mora :" + SectorFinanSaldoTotalenmoraCoe
                    + "\nCuota mes sector solidario mora:" + SectorSolidCuotaOblenmoraCoe
                    + "\nCantidad  cuentas sector Solid :" + SectorSolidCantOblenmoraCoe
                    + "\nSaldo  cuentas sector Solidari :" + SectorSolidSaldoTotalenmoraCoe
                    + "\nCuota mes sector real mora     :" + SectorRealCuotaOblenmoraCoe
                    + "\nCantidad  cuentas sector Real  :" + SectorRealCantOblenmoraCoe
                    + "\nSaldo  cuentas sector Real     :" + SectorRealSaldoTotalenmoraCoe
                    + "\n\nCUOTA Y VALOR EN MORA COEDUDOR\n"
                    + "\nValor cuota  Tarje Ppal        :" + TarjcreditoCuotaCoe
                    + "\nValor en mora Tarje Ppal       :" + TarjcreditoValenmoraCoe
                    + "\nValor cuota Sect Finan Ppal    :" + SectorFinanCuotaCoe
                    + "\nValor en mora Sect Finan Ppal  :" + SectorFinanValenmoraCoe
                    + "\nValor cuota Sect Solid Ppal    :" + SectorSolidCuotaCoe
                    + "\nValor en mora Sect Solid Ppal  :" + SectorSolidValenmoraCoe
                    + "\nValor cuota Sect Real Ppal     :" + SectorRealCuotaCoe
                    + "\nValor en mora Sect Real Ppal   :" + SectorRealValenmoraCoe
                    + "\n\nSUB TOTALES COEDUDOR        "
                    + "\n\nSub total Pade                 :"+SaldoTotalPadeOblaldiaCoe
                    + "\nSub total Obl cant cuentas     :" + SaldoTotalCantOblaldiaCoe
                    + "\nSub total Obl saldos  al día   :" + SaldoTotalSaldoTotalOblaldiaCoe
                    + "\nSub total Obl cuota en mora    :" + SaldoTotalCuotaOblenmoraCoe
                    + "\nSub total Cant Obl cta en mora :" + SaldoTotalCantOblenmoraCoe
                    + "\nSub total Saldo cuota en mora  :" + SectorRealSaldoTotalenmoraCoe
                    + "\nSub total cuota  en mora       :" + SaldoTotalCuotaCoe
                    + "\nSub total valor  en mora       :" + SaldoTotalValenmoraCoe              
            );
            */
           
            
       
        }
        
        NodeList NodoPadre = documentXml.getElementsByTagName("Informe");
        Nodoprincipal = NodoPadre.item(0);
        //Valida que el nodo exista y que sea de tipo nodo
        if(Nodoprincipal != null && Nodoprincipal.getNodeType() == Node.ELEMENT_NODE){
             
            for (int i = 0; i < Nodoprincipal.getChildNodes().getLength(); i++) {
              
                if(Nodoprincipal.getChildNodes().item(i).getNodeName().equals("CuentaAhorro")){
                    
                    TipoContrato = "AHO-INDIVIDUAL";
                 
                    SubNodoTipoCuenta = Nodoprincipal.getChildNodes().item(i);
                    
                    Element AtributoCta = (Element)SubNodoTipoCuenta;
                    NumeroCuenta = AtributoCta.getAttribute("numero");
                    EntidadBancaria = AtributoCta.getAttribute("entidad").replace(" ", "");
                    CiudadCuenta = AtributoCta.getAttribute("ciudad");
                    SucursalCuenta = AtributoCta.getAttribute("oficina");
                    FechaApertura = AtributoCta.getAttribute("fechaApertura");
                   
                  
                      
                    if(SubNodoTipoCuenta != null && SubNodoTipoCuenta.getNodeType() == Node.ELEMENT_NODE){
                      
                        for (int j = 0; j < SubNodoTipoCuenta.getChildNodes().getLength(); j++) {
                            
                            
                            if(SubNodoTipoCuenta.getChildNodes().item(j).getNodeName().equals("Valores")){
                                
                                SubNodoValores = SubNodoTipoCuenta.getChildNodes().item(j);
                                
                                if(SubNodoValores != null && SubNodoValores.getNodeType() == Node.ELEMENT_NODE){
                                    
                                    for (int k = 0; k < SubNodoValores.getChildNodes().getLength(); k++) {
                                        
                                        SubNodoValor = SubNodoValores.getChildNodes().item(k);
                                        
                                        if(SubNodoValor != null && SubNodoValor.getNodeType() == Node.ELEMENT_NODE){
                                            
                                            Element FechaCta = (Element)SubNodoValor;
                                            
                                            FechaCuenta = FechaCta.getAttribute("fecha");
                                            
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
                                   
                                    switch (ValorEstado) 
                                    {
                                        case "01":  EstadoCuenta = "ACTIVA";
                                                 break;
                                        case "02":  EstadoCuenta = "CANCELADA POR MAL MANEJO";
                                                 break;
                                        case "05":  EstadoCuenta = "SALDADA";
                                                 break;
                                        case "06":  EstadoCuenta = "EMBARGADA";
                                                 break;
                                        case "07":  EstadoCuenta = "EMBARGADA-ACTIVA";
                                                 break;
                                        case "09":  EstadoCuenta = "INACTIVA";
                                                 break;
                                        default: EstadoCuenta = "";
                                                 break;
                                    }
                                }
                                
                            
                                
                            }
                        }
                        
                    }
                    
                     String [] arreglo = {FechaCuenta,TipoContrato,NumeroCuenta,EstadoCuenta,EntidadBancaria,CiudadCuenta,SucursalCuenta,FechaApertura,""+Valorsobregiro,""+Diasautor,Fechapermanencia,Fechapermanencia,""+ChequeDevUltMes};
                    Detalledatos = ("Info Ctas : "+
                            FechaCuenta+" Tipo Contrato: "+
                            TipoContrato+"Nr Cta: "+
                            NumeroCuenta+" Estado Cta: "+
                            EstadoCuenta+" Entidad: "+
                            EntidadBancaria+" Ciudad cta: "+
                            CiudadCuenta+" Sucursal: "+
                            SucursalCuenta+" F.Apertura: "+
                            FechaApertura+" Sobregiros: "+Valorsobregiro+" Dias autor: "+Diasautor+" Fecha permanencia: "+Fechapermanencia+" ChequesDev: "+ChequeDevUltMes); 
                    
                   informe.add(arreglo);
                    
                }
                
                if(Nodoprincipal.getChildNodes().item(i).getNodeName().equals("CuentaCorriente")){
                    
                                        
                    TipoContrato = "CTE-INDIVIDUAL";
                 
                    SubNodoTipoCuenta = Nodoprincipal.getChildNodes().item(i);
                    
                    Element AtributoCta = (Element)SubNodoTipoCuenta;
                    NumeroCuenta = AtributoCta.getAttribute("numero");
                    EntidadBancaria = AtributoCta.getAttribute("entidad").replace(" ", "");
                    CiudadCuenta = AtributoCta.getAttribute("ciudad");
                    SucursalCuenta = AtributoCta.getAttribute("oficina");
                    FechaApertura = AtributoCta.getAttribute("fechaApertura");
                   
              
                      
                    if(SubNodoTipoCuenta != null && SubNodoTipoCuenta.getNodeType() == Node.ELEMENT_NODE){
                      
                        for (int j = 0; j < SubNodoTipoCuenta.getChildNodes().getLength(); j++) {
                            
                            
                            if(SubNodoTipoCuenta.getChildNodes().item(j).getNodeName().equals("Valores")){
                                
                                SubNodoValores = SubNodoTipoCuenta.getChildNodes().item(j);
                                
                                if(SubNodoValores != null && SubNodoValores.getNodeType() == Node.ELEMENT_NODE){
                                    
                                    for (int k = 0; k < SubNodoValores.getChildNodes().getLength(); k++) {
                                        
                                        SubNodoValor = SubNodoValores.getChildNodes().item(k);
                                        
                                        if(SubNodoValor != null && SubNodoValor.getNodeType() == Node.ELEMENT_NODE){
                                            
                                            Element Atributovalores = (Element)SubNodoValor;
                                            
                                            FechaCuenta = Atributovalores.getAttribute("fecha");
                                            ChequeDevUltMes = Integer.parseInt(Atributovalores.getAttribute("cantidadChequesDevueltos"));
                                            
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
                                   
                                    switch (ValorEstado) 
                                    {
                                        case "01":  EstadoCuenta = "ACTIVA";
                                                 break;
                                        case "02":  EstadoCuenta = "CANCELADA POR MAL MANEJO";
                                                 break;
                                        case "05":  EstadoCuenta = "SALDADA";
                                                 break;
                                        case "06":  EstadoCuenta = "EMBARGADA";
                                                 break;
                                        case "07":  EstadoCuenta = "EMBARGADA-ACTIVA";
                                                 break;
                                        case "09":  EstadoCuenta = "INACTIVA";
                                                 break;
                                        default: EstadoCuenta = "";
                                                 break;
                                    }
                                }
                                                          
                            }
                            //XXX
                            if(SubNodoTipoCuenta.getChildNodes().item(j).getNodeName().equals("Sobregiro")){
                                
                                SubNodoSobregiro = SubNodoTipoCuenta.getChildNodes().item(j);
                           
                                
                                if(SubNodoSobregiro != null && SubNodoValores.getNodeType() == Node.ELEMENT_NODE){
                                    
                                   Element Atributosobregiro = (Element)SubNodoSobregiro;
                                                               
                                   Valorsobregiro = Double.parseDouble(Atributosobregiro.getAttribute("valor"));
                                   Diasautor = Integer.parseInt(Atributosobregiro.getAttribute("dias"));
                                   Fechapermanencia = Atributosobregiro.getAttribute("fecha");
                                  
                                  
                                }
                                                          
                            }
                        }
                        
                    }
                    
                 String [] arreglo = {FechaCuenta,TipoContrato,NumeroCuenta,EstadoCuenta,EntidadBancaria,CiudadCuenta,SucursalCuenta,FechaApertura,""+Valorsobregiro,""+Diasautor,Fechapermanencia,Fechapermanencia,""+ChequeDevUltMes};
                    Detalledatos = ("Info Ctas : "+
                            FechaCuenta+" Tipo Contrato: "+
                            TipoContrato+"Nr Cta: "+
                            NumeroCuenta+" Estado Cta: "+
                            EstadoCuenta+" Entidad: "+
                            EntidadBancaria+" Ciudad cta: "+
                            CiudadCuenta+" Sucursal: "+
                            SucursalCuenta+" F.Apertura: "+
                            FechaApertura+" Sobregiros: "+Valorsobregiro+" Dias autor: "+Diasautor+" Fecha permanencia: "+Fechapermanencia+" ChequesDev: "+ChequeDevUltMes); 
                
                   informe.add(arreglo);
                }
                
                
                
            }
            
                  
            for (Iterator<String[]> iterator = informe.iterator(); iterator.hasNext();) {
                String[] next = iterator.next();
                System.out.println("Dato"+next[0]+" "+next[1]+" "+next[2]+" "+next[3]+" "+next[4]+" "+next[5]+" "+next[6]+" "+next[7]+" "+next[8]+" "+next[9]);
               
                
            }
                     
                     
    }

     }
    
    }
}
    

