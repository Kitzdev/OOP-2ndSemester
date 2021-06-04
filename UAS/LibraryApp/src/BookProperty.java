import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BookProperty extends javax.swing.JFrame 
{
    public BookProperty() 
    {
        initComponents();
        ShowData();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() 
    {
        headerPanel = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        bookPropertyLabel = new javax.swing.JLabel();
        closeButton = new javax.swing.JLabel();
        minimizeButton = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();
        tabelBuku = new javax.swing.JScrollPane();
        theBookTable = new javax.swing.JTable();
        masukanKodeBukuLabel = new javax.swing.JLabel();
        kodeBukuTextField = new javax.swing.JTextField();
        cariBukuButton = new javax.swing.JButton();
        ubahBukuButton = new javax.swing.JButton();
        hapusBukuButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        headerPanel.setBackground(new java.awt.Color(255, 140, 0));

        headerLabel.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        headerLabel.setText("Library");

        bookPropertyLabel.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        bookPropertyLabel.setText("BookProperty");

        closeButton.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        closeButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeButton.setText("X");
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent evt) 
            {
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

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookPropertyLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 395, Short.MAX_VALUE)
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
                    .addComponent(bookPropertyLabel)
                    .addComponent(headerLabel))
                .addContainerGap())
        );

        getContentPane().add(headerPanel);
        headerPanel.setBounds(0, 0, 710, 70);

        bodyPanel.setBackground(new java.awt.Color(255, 215, 0));

        theBookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] 
            {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] 
            {
                "Kode Buku", "Judul Buku"
            }
        ) {
            Class[] types = new Class [] 
            {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) 
            {
                return types [columnIndex];
            }
        });
        tabelBuku.setViewportView(theBookTable);
        if (theBookTable.getColumnModel().getColumnCount() > 0) 
        {
            theBookTable.getColumnModel().getColumn(0).setMinWidth(200);
            theBookTable.getColumnModel().getColumn(0).setMaxWidth(200);
        }

        masukanKodeBukuLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        masukanKodeBukuLabel.setText("Masukkan Kode Buku");

        kodeBukuTextField.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N

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

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabelBuku, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(masukanKodeBukuLabel)
                .addGap(30, 30, 30)
                .addComponent(kodeBukuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(cariBukuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ubahBukuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(hapusBukuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(tabelBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(masukanKodeBukuLabel)
                    .addComponent(kodeBukuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cariBukuButton)
                    .addComponent(ubahBukuButton)
                    .addComponent(hapusBukuButton))
                .addGap(45, 45, 45))
        );

        getContentPane().add(bodyPanel);
        bodyPanel.setBounds(0, 70, 710, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) 
    {//GEN-FIRST:event_closeButtonMouseClicked
        dispose();
        Admin admin = new Admin();
        admin.setVisible(true);
    }//GEN-LAST:event_closeButtonMouseClicked

    private void cariBukuButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {//GEN-FIRST:event_cariBukuButtonActionPerformed
        try 
        {    
            int kodeBuku = Integer.parseInt(kodeBukuTextField.getText());
            
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
    }//GEN-LAST:event_cariBukuButtonActionPerformed

    private void ubahBukuButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {//GEN-FIRST:event_ubahBukuButtonActionPerformed
        int kodeBuku;
        String judulBuku;
        String penulisBuku;
        String penerbitBuku;
        int halamanBuku;
        int jumlahBuku;
                
        try 
        {       
            dispose();
            kodeBuku = Integer.parseInt(kodeBukuTextField.getText());

            DBConnection.AccessDatabase();
            DBConnection.sql = "SELECT * FROM tabel_buku WHERE kode_buku = "
                    + kodeBuku + ";";
            DBConnection.statement = DBConnection.connection.createStatement();
            DBConnection.resultSet = DBConnection.statement.executeQuery
                                                    (DBConnection.sql);
            
            if(DBConnection.resultSet.next())
            {
                judulBuku = DBConnection.resultSet.getString(2);
                penulisBuku = DBConnection.resultSet.getString(3);
                penerbitBuku = DBConnection.resultSet.getString(4);
                halamanBuku = DBConnection.resultSet.getInt(5);
                jumlahBuku = DBConnection.resultSet.getInt(6);
                
                UpdateBook updateBook = new UpdateBook(kodeBuku, judulBuku, 
                        penulisBuku, penerbitBuku, halamanBuku, jumlahBuku);
                updateBook.setVisible(true);
                
            } else
            {
                JOptionPane.showMessageDialog(null, "Cannot find book with that"
                        + " code");
            }
              
        } catch(Exception exception)
        {
            JOptionPane.showMessageDialog(null, "Failed to retrieve data from"
                    + "database");
        }                                
    }//GEN-LAST:event_ubahBukuButtonActionPerformed

    private void hapusBukuButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {//GEN-FIRST:event_hapusBukuButtonActionPerformed
        try
        {
            String kodeBuku = kodeBukuTextField.getText();

            DBConnection.AccessDatabase();
            DBConnection.sql = "SELECT * FROM tabel_buku WHERE kode_buku = "
                    + kodeBuku + ";";
            DBConnection.statement = DBConnection.connection.createStatement();
            DBConnection.resultSet = DBConnection.statement.executeQuery
                                            (DBConnection.sql);
            
            if(DBConnection.resultSet.next())
            {
                DBConnection.sql = "DELETE FROM tabel_buku WHERE kode_buku = "
                    + kodeBuku + ";";
                DBConnection.statement = DBConnection.connection.createStatement
                                         ();
                DBConnection.statement.executeUpdate(DBConnection.sql);

                JOptionPane.showMessageDialog(null, "Book has been deleted");
                
            } else
            {
                JOptionPane.showMessageDialog(null, "Cannot find book with that"
                        + " code");
            }
            
            ShowData();
            
        } catch (Exception exception) 
        {        
            JOptionPane.showMessageDialog(null, "Failed to retrieve data from "
                    + "database");
        }
    }//GEN-LAST:event_hapusBukuButtonActionPerformed

    private void minimizeButtonMouseClicked(java.awt.event.MouseEvent evt) 
    {//GEN-FIRST:event_minimizeButtonMouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeButtonMouseClicked

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
            
            while(DBConnection.resultSet.next())
            {
                bookTable.addRow(new Object[]{DBConnection.resultSet.getString
                (1),DBConnection.resultSet.getString(2)});
            }
            
            theBookTable.setModel(bookTable);
            
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
                new BookProperty().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JLabel bookPropertyLabel;
    private javax.swing.JButton cariBukuButton;
    private javax.swing.JLabel closeButton;
    private javax.swing.JButton hapusBukuButton;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JTextField kodeBukuTextField;
    private javax.swing.JLabel masukanKodeBukuLabel;
    private javax.swing.JLabel minimizeButton;
    private javax.swing.JScrollPane tabelBuku;
    private javax.swing.JTable theBookTable;
    private javax.swing.JButton ubahBukuButton;
    // End of variables declaration//GEN-END:variables
}
