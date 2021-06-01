import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class UpdateBook extends javax.swing.JFrame {

    int kodeBuku;
    
    public UpdateBook(int kodeBuku, String judulBuku, String penulisBuku, 
            String penerbitBuku, int halamanBuku, int jumlahBuku) 
    {
        initComponents();
        
        this.kodeBuku = kodeBuku;
        judulBukuTextField.setText(judulBuku);
        penulisBukuTextField.setText(penulisBuku);
        penerbitBukuTextField.setText(penerbitBuku);
        halamanBukuTextField.setText(Integer.toString(halamanBuku));
        jumlahBukuTextField.setText(Integer.toString(jumlahBuku));
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        headerLabelAddBook = new javax.swing.JLabel();
        closeButton = new javax.swing.JLabel();
        minimizeButton = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        namaLabel = new javax.swing.JLabel();
        judulBukuTextField = new javax.swing.JTextField();
        namaLabel1 = new javax.swing.JLabel();
        penerbitBukuTextField = new javax.swing.JTextField();
        namaLabel2 = new javax.swing.JLabel();
        penulisBukuTextField = new javax.swing.JTextField();
        namaLabel3 = new javax.swing.JLabel();
        jumlahBukuTextField = new javax.swing.JTextField();
        namaLabel4 = new javax.swing.JLabel();
        halamanBukuTextField = new javax.swing.JTextField();
        updateBookButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 140, 0));

        headerLabel.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        headerLabel.setText("Library");

        headerLabelAddBook.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        headerLabelAddBook.setText("UpdateBook");

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
                .addComponent(headerLabelAddBook)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addComponent(minimizeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(closeButton)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(headerLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(closeButton)
                            .addComponent(minimizeButton)
                            .addComponent(headerLabelAddBook))))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 502, 69);

        jPanel2.setBackground(new java.awt.Color(255, 215, 0));

        namaLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        namaLabel.setText("Judul Buku");

        judulBukuTextField.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N

        namaLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        namaLabel1.setText("Penulis Buku");

        penerbitBukuTextField.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N

        namaLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        namaLabel2.setText("Penerbit Buku");

        penulisBukuTextField.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N

        namaLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        namaLabel3.setText("Halaman Buku");

        jumlahBukuTextField.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N

        namaLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        namaLabel4.setText("Jumlah Buku");

        halamanBukuTextField.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N

        updateBookButton.setText("Update Book");
        updateBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBookButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(namaLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namaLabel3)
                            .addComponent(namaLabel2)
                            .addComponent(namaLabel)
                            .addComponent(namaLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jumlahBukuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(penerbitBukuTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                                    .addComponent(penulisBukuTextField)
                                    .addComponent(judulBukuTextField))
                                .addGap(145, 145, 145))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(halamanBukuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(updateBookButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaLabel)
                    .addComponent(judulBukuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaLabel1)
                    .addComponent(penulisBukuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaLabel2)
                    .addComponent(penerbitBukuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaLabel3)
                    .addComponent(halamanBukuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaLabel4)
                    .addComponent(jumlahBukuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(updateBookButton)
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 60, 502, 330);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked

        dispose();
        BookProperty bookProperty = new BookProperty();
        bookProperty.setVisible(true);
    }//GEN-LAST:event_closeButtonMouseClicked

    private void minimizeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeButtonMouseClicked

    private void updateBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBookButtonActionPerformed
        
        try {

            DBConnection.AccessDatabase();
            DBConnection.sql = "UPDATE `tabel_buku` SET `kode_buku`= '" + 
                    kodeBuku + "',`judul_buku`='" + judulBukuTextField.getText() 
                    + "',`penulis_buku`='" + penulisBukuTextField.getText() 
                    + "',`penerbit_buku`='" + penerbitBukuTextField.getText()
                    + "',`halaman_buku`='" + halamanBukuTextField.getText() 
                    + "',`jumlah_buku`='" + jumlahBukuTextField.getText() 
                    + "' WHERE kode_buku = " + kodeBuku + ";";
            DBConnection.statement = DBConnection.connection.createStatement();
            DBConnection.statement.executeUpdate(DBConnection.sql);
            
            JOptionPane.showMessageDialog(null, "Data buku berhasil"
                + " diubah");
            
            dispose();
            BookProperty bookProperty = new BookProperty();
            bookProperty.setVisible(true);

        } catch (Exception exception) {
            
            JOptionPane.showMessageDialog(null, "Failed to retrieve data from "
                    + "database");
        }
    }//GEN-LAST:event_updateBookButtonActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closeButton;
    private javax.swing.JTextField halamanBukuTextField;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel headerLabelAddBook;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField judulBukuTextField;
    private javax.swing.JTextField jumlahBukuTextField;
    private javax.swing.JLabel minimizeButton;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JLabel namaLabel1;
    private javax.swing.JLabel namaLabel2;
    private javax.swing.JLabel namaLabel3;
    private javax.swing.JLabel namaLabel4;
    private javax.swing.JTextField penerbitBukuTextField;
    private javax.swing.JTextField penulisBukuTextField;
    private javax.swing.JButton updateBookButton;
    // End of variables declaration//GEN-END:variables
}
