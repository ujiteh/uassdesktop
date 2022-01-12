/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import controller.controllerLogin;
import view.viewLogin;



/**
 *
 * @author Acer
 */
public class Java_mvc_unsika {
static controllerLogin cl;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //viewPelanggan vP = new viewPelanggan();
        //vP.setVisible(true);
      //utama utama1 = new utama();
      //utama1.setVisible(true);
      viewLogin vl = new viewLogin();
        cl=controllerLogin.getInstance(vl);
        cl.getvL().setVisible(true);

    }
    
}
