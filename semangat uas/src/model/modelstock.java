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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   
     
    public void update(){
              
         String sql = "UPDATE stock SET "
                 + "type = '" +  getType()+"'"
                 +", stockgas ='" + getStock()+"'"
                 +", harga = ' "+ getHarga()+"'"+" WHERE  ids = "+getId()+"";
         //UPDATE `stock` SET `stockgas` = 'ds55' WHERE `stock`.`ids` = 94;
        try {
           PreparedStatement eksekusi = KoneksiDatabase.getKoneksi().prepareStatement(sql);
           eksekusi.execute();
           
           JOptionPane.showMessageDialog(null, "Data Berhasil disimpan");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Data gagal disimpan"+ex+sql);
       }
        
        
    }
}
