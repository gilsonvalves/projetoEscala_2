/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Telas;

/**
 *
 * @author manoel.barros
 */
public class Troca extends javax.swing.JPanel {

    /**
     * Creates new form Troca
     */
    public Troca() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        box5 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        box6 = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        rSButtonMetro1 = new rsbuttom.RSButtonMetro();
        rSButtonMetro2 = new rsbuttom.RSButtonMetro();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(36, 47, 65));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Solicitante:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Horario:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jComboBox3.setBackground(new java.awt.Color(36, 47, 65));
        jComboBox3.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Manoel Victor da Costa Barros", "Gilson Vieira Alves", "Alexandre Henrique Fonseca", "Celso Francisco da Silva Filho",
            "Paulo Henrique Cunha Santos","Márcio Messias da Silva Pereira"}));
add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 170, -1));

box5.setBackground(new java.awt.Color(36, 47, 65));
box5.setForeground(new java.awt.Color(255, 255, 255));
box5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "","06:00 as 12:00", "07:00 as 13:00", "08:00 as 14:00", "09:00 as 15:00", "10:00 as 16:00",
    "13:00 as 19:00", "14:00 as 20:00", "15:00 as 21:00", "16:00 as 22:00" }));
    add(box5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 170, -1));

    jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(255, 255, 255));
    jLabel5.setText("Data Ecalado:");
    add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

    jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(255, 255, 255));
    jLabel3.setText("Cedente:");
    add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

    jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(255, 255, 255));
    jLabel6.setText("Horario:");
    add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));

    jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel7.setForeground(new java.awt.Color(255, 255, 255));
    jLabel7.setText("Data Ecalado:");
    add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, -1));

    jComboBox4.setBackground(new java.awt.Color(36, 47, 65));
    jComboBox4.setForeground(new java.awt.Color(255, 255, 255));
    jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Manoel Victor da Costa Barros", "Gilson Vieira Alves", "Alexandre Henrique Fonseca", "Celso Francisco da Silva Filho",
        "Paulo Henrique Cunha Santos","Márcio Messias da Silva Pereira"}));
add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 170, -1));

box6.setBackground(new java.awt.Color(36, 47, 65));
box6.setForeground(new java.awt.Color(255, 255, 255));
box6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "","06:00 as 12:00", "07:00 as 13:00", "08:00 as 14:00", "09:00 as 15:00", "10:00 as 16:00",
"13:00 as 19:00", "14:00 as 20:00", "15:00 as 21:00", "16:00 as 22:00" }));
add(box6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 170, -1));

jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 10, 350));

rSButtonMetro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/32x32/icons8_Cancel_32px_1.png"))); // NOI18N
rSButtonMetro1.setText("Cancelar");
rSButtonMetro1.setColorHover(new java.awt.Color(255, 0, 51));
add(rSButtonMetro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, -1, -1));

rSButtonMetro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/32x32/icons8_Ok_32px_1.png"))); // NOI18N
rSButtonMetro2.setText("Confirmar");
rSButtonMetro2.setColorHover(new java.awt.Color(0, 204, 0));
rSButtonMetro2.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        rSButtonMetro2ActionPerformed(evt);
    }
    });
    add(rSButtonMetro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 255, 255));
    jLabel1.setText("Solicitar Trocar");
    add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonMetro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonMetro2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox box5;
    private javax.swing.JComboBox box6;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private rsbuttom.RSButtonMetro rSButtonMetro1;
    private rsbuttom.RSButtonMetro rSButtonMetro2;
    // End of variables declaration//GEN-END:variables
}
