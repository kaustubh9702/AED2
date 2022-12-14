/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Person;

import Model.Doctor.Doctor;
import Model.Doctor.DoctorDirectory;
import Model.Encounter.EncounterDirectory;
import Model.Hospital.HospitalDirectory;
import Model.Patient.PatientDirectory;
import Model.SignUp.SignUp;
import Model.SignUp.SignUpDirectory;
import Model.Vitals.VitalsDirectory;
import UI.SystemAdmin.MainJFrame;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class PersonJFrame extends javax.swing.JFrame {

    /**
     * Creates new form PersonJFrame
     */
    SignUpDirectory SignUpDirectory;
    HospitalDirectory HospitalDirectory;
    DoctorDirectory DoctorDirectory;
    PatientDirectory PatientDirectory;
    EncounterDirectory EncounterDirectory;
    VitalsDirectory VitalsDirectory;
    
    public PersonJFrame(SignUpDirectory SignUpDirectory, HospitalDirectory HospitalDirectory, DoctorDirectory DoctorDirectory, PatientDirectory PatientDirectory, EncounterDirectory EncounterDirectory, VitalsDirectory VitalsDirectory) {
        initComponents();
        this.SignUpDirectory = SignUpDirectory;
        this.HospitalDirectory = HospitalDirectory;
        this.DoctorDirectory = DoctorDirectory;
        this.PatientDirectory = PatientDirectory;
        this.EncounterDirectory = EncounterDirectory;
        this.VitalsDirectory = VitalsDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCity = new javax.swing.JLabel();
        txtAgeSignUp = new javax.swing.JTextField();
        lblState = new javax.swing.JLabel();
        txtAddressSignUp = new javax.swing.JTextField();
        lblPinCode = new javax.swing.JLabel();
        txtCitySignUp = new javax.swing.JTextField();
        txtStateSignUp = new javax.swing.JTextField();
        txtPinCodeSignUp = new javax.swing.JTextField();
        lblCreatePassword = new javax.swing.JLabel();
        lblConfirmPassword = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtCreatePasswordSignUp = new javax.swing.JTextField();
        txtConfirmPasswordSignUp = new javax.swing.JTextField();
        txtNameSignUp = new javax.swing.JTextField();
        lblDoB = new javax.swing.JLabel();
        btnUpdateSignUp = new javax.swing.JButton();
        lblAge = new javax.swing.JLabel();
        txtDoBSignUp = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        lblName2 = new javax.swing.JLabel();
        txtPersonID = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnFetch = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCity.setText("City:");

        txtAgeSignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAgeSignUpKeyPressed(evt);
            }
        });

        lblState.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblState.setText("Role");

        txtAddressSignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddressSignUpKeyPressed(evt);
            }
        });

        lblPinCode.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPinCode.setText("Pin Code:");

        txtCitySignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCitySignUpKeyPressed(evt);
            }
        });

        txtStateSignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtStateSignUpKeyPressed(evt);
            }
        });

        txtPinCodeSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPinCodeSignUpActionPerformed(evt);
            }
        });
        txtPinCodeSignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPinCodeSignUpKeyPressed(evt);
            }
        });

        lblCreatePassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCreatePassword.setText("Update Password:");

        lblConfirmPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblConfirmPassword.setText("Confirm Password:");

        lblName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblName.setText("Name:");

        txtCreatePasswordSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreatePasswordSignUpActionPerformed(evt);
            }
        });
        txtCreatePasswordSignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCreatePasswordSignUpKeyPressed(evt);
            }
        });

        txtConfirmPasswordSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmPasswordSignUpActionPerformed(evt);
            }
        });
        txtConfirmPasswordSignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConfirmPasswordSignUpKeyPressed(evt);
            }
        });

        txtNameSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameSignUpActionPerformed(evt);
            }
        });
        txtNameSignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameSignUpKeyPressed(evt);
            }
        });

        lblDoB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDoB.setText("DoB:");

        btnUpdateSignUp.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnUpdateSignUp.setText("Update");
        btnUpdateSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateSignUpActionPerformed(evt);
            }
        });
        btnUpdateSignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnUpdateSignUpKeyPressed(evt);
            }
        });

        lblAge.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAge.setText("Age:");

        txtDoBSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoBSignUpActionPerformed(evt);
            }
        });
        txtDoBSignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDoBSignUpKeyPressed(evt);
            }
        });

        lblAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAddress.setText("Address:");

        lblName1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblName1.setText("Person ID:");

        lblName2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblName2.setText("Password:");

        txtPersonID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPersonIDActionPerformed(evt);
            }
        });
        txtPersonID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPersonIDKeyPressed(evt);
            }
        });

        btnFetch.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnFetch.setText("Fetch");
        btnFetch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFetchActionPerformed(evt);
            }
        });

        btnLogOut.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnFetch)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName1)
                            .addComponent(lblName2))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPersonID, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(txtPassword)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCreatePassword)
                            .addComponent(lblConfirmPassword)
                            .addComponent(lblAge)
                            .addComponent(lblCity)
                            .addComponent(lblAddress)
                            .addComponent(lblName)
                            .addComponent(lblState)
                            .addComponent(lblPinCode)
                            .addComponent(lblDoB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAgeSignUp)
                            .addComponent(txtAddressSignUp)
                            .addComponent(txtCitySignUp)
                            .addComponent(txtStateSignUp)
                            .addComponent(txtDoBSignUp)
                            .addComponent(txtPinCodeSignUp)
                            .addComponent(txtNameSignUp)
                            .addComponent(txtCreatePasswordSignUp)
                            .addComponent(txtConfirmPasswordSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)))
                    .addComponent(btnUpdateSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLogOut)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName1)
                    .addComponent(txtPersonID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnFetch)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtNameSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDoB)
                    .addComponent(txtDoBSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAgeSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAddress, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAddressSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCitySignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblState)
                    .addComponent(txtStateSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPinCode)
                    .addComponent(txtPinCodeSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCreatePassword)
                    .addComponent(txtCreatePasswordSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConfirmPassword)
                    .addComponent(txtConfirmPasswordSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnUpdateSignUp)
                .addContainerGap(271, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAgeSignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeSignUpKeyPressed
        // TODO add your handling code here:
        btnUpdateSignUp.setEnabled(true);
    }//GEN-LAST:event_txtAgeSignUpKeyPressed

    private void txtAddressSignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressSignUpKeyPressed
        // TODO add your handling code here:
        btnUpdateSignUp.setEnabled(true);
    }//GEN-LAST:event_txtAddressSignUpKeyPressed

    private void txtCitySignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCitySignUpKeyPressed
        // TODO add your handling code here:
        btnUpdateSignUp.setEnabled(true);
    }//GEN-LAST:event_txtCitySignUpKeyPressed

    private void txtStateSignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStateSignUpKeyPressed
        // TODO add your handling code here:
        btnUpdateSignUp.setEnabled(true);
    }//GEN-LAST:event_txtStateSignUpKeyPressed

    private void txtPinCodeSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPinCodeSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPinCodeSignUpActionPerformed

    private void txtPinCodeSignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPinCodeSignUpKeyPressed
        // TODO add your handling code here:
        btnUpdateSignUp.setEnabled(true);
    }//GEN-LAST:event_txtPinCodeSignUpKeyPressed

    private void txtCreatePasswordSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreatePasswordSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCreatePasswordSignUpActionPerformed

    private void txtCreatePasswordSignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCreatePasswordSignUpKeyPressed
        // TODO add your handling code here:
        btnUpdateSignUp.setEnabled(true);
    }//GEN-LAST:event_txtCreatePasswordSignUpKeyPressed

    private void txtConfirmPasswordSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmPasswordSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmPasswordSignUpActionPerformed

    private void txtConfirmPasswordSignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmPasswordSignUpKeyPressed
        // TODO add your handling code here:
        btnUpdateSignUp.setEnabled(true);
    }//GEN-LAST:event_txtConfirmPasswordSignUpKeyPressed

    private void txtNameSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameSignUpActionPerformed

    private void txtNameSignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameSignUpKeyPressed
        // TODO add your handling code here:
        btnUpdateSignUp.setEnabled(true);
    }//GEN-LAST:event_txtNameSignUpKeyPressed

    private void btnUpdateSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateSignUpActionPerformed

        
            String Name = txtNameSignUp.getText();
            String DoB = txtDoBSignUp.getText();
            int Age = Integer.parseInt(txtAgeSignUp.getText());
            String Address = txtAddressSignUp.getText();
            String City = txtCitySignUp.getText();
            String State = txtStateSignUp.getText();
            int PinCode = Integer.parseInt(txtPinCodeSignUp.getText());
            String CreatePassword = txtCreatePasswordSignUp.getText();
            String ConfirmPassword = txtConfirmPasswordSignUp.getText();

            if (!Pattern.matches("^\\d+$", txtAgeSignUp.getText()))
            {
                JOptionPane.showMessageDialog(null, "Age cannot be Negative!", "Error", JOptionPane.ERROR_MESSAGE);
                btnUpdateSignUp.setEnabled(false);
            }
            else if (!Pattern.matches("^(1[0-9]|2[0-9]|3[0-9]|4[0-9]|5[0-9]|6[0-9]|7[0-9]|8[0-9]|9[0-9])$", txtAgeSignUp.getText()))
            {
                JOptionPane.showMessageDialog(null, "Age should be between 1 to 99!", "Error", JOptionPane.ERROR_MESSAGE);
                btnUpdateSignUp.setEnabled(false);
            }

            else if (!(Pattern.matches("^[0,1]?\\d{1}\\/(([0-2]?\\d{1})|([3][0,1]{1}))\\/(([1]{1}[9]{1}[9]{1}\\d{1})|([2-9]{1}\\d{3}))$", txtDoBSignUp.getText())))
            {
                JOptionPane.showMessageDialog(null, "Please enter date in mm/dd/yyyy format!", "Error", JOptionPane.ERROR_MESSAGE);
                btnUpdateSignUp.setEnabled(false);
            }
            else if (!(Pattern.matches("^([0-9]{5})$", txtPinCodeSignUp.getText())))
            {
                JOptionPane.showMessageDialog(null, "Pin Code should be 5 digits only!", "Error", JOptionPane.ERROR_MESSAGE);
                btnUpdateSignUp.setEnabled(false);
            }
            else if (!Pattern.matches("^(([a-z]|[0-9]){5})$", txtCreatePasswordSignUp.getText()))
            {
                JOptionPane.showMessageDialog(null, "The password should be a combination of characters and digits of length 5!", "Error", JOptionPane.ERROR_MESSAGE);
                btnUpdateSignUp.setEnabled(false);
            }
            else if (!txtCreatePasswordSignUp.getText().equals(txtConfirmPasswordSignUp.getText()))
            {

                JOptionPane.showMessageDialog(null, "Your Password should match!", "Error", JOptionPane.ERROR_MESSAGE);
                btnUpdateSignUp.setEnabled(false);
            }
            else if (Pattern.matches("^$", txtNameSignUp.getText()))
            {
                JOptionPane.showMessageDialog(null, "Name cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
                btnUpdateSignUp.setEnabled(false);
            }
            else if (Pattern.matches("^$", txtDoBSignUp.getText()))
            {
                JOptionPane.showMessageDialog(null, "Date of Birth cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
                btnUpdateSignUp.setEnabled(false);
            }
            else if (Pattern.matches("^$", txtAgeSignUp.getText()))
            {
                JOptionPane.showMessageDialog(null, "Age cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
                btnUpdateSignUp.setEnabled(false);
            }
            else if (Pattern.matches("^$", txtAddressSignUp.getText()))
            {
                JOptionPane.showMessageDialog(null, "Address cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
                btnUpdateSignUp.setEnabled(false);
            }
            else if (Pattern.matches("^$", txtCitySignUp.getText()))
            {
                JOptionPane.showMessageDialog(null, "City cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
                btnUpdateSignUp.setEnabled(false);
            }
            else if (Pattern.matches("^$", txtStateSignUp.getText()))
            {
                JOptionPane.showMessageDialog(null, "State cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
                btnUpdateSignUp.setEnabled(false);
            }
            else if (Pattern.matches("^$", txtPinCodeSignUp.getText()))
            {
                JOptionPane.showMessageDialog(null, "Pin Code cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
                btnUpdateSignUp.setEnabled(false);
            }
            else if (Pattern.matches("^$", txtCreatePasswordSignUp.getText()))
            {
                JOptionPane.showMessageDialog(null, "Password cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
                btnUpdateSignUp.setEnabled(false);
            }
            else 
            
            {
                for(SignUp su : SignUpDirectory.getSignUpDirectory())
        {
            if (String.valueOf(su.getPersonID()).equals(txtPersonID.getText()))
                    {
                    su.setName(Name);
                    su.setDoB(DoB);
                    su.setAge(Age);
                    su.setAddress(Address);
                    su.setCity(City);
                    su.setState(State);
                    su.setPinCode(PinCode);
                    su.setCreatePassword(CreatePassword);
                    su.setConfirmPassword(ConfirmPassword);
                        
                    JOptionPane.showMessageDialog(this, "Person Details Updated");

                    txtNameSignUp.setText("");
                    txtDoBSignUp.setText("");
                    txtAgeSignUp.setText("");
                    txtAddressSignUp.setText("");
                    txtCitySignUp.setText("");
                    txtStateSignUp.setText("");
                    txtPinCodeSignUp.setText("");
                    txtCreatePasswordSignUp.setText("");
                    txtConfirmPasswordSignUp.setText("");
                    }
            for (Doctor d : DoctorDirectory.getDoctorDirectory()){
                if (String.valueOf(d.getPersonID()).equals(txtPersonID.getText())){
                    d.setDoctorName(Name);
                    d.setAge(Age);
                    d.setAddress(Address);
                    d.setCity(City);
                    d.setState(State);
                    d.setPinCode(PinCode);
                }
            
                }
        }
            }
            
    }//GEN-LAST:event_btnUpdateSignUpActionPerformed

    private void btnUpdateSignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnUpdateSignUpKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateSignUpKeyPressed

    private void txtDoBSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoBSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoBSignUpActionPerformed

    private void txtDoBSignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDoBSignUpKeyPressed
        // TODO add your handling code here:
        btnUpdateSignUp.setEnabled(true);
    }//GEN-LAST:event_txtDoBSignUpKeyPressed

    private void txtPersonIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPersonIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPersonIDActionPerformed

    private void txtPersonIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPersonIDKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPersonIDKeyPressed

    private void btnFetchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFetchActionPerformed
        // TODO add your handling code here:
        boolean check = false;
        for(SignUp selectedSignUp : SignUpDirectory.getSignUpDirectory())
        {   
            {
            if ((String.valueOf(selectedSignUp.getPersonID()).equals(txtPersonID.getText())) && (String.valueOf(selectedSignUp.getCreatePassword()).equals(txtPassword.getText())))
                    {
                        txtNameSignUp.setText(String.valueOf(selectedSignUp.getName()));
                        txtDoBSignUp.setText(String.valueOf(selectedSignUp.getDoB()));
                        txtAgeSignUp.setText(String.valueOf(selectedSignUp.getAge()));
                        txtAddressSignUp.setText(String.valueOf(selectedSignUp.getAddress()));
                        txtCitySignUp.setText(String.valueOf(selectedSignUp.getCity()));
                        txtStateSignUp.setText(String.valueOf(selectedSignUp.getState()));
                        txtPinCodeSignUp.setText(String.valueOf(selectedSignUp.getPinCode()));
                        txtCreatePasswordSignUp.setText(String.valueOf(selectedSignUp.getCreatePassword()));
                        txtConfirmPasswordSignUp.setText(String.valueOf(selectedSignUp.getConfirmPassword())); 
                        check = false;
                        break;
                    } 
            else
            {
                check = true;
            }
        }
    }//GEN-LAST:event_btnFetchActionPerformed
        if(check == true){
            JOptionPane.showMessageDialog(this, "This user doesn't exist");
            }   
    }
    
    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        new MainJFrame(SignUpDirectory, HospitalDirectory, DoctorDirectory, PatientDirectory, EncounterDirectory, VitalsDirectory).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLogOutActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(PersonJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(PersonJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(PersonJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(PersonJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new PersonJFrame().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFetch;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnUpdateSignUp;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblCreatePassword;
    private javax.swing.JLabel lblDoB;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblName2;
    private javax.swing.JLabel lblPinCode;
    private javax.swing.JLabel lblState;
    private javax.swing.JTextField txtAddressSignUp;
    private javax.swing.JTextField txtAgeSignUp;
    private javax.swing.JTextField txtCitySignUp;
    private javax.swing.JTextField txtConfirmPasswordSignUp;
    private javax.swing.JTextField txtCreatePasswordSignUp;
    private javax.swing.JTextField txtDoBSignUp;
    private javax.swing.JTextField txtNameSignUp;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPersonID;
    private javax.swing.JTextField txtPinCodeSignUp;
    private javax.swing.JTextField txtStateSignUp;
    // End of variables declaration//GEN-END:variables
}
