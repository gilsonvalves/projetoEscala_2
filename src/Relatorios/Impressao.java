/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Teste;

import java.util.List;
import java.io.InputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author gilson.alves
 */
public class Impressao {
    
    
    public void imprime_Relatior(List lista){
    
        String caminho = "escala.jasper";
        InputStream relJasper = getClass().getResourceAsStream(caminho);
        JRBeanCollectionDataSource ds = new JRBeanCollectionDataSource(lista);
        
        Map parametros  = new HashMap();
        //JasperPrint impressao = null;
        try {
            JasperPrint impressao = JasperFillManager.fillReport(caminho, parametros, ds);
            JasperViewer viewer = new JasperViewer(impressao);
            viewer.setVisible(true);
        } catch (JRException e) {
            System.out.println(e.getMessage());
        }
    
}}
