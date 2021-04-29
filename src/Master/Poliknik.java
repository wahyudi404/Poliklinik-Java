/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Master;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.io.File;
import java.util.HashMap;

/**
 *
 * @author COMPUTER
 */
public class Poliknik extends javax.swing.JFrame {

    /**
     * Creates new form Poliknik
     */
    public Poliknik() {
        initComponents();
        tabel.setModel(tblModel);
        Tabel(tabel, new int[]{154,250});
        setDefaultTable();
        kode_poli.setEnabled(false);
        nama_poli.setEnabled(false);
        tambah.setEnabled(true);
        simpan.setEnabled(false);
        ubah.setEnabled(false);
        hapus.setEnabled(false);
        keluar.setEnabled(true);
        batal.setEnabled(false);
        this.setSize(1070,700);

    }

    public void setDefaultTable(){
        String hubung = "jdbc:mysql://localhost:3306/poliklinik";
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection kon = DriverManager.getConnection(hubung,"root","");
            Statement stt = kon.createStatement();
            String SQL = "Select * from poliknik";
            ResultSet res = stt.executeQuery(SQL);
            while(res.next()) {
                data[0] = res.getString(1);
                data[1] = res.getString(2);
                tblModel.addRow(data);
            }
            res.close();
            stt.close();
            kon.close();
        }catch(Exception exc) {
            System.err.println(exc.getMessage());
        }
    }
    
    private javax.swing.table.DefaultTableModel tblModel = getDefaultTabelModel();
    private void Tabel(javax.swing.JTable tb,int lebar[]) {
        tb.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        int kolom = tb.getColumnCount();
        for(int i=0;i<kolom;i++) {
            javax.swing.table.TableColumn tbc = tb.getColumnModel().getColumn(i);
            tbc.setPreferredWidth(lebar[i]);
            tb.setRowHeight(20);
        }
    }
    
    private javax.swing.table.DefaultTableModel getDefaultTabelModel() {
        return new javax.swing.table.DefaultTableModel(
        new Object [][]{},
                new String []{"Kode Poliklinik","Nama Poliklinik"}
        ){
            boolean[] canEdit = new boolean []{
                false,false
            };
            public boolean isCellEditable(int rowIndex,int columnIndex){
                return canEdit[columnIndex];  
            }
        };
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        kode_poli = new javax.swing.JTextField();
        nama_poli = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        pencarian = new javax.swing.JTextField();
        cari = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tambah = new javax.swing.JButton();
        simpan = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        ubah = new javax.swing.JButton();
        batal = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        cetak = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jButton6.setText("jButton6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rohmat.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel2.setText("Detail Poliklinik");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel3.setText("Data Poliklinik");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inputan Data Poliklinik", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 11))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Kode Poliklinik");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Nama Poliklinik");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nama_poli, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kode_poli, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(kode_poli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nama_poli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel6.setText("Daftar Data Poliklinik");

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Kode Poli", "Nama Poli"
            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        cari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cari.png"))); // NOI18N
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel7.setText("Masukan Nama Poliklinik");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Action", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 11))); // NOI18N

        tambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Tambah.png"))); // NOI18N
        tambah.setText("Tambah");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Simpan.png"))); // NOI18N
        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hapus.png"))); // NOI18N
        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        ubah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ubah.png"))); // NOI18N
        ubah.setText("Ubah");
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });

        batal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Batal.png"))); // NOI18N
        batal.setText("Batal");
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });

        keluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Keluar.png"))); // NOI18N
        keluar.setText("Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tambah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(simpan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ubah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(batal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(keluar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(tambah)
                .addComponent(simpan)
                .addComponent(hapus)
                .addComponent(ubah)
                .addComponent(batal)
                .addComponent(keluar))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Laporan Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 11))); // NOI18N

        cetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cetak.png"))); // NOI18N
        cetak.setText("Laporan");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cetak)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cetak)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(406, 406, 406)
                        .addComponent(jLabel3)
                        .addGap(187, 187, 187)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(180, 180, 180))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(159, 159, 159)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(202, 202, 202)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pencarian, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cari, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String data[] = new String[2];
    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        tambah();

    }//GEN-LAST:event_tambahActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        // TODO add your handling code here:
        tabel_tampil();
        if(evt.getClickCount()==1){
            Tampil();
            tambah.setEnabled(false);
            simpan.setEnabled(false);
            ubah.setEnabled(true);
            hapus.setEnabled(true);
            keluar.setEnabled(true);
            kode_poli.setEnabled(true);
            nama_poli.setEnabled(true);
        }

    }//GEN-LAST:event_tabelMouseClicked

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        String kd=kode_poli.getText();
        String nm=nama_poli.getText();       
        if((kd.isEmpty())|(nm.isEmpty())){
            JOptionPane .showMessageDialog(null,"Masih Ada nilai yang kosong,silahkan dilengkapi!");
            nama_poli.requestFocus();
        }
            else{
                Object[]options = {"YA","TIDAK"};
             int Konfirmasi=JOptionPane.showOptionDialog(null,"Apakah Anda Yakin Ingin Menyimpan Data??","Konfirmasi",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
             
        if(Konfirmasi==JOptionPane.YES_OPTION){
        try {
            String hubung = "jdbc:mysql://localhost:3306/poliklinik";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection kon = DriverManager.getConnection(hubung,"root","");
            Statement stt = kon.createStatement();
            String SQL = "insert into poliknik values('"+kode_poli.getText()+"','"+nama_poli.getText()+"')";
            stt.executeUpdate(SQL);
            data[0] = kode_poli.getText();
            data[1] = nama_poli.getText();
            tblModel.insertRow(0, data);
            
            kode_poli.setText("");
            nama_poli.setText("");
            
            stt.close();
            kon.close();
        }catch(Exception exc){
            System.err.println(exc.getMessage());
            }

            kode_poli.setEnabled(false);
            nama_poli.setEnabled(false);

            simpan.setEnabled(false);
            batal.setEnabled(false);
            ubah.setEnabled(false);
            hapus.setEnabled(false);
            tambah.setEnabled(true);
            keluar.setEnabled(true);
            }
        }
    }//GEN-LAST:event_simpanActionPerformed

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        // TODO add your handling code here:
        ubah();
    }//GEN-LAST:event_ubahActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        Object[]options = {"YA","TIDAK"};
             int konfirmasi=JOptionPane.showOptionDialog(null,"Apakah Anda Yakin Ingin Keluar?","Konfirmasi",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
        if(konfirmasi==JOptionPane.YES_OPTION){
            dispose();
        }   

    }//GEN-LAST:event_keluarActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        hapus();
    }//GEN-LAST:event_hapusActionPerformed

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
        // TODO add your handling code here:
        batal();
    }//GEN-LAST:event_batalActionPerformed

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        // TODO add your handling code here:
            try{
            String hubung ="jdbc:mysql://localhost:3306/poliklinik";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection kon = DriverManager.getConnection(hubung,"root","");
            String cari = pencarian.getText();
            Statement stt = kon.createStatement();
            String sql ="Select * from poliknik where NamaPoli like '"+cari+"'";
            ResultSet rs= stt.executeQuery(sql);
            if(rs.next()){
                kode_poli.setText(rs.getString(1));
                nama_poli.setText(rs.getString(2));
                kode_poli.setEnabled(false);
                nama_poli.setEnabled(true);          
            }
            else{
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan");   
            }
            stt.close();
            kon.close();      
        }
        catch(Exception e){
            System.out.println("ERROR."+e);
        }
            pencarian.setText("");
            tambah.setEnabled(false);
            simpan.setEnabled(false);
            batal.setEnabled(true);
            ubah.setEnabled(true);
            hapus.setEnabled(true);
            keluar.setEnabled(true);            
    }//GEN-LAST:event_cariActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Poliknik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Poliknik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Poliknik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Poliknik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        try {
       UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");

        SwingUtilities.updateComponentTreeUI(new Poliknik());
        } catch (Exception e){
 
    }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Poliknik().setVisible(true);
            }
        });
    }
    
    int row = 0;
    public void Tampil(){
        row = tabel.getSelectedRow();
        kode_poli.setText(tblModel.getValueAt(row,0).toString());
        nama_poli.setText(tblModel.getValueAt(row,1).toString());
    }

    public void tabel_tampil() {
                tambah.setEnabled(false);
                simpan.setEnabled(false);
                hapus.setEnabled(true);
                ubah.setEnabled(true);
                batal.setEnabled(true);
                kode_poli.setEnabled(false);
                nama_poli.setEnabled(true);
    }
    
    public void tambah(){
    kode_poli.setText("");
    kode_poli.setEnabled(true);
    nama_poli.setText("");
    nama_poli.setEnabled(true);
    tambah.setEnabled(false);
    hapus.setEnabled(false);
    simpan.setEnabled(true);
    ubah.setEnabled(false);
    keluar.setEnabled(true);
    batal.setEnabled(true);
    tabel.setEnabled(true);
    kode_poli.requestFocus();
    }
    



    public void batal() {
            kode_poli.setEnabled(false);
            nama_poli.setEnabled(false);
            
            kode_poli.setText("");
            nama_poli.setText("");
            
            tambah.setEnabled(true);
            simpan.setEnabled(false);
            hapus.setEnabled(false);
            ubah.setEnabled(false);
            batal.setEnabled(false);
        }

    public void hapus(){
        Object[]options = {"YA","TIDAK"};
             int konfirmasi=JOptionPane.showOptionDialog(null,"Apakah Anda Yakin Ingin Hapus Data?","Konfirmasi",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
        if(konfirmasi==JOptionPane.YES_OPTION){
        try {
            String hubung = "jdbc:mysql://localhost:3306/poliklinik";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection kon = DriverManager.getConnection(hubung,"root","");
            Statement stt = kon.createStatement();
            String SQL = "delete from poliknik where KodePoli='"+kode_poli.getText()+"'";
            stt.executeUpdate(SQL);
            tblModel.removeRow(row);
            data[0] = kode_poli.getText();
            data[1] = nama_poli.getText();       
            
            kode_poli.setText("");
            nama_poli.setText("");
            
            stt.close();
            kon.close();
        }catch(Exception exc) {
            System.err.println(exc.getMessage());
        }
        kode_poli.setText("");
        nama_poli.setText("");
        kode_poli.setEnabled(false);
        nama_poli.setEnabled(false);
        simpan.setEnabled(false);
        ubah.setEnabled(false);
        hapus.setEnabled(false);
        tambah.setEnabled(true);
        keluar.setEnabled(true);      
    }
    }

    public void ubah(){
        Object[]options = {"YA","TIDAK"};
             int konfirmasi=JOptionPane.showOptionDialog(null,"Apakah Anda Yakin Ingin Ubah Data?","Konfirmasi",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
        if(konfirmasi==JOptionPane.YES_OPTION){
        try{
            String hubung = "jdbc:mysql://localhost:3306/poliklinik";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection kon = DriverManager.getConnection(hubung,"root","");
            Statement stt = kon.createStatement();
            String SQL = "update poliknik set NamaPoli = '"+nama_poli.getText()+"' where KodePoli = '"+kode_poli.getText()+"'";
            stt.executeUpdate(SQL);
            data[0] = kode_poli.getText();
            data[1] = nama_poli.getText();
            tblModel.removeRow(row);
            tblModel.insertRow(row, data);
            
            kode_poli.setText("");
            nama_poli.setText("");
        simpan.setEnabled(false);
            
            stt.close();
            kon.close();
        }catch(Exception exc){
            System.err.println(exc.getMessage());
        }
        kode_poli.setText("");
        nama_poli.setText("");
        kode_poli.setEnabled(false);
        nama_poli.setEnabled(false);
        simpan.setEnabled(false);
        ubah.setEnabled(false);
        hapus.setEnabled(false);
        tambah.setEnabled(true);
        keluar.setEnabled(true);
    }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batal;
    private javax.swing.JToggleButton cari;
    private javax.swing.JButton cetak;
    private javax.swing.JButton hapus;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton keluar;
    private javax.swing.JTextField kode_poli;
    private javax.swing.JTextField nama_poli;
    private javax.swing.JTextField pencarian;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tabel;
    private javax.swing.JButton tambah;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables
}
