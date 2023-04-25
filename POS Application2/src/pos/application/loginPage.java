/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pos.application;

import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Random;


/**
 *
 * @author chris
 */
public class loginPage extends javax.swing.JFrame {

    /**
     * Creates new form loginPage
     */
    public loginPage() {
        DBConnector.initDBConnection();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        userIDLabel = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();
        passwordLabel = new javax.swing.JLabel();
        showCheckBox = new javax.swing.JCheckBox();
        passwordTextField = new javax.swing.JPasswordField();
        userIDTextField = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        registerBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(247, 202, 201));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(33, 158, 188));
        jPanel1.setForeground(new java.awt.Color(33, 158, 188));

        userIDLabel.setForeground(new java.awt.Color(0, 0, 0));
        userIDLabel.setText("Username");

        resetButton.setBackground(new java.awt.Color(255, 255, 255));
        resetButton.setForeground(new java.awt.Color(0, 0, 0));
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        passwordLabel.setForeground(new java.awt.Color(0, 0, 0));
        passwordLabel.setText("Password");
        passwordLabel.setToolTipText("");

        showCheckBox.setForeground(new java.awt.Color(0, 0, 0));
        showCheckBox.setText("Show Password");
        showCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showCheckBoxActionPerformed(evt);
            }
        });

        passwordTextField.setBackground(new java.awt.Color(255, 255, 255));
        passwordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldActionPerformed(evt);
            }
        });

        userIDTextField.setBackground(new java.awt.Color(255, 255, 255));
        userIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userIDTextFieldActionPerformed(evt);
            }
        });

        loginButton.setBackground(new java.awt.Color(255, 255, 255));
        loginButton.setForeground(new java.awt.Color(0, 0, 0));
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        registerBTN.setBackground(new java.awt.Color(255, 255, 255));
        registerBTN.setForeground(new java.awt.Color(0, 0, 0));
        registerBTN.setText("Belum memiliki akun? Register Disini!");
        registerBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(showCheckBox)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordLabel)
                                    .addComponent(userIDLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(registerBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userIDLabel)
                    .addComponent(userIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetButton)
                    .addComponent(loginButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        userIDTextField.setText(null);
        passwordTextField.setText(null);
    }//GEN-LAST:event_resetButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        try{
            String username = userIDTextField.getText();
            String password = passwordTextField.getText();
            String passwordHashLogin = String.valueOf(password.hashCode());
            String userType = "";
            
            Statement stmt = DBConnector.connection.createStatement();
            //queries
            String sql = "select * from users where username='"+username+"'and password='"+passwordHashLogin+"'";
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                // Retrieve the user_type from the ResultSet                
                userType = rs.getString("user_type");
        
                // Redirect the user based on user_type
                if (userType.equals("admin")) {
                    this.dispose();
                    new adminPage().setVisible(true);
                } 
                else if (userType.equals("user")) {
                    this.dispose();
                    new tesframe().setVisible(true);
                } 
            }
            else if(username.equals("") && password.equals("")){
                JOptionPane.showMessageDialog(null, "Username dan Password Tidak Boleh Kosong!", "Caution!", JOptionPane.WARNING_MESSAGE);
                
            }
            else if(username.equals("")){
                JOptionPane.showMessageDialog(null, "Username Tidak Boleh Kosong!", "Caution!", JOptionPane.WARNING_MESSAGE);
                
            }
            else if(password.equals("")){
                JOptionPane.showMessageDialog(null, "Password Tidak Boleh Kosong!", "Caution!", JOptionPane.WARNING_MESSAGE);
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Username dan Password yang anda masukkan salah!", "Caution!", JOptionPane.WARNING_MESSAGE);   
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }           
    }//GEN-LAST:event_loginButtonActionPerformed

    private void userIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userIDTextFieldActionPerformed
        try{
            String username = userIDTextField.getText();
            String password = passwordTextField.getText();
            String passwordHashLogin = String.valueOf(password.hashCode());
            String userType = "";
            
            Statement stmt = DBConnector.connection.createStatement();
            //queries
            String sql = "select * from users where username='"+username+"'and password='"+passwordHashLogin+"'";
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                // Retrieve the user_type from the ResultSet                
                userType = rs.getString("user_type");
                this.dispose();
        
                // Redirect the user based on user_type
                if (userType.equals("admin")) {
                    new adminPage().setVisible(true);
                } 
                else if (userType.equals("user")) {
                    new tesframe().setVisible(true);
                } 
            }
            else if(username.equals("") && password.equals("")){
                JOptionPane.showMessageDialog(null, "Username dan Password Tidak Boleh Kosong!", "Caution!", JOptionPane.WARNING_MESSAGE);
                
            }
            else if(username.equals("")){
                JOptionPane.showMessageDialog(null, "Username Tidak Boleh Kosong!", "Caution!", JOptionPane.WARNING_MESSAGE);
                
            }
            else if(password.equals("")){
                JOptionPane.showMessageDialog(null, "Password Tidak Boleh Kosong!", "Caution!", JOptionPane.WARNING_MESSAGE);
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Username dan Password yang anda masukkan salah!", "Caution!", JOptionPane.WARNING_MESSAGE);   
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }           
    }//GEN-LAST:event_userIDTextFieldActionPerformed

    private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed
        try{
            String username = userIDTextField.getText();
            String password = passwordTextField.getText();
            String passwordHashLogin = String.valueOf(password.hashCode());
            String userType = "";
            
            Statement stmt = DBConnector.connection.createStatement();
            //queries
            String sql = "select * from users where username='"+username+"'and password='"+passwordHashLogin+"'";
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                // Retrieve the user_type from the ResultSet                
                userType = rs.getString("user_type");
                this.dispose();
        
                // Redirect the user based on user_type
                if (userType.equals("admin")) {
                    new adminPage().setVisible(true);
                } 
                else if (userType.equals("user")) {
                    new tesframe().setVisible(true);
                } 
            }
            else if(username.equals("") && password.equals("")){
                JOptionPane.showMessageDialog(null, "Username dan Password Tidak Boleh Kosong!", "Caution!", JOptionPane.WARNING_MESSAGE);
                
            }
            else if(username.equals("")){
                JOptionPane.showMessageDialog(null, "Username Tidak Boleh Kosong!", "Caution!", JOptionPane.WARNING_MESSAGE);
                
            }
            else if(password.equals("")){
                JOptionPane.showMessageDialog(null, "Password Tidak Boleh Kosong!", "Caution!", JOptionPane.WARNING_MESSAGE);
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Username dan Password yang anda masukkan salah!", "Caution!", JOptionPane.WARNING_MESSAGE);   
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }           
    }//GEN-LAST:event_passwordTextFieldActionPerformed

    private void registerBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBTNActionPerformed
        new registerPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registerBTNActionPerformed

    private void showCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showCheckBoxActionPerformed
        if(showCheckBox.isSelected()){
            passwordTextField.setEchoChar((char)0);
        }
        else{
            passwordTextField.setEchoChar('*');
        }
    }//GEN-LAST:event_showCheckBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JButton registerBTN;
    private javax.swing.JButton resetButton;
    private javax.swing.JCheckBox showCheckBox;
    private javax.swing.JLabel userIDLabel;
    private javax.swing.JTextField userIDTextField;
    // End of variables declaration//GEN-END:variables
}