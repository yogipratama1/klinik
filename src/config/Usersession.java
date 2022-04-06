/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

/**
 *
 * @author YOGI
 */
public class Usersession {

    public static String id;
    public static String nama;
    public static String username;
    public static String level;

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        Usersession.id = id;
    }

    public static String getNama() {
        return nama;
    }

    public static void setNama(String nama) {
        Usersession.nama = nama;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        Usersession.username = username;
    }

    public static String getLevel() {
        return level;
    }

    public static void setLevel(String level) {
        Usersession.level = level;
    }

    
}

