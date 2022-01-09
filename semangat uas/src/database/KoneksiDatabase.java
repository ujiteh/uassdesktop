/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Tawang sahro winanto
 */
public class KoneksiDatabase {
    private static Connection conn;
    private static Properties propert = new Properties();
    public static Connection getKoneksi(){
        if(conn == null){

            try {   
                propert.load(new FileInputStream("C:\\Users\\Tawang sahro winanto\\Documents\\NetBeansProjects"
                        + "\\semangat uas\\src\\database\\konfigurasiDatabase.properties"));
                

            } catch (IOException ex) {
                System.err.println("error mengambil file"+ex);
                
                System.err.println("berhasil terhubung"+ex);
            }
            try {
                conn = DriverManager.getConnection(propert.getProperty("jdbc.url"),propert
                        .getProperty("jdbc.username"),propert.getProperty("jdbc.password"));
            } catch (SQLException ex) {
                Logger.getLogger(KoneksiDatabase.class.getName()).log(Level.SEVERE, null, ex);
            }
            }   
        return conn;
    }
    public static void main (String[] args) throws SQLException{
    if(getKoneksi().equals(conn)){
        System.out.println("sukses terkoneksi");
    }
    }
}

