/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author MightyGoogle
 */

import java.io.*;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Homepage extends javax.swing.JFrame {

    
    public MyHashTable EmployeeHashTable;

    /**
     * Creates new form Homepage
     */
    public Homepage() throws FileNotFoundException {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(204, 255, 255));

        EmployeeHashTable = new MyHashTable(10);
        enterInfoBackIntoHashTable();

    }
    
    public MyHashTable getTheHashTable() {
        return EmployeeHashTable;
    }
    
    public void setMainHT(MyHashTable theRefVal) {
        EmployeeHashTable = theRefVal;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(204, 255, 255));

        jButton1.setText("Add employee");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Remove employee");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Change employee information");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Get employee information");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("List all employee information");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("American Typewriter", 1, 18)); // NOI18N
        jLabel1.setText("Employee Management System");

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/MightyGoogle/NetBeansProjects/Employee_management_system/Icons/Employees.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)))
                .addGap(67, 67, 67))
            .addGroup(layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        PTEOrFTE thePTEOrFTEWindow = new PTEOrFTE();
        thePTEOrFTEWindow.setVisible(true);
        MyHashTable refVal = getTheHashTable();
        thePTEOrFTEWindow.setMainHT(refVal);
        super.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        RemoveEmployee theRemoveEmployeeWindow = new RemoveEmployee();
        theRemoveEmployeeWindow.setVisible(true);
        MyHashTable refVal = getTheHashTable();
        theRemoveEmployeeWindow.setMainHT(refVal);
        super.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ChangeEmployeeInfo theChangeEmployeeInfoWindow = new ChangeEmployeeInfo();
        theChangeEmployeeInfoWindow.setVisible(true);
        MyHashTable refVal = getTheHashTable();
        theChangeEmployeeInfoWindow.setMainHT(refVal); 
        super.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        GetEmployeeInformation theSingleInformationEmployeeWindow = new GetEmployeeInformation();
        theSingleInformationEmployeeWindow.setVisible(true);
        MyHashTable refVal = getTheHashTable();
        theSingleInformationEmployeeWindow.setMainHT(refVal);
        super.dispose();        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            // TODO add your handling code here:
            ListAllEmployeeInformation allEmployeeInformationWindow = new ListAllEmployeeInformation();
            allEmployeeInformationWindow.setVisible(true);
            MyHashTable refVal = getTheHashTable();
            allEmployeeInformationWindow.setMainHT(refVal);
            super.dispose();            
       } catch (FileNotFoundException ex) {
            Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void enterInfoBackIntoHashTable() throws FileNotFoundException{
        String stringNumber = ""; int employeeNumber; String firstName = ""; String lastName = ""; String gender = ""; String workLocation = ""; String stringDeductionRate = ""; double deductionRate; String stringSalary = ""; double salary;
        String stringHourlyWage = ""; double hourlyWage; String stringHoursPerWeek = ""; double hoursPerWeek; String stringWeeksPerYear = ""; double weeksPerYear;
        File FTEFile = new File("/Users/MightyGoogle/NetBeansProjects/Employee_management_system/FullTimeEmployeeData.txt");
        if(FTEFile.length() > 0){
            Scanner FTEscan = new Scanner(FTEFile);
            FTEscan.useDelimiter("[,\n]");

            while(FTEscan.hasNext()){
                stringNumber = FTEscan.next();
                employeeNumber = Integer.parseInt(stringNumber);
                firstName = FTEscan.next();
                lastName = FTEscan.next();
                gender = FTEscan.next();
                workLocation = FTEscan.next();
                stringDeductionRate = FTEscan.next();
                deductionRate = Double.parseDouble(stringDeductionRate);
                stringSalary = FTEscan.next();
                salary = Double.parseDouble(stringSalary);
                FTE theFTE = new FTE(employeeNumber, firstName, lastName, gender, workLocation, deductionRate, salary);
                try {
                    EmployeeHashTable.addToTable(theFTE);
                } catch (IOException ex) {
                    Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            FTEscan.close();
        }

 
        File PTEFile = new File("/Users/MightyGoogle/NetBeansProjects/Employee_management_system/PartTimeEmployeeData.txt");
        if(PTEFile.length() > 0){

            Scanner PTEScan = new Scanner(PTEFile);
            PTEScan.useDelimiter("[,\n]");
            while(PTEScan.hasNext()){

                stringNumber = PTEScan.next();
                employeeNumber = Integer.parseInt(stringNumber);
                firstName = PTEScan.next();
                lastName = PTEScan.next();
                gender = PTEScan.next();
                workLocation = PTEScan.next();
                stringDeductionRate = PTEScan.next();
                deductionRate = Double.parseDouble(stringDeductionRate);
                stringHourlyWage = PTEScan.next();
                hourlyWage = Double.parseDouble(stringHourlyWage);
                stringHoursPerWeek = PTEScan.next();
                hoursPerWeek = Double.parseDouble(stringHoursPerWeek);
                stringWeeksPerYear = PTEScan.next();
                weeksPerYear = Double.parseDouble(stringWeeksPerYear);

            PTE thePTE = new PTE(employeeNumber, firstName, lastName, gender, workLocation, deductionRate, hourlyWage, hoursPerWeek, weeksPerYear);    
                try {
                    EmployeeHashTable.addToTable(thePTE);
                } catch (IOException ex) {
                    Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
                }
   
            }
            PTEScan.close();
        }

        return;
    }
    
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
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try { 
                    new Homepage().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
