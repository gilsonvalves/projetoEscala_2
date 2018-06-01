/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import java.util.Date;
import sun.util.calendar.BaseCalendar;

/**
 *
 * @author gilson
 */
public class GerarEscala {
    
    public static void main(String[]agrs){
       
        Date data = new Date();
        String dia = ""+data.getDate();
        String mes = ""+String.valueOf(data.getMonth()+1);
        String ano = ""+(1900 + data.getYear());  
        
        escalaTeste gerar = new escalaTeste();
        
        System.out.println(data);
    }
    
    public void data(){
    
        Date data = new Date();
        String dia = ""+data.getDate();
        String mes = ""+String.valueOf(data.getMonth()+1);
        String ano = ""+(1900 + data.getYear());
    }
}
