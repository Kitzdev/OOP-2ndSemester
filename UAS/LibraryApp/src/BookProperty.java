import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BookProperty extends javax.swing.JFrame {

    public BookProperty() {
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        theBookTable = new javax.swing.JTable();
        bodyLabel = new javax.swing.JLabel();
        kodeBukuTextField = new javax.swing.JTextField();
        cariBukuButton = new javax.swing.JButton();
        ubahBukuButton = new javax.swing.JButton();
        hapusBukuButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 140, 0));

        headerLabel.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        headerLabel.setText("Library");

        headerLabelAdmin.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        headerLabelAdmin.setText("Book");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 463, Short.MAX_VALUE)
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
        jPanel1.setBounds(0, 0, 710, 70);

        jPanel2.setBackground(new java.awt.Color(255, 215, 0));

        theBookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Kode Buku", "Judul Buku", "Penulis Buku", "Penerbit Buku", "Halaman Buku", "Jumlah Buku"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(theBookTable);

        bodyLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        bodyLabel.setText("Masukkan Kode Buku");

        kodeBukuTextField.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N

        cariBukuButton.setText("Cari Buku");
        cariBukuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariBukuButtonActionPerformed(evt);
            }
        });

        ubahBukuButton.setText("Ubah Buku");
        ubahBukuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahBukuButtonActionPerformed(evt);
            }
        });

        hapusBukuButton.setText("Hapus Buku");
        hapusBukuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusBukuButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(bodyLabel)
                .addGap(30, 30, 30)
                .addComponent(kodeBukuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(cariBukuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ubahBukuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(hapusBukuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bodyLabel)
                    .addComponent(kodeBukuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cariBukuButton)
                    .addComponent(ubahBukuButton)
                    .addComponent(hapusBukuButton))
                .addGap(45, 45, 45))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 70, 710, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked

        dispose();
        Admin admin = new Admin();
        admin.setVisible(true);
    }//GEN-LAST:event_closeButtonMouseClicked

    private void cariBukuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariBukuButtonActionPerformed

        dispose();
        BookProperty bookProperty = new BookProperty();
        bookProperty.setVisible(true);
    }//GEN-LAST:event_cariBukuButtonActionPerformed

    private void ubahBukuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahBukuButtonActionPerformed

        dispose();
        BookProperty bookProperty = new BookProperty();
        bookProperty.setVisible(true);
    }//GEN-LAST:event_ubahBukuButtonActionPerformed

    private void hapusBukuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusBukuButtonActionPerformed
        dispose();
        BookProperty bookProperty = new BookProperty();
        bookProperty.setVisible(true);
    }//GEN-LAST:event_hapusBukuButtonActionPerformed

    private void minimizeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeButtonMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookProperty().setVisible(true);
            }
        });
    }

    private void ShowData()
    {
        try {
            
            DBConnection.AccessDatabase();
            DBConnection.sql = "SELECT * FROM tabel_buku;";
            DBConnection.statement = DBConnection.connection.createStatement();
            DBConnection.resultSet = DBConnection.statement.executeQuery
                                    (DBConnection.sql);
            
            DefaultTableModel bookTable = new DefaultTableModel();
            bookTable.addColumn("Kode Buku");
            bookTable.addColumn("Judul Buku");
            bookTable.addColumn("Penulis Buku");
            bookTable.addColumn("Penerbit Buku");
            bookTable.addColumn("Halaman Buku");
            bookTable.addColumn("Jumlah Buku");
            
            while(DBConnection.resultSet.next())
            {
                bookTable.addRow(new Object[]{DBConnection.resultSet.getString
                (1),DBConnection.resultSet.getString(2), DBConnection.resultSet.
                getString(3), DBConnection.resultSet.getString(4), DBConnection.
                resultSet.getInt(5), DBConnection.resultSet.getInt(6)});
            }
            
            theBookTable.setModel(bookTable);
            
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Failed to retrieve data from "
                    + "database");
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bodyLabel;
    private javax.swing.JButton cariBukuButton;
    private javax.swing.JLabel closeButton;
    private javax.swing.JButton hapusBukuButton;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel headerLabelAdmin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kodeBukuTextField;
    private javax.swing.JLabel minimizeButton;
    private javax.swing.JTable theBookTable;
    private javax.swing.JButton ubahBukuButton;
    // End of variables declaration//GEN-END:variables
}
