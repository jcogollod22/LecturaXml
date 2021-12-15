/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaxml;

import java.net.URL;
import java.sql.Connection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import modelo.Informedetallado;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Jose Cogollo
 */
public class Jreportes {
    
    public void Imprimirreporte(String reporte,String titulo,String autor){
              try{
                 URL master = this.getClass().getResource("/Reportes/"+reporte);
                 //String SUBREPORT_DIR = this.getClass().getResource("/Reportes/").toString();
                 //String imagenes = this.getClass().getResource("/Reportes/USUARIOS.png").toString();

                 if (master == null){
                     JOptionPane.showMessageDialog(null,"Archivo no encontrado");
                 }
                 JasperReport masterReport = null;

                 try{
                     masterReport = (JasperReport) JRLoader.loadObject(master);
                 }catch (JRException e){
                     JOptionPane.showMessageDialog(null,e);
                 }

                 Map<String, Object> parametro = new HashMap<String, Object>();
                 parametro.values();
                 parametro.put("titulo", titulo);
                 parametro.put("autor", autor);
                 //parametro.put("imagenes", imagenes);

                 //Reporte diseñado y compilado con iReport
                 //JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport,parametro,con);
                 JRDataSource vacio = new JREmptyDataSource(1);
                 JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport,parametro,vacio);

                 //Se lanza el Viewer de Jasper, no termina aplicación al salir
                 JasperViewer jviewer = new JasperViewer(jasperPrint,false);
                 jviewer.setExtendedState(jviewer.MAXIMIZED_BOTH);
                 jviewer.setTitle(titulo);
                 jviewer.setVisible(true);
              }catch (Exception j){
                  JOptionPane.showMessageDialog(null,j);
              }
    } 
    
        public void Imprimirreporte2(String reporte, List<Informedetallado> obj2){
              try{
                 URL master = this.getClass().getResource("/Reportes/"+reporte);
           

                 if (master == null){
                     JOptionPane.showMessageDialog(null,"Archivo no encontrado");
                 }
                 JasperReport masterReport = null;

                 TestFactoryDetalles javabean4 = new TestFactoryDetalles();
		 javabean4.setModeloReport1(obj2);
                 
                 try{
                     masterReport = (JasperReport) JRLoader.loadObject(master);
                 }catch (JRException e){
                     JOptionPane.showMessageDialog(null,e);
                 }

                
        
                 JRDataSource vacio = new JREmptyDataSource(1);
                 JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport,null,new JRBeanCollectionDataSource(javabean4.generateCollection()));

                 JasperViewer jviewer = new JasperViewer(jasperPrint,false);
                 jviewer.setExtendedState(jviewer.MAXIMIZED_BOTH);
                 //jviewer.setTitle(titulo);
                 jviewer.setVisible(true);
              }catch (Exception j){
                  JOptionPane.showMessageDialog(null,j);
              }
    } 

   
    
}
