/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Theys Nickson Muay
 */
public class FormTambahAdmin extends javax.swing.JFrame {
    
    public String date;

    /**
     * Creates new form FormTambahAdmin
     */
    public FormTambahAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
        kosong();
        load_table();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textnama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textalamat = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textkota = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        textemail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        textnotelp = new javax.swing.JTextField();
        btninput = new javax.swing.JToggleButton();
        btnbersihkan = new javax.swing.JToggleButton();
        jCombo = new javax.swing.JComboBox<>();
        btnid = new javax.swing.JToggleButton();
        idadmin = new javax.swing.JLabel();
        jDate = new com.toedter.calendar.JDateChooser();
        btnedit = new javax.swing.JToggleButton();
        btnhapus = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        textpassword = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        textusername = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Id Admin");

        jLabel4.setText("Nama");

        jLabel5.setText("Alamat");

        textalamat.setColumns(20);
        textalamat.setRows(5);
        jScrollPane1.setViewportView(textalamat);

        jLabel6.setText("Jenis Kelamin");

        jLabel7.setText("Tanggal Lahir");

        jLabel8.setText("Kota");

        jLabel9.setText("E-mail");

        jLabel10.setText("No. Telp / HP");

        textnotelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textnotelpActionPerformed(evt);
            }
        });

        btninput.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btninput.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/IconAdd.png"))); // NOI18N
        btninput.setText("Input");
        btninput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninputActionPerformed(evt);
            }
        });

        btnbersihkan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnbersihkan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/IconRemove.png"))); // NOI18N
        btnbersihkan.setText("Reset");
        btnbersihkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbersihkanActionPerformed(evt);
            }
        });

        jCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Laki-laki", "Perempuan" }));

        btnid.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnid.setText("Tekan Disini");
        btnid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnidActionPerformed(evt);
            }
        });

        idadmin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        idadmin.setText("--------");

        jDate.setDateFormatString("yyyy-MM-dd");
        jDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDatePropertyChange(evt);
            }
        });

        btnedit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/IconEdit.png"))); // NOI18N
        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btnhapus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/IconCancel.png"))); // NOI18N
        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        jLabel3.setText("Password");

        textpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textpasswordActionPerformed(evt);
            }
        });

        jLabel11.setText("Username");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(idadmin)
                                                .addGap(10, 10, 10)
                                                .addComponent(btnid))
                                            .addComponent(textnama)
                                            .addComponent(textpassword)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                            .addComponent(textusername))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnhapus)
                                            .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btninput, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnbersihkan)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(textemail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                        .addComponent(jDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textkota, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textnotelp, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnid)
                    .addComponent(idadmin, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btninput))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(textusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(textpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnhapus)
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(btnbersihkan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textkota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textnotelp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textemail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Tambah Admin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel1)
                        .addGap(0, 209, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void kosong() {
        idadmin.setText("");
        textnama.setText(null);
        textusername.setText(null);
        textpassword.setText(null);
        textalamat.setText(null);
        jCombo.setSelectedItem(this);
        jDate.getDate();
        textkota.setText(null);
        textemail.setText(null);
        textnotelp.setText(null);
    }

    private void textnotelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textnotelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textnotelpActionPerformed

    private void btninputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninputActionPerformed
        try {
            String sql = "INSERT INTO info_admin VALUES ('" + idadmin.getText() + "','" + textnama.getText() + "','" + textusername.getText() + "','" + textpassword.getText() + "','" + textalamat.getText() + "','" + jCombo.getSelectedItem() + "','" + date + "','" + textkota.getText() + "','" + textemail.getText() + "','" + textnotelp.getText() + "')";
            java.sql.Connection conn = (Connection) Koneksi.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        load_table();
        kosong();
    }//GEN-LAST:event_btninputActionPerformed
    private void load_table() {
        // membuat tampilan model tabel
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Id");
        model.addColumn("Nama");
        model.addColumn("Username");
        model.addColumn("Password");
        model.addColumn("Alamat");
        model.addColumn("Jenis Kelamin");
        model.addColumn("Tanggal Lahir");
        model.addColumn("E-Mail");
        model.addColumn("No. Hp");
        model.addColumn("Kota");

        //menampilkan data database kedalam tabel
        try {
            int no = 1;
            String sql = "select * from info_admin";
            java.sql.Connection conn = (Connection) Koneksi.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                model.addRow(new Object[]{no++, res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10)});
            }
            jTable1.setModel(model);
        } catch (Exception e) {
        }
    }
    private void btnbersihkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbersihkanActionPerformed
        kosong();
    }//GEN-LAST:event_btnbersihkanActionPerformed

    private void btnidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnidActionPerformed
        int penghitung;
        String nama = idadmin.getText().toString().trim();
        
        Random idacak = new Random();
        for (penghitung = 0; penghitung <= 1; penghitung++);
        idadmin.setText("A" + idacak.nextInt(100000));
    }//GEN-LAST:event_btnidActionPerformed

    private void jDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDatePropertyChange
        if (jDate.getDate() != null) {
            SimpleDateFormat format_jDate = new SimpleDateFormat("yyyy-MM-dd");
            date = format_jDate.format(jDate.getDate());
        }
    }//GEN-LAST:event_jDatePropertyChange

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        try {
            String sql = "UPDATE info_admin SET id_admin = '" + idadmin.getText() + "', nama = '" + textnama.getText() + "', username = '" + textusername.getText() + "',password = '" + textpassword.getText() + "', alamat = '" + textalamat.getText() + "', jenis_kelamin = '" + jCombo.getSelectedItem() + "',tanggal_lahir= '" + date + "',kota= '" + textkota.getText() + "',email= '" + textemail.getText() + "',no_hp= '" + textnotelp.getText() + "' WHERE id_admin = '" + idadmin.getText() + "'";
            java.sql.Connection conn = (Connection) Koneksi.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil di Edit !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Perubahan Data Gagal" + e.getMessage());
        }
        load_table();
        kosong();

    }//GEN-LAST:event_btneditActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        try {
            String sql = "delete from info_admin where id_admin='" + idadmin.getText() + "'";
            java.sql.Connection conn = (Connection) Koneksi.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Data Pelanggan Berhasil Dihapus !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        load_table();
        kosong();

    }//GEN-LAST:event_btnhapusActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int baris = jTable1.rowAtPoint(evt.getPoint());
        String id = jTable1.getValueAt(baris, 1).toString();
        idadmin.setText(id);
        String nama = jTable1.getValueAt(baris, 2).toString();
        textnama.setText(nama);
        String username = jTable1.getValueAt(baris, 3).toString();
        textusername.setText(username);
        String password = jTable1.getValueAt(baris, 4).toString();
        textpassword.setText(password);
        String alamat = jTable1.getValueAt(baris, 5).toString();
        textalamat.setText(alamat);
        String jcombo = jTable1.getValueAt(baris, 6).toString();
        jCombo.setSelectedItem(jcombo);
        date = jTable1.getValueAt(baris, 7).toString();
        date();
        String kota = jTable1.getValueAt(baris, 8).toString();
        textkota.setText(kota);
        String email = jTable1.getValueAt(baris, 9).toString();
        textemail.setText(email);
        String notelp = jTable1.getValueAt(baris, 10).toString();
        textnotelp.setText(notelp);

    }//GEN-LAST:event_jTable1MouseClicked

    private void textpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textpasswordActionPerformed

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
            java.util.logging.Logger.getLogger(FormTambahAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTambahAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTambahAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTambahAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTambahAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnbersihkan;
    private javax.swing.JToggleButton btnedit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JToggleButton btnid;
    private javax.swing.JToggleButton btninput;
    private javax.swing.JLabel idadmin;
    private javax.swing.JComboBox<String> jCombo;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea textalamat;
    private javax.swing.JTextField textemail;
    private javax.swing.JTextField textkota;
    private javax.swing.JTextField textnama;
    private javax.swing.JTextField textnotelp;
    private javax.swing.JTextField textpassword;
    private javax.swing.JTextField textusername;
    // End of variables declaration//GEN-END:variables

}
