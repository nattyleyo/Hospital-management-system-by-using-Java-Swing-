/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.AdminSide;

import GUI.OwnerSide.*;
import GUI.AdminSide.*;
import GUI.DoctorSide.*;
import GUI.AdminSide.*;
import GUI.LoginPanel;
import java.awt.Color;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.time.LocalDate;
import javax.swing.table.JTableHeader;
/**
 *
 * @author HP
 */
public class Admin_Emp_Notification extends javax.swing.JPanel {

    private Connection conn;
    private Statement stmt;
    private PreparedStatement pstmt;
    private ResultSet rs;
    /**
     * Creates new form Admin_Owner_nottifiaction
     */
    public Admin_Emp_Notification() {
        initComponents();
                JTableHeader tableHeader1=all_messTable.getTableHeader();
        tableHeader1.setForeground(new Color(204,255,255));
        tableHeader1.setBackground(new Color(82,2,31));
        
         JTableHeader tableHeader2=admin_messTable.getTableHeader();
        tableHeader2.setForeground(new Color(204,255,255));
        tableHeader2.setBackground(new Color(91, 19, 145));
        
         JTableHeader tableHeader3=doctor_messTable.getTableHeader();
        tableHeader3.setForeground(new Color(204,255,255));
        tableHeader3.setBackground(new Color(14, 126, 140));
        
         JTableHeader tableHeader4=recept_messTable.getTableHeader();
        tableHeader4.setForeground(new Color(204,255,255));
        tableHeader4.setBackground(new Color(245, 76, 76));
        
         fetchAllTable();
        fetchAdminTable();
        fetchDoctorTable();
        fetchReceptTable();
            try{
            Class.forName("com.mysql.cj.jdbc.Driver");    
            } catch(Exception e){
                
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
        panel2 = new GUI.CustomStyle.Panel();
        panel6 = new GUI.CustomStyle.Panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        all_jlabel = new javax.swing.JLabel();
        btn_all = new GUI.CustomStyle.MyButton();
        btn_admins = new GUI.CustomStyle.MyButton();
        refreshLabel = new javax.swing.JLabel();
        btn_refresh = new GUI.CustomStyle.MyButton();
        btn_doctors = new GUI.CustomStyle.MyButton();
        btn_reception = new GUI.CustomStyle.MyButton();
        admin_jlabel = new javax.swing.JLabel();
        doctor_jlabel = new javax.swing.JLabel();
        reception_jlabel = new javax.swing.JLabel();
        panel4 = new GUI.CustomStyle.Panel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        all_jPAne = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        all_messTable = new javax.swing.JTable();
        admin_jpane = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        admin_messTable = new javax.swing.JTable();
        doctor_pane = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        doctor_messTable = new javax.swing.JTable();
        recept_pane = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        recept_messTable = new javax.swing.JTable();

        setMaximumSize(new java.awt.Dimension(0, 0));
        setMinimumSize(new java.awt.Dimension(720, 720));
        setPreferredSize(new java.awt.Dimension(720, 720));

        panel1.setBackground(new java.awt.Color(204, 255, 255));
        panel1.setMinimumSize(new java.awt.Dimension(730, 720));
        panel1.setName(""); // NOI18N
        panel1.setPreferredSize(new java.awt.Dimension(730, 720));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel2.setBackground(new java.awt.Color(255, 248, 227));
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel6.setBackground(new java.awt.Color(20, 9, 148));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Notificactions");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/activeNotifiaction.png"))); // NOI18N

        javax.swing.GroupLayout panel6Layout = new javax.swing.GroupLayout(panel6);
        panel6.setLayout(panel6Layout);
        panel6Layout.setHorizontalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel6Layout.setVerticalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel2.add(panel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 220, 50));

        all_jlabel.setBackground(new java.awt.Color(0, 51, 204));
        all_jlabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        all_jlabel.setForeground(new java.awt.Color(0, 51, 204));
        all_jlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        all_jlabel.setText("__");
        panel2.add(all_jlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 40, 50));

        btn_all.setBorder(null);
        btn_all.setForeground(new java.awt.Color(102, 102, 102));
        btn_all.setText("All");
        btn_all.setAutoscrolls(true);
        btn_all.setBorderColor(new java.awt.Color(255, 248, 227));
        btn_all.setColorClick(new java.awt.Color(20, 9, 148));
        btn_all.setColorOver(new java.awt.Color(224, 224, 197));
        btn_all.setFocusPainted(false);
        btn_all.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_all.setRadius(20);
        btn_all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_allActionPerformed(evt);
            }
        });
        panel2.add(btn_all, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 71, 46, 30));

        btn_admins.setBorder(null);
        btn_admins.setForeground(new java.awt.Color(102, 102, 102));
        btn_admins.setText("Admin-Employees");
        btn_admins.setAutoscrolls(true);
        btn_admins.setBorderColor(new java.awt.Color(255, 248, 227));
        btn_admins.setColorClick(new java.awt.Color(20, 9, 148));
        btn_admins.setColorOver(new java.awt.Color(224, 224, 197));
        btn_admins.setFocusPainted(false);
        btn_admins.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_admins.setRadius(20);
        btn_admins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adminsActionPerformed(evt);
            }
        });
        panel2.add(btn_admins, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 71, 137, 30));

        refreshLabel.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        refreshLabel.setForeground(new java.awt.Color(0, 0, 204));
        refreshLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        refreshLabel.setText("__");
        panel2.add(refreshLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 90, 50));

        btn_refresh.setBorder(null);
        btn_refresh.setForeground(new java.awt.Color(0, 51, 204));
        btn_refresh.setText("Refresh");
        btn_refresh.setBorderColor(new java.awt.Color(255, 248, 227));
        btn_refresh.setColor(new java.awt.Color(255, 248, 227));
        btn_refresh.setColorClick(new java.awt.Color(20, 9, 148));
        btn_refresh.setColorOver(new java.awt.Color(224, 224, 197));
        btn_refresh.setFocusPainted(false);
        btn_refresh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_refresh.setRadius(25);
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });
        panel2.add(btn_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 110, 40));

        btn_doctors.setBorder(null);
        btn_doctors.setForeground(new java.awt.Color(102, 102, 102));
        btn_doctors.setText("Doctors");
        btn_doctors.setAutoscrolls(true);
        btn_doctors.setBorderColor(new java.awt.Color(255, 248, 227));
        btn_doctors.setColorClick(new java.awt.Color(20, 9, 148));
        btn_doctors.setColorOver(new java.awt.Color(224, 224, 197));
        btn_doctors.setFocusPainted(false);
        btn_doctors.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_doctors.setRadius(20);
        btn_doctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_doctorsActionPerformed(evt);
            }
        });
        panel2.add(btn_doctors, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 71, 87, 30));

        btn_reception.setBorder(null);
        btn_reception.setForeground(new java.awt.Color(102, 102, 102));
        btn_reception.setText("Receptionists");
        btn_reception.setBorderColor(new java.awt.Color(255, 248, 227));
        btn_reception.setColorClick(new java.awt.Color(20, 9, 148));
        btn_reception.setColorOver(new java.awt.Color(224, 224, 197));
        btn_reception.setFocusPainted(false);
        btn_reception.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_reception.setRadius(20);
        btn_reception.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_receptionActionPerformed(evt);
            }
        });
        panel2.add(btn_reception, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 71, 120, 30));

        admin_jlabel.setBackground(new java.awt.Color(0, 51, 204));
        admin_jlabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        admin_jlabel.setForeground(new java.awt.Color(0, 51, 204));
        admin_jlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel2.add(admin_jlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 140, 50));

        doctor_jlabel.setBackground(new java.awt.Color(0, 51, 204));
        doctor_jlabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        doctor_jlabel.setForeground(new java.awt.Color(0, 51, 204));
        doctor_jlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel2.add(doctor_jlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 60, 90, -1));

        reception_jlabel.setBackground(new java.awt.Color(0, 51, 204));
        reception_jlabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        reception_jlabel.setForeground(new java.awt.Color(0, 51, 204));
        reception_jlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reception_jlabel.setToolTipText("");
        panel2.add(reception_jlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 60, 80, -1));

        panel1.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 710, -1));

        panel4.setBackground(new java.awt.Color(236, 234, 252));
        panel4.setOpaque(true);
        panel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(51, 51, 51));
        jTabbedPane1.setForeground(new java.awt.Color(51, 51, 51));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        jTabbedPane1.setFocusable(false);
        jTabbedPane1.setMaximumSize(new java.awt.Dimension(650, 350));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(650, 350));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(650, 350));
        jTabbedPane1.setRequestFocusEnabled(false);

        all_jPAne.setBackground(new java.awt.Color(236, 234, 252));
        all_jPAne.setMinimumSize(new java.awt.Dimension(750, 809));
        all_jPAne.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        all_messTable.setBackground(new java.awt.Color(153, 204, 255));
        all_messTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        all_messTable.setForeground(new java.awt.Color(51, 0, 51));
        all_messTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "SenderId", "Message", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        all_messTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        all_messTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        all_messTable.setGridColor(new java.awt.Color(255, 204, 204));
        all_messTable.setOpaque(false);
        all_messTable.setRowHeight(75);
        all_messTable.setSelectionBackground(new java.awt.Color(255, 204, 204));
        all_messTable.setSelectionForeground(new java.awt.Color(51, 0, 51));
        all_messTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        all_messTable.setShowGrid(true);
        jScrollPane2.setViewportView(all_messTable);

        all_jPAne.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 680, 570));

        jTabbedPane1.addTab("tab5", all_jPAne);

        admin_jpane.setBackground(new java.awt.Color(236, 234, 252));
        admin_jpane.setMinimumSize(new java.awt.Dimension(750, 809));
        admin_jpane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        admin_messTable.setBackground(new java.awt.Color(153, 204, 255));
        admin_messTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        admin_messTable.setForeground(new java.awt.Color(51, 0, 51));
        admin_messTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "SenderId", "Message", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        admin_messTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        admin_messTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        admin_messTable.setGridColor(new java.awt.Color(255, 204, 204));
        admin_messTable.setOpaque(false);
        admin_messTable.setRowHeight(75);
        admin_messTable.setSelectionBackground(new java.awt.Color(255, 204, 204));
        admin_messTable.setSelectionForeground(new java.awt.Color(51, 0, 51));
        admin_messTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        admin_messTable.setShowGrid(true);
        jScrollPane6.setViewportView(admin_messTable);

        admin_jpane.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 680, 570));

        jTabbedPane1.addTab("tab5", admin_jpane);

        doctor_pane.setBackground(new java.awt.Color(236, 234, 252));
        doctor_pane.setMinimumSize(new java.awt.Dimension(750, 809));
        doctor_pane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        doctor_messTable.setBackground(new java.awt.Color(153, 204, 255));
        doctor_messTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        doctor_messTable.setForeground(new java.awt.Color(51, 0, 51));
        doctor_messTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "SenderId", "Message", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        doctor_messTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        doctor_messTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        doctor_messTable.setGridColor(new java.awt.Color(255, 204, 204));
        doctor_messTable.setOpaque(false);
        doctor_messTable.setRowHeight(75);
        doctor_messTable.setSelectionBackground(new java.awt.Color(255, 204, 204));
        doctor_messTable.setSelectionForeground(new java.awt.Color(51, 0, 51));
        doctor_messTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        doctor_messTable.setShowGrid(true);
        jScrollPane7.setViewportView(doctor_messTable);

        doctor_pane.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 680, 570));

        jTabbedPane1.addTab("tab5", doctor_pane);

        recept_pane.setBackground(new java.awt.Color(236, 234, 252));
        recept_pane.setMinimumSize(new java.awt.Dimension(750, 809));
        recept_pane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        recept_messTable.setBackground(new java.awt.Color(153, 204, 255));
        recept_messTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        recept_messTable.setForeground(new java.awt.Color(51, 0, 51));
        recept_messTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "SenderId", "Message", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        recept_messTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        recept_messTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        recept_messTable.setGridColor(new java.awt.Color(255, 204, 204));
        recept_messTable.setOpaque(false);
        recept_messTable.setRowHeight(75);
        recept_messTable.setSelectionBackground(new java.awt.Color(255, 204, 204));
        recept_messTable.setSelectionForeground(new java.awt.Color(51, 0, 51));
        recept_messTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        recept_messTable.setShowGrid(true);
        jScrollPane8.setViewportView(recept_messTable);

        recept_pane.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 680, 570));

        jTabbedPane1.addTab("tab5", recept_pane);

        panel4.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -200, 750, 820));

        panel1.add(panel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 700, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_receptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_receptionActionPerformed
        // TODO add your handling code here:
        all_jlabel.setText("");
        admin_jlabel.setText("");
        doctor_jlabel.setText("");
        reception_jlabel.setText("_____");
          refreshLabel.setText("");
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_btn_receptionActionPerformed

    private void btn_doctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_doctorsActionPerformed
        // TODO add your handling code here:
        all_jlabel.setText("");
        admin_jlabel.setText("");
        doctor_jlabel.setText("___");
        reception_jlabel.setText("");
          refreshLabel.setText("");
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_btn_doctorsActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        // TODO add your handling code here:
        all_jlabel.setText("");
        admin_jlabel.setText("");
        doctor_jlabel.setText("");
        reception_jlabel.setText("");
        refreshLabel.setText("_____");
        fetchAllTable();
        fetchAdminTable();
        fetchDoctorTable();
        fetchReceptTable();
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void btn_adminsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adminsActionPerformed
        // TODO add your handling code here:
        all_jlabel.setText("");
        admin_jlabel.setText("_______");
        doctor_jlabel.setText("");
        reception_jlabel.setText("");
        refreshLabel.setText("");
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_btn_adminsActionPerformed

    private void btn_allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_allActionPerformed
        // TODO add your handling code here:
        all_jlabel.setText("__");
        admin_jlabel.setText("");
        doctor_jlabel.setText("");
        reception_jlabel.setText("");
          refreshLabel.setText("");
        jTabbedPane1.setSelectedIndex(0);

    }//GEN-LAST:event_btn_allActionPerformed

    public void fetchAllTable() {
        try {
             String url = "jdbc:mysql://localhost:3306/HMS_DB";
             String username = "mahnat";
             String passwordDB = "mahnat2023";
            conn = DriverManager.getConnection(url, username, passwordDB);
            pstmt = conn.prepareStatement("SELECT senderId,messageContent,dateOfMessage,userType from messages where receiverId=?;");
            pstmt.setInt(1, LoginPanel.logedId);
            rs=pstmt.executeQuery();
            DefaultTableModel model = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false; // Make all cells non-editable
                }
            };
            model.addColumn("Sender Id");
            model.addColumn("Message Content");
            model.addColumn("Date of Message");
           

        while (rs.next()) {
            int id=rs.getInt(1);
            String message=rs.getString(2);
            LocalDate ld=rs.getDate(3).toLocalDate();
            String usertype=rs.getString(4);
            String senderIdStr="";
            
         if(usertype.equals("Owner")){
                if (id < 10) {
                senderIdStr += "O000" + id + "/15";
            } else if (id < 100 && id >= 10) {
                senderIdStr += "O00" + id + "/15";
            } else if (id < 1000 && id >= 100) {
                senderIdStr += "O0" + id + "/15";
            }
            }
         else if("Admin".equals(usertype)){
                if (id < 10) {
                senderIdStr += "A000" + id + "/15";
            } else if (id < 100 && id >= 10) {
                senderIdStr += "A00" + id + "/15";
            } else if (id < 1000 && id >= 100) {
                senderIdStr += "A0" + id + "/15";
            }
            }
         else if("Receptionist".equals(usertype)){
                if (id < 10) {
                senderIdStr += "R000" + id + "/15";
            } else if (id < 100 && id >= 10) {
                senderIdStr += "R00" + id + "/15";
            } else if (id < 1000 && id >= 100) {
                senderIdStr += "R0" + id + "/15";
            }
            }
          else if("Doctor".equals(usertype)){
                if (id < 10) {
                senderIdStr += "D000" + id + "/15";
            } else if (id < 100 && id >= 10) {
                senderIdStr += "D00" + id + "/15";
            } else if (id < 1000 && id >= 100) {
                senderIdStr += "D0" + id + "/15";
            }
            }
          else if("Patient".equals(usertype)){
                if (id < 10) {
                senderIdStr += "P000" + id + "/15";
            } else if (id < 100 && id >= 10) {
                senderIdStr += "P00" + id + "/15";
            } else if (id < 1000 && id >= 100) {
                senderIdStr += "P0" + id + "/15";
            }
            }
         System.out.println(usertype);
            System.out.println(senderIdStr);
            model.addRow(new Object[]{senderIdStr, message, ld});
        }

        all_messTable.setModel(model);

        rs.close();
        
        conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
       
    }
     public void fetchAdminTable() {
        try {
             String url = "jdbc:mysql://localhost:3306/HMS_DB";
             String username = "mahnat";
             String passwordDB = "mahnat2023";
            conn = DriverManager.getConnection(url, username, passwordDB);
            pstmt = conn.prepareStatement("SELECT senderId,messageContent,dateOfMessage,userType from messages where receiverId=? and userType=?;");
            pstmt.setInt(1, LoginPanel.logedId);
            pstmt.setString(2, "Admin");
            rs=pstmt.executeQuery();
            DefaultTableModel model = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false; // Make all cells non-editable
                }
            };
            model.addColumn("Sender Id");
            model.addColumn("Message Content");
            model.addColumn("Date of Message");
           

        while (rs.next()) {
            int id=rs.getInt(1);
            String message=rs.getString(2);
            LocalDate ld=rs.getDate(3).toLocalDate();
            String usertype=rs.getString(4);
            String senderIdStr="";
         if(usertype.equals("Owner")){
                if (id < 10) {
                senderIdStr += "O000" + id + "/15";
            } else if (id < 100 && id >= 10) {
                senderIdStr += "O00" + id + "/15";
            } else if (id < 1000 && id >= 100) {
                senderIdStr += "O0" + id + "/15";
            }
            }
         else if("Admin".equals(usertype)){
                if (id < 10) {
                senderIdStr += "A000" + id + "/15";
            } else if (id < 100 && id >= 10) {
                senderIdStr += "A00" + id + "/15";
            } else if (id < 1000 && id >= 100) {
                senderIdStr += "A0" + id + "/15";
            }
            }
         else if("Receptionist".equals(usertype)){
                if (id < 10) {
                senderIdStr += "R000" + id + "/15";
            } else if (id < 100 && id >= 10) {
                senderIdStr += "R00" + id + "/15";
            } else if (id < 1000 && id >= 100) {
                senderIdStr += "R0" + id + "/15";
            }
            }
          else if("Doctor".equals(usertype)){
                if (id < 10) {
                senderIdStr += "D000" + id + "/15";
            } else if (id < 100 && id >= 10) {
                senderIdStr += "D00" + id + "/15";
            } else if (id < 1000 && id >= 100) {
                senderIdStr += "D0" + id + "/15";
            }
            }
          else if("Patient".equals(usertype)){
                if (id < 10) {
                senderIdStr += "P000" + id + "/15";
            } else if (id < 100 && id >= 10) {
                senderIdStr += "P00" + id + "/15";
            } else if (id < 1000 && id >= 100) {
                senderIdStr += "P0" + id + "/15";
            }
            }
            model.addRow(new Object[]{senderIdStr, message, ld});
        }

        admin_messTable.setModel(model);

        rs.close();
        
        conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
       
    }
      public void fetchDoctorTable() {
        try {
             String url = "jdbc:mysql://localhost:3306/HMS_DB";
             String username = "mahnat";
             String passwordDB = "mahnat2023";
            conn = DriverManager.getConnection(url, username, passwordDB);
             pstmt = conn.prepareStatement("SELECT senderId,messageContent,dateOfMessage,userType from messages where receiverId=? and userType=?;");
            pstmt.setInt(1, LoginPanel.logedId);
            pstmt.setString(2, "Doctor");
            rs=pstmt.executeQuery();
            DefaultTableModel model = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false; // Make all cells non-editable
                }
            };
            model.addColumn("Sender Id");
            model.addColumn("Message Content");
            model.addColumn("Date of Message");
           

        while (rs.next()) {
            int id=rs.getInt(1);
            String message=rs.getString(2);
            LocalDate ld=rs.getDate(3).toLocalDate();
            String usertype=rs.getString(4);
            String senderIdStr="";
         if(usertype.equals("Owner")){
                if (id < 10) {
                senderIdStr += "O000" + id + "/15";
            } else if (id < 100 && id >= 10) {
                senderIdStr += "O00" + id + "/15";
            } else if (id < 1000 && id >= 100) {
                senderIdStr += "O0" + id + "/15";
            }
            }
         else if("Admin".equals(usertype)){
                if (id < 10) {
                senderIdStr += "A000" + id + "/15";
            } else if (id < 100 && id >= 10) {
                senderIdStr += "A00" + id + "/15";
            } else if (id < 1000 && id >= 100) {
                senderIdStr += "A0" + id + "/15";
            }
            }
         else if("Receptionist".equals(usertype)){
                if (id < 10) {
                senderIdStr += "R000" + id + "/15";
            } else if (id < 100 && id >= 10) {
                senderIdStr += "R00" + id + "/15";
            } else if (id < 1000 && id >= 100) {
                senderIdStr += "R0" + id + "/15";
            }
            }
          else if("Doctor".equals(usertype)){
                if (id < 10) {
                senderIdStr += "D000" + id + "/15";
            } else if (id < 100 && id >= 10) {
                senderIdStr += "D00" + id + "/15";
            } else if (id < 1000 && id >= 100) {
                senderIdStr += "D0" + id + "/15";
            }
            }
          else if("Patient".equals(usertype)){
                if (id < 10) {
                senderIdStr += "P000" + id + "/15";
            } else if (id < 100 && id >= 10) {
                senderIdStr += "P00" + id + "/15";
            } else if (id < 1000 && id >= 100) {
                senderIdStr += "P0" + id + "/15";
            }
            }
            model.addRow(new Object[]{senderIdStr, message, ld});
        }

        doctor_messTable.setModel(model);

        rs.close();
        
        conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
       
    }
       public void fetchReceptTable() {
        try {
             String url = "jdbc:mysql://localhost:3306/HMS_DB";
             String username = "mahnat";
             String passwordDB = "mahnat2023";
            conn = DriverManager.getConnection(url, username, passwordDB);
            pstmt = conn.prepareStatement("SELECT senderId,messageContent,dateOfMessage,userType from messages where receiverId=? and userType=?;");
            pstmt.setInt(1, LoginPanel.logedId);
            pstmt.setString(2, "Receptionist");
            rs=pstmt.executeQuery();
            DefaultTableModel model = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false; // Make all cells non-editable
                }
            };
            model.addColumn("Sender Id");
            model.addColumn("Message Content");
            model.addColumn("Date of Message");
           

        while (rs.next()) {
            int id=rs.getInt(1);
            String message=rs.getString(2);
            LocalDate ld=rs.getDate(3).toLocalDate();
            String usertype=rs.getString(4);
            String senderIdStr="";
         if(usertype.equals("Owner")){
                if (id < 10) {
                senderIdStr += "O000" + id + "/15";
            } else if (id < 100 && id >= 10) {
                senderIdStr += "O00" + id + "/15";
            } else if (id < 1000 && id >= 100) {
                senderIdStr += "O0" + id + "/15";
            }
            }
         else if("Admin".equals(usertype)){
                if (id < 10) {
                senderIdStr += "A000" + id + "/15";
            } else if (id < 100 && id >= 10) {
                senderIdStr += "A00" + id + "/15";
            } else if (id < 1000 && id >= 100) {
                senderIdStr += "A0" + id + "/15";
            }
            }
         else if("Receptionist".equals(usertype)){
                if (id < 10) {
                senderIdStr += "R000" + id + "/15";
            } else if (id < 100 && id >= 10) {
                senderIdStr += "R00" + id + "/15";
            } else if (id < 1000 && id >= 100) {
                senderIdStr += "R0" + id + "/15";
            }
            }
          else if("Doctor".equals(usertype)){
                if (id < 10) {
                senderIdStr += "D000" + id + "/15";
            } else if (id < 100 && id >= 10) {
                senderIdStr += "D00" + id + "/15";
            } else if (id < 1000 && id >= 100) {
                senderIdStr += "D0" + id + "/15";
            }
            }
          else if("Patient".equals(usertype)){
                if (id < 10) {
                senderIdStr += "P000" + id + "/15";
            } else if (id < 100 && id >= 10) {
                senderIdStr += "P00" + id + "/15";
            } else if (id < 1000 && id >= 100) {
                senderIdStr += "P0" + id + "/15";
            }
            }
            model.addRow(new Object[]{senderIdStr, message, ld});
        }

        recept_messTable.setModel(model);

        rs.close();
        
        conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
       
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admin_jlabel;
    private javax.swing.JPanel admin_jpane;
    private javax.swing.JTable admin_messTable;
    private javax.swing.JPanel all_jPAne;
    private javax.swing.JLabel all_jlabel;
    private javax.swing.JTable all_messTable;
    private GUI.CustomStyle.MyButton btn_admins;
    private GUI.CustomStyle.MyButton btn_all;
    private GUI.CustomStyle.MyButton btn_doctors;
    private GUI.CustomStyle.MyButton btn_reception;
    private GUI.CustomStyle.MyButton btn_refresh;
    private javax.swing.JLabel doctor_jlabel;
    private javax.swing.JTable doctor_messTable;
    private javax.swing.JPanel doctor_pane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private GUI.CustomStyle.Panel panel1;
    private GUI.CustomStyle.Panel panel2;
    private GUI.CustomStyle.Panel panel4;
    private GUI.CustomStyle.Panel panel6;
    private javax.swing.JTable recept_messTable;
    private javax.swing.JPanel recept_pane;
    private javax.swing.JLabel reception_jlabel;
    private javax.swing.JLabel refreshLabel;
    // End of variables declaration//GEN-END:variables
}
