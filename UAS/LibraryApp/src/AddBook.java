import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AddBook extends javax.swing.JFrame {

    String kodeBuku;
    
    public AddBook() {
        initComponents();
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
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 140, 0));

        headerLabel.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        headerLabel.setText("Library");

        headerLabelAddBook.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        headerLabelAddBook.setText("AddBook");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                .addComponent(minimizeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(closeButton)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(headerLabelAddBook)
                    .addComponent(closeButton)
                    .addComponent(minimizeButton))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jButton1.setText("Add Book");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                .addGap(205, 205, 205)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaLabel)
                    .addComponent(judulBukuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaLabel1)
                    .addComponent(penulisBukuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaLabel2)
                    .addComponent(penerbitBukuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaLabel3)
                    .addComponent(halamanBukuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaLabel4)
                    .addComponent(jumlahBukuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 60, 502, 330);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked

        dispose();
        Admin admin = new Admin();
        admin.setVisible(true);
    }//GEN-LAST:event_closeButtonMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            
            DBConnection.AccessDatabase();
            setKodeBuku();
            DBConnection.sql = "INSERT INTO tabel_buku (`kode_buku`, "
                    + "`judul_buku`, `penulis_buku`, `penerbit_buku`, "
                    + "`halaman_buku`, `jumlah_buku`) VALUES "
                    + "('" + kodeBuku + "','" + judulBukuTextField.getText()
                    + "','" + penulisBukuTextField.getText() + "','"
                    + penerbitBukuTextField.getText() + "','" 
                    + halamanBukuTextField.getText() + "','"
                    + jumlahBukuTextField.getText() +"');";                  
            DBConnection.statement = DBConnection.connection.createStatement();
            DBConnection.statement.executeUpdate(DBConnection.sql);
            JOptionPane.showMessageDialog(null, "Data buku baru berhasil"
                    + " ditambahkan");
            dispose();
            Admin admin = new Admin();
            admin.setVisible(true);
            
        } catch (Exception exception) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void minimizeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeButtonMouseClicked

    private void setKodeBuku()
    {
        try {
            
            DBConnection.AccessDatabase();
            DBConnection.sql = "SELECT kode_buku from tabel_buku";
            DBConnection.statement = DBConnection.connection.createStatement();
            DBConnection.statement.executeUpdate(DBConnection.sql);
            DBConnection.resultSet = DBConnection.statement.executeQuery
                                             (DBConnection.sql);
            
            if(DBConnection.resultSet.next())
            {
                while(DBConnection.resultSet.next())
                {   
                }

                String kodeContainer = DBConnection.resultSet.getString(1);

                //kode_buku generator
                int container = 0;
                container = Integer.parseInt(kodeContainer);
                container++;
                kodeBuku = Integer.toString(container);
                
            } else
            {
                kodeBuku = "0";
            }
  
        } catch (Exception exception) {
            
        }
    }
    
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
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closeButton;
    private javax.swing.JTextField halamanBukuTextField;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel headerLabelAddBook;
    private javax.swing.JButton jButton1;
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
    // End of variables declaration//GEN-END:variables
}
