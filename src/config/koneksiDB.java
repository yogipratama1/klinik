/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author YOGI
 */

public class koneksiDB {
    static Connection con;
    
    public static Connection getConnection(){
        
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/klinik2","root","");
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Koneksi Gagal !! Periksa Server anda !!");
            System.exit(0);
        }
        return con;
        
    }
   
    
}
