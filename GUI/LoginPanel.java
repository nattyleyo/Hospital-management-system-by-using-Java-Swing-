/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import GUI.AdminSide.Admin_Emp;
import GUI.AdminSide.Admin_Emp_Notification;
import GUI.AdminSide.Admin_Messages;
import GUI.DoctorSide.Doctor_Notification;
import GUI.DoctorSide.Doctor_Panel;
import java.sql.*;
import GUI.OwnerSide.Admin_Owner;
import GUI.PatientSide.Patients_Panel;
import GUI.ReceptionistSide.Receptionists_Panel;
import javax.swing.JOptionPane;



/**
 *
 * @author mta
 */
public class LoginPanel extends javax.swing.JPanel {

    private Connection conn;
    private Statement stmt;
    private PreparedStatement pstmt;
    private ResultSet rs;
    public static String logedPesonID;
    public static int logedId;
    private static int loginTry=0;
    /**
     * Creates new form LoginPanel
     */
    public LoginPanel(){
        initComponents();
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/HMS_DB";
        String username = "mahnat";
        String password = "mahnat2023";
        conn = DriverManager.getConnection(url, username, password);

        stmt = conn.createStatement();
        String createTableQuery= "CREATE TABLE if not exists Person("
                + "  personId int auto_increment PRIMARY KEY," 
            + "  name VARCHAR(50),\n"
            +"  age INT," 
            +"  phone VARCHAR(20)," 
            +"  gender VARCHAR(10)," 
            +"  password VARCHAR(50)" 
            +");";
        stmt.executeUpdate(createTableQuery);
        createTableQuery="CREATE TABLE if not exists Owner ("
                    +"  ownerId int auto_increment PRIMARY KEY,\n" 
                    +"  FOREIGN KEY (ownerId) REFERENCES Person(personId)\n" 
                   +");";
        stmt.executeUpdate(createTableQuery);
        
        rs=stmt.executeQuery("select * from Person join Owner on Person.personId=Owner.ownerId ;");
        
        if(!rs.next()){
           String name="Mahfouz Teyib";
           int age=21;
           String phoneNumber="+251929146352";
           String gender="Male";
           String password1="mahfouz9402";
           String inserToTable="Insert into Person(name,age,phone,gender,password) values (?,?,?,?,?);";
           pstmt=conn.prepareStatement(inserToTable,Statement.RETURN_GENERATED_KEYS);
           
           pstmt.setString(1, name);
           pstmt.setInt(2, age);
           pstmt.setString(3, phoneNumber);
           pstmt.setString(4, gender);
           pstmt.setString(5, password1); 
           pstmt.executeUpdate();
           rs=pstmt.getGeneratedKeys();
           int ownerId=0;
           while (rs.next()) {
           ownerId=rs.getInt(1);  
           }
           pstmt=conn.prepareStatement("INSERT INTO OWNER values(?)");
           pstmt.setInt(1, ownerId);
           pstmt.executeUpdate();
           name="Natnael Meseret";
           age=21;
           phoneNumber="+25112777846";
           gender="Male";
           password1="naty2023";
           inserToTable="Insert into Person(name,age,phone,gender,password) values (?,?,?,?,?);";
           pstmt=conn.prepareStatement(inserToTable,Statement.RETURN_GENERATED_KEYS);
           pstmt.setString(1, name);
           pstmt.setInt(2, age);
           pstmt.setString(3, phoneNumber);
           pstmt.setString(4, gender);
           pstmt.setString(5, password1); 
           pstmt.executeUpdate();
            rs=pstmt.getGeneratedKeys();
            ownerId=0;
            while (rs.next()) {
            ownerId=rs.getInt(1);  
            }
            pstmt=conn.prepareStatement("INSERT INTO OWNER values(?)");
            pstmt.setInt(1, ownerId);
            pstmt.executeUpdate();
            pstmt.close();
        }
       
        stmt.close();
        conn.close();
        }catch(Exception e){
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

        panel1 = new GUI.CustomStyle.Panel();
        sideBar_paint1 = new GUI.AdminSide.SideBar_paint();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usersComboBox = new javax.swing.JComboBox<>();
        usernameTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rememberMeCheckbox = new javax.swing.JCheckBox();
        loginButton = new GUI.CustomStyle.MyButton();
        forgotPassword = new GUI.CustomStyle.MyButton();
        createAccount = new GUI.CustomStyle.MyButton();
        passwordField = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setMinimumSize(new java.awt.Dimension(720, 650));
        setPreferredSize(new java.awt.Dimension(720, 650));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setBackground(new java.awt.Color(40, 61, 82));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sideBar_paint1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 188, 229));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("System");
        sideBar_paint1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 110, 50));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hospital (1).png"))); // NOI18N
        sideBar_paint1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 280, 226));

        jLabel13.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 188, 229));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Hospital Management");
        sideBar_paint1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 110, 50));

        jLabel14.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 188, 229));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("System");
        sideBar_paint1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 110, 50));

        panel1.add(sideBar_paint1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 610));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/patients.png"))); // NOI18N
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 140, 130));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 110, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 190, -1));

        usersComboBox.setBackground(new java.awt.Color(102, 102, 102));
        usersComboBox.setEditable(true);
        usersComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usersComboBox.setForeground(new java.awt.Color(255, 255, 255));
        usersComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Owner","Patient", "Doctor", "Receptionist", "Admin" }));
        usersComboBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 1, true));
        usersComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        usersComboBox.setFocusable(false);
        usersComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usersComboBoxActionPerformed(evt);
            }
        });
        panel1.add(usersComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 160, 30));

        usernameTextField.setBackground(new java.awt.Color(40, 61, 82));
        usernameTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usernameTextField.setForeground(new java.awt.Color(51, 183, 218));
        usernameTextField.setBorder(null);
        usernameTextField.setCaretColor(new java.awt.Color(0, 239, 253));
        panel1.add(usernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 292, 230, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Username");
        panel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Password");
        panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Don't have account ? |");
        panel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 570, -1, 30));

        jLabel8.setBackground(new java.awt.Color(40, 61, 82));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("____________");
        jLabel8.setOpaque(true);
        panel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 240, 60));

        rememberMeCheckbox.setBackground(new java.awt.Color(40, 61, 82));
        rememberMeCheckbox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rememberMeCheckbox.setForeground(new java.awt.Color(255, 255, 255));
        rememberMeCheckbox.setText("Remember Me |");
        rememberMeCheckbox.setToolTipText("");
        rememberMeCheckbox.setBorder(null);
        rememberMeCheckbox.setFocusPainted(false);
        rememberMeCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rememberMeCheckboxActionPerformed(evt);
            }
        });
        panel1.add(rememberMeCheckbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 130, 30));

        loginButton.setBackground(new java.awt.Color(153, 0, 153));
        loginButton.setBorder(null);
        loginButton.setForeground(new java.awt.Color(204, 255, 255));
        loginButton.setText("Login");
        loginButton.setAutoscrolls(true);
        loginButton.setBorderColor(new java.awt.Color(153, 0, 153));
        loginButton.setColor(new java.awt.Color(153, 0, 153));
        loginButton.setColorClick(new java.awt.Color(153, 0, 102));
        loginButton.setColorOver(new java.awt.Color(102, 0, 102));
        loginButton.setFocusPainted(false);
        loginButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        loginButton.setRadius(50);
        loginButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                loginButtonMouseMoved(evt);
            }
        });
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        panel1.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, 140, 50));

        forgotPassword.setBackground(new java.awt.Color(40, 61, 82));
        forgotPassword.setBorder(null);
        forgotPassword.setForeground(new java.awt.Color(0, 239, 253));
        forgotPassword.setText("forgot Password?");
        forgotPassword.setAutoscrolls(true);
        forgotPassword.setBorderColor(new java.awt.Color(40, 61, 82));
        forgotPassword.setColor(new java.awt.Color(40, 61, 82));
        forgotPassword.setColorClick(new java.awt.Color(40, 61, 82));
        forgotPassword.setColorOver(new java.awt.Color(40, 61, 82));
        forgotPassword.setFocusPainted(false);
        forgotPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        forgotPassword.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                forgotPasswordMouseMoved(evt);
            }
        });
        forgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                forgotPasswordMouseExited(evt);
            }
        });
        panel1.add(forgotPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, 130, 30));

        createAccount.setBorder(null);
        createAccount.setForeground(new java.awt.Color(0, 239, 253));
        createAccount.setText("Create account");
        createAccount.setBorderColor(new java.awt.Color(40, 61, 82));
        createAccount.setColor(new java.awt.Color(40, 61, 82));
        createAccount.setColorClick(new java.awt.Color(40, 61, 82));
        createAccount.setColorOver(new java.awt.Color(40, 61, 82));
        createAccount.setFocusPainted(false);
        createAccount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        createAccount.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                createAccountMouseMoved(evt);
            }
        });
        createAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                createAccountMouseExited(evt);
            }
        });
        createAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountActionPerformed(evt);
            }
        });
        panel1.add(createAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 570, 120, 30));

        passwordField.setBackground(new java.awt.Color(40, 61, 82));
        passwordField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordField.setForeground(new java.awt.Color(51, 183, 218));
        passwordField.setBorder(null);
        passwordField.setCaretColor(new java.awt.Color(0, 239, 253));
        passwordField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel1.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 240, 40));

        jLabel6.setBackground(new java.awt.Color(40, 61, 82));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("____________");
        panel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, -1, 60));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/medical-team (2).png"))); // NOI18N
        panel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 81, -1));

        add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 610));
    }// </editor-fold>//GEN-END:initComponents

    private void usersComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usersComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usersComboBoxActionPerformed

    private void rememberMeCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rememberMeCheckboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rememberMeCheckboxActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
       
        String signedUser=(String)usersComboBox.getSelectedItem();
        String username=usernameTextField.getText();
        String password=String.valueOf(passwordField.getPassword());
        if(signedUser.length()==0 || username.length()<8 ||password.length()==0){
            JOptionPane.showMessageDialog(this, "Some Data is missing \nplease provide complete information!!.", "Alert", JOptionPane.WARNING_MESSAGE);
        }else{
            loginTry++;
            if(loginTry>5){
                System.exit(0);
            }
            if(signedUser.equals("Owner")){
                if(username.charAt(0)!='O' || !username.substring(5).equals("/15")){
                    JOptionPane.showMessageDialog(this, "The ID of the Owner is not Correct Format!!.", "Alert", JOptionPane.WARNING_MESSAGE);
                    
                }else{
                    if(isNumeric(username.substring(1, 5))){
                         int id=Integer.parseInt(username.substring(1, 5));
                        try{
                            String url = "jdbc:mysql://localhost:3306/HMS_DB";
                            String username1 = "mahnat";
                            String password1 = "mahnat2023";
                            conn = DriverManager.getConnection(url, username1, password1);
                            pstmt=conn.prepareStatement("select P.personID,O.ownerId from Person P join Owner O on P.personId=O.ownerId where personId=(?) and password=(?);");
                            pstmt.setInt(1, id);
                            pstmt.setString(2, password);
                            rs=pstmt.executeQuery();
                            if(rs.next()){
                                logedId=id;
                                logedPesonID=username;
                                loginTry=0;
                                HMS_Demo.switchPanel(new Admin_Owner());  
                            }else{
                                JOptionPane.showMessageDialog(this, "Incorrect Data!!.", "Alert", JOptionPane.WARNING_MESSAGE);

                            }
                            
                        }catch(SQLException e){
                            System.out.println(e); 
                        }   
                    }else{
                         JOptionPane.showMessageDialog(this, "The ID of the Owner is not Correct Format!!.", "Alert", JOptionPane.WARNING_MESSAGE);
                    }
                }
            }else if(signedUser.equals("Admin")){
               if(username.charAt(0)!='A' || !username.substring(5).equals("/15")){
                    JOptionPane.showMessageDialog(this, "The ID of the Admin is not Correct Format!!.", "Alert", JOptionPane.WARNING_MESSAGE);
                    
                }else{
                    if(isNumeric(username.substring(1, 5))){
                         int id=Integer.parseInt(username.substring(1, 5));
                        try{
                            String url = "jdbc:mysql://localhost:3306/HMS_DB";
                            String username1 = "mahnat";
                            String password1 = "mahnat2023";
                            conn = DriverManager.getConnection(url, username1, password1);
                            pstmt=conn.prepareStatement("select P.personID from Person P join Staff S on P.personId=S.staffId join Admin A on S.staffId=A.staffId where P.personId=(?) and P.password=(?);");
                            pstmt.setInt(1, id);
                            pstmt.setString(2, password);
                            rs=pstmt.executeQuery();
                            if(rs.next()){
                                logedId=id;
                                logedPesonID=username;
                                loginTry=0;
                                HMS_Demo.switchPanel(new Admin_Emp());  
                            }else{
                                JOptionPane.showMessageDialog(this, "Incorrect Data!!.", "Alert", JOptionPane.WARNING_MESSAGE);

                            }

                        }catch(SQLException e){
                            System.out.println(e); 
                        }   
                    }else{
                         JOptionPane.showMessageDialog(this, "The ID of the Owner is not Correct Format!!.", "Alert", JOptionPane.WARNING_MESSAGE);
                    }
                 }
             }else if(signedUser.equals("Receptionist")){
               if(username.charAt(0)!='R' || !username.substring(5).equals("/15")){
                    JOptionPane.showMessageDialog(this, "The ID of the Receptionist is not Correct Format!!.", "Alert", JOptionPane.WARNING_MESSAGE);
                    
                }else{
                    if(isNumeric(username.substring(1, 5))){
                         int id=Integer.parseInt(username.substring(1, 5));
                        try{
                            String url = "jdbc:mysql://localhost:3306/HMS_DB";
                            String username1 = "mahnat";
                            String password1 = "mahnat2023";
                            conn = DriverManager.getConnection(url, username1, password1);
                            pstmt=conn.prepareStatement("select P.personID from Person P join Staff S on P.personId=S.staffId join Receptionist R on S.staffId=R.staffId where P.personId=(?) and P.password=(?);");
                            pstmt.setInt(1, id);
                            pstmt.setString(2, password);
                            rs=pstmt.executeQuery();
                            if(rs.next()){
                                logedId=id;
                                logedPesonID=username;
                                loginTry=0;
                                HMS_Demo.switchPanel(new Receptionists_Panel());  
                            }else{
                                JOptionPane.showMessageDialog(this, "Incorrect Data!!.", "Alert", JOptionPane.WARNING_MESSAGE);

                            }

                        }catch(SQLException e){
                            System.out.println(e); 
                        }   
                    }else{
                         JOptionPane.showMessageDialog(this, "The ID of the Owner is not Correct Format!!.", "Alert", JOptionPane.WARNING_MESSAGE);
                    }
                 }
             }else if(signedUser.equals("Doctor")){
               if(username.charAt(0)!='D' || !username.substring(5).equals("/15")){
                    JOptionPane.showMessageDialog(this, "The ID of the Doctor is not Correct Format!!.", "Alert", JOptionPane.WARNING_MESSAGE);
                    
                }else{
                    if(isNumeric(username.substring(1, 5))){
                         int id=Integer.parseInt(username.substring(1, 5));
                        try{
                            String url = "jdbc:mysql://localhost:3306/HMS_DB";
                            String username1 = "mahnat";
                            String password1 = "mahnat2023";
                            conn = DriverManager.getConnection(url, username1, password1);
                            pstmt=conn.prepareStatement("select P.personID from Person P join Staff S on P.personId=S.staffId join Doctor D on S.staffId=D.doctorId where P.personId=(?) and P.password=(?);");
                            pstmt.setInt(1, id);
                            pstmt.setString(2, password);
                            rs=pstmt.executeQuery();
                            if(rs.next()){
                                logedId=id;
                                logedPesonID=username;
                                loginTry=0;
                                HMS_Demo.switchPanel(new Doctor_Panel()); 
                            }else{
                                JOptionPane.showMessageDialog(this, "Incorrect Data!!.", "Alert", JOptionPane.WARNING_MESSAGE);

                            }

                        }catch(SQLException e){
                            System.out.println(e); 
                        }   
                    }else{
                         JOptionPane.showMessageDialog(this, "The ID of the Owner is not Correct Format!!.", "Alert", JOptionPane.WARNING_MESSAGE);
                    }
                 }
             }else if(signedUser.equals("Patient")){
               if(username.charAt(0)!='P' || !username.substring(5).equals("/15")){
                    JOptionPane.showMessageDialog(this, "The ID of the Patient is not Correct Format!!.", "Alert", JOptionPane.WARNING_MESSAGE);
                    
                }else{
                    if(isNumeric(username.substring(1, 5))){
                         int id=Integer.parseInt(username.substring(1, 5));
                        try{
                            String url = "jdbc:mysql://localhost:3306/HMS_DB";
                            String username1 = "mahnat";
                            String password1 = "mahnat2023";
                            conn = DriverManager.getConnection(url, username1, password1);
                            pstmt=conn.prepareStatement("select P.personID from Person P join Patient Pa on P.personId=Pa.patientId where P.personId=(?) and P.password=(?);");
                            pstmt.setInt(1, id);
                            pstmt.setString(2, password);
                            rs=pstmt.executeQuery();
                            if(rs.next()){
                                logedId=id;
                                logedPesonID=username;
                                loginTry=0;
                                HMS_Demo.switchPanel(new Patients_Panel());
                            }else{
                                JOptionPane.showMessageDialog(this, "Incorrect Data!!.", "Alert", JOptionPane.WARNING_MESSAGE);

                            }

                        }catch(SQLException e){
                            System.out.println(e); 
                        }   
                    }else{
                         JOptionPane.showMessageDialog(this, "The ID of the Owner is not Correct Format!!.", "Alert", JOptionPane.WARNING_MESSAGE);
                    }
                 }
             }
        }
       //HMS_Demo.sizeFrame(880, 705);
       //HMS_Demo.switchPanel(new Admin_Emp_Notification());
    }//GEN-LAST:event_loginButtonActionPerformed

    private void forgotPasswordMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordMouseMoved
        // TODO add your handling code here:
        forgotPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
         forgotPassword.setForeground(new java.awt.Color(255,153,102));

    }//GEN-LAST:event_forgotPasswordMouseMoved

    private void createAccountMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAccountMouseMoved
        // TODO add your handling code here:
        createAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createAccount.setForeground(new java.awt.Color(255,153,102));

    }//GEN-LAST:event_createAccountMouseMoved

    private void loginButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseMoved
        // TODO add your handling code here:
                  loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

    }//GEN-LAST:event_loginButtonMouseMoved

    private void forgotPasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordMouseExited
        // TODO add your handling code here:
        forgotPassword.setForeground(new java.awt.Color(0,239,253));
    }//GEN-LAST:event_forgotPasswordMouseExited

    private void createAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAccountMouseExited
        // TODO add your handling code here:
         createAccount.setForeground(new java.awt.Color(0,239,253));
    }//GEN-LAST:event_createAccountMouseExited

    private void createAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountActionPerformed
        // TODO add your handling code here:
        String signedUser=(String)usersComboBox.getSelectedItem();
         if(!signedUser.equals("Patient")){
        JOptionPane.showMessageDialog(this, "Only Patient Eligable to Create Account!!.", "Alert", JOptionPane.WARNING_MESSAGE);
         }
         else{
        HMS_Demo.switchPanel(new SignUp());
         }
    }//GEN-LAST:event_createAccountActionPerformed

    public boolean isNumeric(String s){
        try {
            Integer.valueOf(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.CustomStyle.MyButton createAccount;
    private GUI.CustomStyle.MyButton forgotPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private GUI.CustomStyle.MyButton loginButton;
    private GUI.CustomStyle.Panel panel1;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JCheckBox rememberMeCheckbox;
    private GUI.AdminSide.SideBar_paint sideBar_paint1;
    private javax.swing.JTextField usernameTextField;
    private javax.swing.JComboBox<String> usersComboBox;
    // End of variables declaration//GEN-END:variables
}
