package london;

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
public class logins extends javax.swing.JFrame {

    /**
     * Creates new form logins
     */
    public logins() {
        initComponents();
        refr();
        tableColors();
    }

    private void refr() {
        ResultSet r0 = null;
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();

        while (dtm.getRowCount() > 0) {
            dtm.removeRow(0);
        }
        try {
            r0 = jdbc.con().createStatement().executeQuery("select * from login_sessions");
            while (r0.next()) {
                Vector v0 = new Vector();
                v0.add(r0.getString("users_username"));
                v0.add(r0.getString("loginAt"));
                v0.add(r0.getString("logoutAt"));
                v0.add(r0.getString("status"));
                dtm.addRow(v0);
            }

            System.gc();
        } catch (Exception e) {
            System.out.println("error refreshing logins list");
            System.out.println(e);
        } finally {
            try {
                if (r0 != null) {
                    r0.close();
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        t_searchYear = new javax.swing.JTextField();
        t_searchMonth = new javax.swing.JTextField();
        t_searchDay = new javax.swing.JTextField();
        bfilterLogins = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ALL LOGIN SESSIONS");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User", "Login Time", "Logout Time", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Refresh Table");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Print Sheet");
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Exit");
        jButton4.setOpaque(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        t_searchYear.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_searchYear.setText("yyyy");
        t_searchYear.setEnabled(false);
        t_searchYear.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t_searchYearFocusGained(evt);
            }
        });

        t_searchMonth.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_searchMonth.setText("mm");
        t_searchMonth.setEnabled(false);
        t_searchMonth.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t_searchMonthFocusGained(evt);
            }
        });

        t_searchDay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_searchDay.setText("dd");
        t_searchDay.setEnabled(false);
        t_searchDay.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t_searchDayFocusGained(evt);
            }
        });

        bfilterLogins.setText("Filter Logins on this date");
        bfilterLogins.setEnabled(false);
        bfilterLogins.setOpaque(false);
        bfilterLogins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bfilterLoginsActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Filter");
        jCheckBox1.setContentAreaFilled(false);
        jCheckBox1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox1StateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(t_searchYear, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t_searchMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(t_searchDay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bfilterLogins)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t_searchMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_searchDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bfilterLogins)
                            .addComponent(t_searchYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(18, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 607, 402));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-623)/2, (screenSize.height-438)/2, 623, 438);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        MessageFormat header = new MessageFormat("Login Records' Datasheet.");
        MessageFormat footer = new MessageFormat("--Air Solutions--" + new Date().toString());
        try {
            jTable1.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (Exception e) {
            System.err.format("Cannot Print %s%n", e.getMessage());
        }
        JOptionPane.showMessageDialog(null, "<html>Remember, You Can only Print the Sheet with your Printer!<br> "
                + "<font color=red><b>Do not Use other File Formats like .pdf .ps or .xps</b></font></html>",
                "Remember!", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        refr();
        System.gc();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void t_searchYearFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_searchYearFocusGained
        t_searchYear.setText(null);
    }//GEN-LAST:event_t_searchYearFocusGained

    private void t_searchMonthFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_searchMonthFocusGained
        t_searchMonth.setText(null);
    }//GEN-LAST:event_t_searchMonthFocusGained

    private void t_searchDayFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_searchDayFocusGained
        t_searchDay.setText(null);
    }//GEN-LAST:event_t_searchDayFocusGained

    private void bfilterLoginsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bfilterLoginsActionPerformed
        ResultSet r0 = null;
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        while (dtm.getRowCount() > 0) {
            dtm.removeRow(0);
        }
        try {
            r0 = jdbc.con().createStatement().executeQuery("select * from login_sessions "
                    + " where loginAt like "
                    + " '" + t_searchYear.getText().toString() + "-" + t_searchMonth.getText().toString() + "-"
                    + t_searchDay.getText().toString() + "%' ");
            while (r0.next()) {
                Vector v0 = new Vector();
                v0.add(r0.getString("users_username"));
                v0.add(r0.getString("loginAt"));
                v0.add(r0.getString("logoutAt"));
                v0.add(r0.getString("status"));
                dtm.addRow(v0);
            }
        } catch (Exception e) {
            System.out.println("" + e);
        } finally {
            try {
                if (r0 != null) {
                    r0.close();
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_bfilterLoginsActionPerformed

    private void jCheckBox1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox1StateChanged
        if (jCheckBox1.isSelected()) {
            t_searchDay.setEnabled(true);
            t_searchYear.setEnabled(true);
            t_searchMonth.setEnabled(true);
            bfilterLogins.setEnabled(true);
        } else {
            refr();
            t_searchDay.setText("dd");
            t_searchYear.setText("yyyy");
            t_searchMonth.setText("mm");
            t_searchDay.setEnabled(false);
            t_searchYear.setEnabled(false);
            t_searchMonth.setEnabled(false);
            bfilterLogins.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox1StateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(logins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(logins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(logins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(logins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new logins().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bfilterLogins;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField t_searchDay;
    private javax.swing.JTextField t_searchMonth;
    private javax.swing.JTextField t_searchYear;
    // End of variables declaration//GEN-END:variables

    private void tableColors() {
        // for (int i = 0; i < jTable1.getRowCount(); i++) {
        jTable1.setBackground(Color.darkGray);
        jTable1.setForeground(Color.yellow);
        // }
    }
}
