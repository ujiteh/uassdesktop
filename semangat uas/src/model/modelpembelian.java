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
public class modelpembelian {
    private String mtype;
    private String mjumlah ;
    private String mhargasatuan ;
    private String mhargatotal ;

    public String getMtype() {
        return mtype;
    }

    public void setMtype(String mtype) {
        this.mtype = mtype;
    }

    public String getMjumlah() {
        return mjumlah;
    }

    public void setMjumlah(String mjumlah) {
        this.mjumlah = mjumlah;
    }

    public String getMhargasatuan() {
        return mhargasatuan;
    }

    public void setMhargasatuan(String mhargasatuan) {
        this.mhargasatuan = mhargasatuan;
    }

    public String getMhargatotal() {
        return mhargatotal;
    }

    public void setMhargatotal(String mhargatotal) {
        this.mhargatotal = mhargatotal;
    }
    
    
    public void SimpanDataBarang (){

        String sql = ("INSERT INTO pembelian (type, jumlah, hargasatuan, hargatotal)" 
                + "VALUES ('"+getMtype()+"' , '"+getMjumlah()+"' , '"+getMhargasatuan()+"' , '"+getMhargatotal()+"' ) " );
 
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
