import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ReturnBook extends javax.swing.JFrame 
{
    int NIM;
    
    public ReturnBook(int NIM) 
    {     
        this.NIM = NIM;
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
        jScrollPane3 = new javax.swing.JScrollPane();
        borrowTable = new javax.swing.JTable();
        backButton = new javax.swing.JButton();
        insertCodeLabel = new javax.swing.JLabel();
        kodePeminjamanTextField = new javax.swing.JTextField();
        kembalikanBukuButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        headerPanel.setBackground(new java.awt.Color(255, 140, 0));

        headerLabel.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        headerLabel.setText("Library");

        headerLabelAdmin.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        headerLabelAdmin.setText("ReturnBook");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 250, Short.MAX_VALUE)
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
        headerPanel.setBounds(0, 0, 550, 70);

        bodyPanel.setBackground(new java.awt.Color(255, 215, 0));

        borrowTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode Peminjaman", "Kode Buku", "Jumlah Peminjaman", "Tanggal Peminjaman"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(borrowTable);
        if (borrowTable.getColumnModel().getColumnCount() > 0) {
            borrowTable.getColumnModel().getColumn(0).setMinWidth(140);
            borrowTable.getColumnModel().getColumn(0).setMaxWidth(140);
            borrowTable.getColumnModel().getColumn(1).setMinWidth(100);
            borrowTable.getColumnModel().getColumn(1).setMaxWidth(100);
            borrowTable.getColumnModel().getColumn(2).setMinWidth(150);
            borrowTable.getColumnModel().getColumn(2).setMaxWidth(150);
            borrowTable.getColumnModel().getColumn(3).setMinWidth(160);
            borrowTable.getColumnModel().getColumn(3).setMaxWidth(160);
        }

        backButton.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        insertCodeLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        insertCodeLabel.setText("Kode Peminjaman");

        kembalikanBukuButton.setText("Kembalikan Buku");
        kembalikanBukuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembalikanBukuButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(insertCodeLabel)
                        .addGap(51, 51, 51)
                        .addComponent(kodePeminjamanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(kembalikanBukuButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertCodeLabel)
                    .addComponent(kodePeminjamanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(kembalikanBukuButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backButton)
                .addContainerGap())
        );

        getContentPane().add(bodyPanel);
        bodyPanel.setBounds(0, 70, 550, 320);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked

        dispose();
        MainMenu mainMenu = new MainMenu(NIM);
        mainMenu.setVisible(true);
    }//GEN-LAST:event_closeButtonMouseClicked

    private void minimizeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMouseClicked
        
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeButtonMouseClicked

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        dispose();
        MainMenu mainMenu = new MainMenu(NIM);
        mainMenu.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void kembalikanBukuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembalikanBukuButtonActionPerformed
        try 
        {
            int kodePeminjaman = Integer.parseInt(kodePeminjamanTextField.
                                                  getText());
            int kodePengembalian = SetKodePengembalian();
            int kodeBuku;
            java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().
                                                  getTime());
            
            DBConnection.AccessDatabase();
            DBConnection.sql = "SELECT * FROM tabel_peminjaman WHERE "
                               + "kode_peminjaman = " + kodePeminjaman + ";";
            DBConnection.statement = DBConnection.connection.createStatement();
            DBConnection.resultSet = DBConnection.statement.executeQuery
            (DBConnection.sql);
             
            if(DBConnection.resultSet.next())
            {
                kodeBuku = DBConnection.resultSet.getInt(2);

                DBConnection.AccessDatabase();
                DBConnection.sql = "DELETE FROM tabel_peminjaman WHERE "
                                   + "kode_peminjaman = " + kodePeminjaman  
                                   + ";";
                DBConnection.statement = DBConnection.connection.
                                         createStatement();
                DBConnection.statement.executeUpdate(DBConnection.sql);
                
                DBConnection.AccessDatabase();
                DBConnection.sql = "INSERT INTO `tabel_pengembalian`"
                                   + "(`kode_pengembalian`, `kode_buku`, "
                                   + "`NIM_anggota`, `tanggal_pengembalian`) "
                                   + "VALUES ('" + kodePengembalian + "','" 
                                   + kodeBuku + "','" + NIM + "','" 
                                   + sqlDate + "');";
                DBConnection.statement = DBConnection.connection.
                                         createStatement();
                DBConnection.statement.executeUpdate(DBConnection.sql);
                JOptionPane.showMessageDialog(null, "Book succesfully returned");

            } else
            {
                JOptionPane.showMessageDialog(null, "Invalid borrow code, please"
                    + " insert a valid code");
            }

        } catch (Exception exception) 
        {
            JOptionPane.showMessageDialog(null, "Failed to retrieve data from "
                + "database");
        }
        
        ShowData();
    }//GEN-LAST:event_kembalikanBukuButtonActionPerformed

    private void ShowData()
    {
        try 
        {          
            DBConnection.AccessDatabase();
            DBConnection.sql = "SELECT * FROM tabel_peminjaman WHERE "
                               + "NIM_peminjam = " + NIM + ";";
            DBConnection.statement = DBConnection.connection.createStatement();
            DBConnection.resultSet = DBConnection.statement.executeQuery
                                     (DBConnection.sql);
            
            DefaultTableModel returnTable = new DefaultTableModel();
            returnTable.addColumn("Kode Peminjaman");
            returnTable.addColumn("Kode Buku");
            returnTable.addColumn("Jumlah Peminjaman");
            returnTable.addColumn("Tanggal Peminjaman");
            
            while(DBConnection.resultSet.next())
            {
                returnTable.addRow(new Object[]{DBConnection.resultSet.getInt
                (1),DBConnection.resultSet.getInt(2), 
                DBConnection.resultSet.getInt(4), 
                DBConnection.resultSet.getDate(5)});
            }
            
            borrowTable.setModel(returnTable);
            
        } catch (Exception Exception) 
        {            
            JOptionPane.showMessageDialog(null, "Failed to show data");
        }        
    }
    
    private int SetKodePengembalian()
    {
        int container = -1;
        
        try 
        {
            DBConnection.AccessDatabase();
            DBConnection.sql = "SELECT * FROM tabel_pengembalian;";
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
            
        } catch (Exception exception) 
        {           
            JOptionPane.showMessageDialog(null, "Failed to retrieve data from "
                + "database");
        }
        
        return ++container;
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
    private javax.swing.JButton backButton;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JTable borrowTable;
    private javax.swing.JLabel closeButton;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel headerLabelAdmin;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel insertCodeLabel;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton kembalikanBukuButton;
    private javax.swing.JTextField kodePeminjamanTextField;
    private javax.swing.JLabel minimizeButton;
    // End of variables declaration//GEN-END:variables
}
