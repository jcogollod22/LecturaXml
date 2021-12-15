/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaxml;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
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
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.data.JRMapCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Jose Cogollo
 */
public class Parametros {

    // public static void Imprimirreporte2(String reportedetalladojasper, List<Informedetallado> obj2)
    private String reportedetalladojasper;
    private List<Informedetallado> obj2;

    public String getReportedetalladojasper() {
        return reportedetalladojasper;
    }

    public void setReportedetalladojasper(String reportedetalladojasper) {
        this.reportedetalladojasper = reportedetalladojasper;
    }

    public List<Informedetallado> getObj2() {
        return obj2;
    }

    public void setObj2(List<Informedetallado> obj2) {
        this.obj2 = obj2;
    }

    public void Imprimirreporte2(String reportedetalladojasper, ArrayList<Informedetallado> obj2, ArrayList<Huelladeconsulta> obj3, ArrayList<EndeudamientoSectFinanAsegSolidario> obj4, ArrayList<EndeudamientoSectReal> obj5, ArrayList<EndeudamientoGlobalClasificadoTrimestre> obj6, EndeudamientoGlobalClasificadoTrimestreTotales ObjEndGlobalClasifTrimestre1, ArrayList<InformacionDetalladaTrimestre> obj7, ArrayList<EndeudamientoGlobalClasificadoTrimestre2> obj8, EndeudamientoGlobalClasificadoTrimestre2Totales ObjEndGlobalClasifTrimestre2, ArrayList<InformacionDetalladaTrimestre2> obj9, ArrayList<EndeudamientoGlobalClasificadoTrimestre3> obj10, EndeudamientoGlobalClasificadoTrimestre3Totales ObjEndGlobalClasifTrimestre3, ArrayList<InformacionDetalladaTrimestre3> obj11, InformacionComercial Objeto) {
        JasperReport masterReport = null;

        String Subreporte = "Reportedetallado.jasper";
        String Subreporte2 = "Huelladeconsulta.jasper";
        String Subreporte3 = "EndeudamientoSectFinanAsegSolidario.jasper";
        String Subreporte4 = "EndeudamientoSectReal.jasper";
        String Subreporte5 = "EndeudamientoSectReal2.jasper";
        String Subreporte6 = "Reporteprincipal2.jasper";
        String Subreporte7 = "EndeudamientoGlobalClasificadoTrimestreuno.jasper";
        String Subreporte8 = "InformacionDetalladaTrimestreUno.jasper";
        String Subreporte9 = "EndeudamientoGlobalClasificadoTrimestredos.jasper";
        String Subreporte10 = "InformacionDetalladaTrimestreDos.jasper";
        String Subreporte11 = "EndeudamientoGlobalClasificadoTrimestretres.jasper";
        String Subreporte12 = "InformacionDetalladaTrimestreTres.jasper";

        try {
            URL master = this.getClass().getResource("/Reportes/" + reportedetalladojasper);

            InputStream subInputStream = this.getClass().getResourceAsStream("/Reportes/" + Subreporte);
            InputStream subInputStream2 = this.getClass().getResourceAsStream("/Reportes/" + Subreporte2);
            InputStream subInputStream3 = this.getClass().getResourceAsStream("/Reportes/" + Subreporte3);
            InputStream subInputStream4 = this.getClass().getResourceAsStream("/Reportes/" + Subreporte4);
            InputStream subInputStream5 = this.getClass().getResourceAsStream("/Reportes/" + Subreporte5);
            InputStream subInputStream6 = this.getClass().getResourceAsStream("/Reportes/" + Subreporte6);
            InputStream subInputStream7 = this.getClass().getResourceAsStream("/Reportes/" + Subreporte7);
            InputStream subInputStream8 = this.getClass().getResourceAsStream("/Reportes/" + Subreporte8);
            InputStream subInputStream9 = this.getClass().getResourceAsStream("/Reportes/" + Subreporte9);
            InputStream subInputStream10 = this.getClass().getResourceAsStream("/Reportes/" + Subreporte10);
            InputStream subInputStream11 = this.getClass().getResourceAsStream("/Reportes/" + Subreporte11);
            InputStream subInputStream12 = this.getClass().getResourceAsStream("/Reportes/" + Subreporte12);

            if (master == null) {
                JOptionPane.showMessageDialog(null, "Archivo no encontrado");
            }

            TestFactoryDetalles javabean4 = new TestFactoryDetalles();
            javabean4.setModeloReport1(obj2);

            TestFactoryHuellaconsulta javabean5 = new TestFactoryHuellaconsulta();
            javabean5.setModeloReport1(obj3);

            TesFactoryEndeudamientoSectFinanAsegSolidario javabean6 = new TesFactoryEndeudamientoSectFinanAsegSolidario();
            javabean6.setModeloReport1(obj4);

            TestFactoryEndeudamientoSectorReal javabean7 = new TestFactoryEndeudamientoSectorReal();
            javabean7.setModeloReport1(obj5);

            TesFactoryEndeudamientoGlobalClasificcadoTrimestre javabean8 = new TesFactoryEndeudamientoGlobalClasificcadoTrimestre();
            javabean8.setModeloReport5(obj6);

            TestFactoryInformacionDetalladaTrimestre javabean9 = new TestFactoryInformacionDetalladaTrimestre();
            javabean9.setModeloReport1(obj7);

            TesFactoryEndeudamientoGlobalClasificcadoTrimestre2 javabean10 = new TesFactoryEndeudamientoGlobalClasificcadoTrimestre2();
            javabean10.setModeloReport5(obj8);

            TestFactoryInformacionDetalladaTrimestre2 javabean11 = new TestFactoryInformacionDetalladaTrimestre2();
            javabean11.setModeloReport1(obj9);

            TesFactoryEndeudamientoGlobalClasificcadoTrimestre3 javabean12 = new TesFactoryEndeudamientoGlobalClasificcadoTrimestre3();
            javabean12.setModeloReport5(obj10);

            TestFactoryInformacionDetalladaTrimestre3 javabean13 = new TestFactoryInformacionDetalladaTrimestre3();
            javabean13.setModeloReport1(obj11);

            try {
                masterReport = (JasperReport) JRLoader.loadObject(master);

            } catch (JRException e) {
                JOptionPane.showMessageDialog(null, e);
            }
            String NOMBRE = "INFORME DETALLADO INFORMACÓN DE CUENTAS";

            final Map<String, Object> parametro = new HashMap<String, Object>();

            parametro.put("Tipoidentificacion", "" + Objeto.getTipoidentificacion());
            parametro.put("Identificacion", "" + Objeto.getIdentificacion());
            parametro.put("Razonsocial", "" + Objeto.getRazonsocial());
            parametro.put("Actividadeconomica", "" + Objeto.getActividadeconomica());
            parametro.put("Estadodocumento", "" + Objeto.getEstadodocumento());
            parametro.put("Fechaexpedicion", "" + Objeto.getFechaexpedicion());
            parametro.put("Lugarexpedicion", "" + Objeto.getLugarexpedicion());
            parametro.put("Rangoedad", "" + Objeto.getRangoedad());
            parametro.put("Fechaconsulta", "" + Objeto.getFechaconsulta());
            parametro.put("Horaconsulta", "" + Objeto.getHoraconsulta());
            parametro.put("Usuarioconsulta", "" + Objeto.getUsuarioconsulta());
            parametro.put("Nomerodeinforme", "" + Objeto.getNomerodeinforme());
            parametro.put("Score", "" + Objeto.getScore());
            parametro.put("TarjcreditoCantTotalesPpal", Objeto.getTarjcreditoCantTotalesPpal());
            parametro.put("TarjcreditoSaldoTotalesPpal", Objeto.getTarjcreditoSaldoTotalesPpal());
            parametro.put("TarjcreditoPadeOblaldiaPpal", Objeto.getTarjcreditoPadeOblaldiaPpal());
            parametro.put("TarjcreditoCantOblaldiaPpal", Objeto.getTarjcreditoCantOblaldiaPpal());
            parametro.put("TarjcreditoSaldoTotalOblaldiaPpal", Objeto.getTarjcreditoSaldoTotalOblaldiaPpal());
            parametro.put("TarjcreditoCuotaOblenmoraPpal", Objeto.getTarjcreditoCuotaOblenmoraPpal());
            parametro.put("TarjcreditoCantOblenmoraPpal", Objeto.getTarjcreditoCantOblenmoraPpal());
            parametro.put("TarjcreditoSaldoTotalenmoraPpal", Objeto.getTarjcreditoSaldoTotalenmoraPpal());
            parametro.put("TarjcreditoCuotaPpal", Objeto.getTarjcreditoCuotaPpal());
            parametro.put("TarjcreditoValenmoraPpal", Objeto.getTarjcreditoValenmoraPpal());
            parametro.put("SectorFinanCantTotalesPpal", Objeto.getSectorFinanCantTotalesPpal());
            parametro.put("SectorFinanSaldoTotalesPpal", Objeto.getSectorFinanSaldoTotalesPpal());
            parametro.put("SectorFinanPadeOblaldiaPpal", Objeto.getSectorFinanPadeOblaldiaPpal());
            parametro.put("SectorFinanCantOblaldiaPpal", Objeto.getSectorFinanCantOblaldiaPpal());
            parametro.put("SectorFinanSaldoTotalOblaldiaPpal", Objeto.getSectorFinanSaldoTotalOblaldiaPpal());
            parametro.put("SectorFinanCuotaOblenmoraPpal", Objeto.getSectorFinanCuotaOblenmoraPpal());
            parametro.put("SectorFinanCantOblenmoraPpal", Objeto.getSectorFinanCantOblenmoraPpal());
            parametro.put("SectorFinanSaldoTotalenmoraPpal", Objeto.getSectorFinanSaldoTotalenmoraPpal());
            parametro.put("SectorFinanCuotaPpal", Objeto.getSectorFinanCuotaPpal());
            parametro.put("SectorFinanValenmoraPpal", Objeto.getSectorFinanValenmoraPpal());
            parametro.put("SectorSolidCantTotalesPpal", Objeto.getSectorSolidCantTotalesPpal());
            parametro.put("SectorSolidSaldoTotalesPpal", Objeto.getSectorSolidSaldoTotalesPpal());
            parametro.put("SectorSolidPadeOblaldiaPpal", Objeto.getSectorSolidPadeOblaldiaPpal());
            parametro.put("SectorSolidCantOblaldiaPpal", Objeto.getSectorSolidCantOblaldiaPpal());
            parametro.put("SectorSolidSaldoTotalOblaldiaPpal", Objeto.getSectorSolidSaldoTotalOblaldiaPpal());
            parametro.put("SectorSolidCuotaOblenmoraPpal", Objeto.getSectorSolidCuotaOblenmoraPpal());
            parametro.put("SectorSolidCantOblenmoraPpal", Objeto.getSectorSolidCantOblenmoraPpal());
            parametro.put("SectorSolidSaldoTotalenmoraPpal", Objeto.getSectorSolidSaldoTotalenmoraPpal());
            parametro.put("SectorSolidCuotaPpal", Objeto.getSectorSolidCuotaPpal());
            parametro.put("SectorSolidValenmoraPpal", Objeto.getSectorSolidValenmoraPpal());
            parametro.put("SectorRealCantTotalesPpal", Objeto.getSectorRealCantTotalesPpal());
            parametro.put("SectorRealSaldoTotalesPpal", Objeto.getSectorRealSaldoTotalesPpal());
            parametro.put("SectorRealPadeOblaldiaPpal", Objeto.getSectorRealPadeOblaldiaPpal());
            parametro.put("SectorRealCantOblaldiaPpal", Objeto.getSectorRealCantOblaldiaPpal());
            parametro.put("SectorRealSaldoTotalOblaldiaPpal", Objeto.getSectorRealSaldoTotalOblaldiaPpal());
            parametro.put("SectorRealCuotaOblenmoraPpal", Objeto.getSectorRealCuotaOblenmoraPpal());
            parametro.put("SectorRealCantOblenmoraPpal", Objeto.getSectorRealCantOblenmoraPpal());
            parametro.put("SectorRealSaldoTotalenmoraPpal", Objeto.getSectorRealSaldoTotalenmoraPpal());
            parametro.put("SectorRealCuotaPpal", Objeto.getSectorRealCuotaPpal());
            parametro.put("SectorRealValenmoraPpal", Objeto.getSectorRealValenmoraPpal());
            parametro.put("SaldoTotalPpalCantTotalesPpal", Objeto.getSaldoTotalPpalCantTotalesPpal());
            parametro.put("SaldoTotalPpalSaldoTotalesPpal", Objeto.getSaldoTotalPpalSaldoTotalesPpal());
            parametro.put("SaldoTotalPpalPadeOblaldiaPpal", Objeto.getSaldoTotalPpalPadeOblaldiaPpal());
            parametro.put("SaldoTotalPpalCantOblaldiaPpal", Objeto.getSaldoTotalPpalCantOblaldiaPpal());
            parametro.put("SaldoTotalPpalSaldoTotalOblaldiaPpal", Objeto.getSaldoTotalPpalSaldoTotalOblaldiaPpal());
            parametro.put("SaldoTotalPpalCuotaOblenmoraPpal", Objeto.getSaldoTotalPpalCuotaOblenmoraPpal());
            parametro.put("SaldoTotalPpalCantOblenmoraPpal", Objeto.getSaldoTotalPpalCantOblenmoraPpal());
            parametro.put("SaldoTotalPpalSaldoTotalenmoraPpal", Objeto.getSaldoTotalPpalSaldoTotalenmoraPpal());
            parametro.put("SaldoTotalPpalCuotaPpal", Objeto.getSaldoTotalPpalCuotaPpal());
            parametro.put("SaldoTotalPpalValenmoraPpal", Objeto.getSaldoTotalPpalValenmoraPpal());
            parametro.put("ResumenTotalCantTotalesPpalyCoe", Objeto.getResumenTotalCantTotalesPpalyCoe());
            parametro.put("ResumenTotalSaldoTotalesPpalyCoe", Objeto.getResumenTotalSaldoTotalesPpalyCoe());
            parametro.put("TarjcreditoCantTotalesCoe", Objeto.getTarjcreditoCantTotalesCoe());
            parametro.put("TarjcreditoSaldoTotalesCoe", Objeto.getTarjcreditoSaldoTotalesCoe());
            parametro.put("TarjcreditoPadeOblaldiaCoe", Objeto.getTarjcreditoPadeOblaldiaCoe());
            parametro.put("TarjcreditoCantOblaldiaCoe", Objeto.getTarjcreditoCantOblaldiaCoe());
            parametro.put("TarjcreditoSaldoTotalOblaldiaCoe", Objeto.getTarjcreditoSaldoTotalOblaldiaCoe());
            parametro.put("TarjcreditoCuotaOblenmoraCoe", Objeto.getTarjcreditoCuotaOblenmoraCoe());
            parametro.put("TarjcreditoCantOblenmoraCoe", Objeto.getTarjcreditoCantOblenmoraCoe());
            parametro.put("TarjcreditoSaldoTotalenmoraCoe", Objeto.getTarjcreditoSaldoTotalenmoraCoe());
            parametro.put("TarjcreditoCuotaCoe", Objeto.getTarjcreditoCuotaCoe());
            parametro.put("TarjcreditoValenmoraCoe", Objeto.getTarjcreditoValenmoraCoe());
            parametro.put("SectorFinanCantTotalesCoe", Objeto.getSectorFinanCantTotalesCoe());
            parametro.put("SectorFinanSaldoTotalesCoe", Objeto.getSectorFinanSaldoTotalesCoe());
            parametro.put("SectorFinanPadeOblaldiaCoe", Objeto.getSectorFinanPadeOblaldiaCoe());
            parametro.put("SectorFinanCantOblaldiaCoe", Objeto.getSectorFinanCantOblaldiaCoe());
            parametro.put("SectorFinanSaldoTotalOblaldiaCoe", Objeto.getSectorFinanSaldoTotalOblaldiaCoe());
            parametro.put("SectorFinanCuotaOblenmoraCoe", Objeto.getSectorFinanCuotaOblenmoraCoe());
            parametro.put("SectorFinanCantOblenmoraCoe", Objeto.getSectorFinanCantOblenmoraCoe());
            parametro.put("SectorFinanSaldoTotalenmoraCoe", Objeto.getSectorFinanSaldoTotalenmoraCoe());
            parametro.put("SectorFinanCuotaCoe", Objeto.getSectorFinanCuotaCoe());
            parametro.put("SectorFinanValenmoraCoe", Objeto.getSectorFinanValenmoraCoe());
            parametro.put("SectorSolidCantTotalesCoe", Objeto.getSectorSolidCantTotalesCoe());
            parametro.put("SectorSolidSaldoTotalesCoe", Objeto.getSectorSolidSaldoTotalesCoe());
            parametro.put("SectorSolidPadeOblaldiaCoe", Objeto.getSectorSolidPadeOblaldiaCoe());
            parametro.put("SectorSolidCantOblaldiaCoe", Objeto.getSectorSolidCantOblaldiaCoe());
            parametro.put("SectorSolidSaldoTotalOblaldiaCoe", Objeto.getSectorSolidSaldoTotalOblaldiaCoe());
            parametro.put("SectorSolidCuotaOblenmoraCoe", Objeto.getSectorSolidCuotaOblenmoraCoe());
            parametro.put("SectorSolidCantOblenmoraCoe", Objeto.getSectorSolidCantOblenmoraCoe());
            parametro.put("SectorSolidSaldoTotalenmoraCoe", Objeto.getSectorSolidSaldoTotalenmoraCoe());
            parametro.put("SectorSolidCuotaCoe", Objeto.getSectorSolidCuotaCoe());
            parametro.put("SectorSolidValenmoraCoe", Objeto.getSectorSolidValenmoraCoe());
            parametro.put("SectorRealCantTotalesCoe", Objeto.getSectorRealCantTotalesCoe());
            parametro.put("SectorRealSaldoTotalesCoe", Objeto.getSectorRealSaldoTotalesCoe());
            parametro.put("SectorRealPadeOblaldiaCoe", Objeto.getSectorRealPadeOblaldiaCoe());
            parametro.put("SectorRealCantOblaldiaCoe", Objeto.getSectorRealCantOblaldiaCoe());
            parametro.put("SectorRealSaldoTotalOblaldiaCoe", Objeto.getSectorRealSaldoTotalOblaldiaCoe());
            parametro.put("SectorRealCuotaOblenmoraCoe", Objeto.getSectorRealCuotaOblenmoraCoe());
            parametro.put("SectorRealCantOblenmoraCoe", Objeto.getSectorRealCantOblenmoraCoe());
            parametro.put("SectorRealSaldoTotalenmoraCoe", Objeto.getSectorRealSaldoTotalenmoraCoe());
            parametro.put("SectorRealCuotaCoe", Objeto.getSectorRealCuotaCoe());
            parametro.put("SectorRealValenmoraCoe", Objeto.getSectorRealValenmoraCoe());
            parametro.put("SaldoTotalCantTotalesCoe", Objeto.getSaldoTotalCantTotalesCoe());
            parametro.put("SaldoTotalSaldoTotalesCoe", Objeto.getSaldoTotalSaldoTotalesCoe());
            parametro.put("SaldoTotalPadeOblaldiaCoe", Objeto.getSaldoTotalPadeOblaldiaCoe());
            parametro.put("SaldoTotalCantOblaldiaCoe", Objeto.getSaldoTotalCantOblaldiaCoe());
            parametro.put("SaldoTotalSaldoTotalOblaldiaCoe", Objeto.getSaldoTotalSaldoTotalOblaldiaCoe());
            parametro.put("SaldoTotalCuotaOblenmoraCoe", Objeto.getSaldoTotalCuotaOblenmoraCoe());
            parametro.put("SaldoTotalCantOblenmoraCoe", Objeto.getSaldoTotalCantOblenmoraCoe());
            parametro.put("SaldoTotalSaldoTotalenmoraCoe", Objeto.getSaldoTotalSaldoTotalenmoraCoe());
            parametro.put("SaldoTotalCuotaCoe", Objeto.getSaldoTotalCuotaCoe());
            parametro.put("SaldoTotalValenmoraCoe", Objeto.getSaldoTotalValenmoraCoe());
            parametro.put("ResumenTotalPadeOblaldiaPpalyCoe", Objeto.getResumenTotalPadeOblaldiaPpalyCoe());
            parametro.put("ResumenTotalCantOblaldiaPpalyCoe", Objeto.getResumenTotalCantOblaldiaPpalyCoe());
            parametro.put("ResumenTotalSaldoTotalOblaldiaPpalyCoe", Objeto.getResumenTotalSaldoTotalOblaldiaPpalyCoe());
            parametro.put("ResumenTotalCuotaOblenmoraPpalyCoe", Objeto.getResumenTotalCuotaOblenmoraPpalyCoe());
            parametro.put("ResumenTotalCantOblenmoraPpalyCoe", Objeto.getResumenTotalCantOblenmoraPpalyCoe());
            parametro.put("ResumenTotalSaldoTotalenmoraPpalyCoe", Objeto.getResumenTotalSaldoTotalenmoraPpalyCoe());
            parametro.put("ResumenTotalCuotaPpalyCoe", Objeto.getResumenTotalCuotaPpalyCoe());
            parametro.put("ResumenTotalValenmoraPpalyCoe", Objeto.getResumenTotalValenmoraPpalyCoe());

            parametro.put("SUBREPORT_INPUT_STREAM", subInputStream);
            parametro.put("SUBREPORT_INPUT_STREAM2", subInputStream2);
            parametro.put("SUBREPORT_INPUT_STREAM3", subInputStream3);
            parametro.put("SUBREPORT_INPUT_STREAM4", subInputStream4);
            parametro.put("SUBREPORT_INPUT_STREAM5", subInputStream5);
            parametro.put("SUBREPORT_INPUT_STREAM6", subInputStream6);
            parametro.put("SUBREPORT_INPUT_STREAM7", subInputStream7);
            parametro.put("SUBREPORT_INPUT_STREAM8", subInputStream8);
            parametro.put("SUBREPORT_INPUT_STREAM9", subInputStream9);
            parametro.put("SUBREPORT_INPUT_STREAM10", subInputStream10);
            parametro.put("SUBREPORT_INPUT_STREAM11", subInputStream11);
            parametro.put("SUBREPORT_INPUT_STREAM12", subInputStream12);
            parametro.put("colection", javabean4.generateCollection());
            parametro.put("colectionhuella", javabean5.generateCollection());
            parametro.put("CollectionEndeudaSectFinanAsegSol", javabean6.generateCollection());
            parametro.put("CollectionEndeudaSectReal", javabean7.generateCollection());
            parametro.put("CollectionEndeudaSectRealFinal", javabean7.generateCollection());
            parametro.put("CollectionEndeudaGlobalClasificadoTrimestre", javabean8.generateCollection());
            parametro.put("CollectionInformacionDetalladaTrimestre1", javabean9.generateCollection());
            parametro.put("fechaTrimestreReporte", ObjEndGlobalClasifTrimestre1.getFechaTrimestre());
            parametro.put("fechaInformacionDetalladaTrimestreReporte", ObjEndGlobalClasifTrimestre1.getFechaTrimestre());

            parametro.put("CollectionEndeudaGlobalClasificadoTrimestredos", javabean10.generateCollection());
            parametro.put("CollectionInformacionDetalladaTrimestre2", javabean11.generateCollection());
            parametro.put("fechaTrimestreReporteEndeudaGlobaltrimestredos", ObjEndGlobalClasifTrimestre2.getFechaTrimestre());
            parametro.put("fechaInformacionDetalladaTrimestre2Reporte", ObjEndGlobalClasifTrimestre2.getFechaTrimestre());

            parametro.put("CollectionEndeudaGlobalClasificadoTrimestretres", javabean12.generateCollection());
            parametro.put("CollectionInformacionDetalladaTrimestre3", javabean13.generateCollection());
            parametro.put("fechaTrimestreReporteEndeudaGlobaltrimestretres", ObjEndGlobalClasifTrimestre3.getFechaTrimestre());
            parametro.put("fechaInformacionDetalladaTrimestre3Reporte", ObjEndGlobalClasifTrimestre3.getFechaTrimestre());

            // esta igual  y te muestro el reporte
            JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport, parametro, new JREmptyDataSource());

            JasperViewer jviewer = new JasperViewer(jasperPrint, false);
            jviewer.setExtendedState(jviewer.MAXIMIZED_BOTH);
            //jviewer.setTitle(titulo);
            jviewer.setVisible(true);

        } catch (Exception j) {
            JOptionPane.showMessageDialog(null, j);
        }
    }

}
