/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.modelpembelian;
import view.viewpembelian;

/**
 *
 * @author Tawang sahro winanto
 */

public class controllerpembelian {
    private modelpembelian mb;
    private viewpembelian vb;
    public controllerpembelian(viewpembelian vb) {
        this.vb= vb;
    }
    
     public void clear(){   
        vb.getJumlah().setText("");
        vb.getHargasatuan().setText("");
        vb.getHargatotal().setText("");
    }
     
    public void simpan(){
        mb = new modelpembelian();
        mb.setMtype(vb.getType().getText());
        mb.setMjumlah(vb.getJumlah().getText());
        mb.setMhargasatuan(vb.getHargasatuan().getText());
        mb.setMhargatotal(vb.getHargatotal().getText());
        
        
        //JOptionPane.showConfirmDialog(vP, "Nama Pelanggan : "+mP.getNama()+"\n Nomor HP :"+mP.getNohp()+"\n Jenis Kelamin :"+mP.getJeniskelamin()+"\n Umur :"+mP.getUmur()+"\n Alamat :"+mP.getAlamat());
        mb.SimpanDataBarang();
        clear();
    }
}
