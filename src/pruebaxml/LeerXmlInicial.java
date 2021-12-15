/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaxml;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import modelo.InformacionComercial;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Jose Cogollo
 */
public class LeerXmlInicial {
    
    @SuppressWarnings("empty-statement")
    public InformacionComercial LecturaInformacion() throws ParserConfigurationException, SAXException, IOException, ParseException {
    
        
         InformacionComercial a = new InformacionComercial();        

        //VARIABLES PARA DATOS INFORMACION COMERCIAL
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
        String Fechaconsulta1 = "";
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
        int SaldoTotalCantTotalesCoe = 0;
        double SaldoTotalSaldoTotalesCoe = 0;

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
        double ResumenTotalPadeOblaldiaPpalyCoe = 0;
        int ResumenTotalCantOblaldiaPpalyCoe = 0;
        double ResumenTotalSaldoTotalOblaldiaPpalyCoe = 0;
        double ResumenTotalCuotaOblenmoraPpalyCoe = 0;
        int ResumenTotalCantOblenmoraPpalyCoe = 0;
        double ResumenTotalSaldoTotalenmoraPpalyCoe = 0;
        double ResumenTotalCuotaPpalyCoe = 0;
        double ResumenTotalValenmoraPpalyCoe = 0;
        double SaldoTotalSaldoTotalenmoraCoe = 0;

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

        double Saldototalcuentassectorfinancierocoe = 0,
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
                Saldotarjetacreditocoe = 0;

        String sectorFinancieroppal = "";
        String totalcomoprincipal = "";
        String sectorCooperativoppal = "";
        String sectorRealppal = "";
        String sectorEconomico = "";

        try {

        File documentXml1 = new File("C:\\Users\\Jose Cogollo\\OneDrive\\Documentos\\NetBeansProjects\\Pruebaxml\\src\\pruebaxml\\relacionados.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document documentXml = builder.parse(documentXml1);

            NodeList informes = documentXml.getElementsByTagName("Informe");
            Node informe = informes.item(0);
            if (informe != null && informe.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) informe;

                String tipodocumento = "";

                tipodocumento = element.getAttribute("tipoIdDigitado");

                switch (tipodocumento) {
                    case "1":
                        Tipoidentificacion = "C.C";//Cédula de ciudadanía
                        break;
                    case "2":
                        Tipoidentificacion = "NIT";//Número de identificación tributaría
                        break;
                    case "3":
                        Tipoidentificacion = "N.E.";//Nit de extranjería
                        break;
                    case "4":
                        Tipoidentificacion = "C.E.";// Cédula de extranjería
                        break;
                    case "5":
                        Tipoidentificacion = "PAS";//Pasaporte
                        break;
                    case "6":
                        Tipoidentificacion = "C.D.";//Carnet diplomático
                        break;
                    case "7":
                        Tipoidentificacion = "T.I";//Tarjeta de identidad
                        break;
                    case "8":
                        Tipoidentificacion = "DNI";//Documento nacional de identidad
                        break;
                    case "9":
                        Tipoidentificacion = "PEP";//Permiso especial de permanencia
                        break;
                }

                Identificacion = element.getAttribute("identificacionDigitada");
                Fechaconsulta1 = element.getAttribute("fechaConsulta");
            }

            NodeList DatosNatural = documentXml.getElementsByTagName("NaturalNacional");
            Node datosnatural = DatosNatural.item(0);

            if (datosnatural != null && datosnatural.getNodeType() == Node.ELEMENT_NODE) {

                Element elementodatos = (Element) datosnatural;
                Razonsocial = elementodatos.getAttribute("nombreCompleto");

            }

            NodeList Actividadeconomicares = documentXml.getElementsByTagName("ActividadEconomica");
            Node datosActividadeconomica = Actividadeconomicares.item(0);

            if (datosActividadeconomica != null && datosActividadeconomica.getNodeType() == Node.ELEMENT_NODE) {
                Element actividadeconomica = (Element) datosActividadeconomica;
                Actividadeconomica = actividadeconomica.getAttribute("CIIU");

            }

            NodeList Identificacionestadodoc = documentXml.getElementsByTagName("Identificacion");
            Node datosestadoidentificacion = Identificacionestadodoc.item(0);

            if (datosestadoidentificacion != null && datosestadoidentificacion.getNodeType() == Node.ELEMENT_NODE) {
                Element datoestadoid = (Element) datosestadoidentificacion;

                String estadodoc = datoestadoid.getAttribute("estado");

                int estadoDoc = Integer.parseInt(estadodoc);

                if (estadodoc.equals("00") || estadodoc.equals("12")) {
                    Estadodocumento = "VIGENTE";
                } else if (estadodoc.equals("21")) {
                    Estadodocumento = "CANCELADA POR MUERTE O FALLECIDO";
                } else if (estadodoc.equals("99")) {
                    Estadodocumento = "EN TRAMITE";
                } else if (estadoDoc >= 1 && estadoDoc <= 11) {
                    Estadodocumento = "CANCELADA";
                } else if (estadoDoc >= 13 && estadoDoc <= 20) {
                    Estadodocumento = "CANCELADA";
                } else if (estadoDoc >= 22 && estadoDoc < 30) {
                    Estadodocumento = "CANCELADA";
                } else if (estadoDoc >= 30 && estadoDoc < 60) {
                    Estadodocumento = "NO EXPEDIDA";
                }

                Fechaexpedicion = datoestadoid.getAttribute("fechaExpedicion");
                Lugarexpedicion = datoestadoid.getAttribute("ciudad");
                Nomerodeinforme = datoestadoid.getAttribute("numero");

            }

            NodeList NodeRangoedad = documentXml.getElementsByTagName("Edad");
            Node rangosedad = NodeRangoedad.item(0);

            if (rangosedad != null && rangosedad.getNodeType() == Node.ELEMENT_NODE) {
                Element rangoedad = (Element) rangosedad;
                Edadminima = rangoedad.getAttribute("min");
                Edadmaxima = rangoedad.getAttribute("max");
                Rangoedad = Edadminima + "-" + Edadmaxima;
            }

            NodeList Scorres = documentXml.getElementsByTagName("Score");
            Node datoescore = Scorres.item(0);

            if (datoescore != null && datoescore.getNodeType() == Node.ELEMENT_NODE) {
                Element resultscore = (Element) datoescore;
                Score = resultscore.getAttribute("puntaje");
            }

            // Información obligaciones resumen como principal
            NodeList PerfilGeneralPpal = documentXml.getElementsByTagName("PerfilGeneral");
            Node datosresumenppal = PerfilGeneralPpal.item(0);

            if (datosresumenppal != null && datosresumenppal.getNodeType() == Node.ELEMENT_NODE) {
                NodeList CreditosVigentesppal = documentXml.getElementsByTagName("CreditosVigentes");
                Node datoscreditosvigentesppal = CreditosVigentesppal.item(0);

                if (datoscreditosvigentesppal != null && datoscreditosvigentesppal.getNodeType() == Node.ELEMENT_NODE) {
                    Element datoresumenoblprincipal = (Element) datoscreditosvigentesppal;
                    totalcomoprincipal = datoresumenoblprincipal.getAttribute("totalComoPrincipal");
                    sectorFinancieroppal = datoresumenoblprincipal.getAttribute("sectorFinanciero");
                    sectorCooperativoppal = datoresumenoblprincipal.getAttribute("sectorCooperativo");
                    sectorRealppal = datoresumenoblprincipal.getAttribute("sectorReal");
                }

            }

            NodeList Nodoendeudamientoactual = documentXml.getElementsByTagName("EndeudamientoActual");
            Endeudamiento = Nodoendeudamientoactual.item(0);

            if (Endeudamiento != null && Endeudamiento.getNodeType() == Node.ELEMENT_NODE) {
                for (int i = 0; i < Endeudamiento.getChildNodes().getLength(); i++) {

                    if (Endeudamiento.getChildNodes().item(i).getNodeName().equals("Sector")) {
                        SubNodociclosector = Endeudamiento.getChildNodes().item(i);

                        if (SubNodociclosector != null && SubNodociclosector.getNodeType() == Node.ELEMENT_NODE) {
                            Element Atributosector = (Element) SubNodociclosector;
                            //SEGMENTO CANTIDADES Y SALDOS TOTALES COMO PRINCIAL
                            //<<SEGMENTO DE CODIGO PARA SACAR LOS DATOS DE TARJETAS DE CRÉDITOS COMO PPAL>>
                            sectorEconomico =Atributosector.getAttribute("codSector").replace(" ", "");
                            if (sectorEconomico.equals("1")) {
                                for (int j = 0; j < SubNodociclosector.getChildNodes().getLength(); j++) {
                                    if (SubNodociclosector.getChildNodes().item(j).getNodeName().equals("TipoCuenta")) {
                                        SubNodotipocuenta = SubNodociclosector.getChildNodes().item(j);

                                        if (SubNodotipocuenta != null && SubNodotipocuenta.getNodeType() == Node.ELEMENT_NODE) {
                                            Element Atributotipocuenta = (Element) SubNodotipocuenta;
                                            //VALIDA QUE SOLO SEA TIPO DE CUENTA TARJETA DE CREDITO
                                            if (Atributotipocuenta.getAttribute("tipoCuenta").equals("TDC")) {
                                                for (int k = 0; k < SubNodotipocuenta.getChildNodes().getLength(); k++) {
                                                    if (SubNodotipocuenta.getChildNodes().item(k).getNodeName().equals("Usuario")) {
                                                        SubNodotipousuario = SubNodotipocuenta.getChildNodes().item(k);

                                                        if (SubNodotipousuario != null && SubNodotipousuario.getNodeType() == Node.ELEMENT_NODE) {
                                                            Element Atributonodousuario = (Element) SubNodotipousuario;
                                                            if (Atributonodousuario.getAttribute("tipoUsuario").equals("Principal")) {
                                                                for (int l = 0; l < SubNodotipousuario.getChildNodes().getLength(); l++) {
                                                                    if (SubNodotipousuario.getChildNodes().item(l).getNodeName().equals("Cuenta")) {

                                                                        SubNodocuenta = SubNodotipousuario.getChildNodes().item(l);
                                                                        if (SubNodocuenta != null && SubNodocuenta.getNodeType() == Node.ELEMENT_NODE) {
                                                                            Element Atributonodocuenta = (Element) SubNodocuenta;
                                                                            Saldocuenta = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));

                                                                            //if (Saldocuenta > 0) {
                                                                            Saldotarjetacredito = Saldotarjetacredito + Saldocuenta;
                                                                            Contadortarjetas = Contadortarjetas + 1;

                                                                            String estadotarjetppal = Atributonodocuenta.getAttribute("estadoActual");

                                                                            if (estadotarjetppal.equals("Al día")) {
                                                                                CantTarjetasaldiappal = CantTarjetasaldiappal + 1;
                                                                                Saldocuentaestadotarjetaaldia = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                                SaldoTarjetacreditoaldiappal = SaldoTarjetacreditoaldiappal + Saldocuentaestadotarjetaaldia;

                                                                            }
                                                                            if (estadotarjetppal.equals("En mora")||estadotarjetppal.equals("Dudoso recaudo")||estadotarjetppal.equals("Cart. castigada")) {
                                                                                //Obtener valorcuota mes
                                                                                SaldocuotaenmoraTDC = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));

                                                                                Cuotamestrajetacreditoenmora = Cuotamestrajetacreditoenmora + SaldocuotaenmoraTDC;
                                                                                CantTarjetasenmorappal = CantTarjetasenmorappal + 1;
                                                                                Saldocuentaestadotarjetaenmora = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                                SaldoTarjetacreditoenmorappal = SaldoTarjetacreditoenmorappal + Saldocuentaestadotarjetaenmora;

                                                                            }

                                                                            Valorcuotatarjetacreditoppalsuma = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));
                                                                            Valorcuotatarjetacreditoppal = Valorcuotatarjetacreditoppal + Valorcuotatarjetacreditoppalsuma;

                                                                            Valorenmoratarjetacreditoppalsuma = Double.parseDouble(Atributonodocuenta.getAttribute("saldoMora"));
                                                                            Valorenmoratarjetacreditoppal = Valorenmoratarjetacreditoppal + Valorenmoratarjetacreditoppalsuma;

                                                                            //}
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

                                                        if (SubNodotipousuario != null && SubNodotipousuario.getNodeType() == Node.ELEMENT_NODE) {
                                                            Element Atributonodousuario = (Element) SubNodotipousuario;
                                                            if (Atributonodousuario.getAttribute("tipoUsuario").equals("Principal")) {
                                                                for (int l = 0; l < SubNodotipousuario.getChildNodes().getLength(); l++) {
                                                                    if (SubNodotipousuario.getChildNodes().item(l).getNodeName().equals("Cuenta")) {

                                                                        SubNodocuenta = SubNodotipousuario.getChildNodes().item(l);
                                                                        if (SubNodocuenta != null && SubNodocuenta.getNodeType() == Node.ELEMENT_NODE) {
                                                                            Element Atributonodocuenta = (Element) SubNodocuenta;
                                                                            Saldocuenta = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));

                                                                            //if (Saldocuenta > 0) {
                                                                            Saldototalcuentassectorfinanciero = Saldototalcuentassectorfinanciero + Saldocuenta;
                                                                            Cantidadcuentasesctorfinanciero = Cantidadcuentasesctorfinanciero + 1;

                                                                            SaldocuotamesmoradiSectorFinanciero = SaldocuotamesmoradiSectorFinanciero + Saldocuotaenmorasectorfinancierosuma;
                                                                            String estadotarjetppal = Atributonodocuenta.getAttribute("estadoActual");

                                                                            if (estadotarjetppal.equals("Al día")) {
                                                                                Cantidadcuentasaldiasectorfinanciero = Cantidadcuentasaldiasectorfinanciero + 1;
                                                                                Saldocuentaaldiasectorfinanciero = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                                SaldoTotalCuotaaldiaSectorFinan = SaldoTotalCuotaaldiaSectorFinan + Saldocuentaaldiasectorfinanciero;
                                                                            }
                                                                            if (estadotarjetppal.equals("En mora")||estadotarjetppal.equals("Dudoso recaudo")||estadotarjetppal.equals("Cart. castigada")) {

                                                                                Saldocuotaenmorasectorfinancierosuma = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));

                                                                                SaldocuotamesmoradiSectorFinanciero = SaldocuotamesmoradiSectorFinanciero + Saldocuotaenmorasectorfinancierosuma;
                                                                                Cantidadcuentasenmorasectorfinanciero = Cantidadcuentasenmorasectorfinanciero + 1;
                                                                                Saldocuentaenmorasectorfinanciero = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                                SaldoTotalCuotaenmoraSectorFinan = SaldoTotalCuotaenmoraSectorFinan + Saldocuentaenmorasectorfinanciero;
                                                                            }

                                                                            Valorcuotasectorfinancieroppalsuma = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));
                                                                            Valorcuotasectorfinancieroppal = Valorcuotasectorfinancieroppal + Valorcuotasectorfinancieroppalsuma;

                                                                            Valorenmorasectorfinancieropalsuma = Double.parseDouble(Atributonodocuenta.getAttribute("saldoMora"));
                                                                            Valorenmorasectorfinancieroppal = Valorenmorasectorfinancieroppal + Valorenmorasectorfinancieropalsuma;
                                                                            //}
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
                              
                            if (sectorEconomico.equals("2")) {
                                for (int j = 0; j < SubNodociclosector.getChildNodes().getLength(); j++) {
                                    if (SubNodociclosector.getChildNodes().item(j).getNodeName().equals("TipoCuenta")) {
                                        SubNodotipocuenta = SubNodociclosector.getChildNodes().item(j);

                                        if (SubNodotipocuenta != null && SubNodotipocuenta.getNodeType() == Node.ELEMENT_NODE) {
                                            Element Atributotipocuenta = (Element) SubNodotipocuenta;

                                            if (!Atributotipocuenta.getAttribute("tipoCuenta").equals("TDC")) {
                                                for (int k = 0; k < SubNodotipocuenta.getChildNodes().getLength(); k++) {
                                                    if (SubNodotipocuenta.getChildNodes().item(k).getNodeName().equals("Usuario")) {
                                                        SubNodotipousuario = SubNodotipocuenta.getChildNodes().item(k);

                                                        if (SubNodotipousuario != null && SubNodotipousuario.getNodeType() == Node.ELEMENT_NODE) {
                                                            Element Atributonodousuario = (Element) SubNodotipousuario;
                                                            if (Atributonodousuario.getAttribute("tipoUsuario").equals("Principal")) {
                                                                for (int l = 0; l < SubNodotipousuario.getChildNodes().getLength(); l++) {
                                                                    if (SubNodotipousuario.getChildNodes().item(l).getNodeName().equals("Cuenta")) {

                                                                        SubNodocuenta = SubNodotipousuario.getChildNodes().item(l);
                                                                        if (SubNodocuenta != null && SubNodocuenta.getNodeType() == Node.ELEMENT_NODE) {
                                                                            Element Atributonodocuenta = (Element) SubNodocuenta;
                                                                            Saldocuenta = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                            //if (Saldocuenta > 0) {
                                                                            Saldototalcuentassectorsolidario = Saldototalcuentassectorsolidario + Saldocuenta;
                                                                            Cantidadcuentasesctorsolidario = Cantidadcuentasesctorsolidario + 1;

                                                                            String estadocuenta = Atributonodocuenta.getAttribute("estadoActual");

                                                                            if (estadocuenta.equals("Al día")) {
                                                                                Cantidadcuentassectorsolidarioaldia = Cantidadcuentassectorsolidarioaldia + 1;
                                                                                Saldocuentaaldiasectorsolidario = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                                SaldoTotalCuotaaldiaSectorSolidario = SaldoTotalCuotaaldiaSectorSolidario + Saldocuentaaldiasectorsolidario;

                                                                            }
                                                                            if (estadocuenta.equals("En mora")||estadocuenta.equals("Dudoso recaudo")||estadocuenta.equals("Cart. castigada")) {

                                                                                Cuotamesenmorasectorsolidariosuma = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));

                                                                                CuotamesEnmoraSectorSolidario = CuotamesEnmoraSectorSolidario + Cuotamesenmorasectorsolidariosuma;
                                                                                Cantidadcuentassectorsolidarioenmora = Cantidadcuentassectorsolidarioenmora + 1;
                                                                                Saldocuentaenmorasectorsolidario = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                                SaldoTotalCuotaenmoraSectorSolidario = SaldoTotalCuotaenmoraSectorSolidario + Saldocuentaenmorasectorsolidario;

                                                                            }

                                                                            Valorcuotasectorsolidarioprincipalsuma = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));
                                                                            Valorcuotasectorsolidarioprincipal = Valorcuotasectorsolidarioprincipal + Valorcuotasectorsolidarioprincipalsuma;

                                                                            Valorenmorasectorsolidarioprincipalsuma = Double.parseDouble(Atributonodocuenta.getAttribute("saldoMora"));
                                                                            Valorenmorasectorsolidarioprincipal = Valorenmorasectorsolidarioprincipal + Valorenmorasectorsolidarioprincipalsuma;
                                                                            //}
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
                            if (sectorEconomico.equals("3")||sectorEconomico.equals("4")) {
                                for (int j = 0; j < SubNodociclosector.getChildNodes().getLength(); j++) {
                                    if (SubNodociclosector.getChildNodes().item(j).getNodeName().equals("TipoCuenta")) {
                                        SubNodotipocuenta = SubNodociclosector.getChildNodes().item(j);

                                        if (SubNodotipocuenta != null && SubNodotipocuenta.getNodeType() == Node.ELEMENT_NODE) {
                                            Element Atributotipocuenta = (Element) SubNodotipocuenta;

                                            if (!Atributotipocuenta.getAttribute("tipoCuenta").equals("TDC")) {
                                                for (int k = 0; k < SubNodotipocuenta.getChildNodes().getLength(); k++) {
                                                    if (SubNodotipocuenta.getChildNodes().item(k).getNodeName().equals("Usuario")) {
                                                        SubNodotipousuario = SubNodotipocuenta.getChildNodes().item(k);

                                                        if (SubNodotipousuario != null && SubNodotipousuario.getNodeType() == Node.ELEMENT_NODE) {
                                                            Element Atributonodousuario = (Element) SubNodotipousuario;
                                                            if (Atributonodousuario.getAttribute("tipoUsuario").equals("Principal")) {
                                                                for (int l = 0; l < SubNodotipousuario.getChildNodes().getLength(); l++) {
                                                                    if (SubNodotipousuario.getChildNodes().item(l).getNodeName().equals("Cuenta")) {

                                                                        SubNodocuenta = SubNodotipousuario.getChildNodes().item(l);
                                                                        if (SubNodocuenta != null && SubNodocuenta.getNodeType() == Node.ELEMENT_NODE) {
                                                                            Element Atributonodocuenta = (Element) SubNodocuenta;
                                                                            Saldocuenta = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                            //if (Saldocuenta > 0) {
                                                                            Saldototalcuentassectorreal = Saldototalcuentassectorreal + Saldocuenta;
                                                                            Cantidadcuentasesctorreal = Cantidadcuentasesctorreal + 1;

                                                                            String estadocuenta = Atributonodocuenta.getAttribute("estadoActual");

                                                                            if (estadocuenta.equals("Al día")) {
                                                                                Cantidadcuentassectorrealaldia = Cantidadcuentassectorrealaldia + 1;
                                                                                Saldocuentaaldiasectorsreal = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                                SaldoTotalCuotaaldiaSectorReal = SaldoTotalCuotaaldiaSectorReal + Saldocuentaaldiasectorsreal;
                                                                            }
                                                                            if (estadocuenta.equals("En mora")||estadocuenta.equals("Dudoso recaudo")||estadocuenta.equals("Cart. castigada")) {

                                                                                Cuotamesenmorasectorrealsuma = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));

                                                                                CuotamesEnmoraSectorReal = CuotamesEnmoraSectorReal + Cuotamesenmorasectorrealsuma;
                                                                                Cantidadcuentassectorrealenmora = Cantidadcuentassectorrealenmora + 1;
                                                                                Saldocuentaenmorasectorreal = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                                SaldoTotalCuotaenmoraSectorReal = SaldoTotalCuotaenmoraSectorReal + Saldocuentaenmorasectorreal;
                                                                            }

                                                                            Valorcuotasectorrealprincipalsuma = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));
                                                                            Valorcuotasectorrealprincipal = Valorcuotasectorrealprincipal + Valorcuotasectorrealprincipalsuma;

                                                                            Valorenmorasectorrealprincipalsuma = Double.parseDouble(Atributonodocuenta.getAttribute("saldoMora"));
                                                                            Valorenmorasectorrealprincipal = Valorenmorasectorrealprincipal + Valorenmorasectorrealprincipalsuma;

                                                                            //}
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
                            if (sectorEconomico.equals("1")) {
                                for (int j = 0; j < SubNodociclosector.getChildNodes().getLength(); j++) {
                                    if (SubNodociclosector.getChildNodes().item(j).getNodeName().equals("TipoCuenta")) {
                                        SubNodotipocuenta = SubNodociclosector.getChildNodes().item(j);

                                        if (SubNodotipocuenta != null && SubNodotipocuenta.getNodeType() == Node.ELEMENT_NODE) {
                                            Element Atributotipocuenta = (Element) SubNodotipocuenta;
                                            //VALIDA QUE SOLO SEA TIPO DE CUENTA TARJETA DE CREDITO
                                            if (Atributotipocuenta.getAttribute("tipoCuenta").equals("TDC")) {
                                                for (int k = 0; k < SubNodotipocuenta.getChildNodes().getLength(); k++) {
                                                    if (SubNodotipocuenta.getChildNodes().item(k).getNodeName().equals("Usuario")) {
                                                        SubNodotipousuario = SubNodotipocuenta.getChildNodes().item(k);

                                                        if (SubNodotipousuario != null && SubNodotipousuario.getNodeType() == Node.ELEMENT_NODE) {
                                                            Element Atributonodousuario = (Element) SubNodotipousuario;
                                                            if (Atributonodousuario.getAttribute("tipoUsuario").equals("Codeudor")) {
                                                                for (int l = 0; l < SubNodotipousuario.getChildNodes().getLength(); l++) {
                                                                    if (SubNodotipousuario.getChildNodes().item(l).getNodeName().equals("Cuenta")) {

                                                                        SubNodocuenta = SubNodotipousuario.getChildNodes().item(l);
                                                                        if (SubNodocuenta != null && SubNodocuenta.getNodeType() == Node.ELEMENT_NODE) {
                                                                            Element Atributonodocuenta = (Element) SubNodocuenta;
                                                                            Saldocuenta = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));

                                                                            //if (Saldocuenta > 0) {
                                                                            Saldotarjetacreditocoe = Saldotarjetacreditocoe + Saldocuenta;
                                                                            Contadortarjetascoe = Contadortarjetascoe + 1;

                                                                            String estadotarjetppal = Atributonodocuenta.getAttribute("estadoActual");

                                                                            if (estadotarjetppal.equals("Al día")) {
                                                                                CantTarjetasaldiappalcoe = CantTarjetasaldiappalcoe + 1;
                                                                                Saldocuentaestadotarjetaaldiacoe = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                                SaldoTarjetacreditoaldiappalcoe = SaldoTarjetacreditoaldiappalcoe + Saldocuentaestadotarjetaaldiacoe;

                                                                            }
                                                                            if (estadotarjetppal.equals("En mora")||estadotarjetppal.equals("Dudoso recaudo")||estadotarjetppal.equals("Cart. castigada")) {
                                                                                //Obtener valorcuota mes
                                                                                SaldocuotaenmoraTDCcoe = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));

                                                                                Cuotamestrajetacreditoenmoracoe = Cuotamestrajetacreditoenmoracoe + SaldocuotaenmoraTDCcoe;
                                                                                CantTarjetasenmorappalcoe = CantTarjetasenmorappalcoe + 1;
                                                                                Saldocuentaestadotarjetaenmoracoe = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                                SaldoTarjetacreditoenmorappalcoe = SaldoTarjetacreditoenmorappalcoe + Saldocuentaestadotarjetaenmoracoe;

                                                                            }

                                                                            Valorcuotatarjetacreditoppalsumacoe = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));
                                                                            Valorcuotatarjetacreditoppalcoe = Valorcuotatarjetacreditoppalcoe + Valorcuotatarjetacreditoppalsumacoe;

                                                                            Valorenmoratarjetacreditoppalsumacoe = Double.parseDouble(Atributonodocuenta.getAttribute("saldoMora"));
                                                                            Valorenmoratarjetacreditoppalcoe = Valorenmoratarjetacreditoppalcoe + Valorenmoratarjetacreditoppalsumacoe;

                                                                            //}
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

                                                        if (SubNodotipousuario != null && SubNodotipousuario.getNodeType() == Node.ELEMENT_NODE) {
                                                            Element Atributonodousuario = (Element) SubNodotipousuario;
                                                            if (Atributonodousuario.getAttribute("tipoUsuario").equals("Codeudor")) {
                                                                for (int l = 0; l < SubNodotipousuario.getChildNodes().getLength(); l++) {
                                                                    if (SubNodotipousuario.getChildNodes().item(l).getNodeName().equals("Cuenta")) {

                                                                        SubNodocuenta = SubNodotipousuario.getChildNodes().item(l);
                                                                        if (SubNodocuenta != null && SubNodocuenta.getNodeType() == Node.ELEMENT_NODE) {
                                                                            Element Atributonodocuenta = (Element) SubNodocuenta;
                                                                            Saldocuenta = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));

                                                                            //if (Saldocuenta > 0) {
                                                                            Saldototalcuentassectorfinancierocoe = Saldototalcuentassectorfinancierocoe + Saldocuenta;
                                                                            Cantidadcuentasesctorfinancierocoe = Cantidadcuentasesctorfinancierocoe + 1;

                                                                            SaldocuotamesmoradiSectorFinancierocoe = SaldocuotamesmoradiSectorFinancierocoe + Saldocuotaenmorasectorfinancierosumacoe;
                                                                            String estadotarjetppal = Atributonodocuenta.getAttribute("estadoActual");

                                                                            if (estadotarjetppal.equals("Al día")) {
                                                                                Cantidadcuentasaldiasectorfinancierocoe = Cantidadcuentasaldiasectorfinancierocoe + 1;
                                                                                Saldocuentaaldiasectorfinancierocoe = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                                SaldoTotalCuotaaldiaSectorFinancoe = SaldoTotalCuotaaldiaSectorFinancoe + Saldocuentaaldiasectorfinancierocoe;
                                                                            }
                                                                            if (estadotarjetppal.equals("En mora")||estadotarjetppal.equals("Dudoso recaudo")||estadotarjetppal.equals("Cart. castigada")) {

                                                                                Saldocuotaenmorasectorfinancierosumacoe = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));

                                                                                SaldocuotamesmoradiSectorFinancierocoe = SaldocuotamesmoradiSectorFinancierocoe + Saldocuotaenmorasectorfinancierosumacoe;
                                                                                Cantidadcuentasenmorasectorfinancierocoe = Cantidadcuentasenmorasectorfinancierocoe + 1;
                                                                                Saldocuentaenmorasectorfinancierocoe = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                                SaldoTotalCuotaenmoraSectorFinancoe = SaldoTotalCuotaenmoraSectorFinancoe + Saldocuentaenmorasectorfinancierocoe;
                                                                            }

                                                                            Valorcuotasectorfinancieroppalsumacoe = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));
                                                                            Valorcuotasectorfinancieroppalcoe = Valorcuotasectorfinancieroppalcoe + Valorcuotasectorfinancieroppalsumacoe;

                                                                            Valorenmorasectorfinancieropalsumacoe = Double.parseDouble(Atributonodocuenta.getAttribute("saldoMora"));
                                                                            Valorenmorasectorfinancieroppalcoe = Valorenmorasectorfinancieroppalcoe + Valorenmorasectorfinancieropalsumacoe;
                                                                            //}
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
                            if (sectorEconomico.equals("2")) {
                                for (int j = 0; j < SubNodociclosector.getChildNodes().getLength(); j++) {
                                    if (SubNodociclosector.getChildNodes().item(j).getNodeName().equals("TipoCuenta")) {
                                        SubNodotipocuenta = SubNodociclosector.getChildNodes().item(j);

                                        if (SubNodotipocuenta != null && SubNodotipocuenta.getNodeType() == Node.ELEMENT_NODE) {
                                            Element Atributotipocuenta = (Element) SubNodotipocuenta;

                                            if (!Atributotipocuenta.getAttribute("tipoCuenta").equals("TDC")) {
                                                for (int k = 0; k < SubNodotipocuenta.getChildNodes().getLength(); k++) {
                                                    if (SubNodotipocuenta.getChildNodes().item(k).getNodeName().equals("Usuario")) {
                                                        SubNodotipousuario = SubNodotipocuenta.getChildNodes().item(k);

                                                        if (SubNodotipousuario != null && SubNodotipousuario.getNodeType() == Node.ELEMENT_NODE) {
                                                            Element Atributonodousuario = (Element) SubNodotipousuario;
                                                            if (Atributonodousuario.getAttribute("tipoUsuario").equals("Codeudor")) {
                                                                for (int l = 0; l < SubNodotipousuario.getChildNodes().getLength(); l++) {
                                                                    if (SubNodotipousuario.getChildNodes().item(l).getNodeName().equals("Cuenta")) {

                                                                        SubNodocuenta = SubNodotipousuario.getChildNodes().item(l);
                                                                        if (SubNodocuenta != null && SubNodocuenta.getNodeType() == Node.ELEMENT_NODE) {
                                                                            Element Atributonodocuenta = (Element) SubNodocuenta;
                                                                            Saldocuenta = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                            //if (Saldocuenta > 0) {
                                                                            Saldototalcuentassectorsolidariocoe = Saldototalcuentassectorsolidariocoe + Saldocuenta;
                                                                            Cantidadcuentasesctorsolidariocoe = Cantidadcuentasesctorsolidariocoe + 1;

                                                                            String estadocuenta = Atributonodocuenta.getAttribute("estadoActual");

                                                                            if (estadocuenta.equals("Al día")) {
                                                                                Cantidadcuentassectorsolidarioaldiacoe = Cantidadcuentassectorsolidarioaldiacoe + 1;
                                                                                Saldocuentaaldiasectorsolidariocoe = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                                SaldoTotalCuotaaldiaSectorSolidariocoe = SaldoTotalCuotaaldiaSectorSolidariocoe + Saldocuentaaldiasectorsolidariocoe;

                                                                            }
                                                                            if (estadocuenta.equals("En mora")||estadocuenta.equals("Dudoso recaudo")||estadocuenta.equals("Cart. castigada")) {

                                                                                Cuotamesenmorasectorsolidariosumacoe = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));

                                                                                CuotamesEnmoraSectorSolidariocoe = CuotamesEnmoraSectorSolidariocoe + Cuotamesenmorasectorsolidariosumacoe;
                                                                                Cantidadcuentassectorsolidarioenmoracoe = Cantidadcuentassectorsolidarioenmoracoe + 1;
                                                                                Saldocuentaenmorasectorsolidariocoe = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                                SaldoTotalCuotaenmoraSectorSolidariocoe = SaldoTotalCuotaenmoraSectorSolidariocoe + Saldocuentaenmorasectorsolidariocoe;

                                                                            }

                                                                            Valorcuotasectorsolidarioprincipalsumacoe = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));
                                                                            Valorcuotasectorsolidarioprincipalcoe = Valorcuotasectorsolidarioprincipalcoe + Valorcuotasectorsolidarioprincipalsumacoe;

                                                                            Valorenmorasectorsolidarioprincipalsumacoe = Double.parseDouble(Atributonodocuenta.getAttribute("saldoMora"));
                                                                            Valorenmorasectorsolidarioprincipalcoe = Valorenmorasectorsolidarioprincipalcoe + Valorenmorasectorsolidarioprincipalsumacoe;
                                                                            //}
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
                            if (sectorEconomico.equals("3")||sectorEconomico.equals("4")) {
                                for (int j = 0; j < SubNodociclosector.getChildNodes().getLength(); j++) {
                                    if (SubNodociclosector.getChildNodes().item(j).getNodeName().equals("TipoCuenta")) {
                                        SubNodotipocuenta = SubNodociclosector.getChildNodes().item(j);

                                        if (SubNodotipocuenta != null && SubNodotipocuenta.getNodeType() == Node.ELEMENT_NODE) {
                                            Element Atributotipocuenta = (Element) SubNodotipocuenta;

                                            if (!Atributotipocuenta.getAttribute("tipoCuenta").equals("TDC")) {
                                                for (int k = 0; k < SubNodotipocuenta.getChildNodes().getLength(); k++) {
                                                    if (SubNodotipocuenta.getChildNodes().item(k).getNodeName().equals("Usuario")) {
                                                        SubNodotipousuario = SubNodotipocuenta.getChildNodes().item(k);

                                                        if (SubNodotipousuario != null && SubNodotipousuario.getNodeType() == Node.ELEMENT_NODE) {
                                                            Element Atributonodousuario = (Element) SubNodotipousuario;
                                                            if (Atributonodousuario.getAttribute("tipoUsuario").equals("Codeudor")) {
                                                                for (int l = 0; l < SubNodotipousuario.getChildNodes().getLength(); l++) {
                                                                    if (SubNodotipousuario.getChildNodes().item(l).getNodeName().equals("Cuenta")) {

                                                                        SubNodocuenta = SubNodotipousuario.getChildNodes().item(l);
                                                                        if (SubNodocuenta != null && SubNodocuenta.getNodeType() == Node.ELEMENT_NODE) {
                                                                            Element Atributonodocuenta = (Element) SubNodocuenta;
                                                                            Saldocuenta = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                            //if (Saldocuenta > 0) {
                                                                            Saldototalcuentassectorrealcoe = Saldototalcuentassectorrealcoe + Saldocuenta;
                                                                            Cantidadcuentasesctorrealcoe = Cantidadcuentasesctorrealcoe + 1;

                                                                            String estadocuenta = Atributonodocuenta.getAttribute("estadoActual");

                                                                            if (estadocuenta.equals("Al día")) {
                                                                                Cantidadcuentassectorrealaldiacoe = Cantidadcuentassectorrealaldiacoe + 1;
                                                                                Saldocuentaaldiasectorsrealcoe = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                                SaldoTotalCuotaaldiaSectorRealcoe = SaldoTotalCuotaaldiaSectorRealcoe + Saldocuentaaldiasectorsrealcoe;
                                                                            }
                                                                            if (estadocuenta.equals("En mora")||estadocuenta.equals("Dudoso recaudo")||estadocuenta.equals("Cart. castigada")) {

                                                                                Cuotamesenmorasectorrealsumacoe = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));

                                                                                CuotamesEnmoraSectorRealcoe = CuotamesEnmoraSectorRealcoe + Cuotamesenmorasectorrealsumacoe;
                                                                                Cantidadcuentassectorrealenmoracoe = Cantidadcuentassectorrealenmoracoe + 1;
                                                                                Saldocuentaenmorasectorrealcoe = Double.parseDouble(Atributonodocuenta.getAttribute("saldoActual"));
                                                                                SaldoTotalCuotaenmoraSectorRealcoe = SaldoTotalCuotaenmoraSectorRealcoe + Saldocuentaenmorasectorrealcoe;
                                                                            }

                                                                            Valorcuotasectorrealprincipalsumacoe = Double.parseDouble(Atributonodocuenta.getAttribute("cuotaMes"));
                                                                            Valorcuotasectorrealprincipalcoe = Valorcuotasectorrealprincipalcoe + Valorcuotasectorrealprincipalsumacoe;

                                                                            Valorenmorasectorrealprincipalsumacoe = Double.parseDouble(Atributonodocuenta.getAttribute("saldoMora"));
                                                                            Valorenmorasectorrealprincipalcoe = Valorenmorasectorrealprincipalcoe + Valorenmorasectorrealprincipalsumacoe;

                                                                            //}
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
                SaldoTotalCantTotalesCoe = Cantidadsumatotalescuentascoedudor;
                SaldoTotalSaldoTotalesCoe = Saldototaltotalescuentascoedudor;

                //Totales para Principal y Coedudor
                Cantidadsumatotalesresumencuentascoedudor = Cantidadsumatotalescuentasprincipal + Cantidadsumatotalescuentascoedudor;
                Saldototaltotalesresumencuentascoedudor = Saldototaltotalescuentasprincipal + Saldototaltotalescuentascoedudor;

                ResumenTotalCantTotalesPpalyCoe = Cantidadsumatotalesresumencuentascoedudor;
                ResumenTotalSaldoTotalesPpalyCoe = Saldototaltotalesresumencuentascoedudor;

                //Obtener datos de cuentas al día principal
                TarjcreditoCantOblaldiaPpal = CantTarjetasaldiappal;
                TarjcreditoSaldoTotalOblaldiaPpal = SaldoTarjetacreditoaldiappal;
                Tarjetacreditopadeppal = ((((SaldoTarjetacreditoaldiappal) / Saldototaltotalescuentasprincipal)) * 100);
                if (Tarjetacreditopadeppal > 0) {
                    TarjcreditoPadeOblaldiaPpal = Math.round(Tarjetacreditopadeppal);
                } else {
                    TarjcreditoPadeOblaldiaPpal = 0;
                }

                SectorFinanCantOblaldiaPpal = Cantidadcuentasaldiasectorfinanciero;
                SectorFinanSaldoTotalOblaldiaPpal = SaldoTotalCuotaaldiaSectorFinan;
                Padesectorfinancieroppal = ((((SaldoTotalCuotaaldiaSectorFinan) / Saldototaltotalescuentasprincipal)) * 100);
                if (Padesectorfinancieroppal > 0) {
                    SectorFinanPadeOblaldiaPpal = Math.round(Padesectorfinancieroppal);
                } else {
                    SectorFinanPadeOblaldiaPpal = 0;
                }

                SectorSolidCantOblaldiaPpal = Cantidadcuentassectorsolidarioaldia;
                SectorSolidSaldoTotalOblaldiaPpal = SaldoTotalCuotaaldiaSectorSolidario;
                Padesectorsolidario = ((((SaldoTotalCuotaaldiaSectorSolidario) / Saldototaltotalescuentasprincipal)) * 100);
                if (Padesectorsolidario > 0) {
                    SectorSolidPadeOblaldiaPpal = Math.round(Padesectorsolidario);
                } else {
                    SectorSolidPadeOblaldiaPpal = 0;
                }

                SectorRealCantOblaldiaPpal = Cantidadcuentassectorrealaldia;
                SectorRealSaldoTotalOblaldiaPpal = SaldoTotalCuotaaldiaSectorReal;
                Padesectorreal = ((((SaldoTotalCuotaaldiaSectorReal) / Saldototaltotalescuentasprincipal)) * 100);
                if (Padesectorreal > 0) {
                    SectorRealPadeOblaldiaPpal = Math.round(Padesectorreal);
                } else {
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
                if (SaldoTotalPpalPadeOblaldiaPpal2 > 0) {
                    SaldoTotalPpalPadeOblaldiaPpal = Math.round(SaldoTotalPpalPadeOblaldiaPpal2);
                } else {
                    SaldoTotalPpalPadeOblaldiaPpal = 0;
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
                if (Tarjetacreditopadecoe > 0) {
                    TarjcreditoPadeOblaldiaCoe = Math.round(Tarjetacreditopadecoe);
                } else {
                    TarjcreditoPadeOblaldiaCoe = 0;
                }

                SectorFinanCantOblaldiaCoe = Cantidadcuentasaldiasectorfinancierocoe;
                SectorFinanSaldoTotalOblaldiaCoe = SaldoTotalCuotaaldiaSectorFinancoe;
                Padesectorfinancierocoe = ((((SaldoTotalCuotaaldiaSectorFinancoe) / Saldototaltotalescuentascoedudor)) * 100);
                if (Padesectorfinancierocoe > 0) {
                    SectorFinanPadeOblaldiaCoe = Math.round(Padesectorfinancierocoe);
                } else {
                    SectorFinanPadeOblaldiaCoe = 0;
                }

                SectorSolidCantOblaldiaCoe = Cantidadcuentassectorsolidarioaldiacoe;
                SectorSolidSaldoTotalOblaldiaCoe = SaldoTotalCuotaaldiaSectorSolidariocoe;
                Padesectorsolidariocoe = ((((SaldoTotalCuotaaldiaSectorSolidariocoe) / Saldototaltotalescuentascoedudor)) * 100);
                if (Padesectorsolidariocoe > 0) {
                    SectorSolidPadeOblaldiaCoe = Math.round(Padesectorsolidariocoe);
                } else {
                    SectorSolidPadeOblaldiaCoe = 0;
                }

                SectorRealCantOblaldiaCoe = Cantidadcuentassectorrealaldiacoe;
                SectorRealSaldoTotalOblaldiaCoe = SaldoTotalCuotaaldiaSectorRealcoe;
                Padesectorrealcoe = ((((SaldoTotalCuotaaldiaSectorRealcoe) / Saldototaltotalescuentascoedudor)) * 100);
                if (Padesectorrealcoe > 0) {
                    SectorRealPadeOblaldiaCoe = Math.round(Padesectorrealcoe);
                } else {
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
                TarjcreditoCuotaCoe = Valorcuotatarjetacreditoppalcoe;
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
                if (SaldoTotalPadeOblaldiaCoe2 > 0) {
                    SaldoTotalPadeOblaldiaCoe = Math.round(SaldoTotalPadeOblaldiaCoe2);
                } else {
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

                SaldoTotalSaldoTotalenmoraCoe = (SaldoTarjetacreditoenmorappalcoe
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

                ResumenTotalPadeOblaldiaPpalyCoe = SaldoTotalPadeOblaldiaCoe + SaldoTotalPpalPadeOblaldiaPpal;
                ResumenTotalCantOblaldiaPpalyCoe = SaldoTotalCantOblaldiaCoe + SaldoTotalPpalCantOblaldiaPpal;
                ResumenTotalSaldoTotalOblaldiaPpalyCoe = SaldoTotalSaldoTotalOblaldiaCoe + SaldoTotalPpalSaldoTotalOblaldiaPpal;
                ResumenTotalCuotaOblenmoraPpalyCoe = SaldoTotalCuotaOblenmoraCoe + SaldoTotalPpalCuotaOblenmoraPpal;
                ResumenTotalCantOblenmoraPpalyCoe = SaldoTotalCantOblenmoraCoe + SaldoTotalPpalCantOblenmoraPpal;
                ResumenTotalSaldoTotalenmoraPpalyCoe = SectorRealSaldoTotalenmoraCoe + SaldoTotalPpalSaldoTotalenmoraPpal;
                ResumenTotalCuotaPpalyCoe = SaldoTotalCuotaCoe + SaldoTotalPpalCuotaPpal;
                ResumenTotalValenmoraPpalyCoe = SaldoTotalValenmoraCoe + SaldoTotalPpalValenmoraPpal;

            }

        } catch (ParserConfigurationException e) {
            System.err.print(e.getMessage());
        }

        //FORMATO FECHA
        String[] parts = Fechaconsulta1.split("T");
        Fechaconsulta = parts[0];
        Horaconsulta = parts[1];

        a.setTipoidentificacion(Tipoidentificacion);
        a.setIdentificacion(Identificacion);
        a.setRazonsocial(Razonsocial);
        a.setActividadeconomica(Actividadeconomica);
        a.setEstadodocumento(Estadodocumento);
        a.setFechaexpedicion(Fechaexpedicion);
        a.setLugarexpedicion(Lugarexpedicion);
        a.setRangoedad(Rangoedad);
        a.setFechaconsulta(Fechaconsulta);
        a.setHoraconsulta(Horaconsulta);
        a.setUsuarioconsulta(Usuarioconsulta);
        a.setNomerodeinforme(Nomerodeinforme);
        a.setScore(Score);
        a.setTarjcreditoCantTotalesPpal(TarjcreditoCantTotalesPpal);
        a.setTarjcreditoSaldoTotalesPpal(TarjcreditoSaldoTotalesPpal);
        a.setTarjcreditoPadeOblaldiaPpal(TarjcreditoPadeOblaldiaPpal);
        a.setTarjcreditoCantOblaldiaPpal(TarjcreditoCantOblaldiaPpal);
        a.setTarjcreditoSaldoTotalOblaldiaPpal(TarjcreditoSaldoTotalOblaldiaPpal);
        a.setTarjcreditoCuotaOblenmoraPpal(TarjcreditoCuotaOblenmoraPpal);
        a.setTarjcreditoCantOblenmoraPpal(TarjcreditoCantOblenmoraPpal);
        a.setTarjcreditoSaldoTotalenmoraPpal(TarjcreditoSaldoTotalenmoraPpal);
        a.setTarjcreditoCuotaPpal(TarjcreditoCuotaPpal);
        a.setTarjcreditoValenmoraPpal(TarjcreditoValenmoraPpal);
        a.setSectorFinanCantTotalesPpal(SectorFinanCantTotalesPpal);
        a.setSectorFinanSaldoTotalesPpal(SectorFinanSaldoTotalesPpal);
        a.setSectorFinanPadeOblaldiaPpal(SectorFinanPadeOblaldiaPpal);
        a.setSectorFinanCantOblaldiaPpal(SectorFinanCantOblaldiaPpal);
        a.setSectorFinanSaldoTotalOblaldiaPpal(SectorFinanSaldoTotalOblaldiaPpal);
        a.setSectorFinanCuotaOblenmoraPpal(SectorFinanCuotaOblenmoraPpal);
        a.setSectorFinanCantOblenmoraPpal(SectorFinanCantOblenmoraPpal);
        a.setSectorFinanSaldoTotalenmoraPpal(SectorFinanSaldoTotalenmoraPpal);
        a.setSectorFinanCuotaPpal(SectorFinanCuotaPpal);
        a.setSectorFinanValenmoraPpal(SectorFinanValenmoraPpal);
        a.setSectorSolidCantTotalesPpal(SectorSolidCantTotalesPpal);
        a.setSectorSolidSaldoTotalesPpal(SectorSolidSaldoTotalesPpal);
        a.setSectorSolidPadeOblaldiaPpal(SectorSolidPadeOblaldiaPpal);
        a.setSectorSolidCantOblaldiaPpal(SectorSolidCantOblaldiaPpal);
        a.setSectorSolidSaldoTotalOblaldiaPpal(SectorSolidSaldoTotalOblaldiaPpal);
        a.setSectorSolidCuotaOblenmoraPpal(SectorSolidCuotaOblenmoraPpal);
        a.setSectorSolidCantOblenmoraPpal(SectorSolidCantOblenmoraPpal);
        a.setSectorSolidSaldoTotalenmoraPpal(SectorSolidSaldoTotalenmoraPpal);
        a.setSectorSolidCuotaPpal(SectorSolidCuotaPpal);
        a.setSectorSolidValenmoraPpal(SectorSolidValenmoraPpal);
        a.setSectorRealCantTotalesPpal(SectorRealCantTotalesPpal);
        a.setSectorRealSaldoTotalesPpal(SectorRealSaldoTotalesPpal);
        a.setSectorRealPadeOblaldiaPpal(SectorRealPadeOblaldiaPpal);
        a.setSectorRealCantOblaldiaPpal(SectorRealCantOblaldiaPpal);
        a.setSectorRealSaldoTotalOblaldiaPpal(SectorRealSaldoTotalOblaldiaPpal);
        a.setSectorRealCuotaOblenmoraPpal(SectorRealCuotaOblenmoraPpal);
        a.setSectorRealCantOblenmoraPpal(SectorRealCantOblenmoraPpal);
        a.setSectorRealSaldoTotalenmoraPpal(SectorRealSaldoTotalenmoraPpal);
        a.setSectorRealCuotaPpal(SectorRealCuotaPpal);
        a.setSectorRealValenmoraPpal(SectorRealValenmoraPpal);
        a.setSaldoTotalPpalCantTotalesPpal(SaldoTotalPpalCantTotalesPpal);
        a.setSaldoTotalPpalSaldoTotalesPpal(SaldoTotalPpalSaldoTotalesPpal);
        a.setSaldoTotalPpalPadeOblaldiaPpal(SaldoTotalPpalPadeOblaldiaPpal);
        a.setSaldoTotalPpalCantOblaldiaPpal(SaldoTotalPpalCantOblaldiaPpal);
        a.setSaldoTotalPpalSaldoTotalOblaldiaPpal(SaldoTotalPpalSaldoTotalOblaldiaPpal);
        a.setSaldoTotalPpalCuotaOblenmoraPpal(SaldoTotalPpalCuotaOblenmoraPpal);
        a.setSaldoTotalPpalCantOblenmoraPpal(SaldoTotalPpalCantOblenmoraPpal);
        a.setSaldoTotalPpalSaldoTotalenmoraPpal(SaldoTotalPpalSaldoTotalenmoraPpal);
        a.setSaldoTotalPpalCuotaPpal(SaldoTotalPpalCuotaPpal);
        a.setSaldoTotalPpalValenmoraPpal(SaldoTotalPpalValenmoraPpal);
        a.setResumenTotalCantTotalesPpalyCoe(ResumenTotalCantTotalesPpalyCoe);
        a.setResumenTotalSaldoTotalesPpalyCoe(ResumenTotalSaldoTotalesPpalyCoe);
        a.setTarjcreditoCantTotalesCoe(TarjcreditoCantTotalesCoe);
        a.setTarjcreditoSaldoTotalesCoe(TarjcreditoSaldoTotalesCoe);
        a.setTarjcreditoPadeOblaldiaCoe(TarjcreditoPadeOblaldiaCoe);
        a.setTarjcreditoCantOblaldiaCoe(TarjcreditoCantOblaldiaCoe);
        a.setTarjcreditoSaldoTotalOblaldiaCoe(TarjcreditoSaldoTotalOblaldiaCoe);
        a.setTarjcreditoCuotaOblenmoraCoe(TarjcreditoCuotaOblenmoraCoe);
        a.setTarjcreditoCantOblenmoraCoe(TarjcreditoCantOblenmoraCoe);
        a.setTarjcreditoSaldoTotalenmoraCoe(TarjcreditoSaldoTotalenmoraCoe);
        a.setTarjcreditoCuotaCoe(TarjcreditoCuotaCoe);
        a.setTarjcreditoValenmoraCoe(TarjcreditoValenmoraCoe);
        a.setSectorFinanCantTotalesCoe(SectorFinanCantTotalesCoe);
        a.setSectorFinanSaldoTotalesCoe(SectorFinanSaldoTotalesCoe);
        a.setSectorFinanPadeOblaldiaCoe(SectorFinanPadeOblaldiaCoe);
        a.setSectorFinanCantOblaldiaCoe(SectorFinanCantOblaldiaCoe);
        a.setSectorFinanSaldoTotalOblaldiaCoe(SectorFinanSaldoTotalOblaldiaCoe);
        a.setSectorFinanCuotaOblenmoraCoe(SectorFinanCuotaOblenmoraCoe);
        a.setSectorFinanCantOblenmoraCoe(SectorFinanCantOblenmoraCoe);
        a.setSectorFinanSaldoTotalenmoraCoe(SectorFinanSaldoTotalenmoraCoe);
        a.setSectorFinanCuotaCoe(SectorFinanCuotaCoe);
        a.setSectorFinanValenmoraCoe(SectorFinanValenmoraCoe);
        a.setSectorSolidCantTotalesCoe(SectorSolidCantTotalesCoe);
        a.setSectorSolidSaldoTotalesCoe(SectorSolidSaldoTotalesCoe);
        a.setSectorSolidPadeOblaldiaCoe(SectorSolidPadeOblaldiaCoe);
        a.setSectorSolidCantOblaldiaCoe(SectorSolidCantOblaldiaCoe);
        a.setSectorSolidSaldoTotalOblaldiaCoe(SectorSolidSaldoTotalOblaldiaCoe);
        a.setSectorSolidCuotaOblenmoraCoe(SectorSolidCuotaOblenmoraCoe);
        a.setSectorSolidCantOblenmoraCoe(SectorSolidCantOblenmoraCoe);
        a.setSectorSolidSaldoTotalenmoraCoe(SectorSolidSaldoTotalenmoraCoe);
        a.setSectorSolidCuotaCoe(SectorSolidCuotaCoe);
        a.setSectorSolidValenmoraCoe(SectorSolidValenmoraCoe);
        a.setSectorRealCantTotalesCoe(SectorRealCantTotalesCoe);
        a.setSectorRealSaldoTotalesCoe(SectorRealSaldoTotalesCoe);
        a.setSectorRealPadeOblaldiaCoe(SectorRealPadeOblaldiaCoe);
        a.setSectorRealCantOblaldiaCoe(SectorRealCantOblaldiaCoe);
        a.setSectorRealSaldoTotalOblaldiaCoe(SectorRealSaldoTotalOblaldiaCoe);
        a.setSectorRealCuotaOblenmoraCoe(SectorRealCuotaOblenmoraCoe);
        a.setSectorRealCantOblenmoraCoe(SectorRealCantOblenmoraCoe);
        a.setSectorRealSaldoTotalenmoraCoe(SectorRealSaldoTotalenmoraCoe);
        a.setSectorRealCuotaCoe(SectorRealCuotaCoe);
        a.setSectorRealValenmoraCoe(SectorRealValenmoraCoe);
        a.setSaldoTotalCantTotalesCoe(SaldoTotalCantTotalesCoe);
        a.setSaldoTotalSaldoTotalesCoe(SaldoTotalSaldoTotalesCoe);
        a.setSaldoTotalPadeOblaldiaCoe(SaldoTotalPadeOblaldiaCoe);
        a.setSaldoTotalCantOblaldiaCoe(SaldoTotalCantOblaldiaCoe);
        a.setSaldoTotalSaldoTotalOblaldiaCoe(SaldoTotalSaldoTotalOblaldiaCoe);
        a.setSaldoTotalCuotaOblenmoraCoe(SaldoTotalCuotaOblenmoraCoe);
        a.setSaldoTotalCantOblenmoraCoe(SaldoTotalCantOblenmoraCoe);
        a.setSaldoTotalSaldoTotalenmoraCoe(SaldoTotalSaldoTotalenmoraCoe);
        a.setSaldoTotalCuotaCoe(SaldoTotalCuotaCoe);
        a.setSaldoTotalValenmoraCoe(SaldoTotalValenmoraCoe);
        a.setResumenTotalPadeOblaldiaPpalyCoe(ResumenTotalPadeOblaldiaPpalyCoe);
        a.setResumenTotalCantOblaldiaPpalyCoe(ResumenTotalCantOblaldiaPpalyCoe);
        a.setResumenTotalSaldoTotalOblaldiaPpalyCoe(ResumenTotalSaldoTotalOblaldiaPpalyCoe);
        a.setResumenTotalCuotaOblenmoraPpalyCoe(ResumenTotalCuotaOblenmoraPpalyCoe);
        a.setResumenTotalCantOblenmoraPpalyCoe(ResumenTotalCantOblenmoraPpalyCoe);
        a.setResumenTotalSaldoTotalenmoraPpalyCoe(ResumenTotalSaldoTotalenmoraPpalyCoe);
        a.setResumenTotalCuotaPpalyCoe(ResumenTotalCuotaPpalyCoe);
        a.setResumenTotalValenmoraPpalyCoe(ResumenTotalValenmoraPpalyCoe);

        return a;
        
    }
    
}
