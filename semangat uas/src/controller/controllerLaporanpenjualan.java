/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.modelLaporanpenjualan;
import view.viewLaporanpenjualan;





        
/**
 *
 * @author Tawang sahro winanto
 */
public class controllerLaporanpenjualan {
    private modelLaporanpenjualan mj;
    private viewLaporanpenjualan vj;
    
    public controllerLaporanpenjualan(viewLaporanpenjualan vj) {
        this.vj= vj;
    }
    
    public void clear(){
        vj.getId().setText("");
        vj.getNamapembeli().setText("");
        vj.getType().setText("");
        vj.getBanyak().setText("");
        vj.getJumlah().setText("");
        vj.getHargatotal().setText("");
        vj.getBayar().setText("");
    }
    
 
   

    
    public void Update(){
        mj = new modelLaporanpenjualan();
        mj.setIdm(Integer.parseInt(vj.getId().getText()));
        mj.setNamapembelim(vj.getNamapembeli().getText());
        mj.setType(vj.getType().getText());
        mj.setBanyak(Integer.parseInt(vj.getBanyak().getText()));
        mj.setHargatotalm(Integer.parseInt(vj.getHargatotal().getText()));
        mj.setBayar(Integer.parseInt(vj.getBayar().getText()));
        mj.EditData();
        clear();

    }
    
    public void Delete(){
        mj = new modelLaporanpenjualan();
        mj.setIdm(Integer.parseInt(vj.getId().getText()));       
        mj.HapusData();       
        clear();
    }
    
}
