/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Encounter;

import Model.Doctor.DoctorDirectory;
import Model.Encounter.Encounter;
import Model.Encounter.EncounterDirectory;
import Model.Hospital.HospitalDirectory;
import Model.Patient.Patient;
import Model.Patient.PatientDirectory;
import Model.SignUp.SignUpDirectory;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class EncounterRecordsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EncounterRecordsJPanel
     */
    SignUpDirectory SignUpDirectory;
    HospitalDirectory HospitalDirectory;
    DoctorDirectory DoctorDirectory;
    PatientDirectory PatientDirectory;
    EncounterDirectory EncounterDirectory;
    public EncounterRecordsJPanel(SignUpDirectory SignUpDirectory, HospitalDirectory HospitalDirectory, DoctorDirectory DoctorDirectory, PatientDirectory PatientDirectory,String PtID, EncounterDirectory EncounterDirectory) {
        initComponents();
        this.SignUpDirectory = SignUpDirectory;
        this.HospitalDirectory = HospitalDirectory;
        this.DoctorDirectory = DoctorDirectory;
        this.PatientDirectory = PatientDirectory;
        this.EncounterDirectory = EncounterDirectory;
        for(Patient selectedSignUp : PatientDirectory.getPatientDirectory()){
            if (String.valueOf(selectedSignUp.getHospitalID()).equals(PtID)){
            txtPatientID.setText(String.valueOf(selectedSignUp.getPatientID()));
            txtPatientName.setText(String.valueOf(selectedSignUp.getPatientName())); 
            }
        }
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSearchPerson = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEncounterDirectory = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtPatientID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        txtHospitalName = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        lblAddress1 = new javax.swing.JLabel();
        txtTimeStamp = new javax.swing.JTextField();
        lblAddress2 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtDoctorName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        txtEncounterID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        txtSearchPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchPersonActionPerformed(evt);
            }
        });
        txtSearchPerson.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchPersonKeyPressed(evt);
            }
        });

        jLabel3.setText("Search:");

        jLabel2.setFont(new java.awt.Font("Futura", 1, 18)); // NOI18N
        jLabel2.setText("Encounter History");

        tblEncounterDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient's Name", "Encounter ID", "Patient ID", "Hospital's Name", "DoctorID", "Doctor's Name", "Date", "TimeStamp"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEncounterDirectory);

        jLabel1.setText("Patient ID:");

        txtPatientID.setEditable(false);
        txtPatientID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIDActionPerformed(evt);
            }
        });

        jLabel5.setText("Patient's Name:");

        txtPatientName.setEditable(false);

        txtHospitalName.setEditable(false);
        txtHospitalName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtHospitalName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospitalNameActionPerformed(evt);
            }
        });

        txtDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDateKeyPressed(evt);
            }
        });

        lblAddress1.setText("Date:");

        txtTimeStamp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimeStampKeyPressed(evt);
            }
        });

        lblAddress2.setText("Time Stamp:");

        lblName.setText("Doctor's Name:");

        txtDoctorName.setEditable(false);
        txtDoctorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorNameActionPerformed(evt);
            }
        });
        txtDoctorName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDoctorNameKeyPressed(evt);
            }
        });

        jLabel4.setText("Hospital Name:");

        btnView.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        txtEncounterID.setEditable(false);
        txtEncounterID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtEncounterID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEncounterIDActionPerformed(evt);
            }
        });

        jLabel6.setText("Encounter ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSearchPerson)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtPatientName)))))
                            .addComponent(btnView)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblAddress2)
                                        .addComponent(lblAddress1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTimeStamp, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblName)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel6))
                                    .addGap(20, 20, 20)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtEncounterID)
                                        .addComponent(txtHospitalName)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnUpdate)
                                    .addGap(28, 28, 28))))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSearchPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnView)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEncounterID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddress1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimeStamp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddress2))
                .addGap(18, 18, 18)
                .addComponent(btnUpdate)
                .addContainerGap(171, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchPersonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchPersonActionPerformed

    private void txtSearchPersonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchPersonKeyPressed
        // TODO add your handling code here:
        DefaultTableModel tableModel = (DefaultTableModel)tblEncounterDirectory.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tableModel);
        tblEncounterDirectory.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txtSearchPerson.getText().trim()));
    }//GEN-LAST:event_txtSearchPersonKeyPressed

    private void txtPatientIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIDActionPerformed

    private void txtHospitalNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospitalNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospitalNameActionPerformed

    private void txtDateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDateKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateKeyPressed

    private void txtTimeStampKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimeStampKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimeStampKeyPressed

    private void txtDoctorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoctorNameActionPerformed

    private void txtDoctorNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDoctorNameKeyPressed
        // TODO add your handling code here:
        btnUpdate.setEnabled(true);
    }//GEN-LAST:event_txtDoctorNameKeyPressed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblEncounterDirectory.getSelectedRow();

        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblEncounterDirectory.getModel();
        Encounter selectedSignUp = (Encounter) model.getValueAt(selectedRowIndex,0);
        
        txtEncounterID.setText(String.valueOf(selectedSignUp.getEncounterID()));
        txtHospitalName.setText(String.valueOf(selectedSignUp.getHospitalName()));
        txtDoctorName.setText(String.valueOf(selectedSignUp.getDoctorName()));
        txtDate.setText(String.valueOf(selectedSignUp.getDate()));
        txtTimeStamp.setText(String.valueOf(selectedSignUp.getTimeStamp()));

    }//GEN-LAST:event_btnViewActionPerformed

    private void txtEncounterIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEncounterIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEncounterIDActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if(tblEncounterDirectory.getSelectedRow()<0) {
            JOptionPane.showMessageDialog(this , "Please select a row to update.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblEncounterDirectory.getModel();
        Encounter su = (Encounter) model.getValueAt(tblEncounterDirectory.getSelectedRow(), 0);
        
        if (!(Pattern.matches("^[0,1]?\\d{1}\\/(([0-2]?\\d{1})|([3][0,1]{1}))\\/(([1]{1}[9]{1}[9]{1}\\d{1})|([2-9]{1}\\d{3}))$", txtDate.getText())))
            {
                JOptionPane.showMessageDialog(null, "Please enter date in mm/dd/yyyy format!", "Error", JOptionPane.ERROR_MESSAGE);
     
            }
        else if (Pattern.matches("^$", txtDate.getText()))
            {
                JOptionPane.showMessageDialog(null, "Date of Birth cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
               
            }
        else{

        if (tblEncounterDirectory.getSelectedRowCount()==1) {
            
            String Date = txtDate.getText();
            String TimeStamp = txtTimeStamp.getText();

            su.setDate(Date);
            su.setTimeStamp(TimeStamp);

            model.setValueAt(Date, tblEncounterDirectory.getSelectedRow(), 5);
            model.setValueAt(TimeStamp, tblEncounterDirectory.getSelectedRow(), 6);
            
            JOptionPane.showMessageDialog(this, "Person Details Updated");

            txtEncounterID.setText("");
            txtDoctorName.setText("");
            txtHospitalName.setText("");
            txtDate.setText("");
            txtTimeStamp.setText("");

            populateTable();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress1;
    private javax.swing.JLabel lblAddress2;
    private javax.swing.JLabel lblName;
    private javax.swing.JTable tblEncounterDirectory;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDoctorName;
    private javax.swing.JTextField txtEncounterID;
    private javax.swing.JTextField txtHospitalName;
    private javax.swing.JTextField txtPatientID;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtSearchPerson;
    private javax.swing.JTextField txtTimeStamp;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblEncounterDirectory.getModel();
        model.setRowCount(0);
        
        for (Encounter su : EncounterDirectory.getEncounterDirectory()){
            if (String.valueOf(su.getPatientID()).equals(txtPatientID.getText())){
            Object[] row = new Object[10];
            row[0] = su;
            row[1] = su.getEncounterID();
            row[2] = su.getPatientID();
            row[3] = su.getHospitalName();
            row[4] = su.getDoctorID();
            row[5] = su.getDoctorName();
            row[6] = su.getDate();
            row[7] = su.getTimeStamp();
            
            model.addRow(row);
            }
        }
    }
}
