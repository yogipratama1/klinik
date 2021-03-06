/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import config.Usersession;
import config.koneksiDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author WINDOWS 10
 */
public class CRUD_penunjangpemeriksaan extends javax.swing.JFrame {

    /**
     * Creates new form CRUD_penunjangpemeriksaan
     */
    String level = Usersession.getLevel();

    public CRUD_penunjangpemeriksaan() {
        initComponents();
        tampilpenunjang();
        btnubah.setEnabled(false);
        btnhapus.setEnabled(false);
    }
    Statement st;
    Connection con = koneksiDB.getConnection();
    ResultSet rs;
    DefaultComboBoxModel modelc;
    DefaultTableModel model;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btndashboard = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblpenunjang = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tidpenunjang = new javax.swing.JTextField();
        tnamapenunjang = new javax.swing.JTextField();
        ttarifpenunjang = new javax.swing.JTextField();
        btnsimpan = new javax.swing.JButton();
        btnubah = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tcari = new javax.swing.JTextField();
        btnrefresh = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cari");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 150, 30));

        btndashboard.setBackground(new java.awt.Color(0, 51, 204));
        btndashboard.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btndashboard.setForeground(new java.awt.Color(255, 255, 255));
        btndashboard.setText("Dashboard");
        btndashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndashboardActionPerformed(evt);
            }
        });
        getContentPane().add(btndashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 180, 50));

        tblpenunjang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tblpenunjang.setModel(new javax.swing.table.DefaultTableModel(
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
        tblpenunjang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblpenunjangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblpenunjang);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 630, 380));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Kelola Data Penunjang Pemeriksaan/Diagnostik");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 580, 40));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        tidpenunjang.setEditable(false);
        tidpenunjang.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tidpenunjang.setText("auto fill");

        tnamapenunjang.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        ttarifpenunjang.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ttarifpenunjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttarifpenunjangActionPerformed(evt);
            }
        });

        btnsimpan.setBackground(new java.awt.Color(51, 51, 255));
        btnsimpan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnsimpan.setText("Simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btnubah.setBackground(new java.awt.Color(0, 204, 204));
        btnubah.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnubah.setText("Ubah");
        btnubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnubahActionPerformed(evt);
            }
        });

        btnhapus.setBackground(new java.awt.Color(255, 51, 51));
        btnhapus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnhapus.setForeground(new java.awt.Color(255, 255, 255));
        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ID Penunjang");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Nama Penunjang");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Tarif");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnsimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnubah, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ttarifpenunjang, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                .addComponent(tidpenunjang))
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(tnamapenunjang, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tidpenunjang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tnamapenunjang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ttarifpenunjang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnubah, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 360, 420));

        tcari.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tcariKeyReleased(evt);
            }
        });
        getContentPane().add(tcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 150, 470, 30));

        btnrefresh.setBackground(new java.awt.Color(51, 51, 255));
        btnrefresh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnrefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnrefresh.setText("Refresh Form");
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });
        getContentPane().add(btnrefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 600, 130, 39));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bg-CRUD_1.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
        Resetform();
    }//GEN-LAST:event_btnrefreshActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        simpan();
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void ttarifpenunjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttarifpenunjangActionPerformed
        simpan();
    }//GEN-LAST:event_ttarifpenunjangActionPerformed

    private void btnubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnubahActionPerformed
        String nama = tnamapenunjang.getText();
        String tarif = ttarifpenunjang.getText();

        if (nama.length() == 0) {
            JOptionPane.showMessageDialog(null, "Masukan data dengan benar!!");
            Resetform();
            btnubah.setEnabled(false);

        } else {

            try {
                con.createStatement().executeUpdate("update tbl_obat Set nama_obat='" + nama + "',harga_jual='" + tarif + "' "
                        + " where id_obat='" + tidpenunjang.getText() + "'");
                JOptionPane.showMessageDialog(null, "Data Berhasil Diubah!!");
                Resetform();
            } catch (Exception ex) {
                System.out.println("" + ex);
                JOptionPane.showMessageDialog(null, "Gagal !! Isi Form Dengan Benar " + ex);

            }
        }
    }//GEN-LAST:event_btnubahActionPerformed

    private void tblpenunjangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblpenunjangMouseClicked
        int i = tblpenunjang.getSelectedRow();
        tidpenunjang.setText(model.getValueAt(i, 0).toString());
        tnamapenunjang.setText(model.getValueAt(i, 1).toString());
        ttarifpenunjang.setText(model.getValueAt(i, 2).toString());
        btnsimpan.setEnabled(false);
        btnubah.setEnabled(true);
        btnhapus.setEnabled(true);
    }//GEN-LAST:event_tblpenunjangMouseClicked

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        int keputusan = JOptionPane.showConfirmDialog(this, "apakah anda yakinmenghapus data ini? ");
        switch (keputusan) {
            case JOptionPane.YES_OPTION:
                try {
                    con.createStatement().executeUpdate("delete from tbl_obat where id_obat='" + tidpenunjang.getText() + "'");
                    JOptionPane.showMessageDialog(null, "Berhasil !!");
                    Resetform();
                } catch (Exception e) {
                    System.out.println(e);
                    JOptionPane.showMessageDialog(null, "Berhasil !!");
                }
        }
    }//GEN-LAST:event_btnhapusActionPerformed

    private void tcariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tcariKeyReleased
        tampilpenunjang();
    }//GEN-LAST:event_tcariKeyReleased

    private void btndashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndashboardActionPerformed
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
    }//GEN-LAST:event_btndashboardActionPerformed

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
            java.util.logging.Logger.getLogger(CRUD_penunjangpemeriksaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUD_penunjangpemeriksaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUD_penunjangpemeriksaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUD_penunjangpemeriksaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUD_penunjangpemeriksaan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btndashboard;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btnubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblpenunjang;
    private javax.swing.JTextField tcari;
    private javax.swing.JTextField tidpenunjang;
    private javax.swing.JTextField tnamapenunjang;
    private javax.swing.JTextField ttarifpenunjang;
    // End of variables declaration//GEN-END:variables
public void tampilpenunjang() {
        String[] judul = {"ID", "Nama Penunjang", "Tarif Tindakan"};
        model = new DefaultTableModel(judul, 0);
        tblpenunjang.setModel(model);
        String sql = "SELECT * FROM tbl_obat"
                + " where kategori_obat='penunjang' and nama_obat like '%" + tcari.getText() + "%'";

        try {
            rs = con.createStatement().executeQuery(sql);

            while (rs.next()) {
                String id = rs.getString("id_obat");
                String nm = rs.getString("nama_obat");
                String tarif = rs.getString("harga_jual");

                String[] data = {id, nm, tarif};
                model.addRow(data);

            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "tabel pembayaran" + e);

        }
    }

    public void Resetform() {
        tampilpenunjang();
        tidpenunjang.setText("auto fill");
        tnamapenunjang.setText("");
        ttarifpenunjang.setText("");
        btnsimpan.setEnabled(true);
        btnubah.setEnabled(false);
        btnhapus.setEnabled(false);
    }

    public void simpan() {
        String nama = tnamapenunjang.getText();
        String tarif = ttarifpenunjang.getText();

        if (nama.length() == 0) {
            JOptionPane.showMessageDialog(null, "Masukan data dengan benar!!");
            Resetform();
            btnubah.setEnabled(false);

        } else {

            try {
                con.createStatement().executeUpdate("INSERT INTO tbl_obat(id_obat,nama_obat,kategori_obat,harga_jual) value(null,'" + nama + "','Penunjang','" + tarif + "')");
                JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
                Resetform();
            } catch (Exception ex) {
                System.out.println("" + ex);
                JOptionPane.showMessageDialog(null, "Gagal !! Isi Form Dengan Benar " + ex);

            }
        }
    }
}
