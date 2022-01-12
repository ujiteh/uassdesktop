/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.mysql.jdbc.Statement;
import database.KoneksiDatabase;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author Tawang sahro winanto
 */
public class modelLogin {
     private String idu;
    private String username;
    private String password;
    private String hakakses;

    public modelLogin(String idu, String username, String password, String hakakses) {
        this.idu = idu;
        this.username = username;
        this.password = password;
        this.hakakses = hakakses;
    }

    public modelLogin() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHakakses() {
        return hakakses;
    }

    public void setHakakses(String hakakses) {
        this.hakakses = hakakses;
    }

    public String getIdu() {
        return idu;
    }

    public void setIdu(String idu) {
        this.idu = idu;
    }

    public modelLogin login(String username, String password) {
        String sql = ("select * from user where username='" + username + "' and password='" + password + "'");

        try {
            Statement stat = (Statement) KoneksiDatabase.getKoneksi().createStatement();
            ResultSet res = stat.executeQuery(sql);

            while (res.next()) {

                return new modelLogin(res.getString("idu"),
                        res.getString("username"), "",
                        res.getString("hakakses"));
            }

        } catch (SQLException ex) {
            // Logger.getLogger(ModelPelanggan.class.getName()).log(Level.SEVERE, null, ex);
            //JOptionPane.showMessageDialog(null, "Data gagal disimpan ke dalam Database \n" + ex);
        }
        return null;
    }

 

}
