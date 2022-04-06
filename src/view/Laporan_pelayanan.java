/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import config.koneksiDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author WINDOWS 10
 */
public class Laporan_pelayanan extends javax.swing.JFrame {

    /**
     * Creates new form Laporan_pelayanan
     */
    public Laporan_pelayanan() {
        initComponents();
        tampiluser();
    }
    Statement st;
    Connection con = koneksiDB.getConnection();
    ResultSet rs;
    PreparedStatement pst;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        awal = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        akhir = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        cbuser = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbpoli = new javax.swing.JComboBox<>();
        cbkriteria = new javax.swing.JComboBox<>();
        btncetakkunjungan = new javax.swing.JButton();
        btncetakpoli = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btncetakkunjungan1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        tpasien = new javax.swing.JTextField();
        btncetakkunjungan2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btncetakpoli1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Form Laporan Register");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(352, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(331, 331, 331))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 80));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Dari tanggal :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 127, 32));

        awal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(awal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 182, 31));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sampai tanggal :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 127, 32));

        akhir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(akhir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 182, 31));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("User             :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 127, 32));

        cbuser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbuser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "user" }));
        jPanel2.add(cbuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 182, 32));

        jPanel3.setBackground(new java.awt.Color(51, 255, 204));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Rawat Jalan");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Berdasarkan     :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Obat");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Poli");

        cbpoli.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbpoli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Poli Umum", "Poli Gigi", "Poli BP", "Poli KIA", "Poli Fisioterapi" }));
        cbpoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbpoliActionPerformed(evt);
            }
        });

        cbkriteria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbkriteria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anak", "Dewasa", "KB", "ANC", "Gigi", "Fisioterapi" }));
        cbkriteria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbkriteriaActionPerformed(evt);
            }
        });

        btncetakkunjungan.setBackground(new java.awt.Color(51, 153, 255));
        btncetakkunjungan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btncetakkunjungan.setText("Cetak");
        btncetakkunjungan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncetakkunjunganActionPerformed(evt);
            }
        });

        btncetakpoli.setBackground(new java.awt.Color(51, 153, 255));
        btncetakpoli.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btncetakpoli.setText("Cetak");
        btncetakpoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncetakpoliActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Krit. Kunjungan");

        btncetakkunjungan1.setBackground(new java.awt.Color(51, 153, 255));
        btncetakkunjungan1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btncetakkunjungan1.setText("Cetak");
        btncetakkunjungan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncetakkunjungan1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Per Pasien");

        tpasien.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        btncetakkunjungan2.setBackground(new java.awt.Color(51, 153, 255));
        btncetakkunjungan2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btncetakkunjungan2.setText("Cetak");
        btncetakkunjungan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncetakkunjungan2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbkriteria, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btncetakkunjungan, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btncetakkunjungan2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(cbpoli, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(tpasien)))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btncetakpoli, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btncetakkunjungan1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncetakkunjungan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(cbkriteria)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btncetakkunjungan1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbpoli, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btncetakpoli, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tpasien, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncetakkunjungan2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 470, 290));

        jPanel4.setBackground(new java.awt.Color(0, 204, 102));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Rawat Inap");

        btncetakpoli1.setBackground(new java.awt.Color(51, 153, 255));
        btncetakpoli1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btncetakpoli1.setText("Cetak");
        btncetakpoli1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncetakpoli1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cetak Laporan Rawat Inap");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(btncetakpoli1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncetakpoli1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(161, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 420, 290));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 969, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbkriteriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbkriteriaActionPerformed

    }//GEN-LAST:event_cbkriteriaActionPerformed

    private void btncetakkunjunganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncetakkunjunganActionPerformed
        try {
            cetakberdasarobat();
        } catch (Exception ex) {
            Logger.getLogger(Laporan_pelayanan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btncetakkunjunganActionPerformed

    private void btncetakpoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncetakpoliActionPerformed
        try {
            cetakpoli();
        } catch (JRException ex) {
            Logger.getLogger(Laporan_pelayanan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btncetakpoliActionPerformed

    private void btncetakpoli1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncetakpoli1ActionPerformed
        try {
            cetakrawatinap();
        } catch (JRException ex) {
            Logger.getLogger(Laporan_pelayanan.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btncetakpoli1ActionPerformed

    private void cbpoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbpoliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbpoliActionPerformed

    private void btncetakkunjungan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncetakkunjungan1ActionPerformed
        try {
            cetakkriteriakunjungan();
        } catch (Exception ex) {
            Logger.getLogger(Laporan_pelayanan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btncetakkunjungan1ActionPerformed

    private void btncetakkunjungan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncetakkunjungan2ActionPerformed
        try {
            cetakperpasien();
        } catch (JRException ex) {
            Logger.getLogger(Laporan_pelayanan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btncetakkunjungan2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Laporan_pelayanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Laporan_pelayanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Laporan_pelayanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Laporan_pelayanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Laporan_pelayanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser akhir;
    private com.toedter.calendar.JDateChooser awal;
    private javax.swing.JButton btncetakkunjungan;
    private javax.swing.JButton btncetakkunjungan1;
    private javax.swing.JButton btncetakkunjungan2;
    private javax.swing.JButton btncetakpoli;
    private javax.swing.JButton btncetakpoli1;
    private javax.swing.JComboBox<String> cbkriteria;
    private javax.swing.JComboBox<String> cbpoli;
    private javax.swing.JComboBox<String> cbuser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField tpasien;
    // End of variables declaration//GEN-END:variables
public void tampiluser() {
        String sql = "SELECT * FROM tbl_user ";

        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                cbuser.addItem(rs.getString("nama_user"));

            }
        } catch (Exception e) {
        }
    }

    public void cetakkriteriakunjungan() throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dateawal = df.format(awal.getDate());
        String dateakhir = df.format(akhir.getDate());
        String user = cbuser.getSelectedItem().toString();
        String kriteria = cbkriteria.getSelectedItem().toString();
        JasperDesign jd = JRXmlLoader.load(getClass().getResourceAsStream("/laporan/laporanpelayanan.jrxml"));
        JRDesignQuery query = new JRDesignQuery();
        HashMap param = new HashMap();
        param.put("kriteria", kriteria);
        query.setText("select tbl_rm.nama_pasien,tbl_rm.alamat,tbl_rm.jenis_kelamin,"
                + " tbl_pelayanan.*,tbl_pembayaran.* from tbl_pelayanan"
                + " inner join tbl_rm using(kode_rm)"
                + " inner join tbl_pembayaran using(id_pendaftaran)"
                + " where user='" + user + "' and kriteria_pengunjung='" + kriteria + "' and (Tanggal BETWEEN '" + dateawal + "' AND '" + dateakhir + "')");
        jd.setQuery(query);
        JasperReport jr = JasperCompileManager.compileReport(jd);
        JasperPrint jp = JasperFillManager.fillReport(jr, param, con);
        JasperViewer.viewReport(jp, false);

    }

    public void cetakpoli() throws JRException {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dateawal = df.format(awal.getDate());
        String dateakhir = df.format(akhir.getDate());
        String user = cbuser.getSelectedItem().toString();
        String poli = cbpoli.getSelectedItem().toString();
        JasperDesign jd = JRXmlLoader.load(getClass().getResourceAsStream("/laporan/laporanpelayanan.jrxml"));
        JRDesignQuery query = new JRDesignQuery();
        HashMap param = new HashMap();
        param.put("kriteria", poli);
        query.setText("select tbl_rm.nama_pasien,tbl_rm.alamat,tbl_rm.jenis_kelamin,"
                + " tbl_pelayanan.*,tbl_pembayaran.* from tbl_pelayanan"
                + " inner join tbl_rm using(kode_rm)"
                + " inner join tbl_pembayaran using(id_pendaftaran)"
                + " where user='" + user + "' and poli='" + poli + "' and (Tanggal BETWEEN '" + dateawal + "' AND '" + dateakhir + "')");
        jd.setQuery(query);
        JasperReport jr = JasperCompileManager.compileReport(jd);
        JasperPrint jp = JasperFillManager.fillReport(jr, param, con);
        JasperViewer.viewReport(jp, false);

    }

    public void cetakrawatinap() throws JRException {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dateawal = df.format(awal.getDate());
        String dateakhir = df.format(akhir.getDate());
        String user = cbuser.getSelectedItem().toString();

        JasperDesign jd = JRXmlLoader.load(getClass().getResourceAsStream("/laporan/laporanpelayananri.jrxml"));
        JRDesignQuery query = new JRDesignQuery();
        HashMap param = new HashMap();
        param.put("tanggal_awal", dateawal);
        param.put("tanggal_akhir", dateakhir);
        query.setText("select tbl_rm.nama_pasien, tbl_ripelayanan.* from tbl_ripelayanan "
                + "inner join tbl_rm on tbl_rm.kode_rm=tbl_ripelayanan.no_rm"
                + " where user='" + user + "' and (tanggal_mrs BETWEEN '" + dateawal + "' AND '" + dateakhir + "')");
        jd.setQuery(query);
        JasperReport jr = JasperCompileManager.compileReport(jd);
        JasperPrint jp = JasperFillManager.fillReport(jr, param, con);
        JasperViewer.viewReport(jp, false);

    }

    public void cetakberdasarobat() throws JRException {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dateawal = df.format(awal.getDate());
        String dateakhir = df.format(akhir.getDate());
        String user = cbuser.getSelectedItem().toString();
        String kriteria = cbkriteria.getSelectedItem().toString();
        JasperDesign jd = JRXmlLoader.load(getClass().getResourceAsStream("/laporan/laporanpelayanan1.jrxml"));
        JRDesignQuery query = new JRDesignQuery();
        HashMap param = new HashMap();
        param.put("kriteria", kriteria);
        query.setText("select tbl_rm.nama_pasien,tbl_rm.alamat,tbl_rm.jenis_kelamin,"
                + " tbl_pelayanan.*,tbl_pembayaran.*,tbl_resep.*,tbl_obat.nama_obat from tbl_pelayanan"
                + " inner join tbl_rm using(kode_rm)"
                + " inner join tbl_pembayaran using(id_pendaftaran)"
                + " inner join tbl_resep using(id_pendaftaran)"
                + " inner join tbl_obat on tbl_obat.id_obat=tbl_resep.id_obat"
                + " where user='" + user + "' and (Tanggal BETWEEN '" + dateawal + "' AND '" + dateakhir + "')");
        jd.setQuery(query);
        JasperReport jr = JasperCompileManager.compileReport(jd);
        JasperPrint jp = JasperFillManager.fillReport(jr, param, con);
        JasperViewer.viewReport(jp, false);
    }

    public void cetakperpasien() throws JRException {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        String user = cbuser.getSelectedItem().toString();
        String pasien = tpasien.getText();
        JasperDesign jd = JRXmlLoader.load(getClass().getResourceAsStream("/laporan/laporanpelayanan2.jrxml"));
        JRDesignQuery query = new JRDesignQuery();
        HashMap param = new HashMap();
        param.put("koderm", pasien);
        query.setText("select *, tbl_rm.* from tbl_datasakit"
                + " inner join tbl_rm using(kode_rm)"
                + " where kode_rm='" + pasien + "'");
        jd.setQuery(query);
        JasperReport jr = JasperCompileManager.compileReport(jd);
        JasperPrint jp = JasperFillManager.fillReport(jr, param, con);
        JasperViewer.viewReport(jp, false);
    }
}