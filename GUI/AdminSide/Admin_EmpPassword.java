/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.AdminSide;

import GUI.LoginPanel;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Admin_EmpPassword extends javax.swing.JPanel {

    private Connection conn;
    private PreparedStatement pstmt;
    /**
     * Creates new form Admin_EmpPassword
     */
    public Admin_EmpPassword() {
        initComponents();
        usernameTextField.setEditable(false);    
        usernameTextField.setText(LoginPanel.logedPesonID);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new GUI.CustomStyle.Panel();
        panel9 = new GUI.CustomStyle.Panel();
        jLabel3 = new javax.swing.JLabel();
        panel6 = new GUI.CustomStyle.Panel();
        jLabel1 = new javax.swing.JLabel();
        panel8 = new GUI.CustomStyle.Panel();
        saveButton = new GUI.CustomStyle.MyButton();
        panel14 = new GUI.CustomStyle.Panel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panel12 = new GUI.CustomStyle.Panel();
        usernameTextField = new javax.swing.JTextField();
        panel15 = new GUI.CustomStyle.Panel();
        confirmedPasswordTextField = new javax.swing.JTextField();
        panel13 = new GUI.CustomStyle.Panel();
        passwordTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        content.setBackground(new java.awt.Color(190, 247, 255));
        content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel9.setBackground(new java.awt.Color(82, 2, 31));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("Account Configuration");

        javax.swing.GroupLayout panel9Layout = new javax.swing.GroupLayout(panel9);
        panel9.setLayout(panel9Layout);
        panel9Layout.setHorizontalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel9Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel9Layout.setVerticalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        content.add(panel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 220, -1));

        panel6.setBackground(new java.awt.Color(20, 9, 148));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin-Employee");

        javax.swing.GroupLayout panel6Layout = new javax.swing.GroupLayout(panel6);
        panel6.setLayout(panel6Layout);
        panel6Layout.setHorizontalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
        );
        panel6Layout.setVerticalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        content.add(panel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 180, 40));

        panel8.setBackground(new java.awt.Color(255, 204, 204));
        panel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        saveButton.setBackground(new java.awt.Color(23, 169, 232));
        saveButton.setBorder(null);
        saveButton.setForeground(new java.awt.Color(255, 255, 255));
        saveButton.setText("SAVE");
        saveButton.setBorderColor(new java.awt.Color(255, 204, 204));
        saveButton.setColor(new java.awt.Color(23, 169, 232));
        saveButton.setColorClick(new java.awt.Color(23, 133, 232));
        saveButton.setColorOver(new java.awt.Color(0, 133, 218));
        saveButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saveButton.setRadius(20);
        saveButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                saveButtonMouseMoved(evt);
            }
        });
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        panel8.add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 140, 50));

        panel14.setBackground(new java.awt.Color(247, 247, 247));

        javax.swing.GroupLayout panel14Layout = new javax.swing.GroupLayout(panel14);
        panel14.setLayout(panel14Layout);
        panel14Layout.setHorizontalGroup(
            panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel14Layout.setVerticalGroup(
            panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panel8.add(panel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 220, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 0));
        jLabel5.setText("Username");
        panel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 80, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 0));
        jLabel6.setText("Confirm");
        panel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 70, 20));

        panel12.setBackground(new java.awt.Color(247, 247, 247));
        panel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernameTextField.setBackground(new java.awt.Color(247, 247, 247));
        usernameTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usernameTextField.setForeground(new java.awt.Color(51, 51, 51));
        usernameTextField.setBorder(null);
        usernameTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        usernameTextField.setOpaque(true);
        panel12.add(usernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 300, 40));

        panel8.add(panel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 340, 40));

        panel15.setBackground(new java.awt.Color(247, 247, 247));
        panel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        confirmedPasswordTextField.setBackground(new java.awt.Color(247, 247, 247));
        confirmedPasswordTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        confirmedPasswordTextField.setForeground(new java.awt.Color(51, 51, 51));
        confirmedPasswordTextField.setBorder(null);
        confirmedPasswordTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        confirmedPasswordTextField.setOpaque(true);
        panel15.add(confirmedPasswordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 300, 40));

        panel8.add(panel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 340, 40));

        panel13.setBackground(new java.awt.Color(247, 247, 247));
        panel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passwordTextField.setBackground(new java.awt.Color(247, 247, 247));
        passwordTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordTextField.setForeground(new java.awt.Color(51, 51, 51));
        passwordTextField.setBorder(null);
        passwordTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        passwordTextField.setOpaque(true);
        panel13.add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 300, 40));

        panel8.add(panel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 340, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 0));
        jLabel10.setText("Password");
        panel8.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 80, 20));

        content.add(panel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 420, 410));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Admin-emp.png"))); // NOI18N
        content.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 140, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 533, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 773, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseMoved
        // TODO add your handling code here:
        saveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_saveButtonMouseMoved

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        String passwordProvided=passwordTextField.getText();
        String confirmedPassword=confirmedPasswordTextField.getText();
        if(passwordProvided.length()==0 || confirmedPassword.length()==0){
             JOptionPane.showMessageDialog(this, "You have two provide both passwords!!.", "Alert", JOptionPane.WARNING_MESSAGE);
        }else{
            
            if(passwordProvided.compareTo(confirmedPassword)==0){
                try {
                     String url = "jdbc:mysql://localhost:3306/HMS_DB";
                     String username1 = "mahnat";
                     String password1 = "mahnat2023";
                     conn = DriverManager.getConnection(url, username1, password1);
                     pstmt=conn.prepareStatement("update Person set password=(?) where personId =(?);");
                     pstmt.setString(1, passwordProvided);
                     pstmt.setInt(2, LoginPanel.logedId);
                     int rows=pstmt.executeUpdate();
                     if(rows>0){
                         passwordTextField.setText("");
                         confirmedPasswordTextField.setText("");
                         JOptionPane.showMessageDialog(this, "You have successfully changed your password!!.", "Successfully Changed Password", JOptionPane.PLAIN_MESSAGE);
                     }
                } catch (SQLException e) {
                    System.out.println(e);
                }           
            }else{
               JOptionPane.showMessageDialog(this, "You passwords don't match!!.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_saveButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField confirmedPasswordTextField;
    private GUI.CustomStyle.Panel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private GUI.CustomStyle.Panel panel12;
    private GUI.CustomStyle.Panel panel13;
    private GUI.CustomStyle.Panel panel14;
    private GUI.CustomStyle.Panel panel15;
    private GUI.CustomStyle.Panel panel6;
    private GUI.CustomStyle.Panel panel8;
    private GUI.CustomStyle.Panel panel9;
    private javax.swing.JTextField passwordTextField;
    private GUI.CustomStyle.MyButton saveButton;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
