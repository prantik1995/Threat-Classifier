/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * password.java
 *
 * Created on Jun 4, 2013, 9:49:56 PM
 */
package schoolshootingthreatclassifiergui;

import Encryption.Decrypt;
import Encryption.Encrypt;
import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.jdesktop.application.Action;

/**
 *
 * @author Souvik
 */
public class password extends javax.swing.JDialog {
    private static final long serialVersionUID = 1L;

    /** Creates new form password
     * @param parent
     * @param modal  
     */
    public password(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        oldPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        newPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        confirmNewPassword = new javax.swing.JPasswordField();
        change = new javax.swing.JButton();
        errorMessage = new javax.swing.JLabel();

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(schoolshootingthreatclassifiergui.SchoolShootingThreatClassifierGUIApp.class).getContext().getResourceMap(password.class);
        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        oldPassword.setText(resourceMap.getString("oldPassword.text")); // NOI18N
        oldPassword.setToolTipText(resourceMap.getString("oldPassword.toolTipText")); // NOI18N
        oldPassword.setName("oldPassword"); // NOI18N
        oldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oldPasswordActionPerformed(evt);
            }
        });

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        newPassword.setText(resourceMap.getString("newPassword.text")); // NOI18N
        newPassword.setToolTipText(resourceMap.getString("newPassword.toolTipText")); // NOI18N
        newPassword.setName("newPassword"); // NOI18N
        newPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPasswordActionPerformed(evt);
            }
        });

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        confirmNewPassword.setToolTipText(resourceMap.getString("confirmNewPassword.toolTipText")); // NOI18N
        confirmNewPassword.setName("confirmNewPassword"); // NOI18N
        confirmNewPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmNewPasswordActionPerformed(evt);
            }
        });

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(schoolshootingthreatclassifiergui.SchoolShootingThreatClassifierGUIApp.class).getContext().getActionMap(password.class, this);
        change.setAction(actionMap.get("changePassword")); // NOI18N
        change.setText(resourceMap.getString("change.text")); // NOI18N
        change.setToolTipText(resourceMap.getString("change.toolTipText")); // NOI18N
        change.setName("change"); // NOI18N

        errorMessage.setText(resourceMap.getString("errorMessage.text")); // NOI18N
        errorMessage.setName("errorMessage"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(184, Short.MAX_VALUE)
                .addComponent(change)
                .addGap(176, 176, 176))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(errorMessage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(oldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(newPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(confirmNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(confirmNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(change)
                .addGap(18, 18, 18)
                .addComponent(errorMessage)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oldPasswordActionPerformed

    private void newPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newPasswordActionPerformed

    private void confirmNewPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmNewPasswordActionPerformed
        // TODO add your handling code here:
    }

    @Action
    public void changePassword() throws IOException {
        String oldPass,NewPass,confirmNewPass;
        Encrypt e=new Encrypt();
        Decrypt d=new Decrypt();
        oldPass=String.valueOf(oldPassword.getPassword());
        NewPass=String.valueOf(newPassword.getPassword());
        confirmNewPass=String.valueOf(confirmNewPassword.getPassword());
        File f= new File("password.DAT");                      ///database to store the admin password
        FileReader fr=new FileReader(f);
        
        BufferedReader br= new BufferedReader(fr);
        String read=br.readLine();
        if(oldPass.equals(d.Decrypt(read))==false)              //if old password doesn't match with that in the database
        {
            errorMessage.setText("error: authentication failure !");
            errorMessage.setFont(new Font(Font.DIALOG,Font.PLAIN,14));
            errorMessage.setForeground(Color.RED);
            return;
        }
        else if(NewPass.equals(confirmNewPass)==false)           //if there is a password mismatch error
        {
            errorMessage.setText("error: password mismatch");
            errorMessage.setFont(new Font(Font.DIALOG,Font.PLAIN,14));
            errorMessage.setForeground(Color.RED);
            return;
        }
        else if(oldPass.isEmpty() || NewPass.isEmpty() || confirmNewPass.isEmpty())  //if any of the fields are left empty
        {
            errorMessage.setText("error: one or more fields have been left empty");
            errorMessage.setFont(new Font(Font.DIALOG,Font.PLAIN,14));
            errorMessage.setForeground(Color.RED);
            return;
        }
        else
        {
        FileWriter fw=new FileWriter(f);
        String t=e.Encrypt(confirmNewPass);
        fw.write(t); //the new password is beig written to the file
        fw.flush();
        fw.close();
        }
    }//GEN-LAST:event_confirmNewPasswordActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton change;
    private javax.swing.JPasswordField confirmNewPassword;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField newPassword;
    private javax.swing.JPasswordField oldPassword;
    // End of variables declaration//GEN-END:variables
}
