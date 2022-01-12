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
public class modelLaporanpembelian {
    private int idm;
    private String typem;
    private int jumlahm;
    private int hargasatuanm;
    private int hargatotalm;

    public int getIdm() {
        return idm;
    }

    public void setIdm(int idm) {
        this.idm = idm;
    }

    

    public String getTypem() {
        return typem;
    }

    public void setTypem(String typem) {
        this.typem = typem;
    }

    public int getJumlahm() {
        return jumlahm;
    }

    public void setJumlahm(int jumlahm) {
        this.jumlahm = jumlahm;
    }

    public int getHargasatuanm() {
        return hargasatuanm;
    }

    public void setHargasatuanm(int hargasatuanm) {
        this.hargasatuanm = hargasatuanm;
    }

    public int getHargatotalm() {
        return hargatotalm;
    }

    public void setHargatotalm(int hargatotalm) {
        this.hargatotalm = hargatotalm;
    }

  
    
    public void EditData (){        
        String sql = "UPDATE pembelian SET "
                + " type = '"+getTypem()+"' "
                + ", jumlah = '"+getJumlahm()+"' " 
                + ", hargasatuan = '"+getHargasatuanm()+"' " 
                + ", hargatotal = '"+getHargatotalm()+"' " 
                + " WHERE idb = "+getIdm()+" "; 
        
        //String sql = "UPDATE stock SET "
               //  + "type = '" +  getType()+"'"
            //     +", stockgas ='" + getStock()+"'"
               //  +", harga = ' "+ getHarga()+"'"+" WHERE  ids = "+getId()+"";
        try {
            PreparedStatement eksekusi = KoneksiDatabase.getKoneksi().prepareStatement(sql);
            eksekusi.execute();
            
            JOptionPane.showMessageDialog(null, "Data berhasil diUpdate ke dalam Database");
            
        } catch (SQLException ex) {
            //Logger.getLogger(ModelPelanggan.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data gagal diUpdate ke dalam Database \n" + ex);
        }
    }
    
    public void HapusData (){
        String sql = "DELETE FROM pembelian WHERE idb = "+getIdm()+" ";
        
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
