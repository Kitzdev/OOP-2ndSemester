import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class BorrowerHistory extends javax.swing.JFrame
{
    public BorrowerHistory() 
    {
        initComponents();
        ShowData();
        kodeTextField.requestFocus();        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPanel = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        borrowerHistoryLabel = new javax.swing.JLabel();
        closeButton = new javax.swing.JLabel();
        minimizeButton = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        insertCodeLabel = new javax.swing.JLabel();
        kodeTextField = new javax.swing.JTextField();
        cekPeminjamanButton = new javax.swing.JButton();
        cekBukuButton = new javax.swing.JButton();
        borrowerHistoryTable = new javax.swing.JScrollPane();
        borrowingHistoryTable = new javax.swing.JTable();
        printReportButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        headerPanel.setBackground(new java.awt.Color(255, 140, 0));

        headerLabel.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        headerLabel.setText("Library");

        borrowerHistoryLabel.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        borrowerHistoryLabel.setText("BorrowerHistory");

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

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(borrowerHistoryLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 273, Short.MAX_VALUE)
                .addComponent(minimizeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(closeButton)
                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(closeButton)
                        .addComponent(minimizeButton))
                    .addComponent(borrowerHistoryLabel)
                    .addComponent(headerLabel))
                .addGap(21, 21, 21))
        );

        getContentPane().add(headerPanel);
        headerPanel.setBounds(0, 0, 610, 78);

        bodyPanel.setBackground(new java.awt.Color(255, 215, 0));

        backButton.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        backButton.setText("Kembali");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        insertCodeLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        insertCodeLabel.setText("Masukkan Kode");

        cekPeminjamanButton.setText("Cek Peminjaman");
        cekPeminjamanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekPeminjamanButtonActionPerformed(evt);
            }
        });

        cekBukuButton.setText("Cek Buku");
        cekBukuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekBukuButtonActionPerformed(evt);
            }
        });

        borrowingHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode Pengembalian", "Kode Buku", "NIM Anggota", "Tanggal Pengembalian"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        borrowerHistoryTable.setViewportView(borrowingHistoryTable);
        if (borrowingHistoryTable.getColumnModel().getColumnCount() > 0) {
            borrowingHistoryTable.getColumnModel().getColumn(0).setMinWidth(150);
            borrowingHistoryTable.getColumnModel().getColumn(0).setMaxWidth(150);
            borrowingHistoryTable.getColumnModel().getColumn(1).setMinWidth(90);
            borrowingHistoryTable.getColumnModel().getColumn(1).setMaxWidth(90);
            borrowingHistoryTable.getColumnModel().getColumn(2).setMinWidth(110);
            borrowingHistoryTable.getColumnModel().getColumn(2).setMaxWidth(110);
            borrowingHistoryTable.getColumnModel().getColumn(3).setMinWidth(170);
            borrowingHistoryTable.getColumnModel().getColumn(3).setMaxWidth(170);
        }

        printReportButton.setText("Cetak Laporan");
        printReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printReportButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(cekBukuButton)
                        .addGap(59, 59, 59)
                        .addComponent(cekPeminjamanButton)
                        .addGap(60, 60, 60)
                        .addComponent(printReportButton))
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(insertCodeLabel)
                        .addGap(30, 30, 30)
                        .addComponent(kodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(133, Short.MAX_VALUE))
            .addComponent(borrowerHistoryTable)
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(borrowerHistoryTable, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertCodeLabel)
                    .addComponent(kodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                        .addComponent(backButton)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                        .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cekBukuButton)
                            .addComponent(cekPeminjamanButton)
                            .addComponent(printReportButton))
                        .addGap(75, 75, 75))))
        );

        getContentPane().add(bodyPanel);
        bodyPanel.setBounds(0, 70, 610, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) 
    {//GEN-FIRST:event_closeButtonMouseClicked
        dispose();
        Admin admin = new Admin();
        admin.setVisible(true);
    }//GEN-LAST:event_closeButtonMouseClicked

    private void minimizeButtonMouseClicked(java.awt.event.MouseEvent evt) 
    {//GEN-FIRST:event_minimizeButtonMouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeButtonMouseClicked

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        Admin admin = new Admin();
        admin.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void cekBukuButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {//GEN-FIRST:event_cekBukuButtonActionPerformed
        try 
        {
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
                JOptionPane.showMessageDialog(null, "Tidak dapat menemukan buku"
                        + " dengan kode tersebut");
            }

        } catch (Exception exception) 
        {
            JOptionPane.showMessageDialog(null, "Gagal mendapatkan data dari "
                + "database");
        }
    }//GEN-LAST:event_cekBukuButtonActionPerformed

    private void cekPeminjamanButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {//GEN-FIRST:event_cekPeminjamanButtonActionPerformed
        try 
        {
            int kodePeminjaman = Integer.parseInt(kodeTextField.getText());

            DBConnection.AccessDatabase();
            DBConnection.sql = "SELECT * FROM tabel_peminjaman WHERE "
                    + "kode_peminjaman = " + kodePeminjaman + ";";
            DBConnection.statement = DBConnection.connection.createStatement();
            DBConnection.resultSet = DBConnection.statement.executeQuery
                                            (DBConnection.sql);
            
            if(DBConnection.resultSet.next())
            {
                int kodeBuku = DBConnection.resultSet.getInt(2);
                int NIMPeminjam = DBConnection.resultSet.getInt(3);
                int jumlahPeminjaman = DBConnection.resultSet.getInt(4);
                Date tanggalPeminjaman = DBConnection.resultSet.getDate(5);

                JOptionPane.showMessageDialog(null, "Kode Peminjaman = " 
                        + kodePeminjaman + "\nKode Buku= " + kodeBuku + 
                        "\nNIM Peminjam = " + + NIMPeminjam + 
                        "\njumlahPeminjaman = " + jumlahPeminjaman + 
                        "\nTanggal Peminjaman = " + tanggalPeminjaman);
                
            } else
            {
                JOptionPane.showMessageDialog(null, "Tidak dapat menemukan buku"
                        + " dengan kode tersebut");
            }
            
        } catch (Exception exception) 
        {
            JOptionPane.showMessageDialog(null, "Gagal mendapatkan data dari "
                    + "database");
        }
        
    }//GEN-LAST:event_cekPeminjamanButtonActionPerformed

    private void printReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printReportButtonActionPerformed
        try
        {
            JasperPrint jasperPrint = net.sf.jasperreports.engine.JasperFillManager.fillReport(getClass().
                                      getResourceAsStream("BorrowerHistoryReport.jasper")
                                      , null, DBConnection.AccessDatabaseWithReturn());
            JasperViewer.viewReport(jasperPrint, false);

        } catch(Exception exception)
        {
            JOptionPane.showMessageDialog(null, "Gagal menampilkan file report");
        }
    }//GEN-LAST:event_printReportButtonActionPerformed
    
    private void ShowData()
    {       
        try 
        {
            DBConnection.AccessDatabase();
            DBConnection.sql = "SELECT * FROM tabel_pengembalian;";
            DBConnection.statement = DBConnection.connection.createStatement();
            DBConnection.resultSet = DBConnection.statement.executeQuery
                                     (DBConnection.sql);
            
            DefaultTableModel theTable = new DefaultTableModel();
            theTable.addColumn("Kode Pengembalian");
            theTable.addColumn("Kode Buku");
            theTable.addColumn("NIM anggota");
            theTable.addColumn("Tanggal Pengembalian");
            
            while(DBConnection.resultSet.next())
            {
                theTable.addRow(new Object[]{DBConnection.resultSet.getInt(1),
                    DBConnection.resultSet.getInt(2), 
                    DBConnection.resultSet.getInt(3), 
                    DBConnection.resultSet.getDate(4)});
            }
            
            borrowingHistoryTable.setModel(theTable);
            
        } catch (Exception Exception) 
        {
            JOptionPane.showMessageDialog(null, "Gagal mendapatkan data dari "
                    + "database");
        }
    }
    
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new BorrowerHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JLabel borrowerHistoryLabel;
    private javax.swing.JScrollPane borrowerHistoryTable;
    private javax.swing.JTable borrowingHistoryTable;
    private javax.swing.JButton cekBukuButton;
    private javax.swing.JButton cekPeminjamanButton;
    private javax.swing.JLabel closeButton;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel insertCodeLabel;
    private javax.swing.JTextField kodeTextField;
    private javax.swing.JLabel minimizeButton;
    private javax.swing.JButton printReportButton;
    // End of variables declaration//GEN-END:variables
}
