package View;

import java.awt.Event;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JPanel {
    public Frame frame;

    public Register() {
        initComponents();
    }

    private int hStartOfPass;
    private int hEndOfPass;

    private int hStartOfConfPass;
    private int hEndOfConfPass;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        password = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        confpass = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("REGISTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        password.setBackground(new java.awt.Color(240, 240, 240));
        password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                passwordMouseReleased(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordKeyTyped(evt);
            }
        });

        username.setBackground(new java.awt.Color(240, 240, 240));
        username.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "USERNAME", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SECURITY Svcs");
        jLabel1.setToolTipText("");

        confpass.setBackground(new java.awt.Color(240, 240, 240));
        confpass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        confpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        confpass.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "CONFIRM PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        confpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                confpassMouseReleased(evt);
            }
        });
        confpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                confpassKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                confpassKeyTyped(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("<Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(200, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(username)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(password, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(confpass, javax.swing.GroupLayout.Alignment.LEADING))
                                .addContainerGap(200, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton2)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(confpass, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String user = username.getText();
        String userPassChecker = "[";
        userPassChecker += user + "]";
        String temp = "";
        String pass = frame.main.getRegisterPassword();
        String confirm = frame.main.getConfPassword();
        Boolean nullTextField;

        nullTextField = IsNull(user, pass, confirm);

        if (nullTextField == true) {
            JOptionPane.showMessageDialog(frame, "All fields should not be left blank");
        } //                "[!@#$%^&*(),.?\"\':{}|<> ]";
        else if (frame.main.checkIfUserExists(user)) {
            if (VerifyPassword(pass, confirm)) {
                if (pass.length() > 7) {
                    temp = pass;
                    temp.replaceAll(userPassChecker, "");
                    if (!(temp.length() < pass.length() - 2)) {
                        Pattern p = Pattern.compile("[A-Z]");
                        Pattern p2 = Pattern.compile("[a-z]");
                        Matcher m = p.matcher(pass);
                        Matcher m2 = p2.matcher(pass);
                        if (m.find() && m2.find()) {
                            Pattern p3 = Pattern.compile("[!@#$%^&*(),.?\"\':{}|<> ]");
                            Matcher m3 = p3.matcher(pass);
                            if (m3.find()) {
                                pass = frame.main.hashString(pass);
                                frame.registerAction(user, pass, confirm);
                                frame.loginNav();
                                String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
                                String log ="New user registered at time " +timeStamp +" with username "+ username.getText().toString();
                                frame.main.sqlite.addLog(log);
                            } else {
                                JOptionPane.showMessageDialog(frame, "Password Should Have At least 1 Special Character... Spaces are not allowed");
                            }
                        } else {
                            JOptionPane.showMessageDialog(frame, "Password Should At least have 1 Capital and small Letter");
                        }
                    } else {
                        JOptionPane.showMessageDialog(frame, "Password Should Not Contain more than 3 Characters From Your Username");
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Password Should Be More than 8 Characters!");
                }
            } else {
                JOptionPane.showMessageDialog(frame, "Please Make Sure Your Passwords matches");
            }
        } else {
            JOptionPane.showMessageDialog(frame, "Username Already Exists");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        frame.loginNav();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyReleased
        this.sethStartOfPass(password.getSelectionStart());
        this.sethEndOfPass(password.getSelectionEnd());
    }//GEN-LAST:event_passwordKeyReleased

    private void passwordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyTyped
        int temp = 0; // used for caret positioning
        if (evt.getKeyChar() == Event.BACK_SPACE) {
            frame.main.backSpaceRegisterPass(this.gethStartOfPass(), this.gethEndOfPass(), password.getCaretPosition());
        }
        else if ((gethStartOfPass() != gethEndOfPass()) && (((Character)evt.getKeyChar()).toString().matches("[!@#$%^&*(),.?\"\':{}|<> ]")
                || Character.isLetterOrDigit(evt.getKeyChar()))) {
            evt.consume();
            frame.main.backSpaceRegisterPass(this.gethStartOfPass(), this.gethEndOfPass(), password.getCaretPosition());
            frame.main.saveRegisterPassword(evt.getKeyChar(), password.getCaretPosition());
            temp = this.gethStartOfPass();
            password.setText(frame.main.convertRegisterPassword());
            password.setCaretPosition(temp + 1);

        }
        else if (((Character)evt.getKeyChar()).toString().matches("[!@#$%^&*(),.?\"\':{}|<> ]")
                || Character.isLetterOrDigit(evt.getKeyChar())) {
            evt.consume();
            frame.main.saveRegisterPassword(evt.getKeyChar(), password.getCaretPosition());
            temp = password.getCaretPosition();
            password.setText(frame.main.convertRegisterPassword());
            password.setCaretPosition(temp + 1);
        }
        else{
            evt.consume();
        }
//        frame.main.setUsername(username.getText().toString());
        this.sethStartOfPass(password.getSelectionStart());
        this.sethEndOfPass(password.getSelectionEnd());
    }//GEN-LAST:event_passwordKeyTyped

    private void passwordMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseReleased
        this.sethStartOfPass(password.getSelectionStart());
        this.sethEndOfPass(password.getSelectionEnd());
//        System.out.println(gethStartOfPass());
//        System.out.println(gethEndOfPass());
    }//GEN-LAST:event_passwordMouseReleased

    private void confpassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confpassKeyReleased
        this.sethStartOfConfPass(confpass.getSelectionStart());
        this.sethEndOfConfPass(confpass.getSelectionEnd());
    }//GEN-LAST:event_confpassKeyReleased

    private void confpassMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confpassMouseReleased
        this.sethStartOfConfPass(confpass.getSelectionStart());
        this.sethEndOfConfPass(confpass.getSelectionEnd());
    }//GEN-LAST:event_confpassMouseReleased

    private void confpassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confpassKeyTyped
        int temp = 0; // used for caret positioning
        if (evt.getKeyChar() == Event.BACK_SPACE) {
            frame.main.backSpaceConfPass(this.gethStartOfConfPass(), this.gethEndOfConfPass(), confpass.getCaretPosition());
        }
        else if ((gethStartOfConfPass() != gethEndOfConfPass()) && (((Character)evt.getKeyChar()).toString().matches("[!@#$%^&*(),.?\"\':{}|<> ]")
                || Character.isLetterOrDigit(evt.getKeyChar()))) {
            evt.consume();
            frame.main.backSpaceConfPass(this.gethStartOfConfPass(), this.gethEndOfConfPass(), confpass.getCaretPosition());
            frame.main.saveConfPassword(evt.getKeyChar(), confpass.getCaretPosition());
            temp = this.gethStartOfConfPass();
            confpass.setText(frame.main.convertConfPassword());
            confpass.setCaretPosition(temp + 1);
        }
        else if (((Character)evt.getKeyChar()).toString().matches("[!@#$%^&*(),.?\"\':{}|<> ]")
                || Character.isLetterOrDigit(evt.getKeyChar())) {
            evt.consume();
            frame.main.saveConfPassword(evt.getKeyChar(), confpass.getCaretPosition());
            temp = confpass.getCaretPosition();
            confpass.setText(frame.main.convertConfPassword());
            confpass.setCaretPosition(temp + 1);
        }
        else{
            evt.consume();
        }
//        frame.main.setUsername(username.getText().toString());
        this.sethStartOfConfPass(confpass.getSelectionStart());
        this.sethEndOfConfPass(confpass.getSelectionEnd());
    }//GEN-LAST:event_confpassKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField confpass;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
    public boolean IsNull(String user, String pass, String conf) {
        if (user.equals("")) {
            return true;
        }

        if (pass.equals("")) {
            return true;
        }

        if (conf.equals("")) {
            return true;
        }

        return false;
    }

    public boolean VerifyPassword(String password, String confirm) {
        if (password.equals(confirm)) {
            return true;
        } else {
            return false;
        }
    }

    public void clearFields() {
        username.setText("");
        password.setText("");
        confpass.setText("");
    }

    /**
     * @return the hStartOfPass
     */
    public int gethStartOfPass() {
        return hStartOfPass;
    }

    /**
     * @param hStartOfPass the hStartOfPass to set
     */
    public void sethStartOfPass(int hStartOfPass) {
        this.hStartOfPass = hStartOfPass;
    }

    /**
     * @return the hEndOfPass
     */
    public int gethEndOfPass() {
        return hEndOfPass;
    }

    /**
     * @param hEndOfPass the hEndOfPass to set
     */
    public void sethEndOfPass(int hEndOfPass) {
        this.hEndOfPass = hEndOfPass;
    }

    /**
     * @return the hStartOfConfPass
     */
    public int gethStartOfConfPass() {
        return hStartOfConfPass;
    }

    /**
     * @param hStartOfConfPass the hStartOfConfPass to set
     */
    public void sethStartOfConfPass(int hStartOfConfPass) {
        this.hStartOfConfPass = hStartOfConfPass;
    }

    /**
     * @return the hEndOfConfPass
     */
    public int gethEndOfConfPass() {
        return hEndOfConfPass;
    }

    /**
     * @param hEndOfConfPass the hEndOfConfPass to set
     */
    public void sethEndOfConfPass(int hEndOfConfPass) {
        this.hEndOfConfPass = hEndOfConfPass;
    }
}

