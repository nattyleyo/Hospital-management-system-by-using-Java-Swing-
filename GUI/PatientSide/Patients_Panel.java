/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.PatientSide;

import GUI.HMS_Demo;
import GUI.LoginPanel;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Patients_Panel extends javax.swing.JPanel {

     private Connection conn;
    private Statement stmt;
    private PreparedStatement pstmt;
    private ResultSet rs;
    /**
     * Creates new form Admin_Emp
     */
    public Patients_Panel() {
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

        mainPanel1 = new GUI.CustomStyle.Panel();
        Admin_emp_left = new GUI.CustomStyle.Panel();
        sideBar_paint1 = new GUI.AdminSide.SideBar_paint();
        jLabel4 = new javax.swing.JLabel();
        btn_appointments = new GUI.CustomStyle.MyButton();
        panel2 = new GUI.CustomStyle.Panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btn_prescription = new GUI.CustomStyle.MyButton();
        jLabel8 = new javax.swing.JLabel();
        btn_patientsNotific = new GUI.CustomStyle.MyButton();
        jLabel9 = new javax.swing.JLabel();
        btn_patientChangePass = new GUI.CustomStyle.MyButton();
        jLabel3 = new javax.swing.JLabel();
        btn_logOut = new GUI.CustomStyle.MyButton();
        btn_PatientMessage = new GUI.CustomStyle.MyButton();
        jLabel10 = new javax.swing.JLabel();
        btn_bill = new GUI.CustomStyle.MyButton();
        Admin_right_panel1 = new GUI.CustomStyle.Panel();
        Admin_Owner_jTabbedPane = new javax.swing.JTabbedPane();
        panel1 = new GUI.CustomStyle.Panel();
        appointments1 = new GUI.PatientSide.Appointments();
        panel3 = new GUI.CustomStyle.Panel();
        prescriptions1 = new GUI.PatientSide.Prescriptions();
        panel4 = new GUI.CustomStyle.Panel();
        patient_Messages1 = new GUI.PatientSide.Patient_Messages();
        panel5 = new GUI.CustomStyle.Panel();
        patient_Notification1 = new GUI.PatientSide.Patient_Notification();
        panel6 = new GUI.CustomStyle.Panel();
        patient_Password1 = new GUI.PatientSide.Patient_Password();

        setMinimumSize(new java.awt.Dimension(1300, 794));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1300, 794));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel1.setBackground(new java.awt.Color(0, 51, 51));
        mainPanel1.setMinimumSize(new java.awt.Dimension(1300, 794));
        mainPanel1.setPreferredSize(new java.awt.Dimension(1300, 794));
        mainPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Admin_emp_left.setBackground(new java.awt.Color(0, 51, 51));
        Admin_emp_left.setToolTipText("");
        Admin_emp_left.setMinimumSize(new java.awt.Dimension(220, 790));
        Admin_emp_left.setName(""); // NOI18N
        Admin_emp_left.setOpaque(true);
        Admin_emp_left.setPreferredSize(new java.awt.Dimension(220, 790));
        Admin_emp_left.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sideBar_paint1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/appointment.png"))); // NOI18N
        sideBar_paint1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 50, 40));

        btn_appointments.setBackground(new java.awt.Color(153, 0, 153));
        btn_appointments.setBorder(null);
        btn_appointments.setForeground(new java.awt.Color(204, 255, 255));
        btn_appointments.setText("Appointments");
        btn_appointments.setAutoscrolls(true);
        btn_appointments.setBorderColor(new java.awt.Color(153, 0, 153));
        btn_appointments.setColor(new java.awt.Color(153, 0, 153));
        btn_appointments.setColorClick(new java.awt.Color(77, 0, 102));
        btn_appointments.setColorOver(new java.awt.Color(0, 132, 202));
        btn_appointments.setFocusPainted(false);
        btn_appointments.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_appointments.setMargin(new java.awt.Insets(2, 2, 3, 14));
        btn_appointments.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_appointmentsMouseMoved(evt);
            }
        });
        btn_appointments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_appointmentsMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_appointmentsMouseExited(evt);
            }
        });
        btn_appointments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_appointmentsActionPerformed(evt);
            }
        });
        sideBar_paint1.add(btn_appointments, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 220, 40));

        panel2.setBackground(new java.awt.Color(51, 51, 51));
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Patient");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 150, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/patient-logo.png"))); // NOI18N
        panel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 139, 131));

        sideBar_paint1.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 160));

        jLabel14.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 255, 255));
        jLabel14.setText("My Data");
        sideBar_paint1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 60, 20));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/messages.png"))); // NOI18N
        sideBar_paint1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 50, 40));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/medical-record.png"))); // NOI18N
        sideBar_paint1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 50, 40));

        btn_prescription.setBackground(new java.awt.Color(153, 0, 153));
        btn_prescription.setBorder(null);
        btn_prescription.setForeground(new java.awt.Color(204, 255, 255));
        btn_prescription.setText("Prescriptions");
        btn_prescription.setBorderColor(new java.awt.Color(153, 0, 153));
        btn_prescription.setColor(new java.awt.Color(153, 0, 153));
        btn_prescription.setColorClick(new java.awt.Color(77, 0, 102));
        btn_prescription.setColorOver(new java.awt.Color(0, 132, 202));
        btn_prescription.setFocusPainted(false);
        btn_prescription.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_prescription.setMargin(new java.awt.Insets(2, 2, 3, 14));
        btn_prescription.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_prescriptionMouseMoved(evt);
            }
        });
        btn_prescription.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_prescriptionMouseExited(evt);
            }
        });
        btn_prescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prescriptionActionPerformed(evt);
            }
        });
        sideBar_paint1.add(btn_prescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 220, 40));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/push-notification.png"))); // NOI18N
        sideBar_paint1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 50, 40));

        btn_patientsNotific.setBackground(new java.awt.Color(153, 0, 153));
        btn_patientsNotific.setBorder(null);
        btn_patientsNotific.setForeground(new java.awt.Color(204, 255, 255));
        btn_patientsNotific.setText(" Notification");
        btn_patientsNotific.setBorderColor(new java.awt.Color(153, 0, 153));
        btn_patientsNotific.setColor(new java.awt.Color(153, 0, 153));
        btn_patientsNotific.setColorClick(new java.awt.Color(77, 0, 102));
        btn_patientsNotific.setColorOver(new java.awt.Color(0, 132, 202));
        btn_patientsNotific.setFocusPainted(false);
        btn_patientsNotific.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_patientsNotific.setMargin(new java.awt.Insets(2, 2, 3, 14));
        btn_patientsNotific.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_patientsNotificMouseMoved(evt);
            }
        });
        btn_patientsNotific.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_patientsNotificMouseExited(evt);
            }
        });
        btn_patientsNotific.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_patientsNotificActionPerformed(evt);
            }
        });
        sideBar_paint1.add(btn_patientsNotific, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 220, 40));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/reset-password.png"))); // NOI18N
        sideBar_paint1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, -1, 40));

        btn_patientChangePass.setBackground(new java.awt.Color(153, 0, 153));
        btn_patientChangePass.setBorder(null);
        btn_patientChangePass.setForeground(new java.awt.Color(204, 255, 255));
        btn_patientChangePass.setText("Change Password");
        btn_patientChangePass.setBorderColor(new java.awt.Color(153, 0, 153));
        btn_patientChangePass.setColor(new java.awt.Color(153, 0, 153));
        btn_patientChangePass.setColorClick(new java.awt.Color(77, 0, 102));
        btn_patientChangePass.setColorOver(new java.awt.Color(0, 132, 202));
        btn_patientChangePass.setFocusPainted(false);
        btn_patientChangePass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_patientChangePass.setMargin(new java.awt.Insets(2, 2, 3, 14));
        btn_patientChangePass.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_patientChangePassMouseMoved(evt);
            }
        });
        btn_patientChangePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_patientChangePassMouseExited(evt);
            }
        });
        btn_patientChangePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_patientChangePassActionPerformed(evt);
            }
        });
        sideBar_paint1.add(btn_patientChangePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 220, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logout (1).png"))); // NOI18N
        sideBar_paint1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 650, 30, 40));

        btn_logOut.setBackground(new java.awt.Color(153, 0, 153));
        btn_logOut.setBorder(null);
        btn_logOut.setForeground(new java.awt.Color(255, 255, 255));
        btn_logOut.setText("Logout");
        btn_logOut.setBorderColor(new java.awt.Color(0, 102, 204));
        btn_logOut.setColor(new java.awt.Color(153, 0, 153));
        btn_logOut.setColorClick(new java.awt.Color(153, 0, 153));
        btn_logOut.setColorOver(new java.awt.Color(153, 11, 112));
        btn_logOut.setFocusPainted(false);
        btn_logOut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_logOut.setRadius(25);
        btn_logOut.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_logOutMouseMoved(evt);
            }
        });
        btn_logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logOutActionPerformed(evt);
            }
        });
        sideBar_paint1.add(btn_logOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 650, 140, 40));

        btn_PatientMessage.setBackground(new java.awt.Color(153, 0, 153));
        btn_PatientMessage.setBorder(null);
        btn_PatientMessage.setForeground(new java.awt.Color(204, 255, 255));
        btn_PatientMessage.setText("Messages");
        btn_PatientMessage.setBorderColor(new java.awt.Color(153, 0, 153));
        btn_PatientMessage.setColor(new java.awt.Color(153, 0, 153));
        btn_PatientMessage.setColorClick(new java.awt.Color(77, 0, 102));
        btn_PatientMessage.setColorOver(new java.awt.Color(0, 132, 202));
        btn_PatientMessage.setFocusPainted(false);
        btn_PatientMessage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_PatientMessage.setMargin(new java.awt.Insets(2, 2, 3, 14));
        btn_PatientMessage.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_PatientMessageMouseMoved(evt);
            }
        });
        btn_PatientMessage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_PatientMessageMouseExited(evt);
            }
        });
        btn_PatientMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PatientMessageActionPerformed(evt);
            }
        });
        sideBar_paint1.add(btn_PatientMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 220, 40));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bill.png"))); // NOI18N
        sideBar_paint1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 50, 40));

        btn_bill.setBackground(new java.awt.Color(153, 0, 153));
        btn_bill.setBorder(null);
        btn_bill.setForeground(new java.awt.Color(204, 255, 255));
        btn_bill.setText("Bill");
        btn_bill.setBorderColor(new java.awt.Color(153, 0, 153));
        btn_bill.setColor(new java.awt.Color(153, 0, 153));
        btn_bill.setColorClick(new java.awt.Color(77, 0, 102));
        btn_bill.setColorOver(new java.awt.Color(0, 132, 202));
        btn_bill.setFocusPainted(false);
        btn_bill.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_bill.setMargin(new java.awt.Insets(2, 2, 3, 14));
        btn_bill.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_billMouseMoved(evt);
            }
        });
        btn_bill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_billMouseExited(evt);
            }
        });
        btn_bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_billActionPerformed(evt);
            }
        });
        sideBar_paint1.add(btn_bill, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 220, 40));

        Admin_emp_left.add(sideBar_paint1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 6, 220, 750));

        mainPanel1.add(Admin_emp_left, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 760));

        Admin_right_panel1.setBackground(new java.awt.Color(0, 51, 51));
        Admin_right_panel1.setForeground(new java.awt.Color(51, 51, 51));
        Admin_right_panel1.setMinimumSize(new java.awt.Dimension(900, 788));
        Admin_right_panel1.setName(""); // NOI18N
        Admin_right_panel1.setPreferredSize(new java.awt.Dimension(900, 788));
        Admin_right_panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Admin_Owner_jTabbedPane.setBackground(new java.awt.Color(51, 51, 51));
        Admin_Owner_jTabbedPane.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        Admin_Owner_jTabbedPane.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        Admin_Owner_jTabbedPane.setPreferredSize(new java.awt.Dimension(150, 730));

        panel1.setBackground(new java.awt.Color(0, 51, 51));
        panel1.setForeground(new java.awt.Color(51, 51, 51));
        panel1.setMinimumSize(new java.awt.Dimension(1080, 839));
        panel1.setName(""); // NOI18N

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(appointments1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(appointments1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        Admin_Owner_jTabbedPane.addTab("tab6", panel1);

        panel3.setBackground(new java.awt.Color(0, 51, 51));
        panel3.setForeground(new java.awt.Color(51, 51, 51));
        panel3.setMinimumSize(new java.awt.Dimension(1028, 804));
        panel3.setPreferredSize(new java.awt.Dimension(1028, 804));

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(prescriptions1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(prescriptions1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        Admin_Owner_jTabbedPane.addTab("tab6", panel3);

        panel4.setBackground(new java.awt.Color(0, 51, 51));
        panel4.setForeground(new java.awt.Color(51, 51, 51));
        panel4.setMinimumSize(new java.awt.Dimension(1028, 804));

        patient_Messages1.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(patient_Messages1, javax.swing.GroupLayout.PREFERRED_SIZE, 907, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(217, Short.MAX_VALUE))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(patient_Messages1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        Admin_Owner_jTabbedPane.addTab("tab6", panel4);

        panel5.setBackground(new java.awt.Color(0, 51, 51));
        panel5.setForeground(new java.awt.Color(51, 51, 51));
        panel5.setMinimumSize(new java.awt.Dimension(1028, 804));

        patient_Notification1.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(patient_Notification1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(374, Short.MAX_VALUE))
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(patient_Notification1, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        Admin_Owner_jTabbedPane.addTab("tab6", panel5);

        panel6.setBackground(new java.awt.Color(0, 51, 51));
        panel6.setForeground(new java.awt.Color(51, 51, 51));
        panel6.setMinimumSize(new java.awt.Dimension(1028, 804));

        javax.swing.GroupLayout panel6Layout = new javax.swing.GroupLayout(panel6);
        panel6.setLayout(panel6Layout);
        panel6Layout.setHorizontalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(patient_Password1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(604, Short.MAX_VALUE))
        );
        panel6Layout.setVerticalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(patient_Password1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        Admin_Owner_jTabbedPane.addTab("tab6", panel6);

        Admin_right_panel1.add(Admin_Owner_jTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -20, 1150, 870));

        mainPanel1.add(Admin_right_panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 1110, 780));

        add(mainPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 770));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_appointmentsMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_appointmentsMouseMoved
        // TODO add your handling code here:
        btn_appointments.setRadius(25);
        btn_appointments.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_appointmentsMouseMoved

    private void btn_appointmentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_appointmentsMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btn_appointmentsMouseClicked

    private void btn_appointmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_appointmentsActionPerformed
        // TODO add your handling code here:
        HMS_Demo.sizeFrame(1300, 794);
        Admin_Owner_jTabbedPane.setSelectedIndex(0);
    }//GEN-LAST:event_btn_appointmentsActionPerformed

    private void btn_prescriptionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_prescriptionMouseMoved
        // TODO add your handling code here:
        btn_prescription.setRadius(25);
        btn_prescription.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_prescriptionMouseMoved

    private void btn_prescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prescriptionActionPerformed
        // TODO add your handling code here:
         HMS_Demo.sizeFrame(1300, 794);
        Admin_Owner_jTabbedPane.setSelectedIndex(1);
        
    }//GEN-LAST:event_btn_prescriptionActionPerformed

    private void btn_patientsNotificMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_patientsNotificMouseMoved
        // TODO add your handling code here:
        btn_patientsNotific.setRadius(25);
        btn_patientsNotific.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_patientsNotificMouseMoved

    private void btn_patientsNotificActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_patientsNotificActionPerformed
        // TODO add your handling code here:
        HMS_Demo.sizeFrame(1020, 794);
        Admin_Owner_jTabbedPane.setSelectedIndex(3);
    }//GEN-LAST:event_btn_patientsNotificActionPerformed

    private void btn_patientChangePassMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_patientChangePassMouseMoved
        // TODO add your handling code here:
        btn_patientChangePass.setRadius(25);
        btn_patientChangePass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_patientChangePassMouseMoved

    private void btn_patientChangePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_patientChangePassActionPerformed
        // TODO add your handling code here:
         HMS_Demo.sizeFrame(780, 794);
        Admin_Owner_jTabbedPane.setSelectedIndex(4);
    }//GEN-LAST:event_btn_patientChangePassActionPerformed

    private void btn_logOutMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logOutMouseMoved
        // TODO add your handling code here:
        btn_logOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_logOutMouseMoved

    private void btn_logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logOutActionPerformed
        // TODO add your handling code here:
        int result=JOptionPane.showConfirmDialog(this, "Are you sure you want to log out from the HMS?","Are you sure you want to log out?",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(result==JOptionPane.YES_OPTION){
             HMS_Demo.switchPanel(new LoginPanel());
         } 
         
    }//GEN-LAST:event_btn_logOutActionPerformed

    private void btn_appointmentsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_appointmentsMouseExited
        // TODO add your handling code here:
        btn_appointments.setRadius(0);
    }//GEN-LAST:event_btn_appointmentsMouseExited

    private void btn_prescriptionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_prescriptionMouseExited
        // TODO add your handling code here:
        btn_prescription.setRadius(0);
    }//GEN-LAST:event_btn_prescriptionMouseExited

    private void btn_patientsNotificMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_patientsNotificMouseExited
        // TODO add your handling code here:
         btn_patientsNotific.setRadius(0);
    }//GEN-LAST:event_btn_patientsNotificMouseExited

    private void btn_patientChangePassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_patientChangePassMouseExited
        // TODO add your handling code here:
         btn_patientChangePass.setRadius(0);
    }//GEN-LAST:event_btn_patientChangePassMouseExited

    private void btn_PatientMessageMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PatientMessageMouseMoved
        // TODO add your handling code here:
         btn_PatientMessage.setRadius(25);
        btn_PatientMessage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_PatientMessageMouseMoved

    private void btn_PatientMessageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PatientMessageMouseExited
        // TODO add your handling code here:
        btn_PatientMessage.setRadius(0);
    }//GEN-LAST:event_btn_PatientMessageMouseExited

    private void btn_PatientMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PatientMessageActionPerformed
        // TODO add your handling code here:
         HMS_Demo.sizeFrame(1180, 794);
         Admin_Owner_jTabbedPane.setSelectedIndex(2);
    }//GEN-LAST:event_btn_PatientMessageActionPerformed

    private void btn_billMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_billMouseMoved
        // TODO add your handling code here:
        btn_bill.setRadius(25);
         btn_bill.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_billMouseMoved

    private void btn_billMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_billMouseExited
        // TODO add your handling code here:
         btn_bill.setRadius(0);
        
    }//GEN-LAST:event_btn_billMouseExited

    private void btn_billActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_billActionPerformed
        // TODO add your handling code here:
       //  HMS_Demo.sizeFrame(1300, 794);
        //Admin_Owner_jTabbedPane.setSelectedIndex(3);
        try {
             String url = "jdbc:mysql://localhost:3306/HMS_DB";
            String username = "mahnat";
            String password = "mahnat2023";
            conn = DriverManager.getConnection(url, username, password);
            pstmt=conn.prepareStatement("Select bill from patient where patientId=?");
            pstmt.setInt(1, LoginPanel.logedId);
            rs=pstmt.executeQuery();
            double bill=0;
            if(rs.next()){
                bill=rs.getDouble(1);
                JOptionPane.showMessageDialog(this, "Your bill is "+bill, "Bill", JOptionPane.INFORMATION_MESSAGE);

            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btn_billActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Admin_Owner_jTabbedPane;
    private GUI.CustomStyle.Panel Admin_emp_left;
    private GUI.CustomStyle.Panel Admin_right_panel1;
    private GUI.PatientSide.Appointments appointments1;
    private GUI.CustomStyle.MyButton btn_PatientMessage;
    private GUI.CustomStyle.MyButton btn_appointments;
    private GUI.CustomStyle.MyButton btn_bill;
    private GUI.CustomStyle.MyButton btn_logOut;
    private GUI.CustomStyle.MyButton btn_patientChangePass;
    private GUI.CustomStyle.MyButton btn_patientsNotific;
    private GUI.CustomStyle.MyButton btn_prescription;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private GUI.CustomStyle.Panel mainPanel1;
    private GUI.CustomStyle.Panel panel1;
    private GUI.CustomStyle.Panel panel2;
    private GUI.CustomStyle.Panel panel3;
    private GUI.CustomStyle.Panel panel4;
    private GUI.CustomStyle.Panel panel5;
    private GUI.CustomStyle.Panel panel6;
    private GUI.PatientSide.Patient_Messages patient_Messages1;
    private GUI.PatientSide.Patient_Notification patient_Notification1;
    private GUI.PatientSide.Patient_Password patient_Password1;
    private GUI.PatientSide.Prescriptions prescriptions1;
    private GUI.AdminSide.SideBar_paint sideBar_paint1;
    // End of variables declaration//GEN-END:variables
}
