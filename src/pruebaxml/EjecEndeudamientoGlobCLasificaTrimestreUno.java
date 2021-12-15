/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaxml;

import java.io.IOException;
import java.util.*;
import javax.xml.parsers.ParserConfigurationException;
import modelo.EndeudamientoGlobalClasificadoTrimestre;
import modelo.Huelladeconsulta;
import modelo.Sectorfinanaseguradorsolidario;
import org.xml.sax.SAXException;

/**
 *
 * @author Jose Cogollo
 */
public class EjecEndeudamientoGlobCLasificaTrimestreUno {

    public static void main(String[] args) throws ParserConfigurationException,
            SAXException, IOException, Exception {

        ArrayList<EndeudamientoGlobalClasificadoTrimestre> ListaReporte1 = null;

        // De la clase que uso para leer el xml declaro la variable valor
        LecturaEndeudamientoGlobalClasificadoTrimestreUno valor = new LecturaEndeudamientoGlobalClasificadoTrimestreUno();
        //valor tiene un método  que es Lectura()
        //ArrayList<String[]> informedet = valor.EndeudamientoGlobalClasificadoTrimestre("","");
        //ArrayList<String[]> informedet2 = valor.EndeudamientoGlobalClasificadoTrimestreTotales("","");
        ArrayList<String> fechas = valor.EndeudamientoGlobalClasificadoTrimestreFechas();

        Collections.sort(fechas);

        String fechaTrimestre1 = "";
        String fechaTrimestre2 = "";
        String fechaTrimestre3 = "";

        int contadorFechas = 0;

        for (Iterator<String> iterator = fechas.stream().distinct().iterator(); iterator.hasNext();) {
            String next = iterator.next();

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

        System.out.println("FECHA1: " + fechaTrimestre1);
        System.out.println("FECHA2: " + fechaTrimestre2);
        System.out.println("FECHA3: " + fechaTrimestre3);

    }

}
