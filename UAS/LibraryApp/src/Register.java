import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {
    
    char sex;
    
    public Register() {
        
        initComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        minimizeButton = new javax.swing.JLabel();
        closeButton = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        namaLabel = new javax.swing.JLabel();
        NIMLabel = new javax.swing.JLabel();
        jenisKelaminLabel = new javax.swing.JLabel();
        newUsernameLabel = new javax.swing.JLabel();
        rePasswordLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        bodyHeaderLabel2 = new javax.swing.JLabel();
        namaTextField = new javax.swing.JTextField();
        NIMTextField = new javax.swing.JTextField();
        sexComboBox = new javax.swing.JComboBox<>();
        semesterTextField = new javax.swing.JTextField();
        newUsernameTextField = new javax.swing.JTextField();
        registerButton = new javax.swing.JButton();
        haveAccountButton = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        bodyHeaderLabel3 = new javax.swing.JLabel();
        passwordLabel2 = new javax.swing.JLabel();
        newPasswordTextField = new javax.swing.JPasswordField();
        newRePasswordTextField = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(670, 500));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 140, 0));

        minimizeButton.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        minimizeButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizeButton.setText("-");

        closeButton.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        closeButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeButton.setText("X");
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(652, Short.MAX_VALUE)
                .addComponent(minimizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(closeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minimizeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 740, 60);

        jPanel2.setBackground(new java.awt.Color(255, 215, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(720, 370));

        namaLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        namaLabel.setText("Nama");

        NIMLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        NIMLabel.setText("NIM");

        jenisKelaminLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jenisKelaminLabel.setText("Jenis Kelamin");

        newUsernameLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        newUsernameLabel.setText("New username");

        rePasswordLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        rePasswordLabel.setText("Retype Password");

        passwordLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        passwordLabel.setText("Password");

        bodyHeaderLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        bodyHeaderLabel2.setText("Please create your account");

        namaTextField.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N

        NIMTextField.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N

        sexComboBox.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        sexComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male ", "Female" }));

        semesterTextField.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N

        newUsernameTextField.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N

        registerButton.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        registerButton.setText("Register");
        registerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerButtonMouseClicked(evt);
            }
        });

        haveAccountButton.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        haveAccountButton.setText("Already have an account?");

        loginButton.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        loginButton.setText("Login");
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });

        bodyHeaderLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        bodyHeaderLabel3.setText("Please insert your data");

        passwordLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        passwordLabel2.setText("Semester");

        jPanel3.setBackground(new java.awt.Color(255, 140, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(bodyHeaderLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NIMLabel)
                            .addComponent(namaLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(namaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(NIMTextField)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(passwordLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(semesterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jenisKelaminLabel)
                                .addGap(18, 18, 18)
                                .addComponent(sexComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(registerButton)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(bodyHeaderLabel2)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newUsernameLabel)
                            .addComponent(passwordLabel)
                            .addComponent(rePasswordLabel))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newRePasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(haveAccountButton)
                .addGap(47, 47, 47)
                .addComponent(loginButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bodyHeaderLabel3)
                                    .addComponent(bodyHeaderLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(newUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(newUsernameLabel)
                                    .addComponent(namaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(namaLabel))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(newPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordLabel)
                                    .addComponent(NIMTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NIMLabel))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jenisKelaminLabel)
                                    .addComponent(sexComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rePasswordLabel)
                                    .addComponent(newRePasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(semesterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(passwordLabel2)))
                        .addComponent(registerButton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(haveAccountButton)
                    .addComponent(loginButton))
                .addGap(105, 105, 105))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 60, 740, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        
        dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_closeButtonMouseClicked

    private void registerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseClicked
       
        if(((String)sexComboBox.getSelectedItem()) == "Male"){
           
           sex = 'M';
           
       } else
       {
           sex = 'F';
       }
       
        while(!IsRePasswordCorrect())
        {
            JOptionPane.showMessageDialog(null, "Password and Retype Password"
                    + " must contain the same value");
        }
        
        try {
            
            DBConnection.AccessDatabase();
            DBConnection.sql = "INSERT INTO `tabel_anggota`(`username`, "
                    + "`password`, `nama_anggota`, `NIM_anggota`, "
                    + "`jenis_kelamin`, `semester_anggota`) VALUES ('" + 
                    newUsernameTextField.getText() + "','" + 
                    newPasswordTextField.getText() + "','" +
                    namaTextField.getText() + "','" + NIMTextField.getText() +
                    "','" + sex + "','" + semesterTextField.getText() + "')";
            DBConnection.statement = DBConnection.connection.createStatement();
            DBConnection.statement.executeUpdate(DBConnection.sql);
            JOptionPane.showMessageDialog(null, "Data successly saved");
            
        } catch (Exception exception) {
            
            JOptionPane.showMessageDialog(null, "Something wrong happened");
            System.out.println(exception.getMessage());          
        }
        
    }//GEN-LAST:event_registerButtonMouseClicked

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        dispose();
        Login loginForm = new Login();
        loginForm.setVisible(true);
    }//GEN-LAST:event_loginButtonMouseClicked

    private boolean IsRePasswordCorrect()
    {
        String password = newPasswordTextField.getText();
        String rePassword = newRePasswordTextField.getText();
        
        if(password.equals(rePassword))
        {
            return true;
            
        } else
        {
            return false;
        }
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NIMLabel;
    private javax.swing.JTextField NIMTextField;
    private javax.swing.JLabel bodyHeaderLabel2;
    private javax.swing.JLabel bodyHeaderLabel3;
    private javax.swing.JLabel closeButton;
    private javax.swing.JLabel haveAccountButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jenisKelaminLabel;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel minimizeButton;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JTextField namaTextField;
    private javax.swing.JPasswordField newPasswordTextField;
    private javax.swing.JPasswordField newRePasswordTextField;
    private javax.swing.JLabel newUsernameLabel;
    private javax.swing.JTextField newUsernameTextField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel passwordLabel2;
    private javax.swing.JLabel rePasswordLabel;
    private javax.swing.JButton registerButton;
    private javax.swing.JTextField semesterTextField;
    private javax.swing.JComboBox<String> sexComboBox;
    // End of variables declaration//GEN-END:variables
}
