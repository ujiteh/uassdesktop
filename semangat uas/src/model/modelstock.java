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
    private int stock;
    private int harga ;
    private int id;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   
    public void SimpanData (){

        String sql = ("INSERT INTO stock (type, stockgas, harga)" 
                + "VALUES ('"+getType()+"' , '"+getStock()+"' , '"+getHarga()+"' ) " );
 
        try {
            PreparedStatement eksekusi = KoneksiDatabase.getKoneksi().prepareStatement(sql);
            eksekusi.execute();
            
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan ke dalam Database");
            
        } catch (SQLException ex) {
            //Logger.getLogger(ModelPelanggan.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data gagal disimpan ke dalam Database \n" + ex);
        }
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
           
           JOptionPane.showMessageDialog(null, "Data Berhasil diupdate");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Data gagal diupdate"+ex+sql);
       }
        
        
    }
     public void HapusData (){
        String sql = "DELETE FROM stock WHERE ids = "+getId()+" ";
        
        try {
            PreparedStatement eksekusi = KoneksiDatabase.getKoneksi().prepareStatement(sql);
            eksekusi.execute();
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus dari Database");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data gagal dihapus dari Database \n" + ex);
        }
    }
}
