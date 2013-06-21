/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package london;

import london.rescumanager.RescueManager;
import Connection.jdbc;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class All_data extends javax.swing.JFrame {

    newHome h;

    public All_data() {
        initComponents();
        loadStudents();
        loadTeachers();
        loadComps();
        table_comps.setSelectionBackground(Color.lightGray);
        table_comps.setSelectionForeground(Color.white);
        table_stu.setSelectionBackground(Color.lightGray);
        table_stu.setSelectionForeground(Color.white);
        table_tea1.setSelectionBackground(Color.lightGray);
        table_tea1.setSelectionForeground(Color.white);
        // this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
    }

    public void selectRecords() {
        jTabbedPane1.setSelectedIndex(1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        bhome = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_stu = new javax.swing.JTable();
        brefresh_tab1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        bprint1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tname = new javax.swing.JTextField();
        taddress = new javax.swing.JTextField();
        tmobile = new javax.swing.JTextField();
        tschool = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        stream_list = new javax.swing.JComboBox();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_tea1 = new javax.swing.JTable();
        brefresh_tab3 = new javax.swing.JButton();
        bprint2 = new javax.swing.JButton();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_comps = new javax.swing.JTable();
        brefresh_tab2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        combo_batch = new javax.swing.JComboBox();
        combo_teacher = new javax.swing.JComboBox();
        combo_month = new javax.swing.JComboBox();
        bprint = new javax.swing.JButton();
        bbackup = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Display Student & Teacher Information");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/go-home.png"))); // NOI18N
        bhome.setText("Home");
        bhome.setBorderPainted(false);
        bhome.setContentAreaFilled(false);
        bhome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bhome.setIconTextGap(-8);
        bhome.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/go-home-hover.png"))); // NOI18N
        bhome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhomeActionPerformed(evt);
            }
        });
        bhome.setBounds(910, 0, 70, 50);
        jLayeredPane1.add(bhome, javax.swing.JLayeredPane.DEFAULT_LAYER);

        table_stu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student No", "Name", "Address", "Mobile No", "Stream", "Guardian Name", "LandPhone No", "School", "NIC"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_stu.getTableHeader().setReorderingAllowed(false);
        table_stu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                table_stuKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(table_stu);

        jScrollPane2.setBounds(10, 40, 990, 250);
        jLayeredPane2.add(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        brefresh_tab1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/view-refresh_1.png"))); // NOI18N
        brefresh_tab1.setText("  Refresh Table");
        brefresh_tab1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brefresh_tab1ActionPerformed(evt);
            }
        });
        brefresh_tab1.setBounds(20, 310, 210, 40);
        jLayeredPane2.add(brefresh_tab1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 204));
        jLabel5.setText("Students");
        jLabel5.setBounds(420, 0, 170, 40);
        jLayeredPane2.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bprint1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bprint1.setText("Print Current Datasheet");
        bprint1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bprint1ActionPerformed(evt);
            }
        });
        bprint1.setBounds(20, 360, 210, 40);
        jLayeredPane2.add(bprint1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filter Results Matching", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.black));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Name");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel4.setText("Address");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel6.setText("Mobile No");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel7.setText("School");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        tname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tnameFocusGained(evt);
            }
        });
        tname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tnameKeyTyped(evt);
            }
        });
        jPanel2.add(tname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 286, -1));

        taddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                taddressFocusGained(evt);
            }
        });
        taddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                taddressKeyTyped(evt);
            }
        });
        jPanel2.add(taddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 286, -1));

        tmobile.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tmobileFocusGained(evt);
            }
        });
        tmobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tmobileKeyTyped(evt);
            }
        });
        jPanel2.add(tmobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 83, 286, -1));

        tschool.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tschoolFocusGained(evt);
            }
        });
        tschool.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tschoolKeyTyped(evt);
            }
        });
        jPanel2.add(tschool, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 117, 286, -1));

        jLabel22.setText("Study Stream");
        jLabel22.setMaximumSize(new java.awt.Dimension(100, 19));
        jLabel22.setMinimumSize(new java.awt.Dimension(100, 19));
        jLabel22.setPreferredSize(new java.awt.Dimension(100, 19));
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 82, -1));

        stream_list.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Maths", "Bio", "Commerce" }));
        stream_list.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                stream_listItemStateChanged(evt);
            }
        });
        jPanel2.add(stream_list, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 122, -1));

        jPanel2.setBounds(540, 300, 460, 190);
        jLayeredPane2.add(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane1.addTab("General Data-Students", jLayeredPane2);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Teachers");
        jLabel3.setBounds(430, 0, 190, 40);
        jLayeredPane4.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        table_tea1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Stream", "Name", "Address", "Mobile", "NIC", "Vehicle No"
            }
        ));
        jScrollPane4.setViewportView(table_tea1);

        jScrollPane4.setBounds(10, 40, 980, 240);
        jLayeredPane4.add(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        brefresh_tab3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/view-refresh_1.png"))); // NOI18N
        brefresh_tab3.setText("  Refresh Table");
        brefresh_tab3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brefresh_tab3ActionPerformed(evt);
            }
        });
        brefresh_tab3.setBounds(270, 300, 210, 40);
        jLayeredPane4.add(brefresh_tab3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bprint2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bprint2.setText("Print Datasheet");
        bprint2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bprint2ActionPerformed(evt);
            }
        });
        bprint2.setBounds(490, 300, 210, 40);
        jLayeredPane4.add(bprint2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane1.addTab("General Data-Teachers", jLayeredPane4);

        table_comps.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Batch", "Total From Class", "Institute %", "Institute Value", "Teacher's Share", "Date Paid"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_comps.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(table_comps);

        jScrollPane3.setBounds(10, 40, 990, 250);
        jLayeredPane3.add(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        brefresh_tab2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/view-refresh_1.png"))); // NOI18N
        brefresh_tab2.setText("  Refresh Table");
        brefresh_tab2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brefresh_tab2ActionPerformed(evt);
            }
        });
        brefresh_tab2.setBounds(10, 310, 190, 40);
        jLayeredPane3.add(brefresh_tab2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Teacher Shares Paid");
        jLabel2.setBounds(390, 0, 230, 40);
        jLayeredPane3.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filter Results By", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.black));
        jPanel1.setOpaque(false);

        combo_batch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Batch", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));
        combo_batch.setOpaque(false);
        combo_batch.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_batchItemStateChanged(evt);
            }
        });

        combo_teacher.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Tutor" }));
        combo_teacher.setOpaque(false);
        combo_teacher.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_teacherItemStateChanged(evt);
            }
        });

        combo_month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        combo_month.setOpaque(false);
        combo_month.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_monthItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combo_month, 0, 274, Short.MAX_VALUE)
                    .addComponent(combo_teacher, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combo_batch, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(combo_month, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(combo_batch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(combo_teacher, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1.setBounds(640, 300, 320, 170);
        jLayeredPane3.add(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bprint.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bprint.setText("Print Current Datasheet");
        bprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bprintActionPerformed(evt);
            }
        });
        bprint.setBounds(10, 360, 190, 40);
        jLayeredPane3.add(bprint, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane1.addTab("Teacher Shares", jLayeredPane3);

        jTabbedPane1.setBounds(0, 33, 1020, 530);
        jLayeredPane1.add(jTabbedPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bbackup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/Database.png"))); // NOI18N
        bbackup.setText("Backup");
        bbackup.setBorderPainted(false);
        bbackup.setContentAreaFilled(false);
        bbackup.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bbackup.setIconTextGap(-1);
        bbackup.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bbackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbackupActionPerformed(evt);
            }
        });
        bbackup.setBounds(840, 10, 70, 40);
        jLayeredPane1.add(bbackup, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel33.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/alldata.png"))); // NOI18N
        jLabel33.setEnabled(false);
        jLabel33.setBounds(0, 0, 1030, 560);
        jLayeredPane1.add(jLabel33, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1018, 561));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1023)/2, (screenSize.height-583)/2, 1023, 583);
    }// </editor-fold>//GEN-END:initComponents

    private void table_stuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_table_stuKeyPressed
        System.out.println(evt.getKeyCode());
    }//GEN-LAST:event_table_stuKeyPressed

    private void loadStudents() {
        ResultSet rs1 = null;
        try {
            //table_stu.removeAll();
            DefaultTableModel dtm1 = (DefaultTableModel) table_stu.getModel();
            while (dtm1.getRowCount() > 0) {
                dtm1.removeRow(0);
            }
            System.out.println("student list resyncing");
            rs1 = jdbc.con().createStatement().executeQuery("select * from students2");
            while (rs1.next()) {
                Vector v = new Vector();
                v.add(rs1.getString("stu_no"));
                v.add(rs1.getString("name"));
                v.add(rs1.getString("address"));
                v.add(rs1.getString("mobile"));
                v.add(rs1.getString("stream"));
                v.add(rs1.getString("guardian_name"));
                v.add(rs1.getString("landline"));
                v.add(rs1.getString("school"));
                v.add(rs1.getString("nic"));

                dtm1.addRow(v);
            }
            System.out.println("sync complete");

        } catch (Exception e) {
            System.out.println("student table retrieval error");
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

    private void loadTeachers() {
        ResultSet rs2 = null;
        DefaultTableModel dtm2 = (DefaultTableModel) table_tea1.getModel();
        while (dtm2.getRowCount() > 0) {
            dtm2.removeRow(0);
        }
        System.out.println("teacher list resyncing");
        try {
            rs2 = jdbc.con().createStatement().executeQuery("select * from tutor");
            while (rs2.next()) {
                Vector v = new Vector();
                v.add(rs2.getString("tutor_no"));
                v.add(rs2.getString("subject"));
                v.add(rs2.getString("name"));
                v.add(rs2.getString("address"));
                v.add(rs2.getString("mobile"));
                v.add(rs2.getString("nic"));
                v.add(rs2.getString("vehicle"));
                dtm2.addRow(v);
            }
            System.out.println("sync complete");

        } catch (Exception e) {
            System.out.println("teacher table retrieval error");
            System.out.println(e);
        } finally {
            try {
                if (rs2 != null) {
                    rs2.close();
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }

    private void loadComps() {
        ResultSet rs2 = null;
        DefaultTableModel dtm3 = (DefaultTableModel) table_comps.getModel();
        while (dtm3.getRowCount() > 0) {
//                for (int i = 0; i < dtm2.getRowCount(); i++) {
//                    dtm2.removeRow(i);
//                }
            dtm3.removeRow(0);
        }
        System.out.println("income shares resyncing");
        try {
            rs2 = jdbc.con().createStatement().executeQuery("select * from compensation");
            while (rs2.next()) {
                Vector v = new Vector();
                v.add(rs2.getString("name"));
                v.add(rs2.getString("batch"));
                v.add(rs2.getString("income"));
                v.add(rs2.getString("percentage"));
                v.add(rs2.getString("percentage_value"));
                v.add(rs2.getString("for_teacher"));
                v.add(rs2.getString("date"));
                dtm3.addRow(v);
            }
            System.out.println("sync complete");

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                if (rs2 != null) {
                    rs2.close();
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }

    private void brefresh_tab1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brefresh_tab1ActionPerformed
        loadStudents();
        tname.setText("");
        taddress.setText("");
        tmobile.setText("");
        tschool.setText("");
        stream_list.setSelectedIndex(0);
    }//GEN-LAST:event_brefresh_tab1ActionPerformed

    private void brefresh_tab2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brefresh_tab2ActionPerformed
        combo_batch.setSelectedIndex(0);
        combo_teacher.setSelectedIndex(0);
        combo_month.setSelectedIndex(0);
        loadComps();
    }//GEN-LAST:event_brefresh_tab2ActionPerformed

    private void bhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhomeActionPerformed
        this.dispose();
//        if (h.getState() == newHome.ICONIFIED) {
//            h.setState(newHome.NORMAL);
//        } else {
//            h.setVisible(true);
//        }

    }//GEN-LAST:event_bhomeActionPerformed

    private void bbackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbackupActionPerformed
        h = new newHome();
        h.dispose();
        h = null;
        this.dispose();
        System.gc();
        new RescueManager().setVisible(true);
    }//GEN-LAST:event_bbackupActionPerformed

    private void combo_monthItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_monthItemStateChanged
        ResultSet rs2 = null;
        if (combo_month.getSelectedIndex() == 0
                && combo_batch.getSelectedIndex() == 0
                && combo_teacher.getSelectedIndex() == 0) {
            loadComps();
        } else if (combo_month.getSelectedIndex() != 0) {

            DefaultTableModel dtm3 = (DefaultTableModel) table_comps.getModel();
            while (dtm3.getRowCount() > 0) {
                dtm3.removeRow(0);
            }
            System.out.println("income shares resyncing");
            try {
                rs2 = jdbc.con().createStatement().executeQuery("select * from compensation"
                        + " where month='" + combo_month.getSelectedItem().toString() + "'");
                while (rs2.next()) {
                    Vector v = new Vector();
                    v.add(rs2.getString("name"));
                    v.add(rs2.getString("batch"));
                    v.add(rs2.getString("income"));
                    v.add(rs2.getString("percentage"));
                    v.add(rs2.getString("percentage_value"));
                    v.add(rs2.getString("for_teacher"));
                    v.add(rs2.getString("date"));
                    dtm3.addRow(v);
                }
                System.out.println("sync complete");

            } catch (Exception e) {
                System.out.println(e);
            } finally {
                try {
                    if (rs2 != null) {
                        rs2.close();
                    }
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
        }
    }//GEN-LAST:event_combo_monthItemStateChanged

    private void combo_batchItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_batchItemStateChanged
        ResultSet rs2 = null;
        if (combo_month.getSelectedIndex() == 0
                && combo_batch.getSelectedIndex() == 0
                && combo_teacher.getSelectedIndex() == 0) {
            loadComps();
        } else if (combo_batch.getSelectedIndex() != 0) {

            DefaultTableModel dtm3 = (DefaultTableModel) table_comps.getModel();
            while (dtm3.getRowCount() > 0) {
                dtm3.removeRow(0);
            }
            System.out.println("income shares resyncing");
            try {
                rs2 = jdbc.con().createStatement().executeQuery("select * from compensation"
                        + " where batch='" + combo_batch.getSelectedItem().toString() + "'");
                while (rs2.next()) {
                    Vector v = new Vector();
                    v.add(rs2.getString("name"));
                    v.add(rs2.getString("batch"));
                    v.add(rs2.getString("income"));
                    v.add(rs2.getString("percentage"));
                    v.add(rs2.getString("percentage_value"));
                    v.add(rs2.getString("for_teacher"));
                    v.add(rs2.getString("date"));
                    dtm3.addRow(v);
                }
                System.out.println("sync complete");

            } catch (Exception e) {
                System.out.println(e);
            } finally {
                try {
                    if (rs2 != null) {
                        rs2.close();
                    }
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
        }
    }//GEN-LAST:event_combo_batchItemStateChanged

    private void combo_teacherItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_teacherItemStateChanged
        ResultSet rs2 = null;
        if (combo_month.getSelectedIndex() == 0
                && combo_batch.getSelectedIndex() == 0
                && combo_teacher.getSelectedIndex() == 0) {
            loadComps();
        } else if (combo_teacher.getSelectedIndex() != 0) {

            DefaultTableModel dtm3 = (DefaultTableModel) table_comps.getModel();
            while (dtm3.getRowCount() > 0) {
                dtm3.removeRow(0);
            }
            System.out.println("income shares resyncing");
            try {
                rs2 = jdbc.con().createStatement().executeQuery("select * from compensation"
                        + " where name='" + combo_teacher.getSelectedItem().toString() + "'");
                while (rs2.next()) {
                    Vector v = new Vector();
                    v.add(rs2.getString("name"));
                    v.add(rs2.getString("batch"));
                    v.add(rs2.getString("income"));
                    v.add(rs2.getString("percentage"));
                    v.add(rs2.getString("percentage_value"));
                    v.add(rs2.getString("for_teacher"));
                    v.add(rs2.getString("date"));
                    dtm3.addRow(v);
                }
                System.out.println("sync complete");

            } catch (Exception e) {
                System.out.println(e);
            } finally {
                try {
                    if (rs2 != null) {
                        rs2.close();
                    }
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
        }
    }//GEN-LAST:event_combo_teacherItemStateChanged

    private void bprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bprintActionPerformed
        MessageFormat header = new MessageFormat("Records Printing.");
        MessageFormat footer = new MessageFormat("--Air Solutions--" + new Date().toString());
        try {
            table_comps.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (Exception e) {
            System.err.format("Cannot Print %s%n", e.getMessage());
        }
        JOptionPane.showMessageDialog(null, "<html>Remember, You Can only Print the Sheet with your Printer!<br> "
                + "<font color=red><b>Do not Use other File Formats like .pdf .ps or .xps</b></font></html>",
                "Remember", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_bprintActionPerformed

    private void bprint1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bprint1ActionPerformed
        MessageFormat header = new MessageFormat("Records Printing.");
        MessageFormat footer = new MessageFormat("--Air Solutions--" + new Date().toString());
        try {
            table_stu.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (Exception e) {
            System.err.format("Cannot Print %s%n", e.getMessage());
        }
        JOptionPane.showMessageDialog(null, "<html>Remember, You Can only Print the Sheet with your Printer!<br> "
                + "<font color=red><b>Do not Use other File Formats like .pdf .ps or .xps</b></font></html>",
                "Remember!", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_bprint1ActionPerformed

    private void brefresh_tab3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brefresh_tab3ActionPerformed
        // loadStudents();
        loadTeachers();
        //   loadComps();
    }//GEN-LAST:event_brefresh_tab3ActionPerformed

    private void bprint2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bprint2ActionPerformed
        MessageFormat header = new MessageFormat("Records Printing.");
        MessageFormat footer = new MessageFormat("--Air Solutions--");
        try {
            table_tea1.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (Exception e) {
            System.err.format("Cannot Print %s%n", e.getMessage());
        }
        JOptionPane.showMessageDialog(null, "<html>Remember, You Can only Print the Sheet with your Printer!<br> "
                + "<font color=red><b>Do not Use other File Formats like .pdf .ps or .xps</b></font></html>",
                "Remember", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_bprint2ActionPerformed

    private void tnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tnameKeyTyped
        ResultSet rs1 = null;
        if (!"".equals(tname.getText())) {

            DefaultTableModel dtm1 = (DefaultTableModel) table_stu.getModel();
            while (dtm1.getRowCount() > 0) {
                dtm1.removeRow(0);
            }
            System.out.println("student list resyncing");
            try {
                rs1 = jdbc.con().createStatement().executeQuery("select * from students2 where "
                        + "name like '%" + tname.getText() + "%'");
                while (rs1.next()) {
                    Vector v = new Vector();
                    v.add(rs1.getString("stu_no"));
                    v.add(rs1.getString("name"));
                    v.add(rs1.getString("address"));
                    v.add(rs1.getString("mobile"));
                    v.add(rs1.getString("stream"));
                    v.add(rs1.getString("guardian_name"));
                    v.add(rs1.getString("landline"));
                    v.add(rs1.getString("school"));
                    v.add(rs1.getString("nic"));

                    dtm1.addRow(v);
                }
                System.out.println("sync complete");

            } catch (Exception e) {
                System.out.println("student table retrieval error");
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
    }//GEN-LAST:event_tnameKeyTyped

    private void tnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tnameFocusGained
        tname.setText("");
        taddress.setText("");
        tmobile.setText("");
        tschool.setText("");
        tname.grabFocus();
    }//GEN-LAST:event_tnameFocusGained

    private void taddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_taddressFocusGained
        tname.setText("");
        taddress.setText("");
        tmobile.setText("");
        tschool.setText("");
        taddress.grabFocus();
    }//GEN-LAST:event_taddressFocusGained

    private void tmobileFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tmobileFocusGained
        tname.setText("");
        taddress.setText("");
        tmobile.setText("");
        tschool.setText("");
        tmobile.grabFocus();
    }//GEN-LAST:event_tmobileFocusGained

    private void tschoolFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tschoolFocusGained
        tname.setText("");
        taddress.setText("");
        tmobile.setText("");
        tschool.setText("");
        tschool.grabFocus();
    }//GEN-LAST:event_tschoolFocusGained

    private void taddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_taddressKeyTyped
        ResultSet rs1 = null;
        if (!"".equals(taddress.getText())) {

            DefaultTableModel dtm1 = (DefaultTableModel) table_stu.getModel();
            while (dtm1.getRowCount() > 0) {
                dtm1.removeRow(0);
            }
            System.out.println("student list resyncing");
            try {
                rs1 = jdbc.con().createStatement().executeQuery("select * from students2 "
                        + "where address like '%" + taddress.getText() + "%'");
                while (rs1.next()) {
                    Vector v = new Vector();
                    v.add(rs1.getString("stu_no"));
                    v.add(rs1.getString("name"));
                    v.add(rs1.getString("address"));
                    v.add(rs1.getString("mobile"));
                    v.add(rs1.getString("stream"));
                    v.add(rs1.getString("guardian_name"));
                    v.add(rs1.getString("landline"));
                    v.add(rs1.getString("school"));
                    v.add(rs1.getString("nic"));

                    dtm1.addRow(v);
                }
                System.out.println("sync complete");

            } catch (Exception e) {
                System.out.println("student table retrieval error");
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
    }//GEN-LAST:event_taddressKeyTyped

    private void tmobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tmobileKeyTyped
        ResultSet rs1 = null;
        if (!"".equals(tmobile.getText())) {

            DefaultTableModel dtm1 = (DefaultTableModel) table_stu.getModel();
            while (dtm1.getRowCount() > 0) {
                dtm1.removeRow(0);
            }
            System.out.println("student list resyncing");
            try {
                rs1 = jdbc.con().createStatement().executeQuery("select * from students2 where "
                        + "mobile like '%" + tmobile.getText() + "%'");
                while (rs1.next()) {
                    Vector v = new Vector();
                    v.add(rs1.getString("stu_no"));
                    v.add(rs1.getString("name"));
                    v.add(rs1.getString("address"));
                    v.add(rs1.getString("mobile"));
                    v.add(rs1.getString("stream"));
                    v.add(rs1.getString("guardian_name"));
                    v.add(rs1.getString("landline"));
                    v.add(rs1.getString("school"));
                    v.add(rs1.getString("nic"));

                    dtm1.addRow(v);
                }
                System.out.println("sync complete");

            } catch (Exception e) {
                System.out.println("student table retrieval error");
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
    }//GEN-LAST:event_tmobileKeyTyped

    private void tschoolKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tschoolKeyTyped
        ResultSet rs1 = null;
        if (!"".equals(tschool.getText())) {

            DefaultTableModel dtm1 = (DefaultTableModel) table_stu.getModel();
            while (dtm1.getRowCount() > 0) {
                dtm1.removeRow(0);
            }
            System.out.println("student list resyncing");
            try {
                rs1 = jdbc.con().createStatement().executeQuery("select * from students2 where "
                        + "school like '%" + tschool.getText() + "%'");
                while (rs1.next()) {
                    Vector v = new Vector();
                    v.add(rs1.getString("stu_no"));
                    v.add(rs1.getString("name"));
                    v.add(rs1.getString("address"));
                    v.add(rs1.getString("mobile"));
                    v.add(rs1.getString("stream"));
                    v.add(rs1.getString("guardian_name"));
                    v.add(rs1.getString("landline"));
                    v.add(rs1.getString("school"));
                    v.add(rs1.getString("nic"));

                    dtm1.addRow(v);
                }
                System.out.println("sync complete");

            } catch (Exception e) {
                System.out.println("student table retrieval error");
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
    }//GEN-LAST:event_tschoolKeyTyped

    private void stream_listItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_stream_listItemStateChanged
        ResultSet rs1 = null;
        if (stream_list.getSelectedIndex() == 0) {
            loadStudents();
        } else if (stream_list.getSelectedIndex() != 0) {

            DefaultTableModel dtm1 = (DefaultTableModel) table_stu.getModel();
            while (dtm1.getRowCount() > 0) {
                dtm1.removeRow(0);
            }
            System.out.println("student list resyncing");
            try {
                rs1 = jdbc.con().createStatement().executeQuery("select * from students2 where "
                        + "stream='" + stream_list.getSelectedItem().toString() + "'");
                while (rs1.next()) {
                    Vector v = new Vector();
                    v.add(rs1.getString("stu_no"));
                    v.add(rs1.getString("name"));
                    v.add(rs1.getString("address"));
                    v.add(rs1.getString("mobile"));
                    v.add(rs1.getString("stream"));
                    v.add(rs1.getString("guardian_name"));
                    v.add(rs1.getString("landline"));
                    v.add(rs1.getString("school"));
                    v.add(rs1.getString("nic"));

                    dtm1.addRow(v);
                }
                System.out.println("sync complete");

            } catch (Exception e) {
                System.out.println("student table retrieval error");
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
    }//GEN-LAST:event_stream_listItemStateChanged

    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(All_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(All_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(All_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(All_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new All_data().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbackup;
    private javax.swing.JButton bhome;
    private javax.swing.JButton bprint;
    private javax.swing.JButton bprint1;
    private javax.swing.JButton bprint2;
    private javax.swing.JButton brefresh_tab1;
    private javax.swing.JButton brefresh_tab2;
    private javax.swing.JButton brefresh_tab3;
    private javax.swing.JComboBox combo_batch;
    private javax.swing.JComboBox combo_month;
    private javax.swing.JComboBox combo_teacher;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox stream_list;
    private javax.swing.JTable table_comps;
    private javax.swing.JTable table_stu;
    private javax.swing.JTable table_tea1;
    private javax.swing.JTextField taddress;
    private javax.swing.JTextField tmobile;
    private javax.swing.JTextField tname;
    private javax.swing.JTextField tschool;
    // End of variables declaration//GEN-END:variables
}
