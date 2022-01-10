/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.modelstock;
import view.viewstock;

/**
 *
 * @author Tawang sahro winanto
 */
public class controllerstock{
    private modelstock ms;
    private viewstock vs;
    public controllerstock(viewstock vs) {
        
        this.vs = vs;     }
    
    
     
     public void update(){
        ms = new modelstock();
        ms.setidt(Integer.parseInt(vs.getId().getText()));
        ms.settype(vs.getType().getText());
        ms.setStock(vs.getStock().getText());
        ms.setharga(vs.getHarga().getText());

        ms.update();

    }
}
    

