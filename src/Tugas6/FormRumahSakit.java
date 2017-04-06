package Tugas6;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GinoFavianLeonardo
 */
public class FormRumahSakit extends javax.swing.JFrame {

    /**
     * Creates new form FormRumahSakit
     */
    public FormRumahSakit() {
        initComponents();
    }
    
    private DefaultTableModel model;
    private Connection con = koneksi.getConnection();
    private Statement stt;
    private ResultSet rss;
    
     private void InitTable(){
        model = new DefaultTableModel();
//        model.addColumn("ID");
        model.addColumn("Nama");
        model.addColumn("Tanggal Lahir");
        model.addColumn("Usia");
        model.addColumn("Jenis Kelamin");
        model.addColumn("Dokter");
        model.addColumn("Ruangan");
        model.addColumn("Tanggal Masuk");
        model.addColumn("Diagnosa");
        
        jTable1.setModel(model);
    }
     
     private void TampilData(){
        try{
    String sql = "Select * FROM rumahsakit";
    stt = con.createStatement();
    rss = stt.executeQuery(sql);
    while(rss.next()){
        Object[] o = new Object[8];
        o[0] = rss.getString("nama_pasien");
        o[1] = rss.getString("tl");
        o[2] = rss.getString("usia");
        o[3] = rss.getString("jk");
        o[4] = rss.getString("dokter");
        o[5] = rss.getString("ruangan");
        o[6] = rss.getString("tgl_masuk");
        o[7] = rss.getString("diagnosa");
        model.addRow(o);
        }
    }catch(SQLException e){
        System.out.println(e.getMessage());
    }
}

     private void TambahData(String nama_pasien, String tl, String usia, String jk, String dokter, String ruangan, String tgl_masuk, String diagnosa){
        try{
            String sql =
                    "INSERT INTO rumahsakit VALUES (NULL ,'"+nama_pasien+"','"+tl+"','"+usia+"','"+
                    jk+"','"+dokter+"','"+ruangan+"','"+tgl_masuk+"','"+diagnosa+"')";
            stt = con.createStatement();
            stt.executeUpdate(sql);
            model.addRow(new Object []{nama_pasien, tl, usia, jk, dokter, ruangan, tgl_masuk, diagnosa});
        }catch(SQLException e){
            System.out.println(e.getMessage());
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

        jPanel5 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TFnama = new javax.swing.JTextField();
        TFtgllahir = new javax.swing.JTextField();
        TFusia = new javax.swing.JTextField();
        RBlaki = new javax.swing.JRadioButton();
        RBperempuan = new javax.swing.JRadioButton();
        CBdokter = new javax.swing.JComboBox<>();
        CBruangan = new javax.swing.JComboBox<>();
        TFtglmasuk = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Listdiagnosa = new javax.swing.JList<>();
        Btntambah = new javax.swing.JButton();
        Btnsimpan = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TFcari = new javax.swing.JTextField();
        CBby = new javax.swing.JComboBox<>();
        Btnkeluar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(0, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("FORM RUMAH SAKIT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(355, 355, 355)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(51, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nama");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Tanggal Lahir");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Usia");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Jenis Kelamin");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Dokter");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Ruangan");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Tanggal Masuk");

        TFnama.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TFnamaCaretUpdate(evt);
            }
        });

        TFtgllahir.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TFtgllahirCaretUpdate(evt);
            }
        });
        TFtgllahir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFtgllahirKeyPressed(evt);
            }
        });

        TFusia.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TFusiaCaretUpdate(evt);
            }
        });
        TFusia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFusiaKeyPressed(evt);
            }
        });

        buttonGroup1.add(RBlaki);
        RBlaki.setText("Laki - Laki");

        buttonGroup1.add(RBperempuan);
        RBperempuan.setText("Perempuan");

        CBdokter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dr. Leony", "Dr. H. Usman", "Dr. Gino", "Dr. Samsudin", "Dr. Lanny", "Dr. Angel" }));

        CBruangan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UGD", "ICU", "ICCU", "PICU", "HCU", "RUANGAN OPERASI", "RUANGAN RAWAT INAP", "RUANGAN RADIOLOGI", "RUANGAN BERSALIN" }));

        TFtglmasuk.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TFtglmasukCaretUpdate(evt);
            }
        });
        TFtglmasuk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFtglmasukKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Diagnosa");

        Listdiagnosa.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Malaria", "Demam Berdarah", "Tifus", "HIV", "TBC", "Gagal Ginjal", "Gagal Jantung", "Diabetes", "Sifilis", "Singkadi", "Operasi Plastik", "Melahirkan", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(Listdiagnosa);

        Btntambah.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btntambah.setText("TAMBAH");
        Btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtntambahActionPerformed(evt);
            }
        });

        Btnsimpan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btnsimpan.setText("SIMPAN");
        Btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnsimpanActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Tahun");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TFnama)
                                .addComponent(TFtgllahir, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(TFusia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12)
                                .addGap(79, 79, 79)))
                        .addGap(119, 119, 119))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(RBlaki)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RBperempuan))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(Btntambah, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(Btnsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CBruangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBdokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFtglmasuk)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                .addGap(96, 96, 96))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(CBdokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(CBruangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(TFtglmasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TFnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TFtgllahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TFusia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(RBlaki)
                            .addComponent(RBperempuan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Btntambah, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btnsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama", "Tanggal Lahir", "Usia", "Jenis Kelamin", "Dokter", "Ruangan", "Tanggal Masuk", "Diagnosa"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanel4.setBackground(new java.awt.Color(0, 255, 204));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Cari");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("By :");

        TFcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFcariKeyTyped(evt);
            }
        });

        CBby.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "nama_pasien", "dokter" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(TFcari, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CBby, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(307, 307, 307))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(TFcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBby, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        Btnkeluar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btnkeluar.setText("KELUAR");
        Btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnkeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Btnkeluar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Btnkeluar)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnkeluarActionPerformed
        // TODO add your handling code here:
        int keluar=JOptionPane.showConfirmDialog(this, "Apakah anda ingin keluar dari aplikasi ?","Confirm Keluar",
                JOptionPane.YES_OPTION);
        if(keluar==JOptionPane.YES_OPTION){
        System.exit(0);
        }
    }//GEN-LAST:event_BtnkeluarActionPerformed

    private void BtntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtntambahActionPerformed
        // TODO add your handling code here:
        TFnama.setEnabled(true);
        TFtgllahir.setEnabled(true);
        TFusia.setEnabled(true);
        RBlaki.setEnabled(true);
        RBperempuan.setEnabled(true);
        CBdokter.setEnabled(true);
        CBruangan.setEnabled(true);
        TFtglmasuk.setEnabled(true);
        Listdiagnosa.setEnabled(true);
        Btnkeluar.setEnabled(true);
    }//GEN-LAST:event_BtntambahActionPerformed

    private void BtnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnsimpanActionPerformed
        // TODO add your handling code here:
        int simpan=JOptionPane.showConfirmDialog(this, "Apakah anda ingin menyimpan data","Confirm Simpan",
        JOptionPane.YES_OPTION);
        if(simpan==JOptionPane.YES_OPTION){
        String nama= TFnama.getText();
        String tgl_lahir = TFtgllahir.getText();
        String usia = TFusia.getText();
        String jenis_kelamin = "";
        if(RBlaki.isSelected()){
            RBlaki.setActionCommand("L");
            jenis_kelamin = RBlaki.getActionCommand();
        }
        else if(RBperempuan.isSelected()){
            RBperempuan.setActionCommand("P");
            jenis_kelamin =RBperempuan.getActionCommand();
        }
        else{
            JOptionPane.showMessageDialog(null,"Pilih Jenis Kelamin",
                    "Warning",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        String dokter = CBdokter.getSelectedItem().toString();
        String ruangan = CBruangan.getSelectedItem().toString();
        String tgl_masuk= TFtglmasuk.getText();
        String diagnosa = Listdiagnosa.getSelectedValuesList().toString();
        TambahData(nama, tgl_lahir, usia, jenis_kelamin, dokter, ruangan, tgl_masuk, diagnosa);
    }
    }//GEN-LAST:event_BtnsimpanActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        InitTable();
        TampilData();
    }//GEN-LAST:event_formComponentShown

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        Btntambah.setEnabled(true);
        Btnsimpan.setEnabled(false);
        TFnama.setEnabled(false);
        TFtgllahir.setEnabled(false);
        TFusia.setEnabled(false);
        RBlaki.setEnabled(false);
        RBperempuan.setEnabled(false);
        CBdokter.setEnabled(false);
        CBruangan.setEnabled(false);
        TFtglmasuk.setEnabled(false);
        Listdiagnosa.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void TFnamaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TFnamaCaretUpdate
        // TODO add your handling code here:
        if (TFnama.getText().length()== 0 || TFtgllahir.getText().length()==0||
            TFusia.getText().length()== 0 || TFtglmasuk.getText().length()==0)
                {
                    Btnsimpan.setEnabled(false);
        }
        else{
            Btnsimpan.setEnabled(true);
        }
    }//GEN-LAST:event_TFnamaCaretUpdate

    private void TFtgllahirCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TFtgllahirCaretUpdate
        // TODO add your handling code here:
        if (TFnama.getText().length()== 0 || TFtgllahir.getText().length()==0||
            TFusia.getText().length()== 0 || TFtglmasuk.getText().length()==0)
                {
                    Btnsimpan.setEnabled(false);
        }
        else{
            Btnsimpan.setEnabled(true);
        }
    }//GEN-LAST:event_TFtgllahirCaretUpdate

    private void TFusiaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TFusiaCaretUpdate
        // TODO add your handling code here:
        if (TFnama.getText().length()== 0 || TFtgllahir.getText().length()==0||
            TFusia.getText().length()== 0 || TFtglmasuk.getText().length()==0)
                {
                    Btnsimpan.setEnabled(false);
        }
        else{
            Btnsimpan.setEnabled(true);
        }
    }//GEN-LAST:event_TFusiaCaretUpdate

    private void TFtglmasukCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TFtglmasukCaretUpdate
        // TODO add your handling code here:
        if (TFnama.getText().length()== 0 || TFtgllahir.getText().length()==0||
            TFusia.getText().length()== 0 || TFtglmasuk.getText().length()==0)
                {
                    Btnsimpan.setEnabled(false);
        }
        else{
            Btnsimpan.setEnabled(true);
        }
    }//GEN-LAST:event_TFtglmasukCaretUpdate

    private void TFusiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFusiaKeyPressed
        // TODO add your handling code here:
         TFusia.addKeyListener(new KeyAdapter(){
             public void keyTyped(KeyEvent e){
                 char karakter = e.getKeyChar();
                 if(!((karakter >='0') && (karakter<='9') || (karakter == '\b'))){
                     e.consume();
                 }
             }
        });
    }//GEN-LAST:event_TFusiaKeyPressed

    private void TFtgllahirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFtgllahirKeyPressed
        // TODO add your handling code here:
        TFtgllahir.addKeyListener(new KeyAdapter(){
             public void keyTyped(KeyEvent e){
                 char karakter = e.getKeyChar();
                 if(!((karakter >='0') && (karakter<='9') || (karakter == '\b')) && (karakter != '-')){
                     e.consume();
                 }
             }
        });
    }//GEN-LAST:event_TFtgllahirKeyPressed

    private void TFtglmasukKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFtglmasukKeyPressed
        // TODO add your handling code here:
        TFtglmasuk.addKeyListener(new KeyAdapter(){
             public void keyTyped(KeyEvent e){
                 char karakter = e.getKeyChar();
                 if(!((karakter >='0') && (karakter<='9') || (karakter == '\b')) && (karakter != '-')){
                     e.consume();
                 }
             }
        });
    }//GEN-LAST:event_TFtglmasukKeyPressed

    private void TFcariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFcariKeyTyped
        // TODO add your handling code here:
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        String caridengan = CBby.getSelectedItem().toString();
        try {
            
           String sql = "SELECT * FROM rumahsakit WHERE "+caridengan+" like '%"+TFcari.getText()+"%'";
           stt = con. createStatement();
           rss = stt. executeQuery(sql);
           ResultSet rss=stt.executeQuery(sql);
            while (rss.next()) {
                Object[] o=new Object[8];
                o[0] = rss.getString("nama_pasien");
                o[1] = rss.getString("tl");
                o[2] = rss.getString("usia");
                o[3] = rss.getString("jk");
                o[4] = rss.getString("dokter");
                o[5] = rss.getString("ruangan");
                o[6] = rss.getString("tgl_masuk");
                o[7] = rss.getString("diagnosa");
            model.addRow(o);
            }
            stt.close();
            rss.close();
        }catch(SQLException e) {
            System.out.println("Terjadi kesalahan");
        }
    }//GEN-LAST:event_TFcariKeyTyped

    
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
            java.util.logging.Logger.getLogger(FormRumahSakit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRumahSakit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRumahSakit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRumahSakit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRumahSakit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btnkeluar;
    private javax.swing.JButton Btnsimpan;
    private javax.swing.JButton Btntambah;
    private javax.swing.JComboBox<String> CBby;
    private javax.swing.JComboBox<String> CBdokter;
    private javax.swing.JComboBox<String> CBruangan;
    private javax.swing.JList<String> Listdiagnosa;
    private javax.swing.JRadioButton RBlaki;
    private javax.swing.JRadioButton RBperempuan;
    private javax.swing.JTextField TFcari;
    private javax.swing.JTextField TFnama;
    private javax.swing.JTextField TFtgllahir;
    private javax.swing.JTextField TFtglmasuk;
    private javax.swing.JTextField TFusia;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
