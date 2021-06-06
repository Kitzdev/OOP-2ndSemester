import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BorrowingHistory extends javax.swing.JFrame 
{
    int NIM;
    
    public BorrowingHistory(int NIM) 
    { 
        this.NIM = NIM;
        initComponents();
        ShowData();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPanel = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        borrowingHistoryLabel = new javax.swing.JLabel();
        closeButton = new javax.swing.JLabel();
        minimizeButton = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();
        backButton2 = new javax.swing.JButton();
        insertCodeLabel = new javax.swing.JLabel();
        kodeTextField = new javax.swing.JTextField();
        cekBukuButton = new javax.swing.JButton();
        borrowerHistoryTable = new javax.swing.JScrollPane();
        borrowingHistoryTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        headerPanel.setBackground(new java.awt.Color(255, 140, 0));

        headerLabel.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        headerLabel.setText("Library");

        borrowingHistoryLabel.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        borrowingHistoryLabel.setText("BorrowingHistory");

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
                .addComponent(borrowingHistoryLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
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
                    .addComponent(borrowingHistoryLabel)
                    .addComponent(headerLabel))
                .addContainerGap())
        );

        getContentPane().add(headerPanel);
        headerPanel.setBounds(0, 0, 570, 70);

        bodyPanel.setBackground(new java.awt.Color(255, 215, 0));

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
            borrowingHistoryTable.getColumnModel().getColumn(1).setMinWidth(100);
            borrowingHistoryTable.getColumnModel().getColumn(1).setMaxWidth(100);
            borrowingHistoryTable.getColumnModel().getColumn(2).setMinWidth(110);
            borrowingHistoryTable.getColumnModel().getColumn(2).setMaxWidth(110);
        }

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(borrowerHistoryTable)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(insertCodeLabel)
                        .addGap(79, 79, 79)
                        .addComponent(kodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(cekBukuButton)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(borrowerHistoryTable, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertCodeLabel)
                    .addComponent(kodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(cekBukuButton)
                .addGap(28, 28, 28)
                .addComponent(backButton2)
                .addContainerGap())
        );

        getContentPane().add(bodyPanel);
        bodyPanel.setBounds(0, 70, 570, 360);

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

    private void backButton2ActionPerformed(java.awt.event.ActionEvent evt) 
    {//GEN-FIRST:event_backButton2ActionPerformed

        dispose();
        MainMenu mainMenu = new MainMenu(NIM);
        mainMenu.setVisible(true);
    }//GEN-LAST:event_backButton2ActionPerformed

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

    private void ShowData()
    {
        int jumlahPeminjaman;
        Date tanggalPeminjaman;
        
        try 
        {         
            DBConnection.AccessDatabase();
            DBConnection.sql = "SELECT * FROM tabel_pengembalian WHERE "
                               + "NIM_anggota = " + NIM + ";";
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
                theTable.addRow(new Object[]{DBConnection.resultSet.getInt
                (1),DBConnection.resultSet.getInt(2), DBConnection.resultSet.getInt
                (3), DBConnection.resultSet.getDate(4)});
            }
            
            borrowingHistoryTable.setModel(theTable);
            
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
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton2;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JScrollPane borrowerHistoryTable;
    private javax.swing.JLabel borrowingHistoryLabel;
    private javax.swing.JTable borrowingHistoryTable;
    private javax.swing.JButton cekBukuButton;
    private javax.swing.JLabel closeButton;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel insertCodeLabel;
    private javax.swing.JTextField kodeTextField;
    private javax.swing.JLabel minimizeButton;
    // End of variables declaration//GEN-END:variables
}