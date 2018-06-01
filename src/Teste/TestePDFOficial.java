/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Teste;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author gilson.alves
 */
public class TestePDFOficial {
    
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
        escalaGerada gerada_11 = new escalaGerada();
        escalaGerada gerada_12 = new escalaGerada();
        escalaGerada gerada_13 = new escalaGerada();
        escalaGerada gerada_14 = new escalaGerada();
        escalaGerada gerada_15 = new escalaGerada();
        escalaGerada gerada_16 = new escalaGerada();
        escalaGerada gerada_17 = new escalaGerada();
        escalaGerada gerada_18 = new escalaGerada();
        escalaGerada gerada_19 = new escalaGerada();
        escalaGerada gerada_20 = new escalaGerada();
        escalaGerada gerada_21 = new escalaGerada();
        escalaGerada gerada_22 = new escalaGerada();
        escalaGerada gerada_23 = new escalaGerada();
        escalaGerada gerada_24 = new escalaGerada();
        escalaGerada gerada_25 = new escalaGerada();
        escalaGerada gerada_26 = new escalaGerada();
        escalaGerada gerada_27 = new escalaGerada();
        escalaGerada gerada_28 = new escalaGerada();
        escalaGerada gerada_29 = new escalaGerada();
        escalaGerada gerada_30 = new escalaGerada();
            escalaGerada gerada_31 = new escalaGerada();
                escalaGerada gerada_32 = new escalaGerada();
                    escalaGerada gerada_33 = new escalaGerada();
                    escalaGerada gerada_34 = new escalaGerada();
                     escalaGerada gerada_35 = new escalaGerada();
                         escalaGerada gerada_36 = new escalaGerada();
                             escalaGerada gerada_37 = new escalaGerada();
                                escalaGerada gerada_38 = new escalaGerada();
                           escalaGerada gerada_39 = new escalaGerada();
                        escalaGerada gerada_40 = new escalaGerada();
                        escalaGerada gerada_41 = new escalaGerada();
                    escalaGerada gerada_42 = new escalaGerada();
                    escalaGerada gerada_43 = new escalaGerada();
                  escalaGerada gerada_44 = new escalaGerada();
                  escalaGerada gerada_45 = new escalaGerada();
                escalaGerada gerada_46 = new escalaGerada();
                escalaGerada gerada_47 = new escalaGerada();
                escalaGerada gerada_48 = new escalaGerada();
                escalaGerada gerada_49 = new escalaGerada();
                escalaGerada gerada_50 = new escalaGerada();
                escalaGerada gerada_51 = new escalaGerada();
                escalaGerada gerada_52 = new escalaGerada();
                escalaGerada gerada_53 = new escalaGerada();
                escalaGerada gerada_54 = new escalaGerada();
                escalaGerada gerada_55 = new escalaGerada();
                escalaGerada gerada_56 = new escalaGerada();
                escalaGerada gerada_57 = new escalaGerada();
                escalaGerada gerada_58 = new escalaGerada();
                escalaGerada gerada_59 = new escalaGerada();
                escalaGerada gerada_60 = new escalaGerada();
                escalaGerada gerada_61 = new escalaGerada();
                escalaGerada gerada_62 = new escalaGerada();
                escalaGerada gerada_63 = new escalaGerada();
                escalaGerada gerada_64 = new escalaGerada();
                escalaGerada gerada_65 = new escalaGerada();
                escalaGerada gerada_66 = new escalaGerada();
                escalaGerada gerada_67 = new escalaGerada();
                //escalaGerada gerada_68 = new escalaGerada();
                
                //TOTAL DE TELEOPERADORES................68
        
      //GALERA DAS 22HS
      gerada_01.setOperador("Gilson Vieira Alves");
      gerada_02.setOperador("Celso Francisco da Silva Filho");
      gerada_03.setOperador("Paulo Henrique Pereira Silva");
      gerada_04.setOperador("Manoel Victor da Costa");
      gerada_05.setOperador("Weslley Joaquim Gomes");
      //falta um aqui
      
      //GALERA DAS 07HS
      gerada_06.setOperador("Cynthia Lino Cabral");
      gerada_07.setOperador("Alexandre Henrique Fonseca");
      gerada_08.setOperador("Lidiane Lima Dias dos Santos");
      gerada_09.setOperador("Ana Amélia da Conceição");
      gerada_10.setOperador("Daniel Ferreira de Jesus");
      gerada_11.setOperador("Vitoria Regia Morais Bezerra");
      
      gerada_12.setOperador("Ana Paula Ferreira de Araujo");
      gerada_13.setOperador("Letícia de Araújo Carvalho");
      gerada_14.setOperador("Aline Helen da Silva Rocha (vago)");
      gerada_15.setOperador("Carlos Henrique Sousa e Silva");
      gerada_16.setOperador("Herivan de Sá Mendes");
      gerada_17.setOperador("Michel Fonseca da Silva");
      gerada_18.setOperador("Marcelo Pires Campos");
      gerada_19.setOperador("Tatiane Nunes Machado");
      
      //SDG..............
      gerada_20.setOperador("Vanessa Alves Rodrigues");
      gerada_21.setOperador("Allany de Souza Neves");
      gerada_22.setOperador("Juliana Martins da Silva");
      gerada_23.setOperador("Jaqueline Pereira dos Santos");
      gerada_24.setOperador("Roberta Elaina A Sales Marques");
      gerada_25.setOperador("Jéssica de Oliveira Silva");
      gerada_26.setOperador("Márcia Montalvão dos Santos");
      gerada_27.setOperador("Raissa Eleuterio Mesquita Maia");
      gerada_28.setOperador("Aristácio Clemente Palmeira");
      gerada_29.setOperador("Jenifer Alves de Oliveira");  
      
      //restante
      gerada_30.setOperador("Paulo Henrique Cunha Santos");
      gerada_31.setOperador("Yuri Alec da Silva Chagas");
      gerada_32.setOperador("Isabela dos Santos Martins Coimbra");
      gerada_33.setOperador("Katiana Moreira Figueredo");
      gerada_34.setOperador("Rodrigo Magalhaes Nunes (vago)");
      gerada_35.setOperador("Gilson da Silva Oliveira");
      gerada_36.setOperador("Wiliam Neves Amorim");
      gerada_37.setOperador("Nayra Macedo Alves (Vago)");
      gerada_38.setOperador("Lucas Henrique Dutra");
      gerada_39.setOperador("José Henrique Pereira Campos");
      gerada_40.setOperador("Levi Borges Nascimento");
      gerada_41.setOperador("Rafael de Souza Pereira");
      gerada_42.setOperador("Fernando Ubirajara Nogueira");
      gerada_43.setOperador("Luan Junior Coutinho");
      gerada_44.setOperador("Jennifer de Souza Maximo");
      gerada_45.setOperador("Daniel da Costa Vilarins (vago)");
      gerada_46.setOperador("Pamella Pires Martins");
      gerada_47.setOperador("Eduardo Henrique de Nazaré Souza");
      gerada_48.setOperador("José Nilton de Souza Cabral");
      gerada_49.setOperador("Leonice Silva Morais");
      gerada_50.setOperador("Valdelucia Maria dos Santos");
      gerada_51.setOperador("Renata Sousa Marques");
      gerada_52.setOperador("Bruno César Tavares Amaral");
      gerada_53.setOperador("Helaine Lino Cabral");
      gerada_54.setOperador("Perceus Hudson Costa e Silva");
      gerada_55.setOperador("Marco José Ramos de Sousa");
      gerada_56.setOperador("Ricardo Teles Ferreira da Silva");
      gerada_57.setOperador("Francisco Ramos Bisneto (vago)");
      gerada_58.setOperador("Leandro Marcos Sousa Rodrigues");
      gerada_59.setOperador("Ayrton Rodrigues Alves");
      gerada_60.setOperador("Crysellen Cardoso da Fonseca");
      gerada_61.setOperador("Caio Cesar Viegas de Almeida");
      gerada_62.setOperador("Erick Alves Depollo");
      gerada_63.setOperador("Janio Tomé Correia Andrade");
      gerada_64.setOperador("Francisca Natália Augusta");
      gerada_65.setOperador("Geovany da Silva Galletti");
      gerada_66.setOperador("Juliana Sales de Sousa");
      gerada_67.setOperador("Gustavo Henrique Xavier Lima");
                 
      
      List <escalaGerada> listaGalera07Hs = new ArrayList<escalaGerada>(); //GRUPO 19
      List <escalaGerada> listaRestante = new ArrayList<escalaGerada>(); //GRUPO 19
      List <escalaGerada> listaSDG = new ArrayList<escalaGerada>();  
      List <escalaGerada> listaGalera22Hs = new ArrayList<escalaGerada>(); //GRUPO 19
     
       
      listaGalera22Hs.add(gerada_01);
      listaGalera22Hs.add(gerada_02);
      listaGalera22Hs.add(gerada_03);
      listaGalera22Hs.add(gerada_04);
      listaGalera22Hs.add(gerada_05);
      listaGalera22Hs.add(gerada_06);
      listaGalera22Hs.add(gerada_07);
      listaGalera22Hs.add(gerada_08);
      listaGalera22Hs.add(gerada_09);
      listaGalera22Hs.add(gerada_10);
      listaGalera22Hs.add(gerada_11);
      listaGalera22Hs.add(gerada_12);
      listaGalera22Hs.add(gerada_13);
      listaGalera22Hs.add(gerada_14);
      listaGalera22Hs.add(gerada_15);
      listaGalera22Hs.add(gerada_16);
      listaGalera22Hs.add(gerada_17);
      listaGalera22Hs.add(gerada_18);
      listaGalera22Hs.add(gerada_19);
      
      
       listaGalera07Hs.add(gerada_30);//1
       listaGalera07Hs.add(gerada_31);// 2
       listaGalera07Hs.add(gerada_32);// 3
       listaGalera07Hs.add(gerada_33);// 4
       listaGalera07Hs.add(gerada_34);//5
       listaGalera07Hs.add(gerada_35);//6
       listaGalera07Hs.add(gerada_36);//7
       listaGalera07Hs.add(gerada_37);//8
       listaGalera07Hs.add(gerada_38);//9
       listaGalera07Hs.add(gerada_39);//10
       listaGalera07Hs.add(gerada_40);//11
       listaGalera07Hs.add(gerada_41);//12
       listaGalera07Hs.add(gerada_42);//13
       listaGalera07Hs.add(gerada_43);//14
       listaGalera07Hs.add(gerada_44);//15
       listaGalera07Hs.add(gerada_45);//16
       listaGalera07Hs.add(gerada_46);//17
       listaGalera07Hs.add(gerada_47);//18
       listaGalera07Hs.add(gerada_48);//19
       
              
       listaRestante.add(gerada_49);// 0
       listaRestante.add(gerada_50);//1
       listaRestante.add(gerada_51);//2
       listaRestante.add(gerada_52);//3
       listaRestante.add(gerada_53);//4
       listaRestante.add(gerada_54);//5
       listaRestante.add(gerada_55);//6
       listaRestante.add(gerada_56);//7
       listaRestante.add(gerada_57);//8
       listaRestante.add(gerada_58);//9
       listaRestante.add(gerada_59);//10
       listaRestante.add(gerada_60);//11
       listaRestante.add(gerada_61);//12
       listaRestante.add(gerada_62);//13
       listaRestante.add(gerada_63);//14
       listaRestante.add(gerada_64);//15
       listaRestante.add(gerada_65);//16
       listaRestante.add(gerada_66);//  17 
       listaRestante.add(gerada_67);//18
       //ESSE COMPLETA A GALERA DAS 22HS
       //listaRestante.add(gerada_67);//45
              
       
       
        //SDG
        listaSDG.add(gerada_20);//1
        listaSDG.add(gerada_21);//2
        listaSDG.add(gerada_22);//3
        listaSDG.add(gerada_23);//4
        listaSDG.add(gerada_24);//5
        //----------------//
        listaSDG.add(gerada_25);//6
        listaSDG.add(gerada_26);//7
        listaSDG.add(gerada_27);//8
        listaSDG.add(gerada_28);//9
        listaSDG.add(gerada_29);//10
        
         
         Collections.shuffle(listaGalera07Hs);
         Collections.shuffle(listaRestante);
         
    
      
     Collections.shuffle(listaGalera22Hs);
     
     Collections.shuffle(listaSDG);
       
           //AQUI VAI SER NOVO SORTEIO SDG DAS 5 PRIMEIRA
        List <escalaGerada> listaSDG2 = new ArrayList<escalaGerada>();
        listaSDG2.add(listaSDG.get(0));//1
        listaSDG2.add(listaSDG.get(1));//2
        listaSDG2.add(listaSDG.get(2));//3
        listaSDG2.add(listaSDG.get(3));//4
        listaSDG2.add(listaSDG.get(4));//5
        Collections.shuffle(listaSDG2);
         
        List <escalaGerada> listaSDG3 = new ArrayList<escalaGerada>();
        listaSDG3.add(listaSDG.get(5));//1
        listaSDG3.add(listaSDG.get(6));//2
        listaSDG3.add(listaSDG.get(7));//3
        listaSDG3.add(listaSDG.get(8));//4
        listaSDG3.add(listaSDG.get(9));//5
      
        Collections.shuffle(listaSDG3);        
       
      
            
            
            //BANCO DO SORTEIO
            //Primeiro Sabado
            List <escalaGerada> listaSabado1 = new ArrayList<>();
            
            //aqui vai os 20 primeiros
            listaSabado1.add(listaRestante.get(0)); // 06 AS 12 SDE
            listaSabado1.add(listaSDG2.get(0)); // 07 as 13 SDG
            listaSabado1.add(listaRestante.get(1)); // 07 as 13 SDE
            listaSabado1.add(listaRestante.get(2));//08 as 14 SDG
            listaSabado1.add(listaGalera07Hs.get(0));//08 as 14 SGE E07hs
            listaSabado1.add(listaRestante.get(3));//08 as 14 - SDE
            listaSabado1.add(listaRestante.get(4));//08 as 14 - SDE
            listaSabado1.add(listaRestante.get(5));//08 as 14 - SDE
            listaSabado1.add(listaRestante.get(6));//08 as 14 - SDE
            listaSabado1.add(listaSDG2.get(1)); //13 as 19 - SDG
            listaSabado1.add(listaRestante.get(7)); //14 as 20 - SDG
            listaSabado1.add(listaGalera22Hs.get(0)); //14 as 20 - SDE E22hs
            listaSabado1.add(listaRestante.get(8)); //14 as 20 - SDE
            listaSabado1.add(listaRestante.get(9)); //14 as 20 - SDE
            listaSabado1.add(listaRestante.get(10)); //14 as 20 - SDE
            listaSabado1.add(listaRestante.get(11)); //06 as 12 SDE
            listaSabado1.add(listaSDG2.get(2)); // 07 as 13 SDG
            listaSabado1.add(listaGalera22Hs.get(1)); // 07 as 13 - SDE E22hs
            listaSabado1.add(listaRestante.get(12)); //08 as 14 - SDG
            listaSabado1.add(listaGalera07Hs.get(1)); // 08 as 14 - SDE E07hs
            listaSabado1.add(listaRestante.get(13)); //08 as 14 - SDE
            listaSabado1.add(listaRestante.get(14));// 13 as 19 - SDG
            listaSabado1.add(listaRestante.get(15));// 14 as 20 FULL
            listaSabado1.add(listaRestante.get(16)); // 14 as 20 - SDE
            listaSabado1.add(listaRestante.get(17)); // 14 as 20 - SDE
            listaSabado1.add(listaRestante.get(18)); // 14 as 20 - SDE
                                            //26 total teleoperador
         
       
            //SEGUNDO SABADO
            List <escalaGerada> listaSabado2 = new ArrayList<>();
            
            listaSabado2.add(listaRestante.get(19)); // 06 AS 12 SDE //0
            listaSabado2.add(listaSDG3.get(0)); // 07 as 13 SDG
            listaSabado2.add(listaRestante.get(20)); // 07 as 13 SDE //2
            listaSabado2.add(listaSDG3.get(1));//08 as 14 SDG
            listaSabado2.add(listaRestante.get(21));//08 as 14 SGE E07hs //4
            listaSabado2.add(listaGalera07Hs.get(2));//08 as 14 - SDE
            listaSabado2.add(listaRestante.get(22));//08 as 14 - SDE //6
            listaSabado2.add(listaRestante.get(23));//08 as 14 - SDE //7
            listaSabado2.add(listaRestante.get(24));//08 as 14 - SDE //8
            listaSabado2.add(listaSDG3.get(2)); //13 as 19 - SDG
            listaSabado2.add(listaSDG3.get(3)); //14 as 20 - SDG
            listaSabado2.add(listaRestante.get(25)); //14 as 20 - SDE  //11
            listaSabado2.add(listaGalera07Hs.get(3)); //14 as 20 - SDE
            listaSabado2.add(listaRestante.get(26)); //14 as 20 - SDE //12
            listaSabado2.add(listaRestante.get(27)); //14 as 20 - SDE //13
            listaSabado2.add(listaRestante.get(28)); //06 as 12 SDE //14
            listaSabado2.add(listaSDG3.get(4)); // 07 as 13 SDG
            listaSabado2.add(listaRestante.get(29)); // 07 as 13 - SDE //16
            listaSabado2.add(listaRestante.get(30)); //08 as 14 - SDG //17
            listaSabado2.add(listaGalera22Hs.get(2)); // 08 as 14 - SDE E07hs
            listaSabado2.add(listaRestante.get(31)); //08 as 14 - SDE //18
            listaSabado2.add(listaRestante.get(32));// 13 as 19 - SDG //19
            listaSabado2.add(listaGalera22Hs.get(3));// 14 as 20 FULL
            listaSabado2.add(listaRestante.get(33)); // 14 as 20 - SDE //20
            listaSabado2.add(listaRestante.get(34)); // 14 as 20 - SDE //21
            listaSabado2.add(listaRestante.get(35)); // 14 as 20 - SDE //22
                                            //26 total teleoperador
        
       List <escalaGerada> listaSDG2_3 = new ArrayList<escalaGerada>();
        listaSDG2_3.add(listaSDG2.get(0));//1
        listaSDG2_3.add(listaSDG2.get(1));//2
        listaSDG2_3.add(listaSDG2.get(2));//3
        listaSDG2_3.add(listaSDG2.get(3));//4
        listaSDG2_3.add(listaSDG2.get(4));//5
        Collections.shuffle(listaSDG2_3);

                                            
                                            
                                            
            List <escalaGerada> listaSabado3 = new ArrayList<>();

            listaSabado3.add(listaRestante.get(36)); // 06 AS 12 SDE
            listaSabado3.add(listaSDG2_3.get(0)); // 07 as 13 SDG
            listaSabado3.add(listaRestante.get(37)); // 07 as 13 SDE
            listaSabado3.add(listaSDG2_3.get(4));//08 as 14 SDG
            listaSabado3.add(listaRestante.get(38));//08 as 14 SGE E07hs
            listaSabado3.add(listaRestante.get(39));//08 as 14 - SDE
            listaSabado3.add(listaRestante.get(40));//08 as 14 - SDE
            listaSabado3.add(listaRestante.get(41));//08 as 14 - SDE
            listaSabado3.add(listaRestante.get(42));//08 as 14 - SDE
            //aqui sorteio1
            
             List <escalaGerada> listaSoteio1 = new ArrayList<>();
            
                listaSoteio1.add(listaSabado1.get(0));//0
                listaSoteio1.add(listaSabado1.get(2));//1
                listaSoteio1.add(listaSabado1.get(3));//2
                listaSoteio1.add(listaSabado1.get(5));//3
                listaSoteio1.add(listaSabado1.get(6));//4
                listaSoteio1.add(listaSabado1.get(7));//5
                listaSoteio1.add(listaSabado1.get(8));//6 
                listaSoteio1.add(listaSabado1.get(10));//7
                listaSoteio1.add(listaSabado1.get(12));//8
                listaSoteio1.add(listaSabado1.get(13));//9
                listaSoteio1.add(listaSabado1.get(14));//10
                listaSoteio1.add(listaSabado1.get(15));//11
                listaSoteio1.add(listaSabado1.get(18));//12
                listaSoteio1.add(listaSabado1.get(20));//13
                listaSoteio1.add(listaSabado1.get(21));//14
                listaSoteio1.add(listaSabado1.get(22));//15
                listaSoteio1.add(listaSabado1.get(23));//16
                listaSoteio1.add(listaSabado1.get(24));//17
                listaSoteio1.add(listaSabado1.get(25));//18
                Collections.shuffle(listaSoteio1);
               
                      
            listaSabado3.add(listaRestante.get(43)); //13 as 19 - SDG
            listaSabado3.add(listaSDG2_3.get(1)); //14 as 20 - SDG
            listaSabado3.add(listaSoteio1.get(0)); //14 as 20 - SDE E22hs
            listaSabado3.add(listaGalera22Hs.get(4)); //14 as 20 - SDE
            listaSabado3.add(listaSoteio1.get(1)); //14 as 20 - SDE
            listaSabado3.add(listaSoteio1.get(2)); //14 as 20 - SDE
            listaSabado3.add(listaSoteio1.get(3)); //06 as 12 SDE
            listaSabado3.add(listaSDG2_3.get(2)); // 07 as 13 SDG
            listaSabado3.add(listaSoteio1.get(4)); // 07 as 13 - SDE
            listaSabado3.add(listaSDG2_3.get(3)); //08 as 14 - SDG
            listaSabado3.add(listaSoteio1.get(5)); // 08 as 14 - SDE 
            listaSabado3.add(listaSoteio1.get(6)); //08 as 14 - SDE
            listaSabado3.add(listaSoteio1.get(7));// 13 as 19 - SDG
            listaSabado3.add(listaSoteio1.get(8));// 14 as 20 FULL
            listaSabado3.add(listaSoteio1.get(9)); // 14 as 20 - SDE
            listaSabado3.add(listaSoteio1.get(10)); // 14 as 20 - SDE
            listaSabado3.add(listaSoteio1.get(11)); // 14 as 20 - SDE
                                           //26
            
              List <escalaGerada> listaSoteio2 = new ArrayList<>();
                listaSoteio2.add(listaSoteio1.get(11));//0
                listaSoteio2.add(listaSoteio1.get(12));//1
                listaSoteio2.add(listaSoteio1.get(13));//2
                listaSoteio2.add(listaSoteio1.get(14));//3
                listaSoteio2.add(listaSoteio1.get(15));//4
                listaSoteio2.add(listaSoteio1.get(16));//5
                listaSoteio2.add(listaSoteio1.get(17));//6
                listaSoteio2.add(listaSoteio1.get(18));//7
                                
                listaSoteio2.add(listaSabado2.get(0));//8
                listaSoteio2.add(listaSabado2.get(2));//9
                listaSoteio2.add(listaSabado2.get(4));//10
                listaSoteio2.add(listaSabado2.get(6));//11
                listaSoteio2.add(listaSabado2.get(7));//12
                listaSoteio2.add(listaSabado2.get(8));//13
                listaSoteio2.add(listaSabado2.get(11));//14
                listaSoteio2.add(listaSabado2.get(12));//15
                listaSoteio2.add(listaSabado2.get(13));//16
                listaSoteio2.add(listaSabado2.get(14));//17
                listaSoteio2.add(listaSabado2.get(16));//18
                listaSoteio2.add(listaSabado2.get(17));//19
                listaSoteio2.add(listaSabado2.get(18));//20
                listaSoteio2.add(listaSabado2.get(19));//21
                listaSoteio2.add(listaSabado2.get(20));//22
                listaSoteio2.add(listaSabado2.get(21));//23
                listaSoteio2.add(listaSabado2.get(22));//24
                Collections.shuffle(listaSoteio2);
                
        
        List <escalaGerada> listaSDG3_2 = new ArrayList<escalaGerada>();
        listaSDG3_2.add(listaSDG3.get(0));//1
        listaSDG3_2.add(listaSDG3.get(1));//2
        listaSDG3_2.add(listaSDG3.get(2));//3
        listaSDG3_2.add(listaSDG3.get(3));//4
        listaSDG3_2.add(listaSDG3.get(4));//5
        Collections.shuffle(listaSDG3_2);
                
                
            

            List <escalaGerada> listaSabado4 = new ArrayList<>();
            
            listaSabado4.add(listaSoteio2.get(0)); // 06 AS 12 SDE
            listaSabado4.add(listaGalera07Hs.get(3)); // 07 as 13 SDG
            listaSabado4.add(listaSoteio2.get(1)); // 07 as 13 SDE
            listaSabado4.add(listaSDG3_2.get(0));//08 as 14 SDG
            listaSabado4.add(listaSoteio2.get(2));//08 as 14 SGE E07hs
            listaSabado4.add(listaSoteio2.get(3));//08 as 14 - SDE
            listaSabado4.add(listaSoteio2.get(4));//08 as 14 - SDE
            listaSabado4.add(listaSoteio2.get(5));//08 as 14 - SDE
            listaSabado4.add(listaSoteio2.get(6));//08 as 14 - SDE
            listaSabado4.add(listaSDG3_2.get(1)); //13 as 19 - SDG
            listaSabado4.add(listaSDG3_2.get(2)); //14 as 20 - SDG
            listaSabado4.add(listaSoteio2.get(7)); //14 as 20 - SDE E22hs
            listaSabado4.add(listaSoteio2.get(8)); //14 as 20 - SDE
            listaSabado4.add(listaSoteio2.get(9)); //14 as 20 - SDE
            listaSabado4.add(listaSoteio2.get(10)); //14 as 20 - SDE
            //SORTEIO 10 DA EQUIPE DO 1 FINAL DE SEMANA
            
            listaSabado4.add(listaSoteio2.get(11)); //06 as 12 SDE
            listaSabado4.add(listaSDG3_2.get(3)); // 07 as 13 SDG
            listaSabado4.add(listaGalera07Hs.get(4)); // 07 as 13 - SDE E22hs
            listaSabado4.add(listaSoteio2.get(12)); //08 as 14 - SDG
            listaSabado4.add(listaSoteio2.get(13)); // 08 as 14 - SDE E07hs
            listaSabado4.add(listaSoteio2.get(14)); //08 as 14 - SDE
            listaSabado4.add(listaSoteio2.get(15));// 13 as 19 - SDG
            listaSabado4.add(listaGalera22Hs.get(3));// 14 as 20 FULL
            listaSabado4.add(listaSoteio2.get(16)); // 14 as 20 - SDE
            listaSabado4.add(listaSoteio2.get(17)); // 14 as 20 - SDE
            listaSabado4.add(listaSoteio2.get(18)); // 14 as 20 - SDE
                                           //26
            //AGORA LOGICA
      
            
            
            
       LocalDate agora = LocalDate.now();
      // LocalDate vem4 = LocalDate.of(agora.getYear(), agora.plusMonths(1).getMonth(),1);
       List <String> listaSab = new ArrayList<String>();
       List <String> listaDomingo = new ArrayList<String>();
        for(int x = 1;x < 30;x++){
        x = 5+x;
         LocalDate vem4 = LocalDate.of(agora.getYear(), agora.plusMonths(1).getMonth(),x);
         listaSab.add("Sabado "+vem4.getDayOfWeek().SATURDAY.adjustInto(vem4));
         listaDomingo.add("Domingo "+vem4.getDayOfWeek().SUNDAY.adjustInto(vem4));
     
       }  
            
       //PRIMEIRO FINAL DE SEMANA D-1
       Document doc = new Document();
       String arquivoPdf = "relatorio.pdf";
        try {
            PdfWriter.getInstance(doc,new FileOutputStream(arquivoPdf));
            doc.open();
            //Image img = Image.getInstance("escala.png");
            //doc.add(new Paragraph("escala.png"));
            //doc.add(img);
            Paragraph p = new Paragraph("Escala Cedente"
                    + "");
            Paragraph pp = new Paragraph();
           p.add(new Paragraph("S", FontFactory.getFont(FontFactory.TIMES,25,Font.ITALIC,BaseColor.WHITE)));
           p.setAlignment(1);
           doc.add(p);
           doc.add(pp);
           p = new Paragraph(""
                    + " ");
            PdfPTable table = new PdfPTable(3);
            
            PdfPCell cell = new PdfPCell(new Paragraph("Dia"));
            PdfPCell cell1 = new PdfPCell(new Paragraph("Ilha/Horario"));
            PdfPCell cell4 = new PdfPCell(new Paragraph("Teleoperador"));
            table.addCell(cell);
            table.addCell(cell1);
            table.addCell(cell4);
            
            //PRIMEIRO SABADO
               PdfPCell pag_1 = new PdfPCell(new Paragraph(""+listaSab.get(0)));
               PdfPCell pag_1_2 = new PdfPCell(new Paragraph(" 06 às 12 – Cedente/IB"));
               PdfPCell pag_1_3 = new PdfPCell(new Paragraph(listaSabado1.get(0).getOperador()));
               
               PdfPCell pag_2 = new PdfPCell(new Paragraph(""+listaSab.get(0)));
               PdfPCell pag_2_2 = new PdfPCell(new Paragraph(" 07 às 13 – SDG"));
               PdfPCell pag_2_3 = new PdfPCell(new Paragraph(listaSabado1.get(1).getOperador()));
                        pag_2_2.setBackgroundColor(BaseColor.YELLOW);
               
               PdfPCell pag_3 = new PdfPCell(new Paragraph(""+listaSab.get(0)));
               PdfPCell pag_3_2 = new PdfPCell(new Paragraph("07 às 13 – Cedente/IB"));
               PdfPCell pag_3_3 = new PdfPCell(new Paragraph(listaSabado1.get(2).getOperador()));
               PdfPCell pag_4 = new PdfPCell(new Paragraph(""+listaSab.get(0)));
               PdfPCell pag_4_2 = new PdfPCell(new Paragraph("08 às 14 – SDG"));
               PdfPCell pag_4_3 = new PdfPCell(new Paragraph(listaSabado1.get(3).getOperador()));
               PdfPCell pag_5 = new PdfPCell(new Paragraph(""+listaSab.get(0)));
               PdfPCell pag_5_2 = new PdfPCell(new Paragraph("08 às 14 – Cedente/IB"));
               PdfPCell pag_5_3 = new PdfPCell(new Paragraph(listaSabado1.get(4).getOperador()));
               
               PdfPCell pag_6 = new PdfPCell(new Paragraph(""+listaSab.get(0)));
               PdfPCell pag_6_2 = new PdfPCell(new Paragraph("08 às 14 – Cedente/IB"));
               PdfPCell pag_6_3 = new PdfPCell(new Paragraph(listaSabado1.get(5).getOperador()));
               PdfPCell pag_7 = new PdfPCell(new Paragraph(""+listaSab.get(0)));
               PdfPCell pag_7_2 = new PdfPCell(new Paragraph("08 às 14 – Cedente/IB"));
               PdfPCell pag_7_3 = new PdfPCell(new Paragraph(listaSabado1.get(6).getOperador()));
               PdfPCell pag_8 = new PdfPCell(new Paragraph(""+listaSab.get(0)));
               PdfPCell pag_8_2 = new PdfPCell(new Paragraph("08 às 14 – Cedente/IB"));
               PdfPCell pag_8_3 = new PdfPCell(new Paragraph(listaSabado1.get(7).getOperador()));
               PdfPCell pag_9 = new PdfPCell(new Paragraph(""+listaSab.get(0)));
               PdfPCell pag_9_2 = new PdfPCell(new Paragraph("08 às 14 – Cedente/IB"));
               PdfPCell pag_9_3 = new PdfPCell(new Paragraph(listaSabado1.get(8).getOperador()));
               
               PdfPCell pag_10 = new PdfPCell(new Paragraph(""+listaSab.get(0)));
               PdfPCell pag_10_2 = new PdfPCell(new Paragraph("13 às 19 – SDG"));
               PdfPCell pag_10_3 = new PdfPCell(new Paragraph(listaSabado1.get(9).getOperador()));
               PdfPCell pag_11 = new PdfPCell(new Paragraph(""+listaSab.get(0)));
               PdfPCell pag_11_2 = new PdfPCell(new Paragraph("14 às 20 – SDG"));               
               PdfPCell pag_11_3 = new PdfPCell(new Paragraph(listaSabado1.get(10).getOperador()));
               
               PdfPCell pag_12 = new PdfPCell(new Paragraph(""+listaSab.get(0)));
               PdfPCell pag_12_2 = new PdfPCell(new Paragraph("14 às 20 – Cedente/IB"));
               PdfPCell pag_12_3 = new PdfPCell(new Paragraph(listaSabado1.get(11).getOperador()));
               PdfPCell pag_13 = new PdfPCell(new Paragraph(""+listaSab.get(0)));
               PdfPCell pag_13_2 = new PdfPCell(new Paragraph("14 às 20 – Cedente/IB"));
               PdfPCell pag_13_3 = new PdfPCell(new Paragraph(listaSabado1.get(12).getOperador()));
               PdfPCell pag_14 = new PdfPCell(new Paragraph(""+listaSab.get(0)));
               PdfPCell pag_14_2 = new PdfPCell(new Paragraph("14 às 20 – Cedente/IB"));
               PdfPCell pag_14_3 = new PdfPCell(new Paragraph(listaSabado1.get(13).getOperador()));
               PdfPCell pag_15 = new PdfPCell(new Paragraph(""+listaSab.get(0)));
               PdfPCell pag_15_2 = new PdfPCell(new Paragraph("14 às 20 – Cedente/IB"));
               PdfPCell pag_15_3 = new PdfPCell(new Paragraph(listaSabado1.get(14).getOperador()));
               
               //PRIMEIRO DOMINGO 
               PdfPCell dom_1 = new PdfPCell(new Paragraph(""+listaDomingo.get(0)));
               PdfPCell dom_1_2 = new PdfPCell(new Paragraph(" 06 às 12 – Cedente/IB"));
               PdfPCell dom_1_3 = new PdfPCell(new Paragraph(listaSabado1.get(15).getOperador()));
               
               PdfPCell dom_2 = new PdfPCell(new Paragraph(""+listaDomingo.get(0)));
               PdfPCell dom_2_2 = new PdfPCell(new Paragraph(" 07 às 13 – SDG"));
               PdfPCell dom_2_3 = new PdfPCell(new Paragraph(listaSabado1.get(16).getOperador()));
               PdfPCell dom_3 = new PdfPCell(new Paragraph(""+listaDomingo.get(0)));
               PdfPCell dom_3_2 = new PdfPCell(new Paragraph("07 às 13 – Cedente/IB"));
               PdfPCell dom_3_3 = new PdfPCell(new Paragraph(listaSabado1.get(17).getOperador()));
               
               PdfPCell dom_4 = new PdfPCell(new Paragraph(""+listaDomingo.get(0)));
               PdfPCell dom_4_2 = new PdfPCell(new Paragraph("08 às 14 – SDG"));
               PdfPCell dom_4_3 = new PdfPCell(new Paragraph(listaSabado1.get(18).getOperador()));
               PdfPCell dom_5 = new PdfPCell(new Paragraph(""+listaDomingo.get(0)));
               PdfPCell dom_5_2 = new PdfPCell(new Paragraph("08 às 14 – Cedente/IB"));
               PdfPCell dom_5_3 = new PdfPCell(new Paragraph(listaSabado1.get(19).getOperador()));
               
               PdfPCell dom_6 = new PdfPCell(new Paragraph(""+listaDomingo.get(0)));
               PdfPCell dom_6_2 = new PdfPCell(new Paragraph("08 às 14 – Cedente/IB"));
               PdfPCell dom_6_3 = new PdfPCell(new Paragraph(listaSabado1.get(20).getOperador()));
               
               PdfPCell dom_7 = new PdfPCell(new Paragraph(""+listaDomingo.get(0)));
               PdfPCell dom_7_2 = new PdfPCell(new Paragraph("13 às 19 – SDG"));
               PdfPCell dom_7_3 = new PdfPCell(new Paragraph(listaSabado1.get(21).getOperador()));
               PdfPCell dom_8 = new PdfPCell(new Paragraph(""+listaDomingo.get(0)));
               PdfPCell dom_8_2 = new PdfPCell(new Paragraph("14 às 20 – Cedente/IB"));               
               PdfPCell dom_8_3 = new PdfPCell(new Paragraph(listaSabado1.get(22).getOperador()));
               
               PdfPCell dom_9 = new PdfPCell(new Paragraph(""+listaDomingo.get(0)));
               PdfPCell dom_9_2 = new PdfPCell(new Paragraph("14 às 20 – Cedente/IB FULL"));
               PdfPCell dom_9_3 = new PdfPCell(new Paragraph(listaSabado1.get(23).getOperador()));
               PdfPCell dom_10 = new PdfPCell(new Paragraph(""+listaDomingo.get(0)));
               PdfPCell dom_10_2 = new PdfPCell(new Paragraph("14 às 20 – Cedente/IB"));
               PdfPCell dom_10_3 = new PdfPCell(new Paragraph(listaSabado1.get(24).getOperador()));
               PdfPCell dom_11 = new PdfPCell(new Paragraph(""+listaDomingo.get(0)));
               PdfPCell dom_11_2 = new PdfPCell(new Paragraph("14 às 20 – Cedente/IB"));
               PdfPCell dom_11_3 = new PdfPCell(new Paragraph(listaSabado1.get(25).getOperador()));
               
               dom_9.setBackgroundColor(BaseColor.PINK);
               dom_9_2.setBackgroundColor(BaseColor.PINK);
               dom_9_3.setBackgroundColor(BaseColor.PINK);
               
               //SEGUNDO SABADO
               PdfPCell sabSeg_1 = new PdfPCell(new Paragraph(""+listaSab.get(1)));
               PdfPCell sabSeg_1_2 = new PdfPCell(new Paragraph(" 06 às 12 – Cedente/IB"));
               PdfPCell sabSeg_1_3 = new PdfPCell(new Paragraph(listaSabado2.get(0).getOperador()));
               
               PdfPCell sabSeg_2 = new PdfPCell(new Paragraph(""+listaSab.get(1)));
               PdfPCell sabSeg_2_2 = new PdfPCell(new Paragraph(" 07 às 13 – SDG"));
               PdfPCell sabSeg_2_3 = new PdfPCell(new Paragraph(listaSabado2.get(1).getOperador()));
               PdfPCell sabSeg_3 = new PdfPCell(new Paragraph(""+listaSab.get(1)));
               PdfPCell sabSeg_3_2 = new PdfPCell(new Paragraph("07 às 13 – Cedente/IB"));
               PdfPCell sabSeg_3_3 = new PdfPCell(new Paragraph(listaSabado2.get(2).getOperador()));
               
               PdfPCell sabSeg_4 = new PdfPCell(new Paragraph(""+listaSab.get(1)));
               PdfPCell sabSeg_4_2 = new PdfPCell(new Paragraph("08 às 14 – SDG"));
               PdfPCell sabSeg_4_3 = new PdfPCell(new Paragraph(listaSabado2.get(3).getOperador()));
               PdfPCell sabSeg_5 = new PdfPCell(new Paragraph(""+listaSab.get(1)));
               PdfPCell sabSeg_5_2 = new PdfPCell(new Paragraph("08 às 14 – Cedente/IB"));
               PdfPCell sabSeg_5_3 = new PdfPCell(new Paragraph(listaSabado2.get(4).getOperador()));
               
               PdfPCell sabSeg_6 = new PdfPCell(new Paragraph(""+listaSab.get(1)));
               PdfPCell sabSeg_6_2 = new PdfPCell(new Paragraph("08 às 14 – Cedente/IB"));
               PdfPCell sabSeg_6_3 = new PdfPCell(new Paragraph(listaSabado2.get(5).getOperador()));
               PdfPCell sabSeg_7 = new PdfPCell(new Paragraph(""+listaSab.get(1)));
               PdfPCell sabSeg_7_2 = new PdfPCell(new Paragraph("08 às 14 – Cedente/IB"));
               PdfPCell sabSeg_7_3 = new PdfPCell(new Paragraph(listaSabado2.get(6).getOperador()));
               PdfPCell sabSeg_8 = new PdfPCell(new Paragraph(""+listaSab.get(1)));
               PdfPCell sabSeg_8_2 = new PdfPCell(new Paragraph("08 às 14 – Cedente/IB"));
               PdfPCell sabSeg_8_3 = new PdfPCell(new Paragraph(listaSabado2.get(7).getOperador()));
               PdfPCell sabSeg_9 = new PdfPCell(new Paragraph(""+listaSab.get(1)));
               PdfPCell sabSeg_9_2 = new PdfPCell(new Paragraph("08 às 14 – Cedente/IB"));
               PdfPCell sabSeg_9_3 = new PdfPCell(new Paragraph(listaSabado2.get(8).getOperador()));
               
               PdfPCell sabSeg_10 = new PdfPCell(new Paragraph(""+listaSab.get(1)));
               PdfPCell sabSeg_10_2 = new PdfPCell(new Paragraph("13 às 19 – SDG"));
               PdfPCell sabSeg_10_3 = new PdfPCell(new Paragraph(listaSabado2.get(9).getOperador()));
               PdfPCell sabSeg_11 = new PdfPCell(new Paragraph(""+listaSab.get(1)));
               PdfPCell sabSeg_11_2 = new PdfPCell(new Paragraph("14 às 20 – SDG"));               
               PdfPCell sabSeg_11_3 = new PdfPCell(new Paragraph(listaSabado2.get(10).getOperador()));
               
               PdfPCell sabSeg_12 = new PdfPCell(new Paragraph(""+listaSab.get(1)));
               PdfPCell sabSeg_12_2 = new PdfPCell(new Paragraph("14 às 20 – Cedente/IB"));
               PdfPCell sabSeg_12_3 = new PdfPCell(new Paragraph(listaSabado2.get(11).getOperador()));
               PdfPCell sabSeg_13 = new PdfPCell(new Paragraph(""+listaSab.get(1)));
               PdfPCell sabSeg_13_2= new PdfPCell(new Paragraph("14 às 20 – Cedente/IB"));
               PdfPCell sabSeg_13_3 = new PdfPCell(new Paragraph(listaSabado2.get(12).getOperador()));
               PdfPCell sabSeg_14 = new PdfPCell(new Paragraph(""+listaSab.get(1)));
               PdfPCell sabSeg_14_2 = new PdfPCell(new Paragraph("14 às 20 – Cedente/IB"));
               PdfPCell sabSeg_14_3 = new PdfPCell(new Paragraph(listaSabado2.get(13).getOperador()));
               PdfPCell sabSeg_15 = new PdfPCell(new Paragraph(""+listaSab.get(1)));
               PdfPCell sabSeg_15_2 = new PdfPCell(new Paragraph("14 às 20 – Cedente/IB"));
               PdfPCell sabSeg_15_3 = new PdfPCell(new Paragraph(listaSabado2.get(14).getOperador()));
               
               //SEGUNDO DOMINGO 
               PdfPCell domSeg_1 = new PdfPCell(new Paragraph(""+listaDomingo.get(1)));
               PdfPCell domSeg_1_2 = new PdfPCell(new Paragraph(" 06 às 12 – Cedente/IB"));
               PdfPCell domSeg_1_3 = new PdfPCell(new Paragraph(listaSabado2.get(15).getOperador()));
               
               PdfPCell domSeg_2 = new PdfPCell(new Paragraph(""+listaDomingo.get(1)));
               PdfPCell domSeg_2_2 = new PdfPCell(new Paragraph(" 07 às 13 – SDG"));
               PdfPCell domSeg_2_3 = new PdfPCell(new Paragraph(listaSabado2.get(16).getOperador()));
               PdfPCell domSeg_3 = new PdfPCell(new Paragraph(""+listaDomingo.get(1)));
               PdfPCell domSeg_3_2 = new PdfPCell(new Paragraph("07 às 13 – Cedente/IB"));
               PdfPCell domSeg_3_3 = new PdfPCell(new Paragraph(listaSabado2.get(17).getOperador()));
               
               PdfPCell domSeg_4 = new PdfPCell(new Paragraph(""+listaDomingo.get(1)));
               PdfPCell domSeg_4_2 = new PdfPCell(new Paragraph("08 às 14 – SDG"));
               PdfPCell domSeg_4_3 = new PdfPCell(new Paragraph(listaSabado2.get(18).getOperador()));
               PdfPCell domSeg_5 = new PdfPCell(new Paragraph(""+listaDomingo.get(1)));
               PdfPCell domSeg_5_2 = new PdfPCell(new Paragraph("08 às 14 – Cedente/IB"));
               PdfPCell domSeg_5_3 = new PdfPCell(new Paragraph(listaSabado2.get(19).getOperador()));
               
               PdfPCell domSeg_6 = new PdfPCell(new Paragraph(""+listaDomingo.get(1)));
               PdfPCell domSeg_6_2 = new PdfPCell(new Paragraph("08 às 14 – Cedente/IB"));
               PdfPCell domSeg_6_3 = new PdfPCell(new Paragraph(listaSabado2.get(20).getOperador()));
               
               PdfPCell domSeg_7 = new PdfPCell(new Paragraph(""+listaDomingo.get(1)));
               PdfPCell domSeg_7_2 = new PdfPCell(new Paragraph("13 às 19 – SDG"));
               PdfPCell domSeg_7_3 = new PdfPCell(new Paragraph(listaSabado2.get(21).getOperador()));
               PdfPCell domSeg_8 = new PdfPCell(new Paragraph(""+listaDomingo.get(1)));
               PdfPCell domSeg_8_2 = new PdfPCell(new Paragraph("14 às 20 – Cedente/IB"));               
               PdfPCell domSeg_8_3 = new PdfPCell(new Paragraph(listaSabado2.get(22).getOperador()));
               
               PdfPCell domSeg_9 = new PdfPCell(new Paragraph(""+listaDomingo.get(1)));
               PdfPCell domSeg_9_2 = new PdfPCell(new Paragraph("14 às 20 – Cedente/IB FULL"));
               PdfPCell domSeg_9_3 = new PdfPCell(new Paragraph(listaSabado2.get(23).getOperador()));
               PdfPCell domSeg_10 = new PdfPCell(new Paragraph(""+listaDomingo.get(1)));
               PdfPCell domSeg_10_2 = new PdfPCell(new Paragraph("14 às 20 – Cedente/IB"));
               PdfPCell domSeg_10_3 = new PdfPCell(new Paragraph(listaSabado2.get(24).getOperador()));
               PdfPCell domSeg_11 = new PdfPCell(new Paragraph(""+listaDomingo.get(1)));
               PdfPCell domSeg_11_2 = new PdfPCell(new Paragraph("14 às 20 – Cedente/IB"));
               PdfPCell domSeg_11_3 = new PdfPCell(new Paragraph(listaSabado2.get(25).getOperador()));
               
               domSeg_9.setBackgroundColor(BaseColor.PINK);
               domSeg_9_2.setBackgroundColor(BaseColor.PINK);
               domSeg_9_3.setBackgroundColor(BaseColor.PINK);
               
               
               
               
       
        //TERCEIRO FINAL DE SEMANA
               PdfPCell sabTer_1 = new PdfPCell(new Paragraph(""+listaSab.get(2)));
               PdfPCell sabTer_1_2 = new PdfPCell(new Paragraph(" 06 às 12 – Cedente/IB"));
               PdfPCell sabTer_1_3 = new PdfPCell(new Paragraph(listaSabado3.get(0).getOperador()));
               
               PdfPCell sabTer_2 = new PdfPCell(new Paragraph(""+listaSab.get(2)));
               PdfPCell sabTer_2_2 = new PdfPCell(new Paragraph(" 07 às 13 – SDG"));
               PdfPCell sabTer_2_3 = new PdfPCell(new Paragraph(listaSabado3.get(1).getOperador()));
               PdfPCell sabTer_3 = new PdfPCell(new Paragraph(""+listaSab.get(2)));
               PdfPCell sabTer_3_2 = new PdfPCell(new Paragraph("07 às 13 – Cedente/IB"));
               PdfPCell sabTer_3_3 = new PdfPCell(new Paragraph(listaSabado3.get(2).getOperador()));
               
               PdfPCell sabTer_4 = new PdfPCell(new Paragraph(""+listaSab.get(2)));
               PdfPCell sabTer_4_2 = new PdfPCell(new Paragraph("08 às 14 – SDG"));
               PdfPCell sabTer_4_3 = new PdfPCell(new Paragraph(listaSabado3.get(3).getOperador()));
               PdfPCell sabTer_5 = new PdfPCell(new Paragraph(""+listaSab.get(2)));
               PdfPCell sabTer_5_2 = new PdfPCell(new Paragraph("08 às 14 – Cedente/IB"));
               PdfPCell sabTer_5_3 = new PdfPCell(new Paragraph(listaSabado3.get(4).getOperador()));
               
               PdfPCell sabTer_6 = new PdfPCell(new Paragraph(""+listaSab.get(2)));
               PdfPCell sabTer_6_2 = new PdfPCell(new Paragraph("08 às 14 – Cedente/IB"));
               PdfPCell sabTer_6_3 = new PdfPCell(new Paragraph(listaSabado3.get(5).getOperador()));
               PdfPCell sabTer_7 = new PdfPCell(new Paragraph(""+listaSab.get(2)));
               PdfPCell sabTer_7_2 = new PdfPCell(new Paragraph("08 às 14 – Cedente/IB"));
               PdfPCell sabTer_7_3 = new PdfPCell(new Paragraph(listaSabado3.get(6).getOperador()));
               PdfPCell sabTer_8 = new PdfPCell(new Paragraph(""+listaSab.get(2)));
               PdfPCell sabTer_8_2 = new PdfPCell(new Paragraph("08 às 14 – Cedente/IB"));
               PdfPCell sabTer_8_3 = new PdfPCell(new Paragraph(listaSabado3.get(7).getOperador()));
               PdfPCell sabTer_9 = new PdfPCell(new Paragraph(""+listaSab.get(2)));
               PdfPCell sabTer_9_2 = new PdfPCell(new Paragraph("08 às 14 – Cedente/IB"));
               PdfPCell sabTer_9_3 = new PdfPCell(new Paragraph(listaSabado3.get(8).getOperador()));
               
               PdfPCell sabTer_10 = new PdfPCell(new Paragraph(""+listaSab.get(2)));
               PdfPCell sabTer_10_2 = new PdfPCell(new Paragraph("13 às 19 – SDG"));
               PdfPCell sabTer_10_3 = new PdfPCell(new Paragraph(listaSabado3.get(9).getOperador()));
               PdfPCell sabTer_11 = new PdfPCell(new Paragraph(""+listaSab.get(2)));
               PdfPCell sabTer_11_2 = new PdfPCell(new Paragraph("14 às 20 – SDG"));               
               PdfPCell sabTer_11_3 = new PdfPCell(new Paragraph(listaSabado3.get(10).getOperador()));
               
               PdfPCell sabTer_12 = new PdfPCell(new Paragraph(""+listaSab.get(2)));
               PdfPCell sabTer_12_2 = new PdfPCell(new Paragraph("14 às 20 – Cedente/IB"));
               PdfPCell sabTer_12_3 = new PdfPCell(new Paragraph(listaSabado3.get(11).getOperador()));
               PdfPCell sabTer_13 = new PdfPCell(new Paragraph(""+listaSab.get(2)));
               PdfPCell sabTer_13_2= new PdfPCell(new Paragraph("14 às 20 – Cedente/IB"));
               PdfPCell sabTer_13_3 = new PdfPCell(new Paragraph(listaSabado3.get(12).getOperador()));
               PdfPCell sabTer_14 = new PdfPCell(new Paragraph(""+listaSab.get(2)));
               PdfPCell sabTer_14_2 = new PdfPCell(new Paragraph("14 às 20 – Cedente/IB"));
               PdfPCell sabTer_14_3 = new PdfPCell(new Paragraph(listaSabado3.get(13).getOperador()));
               PdfPCell sabTer_15 = new PdfPCell(new Paragraph(""+listaSab.get(2)));
               PdfPCell sabTer_15_2 = new PdfPCell(new Paragraph("14 às 20 – Cedente/IB"));
               PdfPCell sabTer_15_3 = new PdfPCell(new Paragraph(listaSabado3.get(14).getOperador()));
               
               //TERCEIRO DOMINGO 
               PdfPCell domTer_1 = new PdfPCell(new Paragraph(""+listaDomingo.get(2)));
               PdfPCell domTer_1_2 = new PdfPCell(new Paragraph(" 06 às 12 – Cedente/IB"));
               PdfPCell domTer_1_3 = new PdfPCell(new Paragraph(listaSabado3.get(15).getOperador()));
               
               PdfPCell domTer_2 = new PdfPCell(new Paragraph(""+listaDomingo.get(2)));
               PdfPCell domTer_2_2 = new PdfPCell(new Paragraph(" 07 às 13 – SDG"));
               PdfPCell domTer_2_3 = new PdfPCell(new Paragraph(listaSabado3.get(16).getOperador()));
               PdfPCell domTer_3 = new PdfPCell(new Paragraph(""+listaDomingo.get(2)));
               PdfPCell domTer_3_2 = new PdfPCell(new Paragraph("07 às 13 – Cedente/IB"));
               PdfPCell domTer_3_3 = new PdfPCell(new Paragraph(listaSabado3.get(17).getOperador()));
               
               PdfPCell domTer_4 = new PdfPCell(new Paragraph(""+listaDomingo.get(2)));
               PdfPCell domTer_4_2 = new PdfPCell(new Paragraph("08 às 14 – SDG"));
               PdfPCell domTer_4_3 = new PdfPCell(new Paragraph(listaSabado3.get(18).getOperador()));
               PdfPCell domTer_5 = new PdfPCell(new Paragraph(""+listaDomingo.get(2)));
               PdfPCell domTer_5_2 = new PdfPCell(new Paragraph("08 às 14 – Cedente/IB"));
               PdfPCell domTer_5_3 = new PdfPCell(new Paragraph(listaSabado3.get(19).getOperador()));
               
               PdfPCell domTer_6 = new PdfPCell(new Paragraph(""+listaDomingo.get(2)));
               PdfPCell domTer_6_2 = new PdfPCell(new Paragraph("08 às 14 – Cedente/IB"));
               PdfPCell domTer_6_3 = new PdfPCell(new Paragraph(listaSabado3.get(20).getOperador()));
               
               PdfPCell domTer_7 = new PdfPCell(new Paragraph(""+listaDomingo.get(2)));
               PdfPCell domTer_7_2 = new PdfPCell(new Paragraph("13 às 19 – SDG"));
               PdfPCell domTer_7_3 = new PdfPCell(new Paragraph(listaSabado3.get(21).getOperador()));
               PdfPCell domTer_8 = new PdfPCell(new Paragraph(""+listaDomingo.get(2)));
               PdfPCell domTer_8_2 = new PdfPCell(new Paragraph("14 às 20 – Cedente/IB"));               
               PdfPCell domTer_8_3 = new PdfPCell(new Paragraph(listaSabado3.get(22).getOperador()));
               
               PdfPCell domTer_9 = new PdfPCell(new Paragraph(""+listaDomingo.get(2)));
               PdfPCell domTer_9_2 = new PdfPCell(new Paragraph("14 às 20 – Cedente/IB FULL"));
               PdfPCell domTer_9_3 = new PdfPCell(new Paragraph(listaSabado3.get(23).getOperador()));
               PdfPCell domTer_10 = new PdfPCell(new Paragraph(""+listaDomingo.get(2)));
               PdfPCell domTer_10_2 = new PdfPCell(new Paragraph("14 às 20 – Cedente/IB"));
               PdfPCell domTer_10_3 = new PdfPCell(new Paragraph(listaSabado3.get(24).getOperador()));
               PdfPCell domTer_11 = new PdfPCell(new Paragraph(""+listaDomingo.get(2)));
               PdfPCell domTer_11_2 = new PdfPCell(new Paragraph("14 às 20 – Cedente/IB"));
               PdfPCell domTer_11_3 = new PdfPCell(new Paragraph(listaSabado3.get(25).getOperador()));
               
               domTer_9.setBackgroundColor(BaseColor.PINK);
               domTer_9_2.setBackgroundColor(BaseColor.PINK);
               domTer_9_3.setBackgroundColor(BaseColor.PINK);
               
               
               //QUARTO FINAL DE SEMANA
               PdfPCell sabQua_1 = new PdfPCell(new Paragraph(""+listaSab.get(3)));
               PdfPCell sabQua_1_2 = new PdfPCell(new Paragraph(" 06 às 12 – Cedente/IB"));
               PdfPCell sabQua_1_3 = new PdfPCell(new Paragraph(listaSabado4.get(0).getOperador()));
               
               PdfPCell sabQua_2 = new PdfPCell(new Paragraph(""+listaSab.get(3)));
               PdfPCell sabQua_2_2 = new PdfPCell(new Paragraph(" 07 às 13 – SDG"));
               PdfPCell sabQua_2_3 = new PdfPCell(new Paragraph(listaSabado4.get(1).getOperador()));
               PdfPCell sabQua_3 = new PdfPCell(new Paragraph(""+listaSab.get(3)));
               PdfPCell sabQua_3_2 = new PdfPCell(new Paragraph("07 às 13 – Cedente/IB"));
               PdfPCell sabQua_3_3 = new PdfPCell(new Paragraph(listaSabado4.get(2).getOperador()));
               
               PdfPCell sabQua_4 = new PdfPCell(new Paragraph(""+listaSab.get(3)));
               PdfPCell sabQua_4_2 = new PdfPCell(new Paragraph("08 às 14 – SDG"));
               PdfPCell sabQua_4_3 = new PdfPCell(new Paragraph(listaSabado4.get(3).getOperador()));
               PdfPCell sabQua_5 = new PdfPCell(new Paragraph(""+listaSab.get(3)));
               PdfPCell sabQua_5_2 = new PdfPCell(new Paragraph("08 às 14 – Cedente/IB"));
               PdfPCell sabQua_5_3 = new PdfPCell(new Paragraph(listaSabado4.get(4).getOperador()));
               
               PdfPCell sabQua_6 = new PdfPCell(new Paragraph(""+listaSab.get(3)));
               PdfPCell sabQua_6_2 = new PdfPCell(new Paragraph("08 às 14 – Cedente/IB"));
               PdfPCell sabQua_6_3 = new PdfPCell(new Paragraph(listaSabado4.get(5).getOperador()));
               PdfPCell sabQua_7 = new PdfPCell(new Paragraph(""+listaSab.get(3)));
               PdfPCell sabQua_7_2 = new PdfPCell(new Paragraph("08 às 14 – Cedente/IB"));
               PdfPCell sabQua_7_3 = new PdfPCell(new Paragraph(listaSabado4.get(6).getOperador()));
               PdfPCell sabQua_8 = new PdfPCell(new Paragraph(""+listaSab.get(3)));
               PdfPCell sabQua_8_2 = new PdfPCell(new Paragraph("08 às 14 – Cedente/IB"));
               PdfPCell sabQua_8_3 = new PdfPCell(new Paragraph(listaSabado4.get(7).getOperador()));
               PdfPCell sabQua_9 = new PdfPCell(new Paragraph(""+listaSab.get(3)));
               PdfPCell sabQua_9_2 = new PdfPCell(new Paragraph("08 às 14 – Cedente/IB"));
               PdfPCell sabQua_9_3 = new PdfPCell(new Paragraph(listaSabado4.get(8).getOperador()));
               
               PdfPCell sabQua_10 = new PdfPCell(new Paragraph(""+listaSab.get(3)));
               PdfPCell sabQua_10_2 = new PdfPCell(new Paragraph("13 às 19 – SDG"));
               PdfPCell sabQua_10_3 = new PdfPCell(new Paragraph(listaSabado4.get(9).getOperador()));
               PdfPCell sabQua_11 = new PdfPCell(new Paragraph(""+listaSab.get(3)));
               PdfPCell sabQua_11_2 = new PdfPCell(new Paragraph("14 às 20 – SDG"));               
               PdfPCell sabQua_11_3 = new PdfPCell(new Paragraph(listaSabado4.get(10).getOperador()));
               
               PdfPCell sabQua_12 = new PdfPCell(new Paragraph(""+listaSab.get(3)));
               PdfPCell sabQua_12_2 = new PdfPCell(new Paragraph("14 às 20 – Cedente/IB"));
               PdfPCell sabQua_12_3 = new PdfPCell(new Paragraph(listaSabado4.get(11).getOperador()));
               PdfPCell sabQua_13 = new PdfPCell(new Paragraph(""+listaSab.get(3)));
               PdfPCell sabQua_13_2= new PdfPCell(new Paragraph("14 às 20 – Cedente/IB"));
               PdfPCell sabQua_13_3 = new PdfPCell(new Paragraph(listaSabado4.get(12).getOperador()));
               PdfPCell sabQua_14 = new PdfPCell(new Paragraph(""+listaSab.get(3)));
               PdfPCell sabQua_14_2 = new PdfPCell(new Paragraph("14 às 20 – Cedente/IB"));
               PdfPCell sabQua_14_3 = new PdfPCell(new Paragraph(listaSabado4.get(13).getOperador()));
               PdfPCell sabQua_15 = new PdfPCell(new Paragraph(""+listaSab.get(3)));
               PdfPCell sabQua_15_2 = new PdfPCell(new Paragraph("14 às 20 – Cedente/IB"));
               PdfPCell sabQua_15_3 = new PdfPCell(new Paragraph(listaSabado4.get(14).getOperador()));
               
                //DOMINGO QUARTO

                PdfPCell domQua_1 = new PdfPCell(new Paragraph(""+listaDomingo.get(3)));
               PdfPCell domQua_1_2 = new PdfPCell(new Paragraph(" 06 às 12 – Cedente/IB"));
               PdfPCell domQua_1_3 = new PdfPCell(new Paragraph(listaSabado4.get(15).getOperador()));
               
               PdfPCell domQua_2 = new PdfPCell(new Paragraph(""+listaDomingo.get(3)));
               PdfPCell domQua_2_2 = new PdfPCell(new Paragraph(" 07 às 13 – SDG"));
               PdfPCell domQua_2_3 = new PdfPCell(new Paragraph(listaSabado4.get(16).getOperador()));
               PdfPCell domQua_3 = new PdfPCell(new Paragraph(""+listaDomingo.get(3)));
               PdfPCell domQua_3_2 = new PdfPCell(new Paragraph("07 às 13 – Cedente/IB"));
               PdfPCell domQua_3_3 = new PdfPCell(new Paragraph(listaSabado4.get(17).getOperador()));
               
               PdfPCell domQua_4 = new PdfPCell(new Paragraph(""+listaDomingo.get(3)));
               PdfPCell domQua_4_2 = new PdfPCell(new Paragraph("08 às 14 – SDG"));
               PdfPCell domQua_4_3 = new PdfPCell(new Paragraph(listaSabado4.get(18).getOperador()));
               PdfPCell domQua_5 = new PdfPCell(new Paragraph(""+listaDomingo.get(3)));
               PdfPCell domQua_5_2 = new PdfPCell(new Paragraph("08 às 14 – Cedente/IB"));
               PdfPCell domQua_5_3 = new PdfPCell(new Paragraph(listaSabado4.get(19).getOperador()));
               
               PdfPCell domQua_6 = new PdfPCell(new Paragraph(""+listaDomingo.get(3)));
               PdfPCell domQua_6_2 = new PdfPCell(new Paragraph("08 às 14 – Cedente/IB"));
               PdfPCell domQua_6_3 = new PdfPCell(new Paragraph(listaSabado4.get(20).getOperador()));
               
               PdfPCell domQua_7 = new PdfPCell(new Paragraph(""+listaDomingo.get(3)));
               PdfPCell domQua_7_2 = new PdfPCell(new Paragraph("13 às 19 – SDG"));
               PdfPCell domQua_7_3 = new PdfPCell(new Paragraph(listaSabado4.get(21).getOperador()));
               
        
               PdfPCell domQua_8 = new PdfPCell(new Paragraph(""+listaDomingo.get(3)));
               PdfPCell domQua_8_2 = new PdfPCell(new Paragraph("14 às 20 – Cedente/IB"));               
               PdfPCell domQua_8_3 = new PdfPCell(new Paragraph(listaSabado4.get(22).getOperador()));
               
               PdfPCell domQua_9 = new PdfPCell(new Paragraph(""+listaDomingo.get(3)));
               PdfPCell domQua_9_2 = new PdfPCell(new Paragraph("14 às 20 – Cedente/IB FULL"));
               PdfPCell domQua_9_3 = new PdfPCell(new Paragraph(listaSabado4.get(23).getOperador()));
               PdfPCell domQua_10 = new PdfPCell(new Paragraph(""+listaDomingo.get(3)));
               PdfPCell domQua_10_2 = new PdfPCell(new Paragraph("14 às 20 – Cedente/IB"));
               PdfPCell domQua_10_3 = new PdfPCell(new Paragraph(listaSabado4.get(24).getOperador()));
               PdfPCell domQua_11 = new PdfPCell(new Paragraph(""+listaDomingo.get(3)));
               PdfPCell domQua_11_2 = new PdfPCell(new Paragraph("14 às 20 – Cedente/IB"));
               PdfPCell domQua_11_3 = new PdfPCell(new Paragraph(listaSabado4.get(25).getOperador()));
               
               domQua_9.setBackgroundColor(BaseColor.PINK);
               domQua_9_2.setBackgroundColor(BaseColor.PINK);
               domQua_9_3.setBackgroundColor(BaseColor.PINK);
               
               
               
               
               
               table.addCell(pag_1);
               table.addCell(pag_1_2);
               table.addCell(pag_1_3);
               table.addCell(pag_2);
               table.addCell(pag_2_2);
               table.addCell(pag_2_3);
               table.addCell(pag_3);
               table.addCell(pag_3_2);
               table.addCell(pag_3_3);
               table.addCell(pag_4);
               table.addCell(pag_4_2);
               table.addCell(pag_4_3);
               table.addCell(pag_5);
               table.addCell(pag_5_2);
               table.addCell(pag_5_3);
               table.addCell(pag_6);
               table.addCell(pag_6_2);
               table.addCell(pag_6_3);
               table.addCell(pag_7);
               table.addCell(pag_7_2);
               table.addCell(pag_7_3);
               table.addCell(pag_8);
               table.addCell(pag_8_2);
               table.addCell(pag_8_3);
               table.addCell(pag_9);
               table.addCell(pag_9_2);
               table.addCell(pag_9_3);
               table.addCell(pag_10);
               table.addCell(pag_10_2);
               table.addCell(pag_10_3);
               table.addCell(pag_11);
               table.addCell(pag_11_2);
               table.addCell(pag_11_3);
               table.addCell(pag_12);
               table.addCell(pag_12_2);
               table.addCell(pag_12_3);
               table.addCell(pag_13);
               table.addCell(pag_13_2);
               table.addCell(pag_13_3);
               table.addCell(pag_14);
               table.addCell(pag_14_2);
               table.addCell(pag_14_3);
               table.addCell(pag_15);
               table.addCell(pag_15_2);
               table.addCell(pag_15_3);                  
                table.addCell(dom_1);
                 table.addCell( dom_1_2);
                  table.addCell(dom_1_3);
                   table.addCell(dom_2);
                    table.addCell( dom_2_2);
                     table.addCell(dom_2_3);
                      table.addCell(dom_3);
                       table.addCell(dom_3_2);
                        table.addCell(dom_3_3);
                         table.addCell(dom_4);
                          table.addCell(dom_4_2);
                           table.addCell(dom_4_3);
                            table.addCell(dom_5);
                             table.addCell(dom_5_2);
                              table.addCell(dom_5_3);
                              table.addCell(dom_6);
                              table.addCell(dom_6_2);
                              table.addCell(dom_6_3);
                             table.addCell(dom_7);
                            table.addCell(dom_7_2);
                          table.addCell(dom_7_3);
                         table.addCell(dom_8);
                        table.addCell(dom_8_2);
                       table.addCell(dom_8_3);
                      table.addCell(dom_9);
                     table.addCell(dom_9_2);
                    table.addCell(dom_9_3);
                   table.addCell(dom_10);
                  table.addCell(dom_10_2);
                 table.addCell(dom_10_3);
                table.addCell(dom_11);
               table.addCell(dom_11_2);
             table.addCell(dom_11_3);
             
               PdfPCell separador = new PdfPCell(new Paragraph(""));
               PdfPCell separador_2 = new PdfPCell(new Paragraph("SEGUNDO FINAL DE SEMANA"));
               PdfPCell separado_3 = new PdfPCell(new Paragraph());
              
               separador.setBackgroundColor(BaseColor.BLACK);
               separador_2.setBackgroundColor(BaseColor.RED);
               separado_3.setBackgroundColor(BaseColor.BLACK);
               
             table.addCell(separador);
             table.addCell(separador_2);
             table.addCell(separado_3);
             //SEPARA O FINAL DE SEMANA
             table.addCell(sabSeg_1);
             table.addCell(sabSeg_1_2);
             table.addCell(sabSeg_1_3);
              table.addCell(sabSeg_2);
               table.addCell(sabSeg_2_2);
                table.addCell(sabSeg_2_3);
                 table.addCell(sabSeg_3);
                  table.addCell(sabSeg_3_2);
                   table.addCell(sabSeg_3_3);
                    table.addCell(sabSeg_4);
                     table.addCell(sabSeg_4_2);
                      table.addCell(sabSeg_4_3);
                       table.addCell(sabSeg_5);
                        table.addCell(sabSeg_5_2);
                         table.addCell(sabSeg_5_3);
                          table.addCell(sabSeg_6);
                           table.addCell(sabSeg_6_2);
                            table.addCell(sabSeg_6_3);
                             table.addCell(sabSeg_7);
                              table.addCell(sabSeg_7_2);
                               table.addCell(sabSeg_7_3);
                                table.addCell(sabSeg_8);
                                 table.addCell(sabSeg_8_2);
                                  table.addCell(sabSeg_8_3);
                                   table.addCell(sabSeg_9);
                                    table.addCell(sabSeg_9_2);
                                     table.addCell(sabSeg_9_3);
                                      table.addCell(sabSeg_10);
                                       table.addCell(sabSeg_10_2);
                                        table.addCell(sabSeg_10_3);
                                         table.addCell(sabSeg_11);
                                          table.addCell(sabSeg_11_2);
                                           table.addCell(sabSeg_11_3);
                                            table.addCell(sabSeg_12);
                                             table.addCell(sabSeg_12_2);
                                             table.addCell(sabSeg_12_3);
                                              table.addCell(sabSeg_13);
                                               table.addCell(sabSeg_13_2);
                                                table.addCell(sabSeg_13_3);
                                                 table.addCell(sabSeg_14);
                                                  table.addCell(sabSeg_14_2);
                                                   table.addCell(sabSeg_14_3);
                                                    table.addCell(sabSeg_15);
                                                     table.addCell(sabSeg_15_2);
                                                      table.addCell(sabSeg_15_3);
                                                     //DOMINGO
                                                      table.addCell(domSeg_1);
                                                         table.addCell(domSeg_1_2);
                                                              table.addCell(domSeg_1_3);
                                                             table.addCell(domSeg_2);
                                                          table.addCell(domSeg_2_2);
                                                      table.addCell(domSeg_2_3);
                                             table.addCell(domSeg_3);
                                           table.addCell(domSeg_3_2);
                                        table.addCell(domSeg_3_3);
                                     table.addCell(domSeg_4);
                                    table.addCell(domSeg_4_2);
                                table.addCell(domSeg_4_3);
                            table.addCell(domSeg_5);
                         table.addCell(domSeg_5_2);
                         table.addCell(domSeg_5_3);
                    table.addCell(domSeg_6);
                 table.addCell(domSeg_6_2);
                table.addCell(domSeg_6_3);
                table.addCell(domSeg_7);
                    table.addCell(domSeg_7_2);
                     table.addCell(domSeg_7_3);
                        table.addCell(domSeg_8);
                            table.addCell(domSeg_8_2);
                                table.addCell(domSeg_8_3);
                                    table.addCell(domSeg_9);
                                         table.addCell(domSeg_9_2);
                                             table.addCell(domSeg_9_3);
                                                  table.addCell(domSeg_10);
                                                     table.addCell(domSeg_10_2);
                                                    table.addCell(domSeg_10_3);
                                                table.addCell(domSeg_11);
                                             table.addCell(domSeg_11_2);
                                         table.addCell(domSeg_11_3);
                                         
                                         
               PdfPCell separador3 = new PdfPCell(new Paragraph(""));
               PdfPCell separador3_11_2 = new PdfPCell(new Paragraph("TERCEIRO FINAL DE SEMANA"));
               PdfPCell separado3_11_3 = new PdfPCell(new Paragraph());
              
               separador.setBackgroundColor(BaseColor.BLACK);
               separador3_11_2.setBackgroundColor(BaseColor.RED);
               separado3_11_3.setBackgroundColor(BaseColor.BLACK);                    
             
               table.addCell(separador3);
             table.addCell(separador3_11_2);
             table.addCell(separado3_11_3);
                                         
                                         
                                 table.addCell(sabTer_1);
                                         table.addCell(sabTer_1_2);
                                         table.addCell(sabTer_1_3);
                                         table.addCell(sabTer_2);
                                     table.addCell(sabTer_2_2);
                                    table.addCell(sabTer_2_3);
                                  table.addCell(sabTer_3);
                                table.addCell(sabTer_3_2);
                                table.addCell(sabTer_3_3);
                               table.addCell(sabTer_4);
                              table.addCell(sabTer_4_2);
                             table.addCell(sabTer_4_3);
                            table.addCell(sabTer_5);
                           table.addCell(sabTer_5_2);
                          table.addCell(sabTer_5_3);
                         table.addCell(sabTer_6);
                        table.addCell(sabTer_6_2);
                       table.addCell(sabTer_6_3);
                      table.addCell(sabTer_7);
                     table.addCell(sabTer_7_2);
                    table.addCell(sabTer_7_3);
                   table.addCell(sabTer_8);
                  table.addCell(sabTer_8_2);
                 table.addCell(sabTer_8_3);
                table.addCell(sabTer_9);
               table.addCell(sabTer_9_2);
              table.addCell(sabTer_9_3);
             table.addCell(sabTer_10);
            table.addCell(sabTer_10_2);
           table.addCell(sabTer_10_3);
           table.addCell(sabTer_11);
          table.addCell(sabTer_11_2);
         table.addCell(sabTer_11_3);
        table.addCell(sabTer_12);
       table.addCell(sabTer_12_2);
      table.addCell(sabTer_12_3);
     table.addCell(sabTer_13);
    table.addCell(sabTer_13_2);
   table.addCell(sabTer_13_3);
  table.addCell(sabTer_14);
 table.addCell(sabTer_14_2);
table.addCell(sabTer_14_3);
table.addCell(sabTer_15);
table.addCell(sabTer_15_2);
table.addCell(sabTer_15_3);
    table.addCell(domTer_1);
        table.addCell(domTer_1_2);
            table.addCell(domTer_1_3);
                table.addCell(domTer_2);
                    table.addCell(domTer_2_2);
                        table.addCell(domTer_2_3);
                            table.addCell(domTer_3);
                                table.addCell(domTer_3_2);
                                    table.addCell(domTer_3_3);
                                        table.addCell(domTer_4);
                                            table.addCell(domTer_4_2);
                                                table.addCell(domTer_4_3);
                                                    table.addCell(domTer_5);
                                                        table.addCell(domTer_5_2);
                                                            table.addCell(domTer_5_3);
                                                                table.addCell(domTer_6);
                                                                    table.addCell(domTer_6_2);
                                                                        table.addCell(domTer_6_3);
                                                                            table.addCell(domTer_7);
                                                                              table.addCell(domTer_7_2);
                                                                               table.addCell(domTer_7_3);
                                                                                 table.addCell(domTer_8);
                                                                                   table.addCell(domTer_8_2);
                                                                                  table.addCell(domTer_8_3);
                                                                                 table.addCell(domTer_9);
                                                                                table.addCell(domTer_9_2);
                                                                                table.addCell(domTer_9_3);
                                                                               table.addCell(domTer_10);
                                                                              table.addCell(domTer_10_2);
                                                                             table.addCell(domTer_10_3);
                                                                            table.addCell(domTer_11);
                                                                           table.addCell(domTer_11_2);
                                                                        table.addCell(domTer_11_3);          
                                         
                                         
                                         
               PdfPCell separador4 = new PdfPCell(new Paragraph(""));
               PdfPCell separador_4_1 = new PdfPCell(new Paragraph("QUARTO FINAL DE SEMANA"));
               PdfPCell separado_4_2 = new PdfPCell(new Paragraph());
              
               separador4.setBackgroundColor(BaseColor.BLACK);
               separador_4_1.setBackgroundColor(BaseColor.RED);
               separado_4_2.setBackgroundColor(BaseColor.BLACK);
               
             table.addCell(separador);
             table.addCell(separador_4_1);
             table.addCell(separado_4_2);
                                         table.addCell(sabQua_1);
                                         table.addCell(sabQua_1_2);
                                         table.addCell(sabQua_1_3);
                                         table.addCell(sabQua_2);
                                     table.addCell(sabQua_2_2);
                                    table.addCell(sabQua_2_3);
                                  table.addCell(sabQua_3);
                                table.addCell(sabQua_3_2);
                                table.addCell(sabQua_3_3);
                               table.addCell(sabQua_4);
                              table.addCell(sabQua_4_2);
                             table.addCell(sabQua_4_3);
                            table.addCell(sabQua_5);
                           table.addCell(sabQua_5_2);
                          table.addCell(sabQua_5_3);
                         table.addCell(sabQua_6);
                        table.addCell(sabQua_6_2);
                       table.addCell(sabQua_6_3);
                      table.addCell(sabQua_7);
                     table.addCell(sabQua_7_2);
                    table.addCell(sabQua_7_3);
                   table.addCell(sabQua_8);
                  table.addCell(sabQua_8_2);
                 table.addCell(sabQua_8_3);
                table.addCell(sabQua_9);
               table.addCell(sabQua_9_2);
              table.addCell(sabQua_9_3);
             table.addCell(sabQua_10);
            table.addCell(sabQua_10_2);
           table.addCell(sabQua_10_3);
           table.addCell(sabQua_11);
          table.addCell(sabQua_11_2);
         table.addCell(sabQua_11_3);
        table.addCell(sabQua_12);
       table.addCell(sabQua_12_2);
      table.addCell(sabQua_12_3);
     table.addCell(sabQua_13);
    table.addCell(sabQua_13_2);
   table.addCell(sabQua_13_3);
  table.addCell(sabQua_14);
 table.addCell(sabQua_14_2);
table.addCell(sabQua_14_3);
table.addCell(sabQua_15);
table.addCell(sabQua_15_2);
table.addCell(sabQua_15_3);
    table.addCell(domQua_1);
        table.addCell(domQua_1_2);
            table.addCell(domQua_1_3);
                table.addCell(domQua_2);
                    table.addCell(domQua_2_2);
                        table.addCell(domQua_2_3);
                            table.addCell(domQua_3);
                                table.addCell(domQua_3_2);
                                    table.addCell(domQua_3_3);
                                        table.addCell(domQua_4);
                                            table.addCell(domQua_4_2);
                                                table.addCell(domQua_4_3);
                                                    table.addCell(domQua_5);
                                                        table.addCell(domQua_5_2);
                                                            table.addCell(domQua_5_3);
                                                                table.addCell(domQua_6);
                                                                    table.addCell(domQua_6_2);
                                                                        table.addCell(domQua_6_3);
                                                                            table.addCell(domQua_7);
                                                                                table.addCell(domQua_7_2);
                                                                                    table.addCell(domQua_7_3);
                                                                                    table.addCell(domQua_8);
                                                                                   table.addCell(domQua_8_2);
                                                                                  table.addCell(domQua_8_3);
                                                                                 table.addCell(domQua_9);
                                                                                table.addCell(domQua_9_2);
                                                                                table.addCell(domQua_9_3);
                                                                               table.addCell(domQua_10);
                                                                              table.addCell(domQua_10_2);
                                                                             table.addCell(domQua_10_3);
                                                                            table.addCell(domQua_11);
                                                                           table.addCell(domQua_11_2);
                                                                        table.addCell(domQua_11_3);
                                                                     
            doc.add(table);
            doc.close();
            Desktop.getDesktop().open(new File(arquivoPdf));
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro Interno Motivo: "+e.getMessage());
        } 
     }
        
    }

