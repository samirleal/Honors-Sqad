/*
 * Team Name: Andrew's Honor Squad 2: High Honors
 * Team Members: Justin Jiang, Samir Leal, Phi Nguyen, Eric Sullivan
 * Date: 04-30-15
 *
 * Purpose: You and your team members will simulate to develop the software called
 * "Medical Doctor".  The software will be used in hospital for managing and updating
 * not only the patient information but also prescription, and other physical test.
 * The software should be developed with well-designed Graphical User Interface (GUI)
 * so that medical doctors can easily access and manage the patient information.
 *
 * Program Contents: The "Medical Doctor" software should have following contents on GUI:
 * 1. Registration
 * 2. Doctor General Practice
 * 3. Nursing
 */
package Gui;

import Backend.*;

import java.awt.Color;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.*;


import javax.swing.JOptionPane;

/**
 *
 * @author jusji_000
 */
public class Nursing extends javax.swing.JFrame {
	private String patientSSN = "";
	private String date = "";
	private int vid;
    /**
     * Creates new form Nursing
     */

    public Nursing(String ssn) {
    	initComponents();
        patientSSN = ssn;
    	setLocationRelativeTo(null);
    	setVisible(true);
    	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        date = dateFormat.format(cal.getTime());
        try { 
   	    	String po = "";
   	    	String na = "";
   	    	String nextVisit = "";
   	    	String labNotes = "";
   	    	
   	    	// Get vid of patient
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/honorsmedicaldoctor", "HonorsAdmin", "h0n3r5a2m1n");
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM Visits WHERE SSN='" + patientSSN + "' AND VisitDate='" + date +  "'";
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {            
                vid = rs.getInt(1);
            }   
            
            // Get Patient's prescriptions
            sql = "SELECT * FROM Prescriptions WHERE VID='" + vid + "'";
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
            	// Check the check boxes if patient needs a prescription
                po = rs.getString("OralMedication");    
                if(rs.getInt(3) == 1)
                	jCheckBox1.setSelected(true);
                if(rs.getInt(4) == 1)
	            	jCheckBox2.setSelected(true);
                if(rs.getInt(5) == 1)
	            	jCheckBox3.setSelected(true);            	
            }            
            // Set the patient's oral medications
            jTextArea1.setText(po);
            
            // Get boolean values from lab
            // Check the box in the table if true
            sql = "SELECT * FROM Labs WHERE VID='" + vid + "'";
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
            	labNotes = rs.getString("LabNotes");
            	for(int i = 3; i < 13; i++){
            		if(rs.getInt(i) == 1){
            			jTable1.setValueAt(true,i - 3,1);
            		}
            	}
            }
            laboratorynotesTextArea.setText(labNotes);
            
            //Get nursing activity and set the text
            sql = "SELECT * FROM Visits WHERE VID='" + vid + "' AND VisitDate='" + date + "'";
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                na = rs.getString("NursingActivity");
            }
            jTextArea3.setText(na);
            
            //Get patient's next visit and set the text
            sql = "SELECT * FROM Patients WHERE SSN='" + patientSSN + "'";
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
            	// if NextVisit is not null, nextVisit = NextVisit
            	if(rs.getDate("NextVisit") != null)
            		nextVisit = rs.getDate("NextVisit").toString();
            }
            jTextField1.setText(nextVisit);

            rs.close();
            stmt.close();
            con.close();
                        
        } catch (ClassNotFoundException e) {
            
            System.out.println(e.getMessage());
            
        } catch (SQLException e) {
            
            System.out.println(e.getMessage());
            
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        laboratorynotesTextArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nursing");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Intramuscular injection (IM)");

        jCheckBox1.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Intravascular injection (IV)");

        jCheckBox2.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Subcutaneous injection (SC)");

        jCheckBox3.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox3)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox2)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox3)
                    .addComponent(jLabel6))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("P.O (Per Os; Oral medication)");

        jTextArea1.setEditable(false);
        jTextArea1.setLineWrap(true);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                        .addGap(48, 48, 48))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Labs", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jTable1.setModel(new NonEditableTable() {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        String[] columns = {"Labs", "Ordered?"};
        ((NonEditableTable) jTable1.getModel()).setColumnIdentifiers(columns);
        String[] labs = {"Red Blood Cell", "White Blood Cell",
            "Liver Function",
            "Renal Function",
            "Electrolyte",
            "X-Ray",
            "Computed Tomography",
            "MRI",
            "Urinary Test",
            "StoolTest" };

        for (int i = 0; i < labs.length; i++) {
            ((NonEditableTable) jTable1.getModel()).addRow(new Object[]{labs[i],false});
        }
        jScrollPane4.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Activities Performed", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setLineWrap(true);
        jScrollPane3.setViewportView(jTextArea3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        jButton1.setText("Save Activities");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Print Order");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Follow-up visit:");

        jButton3.setText("Back to Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Laboratory Notes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        laboratorynotesTextArea.setColumns(20);
        laboratorynotesTextArea.setRows(5);
        laboratorynotesTextArea.setLineWrap(true);
        laboratorynotesTextArea.setEditable(false);
        jScrollPane6.setViewportView(laboratorynotesTextArea);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setMnemonic('F');
        jMenu1.setText("File");

        jMenuItem1.setMnemonic('L');
        jMenuItem1.setText("Logout");
        jMenuItem1.setToolTipText("Logout");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setMnemonic('x');
        jMenuItem2.setText("Exit");
        jMenuItem2.setToolTipText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(376, 376, 376))
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Called when the exit menu item is pressed
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        // Exits the program
        System.exit(0);
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    // Called when the logout menu item is pressed
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    
        // Opens the login screen
        new Login();
        
        // Disposes this screen
        this.dispose();
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    // Called when the Back to Search button is clicked
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   
    	int save = JOptionPane.showConfirmDialog(null, "Would you like to save your changes", "Save", JOptionPane.YES_NO_OPTION);
        // If Yes option pressed
        if (save == JOptionPane.YES_OPTION) {
            // Calls the Save General Practice button
            jButton1ActionPerformed(evt);
            // Creates a new nurse patient search screen
            new NursingSearch();
            // Disposes of this screen
            this.dispose();
        }
        if (save == JOptionPane.NO_OPTION) {
            // Opens the DoctorGeneralPractice screen
            new NursingSearch();
            // Disposes of this screen
            this.dispose();
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    // Button Listener for "Save Activities"
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        try { 
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/honorsmedicaldoctor", "HonorsAdmin", "h0n3r5a2m1n");
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM Visits WHERE SSN='" + patientSSN + "'";
            ResultSet rs = stmt.executeQuery(sql);
            
            if (rs.next()) {                
                vid = rs.getInt(1);
            }
            
            //Add Nursing Activity into the Visits table
            sql = "UPDATE Visits SET NursingActivity='" + jTextArea3.getText() + "' WHERE vid='" + vid + "'"; 
            stmt.executeUpdate(sql);
            
            if(!jTextField1.getText().equals("")){
	            //Follow-Up date must be in the correct format
	            if(!jTextField1.getText().matches("[0-9]{4}-[0-1][0-9]-[0-3][0-9]")){
	            	JOptionPane.showMessageDialog(null, "Follow-Up must be YYYY-MM-DD\n", "Check Date Format", JOptionPane.INFORMATION_MESSAGE);
	            }
	            //Update NextVisit
	            else{
	            	sql = "UPDATE Patients SET NextVisit='" + jTextField1.getText() + "' WHERE SSN='" + patientSSN + "'";
	                stmt.executeUpdate(sql);
	            	JOptionPane.showMessageDialog(null, "Successfully saved Activities", "Activities", JOptionPane.INFORMATION_MESSAGE);
	            }           
            }
            else
            	JOptionPane.showMessageDialog(null, "Successfully saved Activities", "Activities", JOptionPane.INFORMATION_MESSAGE);
            rs.close();
            stmt.close();
            con.close();
            
            
        } catch (ClassNotFoundException e) {
            
            System.out.println(e.getMessage());
            
        } catch (SQLException e) {
            
            System.out.println(e.getMessage());
            
        }
    }      
    
    // Button listener for "Print Order"
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
    	try{
    		int script1 = 0;
    		int script2 = 0;
    		int script3 = 0;
    		String lastName = "";
    		String firstName = "";
    		String nextVisit = "";
    		String po = "";
    		String[] labs = {"No","No","No","No","No","No","No","No","No","No"};
    		String na = "";
	    	Class.forName("com.mysql.jdbc.Driver");
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/honorsmedicaldoctor", "HonorsAdmin", "h0n3r5a2m1n");
	        Statement stmt = con.createStatement();
	        String sql = "SELECT * FROM Visits WHERE SSN='" + patientSSN + "'";
	        ResultSet rs = stmt.executeQuery(sql);
	        
	        // Get vid of patient
	        if (rs.next()) {                
                vid = rs.getInt(1);
                na = rs.getString("NursingActivity");
            }
	        
	        //Get patient's first name, last name, and next visit date
	        sql = "SELECT * FROM Patients WHERE SSN='" + patientSSN + "'";
	        rs = stmt.executeQuery(sql);	    
	        if (rs.next()) {     
	        	lastName = rs.getString(2);
	        	firstName = rs.getString(3);
	        	nextVisit = rs.getString("NextVisit");
            }
	        
	        // Get Boolean value from labs
	        // Store a "Yes" or a "No" into a String array 
	        sql = "SELECT * FROM Labs WHERE VID='" + vid + "'";
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
            	for(int i = 3; i < 13; i++){
            		if(rs.getInt(i) == 1){
            			labs[i - 3] = "Yes";
            		}
            		else
            			labs[i - 3] = "No";
            	}
            }
	        
	        sql = "SELECT * FROM Prescriptions WHERE vid='" + vid + "'";
	        rs = stmt.executeQuery(sql);
            
	        if(rs.next()){	        	
		        script1 = rs.getInt(3);
		        script2 = rs.getInt(4);
		        script3 = rs.getInt(5);
		        po = rs.getString(6);		       
		    }	        
	        // Create the Prescriptions directory
        	// Create the text file for the order
        	new File("\\Prescriptions").mkdir();
        	File file = new File("C:\\Prescriptions\\" + lastName + ", " + firstName + " Prescriptions " + date + ".txt");
        	if (!file.exists()){
                file.createNewFile();
            } 
        	// Write to the text file everything on the nursing screen
	    	FileWriter fw = new FileWriter(file);
	        BufferedWriter bw = new BufferedWriter(fw);
	        
	        if(script1 == 1){
	        	 bw.write("Intramuscular Injection:	Yes"); 
	        	 bw.newLine();
	        }
	        else{
	        	 bw.write("Intramuscular Injection:	No"); 
	        	 bw.newLine();
	        }
	        if(script2 == 1){
	        	 bw.write("Intravascular Injection:	Yes"); 
	        	 bw.newLine();
	        }
	        else{
	        	bw.write("Intravascular Injection:	No"); 
	        	bw.newLine();
	        }
	        if(script3 == 1){
	        	 bw.write("Subcutaneous Injection:		Yes"); 
	        	 bw.newLine();
	        }
	        else{
	        	bw.write("Subcutaneous Injection:		No"); 
	        	bw.newLine();
	        }
	        
	        bw.newLine();
	        bw.write("Oral Medication:");
	        bw.newLine();
	        bw.write(po);
	        bw.newLine();

	        bw.newLine();
	        bw.write("Labs:");
	        bw.newLine();
	        bw.write("Red Blood Cell:			" + labs[0]);
	        bw.newLine();
	        bw.write("White Blood Cell:		" + labs[1]);
	        bw.newLine();
	        bw.write("Liver Function:			" + labs[2]);
	        bw.newLine();
	        bw.write("Renal Function:			" + labs[3]);
	        bw.newLine();
	        bw.write("Electrolyte:			" + labs[4]);
	        bw.newLine();
	        bw.write("X-Ray:				" + labs[5]);
	        bw.newLine();
	        bw.write("Computed Tomography:		" + labs[6]);
	        bw.newLine();
	        bw.write("MRI:				" + labs[7]);
	        bw.newLine();
	        bw.write("Urinary Test:			" + labs[8]);
	        bw.newLine();
	        bw.write("Stool Test:			" + labs[9]);
	        bw.newLine();
	        
	        bw.newLine();
	        bw.write("Nursing Activity:");
	        bw.newLine();
	        bw.write(na);
	        bw.newLine();
	        
	        bw.newLine();
	        bw.write("Follow-Up Date:");
	        bw.newLine();
	        bw.write(nextVisit);
	        bw.newLine();
	       
	        bw.close();
	        
	        // Text file is created
	        // User can choose to open the text file right away
	        int n = JOptionPane.showConfirmDialog(null, "Prescription for " + lastName + ", " + firstName + " created in " + file + 
	        		"\nWould you like to open the file now?", "Prescriptions", JOptionPane.YES_NO_OPTION);
	        if(n == JOptionPane.YES_OPTION){
		        Runtime rt = Runtime.getRuntime();
		        Process p = rt.exec("notepad " + file);
	        }
    	}
	    catch (ClassNotFoundException e) {
	        
	        System.out.println(e.getMessage());
	        
	    } 
    	catch (SQLException e) {
	      
	        System.out.println(e.getMessage());
	        
	    }
    	catch (IOException e) {
  	      
	        System.out.println(e.getMessage());
	        
	    }
    }

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
            java.util.logging.Logger.getLogger(Nursing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nursing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nursing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nursing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea laboratorynotesTextArea;
    // End of variables declaration//GEN-END:variables
}
