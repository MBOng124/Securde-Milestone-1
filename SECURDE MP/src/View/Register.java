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

    //THESE VARIABLES ARE FOR HIGHLIGHTING INDICES OF PASSWORD
    	private int highlightStart;
    	private int highlightEnd;

    
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
                jTextField2MouseReleased(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
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
                jTextFieldMouseReleased(evt);
            }
        });
        confpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt2) {
                jTextFieldKeyReleased(evt2);
            }
            public void keyTyped(java.awt.event.KeyEvent evt2) {
                jTextFieldKeyTyped(evt2);
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
        String pass = frame.main.getPassword();
        String confirm = frame.main.getConfrim();
        Boolean nullTextField;
        
        nullTextField = IsNull(user, pass, confirm);

        if (nullTextField == true) {
            JOptionPane.showMessageDialog(frame, "All fields should not be left blank");
        } //                "[!@#$%^&*(),.?\"\':{}|<> ]";
        else if (frame.main.checkIfUserExists(user)) {
            if (VerifyPassword(pass, confirm)) {
                if(pass.length() > 7){
                    temp = pass;
                    temp.replaceAll(userPassChecker, "");
                    if(!(temp.length() < pass.length() - 2)){
                        Pattern p = Pattern.compile("[A-Z]");
                        Pattern p2 = Pattern.compile("[a-z]");
                        Matcher m = p.matcher(pass);
                        Matcher m2 = p2.matcher(pass);
                        if(m.find() && m2.find()){
                            Pattern p3 = Pattern.compile("[!@#$%^&*(),.?\"\':{}|<> ]");
                            Matcher m3 = p3.matcher(pass);
                            if(m3.find()){
                                pass = frame.main.hashString(pass);
                                frame.registerAction(user, pass, confirm);
                                frame.loginNav();
                                String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
                                String log ="New user registered at time " +timeStamp +" with username "+ username.getText().toString();
                                frame.main.sqlite.addLog(log);
                            }
                            else{
                                JOptionPane.showMessageDialog(frame, "Password Should Have At least 1 Special Character... Spaces are not allowed");
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(frame, "Password Should At least have 1 Capital and small Letter");
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(frame, "Password Should Not Contain more than 3 Characters From Your Username");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(frame, "Password Should Be More than 8 Characters!");
                }
            }
            else{
                JOptionPane.showMessageDialog(frame, "Please Make Sure Your Passwords matches");
            }
        } else {
            JOptionPane.showMessageDialog(frame, "Username Already Exists");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        frame.loginNav();
    }//GEN-LAST:event_jButton2ActionPerformed


    
    /*
     * THIS FUNCTION IS FOR CONVERTING THE TEXT IN THE TEXTFIELD INTO A SET OF *
     */
    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped

        int temp = 0; // used for caret positioning
        if (evt.getKeyChar() == Event.BACK_SPACE) {
            frame.main.backSpace(this.getHighlightStart(), this.getHighlightEnd(), password.getCaretPosition());
        }
        else if ((getHighlightStart() != getHighlightEnd()) && (((Character)evt.getKeyChar()).toString().matches("[!@#$%^&*(),.?\"\':{}|<> ]") 
                || Character.isLetterOrDigit(evt.getKeyChar()))) {
            evt.consume();
            frame.main.backSpace(this.getHighlightStart(), this.getHighlightEnd(), password.getCaretPosition());
            frame.main.savePassword(evt.getKeyChar(), password.getCaretPosition());
            temp = this.getHighlightStart();
            password.setText(frame.main.convertPassword());
            password.setCaretPosition(temp + 1);
            
        }
        else if (((Character)evt.getKeyChar()).toString().matches("[!@#$%^&*(),.?\"\':{}|<> ]") 
                || Character.isLetterOrDigit(evt.getKeyChar())) {
            evt.consume();
            frame.main.savePassword(evt.getKeyChar(), password.getCaretPosition());
            temp = password.getCaretPosition();
            password.setText(frame.main.convertPassword());
            password.setCaretPosition(temp + 1);
        }
        else{
            evt.consume();
        }
        frame.main.setUsername(password.getText().toString());
        this.setHighlightStart(password.getSelectionStart());
        this.setHighlightEnd(password.getSelectionEnd());

    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldKeyTyped
        int temp = 0; // used for caret positioning

        if (evt.getKeyChar() == Event.BACK_SPACE) {
            frame.main.backSpaceConfirm(this.getHighlightStart(), this.getHighlightEnd(), confpass.getCaretPosition());
        }
        else if ((getHighlightStart() != getHighlightEnd()) && (((Character)evt.getKeyChar()).toString().matches("[!@#$%^&*(),.?\"\':{}|<> ]")
                || Character.isLetterOrDigit(evt.getKeyChar()))) {
            evt.consume();
            frame.main.backSpaceConfirm(this.getHighlightStart(), this.getHighlightEnd(), confpass.getCaretPosition());
            frame.main.saveConfirm(evt.getKeyChar(), confpass.getCaretPosition());
            temp = this.getHighlightStart();
            confpass.setText(frame.main.convertConfirmPassword());
            confpass.setCaretPosition(temp+1);

        }
        else if (((Character)evt.getKeyChar()).toString().matches("[!@#$%^&*(),.?\"\':{}|<> ]")
                || Character.isLetterOrDigit(evt.getKeyChar())) {
            evt.consume();
            frame.main.saveConfirm(evt.getKeyChar(), confpass.getCaretPosition());
            temp = confpass.getCaretPosition();
            confpass.setText(frame.main.convertConfirmPassword());
            System.out.println(temp);
            confpass.setCaretPosition(temp+1);
        }
        else{
            evt.consume();
        }
        frame.main.setUsername(confpass.getText().toString());
        this.setHighlightStart(confpass.getSelectionStart());
        this.setHighlightEnd(confpass.getSelectionEnd());
    }//GEN-LAST:event_jTextFieldKeyTyped

    private void jTextField2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseReleased
        this.setHighlightStart(password.getSelectionStart());
        this.setHighlightEnd(password.getSelectionEnd());
    }//GEN-LAST:event_jTextField2MouseReleased

    private void jTextFieldMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseReleased
        this.setHighlightStart(confpass.getSelectionStart());
        this.setHighlightEnd(confpass.getSelectionEnd());
    }//GEN-LAST:event_jTextField2MouseReleased

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
//        if(jTextField2.getSelectionStart() == 0 ){
//            
//        }
        this.setHighlightStart(password.getSelectionStart());
        this.setHighlightEnd(password.getSelectionEnd());
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
//        if(jTextField2.getSelectionStart() == 0 ){
//
//        }
        this.setHighlightStart(confpass.getSelectionStart());
        this.setHighlightEnd(confpass.getSelectionEnd());
    }//GEN-LAST:event_jTextFieldKeyReleased
    
    /**
     * @return the highlightStart
     */
    public int getHighlightStart() {
        return highlightStart;
    }

    /**
     * @param highlightStart the highlightStart to set
     */
    public void setHighlightStart(int highlightStart) {
        this.highlightStart = highlightStart;
    }

    /**
     * @return the highlightEnd
     */
    public int getHighlightEnd() {
        return highlightEnd;
    }

    /**
     * @param highlightEnd the highlightEnd to set
     */
    public void setHighlightEnd(int highlightEnd) {
        this.highlightEnd = highlightEnd;
    }
    
    
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

}
