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

import java.awt.event.*;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Eric Sullivan
 */
public class Registration extends javax.swing.JFrame {

    /**
     * Creates new form Registration
     */
    public Registration() {
        initComponents();
        //this.addWindowListener(new WindowListener());
        jButton1.addActionListener(new Handler());
        //jButton2.addActionListener(new Handler2());
        jButton3.addActionListener(new Handler2());
        setLocationRelativeTo(null);
    }
    /**
     * Registration Constructor for the editing form
     * @param ssn
     * @param firstName
     * @param lastName
     * @param address
     * @param med
     * @param dob
     * @param zip
     * @param gender
     * @param next 
     */
    public Registration(String ssn,String firstName,String lastName,String address,String med,String dob,String zip,String gender,String next) {
        initComponents();
        ssnTF.setText(ssn);
        firstNameTF.setText(firstName);
        lastNameTF.setText(lastName);
        addressTF.setText(address);
        insuranceTF.setText(med);
        dobTF.setText(dob);
        zipTF.setText(zip);
        genderTF.setText(gender);
        followUpTF.setText(next);
        ssnTF.setEditable(false);
        //this.addWindowListener(new WindowListener());
        jButton1.addActionListener(new Handler());
        //jButton2.addActionListener(new Handler2());
        jButton3.addActionListener(new Handler2());
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ssnTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        firstNameTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lastNameTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        addressTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dobTF = new javax.swing.JTextField();
        genderTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        insuranceTF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        followUpTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        zipTF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jLabel1.setText("Registration");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("SSN: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("First Name: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Last Name: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Address: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("DOB: ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("Gender: ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("Insurance: ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("Follow-up: ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText("ZIP: ");

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Close");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addressTF, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton3))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(dobTF, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zipTF, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(firstNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(insuranceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(followUpTF, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ssnTF, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(genderTF, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ssnTF)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderTF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(firstNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(insuranceTF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lastNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(followUpTF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addressTF, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipTF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dobTF, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addGap(35, 35, 35))
        );

        jMenu2.setMnemonic('F');
        jMenu2.setText("File");

        jMenuItem2.setMnemonic('L');
        jMenuItem2.setText("Logout");
        jMenuItem2.setToolTipText("Logout");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setMnemonic('x');
        jMenuItem3.setText("Exit");
        jMenuItem3.setToolTipText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar2.add(jMenu2);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        // Opens the login screen
        new Login();

        // Disposes this screen
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        // Exits the program
        System.exit(0);

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
/**
 * Action Listener for the save button
 * Checks the entered fields format, checks if it is a unique patient and enters the new patient into the database.
 */
        public class Handler implements ActionListener {
            
            
        public void actionPerformed(ActionEvent e){
            String error="";
            /*
            Checks the text fields for format
            */
            if(ssnTF.getText().isEmpty()){
                error +="- SSN\n";
            }
            if(!ssnTF.getText().isEmpty()&&!ssnTF.getText().matches("[0-9]{3}-[0-9]{2}-[0-9]{4}")){
                error +="- SSN XXX-XX-XXXX\n";
            }
            if(firstNameTF.getText().isEmpty()){
                error +="- First Name\n";
            }
            if(lastNameTF.getText().isEmpty()){
                error +="- Last Name\n";
            }
            if(addressTF.getText().isEmpty()){
                error +="- Address\n";
            }
            if(dobTF.getText().isEmpty()||!dobTF.getText().matches("[0-9]{4}-[0-1][0-9]-[0-3][0-9]")){
                error +="- DOB must be YYYY-MM-DD\n";
            }
            if(genderTF.getText().isEmpty()){
                error +="- Gender\n";
            }
            if(insuranceTF.getText().isEmpty()){
                error +="- Insurance Information\n";
            }
            if(!followUpTF.getText().isEmpty()&&!followUpTF.getText().matches("[0-9]{4}-[0-1][0-9]-[0-3][0-9]")){
                error +="- Follow-Up must be YYYY-MM-DD\n";
            }
            if(zipTF.getText().isEmpty()){
                error +="- ZIP Code\n";
            }
            //ZIP should be in the format XXXXX or XXXXX-XXXX
            if(!zipTF.getText().isEmpty()&&(!zipTF.getText().matches("[0-9]{5}")&&!zipTF.getText().matches("[0-9]{5}-[0-9]{4}"))){
                error +="- ZIP Code (Check format)\n";
            } 
            
            /*
            If no error calls are made then it add the fields to the database or updates if there is a matching ssn already in the database.
            */
            if(error.isEmpty()){
                try {
                     // Creates a connection to the database
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/honorsmedicaldoctor", "HonorsAdmin", "h0n3r5a2m1n");
                    Statement stmt = con.createStatement();
                    String sql="SELECT SSN FROM patients where SSN = '"+ssnTF.getText()+"'";
                    ResultSet rs = stmt.executeQuery(sql);
                    int i=0;
                    if(rs.next()){
                        i++;
                    }
                    if(i!=0){
                        // if there is a conflict of ssn then the program will try to update instead of adding a new one.
                        // Confirmation from the user if they want to update.
                        // then close the page and opens a new search window
                      int yn =  JOptionPane.showConfirmDialog(null, "A person with this SSN already exist would you like to update their information?","Update", JOptionPane.YES_NO_CANCEL_OPTION);
                      if(yn==JOptionPane.YES_OPTION){
                          if(followUpTF.getText().isEmpty()){
                              stmt.executeUpdate("UPDATE patients SET FirstName = '"+firstNameTF.getText()+"', LastName ='"+lastNameTF.getText()+"', address ='"+addressTF.getText()+"', MedicalInsurance = '"
                                  +insuranceTF.getText()+"', DOB = '"+dobTF.getText()+"', ZIP = '"+zipTF.getText()+"', Gender = '"+genderTF.getText()
                                  +"' WHERE SSN = '"+ssnTF.getText()+"'");
                          }else
                          stmt.executeUpdate("UPDATE patients SET FirstName = '"+firstNameTF.getText()+"', LastName ='"+lastNameTF.getText()+"', address ='"+addressTF.getText()+"', MedicalInsurance = '"
                                  +insuranceTF.getText()+"', DOB = '"+dobTF.getText()+"', ZIP = '"+zipTF.getText()+"', Gender = '"+genderTF.getText()
                                  +"', NextVisit = '"+followUpTF.getText()+"' WHERE SSN ='"+ssnTF.getText()+"'");
                          JOptionPane.showMessageDialog(null,"Patient Updated");
                        }
                      else if(yn==JOptionPane.CANCEL_OPTION){
                          dispose();
                          new RegistrationSearch();
                      }
                    }
                    // if there is no conflict the patient is added to the database. then closes the page and opens a new search window.
                    else{
                        if(followUpTF.getText().isEmpty()){
                            stmt.executeUpdate("INSERT INTO patients(SSN,FirstName,LastName,Address,MedicalInsurance,DOB,ZIP,Gender) VALUES('"+ssnTF.getText()+"','"+firstNameTF.getText()+"','"+lastNameTF.getText()+"','"+addressTF.getText()+"','"
                                 +insuranceTF.getText()+"','"+dobTF.getText()+"','"+zipTF.getText()+"','"+genderTF.getText()+"')");
                        }else
                         stmt.executeUpdate("INSERT INTO patients VALUES('"+ssnTF.getText()+"','"+firstNameTF.getText()+"','"+lastNameTF.getText()+"','"+addressTF.getText()+"','"
                                 +insuranceTF.getText()+"','"+dobTF.getText()+"','"+zipTF.getText()+"','"+genderTF.getText()+"','"+followUpTF.getText()+"')");
                    JOptionPane.showMessageDialog(null,"Patient Created");
                    dispose();
                    new RegistrationSearch();
                    }
                    rs.close();
                    stmt.close();
                    con.close();
            
                }
                catch(ClassNotFoundException ex){
                    ex.printStackTrace();
                }
                catch(SQLException ex){
                    ex.printStackTrace();
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Please enter these missing fields: \n"+error,"Missing Fields",JOptionPane.WARNING_MESSAGE);
            }
                                
        }
    }
        
        /*
        ActionListener for cancel and close buttons
        
        */
    public class Handler2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
            new RegistrationSearch();
        }
   }
    /*public class WindowListener extends WindowAdapter {
        public void windowClosing(WindowEvent e){
            new RegistrationSearch();
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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTF;
    private javax.swing.JTextField dobTF;
    private javax.swing.JTextField firstNameTF;
    private javax.swing.JTextField followUpTF;
    private javax.swing.JTextField genderTF;
    private javax.swing.JTextField insuranceTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastNameTF;
    private javax.swing.JTextField ssnTF;
    private javax.swing.JTextField zipTF;
    // End of variables declaration//GEN-END:variables
}