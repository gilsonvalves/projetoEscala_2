/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Teste;

import Model.Operador;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 *
 * @author gilson.alves
 */
public class GeraTeste {
 
    
    public static void main(String[]agrs){
    
        escalaGerada gerada_01 = new escalaGerada();
        escalaGerada gerada_02 = new escalaGerada();
        escalaGerada gerada_03 = new escalaGerada();
        escalaGerada gerada_04 = new escalaGerada();
        escalaGerada gerada_05 = new escalaGerada();
        escalaGerada gerada_06 = new escalaGerada();
        escalaGerada gerada_07 = new escalaGerada();
        escalaGerada gerada_08 = new escalaGerada();
        escalaGerada gerada_09 = new escalaGerada();
        escalaGerada gerada_10 = new escalaGerada();
        escalaGerada gerada_11 = new escalaGerada();
        escalaGerada gerada_12 = new escalaGerada();
        escalaGerada gerada_13 = new escalaGerada();
        
        Date data = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
       
        String dataFormatada = formato.format(data);
             
        
        
        //AQUI TRAZ O OBJETO       
        gerada_01.setData(data);
        gerada_01.setHorario(" 06 às 12 – Cedente/IB ");
        gerada_01.setOperador("GILSON V ALVE");
        
        gerada_02.setData(data);
        gerada_02.setHorario(" 06 às 12 – Cedente/IB ");
        gerada_02.setOperador("Daniel Ferreira de Jesus");
        
        gerada_03.setData(data);
        gerada_03.setHorario(" 06 às 12 – Cedente/IB ");
        gerada_03.setOperador("Vanessa Alves Rodrigues");
        
        gerada_04.setData(data);
        gerada_04.setHorario(" 06 às 12 – Cedente/IB ");
        gerada_04.setOperador("Lidiane Lima Dias dos Santos");
        
        gerada_05.setData(data);
        gerada_05.setHorario(" 06 às 12 – Cedente/IB ");
        gerada_05.setOperador("Vitoria Regia Morais Bezerra");
        
        gerada_06.setData(data);
        gerada_06.setHorario(" 06 às 12 – Cedente/IB ");
        gerada_06.setOperador("Alexandre Henrique Fonseca");
        
        gerada_07.setData(data);
        gerada_07.setHorario(" 06 às 12 – Cedente/IB ");
        gerada_07.setOperador("Ana Amélia da Conceição");
        
        List <escalaGerada> lista = new ArrayList<escalaGerada>(); 
        lista.add(gerada_01);
        lista.add(gerada_02);
        lista.add(gerada_03);
        lista.add(gerada_04);
        lista.add(gerada_05);
        lista.add(gerada_06);
        lista.add(gerada_07);
        lista.add(gerada_08);
        System.out.println("Ordem\n");
        System.out.println(lista.get(0).getOperador());
        System.out.println(lista.get(1).getOperador());
        System.out.println(lista.get(2).getOperador());
        System.out.println(lista.get(3).getOperador());
        System.out.println(lista.get(4).getOperador());
        System.out.println(lista.get(5).getOperador());
        System.out.println(lista.get(6).getOperador());
       
        System.out.println("\n\nFIM");
        Collections.shuffle(lista);
       
        System.out.println("Sorteio\n");
        System.out.println(lista.get(0).getOperador());
        System.out.println(lista.get(1).getOperador());
        System.out.println(lista.get(2).getOperador());
        System.out.println(lista.get(3).getOperador());
        System.out.println(lista.get(4).getOperador());
        System.out.println(lista.get(5).getOperador());
        System.out.println(lista.get(6).getOperador());
        //AQUI GERA A ESCALA
        for(int x= 0; x <14 ;x++){
            //System.out.println(lista.get(0).getOperador());
        }}
    
}
