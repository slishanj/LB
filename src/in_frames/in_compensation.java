package in_frames;

import Connection.jdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class in_compensation extends javax.swing.JInternalFrame {

    public in_compensation() {
        initComponents();
        lbl_useragent.setText("USER : " + new LOGIN.login().getUserAgent());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        lbl_useragent = new javax.swing.JLabel();
        combo_teacher = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        t_share = new javax.swing.JTextField();
        t_income = new javax.swing.JTextField();
        t_percentage = new javax.swing.JTextField();
        combo_batch = new javax.swing.JComboBox();
        combo_month = new javax.swing.JComboBox();
        check_final = new javax.swing.JCheckBox();
        bfinish = new javax.swing.JButton();
        l_subject = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        check_perc_ok = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Teachers' Share Payment");
        setToolTipText("");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/site_icon.png"))); // NOI18N

        lbl_useragent.setFont(new java.awt.Font("Old English Text MT", 0, 18)); // NOI18N
        lbl_useragent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_useragent.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lbl_useragent.setBounds(460, 190, 250, 40);
        jLayeredPane1.add(lbl_useragent, javax.swing.JLayeredPane.DEFAULT_LAYER);

        combo_teacher.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Tutor" }));
        combo_teacher.setEnabled(false);
        combo_teacher.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_teacherItemStateChanged(evt);
            }
        });
        combo_teacher.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                combo_teacherFocusGained(evt);
            }
        });
        combo_teacher.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                combo_teacherKeyPressed(evt);
            }
        });
        combo_teacher.setBounds(180, 100, 270, 30);
        jLayeredPane1.add(combo_teacher, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Name :");
        jLabel1.setBounds(10, 100, 140, 30);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Total Income from Class :");
        jLabel2.setBounds(10, 200, 140, 30);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("% for Institute :");
        jLabel3.setBounds(10, 240, 140, 50);
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Tutor's Share :");
        jLabel4.setBounds(10, 300, 140, 50);
        jLayeredPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("for Month :");
        jLabel5.setBounds(10, 10, 140, 30);
        jLayeredPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Batch year :");
        jLabel6.setBounds(10, 50, 140, 40);
        jLayeredPane1.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        t_share.setEditable(false);
        t_share.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        t_share.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_share.setEnabled(false);
        t_share.setBounds(180, 310, 200, 30);
        jLayeredPane1.add(t_share, javax.swing.JLayeredPane.DEFAULT_LAYER);

        t_income.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        t_income.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_income.setEnabled(false);
        t_income.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                t_incomeFocusLost(evt);
            }
        });
        t_income.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_incomeKeyPressed(evt);
            }
        });
        t_income.setBounds(180, 200, 200, 30);
        jLayeredPane1.add(t_income, javax.swing.JLayeredPane.DEFAULT_LAYER);

        t_percentage.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        t_percentage.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_percentage.setEnabled(false);
        t_percentage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                t_percentageFocusLost(evt);
            }
        });
        t_percentage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_percentageKeyPressed(evt);
            }
        });
        t_percentage.setBounds(180, 250, 200, 30);
        jLayeredPane1.add(t_percentage, javax.swing.JLayeredPane.DEFAULT_LAYER);

        combo_batch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Batch", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));
        combo_batch.setEnabled(false);
        combo_batch.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_batchItemStateChanged(evt);
            }
        });
        combo_batch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                combo_batchKeyPressed(evt);
            }
        });
        combo_batch.setBounds(180, 55, 200, 30);
        jLayeredPane1.add(combo_batch, javax.swing.JLayeredPane.DEFAULT_LAYER);

        combo_month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        combo_month.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_monthItemStateChanged(evt);
            }
        });
        combo_month.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                combo_monthKeyPressed(evt);
            }
        });
        combo_month.setBounds(180, 10, 200, 30);
        jLayeredPane1.add(combo_month, javax.swing.JLayeredPane.DEFAULT_LAYER);

        check_final.setText("Confirmed that details are correct and final");
        check_final.setContentAreaFilled(false);
        check_final.setEnabled(false);
        check_final.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        check_final.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        check_final.setIconTextGap(20);
        check_final.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                check_finalMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                check_finalMouseClicked(evt);
            }
        });
        check_final.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                check_finalItemStateChanged(evt);
            }
        });
        check_final.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                check_finalKeyPressed(evt);
            }
        });
        check_final.setBounds(230, 340, 330, 23);
        jLayeredPane1.add(check_final, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bfinish.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        bfinish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/b_finish_payment.png"))); // NOI18N
        bfinish.setText("Finish Payment");
        bfinish.setBorderPainted(false);
        bfinish.setContentAreaFilled(false);
        bfinish.setEnabled(false);
        bfinish.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bfinish.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/b_finish_payment-2.png"))); // NOI18N
        bfinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bfinishActionPerformed(evt);
            }
        });
        bfinish.setBounds(520, 320, 200, 50);
        jLayeredPane1.add(bfinish, javax.swing.JLayeredPane.DEFAULT_LAYER);

        l_subject.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        l_subject.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_subject.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        l_subject.setMaximumSize(new java.awt.Dimension(100, 19));
        l_subject.setMinimumSize(new java.awt.Dimension(100, 19));
        l_subject.setPreferredSize(new java.awt.Dimension(100, 19));
        l_subject.setBounds(180, 150, 200, 30);
        jLayeredPane1.add(l_subject, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Subject :");
        jLabel18.setMaximumSize(new java.awt.Dimension(100, 19));
        jLabel18.setMinimumSize(new java.awt.Dimension(100, 19));
        jLabel18.setPreferredSize(new java.awt.Dimension(100, 19));
        jLabel18.setBounds(10, 150, 140, 30);
        jLayeredPane1.add(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);

        check_perc_ok.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        check_perc_ok.setText("tick to confirm value");
        check_perc_ok.setContentAreaFilled(false);
        check_perc_ok.setEnabled(false);
        check_perc_ok.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        check_perc_ok.setIconTextGap(30);
        check_perc_ok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                check_perc_okMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                check_perc_okMouseClicked(evt);
            }
        });
        check_perc_ok.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                check_perc_okItemStateChanged(evt);
            }
        });
        check_perc_ok.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                check_perc_okKeyPressed(evt);
            }
        });
        check_perc_ok.setBounds(180, 283, 200, 20);
        jLayeredPane1.add(check_perc_ok, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setText("See Past Logs");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(592, 150, 120, 30);
        jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel32.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/LB4.png"))); // NOI18N
        jLabel32.setEnabled(false);
        jLabel32.setBounds(-120, 0, 850, 550);
        jLayeredPane1.add(jLabel32, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//--------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------

    void loadTeachers() {
        ResultSet rs1 = null;
        combo_teacher.removeAllItems();
        if (!combo_teacher.isEnabled()) {
            JOptionPane.showMessageDialog(null, "Teacher List is not enabled!"
                    + " \n Something has gone wrong. \n Please contact System Administrator");
        } else if (combo_teacher.isEnabled()) {
            try {
                rs1 = jdbc.con().createStatement().executeQuery("select * from tutor");
                while (rs1.next()) {
                    combo_teacher.addItem(rs1.getString("name"));
                }
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                try {
                    if (rs1 != null) {
                        rs1.close();
                    }
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
        }
    }

    private void combo_monthItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_monthItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            combo_batch.setEnabled(true);
//           combo_batch.grabFocus();
        }
    }//GEN-LAST:event_combo_monthItemStateChanged

    private void combo_monthKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combo_monthKeyPressed
        if (evt.getKeyCode() == 10) {
            combo_batch.grabFocus();
        }
    }//GEN-LAST:event_combo_monthKeyPressed

    private void combo_batchItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_batchItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            combo_teacher.setEnabled(true);
//           combo_teacher.grabFocus();
        }
    }//GEN-LAST:event_combo_batchItemStateChanged

    private void combo_batchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combo_batchKeyPressed
        if (evt.getKeyCode() == 10) {
            combo_teacher.grabFocus();
        }
    }//GEN-LAST:event_combo_batchKeyPressed

    private void combo_teacherFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combo_teacherFocusGained
        loadTeachers();
    }//GEN-LAST:event_combo_teacherFocusGained

    private void combo_teacherItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_teacherItemStateChanged
        ResultSet rs = null;
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            try {
                rs = jdbc.con().createStatement().executeQuery("select subject from tutor "
                        + "where name='" + combo_teacher.getSelectedItem().toString() + "'");
                rs.next();
                l_subject.setText(rs.getString("subject"));
                t_income.setEnabled(true);
//                t_income.grabFocus();
            } catch (Exception ex) {
                System.out.println(ex);
            } finally {
                try {
                    if (rs != null) {
                        rs.close();
                    }
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
        }
    }//GEN-LAST:event_combo_teacherItemStateChanged

    private void combo_teacherKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combo_teacherKeyPressed
        if (evt.getKeyCode() == 10) {
            t_income.grabFocus();
        }
    }//GEN-LAST:event_combo_teacherKeyPressed

    private void t_incomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_incomeKeyPressed
        if (evt.getKeyCode() == 8 | evt.getKeyCode() == 127 | evt.getKeyCode() >= 48 && evt.getKeyCode() <= 57
                | evt.getKeyCode() == 37
                | evt.getKeyCode() == 39 | evt.getKeyCode() == 144
                | evt.getKeyCode() >= 96 && evt.getKeyCode() <= 105) {
            t_income.setEditable(true);
        } else if (evt.getKeyCode() == 10) {
            t_percentage.grabFocus();
        } else if (evt.getKeyCode() == 46 | evt.getKeyCode() == 110) {
            t_income.setEditable(false);
            JOptionPane.showMessageDialog(null, "Decimal values aren't allowed !");
            t_income.setText("");
        } else {
            t_income.setEditable(false);
            JOptionPane.showMessageDialog(null, "this input field stands for numbers only");
            t_income.setText("");
        }
    }//GEN-LAST:event_t_incomeKeyPressed

    private void t_incomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_incomeFocusLost
        if (t_income.getText() == null | "".equals(t_income.getText())) {
            JOptionPane.showMessageDialog(null, "Empty Income field");
            t_income.grabFocus();
        } else if (Integer.valueOf(t_income.getText()) == 0) {
            JOptionPane.showMessageDialog(null,
                    "You cannot pay for something \n that has nothing to be paid for", "Error", 2);
        } else {
            t_percentage.setEnabled(true);
            check_perc_ok.setEnabled(true);
//            t_percentage.grabFocus();
        }
    }//GEN-LAST:event_t_incomeFocusLost

    private void t_percentageFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_percentageFocusLost
        if (t_percentage.getText() == null | "".equals(t_percentage.getText())) {
            JOptionPane.showMessageDialog(null, "Empty share percentage field");
            t_percentage.grabFocus();
        }
    }//GEN-LAST:event_t_percentageFocusLost

    private void t_percentageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_percentageKeyPressed

        if (evt.getKeyCode() == 8 | evt.getKeyCode() >= 48 && evt.getKeyCode() <= 57
                | evt.getKeyCode() == 127
                | evt.getKeyCode() == 37
                | evt.getKeyCode() == 39 | evt.getKeyCode() == 144
                | evt.getKeyCode() >= 96 && evt.getKeyCode() <= 105) {
            t_percentage.setEditable(true);
        } else if (evt.getKeyCode() == 10) {
            check_perc_ok.grabFocus();
        } else if (evt.getKeyCode() == 46 | evt.getKeyCode() == 110) {
            t_percentage.setEditable(false);
            JOptionPane.showMessageDialog(null, "Decimal values aren't allowed !");
            t_percentage.setText("");
        } else {
            t_percentage.setEditable(false);
            JOptionPane.showMessageDialog(null, "this input field stands for numbers only");
            t_percentage.setText("");
        }
    }//GEN-LAST:event_t_percentageKeyPressed

    private void check_perc_okMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_check_perc_okMouseClicked
        //--------- below process should be set to act after confirmation check box is ticked
        if (check_perc_ok.isSelected()) {
            if (Integer.valueOf(t_percentage.getText()) == 0) {

                int conf = JOptionPane.showConfirmDialog(null, "Are you sure that institute \n"
                        + "should receive no share of the income?", "Confirm action", JOptionPane.QUESTION_MESSAGE);
                if (conf == JOptionPane.NO_OPTION) {//if user confirms ok, then continue calculation
                    t_percentage.setText("");
                    t_percentage.grabFocus();
                } else {
                    calculateShare();
                    check_final.setEnabled(true);
                }
            }//if percentage is not zero, continue procedure below
            else {
                calculateShare();
                check_final.setEnabled(true);
            }
        }
    }//GEN-LAST:event_check_perc_okMouseClicked

    private void check_perc_okMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_check_perc_okMouseReleased
        if (check_perc_ok.isSelected()) {
            if (Integer.valueOf(t_percentage.getText()) == 0) {

                int conf = JOptionPane.showConfirmDialog(null, "Are you sure that institute \n"
                        + "should receive no share of the income?", "Confirm action", JOptionPane.QUESTION_MESSAGE);
                if (conf == JOptionPane.NO_OPTION) {//if user confirms ok, then continue calculation
                    t_percentage.setText("");
                    t_percentage.grabFocus();
                } else {
                    calculateShare();
                    check_final.setEnabled(true);
                }
            }//if percentage is not zero, continue procedure below
            else {
                calculateShare();
                check_final.setEnabled(true);
            }
        }
    }//GEN-LAST:event_check_perc_okMouseReleased

    private void check_perc_okKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_check_perc_okKeyPressed
        if (evt.getKeyCode() == 32) {
            //----------space key ticking function enabled for keyboard users
            //   check_perc_ok.setSelected(true);
            if (Integer.valueOf(t_percentage.getText()) == 0) {

                int conf = JOptionPane.showConfirmDialog(null, "Are you sure that institute \n"
                        + "should receive no share of the income?", "Confirm action", JOptionPane.QUESTION_MESSAGE);
                if (conf == JOptionPane.NO_OPTION) {
                    //if user confirms ok, then will continue calculation else if NO, grabfocus
                    t_percentage.setText("");
                    t_percentage.grabFocus();
                } else {
                    calculateShare();
                    check_final.setEnabled(true);
                }
            }//if percentage is not zero, continue procedure below
            else {
                calculateShare();
                check_final.setEnabled(true);
            }
        }
    }//GEN-LAST:event_check_perc_okKeyPressed

    private void check_perc_okItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_check_perc_okItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.DESELECTED) {
            t_share.setText("");
            check_final.setEnabled(false);
        }
    }//GEN-LAST:event_check_perc_okItemStateChanged

    private void check_finalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_check_finalMouseClicked
        if (check_final.isSelected()) {
            bfinish.setEnabled(true);
        }
    }//GEN-LAST:event_check_finalMouseClicked

    private void check_finalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_check_finalMouseReleased
        if (check_final.isSelected()) {
            bfinish.setEnabled(true);
        }
    }//GEN-LAST:event_check_finalMouseReleased

    private void check_finalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_check_finalItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.DESELECTED) {
            bfinish.setEnabled(false);
        } else if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            bfinish.setEnabled(true);
        }
    }//GEN-LAST:event_check_finalItemStateChanged

    private void bfinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bfinishActionPerformed
        finish();
    }//GEN-LAST:event_bfinishActionPerformed

    private void check_finalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_check_finalKeyPressed
        if (evt.getKeyCode() == 32) {
            //----------space key ticking function enabled for keyboard users
            if (check_final.isSelected()) {
                bfinish.setEnabled(true);
            }
        }
    }//GEN-LAST:event_check_finalKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        london.All_data all = new london.All_data();
        all.setVisible(true);
        all.selectRecords();
    }//GEN-LAST:event_jButton1ActionPerformed

//--------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------
    private void finish() {
        ResultSet rs = null;
        String date = new Date().toString();

        int income = Integer.valueOf(t_income.getText());
        int per = Integer.valueOf(t_percentage.getText());
        int per_value = (income * per) / 100;
        try {
            rs = jdbc.con().createStatement().executeQuery("select tutor_no from tutor "
                    + "where name='" + combo_teacher.getSelectedItem() + "'");
            if (rs.first()) {
                jdbc.con().createStatement().executeUpdate("insert into compensation(month,batch,tutor_no,name,"
                        + "income,percentage,percentage_value,for_teacher,date,useragent)"
                        + "values('" + combo_month.getSelectedItem() + "',"
                        + " '" + combo_batch.getSelectedItem() + "','" + rs.getString("tutor_no") + "',"
                        + " '" + combo_teacher.getSelectedItem() + "','" + t_income.getText() + "',"
                        + " '" + t_percentage.getText() + "',"
                        + " '" + per_value + "', '" + t_share.getText() + "','" + date + "',"
                        + " '" + new LOGIN.login().getUserAgent() + "') ");
                //---------------------------------------------------------------
                System.out.println("compensations syncing successful");
                JOptionPane.showMessageDialog(null, "Payment Completed Successfully");

                //<editor-fold defaultstate="collapsed" desc="Resetting fields and SOUT of success">
                combo_batch.setEnabled(false);

                t_income.setEnabled(false);
                t_percentage.setEnabled(false);
                t_share.setEnabled(false);
                check_perc_ok.setSelected(false);
                check_final.setSelected(false);
                check_perc_ok.setEnabled(false);
                check_final.setEnabled(false);
                bfinish.setEnabled(false);

                combo_batch.setSelectedIndex(0);
                combo_month.setSelectedIndex(0);
                combo_teacher.removeAllItems();
                combo_teacher.addItem("Select Tutor");
                combo_teacher.setEnabled(false);
                l_subject.setText("");
                t_income.setText("");
                t_percentage.setText("");
                t_share.setText("");

                System.out.println("all fields resetted");
                //</editor-fold>

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Payment Not Completed !","Error",JOptionPane.ERROR_MESSAGE);
            System.out.println("error in inserting payments to teachers");
            System.out.println(e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }

    private void calculateShare() {
        int income = Integer.valueOf(t_income.getText());
        int per = Integer.valueOf(t_percentage.getText());
        int per_value = (income * per) / 100;
        t_share.setText(String.valueOf(income - per_value));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bfinish;
    private javax.swing.JCheckBox check_final;
    private javax.swing.JCheckBox check_perc_ok;
    private javax.swing.JComboBox combo_batch;
    private javax.swing.JComboBox combo_month;
    private javax.swing.JComboBox combo_teacher;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel l_subject;
    private javax.swing.JLabel lbl_useragent;
    private javax.swing.JTextField t_income;
    private javax.swing.JTextField t_percentage;
    private javax.swing.JTextField t_share;
    // End of variables declaration//GEN-END:variables
}
