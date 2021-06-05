import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class BorrowerTable extends javax.swing.JFrame 
{
    public BorrowerTable() 
    {
        initComponents();
        ShowData();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPanel = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        headerLabelAdmin = new javax.swing.JLabel();
        closeButton = new javax.swing.JLabel();
        minimizeButton = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();
        borrowerTable = new javax.swing.JScrollPane();
        theBorrowerTable = new javax.swing.JTable();
        backButton = new javax.swing.JButton();
        insertCodeLabel = new javax.swing.JLabel();
        kodeTextField = new javax.swing.JTextField();
        cekPeminjamanButton = new javax.swing.JButton();
        cekBukuButton = new javax.swing.JButton();
        printReportButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        headerPanel.setBackground(new java.awt.Color(255, 140, 0));

        headerLabel.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        headerLabel.setText("Library");

        headerLabelAdmin.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        headerLabelAdmin.setText("Borrower");

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
                .addComponent(headerLabelAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 398, Short.MAX_VALUE)
                .addComponent(minimizeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(closeButton)
                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(closeButton)
                        .addComponent(minimizeButton))
                    .addComponent(headerLabelAdmin)
                    .addComponent(headerLabel))
                .addContainerGap())
        );

        getContentPane().add(headerPanel);
        headerPanel.setBounds(0, 0, 680, 70);

        bodyPanel.setBackground(new java.awt.Color(255, 215, 0));

        theBorrowerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Peminjaman", "Kode Buku", "NIM Peminjam", "Jumlah Peminjaman", "Tanggal Peminjaman"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        borrowerTable.setViewportView(theBorrowerTable);
        if (theBorrowerTable.getColumnModel().getColumnCount() > 0) {
            theBorrowerTable.getColumnModel().getColumn(0).setMinWidth(135);
            theBorrowerTable.getColumnModel().getColumn(0).setMaxWidth(135);
            theBorrowerTable.getColumnModel().getColumn(1).setMinWidth(100);
            theBorrowerTable.getColumnModel().getColumn(1).setMaxWidth(100);
            theBorrowerTable.getColumnModel().getColumn(2).setMinWidth(125);
            theBorrowerTable.getColumnModel().getColumn(2).setMaxWidth(125);
            theBorrowerTable.getColumnModel().getColumn(3).setMinWidth(150);
            theBorrowerTable.getColumnModel().getColumn(3).setMaxWidth(150);
        }

        backButton.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        insertCodeLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        insertCodeLabel.setText("Insert Code");

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
            .addComponent(borrowerTable, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bodyPanelLayout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addComponent(insertCodeLabel))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cekBukuButton)
                                .addGap(51, 51, 51)))
                        .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bodyPanelLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(kodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bodyPanelLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(cekPeminjamanButton)
                                .addGap(59, 59, 59)
                                .addComponent(printReportButton)))))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(borrowerTable, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertCodeLabel)
                    .addComponent(kodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cekBukuButton)
                    .addComponent(cekPeminjamanButton)
                    .addComponent(printReportButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backButton)
                .addContainerGap())
        );

        getContentPane().add(bodyPanel);
        bodyPanel.setBounds(0, 70, 680, 350);

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
                JOptionPane.showMessageDialog(null, "Cannot find book with that"
                        + " code");
            }
            
        } catch (Exception exception) 
        {  
            JOptionPane.showMessageDialog(null, "Failed to retrieve data from "
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
                JOptionPane.showMessageDialog(null, "Cannot find book with that"
                        + " code");
            }
            
        } catch (Exception exception) 
        {
            JOptionPane.showMessageDialog(null, "Failed to retrieve data from "
                                          + "database");
        }
    }//GEN-LAST:event_cekPeminjamanButtonActionPerformed

    private void printReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printReportButtonActionPerformed
        try
        {
            JasperPrint jasperPrint = JasperFillManager.fillReport(getClass().
                                      getResourceAsStream("BorrowReport.jasper")
                                      , null, DBConnection.AccessDatabaseWithReturn());
            JasperViewer.viewReport(jasperPrint, false);
            
        } catch(Exception exception)
        {
            JOptionPane.showMessageDialog(null, "Failed to create report file");
        }
    }//GEN-LAST:event_printReportButtonActionPerformed

    private void ShowData()
    {
        try {
            
            DBConnection.AccessDatabase();
            DBConnection.sql = "SELECT * FROM tabel_peminjaman;";
            DBConnection.statement = DBConnection.connection.createStatement();
            DBConnection.resultSet = DBConnection.statement.executeQuery
                                     (DBConnection.sql);
            
            DefaultTableModel borrowTable = new DefaultTableModel();
            borrowTable.addColumn("Kode Peminjaman");
            borrowTable.addColumn("Kode Buku");
            borrowTable.addColumn("NIM Peminjaman");
            borrowTable.addColumn("Jumlah Peminjaman");
            borrowTable.addColumn("Tanggal Peminjaman");
            
            while(DBConnection.resultSet.next())
            {
                borrowTable.addRow(new Object[]{DBConnection.resultSet.getInt
                (1),DBConnection.resultSet.getInt(2), DBConnection.resultSet.
                        getInt(3), DBConnection.resultSet.getInt(4), 
                        DBConnection.resultSet.getDate(5)});
            }
            
            theBorrowerTable.setModel(borrowTable);
            
        } catch (Exception Exception) 
        {
            JOptionPane.showMessageDialog(null, "Failed to retrieve data from "
                    + "database");
        }
        
    }
    
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new BorrowerTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JScrollPane borrowerTable;
    private javax.swing.JButton cekBukuButton;
    private javax.swing.JButton cekPeminjamanButton;
    private javax.swing.JLabel closeButton;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel headerLabelAdmin;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel insertCodeLabel;
    private javax.swing.JTextField kodeTextField;
    private javax.swing.JLabel minimizeButton;
    private javax.swing.JButton printReportButton;
    private javax.swing.JTable theBorrowerTable;
    // End of variables declaration//GEN-END:variables
}