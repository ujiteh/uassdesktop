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
public class modelbarang {
    private String mgas;
    private int mjumlah ;
    private int mstock;
    private String mhargasatuan ;
    private String mhargatotal ;
    
     public String getgas() {
        return mgas;
    }

    public void setgas(String mgas) {
        this.mgas = mgas;
    }
    
     public int getjumlah() {
        return mjumlah;
    }

    public void setjumlah(int jumlah) {
        this.mjumlah = jumlah;
    }
    
     public int getstock() {
        return mjumlah;
    }

    public void setstock(int stock) {
        this.mstock = stock;
    }
     public String gethargasatuan() {
        return mhargasatuan;
    }

    public void sethargasatuan(String hargasatuan) {
        this.mhargasatuan = hargasatuan;
    }
    
     public String gethargatotal() {
        return mhargatotal;
    }

    public void sethargatotal(String hargatotal) {
        this.mhargatotal = hargatotal;
    }
    public void SimpanDataBarang (){
        int stock = getstock();
        int stok = stock +getjumlah();
        String sql = ("INSERT INTO barang (type, stock, hargasatuan, hargatotal)" 
                + "VALUES ('"+getgas()+"' , '"+getjumlah()+"' , '"+gethargasatuan()+"' , '"+gethargatotal()+"' ) " );
        String sql2 = "UPDATE stock SET stock = '"+stok+"' WHERE type = '"+getgas()+"' "; 
 
        try {
            PreparedStatement eksekusi = KoneksiDatabase.getKoneksi().prepareStatement(sql);
            eksekusi.execute();
            
            PreparedStatement eksekusi2 = KoneksiDatabase.getKoneksi().prepareStatement(sql2);
            eksekusi2.execute();
            
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan ke dalam Database");
            
        } catch (SQLException ex) {
            //Logger.getLogger(ModelPelanggan.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data gagal disimpan ke dalam Database \n" + ex);
        }
    }
}
