/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import config.Usersession;
import config.koneksiDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
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
public class CRUD_ICD extends javax.swing.JFrame {

    private static void log(Level SEVERE, Object object, UnsupportedLookAndFeelException ex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Creates new form CRUD_Persalinan2
     */
    String level = Usersession.getLevel();

    public CRUD_ICD() {
        initComponents();
        tampilICD();
        btnhapus.setEnabled(false);
        btnupdate.setEnabled(false);
    }
    Statement st;
    Connection con = koneksiDB.getConnection();
    ResultSet rs;
    ResultSet rs1;
    ResultSet rs2;
    DefaultComboBoxModel modelc;
    DefaultTableModel modelicd;

    PreparedStatement pst;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnkembali = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tcari = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tidicd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tnamaicd = new javax.swing.JTextArea();
        btnsimpan = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnupdate1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblicd = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        resetbulanan = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnkembali.setBackground(new java.awt.Color(51, 51, 255));
        btnkembali.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnkembali.setForeground(new java.awt.Color(255, 255, 255));
        btnkembali.setText("DASHBOARD");
        btnkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkembaliActionPerformed(evt);
            }
        });
        getContentPane().add(btnkembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 180, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("CARI");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 60, 30));

        tcari.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tcariKeyReleased(evt);
            }
        });
        getContentPane().add(tcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, 540, 30));

        jPanel1.setForeground(new java.awt.Color(102, 102, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Kode ICD");

        tidicd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Nama ICD");

        tnamaicd.setColumns(20);
        tnamaicd.setRows(5);
        jScrollPane2.setViewportView(tnamaicd);

        btnsimpan.setBackground(new java.awt.Color(51, 51, 255));
        btnsimpan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnsimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnsimpan.setText("SIMPAN");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btnupdate.setBackground(new java.awt.Color(255, 102, 51));
        btnupdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("UBAH");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btnhapus.setBackground(new java.awt.Color(153, 153, 0));
        btnhapus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnhapus.setForeground(new java.awt.Color(255, 255, 255));
        btnhapus.setText("HAPUS");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btnupdate1.setBackground(new java.awt.Color(102, 102, 255));
        btnupdate1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnupdate1.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate1.setText("BATAL");
        btnupdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdate1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tidicd, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnupdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnupdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tidicd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnupdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 360, 420));

        tblicd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblicd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblicdMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblicd);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 197, 700, 390));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("KELOLA DATA ICD");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 460, 40));

        resetbulanan.setBackground(new java.awt.Color(0, 255, 204));
        resetbulanan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        resetbulanan.setText("Reset Laporan ICD");
        resetbulanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbulananActionPerformed(evt);
            }
        });
        getContentPane().add(resetbulanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 600, 220, 50));

        jButton3.setBackground(new java.awt.Color(0, 255, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("CETAK LAPORAN 2");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 600, 200, 50));

        jButton4.setBackground(new java.awt.Color(0, 255, 204));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("CETAK LAPORAN");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 600, 190, 50));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bg-CRUD_1.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkembaliActionPerformed
        switch (level) {
            case "admin": {

                dashboard dsb = new dashboard();
                dsb.dashAdmin();
                dsb.setExtendedState(JFrame.MAXIMIZED_BOTH);
                dsb.setVisible(true);
                dispose();
                break;
            }
            case "receptionist": {

                dashboard dsb = new dashboard();
                dsb.dashReceptionist();
                dsb.setExtendedState(JFrame.MAXIMIZED_BOTH);
                dsb.setVisible(true);
                dispose();
                break;
            }
            case "dokter": {

                dashboard dsb = new dashboard();
                dsb.dashDokter();
                dsb.setExtendedState(JFrame.MAXIMIZED_BOTH);
                dsb.setVisible(true);
                dispose();
                break;
            }
            case "apoteker": {

                dashboard dsb = new dashboard();
                dsb.dashApoteker();
                dsb.setExtendedState(JFrame.MAXIMIZED_BOTH);
                dsb.setVisible(true);
                dispose();
                break;
            }
            default:
                break;
        }
    }//GEN-LAST:event_btnkembaliActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        String id = tidicd.getText();
        String nama = tnamaicd.getText();

        if (id.length() == 0) {
            JOptionPane.showMessageDialog(null, "Masukan data dengan benar!!");
            Resetform();
            btnupdate.setEnabled(false);

        } else {

            try {
                con.createStatement().executeUpdate("INSERT INTO tbl_icd VALUES('" + id + "',"
                        + "'" + nama + "',0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,"
                        + "0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");

                JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
                Resetform();
            } catch (Exception ex) {
                System.out.println("" + ex);
                JOptionPane.showMessageDialog(null, "Gagal !! Isi Form Dengan Benar ");
            }

        }

    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        try {

            String nama = tnamaicd.getText();
            String kode = tidicd.getText();

            con.createStatement().executeUpdate("update tbl_icd set nama_icd='" + nama + ""
                    + "',kode_icd='" + kode + "'"
                    + "where kode_icd ='" + modelicd.getValueAt(tblicd.getSelectedRow(), 0) + "'");
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
            Resetform();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        int keputusan = JOptionPane.showConfirmDialog(this, "Apakah anda yakin menghapus data?");
        switch (keputusan) {
            case JOptionPane.YES_OPTION:
                try {
                    con.createStatement().executeUpdate("delete from tbl_icd where kode_icd = '" + modelicd.getValueAt(tblicd.getSelectedRow(), 0) + "'");
                    JOptionPane.showMessageDialog(null, "Berhasil");

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Gagal !!!");

                }
                Resetform();
                break;
        }


    }//GEN-LAST:event_btnhapusActionPerformed

    private void tblicdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblicdMouseClicked
        int i = tblicd.getSelectedRow();
        tidicd.setText(modelicd.getValueAt(i, 0).toString());
        tnamaicd.setText(modelicd.getValueAt(i, 1).toString());
        btnsimpan.setEnabled(false);
        btnupdate.setEnabled(true);
        btnhapus.setEnabled(true);
    }//GEN-LAST:event_tblicdMouseClicked

    private void btnupdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdate1ActionPerformed
        Resetform();
    }//GEN-LAST:event_btnupdate1ActionPerformed

    private void tcariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tcariKeyReleased
        tampilICD();
    }//GEN-LAST:event_tcariKeyReleased

    private void resetbulananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbulananActionPerformed
        int keputusan = JOptionPane.showConfirmDialog(this, "Apakah anda benar yakin mereset laporan bulanan? ");
        switch (keputusan) {
            case JOptionPane.YES_OPTION:
                try {
                    con.createStatement().executeUpdate("update tbl_icd set"
                            + " 7hbl=0,7hbp=0,7hll=0,7hlp=0,28hbl=0,28hbp=0,28hll=0,28hlp=0,1tbl=0,1tbp=0,1tll=0,1tlp=0,"
                            + " 4tbl=0,4tbp=0,4tll=0,4tlp=0,9tbl=0,9tbp=0,9tll=0,9tlp=0,14tbl=0,14tbp=0,14tll=0,14tlp=0,"
                            + " 19tbl=0,19tbp=0,19tll=0,19tlp=0,44tbl=0,44tbp=0,44tlp=0,44tlp=0,54tbl=0,54tbp=0,54tll=0,54tlp=0,"
                            + " 59tbl=0,59tbp=0,59tll=0,59tlp=0,64tbl=0,64tbp=0,64tll=0,64tlp=0,69tbl=0,69tbp=0,69tll=0,69tlp=0,"
                            + " 70tbl=0,70tbp=0,70tll=0,70tlp=0,jbl=0,jbp=0,jll=0,jlp=0,total_laki=0,total_perempuan=0,jumlah_total=0");
                    JOptionPane.showMessageDialog(null, "Berhasil  !!");
                    Resetform();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Gagal Menyimpan !! " + e);
                    System.out.println(e);
                }
                break;
        }

    }//GEN-LAST:event_resetbulananActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            cetaklaporan1();
        } catch (JRException ex) {
            Logger.getLogger(CRUD_ICD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            cetaklaporan();
        } catch (JRException ex) {
            Logger.getLogger(CRUD_ICD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(CRUD_ICD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUD_ICD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUD_ICD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUD_ICD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUD_ICD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkembali;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton btnupdate1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton resetbulanan;
    private javax.swing.JTable tblicd;
    private javax.swing.JTextField tcari;
    private javax.swing.JTextField tidicd;
    private javax.swing.JTextArea tnamaicd;
    // End of variables declaration//GEN-END:variables
  public void tampilICD() {
        String[] judul = {"Kode ICD", "Nama Penyakit"};
        modelicd = new DefaultTableModel(judul, 0);
        tblicd.setModel(modelicd);
        String sql = "SELECT * from tbl_icd where nama_icd like'%" + tcari.getText() + "%' or kode_icd like '%" + tcari.getText() + "%'";

        try {
            rs = con.createStatement().executeQuery(sql);

            while (rs.next()) {

                String kode = rs.getString("kode_icd");
                String nama = rs.getString("nama_icd");

                String[] data = {kode, nama};
                modelicd.addRow(data);
            }
        } catch (Exception e) {
            System.out.println(e);

        }

    }

    private void Resetform() {
        tidicd.setText("");
        tnamaicd.setText("");
        tampilICD();
        btnhapus.setEnabled(false);
        btnupdate.setEnabled(false);
        btnsimpan.setEnabled(true);
    }

    private void cetaklaporan() throws JRException {
        JasperDesign jd = JRXmlLoader.load(getClass().getResourceAsStream("/laporan/laporanICD1.jrxml"));
        JRDesignQuery query = new JRDesignQuery();

        query.setText("Select * from tbl_icd");
        jd.setQuery(query);
        JasperReport jr = JasperCompileManager.compileReport(jd);
        JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
        JasperViewer.viewReport(jp, false);
    }

    private void cetaklaporan1() throws JRException {
        JasperDesign jd = JRXmlLoader.load(getClass().getResourceAsStream("/laporan/laporanICD2.jrxml"));
        JRDesignQuery query = new JRDesignQuery();

        query.setText("Select * from tbl_icd");
        jd.setQuery(query);
        JasperReport jr = JasperCompileManager.compileReport(jd);
        JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
        JasperViewer.viewReport(jp, false);
    }
}
