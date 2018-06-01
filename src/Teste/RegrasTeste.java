/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Teste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author gilson.alves
 */
public class RegrasTeste {
    
    public static void main(String[]agrs){
    
        escalaGerada gerada_01 = new escalaGerada();//0
        escalaGerada gerada_02 = new escalaGerada();
        escalaGerada gerada_03 = new escalaGerada();
        escalaGerada gerada_04 = new escalaGerada();
        escalaGerada gerada_05 = new escalaGerada();
        escalaGerada gerada_06 = new escalaGerada();
        escalaGerada gerada_07 = new escalaGerada();
        escalaGerada gerada_08 = new escalaGerada();
        escalaGerada gerada_09 = new escalaGerada();
        escalaGerada gerada_10 = new escalaGerada();
        
      gerada_01.setOperador("1");
      gerada_02.setOperador("Carlos Henrique Sousa e Silva");
      gerada_03.setOperador("Lidiane Lima Dias dos Santos");
      gerada_04.setOperador("Vitoria Regia Morais Bezerra");
      gerada_05.setOperador("1");
      gerada_06.setOperador("Ana Paula Ferreira de Araujo");
      gerada_07.setOperador("Letícia de Araújo Carvalho");
      gerada_08.setOperador("Aline Helen da Silva Rocha");
      gerada_09.setOperador("2");
      gerada_10.setOperador("Herivan de Sá Mendes");
      
        
      
      List <escalaGerada> lista = new ArrayList<escalaGerada>();
      
       lista.add(gerada_01);
        lista.add(gerada_02);
        lista.add(gerada_03);
        lista.add(gerada_04);
        lista.add(gerada_05);
        lista.add(gerada_06);
        lista.add(gerada_07);
        lista.add(gerada_08);
        lista.add(gerada_09);
        lista.add(gerada_10);
        
        System.out.println("Atual\n");
        int x = 0;
        int y = 0;
        for (escalaGerada gerada : lista) {
              System.out.println(++x+" - "+gerada.getOperador());
         }
      System.out.println("--------------------------------------");
    
      if(lista.get(0).getOperador().equals("1")){
         System.out.println("Alterada \n");
          Collections.swap(lista, 0, 5);
           //Collections.swap(lista, 5, 6);
           Collections.swap(lista,6 ,7);
          for (escalaGerada gerada : lista) {
              System.out.println(++y+"-"+gerada.getOperador());
         }
     }else{
               System.out.println("NAO");
           }
        
    }
}
