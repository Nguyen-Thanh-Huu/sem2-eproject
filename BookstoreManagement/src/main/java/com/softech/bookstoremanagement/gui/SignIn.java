/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.bookstoremanagement.gui;

import com.formdev.flatlaf.intellijthemes.FlatArcOrangeIJTheme;
import com.softech.bookstoremanagement.database.dao.UsersDao;
import com.softech.bookstoremanagement.database.models.Users;
import com.softech.bookstoremanagement.LoginHelpers.DataValidatorLogin;
import com.softech.bookstoremanagement.LoginHelpers.MessageDialogLogin;
import com.softech.bookstoremanagement.LoginHelpers.SharedDataLogin;
import java.awt.Cursor;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.SQLException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Linh
 */
public class SignIn extends javax.swing.JFrame {
    
    /*
    Application language settings
    */
    private String bundlePath = "com.softech.bookstoremanagement.gui.Bundle";
    private String languageConfigFilePath = "language.properties";

    /**
     * Creates new form SignIn
     */
    public SignIn() {
        initComponents();
        radManager.setActionCommand("manager");
        radCashier.setActionCommand("cashier");
        
        this.setLanguage();
        
//        setIconImage(Toolkit.getDefaultToolkit().getImage("src/main/resources/com/softech/bookstoremanagement/icons/LogoSizeL.png"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radGroupSignIn = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        radCashier = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        radManager = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnSignIn = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("com/softech/bookstoremanagement/gui/Bundle"); // NOI18N
        setTitle(bundle.getString("SignIn.title")); // NOI18N
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(234, 231, 214));
        jPanel1.setPreferredSize(new java.awt.Dimension(440, 242));

        jPanel2.setBackground(new java.awt.Color(234, 231, 214));

        lblLogo.setBackground(new java.awt.Color(234, 231, 214));
        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/softech/bookstoremanagement/icons/LogoSizeL.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(234, 231, 214));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(234, 231, 214));
        jPanel4.setPreferredSize(new java.awt.Dimension(240, 55));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(29, 60, 88));
        jLabel1.setText(bundle.getString("SignIn.jLabel1.text")); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel6.setBackground(new java.awt.Color(234, 231, 214));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(29, 60, 88));
        jLabel2.setText(bundle.getString("SignIn.jLabel2.text")); // NOI18N

        txtUsername.setMaximumSize(new java.awt.Dimension(7, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(29, 60, 88));
        jLabel3.setText(bundle.getString("SignIn.jLabel3.text")); // NOI18N

        txtPassword.setMaximumSize(new java.awt.Dimension(7, 20));

        radCashier.setBackground(new java.awt.Color(234, 231, 214));
        radGroupSignIn.add(radCashier);
        radCashier.setForeground(new java.awt.Color(29, 60, 88));
        radCashier.setText(bundle.getString("SignIn.radCashier.text")); // NOI18N
        radCashier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radCashierActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(234, 231, 214));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(29, 60, 88));
        jLabel4.setText(bundle.getString("SignIn.jLabel4.text")); // NOI18N

        radManager.setBackground(new java.awt.Color(234, 231, 214));
        radGroupSignIn.add(radManager);
        radManager.setForeground(new java.awt.Color(29, 60, 88));
        radManager.setText(bundle.getString("SignIn.radManager.text")); // NOI18N
        radManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radManagerActionPerformed(evt);
            }
        });

        btnSignIn.setBackground(new java.awt.Color(234, 231, 214));
        btnSignIn.setForeground(new java.awt.Color(29, 60, 88));
        btnSignIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/softech/bookstoremanagement/icons/icons8-enter-18.png"))); // NOI18N
        btnSignIn.setText(bundle.getString("SignIn.btnSignIn.text")); // NOI18N
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });

        btnClose.setBackground(new java.awt.Color(234, 231, 214));
        btnClose.setForeground(new java.awt.Color(29, 60, 88));
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/softech/bookstoremanagement/icons/icons8-shutdown-18.png"))); // NOI18N
        btnClose.setText(bundle.getString("SignIn.btnClose.text")); // NOI18N
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radManager, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radCashier, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radManager)
                    .addComponent(radCashier)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSignIn)
                    .addComponent(btnClose))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel6, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void validateSignInInput() {
        StringBuilder warningContent = new StringBuilder();
        String username = txtUsername.getText();
        String password = String.valueOf(txtPassword.getPassword());
        String role = "";
        try {
            role = radGroupSignIn.getSelection().getActionCommand();
        } catch (Exception ex) {
            role = "";
        }

        if (StringUtils.isEmpty(username)) {
            warningContent.append("Username Is Required\n");
        }
        if (StringUtils.isEmpty(password)) {
            warningContent.append("Password Is Required\n");
        }
        if ((role != "manager") && (role != "cashier")) {
            warningContent.append("Role Is Required");
        }
        if (StringUtils.isNotEmpty(warningContent)) {
            JOptionPane.showMessageDialog(this, warningContent, "Sign In Warning\n", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void storeUserInfo(String username) {
        UsersDao usersDao = new UsersDao();
        Users resultUser = null;
        try {
            this.setCursor(new Cursor(Cursor.WAIT_CURSOR));
            resultUser = usersDao.searchByUsername(username);
            this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        } catch (IOException ex) {
//            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        } catch (SQLException ex) {
//            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        String filePath = "signin_info/signin_info.bin";
        try {
            this.setCursor(new Cursor(Cursor.WAIT_CURSOR));
            FileOutputStream signInInfoFileOut = new FileOutputStream(new File(filePath));
            ObjectOutputStream signInInfoObjOut = new ObjectOutputStream(signInInfoFileOut);
            
            signInInfoObjOut.writeObject(resultUser);
            
            signInInfoObjOut.close();
            signInInfoFileOut.close();
            this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        } catch (FileNotFoundException ex) {
//            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        } catch (IOException ex) {
//            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        // TODO add your handling code here:
        validateSignInInput();
        String username = txtUsername.getText();
        String password = String.valueOf(txtPassword.getPassword());
        String role = radGroupSignIn.getSelection().getActionCommand();
        boolean[] validAccount = {false, false};
        UsersDao usersDao = new UsersDao();

        try {
            this.setCursor(new Cursor(Cursor.WAIT_CURSOR));
            validAccount = usersDao.validatePassword(username, password, role);
            this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            System.out.println("Valid Password: " + validAccount[0]);
            System.out.println("Valid Data: " + validAccount[1]);
        } catch (IOException ex) {
//            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        } catch (SQLException ex) {
//            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }

        if (validAccount[0] && validAccount[1] && role == "manager") {
            storeUserInfo(username);
            this.dispose();
            ManagerMain managerMain = new ManagerMain();
            managerMain.setVisible(true);
        } else if (validAccount[0] && validAccount[1] && role == "cashier") {
            storeUserInfo(username);
            this.dispose();
            CashierMain cashierMain = new CashierMain();
            cashierMain.setVisible(true);
        } else {
            this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            JOptionPane.showMessageDialog(this, "Invalid Account", "Account Warning", JOptionPane.WARNING_MESSAGE);
            this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }

//        String username = txtUsername.getText();
//        
//        if (username.equals("manager")) {
//            this.dispose();
//            ManagerMain managerMain = new ManagerMain();
//            managerMain.setVisible(true);
//        } else if (username.equals("cashier")) {
//            this.dispose();
//            CashierMain cashierMain = new CashierMain();
//            cashierMain.setVisible(true);
//        }
//        StringBuilder sb = new StringBuilder();
//        DataValidatorLogin.validateEmpty(txtUsername, sb, "Username is required");
//        DataValidatorLogin.validateEmpty(txpPassword, sb, "Password is required");
//        
//        if(sb.length()>0){
//            MessageDialogLogin.showErrorDialog(this, sb.toString(), "Error");
//            return;
//        }
//        UsersDao dao = new UsersDao();
//        try {
//            Users us = dao.checkLogin(txtUsername.getText(), new String (txpPassword.getPassword()));
//            if(us==null){
//                MessageDialogLogin.showErrorDialog(this, "Username or Password is incorrect", "Error");
//                
//            }else {
//                SharedDataLogin.userlogin = us;
////                if (txtUsername.getText().equals("manager")) {
//                if (SharedDataLogin.userlogin.getRole().equals("Manager")) {    
//                    this.dispose();
//                    ManagerMain managerMain = new ManagerMain();
//                    managerMain.setVisible(true);
////                } else if (txtUsername.getText().equals("cashier")) {                    
//                } else if (SharedDataLogin.userlogin.getRole().equals("cashier")) {
//                    this.dispose();
//                    CashierMain cashierMain = new CashierMain();
//                    cashierMain.setVisible(true);
//                }                
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            MessageDialogLogin.showErrorDialog(this, e.getMessage(), "Error");
//        }
    }//GEN-LAST:event_btnSignInActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void radManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radManagerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radManagerActionPerformed

    private void radCashierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radCashierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radCashierActionPerformed

    public void setLanguage() {
        Locale locale;
        String language = "";
        Configurations languageConfigs = new Configurations();
        
        try {
            Configuration languageConfig = languageConfigs.properties(new File(languageConfigFilePath));
            language = languageConfig.getString("language");
        } catch (ConfigurationException ex) {
//            Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        if (language.equals("vi")) {
            locale = new Locale("vi", "VN");
        } else {
            locale = Locale.getDefault();
        }
        
        ResourceBundle resourceBundle = ResourceBundle.getBundle(bundlePath, locale);
        
        btnClose.setText(resourceBundle.getString("SignIn.btnClose.text"));
        btnSignIn.setText(resourceBundle.getString("SignIn.btnSignIn.text"));
        jLabel1.setText(resourceBundle.getString("SignIn.jLabel1.text"));
        jLabel4.setText(resourceBundle.getString("SignIn.jLabel4.text"));
        jLabel3.setText(resourceBundle.getString("SignIn.jLabel3.text"));
                
    }
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
////        try {
////            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
////                if ("Nimbus".equals(info.getName())) {
////                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
////                    break;
////                }
////            }
////        } catch (ClassNotFoundException ex) {
////            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        } catch (InstantiationException ex) {
////            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        } catch (IllegalAccessException ex) {
////            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
////            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        }
//
//        try {
//            /*
//            Flatlaf look and feel
//             */
//            UIManager.setLookAndFeel(new FlatArcOrangeIJTheme());
//        } catch (Exception ex) {
//            System.err.println("Failed to initialize LaF");
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SignIn().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSignIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JRadioButton radCashier;
    private javax.swing.ButtonGroup radGroupSignIn;
    private javax.swing.JRadioButton radManager;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
