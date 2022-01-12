/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import javax.swing.JOptionPane;
import model.modelLogin;
import mvc.utama;
import view.viewLogin;


/**
 *
 * @author Tawang sahro winanto
 */
public class controllerLogin {
   private modelLogin ml;
    public viewLogin vl;
    private static controllerLogin single_instance = null;

    public controllerLogin(viewLogin vl) {
        this.ml = new modelLogin();
//        ViewLogin VL = 
        this.vl =vl;
       
    }
    public static controllerLogin getInstance(viewLogin vl) {
        if (single_instance == null) {
            single_instance = new controllerLogin(vl);
        }

        return single_instance;
    }

    public void Login() {
       modelLogin nml=ml.login(vl.getUsername().getText(), vl.getPassword().getText()) ;
        if (nml== null) {
            JOptionPane.showMessageDialog(null, "data login tidak ditemukan");
        } else {
            vl.setVisible(false);
            this.ml=nml;
            utama ut = new utama();
       ut.setVisible(true);
        }
    }

    public void clear() {
        vl.getUsername().setText("");
        vl.getPassword().setText("");
    }
    
   

    public modelLogin getmL() {
        return ml;
    }

    public viewLogin getvL() {
        return vl;
    }

}