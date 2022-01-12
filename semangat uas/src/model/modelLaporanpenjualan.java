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
public class modelLaporanpenjualan {
    private int idm;
    private String namapembelim;
    private String type;
    private int banyak;
    private int hargatotalm;
    private int bayar;

    public int getIdm() {
        return idm;
    }

    public void setIdm(int idm) {
        this.idm = idm;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

 

    public String getNamapembelim() {
        return namapembelim;
    }

    public void setNamapembelim(String namapembelim) {
        this.namapembelim = namapembelim;
    }

    public int getBanyak() {
        return banyak;
    }

    public void setBanyak(int banyak) {
        this.banyak = banyak;
    }

    public int getBayar() {
        return bayar;
    }

    public void setBayar(int bayar) {
        this.bayar = bayar;
    }

    
    public int getHargatotalm() {
        return hargatotalm;
    }

    public void setHargatotalm(int hargatotalm) {
        this.hargatotalm = hargatotalm;
    }

  
    
    public void EditData (){        
        String sql = "UPDATE transaksi SET "
                + " namapembeli = '"+getNamapembelim()+"' "
                + ", type = '"+getType()+"' "
                + ", banyak = '"+getBanyak()+"' " 
                + ", hargatotal = '"+getHargatotalm()+"' " 
                + ", bayar = '"+getBayar()+"' " 
                + " WHERE idt = "+getIdm()+" "; 
        
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
        String sql = "DELETE FROM transaksi WHERE idt = "+getIdm()+" ";
        
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
