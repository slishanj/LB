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
import london.newHome;

/**
 *
 * @author Administrator
 */
public class In_stu_reg extends javax.swing.JInternalFrame {

    jdbc cdb = new jdbc();

    public In_stu_reg() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layer_student = new javax.swing.JLayeredPane();
        t_saddr = new javax.swing.JTextField();
        t_smob = new javax.swing.JTextField();
        t_sno = new javax.swing.JTextField();
        t_sname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        blist_stu = new javax.swing.JButton();
        bup_stu = new javax.swing.JButton();
        t_snic = new javax.swing.JTextField();
        t_ssch = new javax.swing.JTextField();
        t_parent = new javax.swing.JTextField();
        t_guar_cont = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        bcreate_stu = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        check_s6 = new javax.swing.JCheckBox();
        check_s5 = new javax.swing.JCheckBox();
        check_s4 = new javax.swing.JCheckBox();
        jLabel22 = new javax.swing.JLabel();
        stream_list = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        breset = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Student Registration");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/site_icon.png"))); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        layer_student.setBackground(new java.awt.Color(226, 123, 123));
        t_saddr.setBounds(510, 63, 310, 26);
        layer_student.add(t_saddr, javax.swing.JLayeredPane.DEFAULT_LAYER);

        t_smob.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_smob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_smobKeyPressed(evt);
            }
        });
        t_smob.setBounds(510, 143, 170, 26);
        layer_student.add(t_smob, javax.swing.JLayeredPane.DEFAULT_LAYER);

        t_sno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_sno.setToolTipText("if database already has a such,details will show");
        t_sno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                t_snoFocusLost(evt);
            }
        });
        t_sno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_snoKeyPressed(evt);
            }
        });
        t_sno.setBounds(130, 23, 170, 26);
        layer_student.add(t_sno, javax.swing.JLayeredPane.DEFAULT_LAYER);
        t_sname.setBounds(510, 23, 310, 26);
        layer_student.add(t_sname, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Student No");
        jLabel2.setMaximumSize(new java.awt.Dimension(100, 19));
        jLabel2.setMinimumSize(new java.awt.Dimension(100, 19));
        jLabel2.setPreferredSize(new java.awt.Dimension(100, 19));
        jLabel2.setBounds(10, 30, 110, 19);
        layer_student.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Address");
        jLabel3.setMaximumSize(new java.awt.Dimension(100, 19));
        jLabel3.setMinimumSize(new java.awt.Dimension(100, 19));
        jLabel3.setPreferredSize(new java.awt.Dimension(100, 19));
        jLabel3.setBounds(400, 70, 80, 19);
        layer_student.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Name");
        jLabel4.setMaximumSize(new java.awt.Dimension(100, 19));
        jLabel4.setMinimumSize(new java.awt.Dimension(100, 19));
        jLabel4.setPreferredSize(new java.awt.Dimension(100, 19));
        jLabel4.setBounds(400, 30, 80, 19);
        layer_student.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Mobile No");
        jLabel6.setMaximumSize(new java.awt.Dimension(100, 19));
        jLabel6.setMinimumSize(new java.awt.Dimension(100, 19));
        jLabel6.setPreferredSize(new java.awt.Dimension(100, 19));
        jLabel6.setBounds(400, 150, 80, 19);
        layer_student.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("N.I.C  No");
        jLabel5.setMaximumSize(new java.awt.Dimension(100, 19));
        jLabel5.setMinimumSize(new java.awt.Dimension(100, 19));
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 19));
        jLabel5.setBounds(400, 190, 80, 19);
        layer_student.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        blist_stu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        blist_stu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/b_finish_payment.png"))); // NOI18N
        blist_stu.setText("View Registered");
        blist_stu.setBorderPainted(false);
        blist_stu.setContentAreaFilled(false);
        blist_stu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        blist_stu.setOpaque(false);
        blist_stu.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/b_finish_payment-2.png"))); // NOI18N
        blist_stu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blist_stuActionPerformed(evt);
            }
        });
        blist_stu.setBounds(10, 330, 190, 60);
        layer_student.add(blist_stu, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bup_stu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bup_stu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/b_finish_payment.png"))); // NOI18N
        bup_stu.setText("Update Details");
        bup_stu.setBorderPainted(false);
        bup_stu.setContentAreaFilled(false);
        bup_stu.setDefaultCapable(false);
        bup_stu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bup_stu.setOpaque(false);
        bup_stu.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/b_finish_payment-2.png"))); // NOI18N
        bup_stu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bup_stuActionPerformed(evt);
            }
        });
        bup_stu.setBounds(650, 330, 190, 60);
        layer_student.add(bup_stu, javax.swing.JLayeredPane.DEFAULT_LAYER);

        t_snic.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_snic.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                t_snicFocusLost(evt);
            }
        });
        t_snic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_snicKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t_snicKeyReleased(evt);
            }
        });
        t_snic.setBounds(510, 183, 170, 26);
        layer_student.add(t_snic, javax.swing.JLayeredPane.DEFAULT_LAYER);
        t_ssch.setBounds(130, 73, 170, 26);
        layer_student.add(t_ssch, javax.swing.JLayeredPane.DEFAULT_LAYER);
        t_parent.setBounds(510, 103, 310, 26);
        layer_student.add(t_parent, javax.swing.JLayeredPane.DEFAULT_LAYER);

        t_guar_cont.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_guar_cont.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_guar_contKeyPressed(evt);
            }
        });
        t_guar_cont.setBounds(130, 123, 170, 26);
        layer_student.add(t_guar_cont, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Parent/Guardian");
        jLabel7.setMaximumSize(new java.awt.Dimension(100, 19));
        jLabel7.setMinimumSize(new java.awt.Dimension(100, 19));
        jLabel7.setPreferredSize(new java.awt.Dimension(100, 19));
        jLabel7.setBounds(370, 110, 110, 19);
        layer_student.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("School");
        jLabel8.setMaximumSize(new java.awt.Dimension(100, 19));
        jLabel8.setMinimumSize(new java.awt.Dimension(100, 19));
        jLabel8.setPreferredSize(new java.awt.Dimension(100, 19));
        jLabel8.setBounds(10, 80, 110, 19);
        layer_student.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Guardian Contact");
        jLabel10.setMaximumSize(new java.awt.Dimension(100, 19));
        jLabel10.setMinimumSize(new java.awt.Dimension(100, 19));
        jLabel10.setPreferredSize(new java.awt.Dimension(100, 19));
        jLabel10.setBounds(10, 130, 110, 19);
        layer_student.add(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bcreate_stu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bcreate_stu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/b_finish_payment.png"))); // NOI18N
        bcreate_stu.setText("Add Student");
        bcreate_stu.setBorderPainted(false);
        bcreate_stu.setContentAreaFilled(false);
        bcreate_stu.setDefaultCapable(false);
        bcreate_stu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bcreate_stu.setOpaque(false);
        bcreate_stu.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/b_finish_payment-2.png"))); // NOI18N
        bcreate_stu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcreate_stuActionPerformed(evt);
            }
        });
        bcreate_stu.setBounds(420, 330, 190, 60);
        layer_student.add(bcreate_stu, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel19.setText("v");
        jLabel19.setBounds(690, 186, 20, 20);
        layer_student.add(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel1.setEnabled(false);
        jPanel1.setOpaque(false);

        check_s6.setText("subject 3");
        check_s6.setContentAreaFilled(false);
        check_s6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        check_s6.setIconTextGap(30);

        check_s5.setText("subject 2");
        check_s5.setContentAreaFilled(false);
        check_s5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        check_s5.setIconTextGap(30);

        check_s4.setText("subject 1");
        check_s4.setContentAreaFilled(false);
        check_s4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        check_s4.setIconTextGap(30);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Study Stream");
        jLabel22.setMaximumSize(new java.awt.Dimension(100, 19));
        jLabel22.setMinimumSize(new java.awt.Dimension(100, 19));
        jLabel22.setPreferredSize(new java.awt.Dimension(100, 19));

        stream_list.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Maths", "Bio", "Commerce" }));
        stream_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stream_listMouseClicked(evt);
            }
        });
        stream_list.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                stream_listItemStateChanged(evt);
            }
        });
        stream_list.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                stream_listKeyPressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Subjects");
        jLabel12.setMaximumSize(new java.awt.Dimension(100, 19));
        jLabel12.setMinimumSize(new java.awt.Dimension(100, 19));
        jLabel12.setPreferredSize(new java.awt.Dimension(100, 19));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(check_s4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(check_s5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(check_s6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(stream_list, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stream_list, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check_s4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(check_s5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(check_s6)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel1.setBounds(20, 160, 300, 180);
        layer_student.add(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        breset.setText("Reset");
        breset.setBorderPainted(false);
        breset.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        breset.setOpaque(false);
        breset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bresetActionPerformed(evt);
            }
        });
        breset.setBounds(270, 350, 90, 23);
        layer_student.add(breset, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel33.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/LB4.png"))); // NOI18N
        jLabel33.setEnabled(false);
        jLabel33.setBounds(0, -150, 860, 550);
        layer_student.add(jLabel33, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(layer_student, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t_snoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_snoFocusLost
//        t_sno.setBackground(Color.white);
        ResultSet r = null;
        try {
            if ((r = cdb.getdata("select * from students2 where stu_no='" + t_sno.getText() + "'")) == null) {
                t_sname.grabFocus();
            } else {
                while (r.next()) {
                    t_sname.setText(r.getString("name"));
                    t_guar_cont.setText(r.getString("parent_mobile"));
                    t_parent.setText(r.getString("parent_name"));
                    t_saddr.setText(r.getString("address"));
                    t_smob.setText(r.getString("mobile"));
                    t_snic.setText(r.getString("nic"));
                    t_ssch.setText(r.getString("school"));

                    if (!r.getString("subj1").isEmpty()) {
                        check_s4.setText(r.getString("subj1"));
                        check_s4.setSelected(true);
                    }
                    if (!r.getString("subj2").isEmpty()) {
                        check_s5.setText(r.getString("subj2"));
                        check_s5.setSelected(true);
                    }
                    if (!r.getString("subj3").isEmpty()) {
                        check_s6.setText(r.getString("subj3"));
                        check_s6.setSelected(true);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                if (r != null) {
                    r.close();
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_t_snoFocusLost

    private void t_snicFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_snicFocusLost
        ResultSet r = null;
        try {
            if ((r = cdb.getdata("select * from students2 where nic='" + t_snic.getText() + "'")) == null) {
                stream_list.grabFocus();
            } else {
                while (r.next()) {
                    t_sname.setText(r.getString("name"));
                    t_guar_cont.setText(r.getString("parent_mobile"));
                    t_parent.setText(r.getString("parent_name"));
                    t_saddr.setText(r.getString("address"));
                    t_smob.setText(r.getString("mobile"));
                    t_sno.setText(r.getString("nic"));
                    t_ssch.setText(r.getString("school"));

                }
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                if (r != null) {
                    r.close();
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_t_snicFocusLost

    private void bcreate_stuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcreate_stuActionPerformed
        String subj1 = "";
        String subj2 = "";
        String subj3 = "";

        if (check_s4.isSelected()) {
            subj1 = check_s4.getText();
        }
        if (check_s5.isSelected()) {
            subj2 = check_s5.getText();
        }
        if (check_s6.isSelected()) {
            subj3 = check_s6.getText();
        }

        String stream;//-----------setting the stream from the selection list

        if (stream_list.getSelectedIndex() == 0) {
            stream = "";
        } else {
            stream = stream_list.getSelectedItem().toString();
        }
        //----------------------------------------------------------------------------

        try {
            if (t_sno.getText().equals("")) {
                JOptionPane.showMessageDialog(layer_student, "Required Field Cannot be left blank !!");
                t_sno.grabFocus();
                t_sno.setBackground(Color.pink);
            } else if (t_sname.getText().equals("")) {
                JOptionPane.showMessageDialog(layer_student, "Required Field Cannot be left blank !!");
                t_sname.grabFocus();
                t_sname.setBackground(Color.pink);
            } else if (t_saddr.getText().equals("")) {
                JOptionPane.showMessageDialog(layer_student, "Required Field Cannot be left blank !!");
                t_saddr.grabFocus();
                t_saddr.setBackground(Color.pink);
            } else if (t_snic.getText().equals("")) {
                JOptionPane.showMessageDialog(layer_student, "Required Field Cannot be left blank !!");
                t_snic.grabFocus();
                t_snic.setBackground(Color.pink);
            } else {
                cdb.putdata("INSERT INTO students2(stu_no,nic,name,address,mobile,school,guardian_name,"
                        + " landline,stream,subj1,subj2,subj3) "
                        + "VALUES ('" + t_sno.getText() + "','" + t_snic.getText() + "','" + t_sname.getText() + "',"
                        + " '" + t_saddr.getText() + "','" + t_smob.getText() + "','" + t_ssch.getText() + "',"
                        + " '" + t_parent.getText() + "','" + t_guar_cont.getText() + "',"
                        + " '" + stream + "','" + subj1 + "','" + subj2 + "','" + subj3 + "')");

                JOptionPane.showMessageDialog(null, "Student Details Successfully Entered to Database");

            }
            clean();
        } catch (Exception e) {
            System.out.println("error in creating student data");
            System.out.println(e);
        }

    }//GEN-LAST:event_bcreate_stuActionPerformed

    private void stream_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stream_listMouseClicked

        String stream;//-----------setting the stream from the selection list
        if (stream_list.getSelectedIndex() == 0) {
            stream = "";
        } else {
            stream = stream_list.getSelectedItem().toString();
        }
        //----------------------------------------------------------------------------
        /*
         * if (stream.equals("Maths")) {//--------setting check box names when stream is selected
         check_s4.setText("Mathematics");
         check_s5.setText("Chemistry");
         check_s6.setText("Physics");
         } else if (stream.equals("Bio")) {
         check_s4.setText("Biology");
         check_s5.setText("Chemistry");
         check_s6.setText("Physics");
         } else if (stream.equals("Commerce")) {
         check_s4.setText("Economics");
         check_s5.setText("Business St");
         check_s6.setText("Accounting");
         }
         *
         */
        switch (stream) {
            case "Maths":
                //--------setting check box names when stream is selected
                check_s4.setText("Mathematics");
                check_s5.setText("Chemistry");
                check_s6.setText("Physics");
                break;
            case "Bio":
                check_s4.setText("Biology");
                check_s5.setText("Chemistry");
                check_s6.setText("Physics");
                break;
            case "Commerce":
                check_s4.setText("Economics");
                check_s5.setText("Business St");
                check_s6.setText("Accounting");
                break;
        }

    }//GEN-LAST:event_stream_listMouseClicked

    private void stream_listKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stream_listKeyPressed
        if (evt.getKeyCode() == 10) {

            String stream;//-----------setting the stream from the selection list
            if (stream_list.getSelectedIndex() == 0) {
                stream = "";
            } else {
                stream = stream_list.getSelectedItem().toString();
            }
            //----------------------------------------------------------------------------
            /*
             * if (stream.equals("Maths")) {//--------setting check box names when stream is selected
             check_s4.setText("Mathematics");
             check_s5.setText("Chemistry");
             check_s6.setText("Physics");
             } else if (stream.equals("Bio")) {
             check_s4.setText("Biology");
             check_s5.setText("Chemistry");
             check_s6.setText("Physics");
             } else if (stream.equals("Commerce")) {
             check_s4.setText("Economics");
             check_s5.setText("Business St");
             check_s6.setText("Accounting");
             }
             *
             */
            switch (stream) {
                case "Maths":
                    //--------setting check box names when stream is selected
                    check_s4.setText("Mathematics");
                    check_s5.setText("Chemistry");
                    check_s6.setText("Physics");
                    break;
                case "Bio":
                    check_s4.setText("Biology");
                    check_s5.setText("Chemistry");
                    check_s6.setText("Physics");
                    break;
                case "Commerce":
                    check_s4.setText("Economics");
                    check_s5.setText("Business St");
                    check_s6.setText("Accounting");
                    break;
            }

        }
    }//GEN-LAST:event_stream_listKeyPressed

    private void t_snoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_snoKeyPressed
        ResultSet rs = null;
        if (evt.getKeyCode() == 10) {
            try {

                if ((rs = cdb.getdata("select * from students2 where stu_no='" + t_sno.getText() + "'")) == null) {
                    t_sname.grabFocus();
                } else {
                    while (rs.next()) {
                        t_snic.setText(rs.getString("nic"));
                        t_sname.setText(rs.getString("name"));
                        t_smob.setText(rs.getString("mobile"));
                        t_guar_cont.setText(rs.getString("landline"));
                        t_parent.setText(rs.getString("guardian_name"));
                        t_saddr.setText(rs.getString("address"));
                        t_ssch.setText(rs.getString("school"));
                        stream_list.setSelectedItem(rs.getString("stream"));

                        if (!rs.getString("subj1").isEmpty()) {
                            check_s4.setText(rs.getString("subj1"));
                            check_s4.setSelected(true);
                        }
                        if (!rs.getString("subj2").isEmpty()) {
                            check_s5.setText(rs.getString("subj2"));
                            check_s5.setSelected(true);
                        }
                        if (!rs.getString("subj3").isEmpty()) {
                            check_s6.setText(rs.getString("subj3"));
                            check_s6.setSelected(true);
                        }
                    }
                }
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
    }//GEN-LAST:event_t_snoKeyPressed

    private void bup_stuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bup_stuActionPerformed
        String subj1 = "";
        String subj2 = "";
        String subj3 = "";

        if (check_s4.isSelected()) {
            subj1 = check_s4.getText();
        }
        if (check_s5.isSelected()) {
            subj2 = check_s5.getText();
        }
        if (check_s6.isSelected()) {
            subj3 = check_s6.getText();
        }


        String stream;//-----------setting the stream from the selection list

        if (stream_list.getSelectedIndex() == 0) {
            stream = "";
        } else {
            stream = stream_list.getSelectedItem().toString();
        }
        //----------------------------------------------------------------------------

        try {
            if (t_sno.getText().equals("")) {
                JOptionPane.showMessageDialog(layer_student, "Required Field Cannot be left blank !!");
                t_sno.grabFocus();
                t_sno.setBackground(Color.pink);
            } else if (t_sname.getText().equals("")) {
                JOptionPane.showMessageDialog(layer_student, "Required Field Cannot be left blank !!");
                t_sname.grabFocus();
                t_sname.setBackground(Color.pink);
            } else if (t_saddr.getText().equals("")) {
                JOptionPane.showMessageDialog(layer_student, "Required Field Cannot be left blank !!");
                t_saddr.grabFocus();
                t_saddr.setBackground(Color.pink);
            } else if (t_snic.getText().equals("")) {
                JOptionPane.showMessageDialog(layer_student, "Required Field Cannot be left blank !!");
                t_snic.grabFocus();
                t_snic.setBackground(Color.pink);
            } else {
                cdb.putdata("update students2 set  "
                        + " nic='" + t_snic.getText() + "',name='" + t_sname.getText() + "',"
                        + " address='" + t_saddr.getText() + "',mobile='" + t_smob.getText() + "',"
                        + " school='" + t_ssch.getText() + "',"
                        + " guardian_name='" + t_parent.getText() + "',landline='" + t_guar_cont.getText() + "',"
                        + " stream='" + stream + "',subj1='" + subj1 + "',subj2='" + subj2 + "',"
                        + " subj3='" + subj3 + "' "
                        + " where stu_no='" + t_sno.getText() + "'");

                JOptionPane.showMessageDialog(null, "Student Details Successfully Updated");
            }
            clean();

        } catch (Exception e) {
            System.out.println("Error in updating");
            System.out.println(e);
        }
    }//GEN-LAST:event_bup_stuActionPerformed

    private void blist_stuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blist_stuActionPerformed
        london.All_data all = new All_data();
        /*
         *          newHome h = new newHome();
         *          h.setState(newHome.ICONIFIED);
         *
         * to access the currently running object of newHome() class and iconify it
         * look at HeapTracker and JVMTI here:
         * http://hg.openjdk.java.net/jdk7/jdk7/jdk/file/9b8c96f96a0f/src/share/demo/jvmti/heapTracker/
         * --------------and----------------
         * https://blogs.oracle.com/kto/entry/a_short_java_crw_demo
         * AND LOOK AT THIS FOR SOURCES:
         * \Administrator\Downloads\includes__JVMTI__hg.openjdk.java.net_jdk7_jdk7_jdk_file_jdk-9b8c96f96a0f.tar.bz2
         *
         */
        all.setVisible(true);
    }//GEN-LAST:event_blist_stuActionPerformed

    private void stream_listItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_stream_listItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            String stream;//-----------setting the stream from the selection list
            if (stream_list.getSelectedIndex() == 0) {
                stream = "";
            } else {
                stream = stream_list.getSelectedItem().toString();
            }
            //----------------------------------------------------------------------------
            if (stream.equals("Maths")) {//--------setting check box names when stream is selected
                check_s4.setText("Mathematics");
                check_s5.setText("Chemistry");
                check_s6.setText("Physics");
            } else if (stream.equals("Bio")) {
                check_s4.setText("Biology");
                check_s5.setText("Chemistry");
                check_s6.setText("Physics");
            } else if (stream.equals("Commerce")) {
                check_s4.setText("Economics");
                check_s5.setText("Business St");
                check_s6.setText("Accounting");
            }
        }
    }//GEN-LAST:event_stream_listItemStateChanged

    private void t_snicKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_snicKeyPressed
        if (evt.getKeyCode() == 8 | evt.getKeyCode() == 127 | evt.getKeyCode() == 37 | evt.getKeyCode() == 39
                | evt.getKeyCode() == 144) {
            t_snic.setEditable(true);
        } else if (evt.getKeyCode() >= 48 && evt.getKeyCode() <= 57) {
            t_snic.setEditable(true);
        } else if (evt.getKeyCode() >= 96 && evt.getKeyCode() <= 105) {
            t_snic.setEditable(true);
        } else if (evt.getKeyCode() == 10) {
            bcreate_stu.grabFocus();
        } else {
            t_snic.setEditable(false);
            JOptionPane.showMessageDialog(null, "There are only numerical National ID values yet", "Error", 2);
            t_snic.setText("");
            t_snic.grabFocus();

        }
        if (t_snic.getText().length() <= 8) {
            t_snic.setEditable(true);
        } else if (evt.getKeyCode() == 8 | evt.getKeyCode() == 127 | evt.getKeyCode() == 37 | evt.getKeyCode() == 39
                | evt.getKeyCode() == 144) {
            t_snic.setEditable(true);
        } else {
            t_snic.setEditable(false);
        }
    }//GEN-LAST:event_t_snicKeyPressed

    private void t_smobKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_smobKeyPressed
        if (evt.getKeyCode() == 8 | evt.getKeyCode() == 127 | evt.getKeyCode() >= 48 && evt.getKeyCode() <= 57
                | evt.getKeyCode() == 37
                | evt.getKeyCode() == 39 | evt.getKeyCode() == 144
                | evt.getKeyCode() >= 96 && evt.getKeyCode() <= 105) {
            t_smob.setEditable(true);
        } else if (evt.getKeyCode() == 10) {
            t_smob.setEditable(true);
        } else {
            t_smob.setEditable(false);
            JOptionPane.showMessageDialog(null, "Enter only the numeric values of the mobile number excluding DASH(-)", "Error", 2);
            t_smob.setText("");
            t_smob.grabFocus();
        }
    }//GEN-LAST:event_t_smobKeyPressed

    private void t_guar_contKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_guar_contKeyPressed
        if (evt.getKeyCode() == 8 | evt.getKeyCode() == 127 | evt.getKeyCode() >= 46 && evt.getKeyCode() <= 57) {
            t_guar_cont.setEditable(true);
        } else if (evt.getKeyCode() == 10) {
            t_guar_cont.setEditable(true);
        } else {
            t_guar_cont.setEditable(false);
            JOptionPane.showMessageDialog(null, "Enter only the numeric values of the mobile number excluding DASH(-)", "Error", 2);
            t_guar_cont.setText("");
            t_guar_cont.grabFocus();
        }
    }//GEN-LAST:event_t_guar_contKeyPressed

    private void bresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bresetActionPerformed
        clean();
    }//GEN-LAST:event_bresetActionPerformed

    private void t_snicKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_snicKeyReleased
//        if (t_snic.getText().length() <= 9) {
//            t_snic.setEditable(true);
//        } else {
//            t_snic.setEditable(false);
//        }
    }//GEN-LAST:event_t_snicKeyReleased
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bcreate_stu;
    private javax.swing.JButton blist_stu;
    private javax.swing.JButton breset;
    private javax.swing.JButton bup_stu;
    private javax.swing.JCheckBox check_s4;
    private javax.swing.JCheckBox check_s5;
    private javax.swing.JCheckBox check_s6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLayeredPane layer_student;
    private javax.swing.JComboBox stream_list;
    private javax.swing.JTextField t_guar_cont;
    private javax.swing.JTextField t_parent;
    private javax.swing.JTextField t_saddr;
    private javax.swing.JTextField t_smob;
    private javax.swing.JTextField t_sname;
    private javax.swing.JTextField t_snic;
    private javax.swing.JTextField t_sno;
    private javax.swing.JTextField t_ssch;
    // End of variables declaration//GEN-END:variables

    void clean() {
        t_sno.setText("");
        t_sname.setText("");
        t_saddr.setText("");
        t_snic.setText("");
        t_smob.setText("");
        t_parent.setText("");
        t_ssch.setText("");
        t_guar_cont.setText("");
        stream_list.setSelectedIndex(0);
        check_s4.setText("subject 1");
        check_s5.setText("subject 2");
        check_s6.setText("subject 3");
        check_s4.setSelected(false);
        check_s5.setSelected(false);
        check_s6.setSelected(false);
    }
}
