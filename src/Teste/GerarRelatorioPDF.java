/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Teste;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gilson.alves
 */
public class GerarRelatorioPDF {
 
    
    
    public static void main(String[]agrs){ 
    geraPDF();
    }
    public static void geraPDF(){
   
        List<String> lista = new ArrayList<>();
       lista.add("Carlos");
       lista.add("Torre de babel");
       Document doc = new Document();
       String arquivoPdf = "relatorio.pdf";
        try {
            PdfWriter.getInstance(doc,new FileOutputStream(arquivoPdf));
            doc.open();
            
            Paragraph p = new Paragraph(" Escala Cedente ");
            //BaseFont bf = BaseFont.createFont(BaseFont.COURIER, "# simple 32 0020 0188", true);
            p.setAlignment(1);
            doc.add(p);
            p = new Paragraph(" ");
            PdfPTable table = new PdfPTable(2);
            
            PdfPCell cell = new PdfPCell(new Paragraph("Ilha/Horario"));
            PdfPCell cell4 = new PdfPCell(new Paragraph("Teleoperador"));
            table.addCell(cell);
             table.addCell(cell4);
            
            for (String listap : lista) {
            
                PdfPCell cell2 = new PdfPCell(new Paragraph(" Dia 12/02"));
                PdfPCell cell3 = new PdfPCell(new Paragraph(lista.get(1)+"dia 13/02 "));
                table.addCell(cell2);
                table.addCell(cell3);
           }
            doc.add(table);
            doc.close();
            Desktop.getDesktop().open(new File(arquivoPdf));
            
            
        } catch (Exception e) {
        }
                
    }
    
   
}
