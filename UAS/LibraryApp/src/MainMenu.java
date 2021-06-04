import javax.swing.JFrame;

public class MainMenu extends javax.swing.JFrame 
{   
    int NIM;
    
    public MainMenu(int NIM) 
    {      
        this.NIM = NIM;
        initComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPanel = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        headerLabelMainMenu = new javax.swing.JLabel();
        closeButton = new javax.swing.JLabel();
        minimizeButton = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();
        cariBukuButton = new javax.swing.JButton();
        historiPeminjamanButton = new javax.swing.JButton();
        pinjamBukuButton = new javax.swing.JButton();
        kembalikanBukuButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        headerPanel.setBackground(new java.awt.Color(255, 140, 0));

        headerLabel.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        headerLabel.setText("Library");

        headerLabelMainMenu.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        headerLabelMainMenu.setText("MainMenu");

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
                .addGap(23, 23, 23)
                .addComponent(headerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(headerLabelMainMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                .addComponent(minimizeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(closeButton)
                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(closeButton)
                        .addComponent(minimizeButton))
                    .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(headerPanelLayout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(headerLabelMainMenu))
                        .addGroup(headerPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(headerLabel))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(headerPanel);
        headerPanel.setBounds(0, 0, 480, 60);

        bodyPanel.setBackground(new java.awt.Color(255, 215, 0));

        cariBukuButton.setText("Cari Buku");
        cariBukuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariBukuButtonActionPerformed(evt);
            }
        });

        historiPeminjamanButton.setText("Histori Peminjaman");
        historiPeminjamanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historiPeminjamanButtonActionPerformed(evt);
            }
        });

        pinjamBukuButton.setText("Pinjam Buku");
        pinjamBukuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinjamBukuButtonActionPerformed(evt);
            }
        });

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
                .addGap(112, 112, 112)
                .addComponent(historiPeminjamanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(cariBukuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kembalikanBukuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pinjamBukuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(pinjamBukuButton)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(kembalikanBukuButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(historiPeminjamanButton)
                        .addGap(34, 34, 34))
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(cariBukuButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(bodyPanel);
        bodyPanel.setBounds(0, 60, 480, 230);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked

        dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_closeButtonMouseClicked

    private void minimizeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeButtonMouseClicked

    private void cariBukuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariBukuButtonActionPerformed

        dispose();
        ShowBook showBook = new ShowBook(NIM);
        showBook.setVisible(true);
    }//GEN-LAST:event_cariBukuButtonActionPerformed

    private void pinjamBukuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinjamBukuButtonActionPerformed
        
        dispose();
        BorrowBook borrowBook = new BorrowBook(NIM);
        borrowBook.setVisible(true);
    }//GEN-LAST:event_pinjamBukuButtonActionPerformed

    private void historiPeminjamanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historiPeminjamanButtonActionPerformed
        
        dispose();
        BorrowingHistory borrowingHistory = new BorrowingHistory(NIM);
        borrowingHistory.setVisible(true);
    }//GEN-LAST:event_historiPeminjamanButtonActionPerformed

    private void kembalikanBukuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembalikanBukuButtonActionPerformed
        
        dispose();
        ReturnBook returnBook = new ReturnBook(NIM);
        returnBook.setVisible(true);
    }//GEN-LAST:event_kembalikanBukuButtonActionPerformed

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
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton cariBukuButton;
    private javax.swing.JLabel closeButton;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel headerLabelMainMenu;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JButton historiPeminjamanButton;
    private javax.swing.JButton kembalikanBukuButton;
    private javax.swing.JLabel minimizeButton;
    private javax.swing.JButton pinjamBukuButton;
    // End of variables declaration//GEN-END:variables
}
