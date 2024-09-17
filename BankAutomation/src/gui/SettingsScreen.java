/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import database.IinformationController;
import database.transactions.AccountInformation;
import database.transactions.changePhone;
import gui.Settings.ActionSettings;
import gui.Settings.Dialogs;
import gui.Settings.IRegulator;
import gui.Settings.TextSettings;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class SettingsScreen extends javax.swing.JFrame implements IRegulator,IinformationController{
private changePhone cohangePhoneObject=null;
    private int counter=0;
private int counter2=0;
private String oldPhoneNumber=null;
private final String pass="******";
    /**
     * Creates new form SettingsScreen
     */
    public SettingsScreen() {
        initComponents();
        getedits();
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
        SettingsScreenPanel = new javax.swing.JPanel();
        lblNameSurname3 = new javax.swing.JLabel();
        btnOk = new javax.swing.JLabel();
        lblNameSurname4 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        lblNameSurname5 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        panelPhone = new javax.swing.JPanel();
        btnchangePhone = new javax.swing.JButton();
        panelPassword = new javax.swing.JPanel();
        btnChangePassword = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Settings Screen");
        setResizable(false);

        SettingsScreenPanel.setBackground(new java.awt.Color(0, 51, 51));

        lblNameSurname3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblNameSurname3.setForeground(new java.awt.Color(255, 255, 255));
        lblNameSurname3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameSurname3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/Phone.png"))); // NOI18N

        btnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/Back.png"))); // NOI18N
        btnOk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOkMouseClicked(evt);
            }
        });

        lblNameSurname4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblNameSurname4.setForeground(new java.awt.Color(255, 255, 255));
        lblNameSurname4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameSurname4.setText("SETTINGS PAGE");

        txtPhone.setEnabled(false);

        lblNameSurname5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblNameSurname5.setForeground(new java.awt.Color(255, 255, 255));
        lblNameSurname5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameSurname5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/Password.png"))); // NOI18N

        txtPassword.setEnabled(false);

        panelPhone.setBackground(new java.awt.Color(255, 0, 51));

        btnchangePhone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/Available Updates.png"))); // NOI18N
        btnchangePhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchangePhoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPhoneLayout = new javax.swing.GroupLayout(panelPhone);
        panelPhone.setLayout(panelPhoneLayout);
        panelPhoneLayout.setHorizontalGroup(
            panelPhoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPhoneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnchangePhone)
                .addContainerGap())
        );
        panelPhoneLayout.setVerticalGroup(
            panelPhoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPhoneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnchangePhone, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelPassword.setBackground(new java.awt.Color(255, 0, 51));

        btnChangePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/Available Updates.png"))); // NOI18N
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPasswordLayout = new javax.swing.GroupLayout(panelPassword);
        panelPassword.setLayout(panelPasswordLayout);
        panelPasswordLayout.setHorizontalGroup(
            panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPasswordLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnChangePassword)
                .addContainerGap())
        );
        panelPasswordLayout.setVerticalGroup(
            panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPasswordLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout SettingsScreenPanelLayout = new javax.swing.GroupLayout(SettingsScreenPanel);
        SettingsScreenPanel.setLayout(SettingsScreenPanelLayout);
        SettingsScreenPanelLayout.setHorizontalGroup(
            SettingsScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SettingsScreenPanelLayout.createSequentialGroup()
                .addGroup(SettingsScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SettingsScreenPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnOk)
                        .addGap(122, 122, 122)
                        .addComponent(lblNameSurname4))
                    .addGroup(SettingsScreenPanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(SettingsScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNameSurname5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNameSurname3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(SettingsScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(SettingsScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panelPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        SettingsScreenPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtPassword, txtPhone});

        SettingsScreenPanelLayout.setVerticalGroup(
            SettingsScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SettingsScreenPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SettingsScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnOk)
                    .addComponent(lblNameSurname4))
                .addGap(57, 57, 57)
                .addGroup(SettingsScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNameSurname3)
                    .addComponent(txtPhone)
                    .addComponent(panelPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(SettingsScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword)
                    .addComponent(lblNameSurname5))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SettingsScreenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SettingsScreenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public boolean informationIsValid() {
        return !(this.txtPhone.getText().equals(""));
        
    }

    @Override
    public AccountInformation accountInformation() {
       return AccountInformation.getInstace();
    }

    
    
    @Override
    public void getedits() {
        this.txtPassword.setText(pass);
        this.setLocationRelativeTo(null);
        SettingsScreenPanel.setFocusable(true);
        TextSettings.setOnlyNumber(txtPhone);
        TextSettings.setMaxLimit(txtPhone, 11);
        this.txtPhone.setText(accountInformation().getPhoneNumber());
        this.oldPhoneNumber=txtPhone.getText();
        
        
    }

    private void btnOkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkMouseClicked
        ActionSettings.setVisible(this, new AccountScreen());
    }//GEN-LAST:event_btnOkMouseClicked

    public changePhone getCohangePhoneObject() {
        if (this.cohangePhoneObject==null) {
            cohangePhoneObject=new changePhone();
        }
        return cohangePhoneObject;
    }

    private void btnchangePhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchangePhoneActionPerformed
        if (this.counter == 0) {
        this.counter = 1; 
    } else {
        this.counter = 0; 
        }   
    if (this.counter == 0) {            

        txtPhone.setEnabled(false); 
        panelPhone.setBackground(Color.RED); 
        this.changePhoneNumber();
        ActionSettings.setVisible(this,new SettingsScreen());
       
    } else if (this.counter == 1) {
        txtPhone.setEnabled(true); 
        panelPhone.setBackground(Color.GREEN);
       
    } 
       
    }//GEN-LAST:event_btnchangePhoneActionPerformed
    private void changePhoneNumber(){
        if (informationIsValid()) {
             String newPhoneNumber=this.txtPhone.getText().trim();
             getCohangePhoneObject().setPhoneNumber(newPhoneNumber);
             if (getCohangePhoneObject().phoneIsChanged()) {
                Dialogs.showPrivateMessage(this, "New phone number :"+newPhoneNumber);
            }else{
                 Dialogs.showPrivateMessage(this, "Operation failed\nPlease check your information.");
                 this.txtPhone.setText(this.oldPhoneNumber);
             }
             
        }else {
            Dialogs.spaceError(this);
             this.txtPhone.setText(this.oldPhoneNumber);
        }
} 
    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
           ActionSettings.setVisible(this, new ChangePasswordScreen() );
    }//GEN-LAST:event_btnChangePasswordActionPerformed

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
            java.util.logging.Logger.getLogger(SettingsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SettingsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SettingsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SettingsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SettingsScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SettingsScreenPanel;
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JLabel btnOk;
    private javax.swing.JButton btnchangePhone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNameSurname3;
    private javax.swing.JLabel lblNameSurname4;
    private javax.swing.JLabel lblNameSurname5;
    private javax.swing.JPanel panelPassword;
    private javax.swing.JPanel panelPhone;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
