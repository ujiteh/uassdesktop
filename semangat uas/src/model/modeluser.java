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
public class modeluser {
     private String idu;
    private String username;
    private String password;
    private String hakakses;

   
    public modeluser() {

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

    
    public void SimpanDataUser() {
        String sql = ("INSERT INTO user (username, password, hakakses)"
                + "VALUES ('" + getUsername()+ "' , '" + getPassword()+ "' , '" + getHakakses() + "'  ) ");

        try {
            PreparedStatement eksekusi = KoneksiDatabase.getKoneksi().prepareStatement(sql);
            eksekusi.execute();

            JOptionPane.showMessageDialog(null, "Data berhasil disimpan ke dalam Database");

        } catch (SQLException ex) {
            // Logger.getLogger(ModelPelanggan.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data gagal disimpan ke dalam Database \n" + ex);
        }
    }

    public void EditData() {
        String sql = "UPDATE user SET "
                + " username = '" + getUsername()+ "' "
                + ", password = '" + getPassword() + "' "
                + ", hakakses = '" + getHakakses() + "' "
                + " WHERE idu = '" + getIdu()+ "' ";
        try {
            PreparedStatement eksekusi = KoneksiDatabase.getKoneksi().prepareStatement(sql);
            eksekusi.execute();

            JOptionPane.showMessageDialog(null, "Data berhasil diUpdate ke dalam Database");

        } catch (SQLException ex) {
            // Logger.getLogger(ModelPelanggan.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data gagal diUpdate ke dalam Database \n" + ex);
        }
        
    }
    
    public void HapusData (){
        String sql = "DELETE FROM user WHERE idu = "+getIdu()+" ";
        
        try {
            PreparedStatement eksekusi = KoneksiDatabase.getKoneksi().prepareStatement(sql);
            eksekusi.execute();
            
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus dari Database");
            
        } catch (SQLException ex) {
            //Logger.getLogger(ModelPelanggan.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data gagal dihapus dari Database \n" + ex);
        }
    }

}
