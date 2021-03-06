import javax.swing.JFrame;

public class Admin extends javax.swing.JFrame 
{
    
    public Admin() 
    {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() 
    {
        jPanel1 = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        headerLabelAdmin = new javax.swing.JLabel();
        closeButton = new javax.swing.JLabel();
        minimizeButton = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tambahBukuButton = new javax.swing.JButton();
        cariBukuButton = new javax.swing.JButton();
        ubahBukuButton = new javax.swing.JButton();
        hapusBukuButton = new javax.swing.JButton();
        dataPeminjamButton = new javax.swing.JButton();
        historiPeminjamanButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 140, 0));

        headerLabel.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        headerLabel.setText("Library");

        headerLabelAdmin.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        headerLabelAdmin.setText("Admin");

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
        minimizeButton.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent evt) 
            {
                minimizeButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(headerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(headerLabelAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                .addComponent(minimizeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(closeButton)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(closeButton)
                        .addComponent(minimizeButton))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(headerLabelAdmin))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(headerLabel))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 480, 60);

        jPanel2.setBackground(new java.awt.Color(255, 215, 0));

        tambahBukuButton.setText("Tambah Buku");
        tambahBukuButton.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                tambahBukuButtonActionPerformed(evt);
            }
        });

        cariBukuButton.setText("Cari Buku");
        cariBukuButton.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                cariBukuButtonActionPerformed(evt);
            }
        });

        ubahBukuButton.setText("Ubah Buku");
        ubahBukuButton.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                ubahBukuButtonActionPerformed(evt);
            }
        });

        hapusBukuButton.setText("Hapus Buku");
        hapusBukuButton.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                hapusBukuButtonActionPerformed(evt);
            }
        });

        dataPeminjamButton.setText("Data Peminjaman");
        dataPeminjamButton.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                dataPeminjamButtonActionPerformed(evt);
            }
        });

        historiPeminjamanButton.setText("Histori Peminjaman");
        historiPeminjamanButton.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                historiPeminjamanButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tambahBukuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cariBukuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ubahBukuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hapusBukuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(91, 91, 91)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dataPeminjamButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(historiPeminjamanButton, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(tambahBukuButton)
                        .addGap(18, 18, 18)
                        .addComponent(cariBukuButton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(dataPeminjamButton)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ubahBukuButton)
                        .addGap(18, 18, 18)
                        .addComponent(hapusBukuButton)
                        .addContainerGap(33, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(historiPeminjamanButton)
                        .addGap(58, 58, 58))))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 60, 480, 230);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) 
    {//GEN-FIRST:event_closeButtonMouseClicked
        dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_closeButtonMouseClicked

    private void tambahBukuButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {//GEN-FIRST:event_tambahBukuButtonActionPerformed
        dispose();
        AddBook addBook = new AddBook();
        addBook.setVisible(true);
    }//GEN-LAST:event_tambahBukuButtonActionPerformed

    private void cariBukuButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {//GEN-FIRST:event_cariBukuButtonActionPerformed  
        dispose();
        BookProperty bookProperty = new BookProperty();
        bookProperty.setVisible(true);
    }//GEN-LAST:event_cariBukuButtonActionPerformed

    private void ubahBukuButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {//GEN-FIRST:event_ubahBukuButtonActionPerformed
        dispose();
        BookProperty bookProperty = new BookProperty();
        bookProperty.setVisible(true);
    }//GEN-LAST:event_ubahBukuButtonActionPerformed

    private void hapusBukuButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {//GEN-FIRST:event_hapusBukuButtonActionPerformed
        dispose();
        BookProperty bookProperty = new BookProperty();
        bookProperty.setVisible(true);
    }//GEN-LAST:event_hapusBukuButtonActionPerformed

    private void minimizeButtonMouseClicked(java.awt.event.MouseEvent evt) 
    {//GEN-FIRST:event_minimizeButtonMouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeButtonMouseClicked

    private void dataPeminjamButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {//GEN-FIRST:event_dataPeminjamButtonActionPerformed      
        dispose();
        BorrowerTable borrowerTable = new BorrowerTable();
        borrowerTable.setVisible(true);
    }//GEN-LAST:event_dataPeminjamButtonActionPerformed

    private void historiPeminjamanButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {//GEN-FIRST:event_historiPeminjamanButtonActionPerformed  
        dispose();
        BorrowerHistory borrowerHistory = new BorrowerHistory();
        borrowerHistory.setVisible(true);
    }//GEN-LAST:event_historiPeminjamanButtonActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cariBukuButton;
    private javax.swing.JLabel closeButton;
    private javax.swing.JButton dataPeminjamButton;
    private javax.swing.JButton hapusBukuButton;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel headerLabelAdmin;
    private javax.swing.JButton historiPeminjamanButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel minimizeButton;
    private javax.swing.JButton tambahBukuButton;
    private javax.swing.JButton ubahBukuButton;
    // End of variables declaration//GEN-END:variables
}
