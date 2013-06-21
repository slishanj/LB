package in_frames;

import Connection.jdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joshua
 */
public class In_classes_times extends javax.swing.JInternalFrame {

    public In_classes_times() {
        initComponents();
        loadTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane2 = new javax.swing.JLayeredPane();
        tab1 = new javax.swing.JTabbedPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        badd = new javax.swing.JButton();
        bremove = new javax.swing.JButton();
        combo_batch = new javax.swing.JComboBox();
        combo_from = new javax.swing.JComboBox();
        combo_to = new javax.swing.JComboBox();
        combo_subject = new javax.swing.JComboBox();
        combo_teacher = new javax.swing.JComboBox();
        combo_day = new javax.swing.JComboBox();
        jLabel33 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Class Details");
        setFrameIcon(null);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Class Subject", "A/L Year", "Day(s)", "Conducted By", "Time From", "To"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);
        jTable2.getColumnModel().getColumn(1).setMinWidth(10);

        jScrollPane2.setBounds(0, 0, 690, 300);
        jLayeredPane1.add(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("to");
        jLabel1.setBounds(790, 190, 50, 30);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        badd.setText("add schedule");
        badd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baddActionPerformed(evt);
            }
        });
        badd.setBounds(700, 230, 110, 60);
        jLayeredPane1.add(badd, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bremove.setText("erase schedule");
        bremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bremoveActionPerformed(evt);
            }
        });
        bremove.setBounds(820, 230, 117, 60);
        jLayeredPane1.add(bremove, javax.swing.JLayeredPane.DEFAULT_LAYER);

        combo_batch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Batch", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));
        combo_batch.setBounds(730, 60, 180, 30);
        jLayeredPane1.add(combo_batch, javax.swing.JLayeredPane.DEFAULT_LAYER);

        combo_from.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "8.00", "8.30", "9.00", "9.30", "10.00", "10.30", "11.00", "11.30", "12.00", "12.30", "01.00", "01.30", "02.00", "02.30", "03.00", "03.30", "04.00", "04.30", "05.00" }));
        combo_from.setBounds(700, 190, 100, 30);
        jLayeredPane1.add(combo_from, javax.swing.JLayeredPane.DEFAULT_LAYER);

        combo_to.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "9.00", "9.30", "10.00", "10.30", "11.00", "11.30", "12.00", "12.30", "01.00", "01.30", "02.00", "02.30", "03.00", "03.30", "04.00", "04.30", "05.00", "05.30", "06.00", "06.30", "07.00", "07.30", "08.00" }));
        combo_to.setBounds(830, 190, 100, 30);
        jLayeredPane1.add(combo_to, javax.swing.JLayeredPane.DEFAULT_LAYER);

        combo_subject.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Subject", "Mathematics", "Biology", "Chemistry", "Physics", "Economics", "Business Studies", "Accounting", "ICT" }));
        combo_subject.setBounds(730, 20, 180, 30);
        jLayeredPane1.add(combo_subject, javax.swing.JLayeredPane.DEFAULT_LAYER);

        combo_teacher.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Tutor" }));
        combo_teacher.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                combo_teacherFocusGained(evt);
            }
        });
        combo_teacher.setBounds(730, 140, 180, 30);
        jLayeredPane1.add(combo_teacher, javax.swing.JLayeredPane.DEFAULT_LAYER);

        combo_day.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Day", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" }));
        combo_day.setBounds(730, 100, 180, 30);
        jLayeredPane1.add(combo_day, javax.swing.JLayeredPane.DEFAULT_LAYER);

        tab1.addTab("Classes & Schedules", jLayeredPane1);

        tab1.setBounds(10, 10, 950, 340);
        jLayeredPane2.add(tab1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel33.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/alldata.png"))); // NOI18N
        jLabel33.setEnabled(false);
        jLabel33.setBounds(0, 0, 1953, 1975);
        jLayeredPane2.add(jLabel33, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(java.awt.SystemColor.controlLtHighlight);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Schedule Classes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(495, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 965, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 335, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void baddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baddActionPerformed
        ResultSet rs0 = null;
        try {
            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();

            if (combo_subject.getSelectedIndex() == 0 | combo_day.getSelectedIndex() == 0
                    | combo_batch.getSelectedIndex() == 0 | combo_from.getSelectedIndex() == 0
                    | combo_to.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "You Cannot continue with empty fields", "Error", 2);

            } else {
//checking dupes-------------------------------------------------------------------------------------
                rs0 = jdbc.con().createStatement().executeQuery("select * from classes");
                if (rs0.first()) {

                    if (rs0.getString("subject").equals(combo_subject.getSelectedItem().toString())
                            && rs0.getString("year").equals(combo_batch.getSelectedItem().toString())
                            && rs0.getString("day").equals(combo_day.getSelectedItem().toString())
                            && rs0.getString("teacher").equals(combo_teacher.getSelectedItem().toString())
                            && rs0.getString("fr").equals(combo_from.getSelectedItem().toString())
                            && rs0.getString("onto").equals(combo_to.getSelectedItem().toString())) {

                        JOptionPane.showMessageDialog(null, "Duplicate Schedules cannot exist");
                        resetFields();
                    } else {
                        Vector v = new Vector();
                        v.add(combo_subject.getSelectedItem());
                        v.add(combo_batch.getSelectedItem());
                        v.add(combo_day.getSelectedItem());
                        v.add(combo_teacher.getSelectedItem());
                        v.add(combo_from.getSelectedItem());
                        v.add(combo_to.getSelectedItem());
                        dtm.addRow(v);
                        System.out.println("visual table updated");
                        jdbc.con().createStatement().executeUpdate("insert into classes"
                                + "(subject,year,day,teacher,fr,onto)"
                                + " values('" + combo_subject.getSelectedItem() + "',"
                                + " '" + combo_batch.getSelectedItem().toString() + "',"
                                + " '" + combo_day.getSelectedItem() + "','" + combo_teacher.getSelectedItem() + "',"
                                + " '" + combo_from.getSelectedItem().toString() + "',"
                                + " '" + combo_to.getSelectedItem().toString() + "') ");
                        System.out.println("SQL table updated");
                        resetFields();
                        for (int x = 0; x < dtm.getRowCount(); x++) {
                            dtm.removeRow(0);
                        }
                        loadTable();
                    }
                    //end checking dupes-------------------------------------------------------------
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            try {
                if (rs0 != null) {
                    rs0.close();
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }

    }//GEN-LAST:event_baddActionPerformed

    private void loadTeachers() {
        ResultSet rs1 = null;
        try {
            rs1 = jdbc.con().createStatement().executeQuery("select * from tutor");
            while (rs1.next()) {
                combo_teacher.addItem(rs1.getString("name"));
            }
            this.repaint();
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

    private void bremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bremoveActionPerformed
        ResultSet rs = null;
        DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
        int sr = jTable2.getSelectedRow();

        int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Are You Sure To Proceed?",
                "Confirm Removal", JOptionPane.OK_CANCEL_OPTION);
        if (showConfirmDialog == JOptionPane.OK_OPTION) {
            try {
                rs = jdbc.con().createStatement().executeQuery("select id from classes where "
                        + " subject='" + dtm.getValueAt(sr, 0) + "' AND year='" + dtm.getValueAt(sr, 1) + "' "
                        + " AND day='" + dtm.getValueAt(sr, 2) + "' AND teacher='" + dtm.getValueAt(sr, 3) + "' "
                        + " AND fr='" + dtm.getValueAt(sr, 4) + "' AND onto='" + dtm.getValueAt(sr, 5) + "'");
                if (rs.first()) {
                    jdbc.con().createStatement().executeUpdate("delete from classes where "
                            + "id='" + rs.getString("id") + "'");
                    System.out.println("SQL row deleted");
                }
            } catch (Exception ex) {
                System.out.println("error in deleting class schedule");
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
            dtm.removeRow(jTable2.getSelectedRow());
            System.out.println("Table row deleted");
        }
        //jTable2.removeAll();
        loadTable();
        resetFields();
    }//GEN-LAST:event_bremoveActionPerformed

    private void combo_teacherFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combo_teacherFocusGained
        combo_teacher.removeAllItems();
        loadTeachers();
    }//GEN-LAST:event_combo_teacherFocusGained

    void resetFields() {
        combo_day.setSelectedIndex(0);
        combo_subject.setSelectedIndex(0);
        combo_teacher.removeAllItems();
        combo_teacher.addItem("Select Tutor");
        combo_batch.setSelectedIndex(0);
        combo_from.setSelectedIndex(0);
        combo_to.setSelectedIndex(0);
    }

    private void loadTable() {
        ResultSet rs = null;
        DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
        while (dtm.getRowCount() > 0) {
            dtm.removeRow(0);
        }
        try {
            rs = jdbc.con().createStatement().executeQuery("select * from classes");
            while (rs.next()) {
//                String from = rs.getString("fr");
//                String to = rs.getString("onto");

                Vector v = new Vector();
                v.add(rs.getString("subject"));
                v.add(rs.getString("year"));
                v.add(rs.getString("day"));
                v.add(rs.getString("teacher"));
                v.add(rs.getString("fr"));
                v.add(rs.getString("onto"));

                dtm.addRow(v);
            }

            this.repaint();
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton badd;
    private javax.swing.JButton bremove;
    private javax.swing.JComboBox combo_batch;
    private javax.swing.JComboBox combo_day;
    private javax.swing.JComboBox combo_from;
    private javax.swing.JComboBox combo_subject;
    private javax.swing.JComboBox combo_teacher;
    private javax.swing.JComboBox combo_to;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTabbedPane tab1;
    // End of variables declaration//GEN-END:variables
}
