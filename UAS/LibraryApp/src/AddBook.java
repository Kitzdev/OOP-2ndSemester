import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AddBook extends javax.swing.JFrame {

    int kodeBuku;
    
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
        judulBukuLabel = new javax.swing.JLabel();
        judulBukuTextField = new javax.swing.JTextField();
        penulisBukuLabel = new javax.swing.JLabel();
        penerbitBukuTextField = new javax.swing.JTextField();
        penerbitBukuLabel = new javax.swing.JLabel();
        penulisBukuTextField = new javax.swing.JTextField();
        halamanBukuLabel = new javax.swing.JLabel();
        jumlahBukuTextField = new javax.swing.JTextField();
        jumlahBukuLabel = new javax.swing.JLabel();
        halamanBukuTextField = new javax.swing.JTextField();
        addBookButton = new javax.swing.JButton();

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

        judulBukuLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        judulBukuLabel.setText("Judul Buku");

        judulBukuTextField.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N

        penulisBukuLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        penulisBukuLabel.setText("Penulis Buku");

        penerbitBukuTextField.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N

        penerbitBukuLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        penerbitBukuLabel.setText("Penerbit Buku");

        penulisBukuTextField.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N

        halamanBukuLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        halamanBukuLabel.setText("Halaman Buku");

        jumlahBukuTextField.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N

        jumlahBukuLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jumlahBukuLabel.setText("Jumlah Buku");

        halamanBukuTextField.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N

        addBookButton.setText("Add Book");
        addBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookButtonActionPerformed(evt);
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
                        .addComponent(penulisBukuLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(halamanBukuLabel)
                            .addComponent(penerbitBukuLabel)
                            .addComponent(judulBukuLabel)
                            .addComponent(jumlahBukuLabel))
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
                .addComponent(addBookButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(judulBukuLabel)
                    .addComponent(judulBukuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(penulisBukuLabel)
                    .addComponent(penulisBukuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(penerbitBukuLabel)
                    .addComponent(penerbitBukuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(halamanBukuLabel)
                    .addComponent(halamanBukuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jumlahBukuLabel)
                    .addComponent(jumlahBukuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(addBookButton)
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

    private void addBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookButtonActionPerformed
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
    }//GEN-LAST:event_addBookButtonActionPerformed

    private void minimizeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeButtonMouseClicked

    private void setKodeBuku()
    {
        try {
            
            DBConnection.AccessDatabase();
            DBConnection.sql = "SELECT kode_buku FROM tabel_buku;";
            DBConnection.statement = DBConnection.connection.createStatement();
            DBConnection.resultSet = DBConnection.statement.executeQuery
                                                (DBConnection.sql);
            DBConnection.resultSet.next();
            int rowCount = DBConnection.resultSet.getRow();
            
            if(rowCount == 0)
            {
                kodeBuku = 0;
                System.out.println("Selesai1");
                
            } else
            {
                while(DBConnection.resultSet.next())
                {
                    kodeBuku = DBConnection.resultSet.getInt(1);
                }
                
                kodeBuku++;
                System.out.println("Selesai");
            }
  
        } catch (Exception exception) {
            
            JOptionPane.showMessageDialog(null, "Something wrong happened");
        }
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBookButton;
    private javax.swing.JLabel closeButton;
    private javax.swing.JLabel halamanBukuLabel;
    private javax.swing.JTextField halamanBukuTextField;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel headerLabelAddBook;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel judulBukuLabel;
    private javax.swing.JTextField judulBukuTextField;
    private javax.swing.JLabel jumlahBukuLabel;
    private javax.swing.JTextField jumlahBukuTextField;
    private javax.swing.JLabel minimizeButton;
    private javax.swing.JLabel penerbitBukuLabel;
    private javax.swing.JTextField penerbitBukuTextField;
    private javax.swing.JLabel penulisBukuLabel;
    private javax.swing.JTextField penulisBukuTextField;
    // End of variables declaration//GEN-END:variables
}
