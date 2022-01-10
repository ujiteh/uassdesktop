/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.modelbarang;
import view.viewbarang;

/**
 *
 * @author Tawang sahro winanto
 */

public class controllerbarang {
    private modelbarang mb;
    private viewbarang vb;
    public controllerbarang(viewbarang vb) {
        this.vb= vb;
    }
    
    public void simpan(){
        mb = new modelbarang();
        mb.setgas(vb.getGas().getText());
        mb.setjumlah(Integer.parseInt( vb.getJumlah().getText()));
        mb.sethargasatuan(vb.getHargasatuan().getText());
        mb.sethargatotal(vb.getHargatotal().getText());
        
        
        //JOptionPane.showConfirmDialog(vP, "Nama Pelanggan : "+mP.getNama()+"\n Nomor HP :"+mP.getNohp()+"\n Jenis Kelamin :"+mP.getJeniskelamin()+"\n Umur :"+mP.getUmur()+"\n Alamat :"+mP.getAlamat());
        mb.SimpanDataBarang();
      
    }
}
