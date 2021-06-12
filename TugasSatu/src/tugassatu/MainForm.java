package tugassatu;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class MainForm extends javax.swing.JFrame 
{
    public MainForm() 
    {
        initComponents();
        ShowData();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() 
    {
        headerPanel = new javax.swing.JPanel();
        closeButton = new javax.swing.JLabel();
        minimizeButton = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();
        newDataButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelPengguna = new javax.swing.JTable();
        masukkanKodeLabel = new javax.swing.JLabel();
        kodeTextField = new javax.swing.JTextField();
        findDataButton = new javax.swing.JButton();
        changeDataButtton = new javax.swing.JButton();
        deleteDataButton1 = new javax.swing.JButton();
        cetakDanaDaruratButton = new javax.swing.JButton();
        cetakDanaPensiunButton = new javax.swing.JButton();
        cetakPerencanaanKeuanganButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        headerPanel.setBackground(new java.awt.Color(178, 141, 255));

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

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Financial Planner");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap(225, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164)
                .addComponent(minimizeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minimizeButton)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        getContentPane().add(headerPanel);
        headerPanel.setBounds(0, 0, 670, 70);

        bodyPanel.setBackground(new java.awt.Color(220, 211, 255));

        newDataButton.setText("Data Baru");
        newDataButton.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                newDataButtonActionPerformed(evt);
            }
        });

        tabelPengguna.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Kode Pengguna", "Nama Pengguna", "Usia Pengguna"
            }
        ) {
            Class[] types = new Class [] 
            {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) 
            {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelPengguna);
        if (tabelPengguna.getColumnModel().getColumnCount() > 0) 
        {
            tabelPengguna.getColumnModel().getColumn(0).setMinWidth(130);
            tabelPengguna.getColumnModel().getColumn(0).setMaxWidth(130);
            tabelPengguna.getColumnModel().getColumn(1).setMinWidth(250);
            tabelPengguna.getColumnModel().getColumn(1).setMaxWidth(250);
            tabelPengguna.getColumnModel().getColumn(2).setMinWidth(150);
            tabelPengguna.getColumnModel().getColumn(2).setMaxWidth(150);
        }

        masukkanKodeLabel.setText("Masukkan Kode");

        findDataButton.setText("Cari Data");
        findDataButton.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                findDataButtonActionPerformed(evt);
            }
        });

        changeDataButtton.setText("Ubah Data");
        changeDataButtton.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                changeDataButttonActionPerformed(evt);
            }
        });

        deleteDataButton1.setText("Hapus Data");
        deleteDataButton1.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                deleteDataButton1ActionPerformed(evt);
            }
        });

        cetakDanaDaruratButton.setText("Cetak Dana Darurat");
        cetakDanaDaruratButton.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cetakDanaDaruratButtonActionPerformed(evt);
            }
        });

        cetakDanaPensiunButton.setText("Cetak Dana Pensiun");
        cetakDanaPensiunButton.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                cetakDanaPensiunButtonActionPerformed(evt);
            }
        });

        cetakPerencanaanKeuanganButton.setText("Cetak Perencanaan Keuangan");
        cetakPerencanaanKeuanganButton.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                cetakPerencanaanKeuanganButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(masukkanKodeLabel)
                        .addGap(75, 75, 75)
                        .addComponent(kodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                        .addComponent(newDataButton)
                        .addGap(30, 30, 30)
                        .addComponent(findDataButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cetakDanaDaruratButton)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                        .addComponent(changeDataButtton)
                        .addGap(25, 25, 25)
                        .addComponent(deleteDataButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                                .addComponent(cetakDanaPensiunButton)
                                .addGap(56, 56, 56))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                                .addComponent(cetakPerencanaanKeuanganButton)
                                .addContainerGap())))))
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(masukkanKodeLabel)
                    .addComponent(kodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(newDataButton)
                        .addComponent(findDataButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                        .addComponent(cetakDanaDaruratButton)
                        .addGap(9, 9, 9)))
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(changeDataButtton)
                            .addComponent(deleteDataButton1)))
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(cetakDanaPensiunButton)
                        .addGap(18, 18, 18)
                        .addComponent(cetakPerencanaanKeuanganButton)))
                .addGap(32, 32, 32))
        );

        getContentPane().add(bodyPanel);
        bodyPanel.setBounds(-10, 60, 680, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) 
    {//GEN-FIRST:event_closeButtonMouseClicked
       System.exit((0));
    }//GEN-LAST:event_closeButtonMouseClicked

    private void minimizeButtonMouseClicked(java.awt.event.MouseEvent evt)
    {//GEN-FIRST:event_minimizeButtonMouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeButtonMouseClicked

    private void newDataButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {//GEN-FIRST:event_newDataButtonActionPerformed
        int kodePengguna = SetKodePengguna();
        String namaPengguna = null;
        int usiaPengguna = 0;
        int penghasilanPengguna = 0;
        int pengeluaranPengguna = 0;
        int usiaPensiun = 0;
        int inflasiTahunan = 0;
        
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2, 2, 2));
        
        JTextField namaPenggunaTF = new JTextField(5);
        JTextField usiaPenggunaTF = new JTextField(5);
        JTextField penghasilanPenggunaTF = new JTextField(5);
        JTextField pengeluaranPenggunaTF = new JTextField(5);
        JTextField usiaPensiunTF = new JTextField(5);
        JTextField inflasiTahunanTF = new JTextField(5);
        
        panel.add(new JLabel("Nama Pengguna"));
        panel.add(namaPenggunaTF);
        
        panel.add(new JLabel("Usia Pengguna"));
        panel.add(usiaPenggunaTF);
        
        panel.add(new JLabel("Penghasilan Bulanan"));
        panel.add(penghasilanPenggunaTF);
        
        panel.add(new JLabel("Pengeluaran Bulanan"));
        panel.add(pengeluaranPenggunaTF);
        
        panel.add(new JLabel("Usia Pensiun"));
        panel.add(usiaPensiunTF);
        
        panel.add(new JLabel("% Inflasi Tahunan"));
        panel.add(inflasiTahunanTF);
        
        int option = JOptionPane.showConfirmDialog(frame, panel, "Please fill all the fields",
                     JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        
        if(option == JOptionPane.YES_NO_OPTION)
        {
            try
            {
                namaPengguna = namaPenggunaTF.getText();
                usiaPengguna = Integer.parseInt(usiaPenggunaTF.getText());
                penghasilanPengguna = Integer.parseInt(penghasilanPenggunaTF.getText());
                pengeluaranPengguna = Integer.parseInt(pengeluaranPenggunaTF.getText());
                usiaPensiun = Integer.parseInt(usiaPensiunTF.getText());
                inflasiTahunan = Integer.parseInt(inflasiTahunanTF.getText());
                
            } catch(Exception exception)
            {
                System.out.println(exception.getMessage());
            }           
            
            try 
            {
                DBConnection.AccessDatabase();
                DBConnection.sql = "INSERT INTO `tabel_pengguna`(`kode_pengguna`, "
                                   + "`nama_pengguna`, `usia_pengguna`, `penghasilan_pengguna`, "
                                   + "`pengeluaran_pengguna`, `usia_pensiun`, `inflasi_tahunan`) "
                                   + "VALUES ('" + kodePengguna + "','" + namaPengguna 
                                   + "','" + usiaPengguna + "','" + penghasilanPengguna 
                                   + "','" + pengeluaranPengguna + "','" + usiaPensiun 
                                   + "','" + inflasiTahunan + "')";
                DBConnection.statement = DBConnection.connection.createStatement();
                DBConnection.statement.executeUpdate(DBConnection.sql);
                
                DBConnection.AccessDatabase();
                DBConnection.sql = "INSERT INTO `tabel_perhitungan`(`kode_pengguna`) "
                                   + "VALUES ('" + kodePengguna + "');";
                DBConnection.statement = DBConnection.connection.createStatement();
                DBConnection.statement.executeUpdate(DBConnection.sql);
                
            } catch (Exception exception) 
            {
                JOptionPane.showMessageDialog(null, "Gagal mendapatkan data dari "
                + "database");
            }       
        }
        
        ShowData();
    }//GEN-LAST:event_newDataButtonActionPerformed

    private void findDataButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {//GEN-FIRST:event_findDataButtonActionPerformed
        try 
        {
            int kodePengguna = Integer.parseInt(kodeTextField.getText());
            
            DBConnection.AccessDatabase();
            DBConnection.sql = "SELECT * FROM tabel_pengguna WHERE kode_pengguna = "
                    + kodePengguna + ";";
            DBConnection.statement = DBConnection.connection.createStatement();
            DBConnection.resultSet = DBConnection.statement.executeQuery(DBConnection.sql);
            
            if(DBConnection.resultSet.next())
            {
                String namaPengguna = DBConnection.resultSet.getString(2);
                int usiaPengguna = DBConnection.resultSet.getInt(3);
                int penghasilanPengguna = DBConnection.resultSet.getInt(4);
                int pengeluaranPengguna = DBConnection.resultSet.getInt(5);
                int usiaPensiun = DBConnection.resultSet.getInt(6);
                int inflasiTahunan = (DBConnection.resultSet.getInt(7));

                JOptionPane.showMessageDialog(null, "Kode Pengguna = " + kodePengguna
                        + "\nNama Pengguna = " + namaPengguna + "\nUsia Pengguna = "
                        + usiaPengguna + "\nPengeluaran Pengguna = " + pengeluaranPengguna
                        + "\nUsia Pensiun = " + usiaPensiun + "\nInflasi Tahunan = "
                        + inflasiTahunan + "%");
                
            } else
            {
                JOptionPane.showMessageDialog(null, "Tidak dapat menemukan pengguna"
                        + " dengan kode tersebut");
            } 

        } catch (Exception exception) 
        {
            JOptionPane.showMessageDialog(null, "Gagal mendapatkan data dari "
                + "database");
        }
    }//GEN-LAST:event_findDataButtonActionPerformed

    private void changeDataButttonActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_changeDataButttonActionPerformed
        int kodePengguna = Integer.parseInt(kodeTextField.getText());
        String namaPengguna = null;
        int usiaPengguna = 0;
        int penghasilanPengguna = 0;
        int pengeluaranPengguna = 0;
        int usiaPensiun = 0;
        int inflasiTahunan = 0;
        
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2, 2, 2));
        
        JTextField namaPenggunaTF = new JTextField(5);
        JTextField usiaPenggunaTF = new JTextField(5);
        JTextField penghasilanPenggunaTF = new JTextField(5);
        JTextField pengeluaranPenggunaTF = new JTextField(5);
        JTextField usiaPensiunTF = new JTextField(5);
        JTextField inflasiTahunanTF = new JTextField(5);
        
        panel.add(new JLabel("Nama Pengguna"));
        panel.add(namaPenggunaTF);
        
        panel.add(new JLabel("Usia Pengguna"));
        panel.add(usiaPenggunaTF);
        
        panel.add(new JLabel("Penghasilan Bulanan"));
        panel.add(penghasilanPenggunaTF);
        
        panel.add(new JLabel("Pengeluaran Bulanan"));
        panel.add(pengeluaranPenggunaTF);
        
        panel.add(new JLabel("Usia Pensiun"));
        panel.add(usiaPensiunTF);
        
        panel.add(new JLabel("% Inflasi Tahunan"));
        panel.add(inflasiTahunanTF);
        
        int option = JOptionPane.showConfirmDialog(frame, panel, "Please fill all the fields",
                     JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        
        if(option == JOptionPane.YES_NO_OPTION)
        {
            try
            {
                namaPengguna = namaPenggunaTF.getText();
                usiaPengguna = Integer.parseInt(usiaPenggunaTF.getText());
                penghasilanPengguna = Integer.parseInt(penghasilanPenggunaTF.getText());
                pengeluaranPengguna = Integer.parseInt(pengeluaranPenggunaTF.getText());
                usiaPensiun = Integer.parseInt(usiaPensiunTF.getText());
                inflasiTahunan = Integer.parseInt(inflasiTahunanTF.getText());
                
            } catch(Exception exception)
            {
                System.out.println(exception.getMessage());
            }           
            
            try 
            {
                DBConnection.AccessDatabase();
                DBConnection.sql = "SELECT * FROM tabel_pengguna WHERE kode_pengguna = "
                               + kodePengguna + ";";
                DBConnection.statement = DBConnection.connection.createStatement();
                DBConnection.resultSet = DBConnection.statement.executeQuery
                                            (DBConnection.sql);
            
                if(DBConnection.resultSet.next())
                {
                    DBConnection.sql = "UPDATE `tabel_pengguna` SET `kode_pengguna`='" + kodePengguna 
                                       + "',`nama_pengguna`='" + namaPengguna + "',`usia_pengguna`='"
                                       + usiaPengguna + "',`penghasilan_pengguna`='" + penghasilanPengguna 
                                       + "',`pengeluaran_pengguna`='" + pengeluaranPengguna 
                                       + "',`usia_pensiun`='" + usiaPensiun + "',`inflasi_tahunan`='"
                                        + inflasiTahunan + "' WHERE kode_pengguna = " + kodePengguna + ";";
                    DBConnection.statement = DBConnection.connection.createStatement();
                    DBConnection.statement.executeUpdate(DBConnection.sql);

                    JOptionPane.showMessageDialog(null, "Pengguna berhasil diubah");
                    
                } else
                {
                    JOptionPane.showMessageDialog(null, "Tidak dapat menemukan pengguna"
                                                  + " dengan kode tersebut");            
                }
                
            } catch(Exception exception)
            {
                JOptionPane.showMessageDialog(null, "Gagal mendapatkan data dari "
                    + "database");
            }
        }
        
        ShowData();
    }//GEN-LAST:event_changeDataButttonActionPerformed

    private void deleteDataButton1ActionPerformed(java.awt.event.ActionEvent evt) 
    {//GEN-FIRST:event_deleteDataButton1ActionPerformed
        try
        {
            int kodePengguna = Integer.parseInt(kodeTextField.getText());

            DBConnection.AccessDatabase();
            DBConnection.sql = "SELECT * FROM tabel_pengguna WHERE kode_pengguna = "
                               + kodePengguna + ";";
            DBConnection.statement = DBConnection.connection.createStatement();
            DBConnection.resultSet = DBConnection.statement.executeQuery
                                            (DBConnection.sql);
            
            if(DBConnection.resultSet.next())
            {
                DBConnection.sql = "DELETE FROM tabel_pengguna WHERE kode_pengguna = "
                    + kodePengguna + ";";
                DBConnection.statement = DBConnection.connection.createStatement();
                DBConnection.statement.executeUpdate(DBConnection.sql);

                JOptionPane.showMessageDialog(null, "Pengguna berhasil dihapus!");
                
            } else
            {
                 JOptionPane.showMessageDialog(null, "Tidak dapat menemukan pengguna"
                        + " dengan kode tersebut");            
            }
            
            ShowData();
            
        } catch (Exception exception) 
        {        
            JOptionPane.showMessageDialog(null, "Gagal mendapatkan data dari "
                    + "database");
        }
        
        ShowData();
    }//GEN-LAST:event_deleteDataButton1ActionPerformed

    private void cetakDanaDaruratButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {//GEN-FIRST:event_cetakDanaDaruratButtonActionPerformed
        try 
        {
            DBConnection.AccessDatabase();
            DBConnection.sql = "SELECT * FROM tabel_pengguna;";
            DBConnection.statement = DBConnection.connection.createStatement();
            DBConnection.resultSet = DBConnection.statement.executeQuery
                                                    (DBConnection.sql);
            
            while(DBConnection.resultSet.next())
            {
                int kodePengguna = DBConnection.resultSet.getInt(1);
                int pengeluaranBulanan = DBConnection.resultSet.getInt(5);
                int danaDarurat = pengeluaranBulanan *  6;
                
                DBConnection.AccessDatabase();
                DBConnection.sql = "UPDATE `tabel_perhitungan` SET `dana_darurat`="
                                   + "'" + danaDarurat + "' WHERE kode_pengguna = "
                                   + kodePengguna + ";";
                DBConnection.statement = DBConnection.connection.createStatement();
                DBConnection.statement.executeUpdate(DBConnection.sql);
            }
            
            try
            {
                JasperPrint jasperPrint = net.sf.jasperreports.engine.JasperFillManager.fillReport(getClass().
                                      getResourceAsStream("DanaDarurat.jasper")
                                      , null, DBConnection.AccessDatabaseWithReturn());
                JasperViewer.viewReport(jasperPrint, false);

            } catch(Exception exception)
            {
                JOptionPane.showMessageDialog(null, "Gagal menampilkan file report");
            }
            
        } catch (Exception exception) 
        {
            System.out.println(exception.getMessage());
            JOptionPane.showMessageDialog(null, "Gagal mendapatkan data dari "
                    + "database");
        }
    }//GEN-LAST:event_cetakDanaDaruratButtonActionPerformed

    private void cetakDanaPensiunButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {//GEN-FIRST:event_cetakDanaPensiunButtonActionPerformed
        try 
        {
            DBConnection.AccessDatabase();
            DBConnection.sql = "SELECT * FROM tabel_pengguna;";
            DBConnection.statement = DBConnection.connection.createStatement();
            DBConnection.resultSet = DBConnection.statement.executeQuery
                                                    (DBConnection.sql);
            
            while(DBConnection.resultSet.next())
            {
                int kodePengguna = DBConnection.resultSet.getInt(1);
                int usiaPengguna = DBConnection.resultSet.getInt(3);
                int pengeluaranBulanan = DBConnection.resultSet.getInt(4);
                int usiaPensiun = DBConnection.resultSet.getInt(5);
                int jarakUsia = usiaPengguna - usiaPensiun;
                double inflasiTahunan = (DBConnection.resultSet.getInt(6) / 100);
                double danaPensiun = pengeluaranBulanan * 300;              
                
                for(int i = 0; i < jarakUsia; i++)
                {
                    danaPensiun = danaPensiun + (danaPensiun * inflasiTahunan);
                }
                
                DBConnection.AccessDatabase();
                DBConnection.sql = "UPDATE `tabel_perhitungan` SET `dana_pensiun`="
                                   + "'" + danaPensiun + "' WHERE kode_pengguna = "
                                   + kodePengguna + ";";
                DBConnection.statement = DBConnection.connection.createStatement();
                DBConnection.statement.executeUpdate(DBConnection.sql);
            }
            
            try
            {
                JasperPrint jasperPrint = net.sf.jasperreports.engine.JasperFillManager.fillReport(getClass().
                                      getResourceAsStream("DanaPensiun.jasper")
                                      , null, DBConnection.AccessDatabaseWithReturn());
                JasperViewer.viewReport(jasperPrint, false);

            } catch(Exception exception)
            {
                JOptionPane.showMessageDialog(null, "Gagal menampilkan file report");
            }
            
        } catch (Exception exception) 
        {
            JOptionPane.showMessageDialog(null, "Gagal mendapatkan data dari "
                    + "database");
        }
    }//GEN-LAST:event_cetakDanaPensiunButtonActionPerformed

    private void cetakPerencanaanKeuanganButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakPerencanaanKeuanganButtonActionPerformed
        try 
        {
            DBConnection.AccessDatabase();
            DBConnection.sql = "SELECT * FROM tabel_pengguna;";
            DBConnection.statement = DBConnection.connection.createStatement();
            DBConnection.resultSet = DBConnection.statement.executeQuery
                                                    (DBConnection.sql);
            
            while(DBConnection.resultSet.next())
            {
                int kodePengguna = DBConnection.resultSet.getInt(1);
                int penghasilanPengguna = DBConnection.resultSet.getInt(4);
                double kebutuhan = 0.5 * penghasilanPengguna;
                double keinginan = 0.2 * penghasilanPengguna;
                double tabungan = 0.3 * penghasilanPengguna;
                
                DBConnection.AccessDatabase();
                DBConnection.sql = "UPDATE `tabel_perhitungan` SET `kebutuhan`='"
                                   + kebutuhan + "',`keinginan`='" + keinginan 
                                   + "',`tabungan`='" + tabungan + "' WHERE kode_pengguna = "
                                   + kodePengguna + ";";
                DBConnection.statement = DBConnection.connection.createStatement();
                DBConnection.statement.executeUpdate(DBConnection.sql);
            }
            
            try
            {
                JasperPrint jasperPrint = net.sf.jasperreports.engine.JasperFillManager.fillReport(getClass().
                                      getResourceAsStream("PerencanaanKeuangan.jasper")
                                      , null, DBConnection.AccessDatabaseWithReturn());
                JasperViewer.viewReport(jasperPrint, false);

            } catch(Exception exception)
            {
                System.out.println(exception.getMessage());
                JOptionPane.showMessageDialog(null, "Gagal menampilkan file report");
            }
            
        } catch (Exception exception) 
        {
            System.out.println(exception.getMessage());
            JOptionPane.showMessageDialog(null, "Gagal mendapatkan data dari "
                    + "database");
        }
    }//GEN-LAST:event_cetakPerencanaanKeuanganButtonActionPerformed

    private int SetKodePengguna()
    {
        int container = 0;
        
        try 
        {
            DBConnection.AccessDatabase();
            DBConnection.sql = "SELECT * FROM tabel_pengguna;";
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
            DBConnection.sql = "SELECT * FROM tabel_pengguna;";
            DBConnection.statement = DBConnection.connection.createStatement();
            DBConnection.resultSet = DBConnection.statement.executeQuery
                                    (DBConnection.sql);
            
            DefaultTableModel theTable = new DefaultTableModel();
            theTable.addColumn("Kode Pengguna");
            theTable.addColumn("Nama Penguna");
            theTable.addColumn("Usia Pengguna");         
            
            while(DBConnection.resultSet.next())
            {
                theTable.addRow(new Object[]{DBConnection.resultSet.getInt
                (1), DBConnection.resultSet.getString(2), DBConnection.resultSet.getInt(3)});
            }
            
            tabelPengguna.setModel(theTable);
            
        } catch (Exception Exception) 
        {
            JOptionPane.showMessageDialog(null, "Gagal mendapatkan data dari "
                    + "database");
        }
    }
    
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton cetakDanaDaruratButton;
    private javax.swing.JButton cetakDanaPensiunButton;
    private javax.swing.JButton cetakPerencanaanKeuanganButton;
    private javax.swing.JButton changeDataButtton;
    private javax.swing.JLabel closeButton;
    private javax.swing.JButton deleteDataButton1;
    private javax.swing.JButton findDataButton;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kodeTextField;
    private javax.swing.JLabel masukkanKodeLabel;
    private javax.swing.JLabel minimizeButton;
    private javax.swing.JButton newDataButton;
    private javax.swing.JTable tabelPengguna;
    // End of variables declaration//GEN-END:variables
}