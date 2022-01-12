/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.modelLaporanpembelian;
import view.viewLaporanpembelian;
import view.viewListbarang;





        
/**
 *
 * @author Tawang sahro winanto
 */
public class controllerlLaporanpembelian {
    private modelLaporanpembelian mlp;
    private viewLaporanpembelian vlp;
    
    public controllerlLaporanpembelian(viewLaporanpembelian vlp) {
        this.vlp= vlp;
    }
    
    public void clear(){
        vlp.getId().setText("");
        vlp.getType().setText("");
        vlp.getJumlah().setText("");
        vlp.getHargasatuan().setText("");
        vlp.getHargatotal().setText("");
    }
    
 
   

    
    public void Update(){
        mlp = new modelLaporanpembelian();
        mlp.setIdm(Integer.parseInt(vlp.getId().getText()));
        mlp.setTypem(vlp.getType().getText());
        mlp.setJumlahm(Integer.parseInt(vlp.getJumlah().getText()));
        mlp.setHargasatuanm(Integer.parseInt(vlp.getHargasatuan().getText()));
        mlp.setHargatotalm(Integer.parseInt(vlp.getHargatotal().getText()));
        mlp.EditData();
        clear();

    }
    
    public void Delete(){
        mlp = new modelLaporanpembelian();
        mlp.setIdm(Integer.parseInt(vlp.getId().getText()));
        mlp.HapusData();
        clear();
    }
    
}
