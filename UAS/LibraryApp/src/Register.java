import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame 
{
    char sex;
    
    public Register() 
    {       
        initComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPanel = new javax.swing.JPanel();
        minimizeButton = new javax.swing.JLabel();
        closeButton = new javax.swing.JLabel();
        headerLabel = new javax.swing.JLabel();
        headerLabelRegister = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();
        namaLabel = new javax.swing.JLabel();
        NIMLabel = new javax.swing.JLabel();
        jenisKelaminLabel = new javax.swing.JLabel();
        newUsernameLabel = new javax.swing.JLabel();
        rePasswordLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        createAccountLabel = new javax.swing.JLabel();
        namaTextField = new javax.swing.JTextField();
        NIMTextField = new javax.swing.JTextField();
        sexComboBox = new javax.swing.JComboBox<>();
        semesterTextField = new javax.swing.JTextField();
        newUsernameTextField = new javax.swing.JTextField();
        registerButton = new javax.swing.JButton();
        haveAccountButton = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        insertDataLabel = new javax.swing.JLabel();
        semesterLabel = new javax.swing.JLabel();
        newPasswordTextField = new javax.swing.JPasswordField();
        newRePasswordTextField = new javax.swing.JPasswordField();
        dividerPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(670, 500));
        getContentPane().setLayout(null);

        headerPanel.setBackground(new java.awt.Color(255, 140, 0));

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

        headerLabel.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        headerLabel.setText("Library");

        headerLabelRegister.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        headerLabelRegister.setText("Register");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(headerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(headerLabelRegister)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 431, Short.MAX_VALUE)
                .addComponent(minimizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(closeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minimizeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(headerLabel)
                    .addComponent(headerLabelRegister))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(headerPanel);
        headerPanel.setBounds(0, 0, 740, 60);

        bodyPanel.setBackground(new java.awt.Color(255, 215, 0));
        bodyPanel.setPreferredSize(new java.awt.Dimension(720, 370));

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

        createAccountLabel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        createAccountLabel.setText("Please create your account");

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

        insertDataLabel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        insertDataLabel.setText("Please insert your data");

        semesterLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        semesterLabel.setText("Semester");

        dividerPanel.setBackground(new java.awt.Color(255, 140, 0));

        javax.swing.GroupLayout dividerPanelLayout = new javax.swing.GroupLayout(dividerPanel);
        dividerPanel.setLayout(dividerPanelLayout);
        dividerPanelLayout.setHorizontalGroup(
            dividerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        dividerPanelLayout.setVerticalGroup(
            dividerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(insertDataLabel))
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NIMLabel)
                            .addComponent(namaLabel))
                        .addGap(18, 18, 18)
                        .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(namaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(NIMTextField)))
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(bodyPanelLayout.createSequentialGroup()
                                .addComponent(semesterLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(semesterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bodyPanelLayout.createSequentialGroup()
                                .addComponent(jenisKelaminLabel)
                                .addGap(18, 18, 18)
                                .addComponent(sexComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(dividerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                        .addComponent(registerButton)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                        .addComponent(createAccountLabel)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                        .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newUsernameLabel)
                            .addComponent(passwordLabel)
                            .addComponent(rePasswordLabel))
                        .addGap(28, 28, 28)
                        .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newRePasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(haveAccountButton)
                .addGap(47, 47, 47)
                .addComponent(loginButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bodyPanelLayout.createSequentialGroup()
                                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(insertDataLabel)
                                    .addComponent(createAccountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(newUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(newUsernameLabel)
                                    .addComponent(namaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(namaLabel))
                                .addGap(26, 26, 26)
                                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(newPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordLabel)
                                    .addComponent(NIMTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NIMLabel))
                                .addGap(27, 27, 27)
                                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jenisKelaminLabel)
                                    .addComponent(sexComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rePasswordLabel)
                                    .addComponent(newRePasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24))
                            .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(semesterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(semesterLabel)))
                        .addComponent(registerButton))
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dividerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(19, 19, 19)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(haveAccountButton)
                    .addComponent(loginButton))
                .addGap(105, 105, 105))
        );

        getContentPane().add(bodyPanel);
        bodyPanel.setBounds(0, 60, 740, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) 
    {//GEN-FIRST:event_closeButtonMouseClicked
        dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_closeButtonMouseClicked

    private void registerButtonMouseClicked(java.awt.event.MouseEvent evt) 
    {//GEN-FIRST:event_registerButtonMouseClicked
        if(((String)sexComboBox.getSelectedItem()) == "Male")
        {          
           sex = 'M'; 

        } else
        {
           sex = 'F';
        }
       
        if(!IsRePasswordCorrect())
        {
            JOptionPane.showMessageDialog(null, "Password and Retype Password"
                    + " must contain the same value");
            
        } else if(!IsNIMAvailable())
        {
            JOptionPane.showMessageDialog(null, "NIM " + NIMTextField.getText()
                                          + " already available");
            
        } else
        {
            try 
            {   
            //For security reason, we do not use getText() for password field.
                String passwordContainer = String.valueOf(newPasswordTextField.getPassword());

                DBConnection.AccessDatabase();
                DBConnection.sql = "INSERT INTO `tabel_anggota`(`username`, "
                        + "`password`, `nama_anggota`, `NIM_anggota`, "
                        + "`jenis_kelamin`, `semester_anggota`) VALUES ('" + 
                        newUsernameTextField.getText() + "','" + 
                        passwordContainer + "','" +
                        namaTextField.getText() + "','" + NIMTextField.getText() +
                        "','" + sex + "','" + semesterTextField.getText() + "')";
                DBConnection.statement = DBConnection.connection.createStatement();
                DBConnection.statement.executeUpdate(DBConnection.sql);
                JOptionPane.showMessageDialog(null, "Data successly saved");


                int idMaster = SetIdMaster();

                java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().
                                                      getTime());
                DBConnection.AccessDatabase();
                DBConnection.sql = "INSERT INTO `tabel_master`(`id_master`, "
                                   + "`NIM_anggota`, `periode`) VALUES ('" 
                                   + idMaster + "','" + NIMTextField.getText() 
                                   + "','" + sqlDate + "')";
                DBConnection.statement = DBConnection.connection.createStatement();
                DBConnection.statement.executeUpdate(DBConnection.sql);
            
            } catch (Exception exception) 
            {         
                JOptionPane.showMessageDialog(null, "Something wrong happened, please try again" 
                                                + "later");
                System.out.println(exception.getMessage());          
            }    
        }
        
    }//GEN-LAST:event_registerButtonMouseClicked

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) 
    {//GEN-FIRST:event_loginButtonMouseClicked
        dispose();
        Login loginForm = new Login();
        loginForm.setVisible(true);
    }//GEN-LAST:event_loginButtonMouseClicked

    private boolean IsRePasswordCorrect()
    {
        //For security reason, we do not use getText() for password field.
        String passwordContainer = String.valueOf(newPasswordTextField.getPassword());
        String rePasswordContainer = String.valueOf(newRePasswordTextField.getPassword());
        
        if(passwordContainer.equals(rePasswordContainer))
        {
            return true;
            
        } else
        {
            return false;
        }
    }
    
    private boolean IsNIMAvailable()
    {
        try 
        {        
            int NIM = Integer.parseInt(NIMTextField.getText());
            
            DBConnection.AccessDatabase();
            DBConnection.sql = "SELECT * FROM tabel_anggota WHERE NIM_anggota = " + NIM + ";";
            DBConnection.statement = DBConnection.connection.createStatement();
            DBConnection.resultSet = DBConnection.statement.executeQuery
                                     (DBConnection.sql);
            
            if(!DBConnection.resultSet.next())
            {
                return true;
            } 
            
        } catch (Exception exception) 
        {
            JOptionPane.showMessageDialog(null, "Failed to check NIM availability");
        }   
        
         return false;
    }  
    
   private int SetIdMaster()
    {
        int container = 0;
        
        try 
        {
            DBConnection.AccessDatabase();
            DBConnection.sql = "SELECT * FROM tabel_master;";
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
                + "database, please try again later");
        }
        
        return ++container;
    }
    
    public static void main(String args[]) 
    {
        try 
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) 
            {
                if ("Nimbus".equals(info.getName())) 
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) 
        {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) 
        {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) 
        {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) 
        {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Register().setVisible(true);
            }
        });       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NIMLabel;
    private javax.swing.JTextField NIMTextField;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JLabel closeButton;
    private javax.swing.JLabel createAccountLabel;
    private javax.swing.JPanel dividerPanel;
    private javax.swing.JLabel haveAccountButton;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel headerLabelRegister;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel insertDataLabel;
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
    private javax.swing.JLabel rePasswordLabel;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel semesterLabel;
    private javax.swing.JTextField semesterTextField;
    private javax.swing.JComboBox<String> sexComboBox;
    // End of variables declaration//GEN-END:variables
}