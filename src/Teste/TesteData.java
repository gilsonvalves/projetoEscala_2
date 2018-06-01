/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Teste;

import Model.Operador;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author gilson.alves
 */
public class TesteData {
    
    public static void main(String[]agrs){
        int a = 1;
       
           
       LocalDate agora = LocalDate.now();
       //System.out.println("Mes que vem: "+agora.plusMonths(1));
      // LocalDate vem = LocalDate.of(agora.getYear(), agora.plusMonths(1).getMonth(), 1);
       
      // System.out.println("Sabado "+vem.getDayOfWeek().SATURDAY.adjustInto(vem));
       //  LocalDate vem2 = LocalDate.of(agora.getYear(), agora.plusMonths(1).getMonth(),7);
        // System.out.println("Sabado "+vem2.getDayOfWeek().SATURDAY.adjustInto(vem2));
        //LocalDate vem3 = LocalDate.of(agora.getYear(), agora.plusMonths(1).getMonth(),15);
       //System.out.println("Sabado "+vem3.getDayOfWeek().SATURDAY.adjustInto(vem3));
     
        List <String> listaSabado = new ArrayList<String>();
        List <String> listaDomingo = new ArrayList<String>();
        for(int x = 1;x < 30;x++){
        x = 5+x;
         LocalDate vem4 = LocalDate.of(agora.getYear(), agora.plusMonths(1).getMonth(),x);
          //System.out.println("Sabado "+vem4.getDayOfWeek().SATURDAY.adjustInto(vem4));
          //System.out.println("Domingo "+vem4.getDayOfWeek().SUNDAY.adjustInto(vem4));
          listaSabado.add("Sabado "+vem4.getDayOfWeek().SATURDAY.adjustInto(vem4));
          listaDomingo.add("Domingo "+vem4.getDayOfWeek().SUNDAY.adjustInto(vem4));
     
       }
        System.out.println(listaSabado);
         System.out.println(listaDomingo);
    }
}
