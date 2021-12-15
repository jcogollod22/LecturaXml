/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaxml;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

import modelo.Participante;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;

/**
 *
 * @author Jose Cogollo
 */
public class PRUEBAECIROTORIO {
    
    public  void LLENARPDF() throws Exception
    {
        
          URL master = this.getClass().getResource("/Reportes/reporte3PDF.jasper");
                 //String SUBREPORT_DIR = this.getClass().getResource("/Reportes/").toString();
                 //String imagenes = this.getClass().getResource("/Reportes/USUARIOS.png").toString();

                 if (master == null){
                     JOptionPane.showMessageDialog(null,"Archivo no encontrado");
                 }
        List<Participante> listaPariticipantes = new ArrayList<Participante>();
        for (int i = 1; i <= 10; i++)
        {
            Participante p = new Participante(i, "id" + i, "username" + i, "Pass " + i, "password" + i);
            p.setPuntos(i);
            
            listaPariticipantes.add(p);
        }

        JasperReport reporte = (JasperReport) JRLoader.loadObject(master);

        Map<String, Object> parametros = new HashMap<String, Object>();
        parametros.put("autor", "Juan");
        parametros.put("titulo", "Reporte Participantes");

        JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, parametros, new JRBeanCollectionDataSource(listaPariticipantes));

        JRExporter exporter = new JRPdfExporter();
        exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
        exporter.setParameter(JRExporterParameter.OUTPUT_FILE, new java.io.File("reporte3PDF.pdf"));
        exporter.exportReport();
    }
    
}
