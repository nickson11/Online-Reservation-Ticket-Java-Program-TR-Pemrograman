/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Theys Nickson Muay
 */
public final class FormDataPenerbangan extends javax.swing.JFrame {

    public String date;

    /**
     * Creates new form FormDataPenerbangan
     */
    public FormDataPenerbangan() {
        initComponents();
        load_tablepenerbangan();
        load_tableasal();
        load_tabletujuan();
        load_tablepesawat();
        tampil_combo();
        tampil_combotujuan();
        tampil_comboasal();
        setLocationRelativeTo(null);
    }

    public void tampil_comboasal() {
        {
            String sql = "select asal from info_asal";
            try {

                java.sql.Connection conn = (Connection) Koneksi.configDB();
                java.sql.Statement stm = conn.createStatement();
                java.sql.ResultSet res = stm.executeQuery(sql);
                while (res.next()) {
                    this.jComboasal.addItem(res.getString("asal"));

                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void tampil_combotujuan() {
        {
            String sql = "select tujuan from info_tujuan";
            try {

                java.sql.Connection conn = (Connection) Koneksi.configDB();
                java.sql.Statement stm = conn.createStatement();
                java.sql.ResultSet res = stm.executeQuery(sql);
                while (res.next()) {
                    this.jCombotujuan.addItem(res.getString("tujuan"));

                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void tampil_combo() {
        {
            String sql = "select id_pesawat from info_pesawat";
            try {

                java.sql.Connection conn = (Connection) Koneksi.configDB();
                java.sql.Statement stm = conn.createStatement();
                java.sql.ResultSet res = stm.executeQuery(sql);
                while (res.next()) {
                    this.jCombopesawat.addItem(res.getString("id_pesawat"));

                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void kosongpenerbangan() {
        idpenerbangan.setText("");
        jCombopesawat.setSelectedItem(null);
        jCombotujuan.setSelectedItem(null);
        jComboasal.setSelectedItem(null);
        jDate.getDate();
        textharga.setText(null);
    }
    
    private void kosongpesawat() {
        idpesawat2.setText("");
        textmodelpesawat.setText(null);
        textperusahaan.setText(null);
        textkursi.setText(null);
    }

    private void load_tableasal() {
        // membuat tampilan model tabel
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Asal");

        //menampilkan data database kedalam tabel
        try {
            String sql = "select * from info_asal";
            java.sql.Connection conn = (Connection) Koneksi.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                model.addRow(new Object[]{res.getString(1)});
            }
            Tableasal.setModel(model);
        } catch (Exception e) {
        }
    }

    private void load_tabletujuan() {
        // membuat tampilan model tabel
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Tujuan");

        //menampilkan data database kedalam tabel
        try {
            String sql = "select * from info_tujuan";
            java.sql.Connection conn = (Connection) Koneksi.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                model.addRow(new Object[]{res.getString(1)});
            }
            jTabletujuan.setModel(model);
        } catch (Exception e) {
        }
    }

    private void load_tablepenerbangan() {
        // membuat tampilan model tabel
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Id Penerbangan");
        model.addColumn("Id Pesawat");
        model.addColumn("Asal");
        model.addColumn("Tujuan");
        model.addColumn("Tgl Keberangkatan");
        model.addColumn("Harga");

        //menampilkan data database kedalam tabel
        try {
            int no = 1;
            String sql = "select * from info_penerbangan";
            java.sql.Connection conn = (Connection) Koneksi.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                model.addRow(new Object[]{no++, res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6)});
            }
            jTablepenerbangan.setModel(model);
        } catch (Exception e) {
        }
    }

    private void load_tablepesawat() {
        // membuat tampilan model tabel
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Id Pesawat");
        model.addColumn("Model Pesawat");
        model.addColumn("Perusahaan");
        model.addColumn("Kursi");

        //menampilkan data database kedalam tabel
        try {
            int no = 1;
            String sql = "select * from info_pesawat";
            java.sql.Connection conn = (Connection) Koneksi.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                model.addRow(new Object[]{no++, res.getString(1), res.getString(2), res.getString(3), res.getString(4)});
            }
            jTablepesawat.setModel(model);
        } catch (Exception e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        BTtambahAsal = new javax.swing.JButton();
        BThapusAsal = new javax.swing.JButton();
        textasal = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tableasal = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        BTtambahTujuan = new javax.swing.JButton();
        BThapusTujuan = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        texttujuan = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTabletujuan = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        idpenerbangan = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jCombotujuan = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jComboasal = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jDate = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        textharga = new javax.swing.JTextField();
        btnedit = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        jCombopesawat = new javax.swing.JComboBox<>();
        btnid = new javax.swing.JButton();
        btninput = new javax.swing.JToggleButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        idpesawat2 = new javax.swing.JLabel();
        btnid2 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        textmodelpesawat = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        textperusahaan = new javax.swing.JTextField();
        textkursi = new javax.swing.JTextField();
        btninputpesawat = new javax.swing.JButton();
        btninputedit = new javax.swing.JButton();
        btninputhapus = new javax.swing.JButton();
        btninputreset = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTablepesawat = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablepenerbangan = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Info Asal");

        BTtambahAsal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/IconAdd.png"))); // NOI18N
        BTtambahAsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTtambahAsalActionPerformed(evt);
            }
        });

        BThapusAsal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/IconRemove.png"))); // NOI18N
        BThapusAsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BThapusAsalActionPerformed(evt);
            }
        });

        textasal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textasalActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Input Asal");

        Tableasal.setModel(new javax.swing.table.DefaultTableModel(
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
        Tableasal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableasalMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Tableasal);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(BTtambahAsal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BThapusAsal)
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(textasal, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(110, 110, 110))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textasal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BThapusAsal)
                    .addComponent(BTtambahAsal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Info Tujuan");

        BTtambahTujuan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/IconAdd.png"))); // NOI18N
        BTtambahTujuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTtambahTujuanActionPerformed(evt);
            }
        });

        BThapusTujuan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/IconRemove.png"))); // NOI18N
        BThapusTujuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BThapusTujuanActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Input Tujuan");

        texttujuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texttujuanActionPerformed(evt);
            }
        });

        jTabletujuan.setModel(new javax.swing.table.DefaultTableModel(
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
        jTabletujuan.setMinimumSize(new java.awt.Dimension(15, 64));
        jTabletujuan.setPreferredSize(new java.awt.Dimension(75, 64));
        jTabletujuan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabletujuanMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTabletujuan);
        if (jTabletujuan.getColumnModel().getColumnCount() > 0) {
            jTabletujuan.getColumnModel().getColumn(1).setHeaderValue("Title 2");
            jTabletujuan.getColumnModel().getColumn(2).setHeaderValue("Title 3");
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(107, 107, 107))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel14))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(texttujuan, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(BTtambahTujuan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BThapusTujuan)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(texttujuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTtambahTujuan)
                    .addComponent(BThapusTujuan))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("ID Penerbangan");

        idpenerbangan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        idpenerbangan.setText("--------");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("ID Pesawat");

        jLabel8.setText("Tujuan ");

        jLabel9.setText("Asal");

        jLabel11.setText("Tanggal Keberangkatan");

        jLabel12.setText("Harga");

        btnedit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/IconEdit.png"))); // NOI18N
        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btnhapus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/IconRemove.png"))); // NOI18N
        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btnreset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnreset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/IconCancel.png"))); // NOI18N
        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        jCombopesawat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCombopesawatItemStateChanged(evt);
            }
        });

        btnid.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnid.setText("Tekan Disini");
        btnid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnidActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboasal, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCombotujuan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(idpenerbangan)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnid))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addComponent(jCombopesawat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btninput, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnhapus)
                            .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDate, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(textharga)))
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(idpenerbangan)
                        .addComponent(btnid))
                    .addComponent(btninput))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCombopesawat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnedit))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel8)
                        .addComponent(jCombotujuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboasal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnreset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(textharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("ID Pesawat");

        idpesawat2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        idpesawat2.setText("--------");

        btnid2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnid2.setText("Tekan Disini");
        btnid2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnid2ActionPerformed(evt);
            }
        });

        jLabel18.setText("Model Pesawat");

        textmodelpesawat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textmodelpesawatActionPerformed(evt);
            }
        });

        jLabel19.setText("Perusahaan");

        btninputpesawat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btninputpesawat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/IconAdd.png"))); // NOI18N
        btninputpesawat.setText("Input");
        btninputpesawat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninputpesawatActionPerformed(evt);
            }
        });

        btninputedit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btninputedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/IconEdit.png"))); // NOI18N
        btninputedit.setText("Edit");
        btninputedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninputeditActionPerformed(evt);
            }
        });

        btninputhapus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btninputhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/IconRemove.png"))); // NOI18N
        btninputhapus.setText("Hapus");
        btninputhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninputhapusActionPerformed(evt);
            }
        });

        btninputreset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btninputreset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/IconCancel.png"))); // NOI18N
        btninputreset.setText("Reset");
        btninputreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninputresetActionPerformed(evt);
            }
        });

        jLabel20.setText("Kursi");

        jTablepesawat.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablepesawat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablepesawatMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTablepesawat);

        jScrollPane5.setViewportView(jScrollPane4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(idpesawat2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnid2))
                            .addComponent(textmodelpesawat)
                            .addComponent(textperusahaan)
                            .addComponent(textkursi))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btninputedit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btninputhapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btninputreset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btninputpesawat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(117, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(idpesawat2)
                        .addComponent(btnid2))
                    .addComponent(btninputpesawat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(textmodelpesawat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btninputedit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(textperusahaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btninputhapus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textkursi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btninputreset)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Input Data Pesawat");

        jTablepenerbangan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTablepenerbangan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablepenerbanganMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablepenerbangan);

        jScrollPane8.setViewportView(jScrollPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane8))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addGap(202, 202, 202))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addGap(1, 1, 1)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(384, 384, 384))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Input Data Penerbangan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void texttujuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texttujuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texttujuanActionPerformed

    private void textmodelpesawatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textmodelpesawatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textmodelpesawatActionPerformed

    private void btnidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnidActionPerformed
        int penghitung;
        String nama = idpenerbangan.getText().toString().trim();

        Random idacak = new Random();
        for (penghitung = 0; penghitung <= 1; penghitung++);
        idpenerbangan.setText("T" + idacak.nextInt(100000));
    }

    private void jDatePropertyChange(java.beans.PropertyChangeEvent evt) {
        if (jDate.getDate() != null) {
            SimpleDateFormat format_jDate = new SimpleDateFormat("yyyy-MM-dd");
            date = format_jDate.format(jDate.getDate());
        }
    }//GEN-LAST:event_btnidActionPerformed

    private void btninputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninputActionPerformed
        try {
            String sql = "INSERT INTO info_penerbangan VALUES ('" + idpenerbangan.getText() + "','" + jCombopesawat.getSelectedItem() + "','" + jCombotujuan.getSelectedItem() + "','" + jComboasal.getSelectedItem() + "','" + date() + "','" + textharga.getText() + "')";
            java.sql.Connection conn = (Connection) Koneksi.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Penyimpanan Data Gagal " + e.getMessage());
        }
        load_tablepenerbangan();

    }//GEN-LAST:event_btninputActionPerformed

    private void jCombopesawatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCombopesawatItemStateChanged

    }//GEN-LAST:event_jCombopesawatItemStateChanged

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        try {
            String sql = "UPDATE info_penerbangan SET id_penerbangan = '" + idpenerbangan.getText() + "', id_pesawat = '" + jCombopesawat.getSelectedItem() + "', asal = '" + jComboasal.getSelectedItem() + "', tujuan = '" + jCombotujuan.getSelectedItem() + "', waktu_keberangkatan = '" + date() + "', harga = '" + textharga.getText() + "' WHERE id_penerbangan = '" + idpenerbangan.getText() + "'";
            java.sql.Connection conn = (Connection) Koneksi.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil di Edit !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Perubahan Data Gagal" + e.getMessage());
        }
        load_tablepenerbangan();
    }//GEN-LAST:event_btneditActionPerformed

    private void jTablepenerbanganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablepenerbanganMouseClicked
        int baris = jTablepenerbangan.rowAtPoint(evt.getPoint());
        String id = jTablepenerbangan.getValueAt(baris, 1).toString();
        idpenerbangan.setText(id);
        String pesawat = jTablepenerbangan.getValueAt(baris, 2).toString();
        jCombopesawat.setSelectedItem(pesawat);
        String asal = jTablepenerbangan.getValueAt(baris, 3).toString();
        jComboasal.setSelectedItem(asal);
        String tujuan = jTablepenerbangan.getValueAt(baris, 4).toString();
        jCombotujuan.setSelectedItem(tujuan);
        date = jTablepenerbangan.getValueAt(baris, 5).toString();
        date();
        String harga = jTablepenerbangan.getValueAt(baris, 6).toString();
        textharga.setText(harga);
    }//GEN-LAST:event_jTablepenerbanganMouseClicked

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        try {
            String sql = "delete from info_penerbangan where id_penerbangan='" + idpenerbangan.getText() + "'";
            java.sql.Connection conn = (Connection) Koneksi.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Data Pelanggan Berhasil Dihapus !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        load_tablepenerbangan();
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        kosongpenerbangan();
    }//GEN-LAST:event_btnresetActionPerformed

    private void BTtambahAsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTtambahAsalActionPerformed
      
        try {
            String sql = "INSERT INTO info_asal VALUES ('" + textasal.getText() + "')";
            
            java.sql.Connection conn = (Connection) Koneksi.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Penyimpanan Data Gagal " + e.getMessage());
        }
        
        new FormDataPenerbangan().setVisible(true);
        dispose();

    }//GEN-LAST:event_BTtambahAsalActionPerformed

    private void BThapusAsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BThapusAsalActionPerformed
        try {
            String sql = "delete from info_asal where asal='" + textasal.getText() + "'";
            java.sql.Connection conn = (Connection) Koneksi.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        new FormDataPenerbangan().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_BThapusAsalActionPerformed

    private void btnid2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnid2ActionPerformed
        int penghitung;
        String nama = idpesawat2.getText().toString().trim();

        Random idacak = new Random();
        for (penghitung = 0; penghitung <= 1; penghitung++);
        idpesawat2.setText("P" + idacak.nextInt(100000));
    }//GEN-LAST:event_btnid2ActionPerformed

    private void btninputpesawatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninputpesawatActionPerformed
            try {
            String sql = "INSERT INTO info_pesawat VALUES ('" + idpesawat2.getText() + "','" + textmodelpesawat.getText() + "','" + textperusahaan.getText() + "','" + textkursi.getText()+ "')";
            java.sql.Connection conn = (Connection) Koneksi.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Penyimpanan Data Gagal " + e.getMessage());
        }
        new FormDataPenerbangan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btninputpesawatActionPerformed

    private void btninputeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninputeditActionPerformed
      try {
            String sql = "UPDATE info_pesawat SET id_pesawat = '" + idpesawat2.getText() + "', model_pesawat = '" + textmodelpesawat.getText() + "', perusahaan = '" + textperusahaan.getText() + "', kursi = '" + textkursi.getText()+ "' WHERE id_pesawat = '" + idpesawat2.getText() + "'";
            java.sql.Connection conn = (Connection) Koneksi.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil di Edit !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Perubahan Data Gagal" + e.getMessage());
        }
        new FormDataPenerbangan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btninputeditActionPerformed

    private void jTablepesawatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablepesawatMouseClicked
        int baris = jTablepesawat.rowAtPoint(evt.getPoint());
        String id = jTablepesawat.getValueAt(baris, 1).toString();
        idpesawat2.setText(id);
        String model = jTablepesawat.getValueAt(baris, 2).toString();
        textmodelpesawat.setText(model);
        String perusahaan = jTablepesawat.getValueAt(baris, 3).toString();
        textperusahaan.setText(perusahaan);
        String kursi = jTablepesawat.getValueAt(baris, 4).toString();
        textkursi.setText(kursi);
        
    }//GEN-LAST:event_jTablepesawatMouseClicked

    private void btninputhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninputhapusActionPerformed
       try {
            String sql = "delete from info_pesawat where id_pesawat='" + idpesawat2.getText() + "'";
            java.sql.Connection conn = (Connection) Koneksi.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Data Pesawat Berhasil Dihapus !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        new FormDataPenerbangan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btninputhapusActionPerformed

    private void btninputresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninputresetActionPerformed
        kosongpesawat();
    }//GEN-LAST:event_btninputresetActionPerformed

    private void jTabletujuanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabletujuanMouseClicked
    int baris = jTabletujuan.rowAtPoint(evt.getPoint());
        String id = jTabletujuan.getValueAt(baris, 0).toString();
        texttujuan.setText(id);
    }//GEN-LAST:event_jTabletujuanMouseClicked

    private void textasalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textasalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textasalActionPerformed

    private void TableasalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableasalMouseClicked
        int baris = Tableasal.rowAtPoint(evt.getPoint());
        String id = Tableasal.getValueAt(baris, 0).toString();
        textasal.setText(id);
        
        
    
    }//GEN-LAST:event_TableasalMouseClicked

    private void BTtambahTujuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTtambahTujuanActionPerformed
        try {
            String sql = "INSERT INTO info_tujuan VALUES ('" + texttujuan.getText() + "')";
            
            java.sql.Connection conn = (Connection) Koneksi.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Penyimpanan Data Gagal " + e.getMessage());
        }
        
        new FormDataPenerbangan().setVisible(true);
        dispose();
    }//GEN-LAST:event_BTtambahTujuanActionPerformed

    private void BThapusTujuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BThapusTujuanActionPerformed
      try {
            String sql = "delete from info_tujuan where tujuan='" + texttujuan.getText() + "'";
            java.sql.Connection conn = (Connection) Koneksi.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        new FormDataPenerbangan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BThapusTujuanActionPerformed

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
            java.util.logging.Logger.getLogger(FormDataPenerbangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDataPenerbangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDataPenerbangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDataPenerbangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDataPenerbangan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BThapusAsal;
    private javax.swing.JButton BThapusTujuan;
    private javax.swing.JButton BTtambahAsal;
    private javax.swing.JButton BTtambahTujuan;
    private javax.swing.JTable Tableasal;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnid;
    private javax.swing.JButton btnid2;
    private javax.swing.JToggleButton btninput;
    private javax.swing.JButton btninputedit;
    private javax.swing.JButton btninputhapus;
    private javax.swing.JButton btninputpesawat;
    private javax.swing.JButton btninputreset;
    private javax.swing.JButton btnreset;
    private javax.swing.JLabel idpenerbangan;
    private javax.swing.JLabel idpesawat2;
    private javax.swing.JComboBox<String> jComboasal;
    private javax.swing.JComboBox<String> jCombopesawat;
    private javax.swing.JComboBox<String> jCombotujuan;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable jTablepenerbangan;
    private javax.swing.JTable jTablepesawat;
    private javax.swing.JTable jTabletujuan;
    private javax.swing.JTextField textasal;
    private javax.swing.JTextField textharga;
    private javax.swing.JTextField textkursi;
    private javax.swing.JTextField textmodelpesawat;
    private javax.swing.JTextField textperusahaan;
    private javax.swing.JTextField texttujuan;
    // End of variables declaration//GEN-END:variables
}
