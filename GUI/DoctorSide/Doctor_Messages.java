/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.DoctorSide;

import GUI.OwnerSide.*;
import GUI.AdminSide.*;
import GUI.LoginPanel;
import HMS_Classes.Messages;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import  java.sql.*;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Doctor_Messages extends javax.swing.JPanel {

    /**
     * Creates new form Admin_Owner_Messages
     */
    private Connection conn;
     private Statement stmt;
     private PreparedStatement pstmt;
     private ResultSet rs;
    public Doctor_Messages() {
        initComponents();
        messageLimit=0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/HMS_DB";
        String username = "mahnat";
        String password = "mahnat2023";
        conn = DriverManager.getConnection(url, username, password);

        stmt = conn.createStatement();
        String createTableQuery= "CREATE TABLE if not exists Messages (" +
                                "  chatId int auto_increment PRIMARY KEY," +
                                "  senderId int," +
                                "  receiverId int," +
                                "  messageContent VARCHAR(1000)," +
                                "  dateOfMessage DATE," +
                                "  userType VARCHAR(20),"+
                                "  FOREIGN KEY (senderId) REFERENCES Person(personId)," +
                                "  FOREIGN KEY (receiverId) REFERENCES Person(personId)" +
                                ");";
        stmt.executeUpdate(createTableQuery);       
        stmt.close();
        conn.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myButton1 = new CustomStyle.MyButton();
        content = new GUI.CustomStyle.Panel();
        Adpanel2 = new GUI.CustomStyle.Panel();
        jtext1 = new javax.swing.JLabel();
        Admin_contact_placeholder = new javax.swing.JLabel();
        Admin_contact_jtextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        panel1 = new GUI.CustomStyle.Panel();
        btn_send_Admin = new GUI.CustomStyle.MyButton();
        Admin_message_placeholder = new javax.swing.JLabel();
        Admin_message_jtextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        chatArea = new GUI.CustomStyle.Panel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Admin_TextArea = new javax.swing.JTextArea();

        setMinimumSize(new java.awt.Dimension(880, 750));
        setPreferredSize(new java.awt.Dimension(880, 750));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        content.setBackground(new java.awt.Color(190, 247, 255));
        content.setMinimumSize(new java.awt.Dimension(880, 750));
        content.setPreferredSize(new java.awt.Dimension(880, 750));
        content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Adpanel2.setBackground(new java.awt.Color(255, 255, 255));
        Adpanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtext1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jtext1.setForeground(new java.awt.Color(0, 0, 102));
        jtext1.setText("Send To :");
        Adpanel2.add(jtext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 40));

        Admin_contact_placeholder.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Admin_contact_placeholder.setForeground(new java.awt.Color(153, 153, 153));
        Admin_contact_placeholder.setText("Enter contact_ID");
        Adpanel2.add(Admin_contact_placeholder, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 170, 40));

        Admin_contact_jtextField.setBackground(new java.awt.Color(255, 255, 255));
        Admin_contact_jtextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Admin_contact_jtextField.setForeground(new java.awt.Color(0, 0, 102));
        Admin_contact_jtextField.setBorder(null);
        Admin_contact_jtextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Admin_contact_jtextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Admin_contact_jtextFieldFocusLost(evt);
            }
        });
        Admin_contact_jtextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_contact_jtextFieldActionPerformed(evt);
            }
        });
        Adpanel2.add(Admin_contact_jtextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 580, 40));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cntact.png"))); // NOI18N
        Adpanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        content.add(Adpanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 760, 40));

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_send_Admin.setBackground(new java.awt.Color(102, 86, 192));
        btn_send_Admin.setBorder(null);
        btn_send_Admin.setForeground(new java.awt.Color(255, 255, 255));
        btn_send_Admin.setText("SEND");
        btn_send_Admin.setBorderColor(new java.awt.Color(255, 255, 255));
        btn_send_Admin.setColor(new java.awt.Color(102, 86, 192));
        btn_send_Admin.setColorClick(new java.awt.Color(84, 86, 192));
        btn_send_Admin.setColorOver(new java.awt.Color(146, 86, 192));
        btn_send_Admin.setFocusPainted(false);
        btn_send_Admin.setFocusable(false);
        btn_send_Admin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_send_Admin.setRadius(25);
        btn_send_Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_send_AdminActionPerformed(evt);
            }
        });
        panel1.add(btn_send_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 120, 40));

        Admin_message_placeholder.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Admin_message_placeholder.setText("Write a message here. . . .");
        panel1.add(Admin_message_placeholder, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 160, 40));

        Admin_message_jtextField.setBackground(new java.awt.Color(255, 255, 255));
        Admin_message_jtextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Admin_message_jtextField.setForeground(new java.awt.Color(0, 0, 102));
        Admin_message_jtextField.setBorder(null);
        Admin_message_jtextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Admin_message_jtextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Admin_message_jtextFieldFocusLost(evt);
            }
        });
        Admin_message_jtextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_message_jtextFieldActionPerformed(evt);
            }
        });
        panel1.add(Admin_message_jtextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 620, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/chat.png"))); // NOI18N
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 30, 40));

        content.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, 820, 40));

        chatArea.setBackground(new java.awt.Color(60, 50, 75));
        chatArea.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        Admin_TextArea.setEditable(false);
        Admin_TextArea.setBackground(new java.awt.Color(51, 0, 51));
        Admin_TextArea.setColumns(20);
        Admin_TextArea.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Admin_TextArea.setForeground(new java.awt.Color(255, 255, 255));
        Admin_TextArea.setBorder(null);
        Admin_TextArea.setSelectionColor(new java.awt.Color(60, 50, 75));
        jScrollPane1.setViewportView(Admin_TextArea);

        chatArea.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        content.add(chatArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 790, 530));

        add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 880, 690));
    }// </editor-fold>//GEN-END:initComponents

    private void Admin_contact_jtextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Admin_contact_jtextFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_Admin_contact_jtextFieldFocusGained

    private void Admin_contact_jtextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Admin_contact_jtextFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_Admin_contact_jtextFieldFocusLost

    private void Admin_contact_jtextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_contact_jtextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Admin_contact_jtextFieldActionPerformed

    private void Admin_message_jtextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_message_jtextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Admin_message_jtextFieldActionPerformed

    private void Admin_message_jtextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Admin_message_jtextFieldFocusLost
        // TODO add your handling code here:
        Admin_message_placeholder.setForeground(new java.awt.Color(187,187,187));
        Admin_message_placeholder.setFont(new java.awt.Font("Segoe UI", 0, 14));
        Admin_message_placeholder.setText("Search anything here . . . .");
    }//GEN-LAST:event_Admin_message_jtextFieldFocusLost

    private void Admin_message_jtextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Admin_message_jtextFieldFocusGained
        Admin_message_placeholder.setText("");
    }//GEN-LAST:event_Admin_message_jtextFieldFocusGained
 
    private void btn_send_AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_send_AdminActionPerformed
         
        
         String receiverID=Admin_contact_jtextField.getText();
        String contentOfMessage=Admin_message_jtextField.getText();
        if(receiverID.length()==0 || contentOfMessage.length()==0){
            JOptionPane.showMessageDialog(this, "Some Data is missing please provide it!!.", "Alert", JOptionPane.WARNING_MESSAGE);
        }else{
            if(receiverID.length()<8){
                 JOptionPane.showMessageDialog(this, "Receiver ID is short please prvide correct length!!.", "Alert", JOptionPane.WARNING_MESSAGE);           
            }else{
                if(receiverID.equals(LoginPanel.logedPesonID)){
              JOptionPane.showMessageDialog(this, "You can't send message to yourself!!.", "Alert", JOptionPane.WARNING_MESSAGE);   
            }else{
                if(isNumeric(receiverID.substring(1, 5))){
                         int id=Integer.parseInt(receiverID.substring(1, 5));
                        try{
                            String url = "jdbc:mysql://localhost:3306/HMS_DB";
                            String username1 = "mahnat";
                            String password1 = "mahnat2023";
                            conn = DriverManager.getConnection(url, username1, password1);
                            pstmt=conn.prepareStatement("select P.personID from Person P  where P.personId=(?);");
                            pstmt.setInt(1, id);
                            
                            rs=pstmt.executeQuery();
                            if(rs.next()){
                                String userType="";
                                if(LoginPanel.logedPesonID.charAt(0)=='O'){
                                    userType="Owner";
                                }else if(LoginPanel.logedPesonID.charAt(0)=='A'){
                                    userType="Admin";
                                }
                                else if(LoginPanel.logedPesonID.charAt(0)=='R'){
                                    userType="Receptionist";
                                }
                                else if(LoginPanel.logedPesonID.charAt(0)=='D'){
                                    userType="Doctor";
                                }
                                else if(LoginPanel.logedPesonID.charAt(0)=='P'){
                                    userType="Patient";
                                }
                               Messages sentMessage=new Messages(LoginPanel.logedId,id,contentOfMessage,LocalDate.now(),userType);
                               Socket s=new Socket("localhost",2000);
                               ObjectOutputStream oos=new ObjectOutputStream(s.getOutputStream());
                               oos.writeObject(sentMessage);
                               oos.close();
                               s.close();
                               String message = Admin_message_jtextField.getText();
                                Admin_TextArea.append("  YOU : "+ message +"\n\n");
                                Admin_contact_jtextField.setText("");
                                Admin_message_jtextField.setText("");
                                messageLimit++;
                                if (messageLimit >5) {
                               JOptionPane.showMessageDialog(this, "Your Message is Successfully Sent\nPlease wait for Some time to response", "Alert", JOptionPane.WARNING_MESSAGE);
                                chatArea.remove(0);
                                }
                            }else{
                                JOptionPane.showMessageDialog(this, "Incorrect Data!!.", "Alert", JOptionPane.WARNING_MESSAGE);

                            }

                        }catch(Exception e){
                            System.out.println(e); 
                             }   
                    }else{
                         JOptionPane.showMessageDialog(this, "The ID of the Owner is not Correct Format!!.", "Alert", JOptionPane.WARNING_MESSAGE);
                    }
            }
            
            }
        }                     
    }//GEN-LAST:event_btn_send_AdminActionPerformed
public boolean isNumeric(String s){
        try {
            Integer.valueOf(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static int messageLimit;
 private javax.swing.JButton jButton1;
 private GUI.CustomStyle.Panel panel1111;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private GUI.CustomStyle.Panel panel41;
    private javax.swing.JLabel jLabel31;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Admin_TextArea;
    private javax.swing.JTextField Admin_contact_jtextField;
    private javax.swing.JLabel Admin_contact_placeholder;
    private javax.swing.JTextField Admin_message_jtextField;
    private javax.swing.JLabel Admin_message_placeholder;
    private GUI.CustomStyle.Panel Adpanel2;
    private GUI.CustomStyle.MyButton btn_send_Admin;
    private GUI.CustomStyle.Panel chatArea;
    private GUI.CustomStyle.Panel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jtext1;
    private CustomStyle.MyButton myButton1;
    private GUI.CustomStyle.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
