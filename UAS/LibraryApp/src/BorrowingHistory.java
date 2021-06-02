import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BorrowingHistory extends javax.swing.JFrame {

    int NIM;
    
    public BorrowingHistory(int NIM) {
        
        this.NIM = NIM;
        initComponents();
        ShowData();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        headerLabelAdmin = new javax.swing.JLabel();
        closeButton = new javax.swing.JLabel();
        minimizeButton = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        borrowingHistoryTable = new javax.swing.JTable();
        backButton2 = new javax.swing.JButton();
        insertCodeLabel = new javax.swing.JLabel();
        kodeTextField = new javax.swing.JTextField();
        cekBukuButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 140, 0));

        headerLabel.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        headerLabel.setText("Library");

        headerLabelAdmin.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        headerLabelAdmin.setText("BorrowingHistory");

        closeButton.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        closeButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeButton.setText("X");
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });

        minimizeButton.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        minimizeButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizeButton.setText("-");
        minimizeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(headerLabelAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 395, Short.MAX_VALUE)
                .addComponent(minimizeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(closeButton)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(closeButton)
                        .addComponent(minimizeButton))
                    .addComponent(headerLabelAdmin)
                    .addComponent(headerLabel))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 740, 70);

        jPanel4.setBackground(new java.awt.Color(255, 215, 0));

        borrowingHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Peminjaman", "Kode Buku", "Jumlah Peminjaman", "Tanggal Peminjaman", "Tanggal Pengembalian"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(borrowingHistoryTable);
        if (borrowingHistoryTable.getColumnModel().getColumnCount() > 0) {
            borrowingHistoryTable.getColumnModel().getColumn(0).setMinWidth(135);
            borrowingHistoryTable.getColumnModel().getColumn(0).setMaxWidth(135);
            borrowingHistoryTable.getColumnModel().getColumn(1).setMinWidth(90);
            borrowingHistoryTable.getColumnModel().getColumn(1).setMaxWidth(90);
            borrowingHistoryTable.getColumnModel().getColumn(2).setMinWidth(150);
            borrowingHistoryTable.getColumnModel().getColumn(2).setMaxWidth(150);
        }

        backButton2.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        backButton2.setText("Back");
        backButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton2ActionPerformed(evt);
            }
        });

        insertCodeLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        insertCodeLabel.setText("Insert Code");

        cekBukuButton.setText("Cek Buku");
        cekBukuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekBukuButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(insertCodeLabel)
                        .addGap(55, 55, 55)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cekBukuButton))))
                .addContainerGap(245, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertCodeLabel)
                    .addComponent(kodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(cekBukuButton)
                .addGap(18, 18, 18)
                .addComponent(backButton2)
                .addContainerGap())
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 70, 740, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked

        dispose();
        Admin admin = new Admin();
        admin.setVisible(true);
    }//GEN-LAST:event_closeButtonMouseClicked

    private void minimizeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeButtonMouseClicked

    private void backButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton2ActionPerformed

        dispose();
        MainMenu mainMenu = new MainMenu(NIM);
        mainMenu.setVisible(true);
    }//GEN-LAST:event_backButton2ActionPerformed

    private void cekBukuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekBukuButtonActionPerformed
        
        try {

            int kodeBuku = Integer.parseInt(kodeTextField.getText());
            DBConnection.AccessDatabase();
            DBConnection.sql = "SELECT * FROM tabel_buku WHERE kode_buku = "
            + kodeBuku + ";";
            DBConnection.statement = DBConnection.connection.createStatement();
            DBConnection.resultSet = DBConnection.statement.executeQuery
                                     (DBConnection.sql);

            if(DBConnection.resultSet.next())
            {
                String judulBuku = DBConnection.resultSet.getString(2);
                String penulisBuku = DBConnection.resultSet.getString(3);
                String penerbitBuku = DBConnection.resultSet.getString(4);
                int halamanBuku = DBConnection.resultSet.getInt(5);
                int jumlahBuku = DBConnection.resultSet.getInt(6);

                JOptionPane.showMessageDialog(null, "Kode Buku = " + kodeBuku
                    + "\nJudul Buku = " + judulBuku + "\nPenulis Buku = "
                    + penulisBuku + "\nPenerbit Buku = " + penerbitBuku
                    + "\nHalaman Buku = " + halamanBuku + "\nJumlah Buku = "
                    + jumlahBuku);

            } else
            {
                JOptionPane.showMessageDialog(null, "Cannot find book with that"
                    + " code");
            }

        } catch (Exception exception) {

            JOptionPane.showMessageDialog(null, "Failed to retrieve data from "
                + "database");
        }
    }//GEN-LAST:event_cekBukuButtonActionPerformed

    private void ShowData()
    {
        int jumlahPeminjaman;
        Date tanggalPeminjaman;
        
        try {
            
            DBConnection.AccessDatabase();
            DBConnection.sql = "SELECT * FROM tabel_pengembalian WHERE "
                               + "NIM_anggota = " + NIM + ";";
            DBConnection.statement = DBConnection.connection.createStatement();
            DBConnection.resultSet = DBConnection.statement.executeQuery
                                     (DBConnection.sql);
            
            DefaultTableModel theTable = new DefaultTableModel();
            theTable.addColumn("Kode Peminjaman");
            theTable.addColumn("Kode Buku");
            theTable.addColumn("Jumlah Peminjaman");
            theTable.addColumn("Tanggal Peminjaman");
            theTable.addColumn("Tanggal Pengembalian");
            
            int row = 1;
            
            while(DBConnection.resultSet.next())
            {
                jumlahPeminjaman = SetJumlahPeminjaman(row);
                tanggalPeminjaman = SetTanggalPeminjaman(row);
                theTable.addRow(new Object[]{DBConnection.resultSet.getInt
                (2),DBConnection.resultSet.getInt(3), jumlahPeminjaman, 
                tanggalPeminjaman, DBConnection.resultSet.getDate(5)});
                row++;
            }
            
            borrowingHistoryTable.setModel(theTable);
            
        } catch (Exception Exception) {
                        System.out.println("Here1");
            JOptionPane.showMessageDialog(null, "Failed to retrieve data from "
                    + "database");
        }
    }
    
    private int SetJumlahPeminjaman(int row)
    {
        int container = 0;
        
        try {
                 
            DBConnection.AccessDatabase();
            DBConnection.sql = "SELECT * FROM tabel_peminjaman WHERE "
                               + "NIM_peminjam = " + NIM + ";";
            DBConnection.statement = DBConnection.connection.createStatement();
            DBConnection.resultSet = DBConnection.statement.executeQuery
                                     (DBConnection.sql);
            while(row != 0)
            {
                DBConnection.resultSet.next();
                row--;
            }
            
            container = DBConnection.resultSet.getInt(4);                       
            
        } catch (Exception Exception) {
            
            JOptionPane.showMessageDialog(null, "Failed to retrieve data from "
                    + "database");
        }
        
        return container;
    }
    
    
    private Date SetTanggalPeminjaman(int row)
    {
        Date date = new Date();
        
        try {
                       
            DBConnection.AccessDatabase();
            DBConnection.sql = "SELECT * FROM tabel_peminjaman "+ "WHERE "
                               + "NIM_peminjam = " + NIM + ";";
            DBConnection.statement = DBConnection.connection.createStatement();
            DBConnection.resultSet = DBConnection.statement.executeQuery
                                     (DBConnection.sql);
            
            while(row != 0)
            {
                DBConnection.resultSet.next();
                row--;
            }
            
            date = DBConnection.resultSet.getDate(5);           
            
        } catch (Exception Exception) {
                        
            JOptionPane.showMessageDialog(null, "Failed to retrieve data from "
                    + "database");
        }

        return date;
    }
     
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton2;
    private javax.swing.JTable borrowingHistoryTable;
    private javax.swing.JButton cekBukuButton;
    private javax.swing.JLabel closeButton;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel headerLabelAdmin;
    private javax.swing.JLabel insertCodeLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField kodeTextField;
    private javax.swing.JLabel minimizeButton;
    // End of variables declaration//GEN-END:variables
}
