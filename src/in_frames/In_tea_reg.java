/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in_frames;

import Connection.jdbc;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import london.All_data;

/**
 *
 * @author Administrator
 */
public class In_tea_reg extends javax.swing.JInternalFrame {

    jdbc cdb = new jdbc();

    public In_tea_reg() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layer_teachers = new javax.swing.JLayeredPane();
        t_tno = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        t_tname = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        t_taddr = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        t_tmob = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        t_tnic = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        combo_subject = new javax.swing.JComboBox();
        bup_teacher = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        t_tvehicle = new javax.swing.JTextField();
        bcreate_teacher = new javax.swing.JButton();
        blist_tea = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        breset = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Teachers");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/site_icon.png"))); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t_tno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                t_tnoFocusLost(evt);
            }
        });
        t_tno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_tnoKeyPressed(evt);
            }
        });
        t_tno.setBounds(140, 33, 170, 26);
        layer_teachers.add(t_tno, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Tutor No");
        jLabel9.setMaximumSize(new java.awt.Dimension(100, 19));
        jLabel9.setMinimumSize(new java.awt.Dimension(100, 19));
        jLabel9.setPreferredSize(new java.awt.Dimension(100, 19));
        jLabel9.setBounds(10, 24, 110, 40);
        layer_teachers.add(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Name");
        jLabel13.setMaximumSize(new java.awt.Dimension(100, 19));
        jLabel13.setMinimumSize(new java.awt.Dimension(100, 19));
        jLabel13.setPreferredSize(new java.awt.Dimension(100, 19));
        jLabel13.setBounds(10, 74, 110, 40);
        layer_teachers.add(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        t_tname.setBounds(140, 83, 310, 26);
        layer_teachers.add(t_tname, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Address");
        jLabel14.setMaximumSize(new java.awt.Dimension(100, 19));
        jLabel14.setMinimumSize(new java.awt.Dimension(100, 19));
        jLabel14.setPreferredSize(new java.awt.Dimension(100, 19));
        jLabel14.setBounds(10, 134, 110, 30);
        layer_teachers.add(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        t_taddr.setBounds(140, 133, 310, 26);
        layer_teachers.add(t_taddr, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Mobile No");
        jLabel15.setMaximumSize(new java.awt.Dimension(100, 19));
        jLabel15.setMinimumSize(new java.awt.Dimension(100, 19));
        jLabel15.setPreferredSize(new java.awt.Dimension(100, 19));
        jLabel15.setBounds(10, 184, 110, 30);
        layer_teachers.add(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);

        t_tmob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_tmobKeyPressed(evt);
            }
        });
        t_tmob.setBounds(140, 183, 170, 26);
        layer_teachers.add(t_tmob, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("N.I.C  No");
        jLabel16.setMaximumSize(new java.awt.Dimension(100, 19));
        jLabel16.setMinimumSize(new java.awt.Dimension(100, 19));
        jLabel16.setPreferredSize(new java.awt.Dimension(100, 19));
        jLabel16.setBounds(10, 234, 110, 30);
        layer_teachers.add(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);

        t_tnic.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        t_tnic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_tnicKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t_tnicKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_tnicKeyTyped(evt);
            }
        });
        t_tnic.setBounds(140, 233, 170, 26);
        layer_teachers.add(t_tnic, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Subject");
        jLabel17.setMaximumSize(new java.awt.Dimension(100, 19));
        jLabel17.setMinimumSize(new java.awt.Dimension(100, 19));
        jLabel17.setPreferredSize(new java.awt.Dimension(100, 19));
        jLabel17.setBounds(410, 80, 110, 24);
        layer_teachers.add(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);

        combo_subject.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Subject", "Mathematics", "Biology", "Chemistry", "Physics", "Economics", "Business Studies", "Accounting", "ICT" }));
        combo_subject.setBounds(550, 80, 180, 27);
        layer_teachers.add(combo_subject, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bup_teacher.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        bup_teacher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/b_finish_payment.png"))); // NOI18N
        bup_teacher.setText("Update Details");
        bup_teacher.setBorderPainted(false);
        bup_teacher.setContentAreaFilled(false);
        bup_teacher.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bup_teacher.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/b_finish_payment-2.png"))); // NOI18N
        bup_teacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bup_teacherActionPerformed(evt);
            }
        });
        bup_teacher.setBounds(640, 330, 200, 50);
        layer_teachers.add(bup_teacher, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setText("v");
        jLabel20.setBounds(320, 230, 30, 24);
        layer_teachers.add(jLabel20, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Vehicle No");
        jLabel21.setMaximumSize(new java.awt.Dimension(100, 19));
        jLabel21.setMinimumSize(new java.awt.Dimension(100, 19));
        jLabel21.setPreferredSize(new java.awt.Dimension(100, 19));
        jLabel21.setBounds(10, 280, 110, 30);
        layer_teachers.add(jLabel21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        t_tvehicle.setBounds(140, 283, 170, 26);
        layer_teachers.add(t_tvehicle, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bcreate_teacher.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        bcreate_teacher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/b_finish_payment.png"))); // NOI18N
        bcreate_teacher.setText("Create Record");
        bcreate_teacher.setBorderPainted(false);
        bcreate_teacher.setContentAreaFilled(false);
        bcreate_teacher.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bcreate_teacher.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/b_finish_payment-2.png"))); // NOI18N
        bcreate_teacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcreate_teacherActionPerformed(evt);
            }
        });
        bcreate_teacher.setBounds(420, 330, 250, 50);
        layer_teachers.add(bcreate_teacher, javax.swing.JLayeredPane.DEFAULT_LAYER);

        blist_tea.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        blist_tea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/b_finish_payment.png"))); // NOI18N
        blist_tea.setText("Registered Tutors");
        blist_tea.setBorderPainted(false);
        blist_tea.setContentAreaFilled(false);
        blist_tea.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        blist_tea.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/b_finish_payment-2.png"))); // NOI18N
        blist_tea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blist_teaActionPerformed(evt);
            }
        });
        blist_tea.setBounds(0, 330, 220, 50);
        layer_teachers.add(blist_tea, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel1.setForeground(java.awt.SystemColor.controlLtHighlight);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Register Institute Tutors");
        jLabel1.setBounds(470, 0, 300, 40);
        layer_teachers.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("press enter to search");
        jLabel18.setMaximumSize(new java.awt.Dimension(100, 19));
        jLabel18.setMinimumSize(new java.awt.Dimension(100, 19));
        jLabel18.setPreferredSize(new java.awt.Dimension(100, 19));
        jLabel18.setBounds(320, 30, 150, 30);
        layer_teachers.add(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);

        breset.setText("Reset");
        breset.setBorderPainted(false);
        breset.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        breset.setOpaque(false);
        breset.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/log2.png"))); // NOI18N
        breset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bresetActionPerformed(evt);
            }
        });
        breset.setBounds(280, 350, 90, 20);
        layer_teachers.add(breset, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel33.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/LB4.png"))); // NOI18N
        jLabel33.setEnabled(false);
        jLabel33.setBounds(0, -150, 860, 550);
        layer_teachers.add(jLabel33, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(layer_teachers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 844, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void resetFields() {
        t_tno.setText("");
        t_tnic.setText("");
        t_tname.setText("");
        t_taddr.setText("");
        t_tmob.setText("");
        t_tvehicle.setText("");
        combo_subject.setSelectedIndex(0);
    }

    private void bcreate_teacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcreate_teacherActionPerformed
        if (t_tno.getText().equals("")) {
            JOptionPane.showMessageDialog(layer_teachers, "Required Field Cannot be left blank !!");
            t_tno.grabFocus();
            t_tno.setBackground(Color.pink);
        } else if (t_tname.getText().equals("")) {
            JOptionPane.showMessageDialog(layer_teachers, "Required Field Cannot be left blank !!");
            t_tname.grabFocus();
            t_tname.setBackground(Color.pink);
        } else if (t_taddr.getText().equals("")) {
            JOptionPane.showMessageDialog(layer_teachers, "Required Field Cannot be left blank !!");
            t_taddr.grabFocus();
            t_taddr.setBackground(Color.pink);
        } else if (t_tnic.getText().equals("")) {
            JOptionPane.showMessageDialog(layer_teachers, "Required Field Cannot be left blank !!");
            t_tnic.grabFocus();
            t_tnic.setBackground(Color.pink);
        } else {
            try {
                cdb.putdata("INSERT INTO tutor(tutor_no,nic,name,address,mobile,subject,vehicle) "
                        + "VALUES ('" + t_tno.getText() + "','" + t_tnic.getText() + "','" + t_tname.getText() + "',"
                        + "'" + t_taddr.getText() + "','" + t_tmob.getText() + "',"
                        + "'" + combo_subject.getSelectedItem() + "',"
                        + "'" + t_tvehicle.getText() + "')");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        resetFields();
    }//GEN-LAST:event_bcreate_teacherActionPerformed

    private void bup_teacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bup_teacherActionPerformed

        if (t_tno.getText().equals("")) {
            JOptionPane.showMessageDialog(layer_teachers, "Required Field Cannot be left blank !!");
            t_tno.grabFocus();
            t_tno.setBackground(Color.pink);
        } else if (t_tname.getText().equals("")) {
            JOptionPane.showMessageDialog(layer_teachers, "Required Field Cannot be left blank !!");
            t_tname.grabFocus();
            t_tname.setBackground(Color.pink);
        } else if (t_taddr.getText().equals("")) {
            JOptionPane.showMessageDialog(layer_teachers, "Required Field Cannot be left blank !!");
            t_taddr.grabFocus();
            t_taddr.setBackground(Color.pink);
        } else if (t_tnic.getText().equals("")) {
            JOptionPane.showMessageDialog(layer_teachers, "Required Field Cannot be left blank !!");
            t_tnic.grabFocus();
            t_tnic.setBackground(Color.pink);
        } else {
            try {
                cdb.putdata("update tutor set "
                        + " nic='" + t_tnic.getText() + "',name='" + t_tname.getText() + "',"
                        + " address='" + t_taddr.getText() + "',mobile='" + t_tmob.getText() + "',"
                        + " subject='" + combo_subject.getSelectedItem() + "',"
                        + " vehicle='" + t_tvehicle.getText() + "' "
                        + " where tutor_no='" + t_tno.getText() + "'");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        resetFields();

    }//GEN-LAST:event_bup_teacherActionPerformed

    private void t_tnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_tnoFocusLost
        ResultSet rs = null;
        try {
            rs = cdb.getdata("select * from tutor where tutor_no='" + t_tno.getText() + "'");
            rs.next();
            t_taddr.setText(rs.getString("address"));
            t_tname.setText(rs.getString("name"));
            t_tmob.setText(rs.getString("mobile"));
            t_tvehicle.setText(rs.getString("vehicle"));
            t_tnic.setText(rs.getString("nic"));

            combo_subject.setSelectedItem(rs.getString("subject"));
        } catch (Exception e) {
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
    }//GEN-LAST:event_t_tnoFocusLost

    private void t_tnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_tnoKeyPressed
        ResultSet rs = null;
        if (evt.getKeyCode() == 10) {
            try {
                rs = cdb.getdata("select * from tutor where tutor_no='" + t_tno.getText() + "'");
                rs.next();
                t_taddr.setText(rs.getString("address"));
                t_tname.setText(rs.getString("name"));
                t_tmob.setText(rs.getString("mobile"));
                t_tvehicle.setText(rs.getString("vehicle"));
                t_tnic.setText(rs.getString("nic"));

                combo_subject.setSelectedItem(rs.getString("subject"));
            } catch (Exception e) {
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
    }//GEN-LAST:event_t_tnoKeyPressed

    private void blist_teaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blist_teaActionPerformed
        All_data all = new All_data();
        all.setVisible(true);
    }//GEN-LAST:event_blist_teaActionPerformed

    private void t_tnicKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_tnicKeyPressed

        if (evt.getKeyCode() == 8 | evt.getKeyCode() == 127 | evt.getKeyCode() >= 48 && evt.getKeyCode() <= 57
                | evt.getKeyCode() == 37
                | evt.getKeyCode() == 39 | evt.getKeyCode() == 144
                | evt.getKeyCode() >= 96 && evt.getKeyCode() <= 105) {
            t_tnic.setEditable(true);
        } else if (evt.getKeyCode() == 10) {
            t_tvehicle.grabFocus();
        } else {
            t_tnic.setEditable(false);
            JOptionPane.showMessageDialog(null, "There are only numerical National ID values yet", "Error", 2);
        }
        if (t_tnic.getText().length() <= 8) {
            t_tnic.setEditable(true);
        } else {
            t_tnic.setEditable(false);
        }

    }//GEN-LAST:event_t_tnicKeyPressed

    private void t_tmobKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_tmobKeyPressed
        if (evt.getKeyCode() == 8 | evt.getKeyCode() == 127 | evt.getKeyCode() >= 48 && evt.getKeyCode() <= 57
                | evt.getKeyCode() == 37
                | evt.getKeyCode() == 39 | evt.getKeyCode() == 144
                | evt.getKeyCode() >= 96 && evt.getKeyCode() <= 105) {
            t_tmob.setEditable(true);
        } else if (evt.getKeyCode() == 10) {
            t_tmob.setEditable(true);
        } else {
            t_tmob.setEditable(false);
            JOptionPane.showMessageDialog(null,
                    "Enter only the numeric values of the mobile number excluding DASH(-)", "Error", 2);
            t_tmob.setText("");
            t_tmob.grabFocus();
        }
    }//GEN-LAST:event_t_tmobKeyPressed

    private void t_tnicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_tnicKeyTyped
//        int count = 0;
//        do {
//            t_tnic.setEditable(true);
//            if (evt.getKeyCode() >= 48 && evt.getKeyCode() <= 57 | evt.getKeyCode() >= 96 && evt.getKeyCode() <= 105) {
//                count++;
//            }
//        } while (count <= 9);
    }//GEN-LAST:event_t_tnicKeyTyped

    private void bresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bresetActionPerformed
        resetFields();
    }//GEN-LAST:event_bresetActionPerformed

    private void t_tnicKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_tnicKeyReleased
        if (t_tnic.getText().length() <= 8) {
            t_tnic.setEditable(true);
        } else {
            t_tnic.setEditable(false);
        }
    }//GEN-LAST:event_t_tnicKeyReleased
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bcreate_teacher;
    private javax.swing.JButton blist_tea;
    private javax.swing.JButton breset;
    private javax.swing.JButton bup_teacher;
    private javax.swing.JComboBox combo_subject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane layer_teachers;
    private javax.swing.JTextField t_taddr;
    private javax.swing.JTextField t_tmob;
    private javax.swing.JTextField t_tname;
    private javax.swing.JTextField t_tnic;
    private javax.swing.JTextField t_tno;
    private javax.swing.JTextField t_tvehicle;
    // End of variables declaration//GEN-END:variables
}
