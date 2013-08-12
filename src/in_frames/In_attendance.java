package in_frames;

import Connection.jdbc;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joshua
 */
public class In_attendance extends javax.swing.JInternalFrame {

    jdbc cdb = new jdbc();

    public In_attendance() {
        initComponents();
        loadTable();
        t_atten_id.grabFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel32 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_atte = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        t_atten_id = new javax.swing.JTextField();
        badd = new javax.swing.JButton();
        bnumlock = new javax.swing.JLabel();
        l_sqlerror = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();

        jLabel32.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/LB4.png"))); // NOI18N
        jLabel32.setEnabled(false);

        setClosable(true);
        setIconifiable(true);
        setTitle("Daily Attendance");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/site_icon.png"))); // NOI18N
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        table_atte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Name", "Stream", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_atte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                table_atteKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(table_atte);

        jScrollPane1.setBounds(10, 10, 640, 170);
        jLayeredPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student ID");
        jLabel1.setBounds(80, 200, 73, 22);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        t_atten_id.setFont(new java.awt.Font("Centaur", 1, 24)); // NOI18N
        t_atten_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_atten_id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t_atten_idFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t_atten_idFocusLost(evt);
            }
        });
        t_atten_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_atten_idKeyPressed(evt);
            }
        });
        t_atten_id.setBounds(200, 190, 190, 40);
        jLayeredPane1.add(t_atten_id, javax.swing.JLayeredPane.DEFAULT_LAYER);

        badd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        badd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/check_.png"))); // NOI18N
        badd.setText("Mark Present");
        badd.setBorderPainted(false);
        badd.setIconTextGap(10);
        badd.setOpaque(false);
        badd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baddActionPerformed(evt);
            }
        });
        badd.setBounds(410, 190, 170, 40);
        jLayeredPane1.add(badd, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bnumlock.setFont(new java.awt.Font("Cantarell", 0, 10)); // NOI18N
        bnumlock.setBounds(370, 260, 190, 0);
        jLayeredPane1.add(bnumlock, javax.swing.JLayeredPane.DEFAULT_LAYER);
        l_sqlerror.setBounds(0, 230, 350, 20);
        jLayeredPane1.add(l_sqlerror, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel33.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/img$icon/LB4.png"))); // NOI18N
        jLabel33.setEnabled(false);
        jLabel33.setBounds(0, -150, 860, 550);
        jLayeredPane1.add(jLabel33, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t_atten_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_atten_idKeyPressed
        DefaultTableModel dtm = (DefaultTableModel) table_atte.getModel();
        ResultSet rs2 = null, rs1 = null;
        try {
            if (evt.getKeyChar() == 10) {//-----marking student with the subject(s) on this date as present

                String date = new Date().toString();
                String datef = date.replaceAll("[^\\x00-\\x7F]", "");
//        String day = d.split(" ")[0];
                String y = date.split(" ")[5];
                String m = date.split(" ")[1];
                String da = date.split(" ")[2];
                String dall = m + da + y;

//-----------------------------------------------------------------------------------
                rs2 = cdb.getdata("select * from attendance");
                while (rs2.next()) {
                    if (rs2.getString("stu_no").equals(t_atten_id.getText().toString())
                            && rs2.getString("systemtime").equals(dall.toString())) {
                        JOptionPane.showMessageDialog(null, "The Student has already Entered the premises \n"
                                + " and been marked present");
                    } else if (!rs2.getString("stu_no").equals(t_atten_id.getText().toString())) {
                        if (!rs2.getString("systemtime").equals(dall.toString())) {

                            rs1 = cdb.getdata("SELECT name,stream FROM students2 "
                                    + "WHERE stu_no='" + t_atten_id.getText() + "'");
                            while (rs1.next()) {
                                String name = rs1.getString("name");
                                String stream = rs1.getString("stream");

                                Vector v = new Vector();
                                v.add(t_atten_id.getText());
                                v.add(name);
                                v.add(stream);
                                v.add(datef);
                                dtm.addRow(v);//------adding data to table to display and then to database too

                                cdb.putdata("INSERT INTO attendance(stu_no,name,stream,date,systemtime) "
                                        + "VALUES ('" + t_atten_id.getText() + "','" + name + "',"
                                        + "'" + stream + "','" + datef + "','" + dall + "' )");

                                t_atten_id.setText("");
                                t_atten_id.grabFocus();

                                loadTable();
                            }
                        }
                    }//------------------------------------------------------------------------
                }
            } else if (evt.getKeyCode() == 32) {
                t_atten_id.setEditable(false);
            } else if (evt.getKeyCode() == 37 | evt.getKeyCode() == 39) {
                t_atten_id.setEditable(true);
            }
        } catch (Exception e) {
            System.out.println("error at student id input field using enter key");
            System.out.println(e);
        } finally {
            try {
                if (rs2 != null) {
                    rs2.close();
                }
                if (rs1 != null) {
                    rs1.close();
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }

    }//GEN-LAST:event_t_atten_idKeyPressed

    private void table_atteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_table_atteKeyPressed

        try {
            if (evt.getKeyChar() == 127 | evt.getKeyChar() == 8) { //-------------confirm before deleting

                JOptionPane.showMessageDialog(null, "YOU ARE NOT ALLOWED \n"
                        + " TO CLEAR OR DELETE \n ATTENDANCE RECORDS", "WARNING", 2);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid operation on table");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_table_atteKeyPressed

    private void t_atten_idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_atten_idFocusLost
        badd.grabFocus();
    }//GEN-LAST:event_t_atten_idFocusLost

    private void baddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baddActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) table_atte.getModel();
        ResultSet rs1 = null, rs2 = null;
        try {
            String date = new Date().toString();
            String datef = date.replaceAll("[^\\x00-\\x7F]", "");
//        String day = d.split(" ")[0];
            String y = date.split(" ")[5];
            String m = date.split(" ")[1];
            String da = date.split(" ")[2];
            String dall = m + da + y;
//                bnumlock.setText(null);
            //boolean b0;

            rs1 = cdb.getdata("SELECT name,stream FROM students2 WHERE stu_no='" + t_atten_id.getText() + "'");
            while (rs1.next()) {
                String name = rs1.getString("name");
                String stream = rs1.getString("stream");

                rs2 = cdb.getdata("select * from attendance");
                if (rs2.first()) {
                    if (rs2.getString("stu_no").equals(t_atten_id.getText().toString())
                            && rs2.getString("systemtime").equals(dall.toString())) {
                        // b0 = false;
                        JOptionPane.showMessageDialog(null, "The Student has already Entered the premises \n"
                                + " and been marked present");
                    } else {
                        Vector v = new Vector();
                        v.add(t_atten_id.getText());
                        v.add(name);
                        v.add(stream);
                        v.add(datef);
                        dtm.addRow(v);//------adding data to table to display and then to database too

                        cdb.putdata("INSERT INTO attendance(stu_no,name,stream,date,systemtime) "
                                + "VALUES ('" + t_atten_id.getText() + "','" + name + "',"
                                + "'" + stream + "','" + datef + "','" + dall + "' )");

                        t_atten_id.setText("");
                        t_atten_id.grabFocus();

                        loadTable();
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("at student id input field from button");
            System.out.println(e);
        } finally {
            try {
                if (rs2 != null) {
                    rs2.close();
                }
                if (rs1 != null) {
                    rs1.close();
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_baddActionPerformed

    private void t_atten_idFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_atten_idFocusGained
        loadTable();
    }//GEN-LAST:event_t_atten_idFocusGained

    private void loadTable() {
        ResultSet rs = null;
        String date = new Date().toString();
        // String datef = date.replaceAll("[^\\x00-\\x7F]", "");
//        String day = d.split(" ")[0];
        String y = date.split(" ")[5];
        String m = date.split(" ")[1];
        String da = date.split(" ")[2];
        String dall = m + da + y;

        this.setTitle("" + ": Today is " + da + "-" + m + "-" + y);

        DefaultTableModel dtm = (DefaultTableModel) table_atte.getModel();
        while (dtm.getRowCount() > 0) {
            dtm.removeRow(0);
        }

        try {
            rs = cdb.getdata("select * from attendance where systemtime='" + dall + "'");
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("stu_no"));
                v.add(rs.getString("name"));
                v.add(rs.getString("stream"));
                v.add(rs.getString("date"));

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
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton badd;
    private javax.swing.JLabel bnumlock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l_sqlerror;
    private javax.swing.JTextField t_atten_id;
    private javax.swing.JTable table_atte;
    // End of variables declaration//GEN-END:variables
}
