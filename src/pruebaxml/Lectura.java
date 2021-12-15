/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaxml;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import modelo.EndeudamientoGlobalClasificadoTrimestre;
import modelo.EndeudamientoGlobalClasificadoTrimestre2;
import modelo.EndeudamientoGlobalClasificadoTrimestre2Totales;
import modelo.EndeudamientoGlobalClasificadoTrimestre3;
import modelo.EndeudamientoGlobalClasificadoTrimestre3Totales;
import modelo.EndeudamientoGlobalClasificadoTrimestreTotales;
import modelo.EndeudamientoSectFinanAsegSolidario;
import modelo.EndeudamientoSectReal;
import modelo.Huelladeconsulta;
import modelo.InformacionComercial;
import modelo.InformacionDetalladaTrimestre;
import modelo.InformacionDetalladaTrimestre2;
import modelo.InformacionDetalladaTrimestre3;
import modelo.Informedetallado;
import org.xml.sax.SAXException;

/**
 *
 * @author Jose Cogollo
 */
public class Lectura {

    public static void main(String[] args) throws ParserConfigurationException,
            SAXException, IOException, Exception {

        LeerXmlInicial resultado = new LeerXmlInicial();
        InformacionComercial Objeto = resultado.LecturaInformacion();
        //Declaro el List
        ArrayList<Informedetallado> ListaReporte1 = null;

        // De la clase que uso para leer el xml declaro la variable valor
        LecturaPartefinalXml valor = new LecturaPartefinalXml();
        //valor tiene un método  que es Lectura()
        ArrayList<String[]> informedet = valor.Lectura();

        //Defino las variables para recorrer el resultado y pasar a la Coleccón
        String fechaCuenta, tipoContrato,
                numeroCuenta, estadoCuenta,
                entidadBancaria, ciudadCuenta,
                sucursalCuenta, fechaApertura,
                chequeDevUltMes, fechapermanencia, valorsobregiro, diasautor;

        ListaReporte1 = new ArrayList();
        for (String[] next : informedet) {
            fechaCuenta = next[0];
            tipoContrato = next[1];
            numeroCuenta = next[2];
            estadoCuenta = next[3];
            entidadBancaria = next[4];
            ciudadCuenta = next[5];
            sucursalCuenta = next[6];
            fechaApertura = next[7];
            valorsobregiro = next[8];
            diasautor = next[9];
            fechapermanencia = next[10];
            chequeDevUltMes = next[11];

            ListaReporte1.add(new Informedetallado(fechaCuenta,
                    tipoContrato,
                    numeroCuenta,
                    estadoCuenta,
                    entidadBancaria,
                    ciudadCuenta,
                    sucursalCuenta,
                    fechaApertura,
                    chequeDevUltMes,
                    valorsobregiro,
                    diasautor,
                    fechapermanencia
            ));
        }
        String Reporte = "Reporteprincipal.jasper";

        ArrayList<Huelladeconsulta> ListaReporte2 = null;

        // De la clase que uso para leer el xml declaro la variable valor
        Lecturahuellaconsulta huella = new Lecturahuellaconsulta();
        //valor tiene un método  que es Lectura()
        ArrayList<String[]> huellaconsulta = huella.Obtenerhuellaconsulta();

        String entidad, fecha,
                sucursal, ciudad;

        ListaReporte2 = new ArrayList();
        for (String[] next : huellaconsulta) {
            entidad = next[0];
            fecha = next[1];
            sucursal = next[2];
            ciudad = next[3];

            ListaReporte2.add(new Huelladeconsulta(entidad,
                    fecha,
                    sucursal,
                    ciudad
            ));
        }

        ArrayList<EndeudamientoSectFinanAsegSolidario> ListaReporte3 = null;

        // De la clase que uso para leer el xml declaro la variable valor
        LecturaInformSectorFinanAseguradorySolidarioOblAldia SectAsegSolidOblAldia = new LecturaInformSectorFinanAseguradorySolidarioOblAldia();
        LecturaInformSectorFinanAseguradorySolidarioOblEnMora SectAsegSolidOblEnMora = new LecturaInformSectorFinanAseguradorySolidarioOblEnMora();
        LecturaInformSectorFinanAseguradorySolidarioOblExtinguidas SectAsegSolidOblExtinguidas = new LecturaInformSectorFinanAseguradorySolidarioOblExtinguidas();
        //valor tiene un método  que es Lectura()
        ArrayList<String[]> infoSectAsegSolid = SectAsegSolidOblAldia.LecturaSectorfinanaseguradorsolidario();
        ArrayList<String[]> infoSectAsegSolid2 = SectAsegSolidOblEnMora.LecturaSectorfinanaseguradorsolidario();
        ArrayList<String[]> infoSectAsegSolid3 = SectAsegSolidOblExtinguidas.LecturaSectorfinanaseguradorsolidario();
        infoSectAsegSolid.addAll(infoSectAsegSolid2);
        infoSectAsegSolid.addAll(infoSectAsegSolid3);

        String FCorte;
        String TipoContrato;
        double Pade;
        String Moda;
        String NrObligacion;
        String EstObliga;
        String TEntidad;
        String ClaseEntidad;
        String NombreEntidad;
        String Ciudad;
        String Sucursal;
        String EstadoTitular;
        String MrcFranquicia;
        String Clase;
        String TipoGarantia;
        String CobGarantia;
        String FechaInicio;
        String FechaTermina;
        int Pac;
        int Pag;
        int Mor;
        String Per;
        double CupoAproVlrIni;
        double CupoUtiliSal;
        double PagominimoVlrCuota;
        String SitOblCalidadDeudor;
        double VlrMoraSaldo;
        String NatuRes;
        String Rees;
        String NumeroRee;
        int MoraMax;
        String TipoPago;
        String ModoExt;
        String FechaExtin;
        String FechaPerma;
        String Comportamiento;
        String Calificacion;
        String Subtitulo;

        ListaReporte3 = new ArrayList();
        for (String[] next : infoSectAsegSolid) {
            FCorte = next[0];
            TipoContrato = next[1];
            Pade = Double.parseDouble(next[2]);
            Moda = next[3];
            NrObligacion = next[4];
            EstObliga = next[5];
            TEntidad = next[6];
            ClaseEntidad = next[7];
            NombreEntidad = next[8];
            Ciudad = next[9];
            Sucursal = next[10];
            EstadoTitular = next[11];
            MrcFranquicia = next[12];
            Clase = next[13];
            TipoGarantia = next[14];
            CobGarantia = next[15];
            FechaInicio = next[16];
            FechaTermina = next[17];
            Pac = Integer.parseInt(next[18]);
            Pag = Integer.parseInt(next[19]);
            Mor = Integer.parseInt(next[20]);
            Per = next[21];
            CupoAproVlrIni = Double.parseDouble(next[22]);
            CupoUtiliSal = Double.parseDouble(next[23]);
            PagominimoVlrCuota = Double.parseDouble(next[24]);
            SitOblCalidadDeudor = next[25];
            VlrMoraSaldo = Double.parseDouble(next[26]);
            NatuRes = next[27];
            Rees = next[28];
            NumeroRee = next[29];
            MoraMax = Integer.parseInt(next[30]);
            TipoPago = next[31];
            ModoExt = next[32];
            FechaExtin = next[33];
            FechaPerma = next[34];
            Comportamiento = next[35];
            Calificacion = next[36];
            Subtitulo = next[37];

            ListaReporte3.add(new EndeudamientoSectFinanAsegSolidario(FCorte,
                    TipoContrato,
                    Pade,
                    Moda,
                    NrObligacion,
                    EstObliga,
                    TEntidad,
                    ClaseEntidad,
                    NombreEntidad,
                    Ciudad,
                    Sucursal,
                    EstadoTitular,
                    MrcFranquicia,
                    Clase,
                    TipoGarantia,
                    CobGarantia,
                    FechaInicio,
                    FechaTermina,
                    Pac,
                    Pag,
                    Mor,
                    Per,
                    CupoAproVlrIni,
                    CupoUtiliSal,
                    PagominimoVlrCuota,
                    SitOblCalidadDeudor,
                    VlrMoraSaldo,
                    NatuRes,
                    Rees,
                    NumeroRee,
                    MoraMax,
                    TipoPago,
                    ModoExt,
                    FechaExtin,
                    FechaPerma,
                    Comportamiento,
                    Calificacion,
                    Subtitulo
            ));
        }

        ArrayList<EndeudamientoSectReal> ListaReporte4 = null;

        // De la clase que uso para leer el xml declaro la variable valor
        LecturaInformSectorFinancieroSectorRealOblAldia SectRealOblAldia = new LecturaInformSectorFinancieroSectorRealOblAldia();
        LecturaInformSectorFinancieroSectorRealOblEnMora SectRealOblEnMora = new LecturaInformSectorFinancieroSectorRealOblEnMora();
        LecturaInformSectorFinancieroSectorRealOblExtinguidas SectRealOblExtinguidas = new LecturaInformSectorFinancieroSectorRealOblExtinguidas();
        //valor tiene un método  que es Lectura()
        ArrayList<String[]> infoSectRealAldia = SectRealOblAldia.LecturaSectorfinanaseguradorsolidario();
        ArrayList<String[]> infoSectRealEnMora = SectRealOblEnMora.LecturaSectorfinanaseguradorsolidario();
        ArrayList<String[]> infoSectRealExtinguidas = SectRealOblExtinguidas.LecturaSectorfinanaseguradorsolidario();
        infoSectRealAldia.addAll(infoSectRealEnMora);
        infoSectRealAldia.addAll(infoSectRealExtinguidas);

        String FCorteR;
        String TipoContratoR;
        double PadeR;
        String ModaR;
        String NrObligacionR;
        String EstObligaR;
        String TEntidadR;
        String ClaseEntidadR;
        String NombreEntidadR;
        String CiudadR;
        String SucursalR;
        String EstadoTitularR;
        String MrcFranquiciaR;
        String ClaseR;
        String TipoGarantiaR;
        String CobGarantiaR;
        String FechaInicioR;
        String FechaTerminaR;
        int PacR;
        int PagR;
        int MorR;
        String PerR;
        double CupoAproVlrIniR;
        double CupoUtiliSalR;
        double PagominimoVlrCuotaR;
        String SitOblCalidadDeudorR;
        double VlrMoraSaldoR;
        String NatuResR;
        String ReesR;
        String NumeroReeR;
        int MoraMaxR;
        String TipoPagoR;
        String ModoExtR;
        String FechaExtinR;
        String FechaPermaR;
        String ComportamientoR;
        String CalificacionR;
        String SubtituloR;

        ListaReporte4 = new ArrayList();
        for (String[] next : infoSectRealAldia) {
            FCorteR = next[0];
            TipoContratoR = next[1];
            PadeR = Double.parseDouble(next[2]);
            ModaR = next[3];
            NrObligacionR = next[4];
            EstObligaR = next[5];
            TEntidadR = next[6];
            ClaseEntidadR = next[7];
            NombreEntidadR = next[8];
            CiudadR = next[9];
            SucursalR = next[10];
            EstadoTitularR = next[11];
            MrcFranquiciaR = next[12];
            ClaseR = next[13];
            TipoGarantiaR = next[14];
            CobGarantiaR = next[15];
            FechaInicioR = next[16];
            FechaTerminaR = next[17];
            PacR = Integer.parseInt(next[18]);
            PagR = Integer.parseInt(next[19]);
            MorR = Integer.parseInt(next[20]);
            PerR = next[21];
            CupoAproVlrIniR = Double.parseDouble(next[22]);
            CupoUtiliSalR = Double.parseDouble(next[23]);
            PagominimoVlrCuotaR = Double.parseDouble(next[24]);
            SitOblCalidadDeudorR = next[25];
            VlrMoraSaldoR = Double.parseDouble(next[26]);
            NatuResR = next[27];
            ReesR = next[28];
            NumeroReeR = next[29];
            MoraMaxR = Integer.parseInt(next[30]);
            TipoPagoR = next[31];
            ModoExtR = next[32];
            FechaExtinR = next[33];
            FechaPermaR = next[34];
            ComportamientoR = next[35];
            CalificacionR = next[36];
            SubtituloR = next[37];

            ListaReporte4.add(new EndeudamientoSectReal(FCorteR,
                    TipoContratoR,
                    PadeR,
                    ModaR,
                    NrObligacionR,
                    EstObligaR,
                    TEntidadR,
                    ClaseEntidadR,
                    NombreEntidadR,
                    CiudadR,
                    SucursalR,
                    EstadoTitularR,
                    MrcFranquiciaR,
                    ClaseR,
                    TipoGarantiaR,
                    CobGarantiaR,
                    FechaInicioR,
                    FechaTerminaR,
                    PacR,
                    PagR,
                    MorR,
                    PerR,
                    CupoAproVlrIniR,
                    CupoUtiliSalR,
                    PagominimoVlrCuotaR,
                    SitOblCalidadDeudorR,
                    VlrMoraSaldoR,
                    NatuResR,
                    ReesR,
                    NumeroReeR,
                    MoraMaxR,
                    TipoPagoR,
                    ModoExtR,
                    FechaExtinR,
                    FechaPermaR,
                    ComportamientoR,
                    CalificacionR,
                    SubtituloR
            ));
        }
        
        
        // De la clase que uso para leer el xml declaro la variable valor
        LecturaEndeudamientoGlobalClasificadoTrimestreUno valorFechass = new LecturaEndeudamientoGlobalClasificadoTrimestreUno();
        //valor tiene un método  que es Lectura()
        //ArrayList<String[]> informedet = valor.EndeudamientoGlobalClasificadoTrimestre("","");
        //ArrayList<String[]> informedet2 = valor.EndeudamientoGlobalClasificadoTrimestreTotales("","");
        ArrayList<String> listaFechasReporte = valorFechass.EndeudamientoGlobalClasificadoTrimestreFechas();

        Collections.sort(listaFechasReporte);

        String fechaTrimestre1 = "";
        String fechaTrimestre2 = "";
        String fechaTrimestre3 = "";

        int contadorFechas = 0;

        for (Iterator<String> iterator = listaFechasReporte.stream().distinct().iterator(); iterator.hasNext();) {
            String next = iterator.next();
            
            System.out.println("FECHA:"+next);

            contadorFechas = contadorFechas + 1;

            if (contadorFechas == 1) {
                fechaTrimestre1 = next;
            }
            if (contadorFechas == 2) {
                fechaTrimestre2 = next;
            }
            if (contadorFechas == 3) {
                fechaTrimestre3 = next;
            }

        }

        /*La colección de datos del EndeudamientoGlobalClasificado del trimestre 
                se conforma con la misma estructura de colección de datos para ellos de 
                definen la variables y se inicializan*/
        String entidadInformante;
        String calificacion = "";
        int cantidadTotalcreditos = 0;
        double totalDeudas = 0;
        int numeroDeudasComercial = 0;
        double valorDeudaComercial = 0;
        int numeroDeudasVivienda = 0;
        double valorDeudaVivienda = 0;
        int numeroDeudasCosumos = 0;
        double valorDeudaConsumo = 0;
        int numeroDeudasMicrocreditos = 0;
        double valordeudaMicrocredito = 0;
        String tipoGarantia = "";
        String fechaAvaluo = "";
        double valorAvaluo = 0;
        String moneda = "";
        String fuente = "";
        String fechaTrimestre = "";

        ArrayList<EndeudamientoGlobalClasificadoTrimestre> ListaReporte5 = null;

        ArrayList<String[]> EndeudamientoGlobalClasificadoTrimestre1 = new ArrayList<String[]>();
        ArrayList<String[]> InformacionDetalladaTrimestre1 = new ArrayList<String[]>();

        //MÉTODOS PARA OBTENER ENDEUDAMIENTO GLOBAL CLASFICADO TRIMESTRE 1
        LecturaEndeudamientoGlobalClasificadoTrimestreUno EndeudamientoGlobalClasifTotTrimestre = new LecturaEndeudamientoGlobalClasificadoTrimestreUno();
        //SECTOR FINANCIERO
        ArrayList<String[]> infoSectEndeudamientoGlobalClasifTottrimestreSectorFinan = EndeudamientoGlobalClasifTotTrimestre.EndeudamientoGlobalClasificadoTrimestreTotales(fechaTrimestre1, "1");
        EndeudamientoGlobalClasificadoTrimestre1.addAll(infoSectEndeudamientoGlobalClasifTottrimestreSectorFinan);
        //SECTOR COOPERATIVO
        ArrayList<String[]> infoSectEndeudamientoGlobalClasifTottrimestreSectorCooperativo = EndeudamientoGlobalClasifTotTrimestre.EndeudamientoGlobalClasificadoTrimestreTotales(fechaTrimestre1, "2");
        EndeudamientoGlobalClasificadoTrimestre1.addAll(infoSectEndeudamientoGlobalClasifTottrimestreSectorCooperativo);
        //SECTOR REAL  
        ArrayList<String[]> infoSectEndeudamientoGlobalClasifTottrimestreSectorReal = EndeudamientoGlobalClasifTotTrimestre.EndeudamientoGlobalClasificadoTrimestreTotales(fechaTrimestre1, "3");
        EndeudamientoGlobalClasificadoTrimestre1.addAll(infoSectEndeudamientoGlobalClasifTottrimestreSectorReal);

        //MÉTODOS PARA OBTENER INFORMACIÓN DETALLADA TRIMESTRE 1
        LecturaEndeudamientoGlobalClasificadoTrimestreUno EndeudamientoGlobalClasifTrimestre = new LecturaEndeudamientoGlobalClasificadoTrimestreUno();
        //SECTOR FINANCIERO
        ArrayList<String[]> IformacionDetalladaTrimestre1Sector1 = EndeudamientoGlobalClasifTrimestre.EndeudamientoGlobalClasificadoTrimestre(fechaTrimestre1, "1");
        InformacionDetalladaTrimestre1.addAll(IformacionDetalladaTrimestre1Sector1);
        //SECTOR COOPERATIVO
        ArrayList<String[]> IformacionDetalladaTrimestre1Sector2 = EndeudamientoGlobalClasifTrimestre.EndeudamientoGlobalClasificadoTrimestre(fechaTrimestre1, "2");
        InformacionDetalladaTrimestre1.addAll(IformacionDetalladaTrimestre1Sector2);
        //SECTOR REAL  
        ArrayList<String[]> IformacionDetalladaTrimestre1Sector3 = EndeudamientoGlobalClasifTrimestre.EndeudamientoGlobalClasificadoTrimestre(fechaTrimestre1, "3");
        InformacionDetalladaTrimestre1.addAll(IformacionDetalladaTrimestre1Sector3);

        //SE RECORRE COLECCIÓN DE DATOS PARA OBTENER LA TOTALIDAD DE ENTIDADES QUE REPORTAN 
        int cantidadEntidadesReporteTrimestre1 = 0;

        for (Iterator<String[]> iterator = InformacionDetalladaTrimestre1.iterator(); iterator.hasNext();) {
            String[] next = iterator.next();
            totalDeudas = Double.parseDouble(next[3]);
            if (totalDeudas > 0) {
                cantidadEntidadesReporteTrimestre1 = cantidadEntidadesReporteTrimestre1 + 1;
            }
        }

        //VARIABLES PARA CALCULAR PADE
        double padeSector = 0;
        double padeTotal = 0;
        double totalDeudasPade = 0;
        String Sector = "";
        int contadorSetor = 0;
        //OBTENER TOTAL DEUDA ENDEUDAMIENTO GLOBAL PARA CALCULAR PADE
        for (String[] next : EndeudamientoGlobalClasificadoTrimestre1) {
            totalDeudasPade = totalDeudasPade + Double.parseDouble(next[3]);
        }

        ListaReporte5 = new ArrayList();
        for (String[] next : EndeudamientoGlobalClasificadoTrimestre1) {
           

            entidadInformante = next[18];
            calificacion = next[1];
            cantidadTotalcreditos = Integer.parseInt(next[2]);
            totalDeudas = Double.parseDouble(next[3]);
            numeroDeudasComercial = Integer.parseInt(next[4]);
            valorDeudaComercial = Double.parseDouble(next[5]);
            numeroDeudasVivienda = Integer.parseInt(next[6]);
            valorDeudaVivienda = Double.parseDouble(next[7]);
            numeroDeudasCosumos = Integer.parseInt(next[8]);
            valorDeudaConsumo = Double.parseDouble(next[9]);
            numeroDeudasMicrocreditos = Integer.parseInt(next[10]);
            valordeudaMicrocredito = Double.parseDouble(next[11]);
            tipoGarantia = next[12];
            fechaAvaluo = next[13];
            valorAvaluo = Double.parseDouble(next[14]);
            moneda = next[15];
            fuente = next[16];
            padeSector = (Double.parseDouble(next[3]) / totalDeudasPade) * 100;
            fechaTrimestre = next[0];

            ListaReporte5.add(new EndeudamientoGlobalClasificadoTrimestre(entidadInformante,
                    calificacion,
                    cantidadTotalcreditos,
                    totalDeudas,
                    numeroDeudasComercial,
                    valorDeudaComercial,
                    numeroDeudasVivienda,
                    valorDeudaVivienda,
                    numeroDeudasCosumos,
                    valorDeudaConsumo,
                    numeroDeudasMicrocreditos,
                    valordeudaMicrocredito,
                    tipoGarantia,
                    fechaAvaluo,
                    valorAvaluo,
                    moneda,
                    fuente,
                    padeSector,
                    fechaTrimestre
            ));
           
        }

        EndeudamientoGlobalClasificadoTrimestreTotales ObjTotalesTrimestre1 = new EndeudamientoGlobalClasificadoTrimestreTotales();
        for (String[] next : infoSectEndeudamientoGlobalClasifTottrimestreSectorFinan) {
            ObjTotalesTrimestre1.setFechaTrimestre(next[0] + " REPORTADO POR: " + cantidadEntidadesReporteTrimestre1);

        }

        ArrayList<InformacionDetalladaTrimestre> ListaReporte6 = null;
      
        //VARIABLES PARA CALCULAR EL PADE INFORMACIÓN DETALLADA TRIMESTRE
        
        double padeDetalleTrimestre1 = 0;
        double padeTotalDetalleTrimestre1 = 0;
        double totalDeudasPadeDetalleTrimestre1 = 0;
        String SectorDetalleTrimestre1 = "";
        int contadorSetorDetalleTrimestre1 = 0;

        // VARIABLE MODELO INFORMACION DETALLADA TRIMESTRE
        
        String sector = "";
        String nombreEntidad = "";
        String tipoEntidad = "";
        String nombreEntidadOrigenCartera = "";
        String tipoFid = "";
        String numeroFideico = "";
        String modalidadCredito = "";
        String calificaciond = "";
        String tipoMoneda = "";
        int numeroDeudas = 0;
        double valorDeudas = 0;
        double pade = 0;
        double porcentajeGarantia = 0;
        String tipoGarantiad = "";
        String fechaAvaluod = "";
        double cuotaEsparada = 0;
        double porcentajeCumplimiento = 0;

        //OBTENER TOTAL DEUDA ENDEUDAMIENTO GLOBAL PARA CALCULAR PADE TREIMESTRE 1
        for (String[] next : InformacionDetalladaTrimestre1) {
            totalDeudasPadeDetalleTrimestre1 = totalDeudasPadeDetalleTrimestre1 + Double.parseDouble(next[3]);
        }

        ListaReporte6 = new ArrayList();
        for (String[] next : InformacionDetalladaTrimestre1) {
           

            sector = next[18];
            nombreEntidad = next[0];
            tipoEntidad = "";
            nombreEntidadOrigenCartera = "";
            tipoFid = "";
            numeroFideico = "";
            modalidadCredito = next[17];
            calificacion = next[1];
            tipoMoneda = next[15];
            numeroDeudas = Integer.parseInt(next[2]);
            valorDeudas = Double.parseDouble(next[3]);
            pade = (Double.parseDouble(next[3]) / totalDeudasPadeDetalleTrimestre1) * 100;
            porcentajeGarantia = 0;
            tipoGarantia = next[12];
            fechaAvaluo = next[13];
            cuotaEsparada = 0;
            porcentajeCumplimiento = 0;
            
            ListaReporte6.add(new InformacionDetalladaTrimestre(sector,
                    nombreEntidad,
                    tipoEntidad,
                    nombreEntidadOrigenCartera,
                    tipoFid,
                    numeroFideico,
                    modalidadCredito,
                    calificacion,
                    tipoMoneda,
                    numeroDeudas,
                    valorDeudas,
                    pade,
                    porcentajeGarantia,
                    tipoGarantia,
                    fechaAvaluo,
                    cuotaEsparada,
                    porcentajeCumplimiento));
            

            contadorSetorDetalleTrimestre1 = contadorSetorDetalleTrimestre1 + 1;
        }

        /*<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
        
         /*La colección de datos del EndeudamientoGlobalClasificado del trimestre 
                se conforma con la misma estructura de colección de datos para ellos de 
                definen la variables y se inicializan*/
        String entidadInformanteT2;
        String calificacionT2 = "";
        int cantidadTotalcreditosT2 = 0;
        double totalDeudasT2 = 0;
        int numeroDeudasComercialT2 = 0;
        double valorDeudaComercialT2 = 0;
        int numeroDeudasViviendaT2 = 0;
        double valorDeudaViviendaT2 = 0;
        int numeroDeudasCosumosT2 = 0;
        double valorDeudaConsumoT2 = 0;
        int numeroDeudasMicrocreditosT2 = 0;
        double valordeudaMicrocreditoT2 = 0;
        String tipoGarantiaT2 = "";
        String fechaAvaluoT2 = "";
        double valorAvaluoT2 = 0;
        String monedaT2 = "";
        String fuenteT2 = "";
        String fechaTrimestreT2 = "";
        
        ArrayList<EndeudamientoGlobalClasificadoTrimestre2> ListaReporte7 = null;

        ArrayList<String[]> EndeudamientoGlobalClasificadoTrimestre2 = new ArrayList<String[]>();
        ArrayList<String[]> InformacionDetalladaTrimestre2 = new ArrayList<String[]>();

        //MÉTODOS PARA OBTENER ENDEUDAMIENTO GLOBAL CLASFICADO TRIMESTRE 2
        LecturaEndeudamientoGlobalClasificadoTrimestreUno EndeudamientoGlobalClasifTotTrimestre2 = new LecturaEndeudamientoGlobalClasificadoTrimestreUno();
        //SECTOR FINANCIERO
        ArrayList<String[]> infoSectEndeudamientoGlobalClasifTottrimestre2SectorFinan = EndeudamientoGlobalClasifTotTrimestre2.EndeudamientoGlobalClasificadoTrimestreTotales(fechaTrimestre2, "1");
        EndeudamientoGlobalClasificadoTrimestre2.addAll(infoSectEndeudamientoGlobalClasifTottrimestre2SectorFinan);
        //SECTOR COOPERATIVO
        ArrayList<String[]> infoSectEndeudamientoGlobalClasifTottrimestre2SectorCooperativo = EndeudamientoGlobalClasifTotTrimestre2.EndeudamientoGlobalClasificadoTrimestreTotales(fechaTrimestre2, "2");
        EndeudamientoGlobalClasificadoTrimestre2.addAll(infoSectEndeudamientoGlobalClasifTottrimestre2SectorCooperativo);
        //SECTOR REAL  
        ArrayList<String[]> infoSectEndeudamientoGlobalClasifTottrimestre2SectorReal = EndeudamientoGlobalClasifTotTrimestre2.EndeudamientoGlobalClasificadoTrimestreTotales(fechaTrimestre2, "3");
        EndeudamientoGlobalClasificadoTrimestre2.addAll(infoSectEndeudamientoGlobalClasifTottrimestre2SectorReal);

        //MÉTODOS PARA OBTENER INFORMACIÓN DETALLADA TRIMESTRE 2
        LecturaEndeudamientoGlobalClasificadoTrimestreUno EndeudamientoGlobalClasifTrimestre2 = new LecturaEndeudamientoGlobalClasificadoTrimestreUno();
        //SECTOR FINANCIERO
        ArrayList<String[]> IformacionDetalladaTrimestre2Sector1 = EndeudamientoGlobalClasifTrimestre2.EndeudamientoGlobalClasificadoTrimestre(fechaTrimestre2, "1");
        InformacionDetalladaTrimestre2.addAll(IformacionDetalladaTrimestre2Sector1);
        //SECTOR COOPERATIVO
        ArrayList<String[]> IformacionDetalladaTrimestre2Sector2 = EndeudamientoGlobalClasifTrimestre2.EndeudamientoGlobalClasificadoTrimestre(fechaTrimestre2, "2");
        InformacionDetalladaTrimestre2.addAll(IformacionDetalladaTrimestre2Sector2);
        //SECTOR REAL  
        ArrayList<String[]> IformacionDetalladaTrimestre2Sector3 = EndeudamientoGlobalClasifTrimestre2.EndeudamientoGlobalClasificadoTrimestre(fechaTrimestre2, "3");
        InformacionDetalladaTrimestre2.addAll(IformacionDetalladaTrimestre2Sector3);

        //SE RECORRE COLECCIÓN DE DATOS PARA OBTENER LA TOTALIDAD DE ENTIDADES QUE REPORTAN 
        int cantidadEntidadesReporteTrimestre2 = 0;

        for (Iterator<String[]> iterator = InformacionDetalladaTrimestre2.iterator(); iterator.hasNext();) {
            String[] next = iterator.next();
            totalDeudas = Double.parseDouble(next[3]);
            if (totalDeudas > 0) {
                cantidadEntidadesReporteTrimestre2 = cantidadEntidadesReporteTrimestre2 + 1;
            }
        }
		
		//VARIABLES PARA CALCULAR PADE
        double padeSectorTrimeste2 = 0;
        double padeTotalTrimeste2 = 0;
        double totalDeudasPadeTrimeste2 = 0;
        String SectorTrimeste2 = "";
        int contadorSetorTrimeste2 = 0;
        
        
         // VARIABLE MODELO INFORMACION DETALLADA TRIMESTRE
        
        String sectorT2 = "";
        String nombreEntidadT2 = "";
        String tipoEntidadT2 = "";
        String nombreEntidadOrigenCarteraT2 = "";
        String tipoFidT2 = "";
        String numeroFideicoT2 = "";
        String modalidadCreditoT2 = "";
        String calificaciondT2 = "";
        String tipoMonedaT2 = "";
        int numeroDeudasT2 = 0;
        double valorDeudasT2 = 0;
        double padeT2 = 0;
        double porcentajeGarantiaT2 = 0;
        String tipoGarantiadT2 = "";
        String fechaAvaluodT2 = "";
        double cuotaEsparadaT2 = 0;
        double porcentajeCumplimientoT2 = 0;
        
        //OBTENER TOTAL DEUDA ENDEUDAMIENTO GLOBAL PARA CALCULAR PADE
        for (String[] next : EndeudamientoGlobalClasificadoTrimestre2) {
            totalDeudasPadeTrimeste2 = totalDeudasPadeTrimeste2 + Double.parseDouble(next[3]);
        }
		
		 ListaReporte7 = new ArrayList();
        for (String[] next : EndeudamientoGlobalClasificadoTrimestre2) {
           

            entidadInformanteT2 = next[18];
            calificacionT2 = next[1];
            cantidadTotalcreditosT2 = Integer.parseInt(next[2]);
            totalDeudasT2 = Double.parseDouble(next[3]);
            numeroDeudasComercialT2 = Integer.parseInt(next[4]);
            valorDeudaComercialT2 = Double.parseDouble(next[5]);
            numeroDeudasViviendaT2 = Integer.parseInt(next[6]);
            valorDeudaViviendaT2 = Double.parseDouble(next[7]);
            numeroDeudasCosumosT2 = Integer.parseInt(next[8]);
            valorDeudaConsumoT2 = Double.parseDouble(next[9]);
            numeroDeudasMicrocreditosT2 = Integer.parseInt(next[10]);
            valordeudaMicrocreditoT2 = Double.parseDouble(next[11]);
            tipoGarantiaT2 = next[12];
            fechaAvaluoT2 = next[13];
            valorAvaluoT2 = Double.parseDouble(next[14]);
            monedaT2 = next[15];
            fuenteT2 = next[16];
            padeSectorTrimeste2 = (Double.parseDouble(next[3]) / totalDeudasPade) * 100;
            fechaTrimestreT2 = next[0];

            ListaReporte7.add(new EndeudamientoGlobalClasificadoTrimestre2(entidadInformanteT2,
                    calificacionT2,
                    cantidadTotalcreditosT2,
                    totalDeudasT2,
                    numeroDeudasComercialT2,
                    valorDeudaComercialT2,
                    numeroDeudasViviendaT2,
                    valorDeudaViviendaT2,
                    numeroDeudasCosumosT2,
                    valorDeudaConsumoT2,
                    numeroDeudasMicrocreditosT2,
                    valordeudaMicrocreditoT2,
                    tipoGarantiaT2,
                    fechaAvaluoT2,
                    valorAvaluoT2,
                    monedaT2,
                    fuenteT2,
                    padeSectorTrimeste2,
                    fechaTrimestreT2
            ));
            contadorSetorTrimeste2 = contadorSetorTrimeste2 + 1;
        }
		
        EndeudamientoGlobalClasificadoTrimestre2Totales ObjTotalesTrimestre2 = new EndeudamientoGlobalClasificadoTrimestre2Totales();
        for (String[] next : infoSectEndeudamientoGlobalClasifTottrimestre2SectorFinan) {
            ObjTotalesTrimestre2.setFechaTrimestre(next[0] + " REPORTADO POR: " + cantidadEntidadesReporteTrimestre2);

        }

        ArrayList<InformacionDetalladaTrimestre2> ListaReporte8 = null;
        
        
        
      
        //VARIABLES PARA CALCULAR EL PADE INFORMACIÓN DETALLADA TRIMESTRE 2
        
        double padeDetalleTrimestre2 = 0;
        double padeTotalDetalleTrimestre2 = 0;
        double totalDeudasPadeDetalleTrimestre2 = 0;
        String SectorDetalleTrimestre2 = "";
        int contadorSetorDetalleTrimestre2 = 0;
		

        //OBTENER TOTAL DEUDA ENDEUDAMIENTO GLOBAL PARA CALCULAR PADE TREIMESTRE 2
        for (String[] next : InformacionDetalladaTrimestre2) {
            totalDeudasPadeDetalleTrimestre2 = totalDeudasPadeDetalleTrimestre2 + Double.parseDouble(next[3]);
        }
		
		ListaReporte8 = new ArrayList();
        for (String[] next : InformacionDetalladaTrimestre2) {
           
            sectorT2 = next[18];
            nombreEntidadT2 = next[0];
            tipoEntidadT2 = "";
            nombreEntidadOrigenCarteraT2 = "";
            tipoFidT2 = "";
            numeroFideicoT2 = "";
            modalidadCreditoT2 = next[17];
            calificacionT2 = next[1];
            tipoMonedaT2 = next[15];
            numeroDeudasT2 = Integer.parseInt(next[2]);
            valorDeudasT2 = Double.parseDouble(next[3]);
            padeT2 = (Double.parseDouble(next[3]) / totalDeudasPadeDetalleTrimestre1) * 100;
            porcentajeGarantiaT2 = 0;
            tipoGarantiaT2 = next[12];
            fechaAvaluoT2 = next[13];
            cuotaEsparadaT2 = 0;
            porcentajeCumplimientoT2 = 0;
            
            ListaReporte8.add(new InformacionDetalladaTrimestre2(sectorT2,
                    nombreEntidadT2,
                    tipoEntidadT2,
                    nombreEntidadOrigenCarteraT2,
                    tipoFidT2,
                    numeroFideicoT2,
                    modalidadCreditoT2,
                    calificacionT2,
                    tipoMonedaT2,
                    numeroDeudasT2,
                    valorDeudasT2,
                    padeT2,
                    porcentajeGarantiaT2,
                    tipoGarantiaT2,
                    fechaAvaluoT2,
                    cuotaEsparadaT2,
                    porcentajeCumplimientoT2));
            

            contadorSetorDetalleTrimestre2 = contadorSetorDetalleTrimestre2 + 1;
        }
			
                /*<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
        
         /*La colección de datos del EndeudamientoGlobalClasificado del trimestre 
                se conforma con la misma estructura de colección de datos para ellos de 
                definen la variables y se inicializan*/
        String entidadInformanteT3;
        String calificacionT3 = "";
        int cantidadTotalcreditosT3 = 0;
        double totalDeudasT3 = 0;
        int numeroDeudasComercialT3 = 0;
        double valorDeudaComercialT3 = 0;
        int numeroDeudasViviendaT3 = 0;
        double valorDeudaViviendaT3 = 0;
        int numeroDeudasCosumosT3 = 0;
        double valorDeudaConsumoT3 = 0;
        int numeroDeudasMicrocreditosT3 = 0;
        double valordeudaMicrocreditoT3 = 0;
        String tipoGarantiaT3 = "";
        String fechaAvaluoT3 = "";
        double valorAvaluoT3 = 0;
        String monedaT3 = "";
        String fuenteT3 = "";
        String fechaTrimestreT3 = "";
        
        ArrayList<EndeudamientoGlobalClasificadoTrimestre3> ListaReporte9 = null;

        ArrayList<String[]> EndeudamientoGlobalClasificadoTrimestre3 = new ArrayList<String[]>();
        ArrayList<String[]> InformacionDetalladaTrimestre3 = new ArrayList<String[]>();

        //MÉTODOS PARA OBTENER ENDEUDAMIENTO GLOBAL CLASFICADO TRIMESTRE 3
        LecturaEndeudamientoGlobalClasificadoTrimestreUno EndeudamientoGlobalClasifTotTrimestre3 = new LecturaEndeudamientoGlobalClasificadoTrimestreUno();
        //SECTOR FINANCIERO
        ArrayList<String[]> infoSectEndeudamientoGlobalClasifTottrimestre3SectorFinan = EndeudamientoGlobalClasifTotTrimestre3.EndeudamientoGlobalClasificadoTrimestreTotales(fechaTrimestre3, "1");
        EndeudamientoGlobalClasificadoTrimestre3.addAll(infoSectEndeudamientoGlobalClasifTottrimestre3SectorFinan);
        //SECTOR COOPERATIVO
        ArrayList<String[]> infoSectEndeudamientoGlobalClasifTotTrimestre3SectorCooperativo = EndeudamientoGlobalClasifTotTrimestre3.EndeudamientoGlobalClasificadoTrimestreTotales(fechaTrimestre3, "2");
        EndeudamientoGlobalClasificadoTrimestre3.addAll(infoSectEndeudamientoGlobalClasifTotTrimestre3SectorCooperativo);
        //SECTOR REAL  
        ArrayList<String[]> infoSectEndeudamientoGlobalClasifTotTrimestre3SectorReal = EndeudamientoGlobalClasifTotTrimestre3.EndeudamientoGlobalClasificadoTrimestreTotales(fechaTrimestre3, "3");
        EndeudamientoGlobalClasificadoTrimestre3.addAll(infoSectEndeudamientoGlobalClasifTotTrimestre3SectorReal);

        //MÉTODOS PARA OBTENER INFORMACIÓN DETALLADA TRIMESTRE 3
        LecturaEndeudamientoGlobalClasificadoTrimestreUno EndeudamientoGlobalClasifTrimestre3 = new LecturaEndeudamientoGlobalClasificadoTrimestreUno();
        //SECTOR FINANCIERO
        ArrayList<String[]> IformacionDetalladaTrimestre3Sector1 = EndeudamientoGlobalClasifTrimestre3.EndeudamientoGlobalClasificadoTrimestre(fechaTrimestre3, "1");
        InformacionDetalladaTrimestre3.addAll(IformacionDetalladaTrimestre3Sector1);
        //SECTOR COOPERATIVO
        ArrayList<String[]> IformacionDetalladaTrimestre3Sector2 = EndeudamientoGlobalClasifTrimestre3.EndeudamientoGlobalClasificadoTrimestre(fechaTrimestre3, "2");
        InformacionDetalladaTrimestre3.addAll(IformacionDetalladaTrimestre3Sector2);
        //SECTOR REAL  
        ArrayList<String[]> IformacionDetalladaTrimestre3Sector3 = EndeudamientoGlobalClasifTrimestre3.EndeudamientoGlobalClasificadoTrimestre(fechaTrimestre3, "3");
        InformacionDetalladaTrimestre3.addAll(IformacionDetalladaTrimestre3Sector3);

        //SE RECORRE COLECCIÓN DE DATOS PARA OBTENER LA TOTALIDAD DE ENTIDADES QUE REPORTAN 
        int cantidadEntidadesReporteTrimestre3 = 0;

        for (Iterator<String[]> iterator = InformacionDetalladaTrimestre3.iterator(); iterator.hasNext();) {
            String[] next = iterator.next();
            totalDeudas = Double.parseDouble(next[3]);
            if (totalDeudas > 0) {
                cantidadEntidadesReporteTrimestre3 = cantidadEntidadesReporteTrimestre3 + 1;
            }
        }
		
		//VARIABLES PARA CALCULAR PADE
        double padeSectorTrimeste3 = 0;
        double padeTotalTrimeste3 = 0;
        double totalDeudasPadeTrimeste3 = 0;
        String SectorTrimeste3 = "";
        int contadorSetorTrimeste3 = 0;
        
        
         // VARIABLE MODELO INFORMACION DETALLADA TRIMESTRE
        
        String sectorT3 = "";
        String nombreEntidadT3 = "";
        String tipoEntidadT3 = "";
        String nombreEntidadOrigenCarteraT3 = "";
        String tipoFidT3 = "";
        String numeroFideicoT3 = "";
        String modalidadCreditoT3 = "";
        String calificaciondT3 = "";
        String tipoMonedaT3 = "";
        int numeroDeudasT3 = 0;
        double valorDeudasT3 = 0;
        double padeT3 = 0;
        double porcentajeGarantiaT3 = 0;
        String tipoGarantiadT3 = "";
        String fechaAvaluodT3 = "";
        double cuotaEsparadaT3 = 0;
        double porcentajeCumplimientoT3 = 0;
        
        //OBTENER TOTAL DEUDA ENDEUDAMIENTO GLOBAL PARA CALCULAR PADE
        for (String[] next : EndeudamientoGlobalClasificadoTrimestre3) {
            totalDeudasPadeTrimeste3 = totalDeudasPadeTrimeste3 + Double.parseDouble(next[3]);
        }
		
		 ListaReporte9 = new ArrayList();
        for (String[] next : EndeudamientoGlobalClasificadoTrimestre3) {
           

            entidadInformanteT3 = next[18];
            calificacionT3 = next[1];
            cantidadTotalcreditosT3 = Integer.parseInt(next[2]);
            totalDeudasT3 = Double.parseDouble(next[3]);
            numeroDeudasComercialT3 = Integer.parseInt(next[4]);
            valorDeudaComercialT3 = Double.parseDouble(next[5]);
            numeroDeudasViviendaT3 = Integer.parseInt(next[6]);
            valorDeudaViviendaT3 = Double.parseDouble(next[7]);
            numeroDeudasCosumosT3 = Integer.parseInt(next[8]);
            valorDeudaConsumoT3 = Double.parseDouble(next[9]);
            numeroDeudasMicrocreditosT3 = Integer.parseInt(next[10]);
            valordeudaMicrocreditoT3 = Double.parseDouble(next[11]);
            tipoGarantiaT3 = next[12];
            fechaAvaluoT3 = next[13];
            valorAvaluoT3 = Double.parseDouble(next[14]);
            monedaT3 = next[15];
            fuenteT3 = next[16];
            padeSectorTrimeste3 = (Double.parseDouble(next[3]) / totalDeudasPade) * 100;
            fechaTrimestreT3 = next[0];

            ListaReporte9.add(new EndeudamientoGlobalClasificadoTrimestre3(entidadInformanteT3,
                    calificacionT3,
                    cantidadTotalcreditosT3,
                    totalDeudasT3,
                    numeroDeudasComercialT3,
                    valorDeudaComercialT3,
                    numeroDeudasViviendaT3,
                    valorDeudaViviendaT3,
                    numeroDeudasCosumosT3,
                    valorDeudaConsumoT3,
                    numeroDeudasMicrocreditosT3,
                    valordeudaMicrocreditoT3,
                    tipoGarantiaT3,
                    fechaAvaluoT3,
                    valorAvaluoT3,
                    monedaT3,
                    fuenteT3,
                    padeSectorTrimeste3,
                    fechaTrimestreT3
            ));
            contadorSetorTrimeste3 = contadorSetorTrimeste3 + 1;
        }
		
        EndeudamientoGlobalClasificadoTrimestre3Totales ObjTotalesTrimestre3 = new EndeudamientoGlobalClasificadoTrimestre3Totales();
        for (String[] next : infoSectEndeudamientoGlobalClasifTottrimestre3SectorFinan) {
            ObjTotalesTrimestre3.setFechaTrimestre(next[0] + " REPORTADO POR: " + cantidadEntidadesReporteTrimestre3);

        }

        ArrayList<InformacionDetalladaTrimestre3> ListaReporte10 = null;
        
        
        
      
        //VARIABLES PARA CALCULAR EL PADE INFORMACIÓN DETALLADA TRIMESTRE 3
        
        double padeDetalleTrimestre3 = 0;
        double padeTotalDetalleTrimestre3 = 0;
        double totalDeudaspadeDetalleTrimestre3 = 0;
        String SectorDetalleTrimestre3 = "";
        int contadorSetorDetalleTrimestre3 = 0;
		

        //OBTENER TOTAL DEUDA ENDEUDAMIENTO GLOBAL PARA CALCULAR PADE TREIMESTRE 3
        for (String[] next : InformacionDetalladaTrimestre3) {
            totalDeudaspadeDetalleTrimestre3 = totalDeudaspadeDetalleTrimestre3 + Double.parseDouble(next[3]);
        }
		
		ListaReporte10 = new ArrayList();
        for (String[] next : InformacionDetalladaTrimestre3) {
           
            sectorT3 = next[18];
            nombreEntidadT3 = next[0];
            tipoEntidadT3 = "";
            nombreEntidadOrigenCarteraT3 = "";
            tipoFidT3 = "";
            numeroFideicoT3 = "";
            modalidadCreditoT3 = next[17];
            calificacionT3 = next[1];
            tipoMonedaT3 = next[15];
            numeroDeudasT3 = Integer.parseInt(next[2]);
            valorDeudasT3 = Double.parseDouble(next[3]);
            padeT3 = (Double.parseDouble(next[3]) / totalDeudasPadeDetalleTrimestre1) * 100;
            porcentajeGarantiaT3 = 0;
            tipoGarantiaT3 = next[12];
            fechaAvaluoT3 = next[13];
            cuotaEsparadaT3 = 0;
            porcentajeCumplimientoT3 = 0;
            
            ListaReporte10.add(new InformacionDetalladaTrimestre3(sectorT3,
                    nombreEntidadT3,
                    tipoEntidadT3,
                    nombreEntidadOrigenCarteraT3,
                    tipoFidT3,
                    numeroFideicoT3,
                    modalidadCreditoT3,
                    calificacionT3,
                    tipoMonedaT3,
                    numeroDeudasT3,
                    valorDeudasT3,
                    padeT3,
                    porcentajeGarantiaT3,
                    tipoGarantiaT3,
                    fechaAvaluoT3,
                    cuotaEsparadaT3,
                    porcentajeCumplimientoT3));
            

            contadorSetorDetalleTrimestre3 = contadorSetorDetalleTrimestre3 + 1;
        }
        
        
        Parametros p = new Parametros();
        p.setReportedetalladojasper(Reporte);
        p.setObj2(ListaReporte1);
        p.Imprimirreporte2(Reporte, ListaReporte1, ListaReporte2, ListaReporte3, ListaReporte4, ListaReporte5, ObjTotalesTrimestre1, ListaReporte6 , ListaReporte7, ObjTotalesTrimestre2 ,ListaReporte8, ListaReporte9, ObjTotalesTrimestre3 ,ListaReporte10, Objeto);

        //corramos esto en modo debug y mira
        //listo
    }

}
