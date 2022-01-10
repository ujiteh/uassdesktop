/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import database.KoneksiDatabase;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Tawang sahro winanto
 */
public class modelstock {
    private String type;
    private String stock;
    private String harga ;
    private int id;
   
     public String getharga() {
        return harga;
    }

    public void setharga(String harga) {
        this.harga = harga;
    }

    public String getstock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String gettype() {
        return type;
    }

    public void settype(String type) {
        this.type = type;
    }
     public int getid() {
        return id;
    }

    public void setidt(int id) {
        this.id = id;
    }
    public void update(){
              
         String sql = "UPDATE stock SET type = '" +  gettype()+"'"
                 +", stock ='" + getstock()+"'"
                 +", harga = ' "+ getharga()+"'"+"' WHERE ids = '"+getid()+"'";
        try {
           PreparedStatement eksekusi = KoneksiDatabase.getKoneksi().prepareStatement(sql);
           eksekusi.execute();
           
           JOptionPane.showMessageDialog(null, "Data Berhasil disimpan");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Data gagal disimpan"+ex);
       }
        
        
    }
}
