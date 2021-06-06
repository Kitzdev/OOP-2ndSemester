import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class UpdateBook extends javax.swing.JFrame 
{
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
        
        judulBukuTextField.requestFocus();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPanel = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        headerLabelUpdateBook = new javax.swing.JLabel();
        closeButton = new javax.swing.JLabel();
        minimizeButton = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();
        judulLabel = new javax.swing.JLabel();
        judulBukuTextField = new javax.swing.JTextField();
        penulisLabel = new javax.swing.JLabel();
        penerbitBukuTextField = new javax.swing.JTextField();
        penerbitLabel = new javax.swing.JLabel();
        penulisBukuTextField = new javax.swing.JTextField();
        halamanLabel = new javax.swing.JLabel();
        jumlahBukuTextField = new javax.swing.JTextField();
        jumlahLabel = new javax.swing.JLabel();
        halamanBukuTextField = new javax.swing.JTextField();
        updateBookButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        headerPanel.setBackground(new java.awt.Color(255, 140, 0));

        headerLabel.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        headerLabel.setText("Library");

        headerLabelUpdateBook.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        headerLabelUpdateBook.setText("UpdateBook");

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
                .addComponent(headerLabelUpdateBook)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addComponent(minimizeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(closeButton)
                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addComponent(headerLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(closeButton)
                            .addComponent(minimizeButton)
                            .addComponent(headerLabelUpdateBook))))
                .addContainerGap())
        );

        getContentPane().add(headerPanel);
        headerPanel.setBounds(0, 0, 502, 69);

        bodyPanel.setBackground(new java.awt.Color(255, 215, 0));

        judulLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        judulLabel.setText("Judul Buku");

        judulBukuTextField.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N

        penulisLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        penulisLabel.setText("Penulis Buku");

        penerbitBukuTextField.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N

        penerbitLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        penerbitLabel.setText("Penerbit Buku");

        penulisBukuTextField.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N

        halamanLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        halamanLabel.setText("Halaman Buku");

        jumlahBukuTextField.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N

        jumlahLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jumlahLabel.setText("Jumlah Buku");

        halamanBukuTextField.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N

        updateBookButton.setText("Ubah Buku");
        updateBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBookButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addComponent(penulisLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(halamanLabel)
                            .addComponent(penerbitLabel)
                            .addComponent(judulLabel)
                            .addComponent(jumlahLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bodyPanelLayout.createSequentialGroup()
                                .addComponent(jumlahBukuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(bodyPanelLayout.createSequentialGroup()
                                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(penerbitBukuTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                                    .addComponent(penulisBukuTextField)
                                    .addComponent(judulBukuTextField))
                                .addGap(145, 145, 145))
                            .addGroup(bodyPanelLayout.createSequentialGroup()
                                .addComponent(halamanBukuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(updateBookButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(judulLabel)
                    .addComponent(judulBukuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(penulisLabel)
                    .addComponent(penulisBukuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(penerbitLabel)
                    .addComponent(penerbitBukuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(halamanLabel)
                    .addComponent(halamanBukuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jumlahLabel)
                    .addComponent(jumlahBukuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(updateBookButton)
                .addContainerGap())
        );

        getContentPane().add(bodyPanel);
        bodyPanel.setBounds(0, 60, 502, 330);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) 
    {//GEN-FIRST:event_closeButtonMouseClicked
        dispose();
        BookProperty bookProperty = new BookProperty();
        bookProperty.setVisible(true);
    }//GEN-LAST:event_closeButtonMouseClicked

    private void minimizeButtonMouseClicked(java.awt.event.MouseEvent evt) 
    {//GEN-FIRST:event_minimizeButtonMouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeButtonMouseClicked

    private void updateBookButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {//GEN-FIRST:event_updateBookButtonActionPerformed
        try 
        {
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
            
            JOptionPane.showMessageDialog(null, "Data buku berhasil diubah");
            
            dispose();
            BookProperty bookProperty = new BookProperty();
            bookProperty.setVisible(true);

        } catch (Exception exception) 
        {
            JOptionPane.showMessageDialog(null, "Gagal mendapatkan data dari "
                    + "database");
        }
    }//GEN-LAST:event_updateBookButtonActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() {                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JLabel closeButton;
    private javax.swing.JTextField halamanBukuTextField;
    private javax.swing.JLabel halamanLabel;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel headerLabelUpdateBook;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JTextField judulBukuTextField;
    private javax.swing.JLabel judulLabel;
    private javax.swing.JTextField jumlahBukuTextField;
    private javax.swing.JLabel jumlahLabel;
    private javax.swing.JLabel minimizeButton;
    private javax.swing.JTextField penerbitBukuTextField;
    private javax.swing.JLabel penerbitLabel;
    private javax.swing.JTextField penulisBukuTextField;
    private javax.swing.JLabel penulisLabel;
    private javax.swing.JButton updateBookButton;
    // End of variables declaration//GEN-END:variables
}
