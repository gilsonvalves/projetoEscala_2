/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

/**
 *
 * @author gilson
 */
public class GeraRelatorio {
    
    public void Imprimi(List lista){
    String caminho = "/Relatorios/escala.jrxml";
    InputStream relJasper = getClass().getResourceAsStream(caminho);
    JRBeanCollectionDataSource ds = new JRBeanCollectionDataSource(lista);
    Map paramentros = new HashMap();
    JasperPrint impressao = null;
    
    try{
    impressao = JasperFillManager.fillReport(relJasper, paramentros, ds);
    JasperViewer viewer = new JasperViewer(impressao,true);
    viewer.setVisible(true);
    
}catch(JRException e){
 System.out.println(e.getMessage());   
}
    
    }
}
