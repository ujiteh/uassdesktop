/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.controllerlLaporanpembelian;
import controller.controllerLaporanpenjualan;
import database.KoneksiDatabase;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tawang sahro winanto
 */
public class viewLaporanpenjualan extends javax.swing.JInternalFrame {

    /**
     * Creates new form viewLaporanpembelian
     */
    private controllerLaporanpenjualan cj;
    private DefaultTableModel tabel;
    private String sql = "";
    public viewLaporanpenjualan() {
        initComponents();
        tabel = new DefaultTableModel();
        cj  = new controllerLaporanpenjualan(this);
        barangTB.setModel(tabel);
        tabel.addColumn("Id Transaksi");
        tabel.addColumn("Nama Pembeli");
        tabel.addColumn("Type");
        tabel.addColumn("Banyak");
        tabel.addColumn("Harga Total");
        tabel.addColumn("Bayar");
        tabel.addColumn("Tanggal");
        tampilPenjualan(title);
    }

    public JTextField getBayar() {
        return bayar;
    }

    public JTextField getBanyak() {
        return banyak;
    }

    public void setBanyak(JTextField banyak) {
        this.banyak = banyak;
    }

    public JTextField getNamapembeli() {
        return namapembeli;
    }

    public void setNamapembeli(JTextField namapembeli) {
        this.namapembeli = namapembeli;
    }

    
    public void setBayar(JTextField bayar) {
        this.bayar = bayar;
    }

    public JTextField getCaribarangTF() {
        return caribarangTF;
    }

    public void setCaribarangTF(JTextField caribarangTF) {
        this.caribarangTF = caribarangTF;
    }

    public JTextField getHargasatuan() {
        return banyak;
    }

    public void setHargasatuan(JTextField hargasatuan) {
        this.banyak = hargasatuan;
    }

    public JTextField getHargatotal() {
        return hargatotal;
    }

    public void setHargatotal(JTextField hargatotal) {
        this.hargatotal = hargatotal;
    }

    public JTextField getId() {
        return id;
    }

    public void setId(JTextField id) {
        this.id = id;
    }

    public JTextField getJumlah() {
        return type;
    }

    public void setJumlah(JTextField jumlah) {
        this.type = jumlah;
    }

    public JTextField getType() {
        return type;
    }

    public void setType(JTextField type) {
        this.type = type;
    }

    

    
    
    
    private void tampilPenjualan(String data){
        tabel.getDataVector().removeAllElements();
        tabel.fireTableDataChanged();
        
        if(data.equals("")){
            sql = "SELECT * FROM transaksi";
        }
        else  {
            sql = "SELECT * FROM transaksi WHERE namapembeli LIKE '"+data+"%' ";
            
        }
        
        try {
            Statement stat = (Statement)KoneksiDatabase.getKoneksi().createStatement();
            ResultSet res = stat.executeQuery(sql);
            
            while (res.next()){
                Object[] hasil;
                hasil = new Object[7];
                
                hasil[0] = res.getString("idt");
                hasil[1] = res.getString("namapembeli");
                hasil[2] = res.getString("type");
                hasil[3] = res.getString("banyak");
                hasil[4] = res.getString("hargatotal");
                hasil[5] = res.getString("bayar");
                hasil[6] = res.getString("tanggaltransaksi");
                
                
                tabel.addRow(hasil);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(viewLaporanpenjualan.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
    }
    private void AmbilDataTabel(){
        int index = barangTB.getSelectedRow();
        String idtb = String.valueOf(barangTB.getValueAt(index, 0));
        String namapembelitb = String.valueOf(barangTB.getValueAt(index, 1));
        String typetb = String.valueOf(barangTB.getValueAt(index, 2));
        String banyaktb = String.valueOf(barangTB.getValueAt(index, 3));
        String hargatotaltb = String.valueOf(barangTB.getValueAt(index, 4));
        String banyartb = String.valueOf(barangTB.getValueAt(index, 5));
        

        
        id.setText(idtb);
        namapembeli.setText(namapembelitb);
        type.setText(typetb);
        banyak.setText(banyaktb);
        hargatotal.setText(hargatotaltb);
        bayar.setText(banyartb);

        
        
        //CB.kontroldua();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        caribarangTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        barangTB = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        namapembeli = new javax.swing.JTextField();
        type = new javax.swing.JTextField();
        banyak = new javax.swing.JTextField();
        hargatotal = new javax.swing.JTextField();
        edit = new javax.swing.JToggleButton();
        hapus = new javax.swing.JButton();
        bayar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Laporan penjualan");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Cari Nama");

        caribarangTF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        caribarangTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caribarangTFActionPerformed(evt);
            }
        });
        caribarangTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                caribarangTFKeyPressed(evt);
            }
        });

        barangTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        barangTB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                barangTBMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(barangTB);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Id transaksi");

        jLabel4.setText("Nama pembeli");

        jLabel5.setText("Type");

        jLabel6.setText("Banyak");

        jLabel7.setText("Harga total");

        id.setEnabled(false);
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        jLabel8.setText("Bayar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                                .addComponent(hapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edit))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(bayar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namapembeli)
                            .addComponent(hargatotal)
                            .addComponent(banyak)
                            .addComponent(type)
                            .addComponent(id))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(namapembeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(banyak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(hargatotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hapus)
                    .addComponent(edit))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(caribarangTF, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(5, 5, 5)
                        .addComponent(caribarangTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void caribarangTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caribarangTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caribarangTFActionPerformed

    private void caribarangTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caribarangTFKeyPressed
        // TODO add your handling code here:
        tampilPenjualan(caribarangTF.getText());

    }//GEN-LAST:event_caribarangTFKeyPressed

    private void barangTBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barangTBMouseClicked
        // TODO add your handling code here:
        AmbilDataTabel();

    }//GEN-LAST:event_barangTBMouseClicked

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        cj.Update();
        tampilPenjualan(title);
    }//GEN-LAST:event_editActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        cj.Delete();
        tampilPenjualan(title);
    }//GEN-LAST:event_hapusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField banyak;
    private javax.swing.JTable barangTB;
    private javax.swing.JTextField bayar;
    private javax.swing.JTextField caribarangTF;
    private javax.swing.JToggleButton edit;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField hargatotal;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField namapembeli;
    private javax.swing.JTextField type;
    // End of variables declaration//GEN-END:variables
}
