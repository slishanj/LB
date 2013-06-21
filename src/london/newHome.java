package london;

import in_frames.In_attendance;
import in_frames.In_classes_times;
import in_frames.In_payments;
import in_frames.In_stu_reg;
import in_frames.In_tea_reg;
import in_frames.in_compensation;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import london.rescumanager.RescueManager;

/**
 *
 * @author Administrator
 */
public class newHome extends javax.swing.JFrame {

//LOGIN.login login = new login();
    themes theme = new themes();
newHome nhome;
    public newHome() {
        initComponents();
        // back();
        date();
//        time();
//        welcome();
//        framefunctions();
        titleFromLogin("");
        // System.out.println(new Date().toString());
    }

    public void killall() {
        this.dispose();
        System.gc();
        new LOGIN.login().setVisible(true);
    }

    private void date() {
        String d = new Date().toString();
        String day = d.split(" ")[0];
        String y = d.split(" ")[5];
        String m = d.split(" ")[1];
        String da = d.split(" ")[2];
        String date = day + " : " + da + " : " + m + " : " + y;
        l_date.setText(date);
    }

//    final void time() {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (true) {
//                    String s = new Date().toString().split(" ")[3];
//                    String p1 = s.split(":")[0];
//                    String p2 = s.split(":")[1];
//                    String p3 = s.split(":")[2];
//                    int p = Integer.valueOf(p1);
//                    if (p > 12) {
//                        p = p - 12;
//                        p1 = String.valueOf(p);
//                        l_time.setText(p1 + ":" + p2 + ":" + p3 + "pm");
//                    } else {
//                        l_time.setText(p1 + ":" + p2 + ":" + p3 + "am");
//                    }
//                }
//            }
//        }).start();
//
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        bregister = new javax.swing.JButton();
        bteachers = new javax.swing.JButton();
        battendance = new javax.swing.JButton();
        bclasses = new javax.swing.JButton();
        bcompensation = new javax.swing.JButton();
        buserman = new javax.swing.JButton();
        blogout = new javax.swing.JButton();
        bpayments = new javax.swing.JButton();
        l_date = new javax.swing.JLabel();
        l_time = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        logoutFromMenu = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        login_menu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("London Bridge::");
        setName("mainFrame"); // NOI18N
        setResizable(false);
        

        jDesktopPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jDesktopPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jDesktopPane1.setOpaque(false);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/LB_background/lb0.png"))); // NOI18N
        jLabel3.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/LB_background/lb0.png"))); // NOI18N
        jLabel3.setEnabled(false);
        jLabel3.setBounds(0, -230, 1120, 800);
        jDesktopPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jDesktopPane1.setBounds(0, 120, 1120, 450);
        jLayeredPane1.add(jDesktopPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bregister.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        bregister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/register_icon.png"))); // NOI18N
        bregister.setText("STUDENTS Reg.");
        bregister.setBorderPainted(false);
        bregister.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bregister.setIconTextGap(-1);
        bregister.setOpaque(false);
        bregister.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bregisterActionPerformed(evt);
            }
        });
        
        bregister.setBounds(270, 30, 150, 90);
        jLayeredPane1.add(bregister, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bteachers.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        bteachers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/teacher_blackboard.png"))); // NOI18N
        bteachers.setText("TEACHERS Reg.");
        bteachers.setBorderPainted(false);
        bteachers.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bteachers.setIconTextGap(3);
        bteachers.setMaximumSize(new java.awt.Dimension(113, 30));
        bteachers.setMinimumSize(new java.awt.Dimension(113, 30));
        bteachers.setOpaque(false);
        bteachers.setPreferredSize(new java.awt.Dimension(113, 30));
        bteachers.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bteachers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteachersActionPerformed(evt);
            }
        });
        
        bteachers.setBounds(430, 30, 140, 90);
        jLayeredPane1.add(bteachers, javax.swing.JLayeredPane.DEFAULT_LAYER);

        battendance.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        battendance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/s_027.png"))); // NOI18N
        battendance.setText("ATTENDANCE");
        battendance.setBorderPainted(false);
        battendance.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        battendance.setIconTextGap(-1);
        battendance.setOpaque(false);
        battendance.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        battendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                battendanceActionPerformed(evt);
            }
        });
        
        battendance.setBounds(120, 30, 140, 90);
        jLayeredPane1.add(battendance, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bclasses.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        bclasses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/pn.png"))); // NOI18N
        bclasses.setText("CLASSES");
        bclasses.setBorderPainted(false);
        bclasses.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bclasses.setIconTextGap(6);
        bclasses.setMaximumSize(new java.awt.Dimension(113, 30));
        bclasses.setMinimumSize(new java.awt.Dimension(113, 30));
        bclasses.setOpaque(false);
        bclasses.setPreferredSize(new java.awt.Dimension(113, 30));
        bclasses.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bclasses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bclassesActionPerformed(evt);
            }
        });
        
        bclasses.setBounds(730, 30, 130, 90);
        jLayeredPane1.add(bclasses, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bcompensation.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        bcompensation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/revenue_shares_icon.png"))); // NOI18N
        bcompensation.setText("SHARES");
        bcompensation.setBorderPainted(false);
        bcompensation.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bcompensation.setMaximumSize(new java.awt.Dimension(113, 30));
        bcompensation.setMinimumSize(new java.awt.Dimension(113, 30));
        bcompensation.setOpaque(false);
        bcompensation.setPreferredSize(new java.awt.Dimension(113, 30));
        bcompensation.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bcompensation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcompensationActionPerformed(evt);
            }
        });
        
        bcompensation.setBounds(870, 30, 130, 90);
        jLayeredPane1.add(bcompensation, javax.swing.JLayeredPane.DEFAULT_LAYER);

        buserman.setForeground(new java.awt.Color(255, 255, 255));
        buserman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/Users64.png"))); // NOI18N
        buserman.setText("Manage Users");
        buserman.setBorderPainted(false);
        buserman.setContentAreaFilled(false);
        buserman.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buserman.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/Users64-disabled.png"))); // NOI18N
        buserman.setEnabled(false);
        buserman.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buserman.setIconTextGap(-5);
        buserman.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/Users64-release.png"))); // NOI18N
        buserman.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        buserman.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buserman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busermanActionPerformed(evt);
            }
        });
        buserman.setBounds(10, 30, 110, 90);
        jLayeredPane1.add(buserman, javax.swing.JLayeredPane.DEFAULT_LAYER);

        blogout.setText("logout");
        blogout.setBorderPainted(false);
        blogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        blogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blogoutActionPerformed(evt);
            }
        });
        blogout.setBounds(1015, 5, 85, 21);
        jLayeredPane1.add(blogout, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bpayments.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        bpayments.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/cash-icon.png"))); // NOI18N
        bpayments.setText("PAYMENTS");
        bpayments.setBorderPainted(false);
        bpayments.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bpayments.setIconTextGap(-1);
        bpayments.setOpaque(false);
        bpayments.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bpayments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpaymentsActionPerformed(evt);
            }
        });
        
        bpayments.setBounds(580, 30, 140, 90);
        jLayeredPane1.add(bpayments, javax.swing.JLayeredPane.DEFAULT_LAYER);

        l_date.setFont(new java.awt.Font("Simplified Arabic Fixed", 1, 14)); // NOI18N
        l_date.setForeground(new java.awt.Color(51, 51, 51));
        l_date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_date.setBounds(430, 0, 200, 30);
        jLayeredPane1.add(l_date, javax.swing.JLayeredPane.DEFAULT_LAYER);

        l_time.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        l_time.setForeground(new java.awt.Color(51, 51, 51));
        l_time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_time.setBounds(960, 80, 150, 40);
        jLayeredPane1.add(l_time, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/LB_background/lb0.png"))); // NOI18N
        jLabel2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/LB_background/lb0.png"))); // NOI18N
        jLabel2.setEnabled(false);
        jLabel2.setBounds(0, 0, 1120, 570);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setBorderPainted(false);

        jMenu1.setMnemonic('n');
        jMenu1.setText("Navigate");

        logoutFromMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        logoutFromMenu.setMnemonic('l');
        logoutFromMenu.setText("Logout   ");
        logoutFromMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutFromMenuActionPerformed(evt);
            }
        });
        jMenu1.add(logoutFromMenu);

        jMenuItem16.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem16.setMnemonic('x');
        jMenuItem16.setText("Exit  ");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem16);

        jMenuBar1.add(jMenu1);

        jMenu2.setMnemonic('t');
        jMenu2.setText("Tools");

        jMenu4.setText("Backup/Restore");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setMnemonic('b');
        jMenuItem2.setText("Rescue manager");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenu2.add(jMenu4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Advanced");

        jMenu5.setText("Change Appearance");

        jMenuItem1.setText("Zahara theme");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem1);

        jMenuItem4.setText("Autumn theme");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem4);

        jMenuItem5.setText("Business theme");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem5);

        jMenuItem6.setText("Creme Look");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuItem7.setText("GreenMagic theme");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        jMenuItem8.setText("Windows Classic");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem8);

        jMenuItem9.setText("Windows Default");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenuItem10.setText("Magma theme");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem10);

        jMenuItem11.setText("Raven Look");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem11);

        jMenuItem12.setText("Metal theme");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem12);

        jMenuItem13.setText("Nimbus theme");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem13);

        jMenuItem14.setText("FieldOfWheat Look");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem14);

        jMenuItem15.setText("Mango theme");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem15);

        jMenu3.add(jMenu5);

        login_menu.setText("Login Sessions");
        login_menu.setEnabled(false);
        login_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_menuActionPerformed(evt);
            }
        });
        jMenu3.add(login_menu);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1120)/2, (screenSize.height-596)/2, 1120, 596);
    }// </editor-fold>//GEN-END:initComponents

    private void battendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_battendanceActionPerformed
        System.gc();
        attendance();
    }//GEN-LAST:event_battendanceActionPerformed

    private void bpaymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpaymentsActionPerformed
        System.gc();
        payments();
    }//GEN-LAST:event_bpaymentsActionPerformed

    private void bteachersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteachersActionPerformed
        System.gc();
        tea();
    }//GEN-LAST:event_bteachersActionPerformed

    private void bcompensationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcompensationActionPerformed
        System.gc();
        compensation();
    }//GEN-LAST:event_bcompensationActionPerformed

    private void bregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bregisterActionPerformed
        System.gc();
        stu();
    }//GEN-LAST:event_bregisterActionPerformed

    private void bclassesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bclassesActionPerformed
        System.gc();
        classes();
    }//GEN-LAST:event_bclassesActionPerformed

    private void busermanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busermanActionPerformed
        System.gc();
        JPasswordField pwd = new JPasswordField(20);
        int getpwd0 = JOptionPane.showConfirmDialog(null, pwd, "Enter your password: ",
                JOptionPane.OK_CANCEL_OPTION);
        if (getpwd0 == JOptionPane.OK_OPTION) {
            if (new String(pwd.getPassword()).equals("admin")) {
                System.gc();
                this.setState(ICONIFIED);
                new user_manage().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "You are not the owner/administrator \n"
                        + "thus you are not allowed for user management ", "Warning", 2);
            }
        }
    }//GEN-LAST:event_busermanActionPerformed

    private void blogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blogoutActionPerformed
        new LOGIN.logout().log();
        killall();
    }//GEN-LAST:event_blogoutActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        int showConfirmDialog = JOptionPane.showConfirmDialog(null, "<html><font color=red>"
                + "Are you sure about the process?? </font></html>");
        if (showConfirmDialog == JOptionPane.OK_OPTION) {
            this.dispose();
            System.gc();
            new RescueManager().setVisible(true);
        }

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            theme.zahara();
        } catch (UnsupportedLookAndFeelException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        try {
            theme.autumn();
        } catch (UnsupportedLookAndFeelException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        try {
            theme.business();
        } catch (UnsupportedLookAndFeelException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        try {
            theme.creme();
        } catch (UnsupportedLookAndFeelException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        try {
            theme.greenmagic();
        } catch (UnsupportedLookAndFeelException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        try {
            theme.windowsclassic();
        } catch (UnsupportedLookAndFeelException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        try {
            theme.windows();
        } catch (UnsupportedLookAndFeelException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        try {
            theme.magma();
        } catch (UnsupportedLookAndFeelException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        try {
            theme.raven();
        } catch (UnsupportedLookAndFeelException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        try {
            theme.metal();
        } catch (UnsupportedLookAndFeelException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        try {
            theme.nimbus();
        } catch (UnsupportedLookAndFeelException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        try {
            theme.fieldofwheat();
        } catch (UnsupportedLookAndFeelException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        try {
            theme.mango();
        } catch (UnsupportedLookAndFeelException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        System.gc();
        System.exit(0);
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void logoutFromMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutFromMenuActionPerformed
        new LOGIN.logout().log();
        killall();
    }//GEN-LAST:event_logoutFromMenuActionPerformed

    private void login_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_menuActionPerformed
        System.gc();
        new logins().setVisible(true);
    }//GEN-LAST:event_login_menuActionPerformed
    /*
     * ----------------------------------------
     * ----------------------------------------
     * methods of the button actions
     * goes below
     * including the globally initiallized varialbles and objects
     * ----------------------------------------
     * ----------------------------------------
     * ----------------------------------------
     */
    In_stu_reg s;//--------------student reg object initiallized globally
    int i = 0;                  //------------count and maintain visibility of the internal frame

    private void stu() {
        s = new In_stu_reg();
        if (i >= 1) {
            s.dispose();
            jDesktopPane1.remove(s);
            i = 0;
            jDesktopPane1.add(s);
            s.setVisible(true);
            i++;
        } else if (i == 0) {
            i++;
            jDesktopPane1.add(s);
            s.setVisible(true);
        }
    }
    In_tea_reg t;  //-----------teacher-reg object initiallized globally
    int j = 0;                  //------------count and maintain visibility of the internal frame

    private void tea() {
        t = new In_tea_reg();
        if (j >= 1) {
            t.dispose();
            jDesktopPane1.remove(t);
            j = 0;
            jDesktopPane1.add(t);
            t.setVisible(true);
            j++;
        } else if (j == 0) {
            jDesktopPane1.add(t);
            t.setVisible(true);
            j++;
        }
    }
    In_attendance a;
    int k = 0;

    private void attendance() {
        a = new In_attendance();
        if (k >= 1) {
            a.dispose();
            jDesktopPane1.remove(a);
            k = 0;
            jDesktopPane1.add(a);
            a.setVisible(true);
            k++;
        } else if (k == 0) {
            jDesktopPane1.add(a);
            a.setVisible(true);
            k++;
        }
    }
    In_classes_times clst;
    int c = 0;

    private void classes() {
        clst = new In_classes_times();
        if (c >= 1) {
            clst.dispose();
            jDesktopPane1.remove(clst);
            c = 0;
            jDesktopPane1.add(clst);
            clst.setVisible(true);
            //          clst.classes();
            c++;
        } else if (c == 0) {
            jDesktopPane1.add(clst);
            clst.setVisible(true);
//            clst.classes();
            c++;
        }
    }
    in_frames.in_compensation comps;
    int co = 0;

    private void compensation() {
        comps = new in_compensation();
        if (co >= 1) {
            comps.dispose();
            jDesktopPane1.remove(comps);
            co = 0;
            jDesktopPane1.add(comps);
            comps.setVisible(true);

            co++;
        } else if (co == 0) {
            jDesktopPane1.add(comps);
            comps.setVisible(true);

            co++;
        }
    }
    in_frames.In_payments pay;
    int pa = 0;

    private void payments() {
        pay = new In_payments();
        if (pa >= 1) {
            pay.dispose();
            jDesktopPane1.remove(pay);
            pa = 0;
            jDesktopPane1.add(pay);
            pay.setVisible(true);

            pa++;
        } else if (pa == 0) {
            jDesktopPane1.add(pay);
            pay.setVisible(true);

            pa++;
        }
    }

    public void admin() {//--------------enabling user management
        buserman.setEnabled(true);
        login_menu.setEnabled(true);
        System.gc();
    }

//private void welcome() {   //--------------------animated  welcome lable
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (!Thread.currentThread().isInterrupted()) {
//                    try {
//                        //Thread t = new Thread();
//                        l_title.setText(" ");
//                        String txt = "WELCOME TO  LONDON BRIDGE  MANAGEMENT  SYSTEM";
//                        String[] title = txt.split("");
//                        for (int j = 0; j < title.length; j++) {
//                            String get = l_title.getText();
//                            l_title.setText(get + title[j]);
////                            ti++;
//                            Thread.sleep(120);
//                        }
//
//
//                    } catch (Exception e) {
//                        System.out.println(e);
//                    }
//                }
//
//            }
//        }).start();
//
//    }
    public void refreshui() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new newHome().repaint();
                System.gc();
            }
        });
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(new NimbusLookAndFeel());
                } catch (UnsupportedLookAndFeelException ex) {
                    System.out.println(ex);
                }
                new newHome().setVisible(true);
                //  new newHome().framefunctions();
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton battendance;
    private javax.swing.JButton bclasses;
    private javax.swing.JButton bcompensation;
    private javax.swing.JButton blogout;
    private javax.swing.JButton bpayments;
    private javax.swing.JButton bregister;
    private javax.swing.JButton bteachers;
    private javax.swing.JButton buserman;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JLabel l_date;
    private javax.swing.JLabel l_time;
    private javax.swing.JMenuItem login_menu;
    private javax.swing.JMenuItem logoutFromMenu;
    // End of variables declaration//GEN-END:variables

    /**
     * Sets Title for a special Situation like ADMIN login
     *
     * @param name basically, its the name sent to set as title,but anything is
     * possible
     */
    public final void titleFromLogin(String name) {
        System.gc();
        this.setTitle(this.getTitle().concat(name));
    }
}
