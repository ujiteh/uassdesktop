/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.modelpembelian;
import model.modelstock;
import model.modeluser;
import view.viewstock;

/**
 *
 * @author Tawang sahro winanto
 */
public class controllerstock{
    private modelstock ms;
    private viewstock vs;
    public controllerstock(viewstock vs) {
        
        this.vs = vs;     
    }
    
     public void clear(){
        vs.getId().setText("");
        vs.getType().setText("");
        vs.getStock().setText("");
        vs.getHarga().setText("");
    }
     public void simpan(){
        ms = new modelstock();
        ms.setType(vs.getType().getText());
        ms.setStock(Integer.parseInt(vs.getStock().getText()));
        ms.setHarga(Integer.parseInt(vs.getHarga().getText()));
        ms.SimpanData();
        clear();
      
    }
     
    public void Delete(){
        ms = new modelstock();
        ms.setId(Integer.parseInt(vs.getId().getText()));
        ms.HapusData();
        clear();
        

    }
     
     public void update(){
        ms = new modelstock();
        ms.setId(Integer.parseInt(vs.getId().getText()));
        ms.setType(vs.getType().getText());
        ms.setStock(Integer.parseInt(vs.getStock().getText()));
        ms.setHarga(Integer.parseInt(vs.getHarga().getText()));
        ms.update();
        clear();
    }
}
    

