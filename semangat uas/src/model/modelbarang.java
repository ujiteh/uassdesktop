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
    private String mtype;
    private String mjumlah ;
    private String mhargasatuan ;
    private String mhargatotal ;
    
     public String gettype() {
        return mtype;
    }

    public void settype(String mtype) {
        this.mtype = mtype;
    }
    
     public String getjumlah() {
        return mjumlah;
    }

    public void setjumlah(String jumlah) {
        this.mjumlah = jumlah;
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

        String sql = ("INSERT INTO barang (type, stock, hargasatuan, hargatotal)" 
                + "VALUES ('"+gettype()+"' , '"+getjumlah()+"' , '"+gethargasatuan()+"' , '"+gethargatotal()+"' ) " );
 
        try {
            PreparedStatement eksekusi = KoneksiDatabase.getKoneksi().prepareStatement(sql);
            eksekusi.execute();
            
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan ke dalam Database");
            
        } catch (SQLException ex) {
            //Logger.getLogger(ModelPelanggan.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data gagal disimpan ke dalam Database \n" + ex);
        }
    }
}
