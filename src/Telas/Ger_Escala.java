/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Telas;

import Teste.escalaGerada;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author manoel.barros
 */
public class Ger_Escala extends javax.swing.JPanel {

    /**
     * Creates new form Ger_Escala
     */
    public Ger_Escala() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        rSButtonMetro1 = new rsbuttom.RSButtonMetro();
        rSButtonMetro2 = new rsbuttom.RSButtonMetro();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        jArea = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(36, 47, 65));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gerenciar Escala");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Horario/Ilha", "Data", "Operador"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 300, 240));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Gerar Escala Mensal");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(97, 212, 195));
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione o Mês","Janeiro", "Fevereiro", "Março", "Abril", "Maio",
            "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"}));
jComboBox1.setBorder(null);
add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 170, 30));

rSButtonMetro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/32x32/icons8_Calendar_24px.png"))); // NOI18N
rSButtonMetro1.setText("Gerar Escala");
rSButtonMetro1.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        rSButtonMetro1ActionPerformed(evt);
    }
    });
    add(rSButtonMetro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, -1, -1));

    rSButtonMetro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/32x32/icons8_Ok_32px_1.png"))); // NOI18N
    rSButtonMetro2.setText("Alterar");
    add(rSButtonMetro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, -1));

    jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
    jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
    add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 10, -1, 440));

    jArea.setColumns(20);
    jArea.setRows(5);
    jScrollPane3.setViewportView(jArea);

    add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 380, 160));
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonMetro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro1ActionPerformed
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
        
         
           LocalDate agora = LocalDate.now();
           
      gerada_01.setOperador("Daniel Ferreira de Jesus ");
      gerada_02.setOperador("Carlos Henrique Sousa e Silva");
      gerada_03.setOperador("Lidiane Lima Dias dos Santos");
      gerada_04.setOperador("Vitoria Regia Morais Bezerra");
      gerada_05.setOperador("Ana Amélia da Conceição");
      gerada_06.setOperador("Ana Paula Ferreira de Araujo");
      gerada_07.setOperador("Letícia de Araújo Carvalho");
      gerada_08.setOperador("Aline Helen da Silva Rocha");
      gerada_09.setOperador("Aline Helen da Silva Rocha");
      gerada_10.setOperador("Herivan de Sá Mendes");
      gerada_11.setOperador("Michel Fonseca da Silva");
      gerada_12.setOperador("Gilson Vieira Alves");
      gerada_13.setOperador("Marcelo Pires Campos");
      gerada_14.setOperador("Tatiane Nunes Machado");
      gerada_15.setOperador("Paulo Henrique Cunha Santos");
      gerada_16.setOperador("Yuri Alec da Silva Chagas");
      gerada_17.setOperador("Isabela dos Santos Martins Coimbra");
      gerada_18.setOperador("Katiana Moreira Figueredo");
      gerada_19.setOperador("Gustavo Henrique Xavier Lima");
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
      
      gerada_30.setOperador("Rodrigo Magalhaes Nunes");
      gerada_31.setOperador("Gilson da Silva Oliveira");
      gerada_32.setOperador("Wiliam Neves Amorim");
      gerada_33.setOperador("Nayra Macedo Alves");
      gerada_34.setOperador("Paulo Henrique Pereira Silva");
      gerada_35.setOperador("Celso Francisco da Silva Filho");
      gerada_36.setOperador("Lucas Henrique Dutra");
      gerada_37.setOperador("Wallan Daniel Duarte Santana");
      gerada_38.setOperador("Fábio Guida de Miranda");
      gerada_39.setOperador("Rafael de Souza Pereira");
      gerada_40.setOperador("Fernando Ubirajara Nogueira");
      gerada_41.setOperador("Luan Junior Coutinho");
      gerada_42.setOperador("Paulo Henrique Pereira Silva");
      gerada_43.setOperador("Daniel da Costa Vilarins");
      gerada_44.setOperador("Pamella Pires Martins");
      gerada_45.setOperador("Lyane Silveira Santos");
      gerada_46.setOperador("José Nilton de Souza Cabral");
      gerada_47.setOperador("Leonice Silva Morais");
      gerada_48.setOperador("Felipe Alves Cardozo");
      gerada_49.setOperador("Valdelucia Maria dos Santos");
      gerada_50.setOperador("Renata Sousa Marques");
      gerada_51.setOperador("Bruno César Tavares Amaral");
      gerada_52.setOperador("Helaine Lino Cabral");
      gerada_53.setOperador("Perceus Hudson Costa e Silva");
      gerada_54.setOperador("Marco José Ramos de Sousa");
      gerada_55.setOperador("Ricardo Teles Ferreira da Silva");
      gerada_56.setOperador("Francisco Ramos Bisneto");
      gerada_57.setOperador("Leandro Marcos Sousa Rodrigues");
      gerada_58.setOperador("Ayrton Rodrigues Alves");
      gerada_59.setOperador("Crysellen Cardoso da Fonseca");
      gerada_60.setOperador("Caio Cesar Viegas de Almeida");
      gerada_61.setOperador("Erick Alves Depollo");
      gerada_62.setOperador("Janio Tomé Correia Andrade");
      gerada_63.setOperador("Francisca Natália Augusta");
      gerada_64.setOperador("Geovany da Silva Galletti");
      gerada_65.setOperador("Manoel Victor da Costa");
      gerada_66.setOperador("Juliana Sales de Sousa");
      gerada_67.setOperador("Cynthia Lino Cabral");
                 
      List <escalaGerada> lista = new ArrayList<escalaGerada>();
      List <escalaGerada> listaSDG = new ArrayList<escalaGerada>(); 
            
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
        lista.add(gerada_11);
        lista.add(gerada_12);
        lista.add(gerada_13);
        lista.add(gerada_14);
        lista.add(gerada_15);
        lista.add(gerada_16);
        lista.add(gerada_17);
        lista.add(gerada_18);
        lista.add(gerada_19);
       
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
        
        //SDE
         lista.add(gerada_30);
         lista.add(gerada_31);
         lista.add(gerada_32);
         lista.add(gerada_33);
         lista.add(gerada_34);
         lista.add(gerada_35);
         lista.add(gerada_36);
         lista.add(gerada_37);
         lista.add(gerada_38);
         lista.add(gerada_39);
         lista.add(gerada_40);
         lista.add(gerada_41);
         lista.add(gerada_42);
         lista.add(gerada_43);
         lista.add(gerada_44);
         lista.add(gerada_45);
         lista.add(gerada_46);
         lista.add(gerada_47);
         lista.add(gerada_48);
         lista.add(gerada_49);
         lista.add(gerada_50);
         lista.add(gerada_51);
         lista.add(gerada_52);
         lista.add(gerada_53);
         lista.add(gerada_54);
         lista.add(gerada_55);
         lista.add(gerada_56);
         lista.add(gerada_57);
         lista.add(gerada_58);
         lista.add(gerada_59);
         lista.add(gerada_60);
         lista.add(gerada_61);
         lista.add(gerada_62);
         lista.add(gerada_63);
         lista.add(gerada_64);
         lista.add(gerada_65);
         lista.add(gerada_66);
         lista.add(gerada_67);
                    
            Collections.shuffle(lista); // aqui sao todos
            Collections.shuffle(listaSDG);
      
            //PRIMEIRO FINAL DE SEMANA D-1
      jArea.setText("\nPRIMEIRA FINAL DE SEMANA\n");
      jArea.setText("Dia "+agora.plusDays(5)+" 06 às 12 – Cedente/IB -- "+lista.get(0).getOperador());
      jArea.setText("Sabado");
      jArea.setText("Dia "+agora.plusDays(5)+" 06 às 12 – Cedente/IB -- "+lista.get(0).getOperador());
      jArea.setText("Dia "+agora.plusDays(5)+" 07 às 13 – SDG  -- "+lista.get(1).getOperador());
      jArea.setText("Dia "+agora.plusDays(5)+" 07 às 13 – Cedente/IB --  "+lista.get(2).getOperador());
      jArea.setText("Dia "+agora.plusDays(5)+" 08 às 14 – SDG --  "+listaSDG.get(0).getOperador());//SDG
      jArea.setText("Dia "+agora.plusDays(5)+" 08 às 14 – Cedente/IB -- "+lista.get(3).getOperador());
      jArea.setText("Dia "+agora.plusDays(5)+" 08 às 14 – Cedente/IB -- "+lista.get(4).getOperador());
      jArea.setText("Dia "+agora.plusDays(5)+" 08 às 14 – Cedente/IB -- "+lista.get(5).getOperador());
      jArea.setText("Dia "+agora.plusDays(5)+" 08 às 14 – Cedente/IB -- "+lista.get(6).getOperador());
      jArea.setText("Dia "+agora.plusDays(5)+" 08 às 14 – Cedente/IB -- "+lista.get(7).getOperador());
      jArea.setText("Dia "+agora.plusDays(5)+" 13 às 19 – SDG -- "+listaSDG.get(1).getOperador());//SDG
      jArea.setText("Dia "+agora.plusDays(5)+" 14 às 20 – SDG -- "+listaSDG.get(2).getOperador());//SDG
      jArea.setText("Dia "+agora.plusDays(5)+" 14 às 20 – Cedente/IB -- "+lista.get(8).getOperador());
      jArea.setText("Dia "+agora.plusDays(5)+" 14 às 20 – Cedente/IB -- "+lista.get(9).getOperador());
      jArea.setText("Dia "+agora.plusDays(5)+" 14 às 20 – Cedente/IB -- "+lista.get(10).getOperador());
      jArea.setText("Dia "+agora.plusDays(5)+" 14 às 20 – Cedente/IB -- "+lista.get(11).getOperador());
      jArea.setText("\n\n");    
      jArea.setText("\nD O M I N G O\n");
      jArea.setText("Dia "+agora.plusDays(5)+" 06 às 12 – Cedente/IB -- "+lista.get(12).getOperador());
      jArea.setText("Dia "+agora.plusDays(5)+" 07 às 13 – SDG  -- "+lista.get(13).getOperador());
      jArea.setText("Dia "+agora.plusDays(5)+" 07 às 13 – Cedente/IB --  "+lista.get(14).getOperador());
      jArea.setText("Dia "+agora.plusDays(5)+" 08 às 14 – SDG --  "+listaSDG.get(3).getOperador());
      jArea.setText("Dia "+agora.plusDays(5)+" 08 às 14 – Cedente/IB -- "+lista.get(15).getOperador());
      jArea.setText("Dia "+agora.plusDays(5)+" 08 às 14 – Cedente/IB -- "+lista.get(16).getOperador());
      jArea.setText("Dia "+agora.plusDays(5)+" 13 às 19 – SDG -- "+listaSDG.get(4).getOperador());//SDG
      jArea.setText("Dia "+agora.plusDays(5)+" 14 às 20 – Cedente/IB FULL -- "+lista.get(17).getOperador());
      jArea.setText("Dia "+agora.plusDays(5)+" 14 às 20 – Cedente/IB -- "+lista.get(18).getOperador());
      jArea.setText("Dia "+agora.plusDays(5)+" 14 às 20 – Cedente/IB -- "+lista.get(19).getOperador());
      jArea.setText("Dia "+agora.plusDays(5)+" 14 às 20 – Cedente/IB -- "+lista.get(20).getOperador());
      
      jArea.setText("\nSEGUNDO FINAL DE SEMANA\n");
      jArea.setText("Dia "+agora.plusDays(5)+" 06 às 12 – Cedente/IB -- "+lista.get(21).getOperador());
      jArea.setText("Dia "+agora.plusDays(5)+" 07 às 13 – SDG  -- "+listaSDG.get(5).getOperador());
      jArea.setText("Dia "+agora.plusDays(5)+" 07 às 13 – Cedente/IB --  "+lista.get(22).getOperador());
      jArea.setText("Dia "+agora.plusDays(5)+" 08 às 14 – SDG --  "+listaSDG.get(6).getOperador());//SDG
      jArea.setText("Dia "+agora.plusDays(5)+" 08 às 14 – Cedente/IB -- "+lista.get(23).getOperador());
      jArea.setText("Dia "+agora.plusDays(5)+" 08 às 14 – Cedente/IB -- "+lista.get(24).getOperador());
      jArea.setText("Dia "+agora.plusDays(5)+" 08 às 14 – Cedente/IB -- "+lista.get(25).getOperador());
      jArea.setText("Dia "+agora.plusDays(5)+" 08 às 14 – Cedente/IB -- "+lista.get(26).getOperador());
      jArea.setText("Dia "+agora.plusDays(5)+" 08 às 14 – Cedente/IB -- "+lista.get(27).getOperador());
      jArea.setText("Dia "+agora.plusDays(5)+" 13 às 19 – SDG -- "+lista.get(28).getOperador());//SDG
      jArea.setText("Dia "+agora.plusDays(5)+" 14 às 20 – SDG -- "+listaSDG.get(7).getOperador());//SDG
      jArea.setText("Dia "+agora.plusDays(5)+" 14 às 20 – Cedente/IB -- "+lista.get(29).getOperador());
      jArea.setText("Dia "+agora.plusDays(5)+" 14 às 20 – Cedente/IB -- "+lista.get(30).getOperador());
      jArea.setText("Dia "+agora.plusDays(5)+" 14 às 20 – Cedente/IB -- "+lista.get(31).getOperador());
      jArea.setText("Dia "+agora.plusDays(5)+" 14 às 20 – Cedente/IB -- "+lista.get(32).getOperador());
      jArea.setText("\n\n");    
      jArea.setText("\nD O M I N G O\n");
      jArea.setText("Dia "+agora.plusDays(5)+" 06 às 12 – Cedente/IB -- "+lista.get(33).getOperador());
      jArea.setText("Dia "+agora.plusDays(5)+" 07 às 13 – SDG  -- "+lista.get(34).getOperador());
      jArea.setText("Dia "+agora.plusDays(5)+" 07 às 13 – Cedente/IB --  "+lista.get(35).getOperador());
      jArea.setText("Dia "+agora.plusDays(5)+" 08 às 14 – SDG --  "+listaSDG.get(8).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 08 às 14 – Cedente/IB -- "+lista.get(36).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 08 às 14 – Cedente/IB -- "+lista.get(37).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 13 às 19 – SDG -- "+listaSDG.get(9).getOperador());//SDG
      System.out.println("Dia "+agora.plusDays(5)+" 14 às 20 – Cedente/IB FULL -- "+lista.get(38).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 14 às 20 – Cedente/IB -- "+lista.get(39).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 14 às 20 – Cedente/IB -- "+lista.get(40).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 14 às 20 – Cedente/IB -- "+lista.get(41).getOperador());
      
      
      //AQUI VAI SER NOVO SORTEIO SDG DAS 5 PRIMEIRA
         List <escalaGerada> listaSDG2 = new ArrayList<escalaGerada>();
        listaSDG2.add(gerada_20);//1
        listaSDG2.add(gerada_21);//2
        listaSDG2.add(gerada_22);//3
        listaSDG2.add(gerada_23);//4
        listaSDG2.add(gerada_24);//5
      Collections.shuffle(listaSDG2);
      
      
      System.out.print("\nTERCEIRO FINAL DE SEMANA\n");
      System.out.println("Dia "+agora.plusDays(5)+" 06 às 12 – Cedente/IB -- "+lista.get(42).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 07 às 13 – SDG  -- "+lista.get(43).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 07 às 13 – Cedente/IB --  "+lista.get(44).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 08 às 14 – SDG --  "+listaSDG2.get(0).getOperador());//SDG
      System.out.println("Dia "+agora.plusDays(5)+" 08 às 14 – Cedente/IB -- "+lista.get(45).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 08 às 14 – Cedente/IB -- "+lista.get(46).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 08 às 14 – Cedente/IB -- "+lista.get(47).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 08 às 14 – Cedente/IB -- "+lista.get(48).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 08 às 14 – Cedente/IB -- "+lista.get(49).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 13 às 19 – SDG -- "+lista.get(50).getOperador());//SDG
      System.out.println("Dia "+agora.plusDays(5)+" 14 às 20 – SDG -- "+listaSDG2.get(1).getOperador());//SDG
      System.out.println("Dia "+agora.plusDays(5)+" 14 às 20 – Cedente/IB -- "+lista.get(51).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 14 às 20 – Cedente/IB -- "+lista.get(52).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 14 às 20 – Cedente/IB -- "+lista.get(53).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 14 às 20 – Cedente/IB -- "+lista.get(54).getOperador());
      System.out.println("\n\n");    
      System.out.println("\nD O M I N G O\n");
      System.out.println("Dia "+agora.plusDays(5)+" 06 às 12 – Cedente/IB -- "+lista.get(55).getOperador());
     //LIMITE DA LISTA
       List <escalaGerada> lista2 = new ArrayList<escalaGerada>();
        lista2.add(lista.get(0));
        lista2.add(lista.get(1));
        lista2.add(lista.get(2));
        lista2.add(lista.get(3));
        lista2.add(lista.get(4));
        lista2.add(lista.get(5));
        lista2.add(lista.get(6));
        lista2.add(lista.get(7));
        lista2.add(lista.get(8));
        lista2.add(lista.get(9));
        lista2.add(lista.get(10));
        lista2.add(lista.get(11));
        lista2.add(lista.get(12));
        lista2.add(lista.get(13));
        lista2.add(lista.get(14));
        lista2.add(lista.get(15));
        lista2.add(lista.get(16));
        lista2.add(lista.get(17));
        lista2.add(lista.get(18));
        lista2.add(lista.get(19));
        lista2.add(lista.get(20));
        //lista2.add(lista.get(21));
        //lista2.add(lista.get(22));
        //lista2.add(lista.get(23));
        //lista2.add(lista.get(24));
        //lista2.add(lista.get(25));
        
        
        Collections.shuffle(lista2);
         System.out.println("AQUI COMEÇA NOVO SORTEIO D1");
      System.out.println("Dia "+agora.plusDays(5)+" 07 às 13 – SDG  -- "+lista2.get(7).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 07 às 13 – Cedente/IB --  "+lista2.get(0).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 08 às 14 – SDG --  "+listaSDG2.get(2).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 08 às 14 – Cedente/IB -- "+lista2.get(1).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 08 às 14 – Cedente/IB -- "+lista2.get(2).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 13 às 19 – SDG -- "+listaSDG2.get(3).getOperador());//SDG
      System.out.println("Dia "+agora.plusDays(5)+" 14 às 20 – Cedente/IB FULL -- "+lista2.get(3).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 14 às 20 – Cedente/IB -- "+lista2.get(4).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 14 às 20 – Cedente/IB -- "+lista2.get(5).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 14 às 20 – Cedente/IB -- "+lista2.get(6).getOperador());
      
      
      
       List <escalaGerada> lista3 = new ArrayList<escalaGerada>();
        lista3.add(lista.get(21));
        lista3.add(lista.get(22));
        lista3.add(lista.get(23));
        lista3.add(lista.get(24));
        lista3.add(lista.get(25));
        lista3.add(lista.get(26));
        lista3.add(lista.get(27));
        lista3.add(lista.get(28));
        lista3.add(lista.get(29));
        lista3.add(lista.get(30));
        lista3.add(lista.get(31));
        lista3.add(lista.get(32));
        lista3.add(lista.get(33));
        lista3.add(lista.get(34));
        lista3.add(lista.get(35));
        lista3.add(lista.get(36));
        lista3.add(lista.get(37));
        lista3.add(lista.get(38));
        lista3.add(lista.get(39));
        lista3.add(lista.get(40));
        lista3.add(lista.get(41));
        
          List <escalaGerada> listaSDG3 = new ArrayList<escalaGerada>();
        listaSDG3.add(listaSDG.get(5));//1
        listaSDG3.add(listaSDG.get(6));//2
        listaSDG3.add(listaSDG.get(7));//3
        listaSDG3.add(listaSDG.get(8));//4
        listaSDG3.add(listaSDG.get(9));//5
      Collections.shuffle(listaSDG3);
        
        
      Collections.shuffle(lista3);
      
      
      System.out.print("\nQUARTA FINAL DE SEMANA\n");
      System.out.println("Dia "+agora.plusDays(5)+" 06 às 12 – Cedente/IB -- "+lista3.get(0).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 07 às 13 – SDG  -- "+listaSDG3.get(0).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 07 às 13 – Cedente/IB --  "+lista3.get(1).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 08 às 14 – SDG --  "+listaSDG3.get(1).getOperador());//SDG
      System.out.println("Dia "+agora.plusDays(5)+" 08 às 14 – Cedente/IB -- "+lista3.get(2).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 08 às 14 – Cedente/IB -- "+lista3.get(3).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 08 às 14 – Cedente/IB -- "+lista3.get(4).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 08 às 14 – Cedente/IB -- "+lista3.get(5).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 08 às 14 – Cedente/IB -- "+lista3.get(6).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 13 às 19 – SDG -- "+lista3.get(7).getOperador());//SDG
      System.out.println("Dia "+agora.plusDays(5)+" 14 às 20 – SDG -- "+listaSDG3.get(2).getOperador());//SDG
      System.out.println("Dia "+agora.plusDays(5)+" 14 às 20 – Cedente/IB -- "+lista3.get(8).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 14 às 20 – Cedente/IB -- "+lista3.get(9).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 14 às 20 – Cedente/IB -- "+lista3.get(10).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 14 às 20 – Cedente/IB -- "+lista3.get(11).getOperador());
      System.out.println("\n\n");    
      System.out.println("\nD O M I N G O\n");
      System.out.println("Dia "+agora.plusDays(5)+" 06 às 12 – Cedente/IB -- "+lista3.get(12).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 07 às 13 – SDG  -- "+lista3.get(13).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 07 às 13 – Cedente/IB --  "+lista3.get(14).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 08 às 14 – SDG --  "+listaSDG3.get(3).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 08 às 14 – Cedente/IB -- "+lista3.get(15).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 08 às 14 – Cedente/IB -- "+lista3.get(16).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 13 às 19 – SDG -- "+listaSDG3.get(4).getOperador());//SDG
      System.out.println("Dia "+agora.plusDays(5)+" 14 às 20 – Cedente/IB FULL -- "+lista3.get(17).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 14 às 20 – Cedente/IB -- "+lista3.get(18).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 14 às 20 – Cedente/IB -- "+lista3.get(19).getOperador());
      System.out.println("Dia "+agora.plusDays(5)+" 14 às 20 – Cedente/IB -- "+lista3.get(20).getOperador());
    }//GEN-LAST:event_rSButtonMetro1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea jArea;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private rsbuttom.RSButtonMetro rSButtonMetro1;
    private rsbuttom.RSButtonMetro rSButtonMetro2;
    // End of variables declaration//GEN-END:variables
}
