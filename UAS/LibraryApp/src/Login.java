import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    
    String adminUsername = "admin";
    String adminPassword = "admin";
    int NIM = 0;
    
    public Login() {
        initComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPanel = new javax.swing.JPanel();
        closeButton = new javax.swing.JLabel();
        minmimizeButton = new javax.swing.JLabel();
        headerLabel = new javax.swing.JLabel();
        headerLabelLogin = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();
        bodyHeader1 = new javax.swing.JLabel();
        bodyHeader2 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        bodyFooter = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        headerPanel.setBackground(new java.awt.Color(255, 140, 0));

        closeButton.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        closeButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeButton.setText("X");
        closeButton.setToolTipText("");
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });

        minmimizeButton.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        minmimizeButton.setText("-");
        minmimizeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minmimizeButtonMouseClicked(evt);
            }
        });

        headerLabel.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        headerLabel.setText("Library");

        headerLabelLogin.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        headerLabelLogin.setText("Login");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(headerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(headerLabelLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(minmimizeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(minmimizeButton))
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(headerLabelLogin)
                            .addComponent(headerLabel))))
                .addGap(2, 2, 2))
        );

        getContentPane().add(headerPanel);
        headerPanel.setBounds(0, 0, 360, 60);

        bodyPanel.setBackground(new java.awt.Color(255, 215, 0));

        bodyHeader1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        bodyHeader1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bodyHeader1.setText("Welcome,");

        bodyHeader2.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        bodyHeader2.setText("Please insert your Username and password");

        loginButton.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        registerButton.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        bodyFooter.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        bodyFooter.setText("Not a member yet?");

        usernameLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        usernameLabel.setText("Username");

        passwordLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        passwordLabel.setText("Password");

        usernameTextField.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N

        passwordTextField.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(bodyHeader1))
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(loginButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(bodyHeader2)
                .addGap(53, 53, 53))
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(bodyFooter)
                        .addGap(38, 38, 38)
                        .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordLabel)
                            .addComponent(usernameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(usernameTextField))
                        .addGap(10, 10, 10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(bodyHeader1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bodyHeader2)
                .addGap(39, 39, 39)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(loginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bodyFooter)
                    .addComponent(registerButton))
                .addGap(58, 58, 58))
        );

        getContentPane().add(bodyPanel);
        bodyPanel.setBounds(0, 60, 360, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        
        try{
            
            DBConnection.AccessDatabase();
            DBConnection.sql = "SELECT * FROM tabel_anggota WHERE username "
                    + "= '" + usernameTextField.getText() + "' AND password "
                    + "= '" + passwordTextField.getText() + "';"; 
            DBConnection.statement = DBConnection.connection.createStatement();
            DBConnection.resultSet = DBConnection.statement.executeQuery
                                     (DBConnection.sql);
            DBConnection.resultSet.next();
            int rowCount = DBConnection.resultSet.getRow();
            
            if(IsAdmin()){
                
                usernameTextField.setText("");
                passwordTextField.setText("");
                dispose();
                Admin admin = new Admin();
                admin.setVisible(true);
                
            } else if(rowCount == 0){
                
                JOptionPane.showMessageDialog(null, "Username or Password "
                        + "input is wrong");
                
            } else {
                
                setNIM();
                usernameTextField.setText("");
                passwordTextField.setText("");
                dispose();
                MainMenu mainMenu = new MainMenu(NIM);
                mainMenu.setVisible(true);
            }
            
        } catch(Exception exception){
            
            JOptionPane.showMessageDialog(null, "Something wrong happened");
            System.out.println(exception.getMessage());
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        
        try {
            
            usernameTextField.setText("");
            passwordTextField.setText("");
            dispose();
            Register registerForm = new Register();
            registerForm.setVisible(true);
            
        } catch (Exception exception) {
            
            JOptionPane.showMessageDialog(null, "Failed close Statement");
            System.out.println(exception.getMessage());
        }
    }//GEN-LAST:event_registerButtonActionPerformed

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeButtonMouseClicked

    private void minmimizeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minmimizeButtonMouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minmimizeButtonMouseClicked

    private void setNIM()
    {
        try {
            
            DBConnection.AccessDatabase();
            DBConnection.sql = "SELECT * FROM tabel_anggota WHERE username "
                    + "= '" + usernameTextField.getText() + "' AND password "
                    + "= '" + passwordTextField.getText() + "';";
            DBConnection.statement = DBConnection.connection.createStatement();
            DBConnection.resultSet = DBConnection.statement.executeQuery
                                             (DBConnection.sql);
            DBConnection.resultSet.next();
            NIM = DBConnection.resultSet.getInt(4);
            
        } catch (Exception exception) {
        }
    }
    
    private boolean IsAdmin()
    {
        if(adminUsername.equals(usernameTextField.getText()) && 
                adminPassword.equals(passwordTextField.getText()))
        {
            return true;
            
        } else
        {
            return false;
        }
    }
    
    public static void main(String args[]) {
        
        try {
            
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.
                    UIManager.getInstalledLookAndFeels()) {
                
                if ("Nimbus".equals(info.getName())) {
                    
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            
        } catch (ClassNotFoundException ex) {
            
            java.util.logging.Logger.getLogger(Login.class.getName()).log
            (java.util.logging.Level.SEVERE, null, ex);
        
        } catch (InstantiationException ex) {
            
            java.util.logging.Logger.getLogger(Login.class.getName()).log
            (java.util.logging.Level.SEVERE, null, ex);
            
        } catch (IllegalAccessException ex) {
            
            java.util.logging.Logger.getLogger(Login.class.getName()).log
            (java.util.logging.Level.SEVERE, null, ex);
            
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            
            java.util.logging.Logger.getLogger(Login.class.getName()).log
            (java.util.logging.Level.SEVERE, null, ex);
            
        }
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bodyFooter;
    private javax.swing.JLabel bodyHeader1;
    private javax.swing.JLabel bodyHeader2;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JLabel closeButton;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel headerLabelLogin;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel minmimizeButton;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}