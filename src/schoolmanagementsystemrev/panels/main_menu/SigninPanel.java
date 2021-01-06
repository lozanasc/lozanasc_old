/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagementsystemrev.panels.main_menu;

import schoolmanagementsystemrev.backend.JDBController;
import schoolmanagementsystemrev.panels.dashboard_contents.DashboardPanel;


public class SigninPanel extends javax.swing.JPanel {
    /**
     * Creates new form SigninPanel
     */
    
    public SigninPanel() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        signinPanel = new javax.swing.JPanel();
        signinLabel = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        teacherBtn = new javax.swing.JToggleButton();
        studentBtn = new javax.swing.JToggleButton();
        parentBtn = new javax.swing.JToggleButton();
        signinBtn = new javax.swing.JButton();
        passIcon = new javax.swing.JLabel();
        userIcon = new javax.swing.JLabel();
        mode = new javax.swing.JLabel();
        signUpPanel = new javax.swing.JPanel();
        topLabel = new javax.swing.JLabel();
        calltoAction_btn = new javax.swing.JButton();
        bottomLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(500, 677));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        signinPanel.setBackground(new java.awt.Color(153, 153, 255));
        signinPanel.setMinimumSize(new java.awt.Dimension(500, 677));
        signinPanel.setPreferredSize(new java.awt.Dimension(500, 677));
        signinPanel.setLayout(new java.awt.GridBagLayout());

        signinLabel.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        signinLabel.setForeground(new java.awt.Color(255, 255, 255));
        signinLabel.setText("SIGN IN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 22, 0);
        signinPanel.add(signinLabel, gridBagConstraints);

        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username.setPreferredSize(new java.awt.Dimension(200, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(9, 9, 9, 9);
        signinPanel.add(username, gridBagConstraints);

        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setPreferredSize(new java.awt.Dimension(200, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(9, 9, 0, 9);
        signinPanel.add(password, gridBagConstraints);

        teacherBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagementsystemrev/resources/icons/teacherCh_btn.png"))); // NOI18N
        teacherBtn.setBorderPainted(false);
        teacherBtn.setContentAreaFilled(false);
        teacherBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        teacherBtn.setPreferredSize(new java.awt.Dimension(100, 30));
        teacherBtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagementsystemrev/resources/icons/teacherCh_btn_isPressed.png"))); // NOI18N
        teacherBtn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagementsystemrev/resources/icons/teacherCh_btn_isPressed.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        signinPanel.add(teacherBtn, gridBagConstraints);

        studentBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagementsystemrev/resources/icons/studentCh_Btn.png"))); // NOI18N
        studentBtn.setBorderPainted(false);
        studentBtn.setContentAreaFilled(false);
        studentBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        studentBtn.setPreferredSize(new java.awt.Dimension(100, 30));
        studentBtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagementsystemrev/resources/icons/studentCh_btn_isPressed.png"))); // NOI18N
        studentBtn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagementsystemrev/resources/icons/studentCh_btn_isPressed.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        signinPanel.add(studentBtn, gridBagConstraints);

        parentBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagementsystemrev/resources/icons/parentCh_btn.png"))); // NOI18N
        parentBtn.setBorderPainted(false);
        parentBtn.setContentAreaFilled(false);
        parentBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        parentBtn.setPreferredSize(new java.awt.Dimension(100, 30));
        parentBtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagementsystemrev/resources/icons/parentCh_btn_isPressed.png"))); // NOI18N
        parentBtn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagementsystemrev/resources/icons/parentCh_btn_isPressed.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        signinPanel.add(parentBtn, gridBagConstraints);

        signinBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagementsystemrev/resources/icons/login_btn.png"))); // NOI18N
        signinBtn.setBorderPainted(false);
        signinBtn.setContentAreaFilled(false);
        signinBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signinBtn.setPreferredSize(new java.awt.Dimension(220, 40));
        signinBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(17, 17, 17, 17);
        signinPanel.add(signinBtn, gridBagConstraints);

        passIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagementsystemrev/resources/icons/password.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(0, 70, 9, 0);
        signinPanel.add(passIcon, gridBagConstraints);

        userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagementsystemrev/resources/icons/user.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(7, 70, 0, 0);
        signinPanel.add(userIcon, gridBagConstraints);

        mode.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        mode.setForeground(new java.awt.Color(255, 255, 255));
        mode.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mode.setPreferredSize(new java.awt.Dimension(100, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        signinPanel.add(mode, gridBagConstraints);

        add(signinPanel);

        signUpPanel.setBackground(new java.awt.Color(204, 204, 255));
        signUpPanel.setMinimumSize(new java.awt.Dimension(500, 677));
        signUpPanel.setPreferredSize(new java.awt.Dimension(500, 677));
        signUpPanel.setLayout(new java.awt.GridBagLayout());

        topLabel.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        topLabel.setForeground(new java.awt.Color(255, 255, 255));
        topLabel.setText("Hi, welcome back!");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        signUpPanel.add(topLabel, gridBagConstraints);

        calltoAction_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagementsystemrev/resources/icons/signup_btn.png"))); // NOI18N
        calltoAction_btn.setBorderPainted(false);
        calltoAction_btn.setContentAreaFilled(false);
        calltoAction_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calltoAction_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calltoAction_btnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        signUpPanel.add(calltoAction_btn, gridBagConstraints);

        bottomLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bottomLabel.setForeground(new java.awt.Color(255, 255, 255));
        bottomLabel.setText("Not a member yet?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        signUpPanel.add(bottomLabel, gridBagConstraints);

        add(signUpPanel);
    }// </editor-fold>//GEN-END:initComponents

    private void signinBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinBtnActionPerformed
         JDBController connection = new JDBController();
      /*  if(connection.toggleError(studentBtn, parentBtn, teacherBtn)){
            if(connection.AccountVerification(username.getText(), password.getText(),connection.toggleChoice(teacherBtn, studentBtn, parentBtn))){
                this.removeAll();
                this.repaint();
                this.revalidate();
                //adding
                this.add(new DashboardPanel());
                this.repaint();
                this.revalidate();
            }
            else
                System.out.print("Login is unsuccessful! \n");
        }*/
       this.removeAll();
                this.repaint();
                this.revalidate();
                //adding
                this.add(new DashboardPanel());
                this.repaint();
                this.revalidate();
    }//GEN-LAST:event_signinBtnActionPerformed

    private void calltoAction_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calltoAction_btnActionPerformed
        this.removeAll();
        this.repaint();
        this.revalidate();
        //Adding
        this.add(new SignupPanel());
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_calltoAction_btnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bottomLabel;
    private javax.swing.JButton calltoAction_btn;
    private javax.swing.JLabel mode;
    private javax.swing.JToggleButton parentBtn;
    private javax.swing.JLabel passIcon;
    private javax.swing.JPasswordField password;
    private javax.swing.JPanel signUpPanel;
    private javax.swing.JButton signinBtn;
    private javax.swing.JLabel signinLabel;
    private javax.swing.JPanel signinPanel;
    private javax.swing.JToggleButton studentBtn;
    private javax.swing.JToggleButton teacherBtn;
    private javax.swing.JLabel topLabel;
    private javax.swing.JLabel userIcon;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
