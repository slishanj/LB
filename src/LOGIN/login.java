package LOGIN;

import Connection.jdbc;
import jBCrypt.BCrypt;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import london.newHome;

/**
 *
 * @author joshua
 *
 */
public final class login extends javax.swing.JFrame {

    newHome H = null;
    jdbc cdb = new jdbc();
    //<editor-fold defaultstate="collapsed" desc="staticint 'loginTries' to count">
    static int loginTries = 1;
    //</editor-fold>
    private String userAgent = null;

    public login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t_user = new javax.swing.JTextField();
        t_pass = new javax.swing.JPasswordField();
        l_exit = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        l_ch_password = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login to London Bridge");
        setAlwaysOnTop(true);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(76, 76, 76));
        jLabel1.setText("UserName");
        jLabel1.setBounds(30, 150, 110, 16);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(76, 76, 76));
        jLabel2.setText("Password");
        jLabel2.setBounds(30, 190, 110, 16);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        t_user.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        t_user.setForeground(java.awt.Color.darkGray);
        t_user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_user.setOpaque(false);
        t_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_userKeyPressed(evt);
            }
        });
        t_user.setBounds(170, 150, 180, 30);
        jLayeredPane1.add(t_user, javax.swing.JLayeredPane.DEFAULT_LAYER);

        t_pass.setForeground(java.awt.Color.gray);
        t_pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_pass.setToolTipText("press enter to login");
        t_pass.setOpaque(false);
        t_pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_passKeyPressed(evt);
            }
        });
        t_pass.setBounds(170, 190, 180, 30);
        jLayeredPane1.add(t_pass, javax.swing.JLayeredPane.DEFAULT_LAYER);

        l_exit.setText("x");
        l_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l_exitMouseClicked(evt);
            }
        });
        l_exit.setBounds(350, 10, 10, 14);
        jLayeredPane1.add(l_exit, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setFont(new java.awt.Font("Miriam Fixed", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("forgot password ?");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jLabel5.setBounds(210, 223, 160, 11);
        jLayeredPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        l_ch_password.setFont(new java.awt.Font("Miriam Fixed", 0, 10)); // NOI18N
        l_ch_password.setForeground(new java.awt.Color(255, 0, 0));
        l_ch_password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_ch_password.setText("Change Password ?");
        l_ch_password.setToolTipText("click to change your current password");
        l_ch_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l_ch_passwordMouseClicked(evt);
            }
        });
        l_ch_password.setBounds(10, 220, 150, 11);
        jLayeredPane1.add(l_ch_password, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setName(""); // NOI18N
        jLabel3.setBounds(10, 30, 90, 0);
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/LB2.png")));
        jLabel4.setEnabled(false);
        jLabel4.setBounds(-490, 0, 910, 550);
        jLayeredPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(370, 241));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void l_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_l_exitMouseClicked

    private void t_passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_passKeyPressed
        runByEnter(evt);
    }//GEN-LAST:event_t_passKeyPressed

    private void t_userKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_userKeyPressed
        if (evt.getKeyCode() == 10) {
            t_pass.grabFocus();
        }
    }//GEN-LAST:event_t_userKeyPressed

    private void l_ch_passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_ch_passwordMouseClicked
        newUser();
    }//GEN-LAST:event_l_ch_passwordMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        JOptionPane.showMessageDialog(null, "<html><p align=right><b><font color=red>Please contact Administrator/Owner of the institute</b></font>&nbsp;&nbsp;"
                + " <br>to get help with your situation"
                + " <br><b>or Contact Systems Administrator</b></p></html>.", "Help", JOptionPane.OK_CANCEL_OPTION);
    }//GEN-LAST:event_jLabel5MouseClicked

    /**
     * Password Changer.
     * A method still under development to enhance the user
     * experience to change passwords
     *
     * @since Ver_1.0
     * @deprecated some error in empty password fields
     */
    private void newUser() {
        //---BUGGED METHOD :: if the first pass field is empty for first time, it redisplays,
        //    but if its empty for 2nd time, nothing happens
        try {
            JPasswordField pwd = new JPasswordField(20);
            JPasswordField pwd2 = new JPasswordField(20);

//ResultSet checkpass = cdb.getdata("SELECT password from users WHERE username='" + t_user.getText() + "'");
//----------checking below, whether given Uname and pass is correct to proceed with changing, if not ERROR
//if (!new String(t_pass.getPassword()).equals(checkpass.toString())) {
//JOptionPane.showMessageDialog(null, "username or password is incorrect. \n please check before proceeding", "Error", JOptionPane.OK_OPTION);
//System.exit(0);
//
//} else if (new String(t_pass.getPassword()).equals(checkpass.toString())) {//------bugged....always shows an error

            setState(ICONIFIED);//----minimize login window
            if (t_user.getText().equals("") | new String(t_pass.getPassword()).equals("")) {
                //---------setting error if no username/password is provided
                JOptionPane.showMessageDialog(null, "Enter both of your current username AND password ",
                        "Error", JOptionPane.OK_OPTION);
                dispose();
                new login().setVisible(true);
            } else {
                //----------start new password process :)
                setState(ICONIFIED);//----minimize login window
                setLocation(100, 100);
                int getpwd0 = JOptionPane.showConfirmDialog(null, pwd, "Enter New Password for user: " + t_user.getText(), JOptionPane.OK_CANCEL_OPTION);
                if (getpwd0 == JOptionPane.CANCEL_OPTION) {
                    //----press cancel and exit
                    System.exit(0);
                }
                // gave first password field to enter
                if (new String(pwd.getPassword()).equals("")) {
                    //--------if first password field is empty, giving an error message
                    JOptionPane.showMessageDialog(null, "Empty password : \nyou cannot set an Empty password",
                            "Error", 2);
                    setState(NORMAL);
                    t_user.setText(null);
                    // if empty, gave an error message
                } else if (!new String(pwd.getPassword()).equals("")) {
                    int getpwd2 = JOptionPane.showConfirmDialog(null, pwd2, "Confirm Password",
                            JOptionPane.OK_CANCEL_OPTION);
                    if (getpwd2 == JOptionPane.CANCEL_OPTION) {
                        //----press cancel and exit
                        System.exit(0);
                    }
                    /*
                     * if first password field is not empty,
                     * gave 2nd password field
                     */
                    if (new String(pwd2.getPassword()).equals("")) {
                        JOptionPane.showMessageDialog(null, "Empty password : \nyou cannot set an Empty password",
                                "Error", 2);
                        int getpwd3 = JOptionPane.showConfirmDialog(null, pwd2, "Confirm Password",
                                JOptionPane.OK_CANCEL_OPTION);
                        if (getpwd3 == JOptionPane.CANCEL_OPTION) {
                            System.exit(0);
                        }
                        /*
                         * if 2nd field is empty, gave the error message
                         */
                    } else //--------------------------------------------------------------------------------------//
                    //if both are filled, checking passwords' compatibility
                    //if (new String(pwd.getPassword()) == new String(pwd2.getPassword())) {
                    //--------------above 'if' replaced by following null check ternary .equals()
                    //if (new String(pwd.getPassword()) == null ? new String(pwd2.getPassword()) == null : new String(pwd.getPassword()).equals(new String(pwd2.getPassword()))) {
                    // update 2013_06_19@5.25pm - null check removed coz expression is never null
                    if (new String(pwd.getPassword()).equals(new String(pwd2.getPassword()))) {
                        // if matched, updating database
                        cdb.putdata("UPDATE users SET  password='" + new String(pwd2.getPassword()) + "' "
                                + "WHERE username='" + t_user.getText() + "'");
                        JOptionPane.showMessageDialog(null, "Password updated successfully.\n Please login to Continue");
                        System.exit(0);
                    } else {
                        JOptionPane.showMessageDialog(null, "Passwords Do not Match\n Please try again");
                    }
                }
            }
            // }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(new NimbusLookAndFeel());
                    new login().setVisible(true);
                } catch (Exception e) {
                    System.out.println(e);
                    System.out.println("at login face");
                }
            }
        });
    }
    //----------------------------------------------------------------------------------------------------//

    /**
     * does necessary login procedure. since no Visual Buttons are available in form,
     * the key code of Enter button is taken into consideration and the
     * procedure is followed
     *
     * @param evt the key code of the keyStroke in password field
     */
    private void runByEnter(java.awt.event.KeyEvent evt) {
        ResultSet r = null;
        if (evt.getKeyCode() == 10) {
            //------------when enter is pressed, if admin admin is given,go home..
//else get the strings and display a message,..if the error count goes more than 5--system-exit blah
            try {
                r = cdb.getdata("SELECT * from users WHERE username='" + t_user.getText() + "' ");
                if (r.first()) {
                    // if (r.getString("password").equals(new String(t_pass.getPassword()))) {
                    //-------NEW*update on 2013-02-09@11.08PM below
                    //------- checking pass with crypted pass
                    if (BCrypt.checkpw(new String(t_pass.getPassword()), r.getString("password"))) {
                        //------------------old written procedure continues...........
                        if (r.getString("username").equals("admin")) {
                            H = new newHome();
                            this.dispose();
                            H.titleFromLogin(r.getString("username"));
                            H.setVisible(true);
                            H.admin();
                            setUserAgent("ADMIN");

                        } else {
                            H = new newHome();
                            this.dispose();
                            H.titleFromLogin(r.getString("username"));
                            H.setVisible(true);
                            setUserAgent(r.getString("username"));

                        }
                        cdb.putdata("insert into login_sessions(users_uid,users_username,status) "
                                + " values('" + r.getInt("uid") + "','" + r.getString("username") + "','Success') ");
                        //--------login session opened and recorded
                    } else {

                        //-------------takes the strings and display and say buwaaahhhaaha, u r not allowd in :D
                        JOptionPane.showMessageDialog(null, "<html><font color=red><b>"
                                + "Incorrect login attempt(s) detected</html></font></b>", "Warning !", 1, null);
                        t_pass.setText(null);
                        t_user.setText(null);
                        loginTries++;
                        cdb.putdata("insert into login_sessions(users_uid,users_username,status) "
                                + " values('" + r.getInt("uid") + "','" + r.getString("username") + "','Error_Try') ");
                        //--------login session opened and recorded
                        if (loginTries == 6) {   //--------- int loginTries is (global) (instance) static
                            System.exit(0);
                            JOptionPane.showMessageDialog(null, "You have not proven to be a valid user!"
                                    + " \n The System will restart now");
                            Runtime sys = Runtime.getRuntime();
                            sys.exec("shutdown -r -f -t 00");
                            //sys.exec("$RESTART$");
                        }
                    }
                }
            } catch (Exception ex) {
                System.out.println(ex);
            } finally {
                try {
                    if (r != null) {
                        r.close();
                    }
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel l_ch_password;
    private javax.swing.JLabel l_exit;
    private javax.swing.JPasswordField t_pass;
    private javax.swing.JTextField t_user;
    // End of variables declaration//GEN-END:variables

    /**
     * @param userAgent the user acting now in system
     */
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    /**
     * the user accessing the system at this moment
     *
     * @return the userAgent
     */
    public String getUserAgent() {
        // method is used in 'in_compensation' class in setting the user performing the action
        return userAgent;
    }
}
