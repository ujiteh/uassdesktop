/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import javax.swing.JOptionPane;
import model.modelLaporanpembelian;
import model.modelLogin;
import model.modeluser;
import mvc.utama;
import view.viewLogin;
import view.viewuser;


/**
 *
 * @author Tawang sahro winanto
 */
public class controlleruser {
   private modeluser ml;
    public viewuser vs;
    private static controlleruser single_instance = null;

    public controlleruser(viewuser vs) {
        this.ml = new modeluser();
//        ViewLogin VL = 
        this.vs =vs;
       
    }
    public static controlleruser getInstance(viewuser vs) {
        if (single_instance == null) {
            single_instance = new controlleruser(vs);
        }

        return single_instance;
    }

   

    public void clear() {
        vs.getId().setText("");
        vs.getUsername().setText("");
        vs.getPassword().setText("");
        vs.getHakakses().setText("");
    }
    
    public void daftar(){
        
        ml.setUsername(vs.getUsername().getText());
        ml.setPassword(vs.getPassword().getText());
        ml.setHakakses(vs.getHakakses().getText());

        
        ml.SimpanDataUser();
        //JOptionPane.showConfirmDialog(vP, "Nama Pelanggan : "+mP.getNamaPelangganModel()+"\n Nomor Hp :"+mP.getNomorHpModel()+"\n Jenis Kelamin : "+mP.getJenisKelaminModel()+"\n Umur : "+mP.getUmur()+"\n Alamat : "+mP.getAlamat());
        clear();
    }
    
    public void Update(){
        ml = new modeluser();
        ml.setIdu(vs.getId().getText());
        ml.setUsername(vs.getUsername().getText());
        ml.setPassword(vs.getPassword().getText());
        ml.setHakakses(vs.getHakakses().getText());
        ml.EditData();
        clear();
        
    }
    
    public void Delete(){
        ml = new modeluser();
        ml.setIdu(vs.getId().getText());
        ml.HapusData();
        clear();
    }

    public modeluser getml() {
        return ml;
    }

    public viewuser getvs() {
        return vs;
    }

}