import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class BorrowBook extends javax.swing.JFrame 
{
    int NIM;
    
    public BorrowBook(int NIM) 
    {
        this.NIM = NIM;
        initComponents();
        ShowData();
        kodeBukuTextField.requestFocus();
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
        backButton = new javax.swing.JButton();
        insertCodeLabel = new javax.swing.JLabel();
        jumlahBukuTextField = new javax.swing.JTextField();
        pinjamBukuButton = new javax.swing.JButton();
        insertCodeLabel1 = new javax.swing.JLabel();
        kodeBukuTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 140, 0));

        headerLabel.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        headerLabel.setText("Library");

        headerLabelAdmin.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        headerLabelAdmin.setText("BorrowBook");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 284, Short.MAX_VALUE)
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
        jPanel1.setBounds(0, 0, 590, 70);

        jPanel2.setBackground(new java.awt.Color(255, 215, 0));

        theBookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Kode Buku", "Judul Buku", "Penulis Buku"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(theBookTable);

        backButton.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        backButton.setText("Kembali");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        insertCodeLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        insertCodeLabel.setText("Kode Buku");

        pinjamBukuButton.setText("Pinjam Buku");
        pinjamBukuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinjamBukuButtonActionPerformed(evt);
            }
        });

        insertCodeLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        insertCodeLabel1.setText("Jumlah Buku");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(insertCodeLabel)
                .addGap(18, 18, 18)
                .addComponent(kodeBukuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(insertCodeLabel1)
                .addGap(18, 18, 18)
                .addComponent(jumlahBukuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(pinjamBukuButton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertCodeLabel)
                    .addComponent(jumlahBukuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertCodeLabel1)
                    .addComponent(kodeBukuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(pinjamBukuButton)
                .addGap(2, 2, 2)
                .addComponent(backButton)
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 70, 590, 330);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) 
    {//GEN-FIRST:event_closeButtonMouseClicked
        dispose();
        MainMenu mainMenu = new MainMenu(NIM);
        mainMenu.setVisible(true);
    }//GEN-LAST:event_closeButtonMouseClicked

    private void minimizeButtonMouseClicked(java.awt.event.MouseEvent evt) 
    {//GEN-FIRST:event_minimizeButtonMouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeButtonMouseClicked

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        MainMenu mainMenu = new MainMenu(NIM);
        mainMenu.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void pinjamBukuButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {//GEN-FIRST:event_pinjamBukuButtonActionPerformed
        java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().
                                                  getTime());
        int kodePeminjaman;
        int kodeBuku = Integer.parseInt(kodeBukuTextField.getText());
        int jumlahBuku = Integer.parseInt(jumlahBukuTextField.getText());
        int bukuTersedia = 0;
        
        try
        {  
            DBConnection.AccessDatabase();
            DBConnection.sql = "SELECT * FROM tabel_buku WHERE kode_buku = "
                               + kodeBuku + ";";
            DBConnection.statement = DBConnection.connection.createStatement();
            DBConnection.resultSet = DBConnection.statement.executeQuery
            (DBConnection.sql);
            
            if(DBConnection.resultSet.next())
            {
                bukuTersedia = DBConnection.resultSet.getInt(6);
                
                DBConnection.AccessDatabase();
                DBConnection.sql = "SELECT * FROM tabel_peminjaman WHERE "
                                   + "NIM_peminjam = "+ NIM + ";";
                DBConnection.statement = DBConnection.connection.createStatement();
                DBConnection.resultSet = DBConnection.statement.executeQuery
                (DBConnection.sql);
                
                if(DBConnection.resultSet.next())
                {
                    JOptionPane.showMessageDialog(null, "Hanya bisa meminjam "
                                                  + "satu kali");
                    
                } else
                {                                                                    
                    if(jumlahBuku <= bukuTersedia)
                    {
                        kodePeminjaman = SetKodePeminjaman();
                    
                        DBConnection.AccessDatabase();
                        DBConnection.sql = "INSERT INTO `tabel_peminjaman`"
                                       + "(`kode_peminjaman`, `kode_buku`, "
                                       + "`NIM_peminjam`,"+ "`jumlah_peminjaman`, "
                                       + "`tanggal_peminjaman`) " + "VALUES ('" 
                                       + kodePeminjaman + "','" + kodeBuku + "','" 
                                       + NIM + "','" + jumlahBuku + "','" + sqlDate + "');";
                        DBConnection.statement = DBConnection.connection.
                                             createStatement();
                        DBConnection.statement.executeUpdate(DBConnection.sql);
                        
                        bukuTersedia--;
            
                        DBConnection.AccessDatabase();                   
                        DBConnection.sql = "UPDATE `tabel_buku` SET `jumlah_buku` "
                                       + "= '" + bukuTersedia + "' WHERE "
                                       + "kode_buku = '" + kodeBuku + "';";
                        DBConnection.statement = DBConnection.connection.
                                             createStatement();
                        DBConnection.statement.executeUpdate(DBConnection.sql);
                        
                        JOptionPane.showMessageDialog(null, "Buku berhasil "
                                                      + "dipinjam!");
                        
                        try
                        {
                            JasperPrint jasperPrint = net.sf.jasperreports.engine.JasperFillManager.fillReport(getClass().
                                      getResourceAsStream("BorrowingReport.jasper")
                                      , null, DBConnection.AccessDatabaseWithReturn());
                            JasperViewer.viewReport(jasperPrint, false);

                        } catch(Exception exception)
                        {
                            JOptionPane.showMessageDialog(null, "Gagal menampilkan file report");
                        }
                        
                    } else
                    {
                        JOptionPane.showMessageDialog(null, "Buku dengan jumlah"
                                                      + " tersebut tidak tersedia");
                    }
                }
                
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
    }//GEN-LAST:event_pinjamBukuButtonActionPerformed

    
    private int SetKodePeminjaman()
    {
        int container = 0;
        
        try 
        {
            DBConnection.AccessDatabase();
            DBConnection.sql = "SELECT * FROM tabel_peminjaman;";
            DBConnection.statement = DBConnection.connection.createStatement();
            DBConnection.resultSet = DBConnection.statement.executeQuery
                                     (DBConnection.sql);
            
            if(DBConnection.resultSet.next())
            {
                container = DBConnection.resultSet.getInt(1);
                
                while(DBConnection.resultSet.next())
                {
                    container = DBConnection.resultSet.getInt(1);
                }
            }
            
        } catch (Exception exception) {
            
            JOptionPane.showMessageDialog(null, "Gagal mendapatkan data dari "
                + "database");
        }
        
        return ++container;
    }
    
    private void ShowData()    
    {
         try 
         {            
            DBConnection.AccessDatabase();
            DBConnection.sql = "SELECT * FROM tabel_buku;";
            DBConnection.statement = DBConnection.connection.createStatement();
            DBConnection.resultSet = DBConnection.statement.executeQuery
                                     (DBConnection.sql);
            
            DefaultTableModel bookTable = new DefaultTableModel();
            bookTable.addColumn("Kode Buku");
            bookTable.addColumn("Judul Buku");
            bookTable.addColumn("Penulis Buku");
            
            while(DBConnection.resultSet.next())
            {
                bookTable.addRow(new Object[]{DBConnection.resultSet.getInt
                (1),DBConnection.resultSet.getString(2), 
                DBConnection.resultSet.getString(3)});
            }
            
            theBookTable.setModel(bookTable);
            
        } catch (Exception exception) {
            
            JOptionPane.showMessageDialog(null, "Gagal mendapatkan data dari "
                    + "database");
        }
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel closeButton;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel headerLabelAdmin;
    private javax.swing.JLabel insertCodeLabel;
    private javax.swing.JLabel insertCodeLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jumlahBukuTextField;
    private javax.swing.JTextField kodeBukuTextField;
    private javax.swing.JLabel minimizeButton;
    private javax.swing.JButton pinjamBukuButton;
    private javax.swing.JTable theBookTable;
    // End of variables declaration//GEN-END:variables
}
