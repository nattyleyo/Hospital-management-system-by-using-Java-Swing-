/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.PatientSide;

import GUI.DoctorSide.*;
import GUI.ReceptionistSide.*;
import java.awt.Color;
import javax.swing.table.JTableHeader;

/**
 *
 * @author HP
 */
public class Prescriptions extends javax.swing.JPanel {

    /**
     * Creates new form AdminEmployeed
     */
    public Prescriptions() {
        initComponents();
         JTableHeader tableHeader=prescriptionTable.getTableHeader();
        tableHeader.setForeground(new Color(204,255,255));
        tableHeader.setBackground(new Color(82,2,31));
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
        panel1 = new GUI.CustomStyle.Panel();
        Search_placeholder = new javax.swing.JLabel();
        search_field = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        panel6 = new GUI.CustomStyle.Panel();
        jLabel1 = new javax.swing.JLabel();
        panel7 = new GUI.CustomStyle.Panel();
        jScrollPane1 = new javax.swing.JScrollPane();
        prescriptionTable = new javax.swing.JTable();
        panel4 = new GUI.CustomStyle.Panel();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 51, 51));

        content.setBackground(new java.awt.Color(204, 255, 255));
        content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Search_placeholder.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Search_placeholder.setText("Search by Prescription_ID or Appointment_ID");
        panel1.add(Search_placeholder, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 290, 40));

        search_field.setBackground(new java.awt.Color(255, 255, 255));
        search_field.setBorder(null);
        search_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                search_fieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                search_fieldFocusLost(evt);
            }
        });
        search_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_fieldActionPerformed(evt);
            }
        });
        panel1.add(search_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 600, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 26, 28));

        content.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 660, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/prescription2.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        content.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 70, -1));

        panel6.setBackground(new java.awt.Color(20, 9, 148));
        panel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("Medical Prescriptions");
        panel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 200, 40));

        content.add(panel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 310, 40));

        panel7.setBackground(new java.awt.Color(255, 204, 204));

        prescriptionTable.setBackground(new java.awt.Color(255, 255, 255));
        prescriptionTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        prescriptionTable.setForeground(new java.awt.Color(51, 51, 51));
        prescriptionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Presc_ID", "Staff_ID", "DoctorName", "Appoint_ID", "Date", "MedicineName", "Dose", "Duration"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        prescriptionTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prescriptionTable.setEditingColumn(0);
        prescriptionTable.setEditingRow(0);
        prescriptionTable.setFocusable(false);
        prescriptionTable.setGridColor(new java.awt.Color(204, 204, 255));
        prescriptionTable.setOpaque(false);
        prescriptionTable.setRowHeight(25);
        prescriptionTable.setSelectionBackground(new java.awt.Color(255, 239, 235));
        prescriptionTable.setSelectionForeground(new java.awt.Color(0, 51, 255));
        jScrollPane1.setViewportView(prescriptionTable);

        panel4.setBackground(new java.awt.Color(51, 51, 51));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("PrescriptionsList");

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel7Layout = new javax.swing.GroupLayout(panel7);
        panel7.setLayout(panel7Layout);
        panel7Layout.setHorizontalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 948, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panel7Layout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel7Layout.setVerticalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        content.add(panel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 960, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, 1041, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void search_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_search_fieldFocusGained
        Search_placeholder.setText("");
    }//GEN-LAST:event_search_fieldFocusGained

    private void search_fieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_search_fieldFocusLost
        // TODO add your handling code here:
        Search_placeholder.setForeground(new java.awt.Color(187,187,187));
        Search_placeholder.setFont(new java.awt.Font("Segoe UI", 0, 14));
        Search_placeholder.setText("Search anything here . . . .");

    }//GEN-LAST:event_search_fieldFocusLost

    private void search_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_fieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Search_placeholder;
    private GUI.CustomStyle.Panel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private GUI.CustomStyle.Panel panel1;
    private GUI.CustomStyle.Panel panel4;
    private GUI.CustomStyle.Panel panel6;
    private GUI.CustomStyle.Panel panel7;
    private javax.swing.JTable prescriptionTable;
    private javax.swing.JTextField search_field;
    // End of variables declaration//GEN-END:variables
}
