package hms.admin;

import hms.Emp;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public final class Manage_Staff extends javax.swing.JInternalFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public Manage_Staff() {
        initComponents();
        setFrameIcon(null);
        conn = hms.db.connect();
        currentDate();
        shotime();
        tableHeader();
        Update_table();
        txtusername.requestFocus();
        txtuserid.setEnabled(false);
        staff_table.setAutoCreateRowSorter(true);
        Toolkit toolkit = getToolkit();
    }

    public void tableHeader() {
        JTableHeader header1 = staff_table.getTableHeader();
        header1.setFont(new Font("Tahoma", Font.BOLD, 13));
    }

    public static String now(String dateFormat) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        return sdf.format(cal.getTime());
    }

    public void currentDate() {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM dd yyyy");
    }

    public void shotime() {
        new Timer(0, (ActionEvent e) -> {
            Date d = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss:a");
        }).start();
    }

    private void Update_table() {

        try {
            String sql = "select * from user where User_type = 'Staff'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            staff_table.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {

            try {
                rs.close();
                pst.close();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        txtuserid = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtusertype = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        clear_btn = new javax.swing.JButton();
        delete_btn = new javax.swing.JButton();
        update_btn = new javax.swing.JButton();
        add_btn = new javax.swing.JButton();
        txtpassword = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        staff_table = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(251, 251, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(251, 251, 251));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Staff", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(32, 40, 53))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(32, 40, 53));
        jLabel6.setText("User ID:");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 60, 31));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(32, 40, 53));
        jLabel8.setText("Username:");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 80, 30));
        jPanel7.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 290, 30));

        txtuserid.setToolTipText("No need to add. System automatic generated.");
        jPanel7.add(txtuserid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 290, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(32, 40, 53));
        jLabel10.setText("User type:");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 80, 30));

        txtusertype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Staff" }));
        jPanel7.add(txtusertype, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 290, 30));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        clear_btn.setText("Clear");
        clear_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btnActionPerformed(evt);
            }
        });

        delete_btn.setText("Delete");
        delete_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

        update_btn.setText("Update");
        update_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });

        add_btn.setText("Add Record");
        add_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(527, 527, 527)
                .addComponent(add_btn)
                .addGap(11, 11, 11)
                .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(clear_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel7.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1010, 60));
        jPanel7.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 290, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(32, 40, 53));
        jLabel11.setText("Password:");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 80, 30));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -4, 1010, 200));

        jPanel8.setBackground(new java.awt.Color(251, 251, 251));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Staff Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(32, 40, 53))); // NOI18N
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        staff_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "User_id	", "Username", "Password", "User_type"
            }
        ));
        staff_table.getTableHeader().setReorderingAllowed(false);
        staff_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staff_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(staff_table);

        jPanel8.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 41, 970, 240));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 1010, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1063, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 392, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        if (!(txtusertype.getSelectedItem().equals("Select") || txtusername.getText().isEmpty() || txtpassword.getText().isEmpty())) {
            try {
                String sql = "insert into user"
                        + "(Username,Password,User_type) values (?,?,?)";

                pst = conn.prepareStatement(sql);
                pst.setString(1, txtusername.getText());
                pst.setString(2, txtpassword.getText());
                pst.setString(3, txtusertype.getSelectedItem().toString());

                pst.execute();
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "New Staff Account Created");

            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }

            Date currentDate = GregorianCalendar.getInstance().getTime();
            DateFormat df = DateFormat.getDateInstance();
            String dateString = df.format(currentDate);

            Date d = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            String timeString = sdf.format(d);

            String value0 = timeString;
            String value1 = dateString;
            int value = Emp.UserId;

            try {

                String reg = "insert into logs (User_id, Date, Status) values ('" + value + "','" + value0 + " / " + value1 + "','New Staff Account Created')";
                pst = conn.prepareStatement(reg);
                pst.execute();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {

                try {
                    rs.close();
                    pst.close();

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
            Update_table();
        } else {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "One or more required fields are empty", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_add_btnActionPerformed

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
        if (!(txtusertype.getSelectedItem().equals("Select") || txtuserid.getText().isEmpty() || txtusername.getText().isEmpty() || txtpassword.getText().isEmpty())) {

            getToolkit().beep();
            int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to update?", "Update Record", JOptionPane.YES_NO_OPTION);

            if (p == 0) {

                try {

                    String value1 = txtuserid.getText();
                    String value2 = txtusername.getText();
                    String value3 = txtpassword.getText();
                    String value4 = txtusertype.getSelectedItem().toString();

                    String sql = "update user set User_id='" + value1 + "',Username='" + value2 + "', Password='" + value3 + "', "
                            + "User_type='" + value4 + "'"
                            + "where User_id='" + value1 + "' ";

                    pst = conn.prepareStatement(sql);
                    pst.execute();
                    getToolkit().beep();
                    JOptionPane.showMessageDialog(null, "Account Updated");

                } catch (HeadlessException | SQLException e) {
                    JOptionPane.showMessageDialog(null, e);
                }

                Date currentDate = GregorianCalendar.getInstance().getTime();
                DateFormat df = DateFormat.getDateInstance();
                String dateString = df.format(currentDate);

                Date d = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String timeString = sdf.format(d);

                String value0 = timeString;
                String values = dateString;
                int value = Emp.UserId;

                try {
                    String reg = "insert into logs (User_id, Date, Status) values ('" + value + "','" + value0 + " / " + values + "','Staff Details Updated')";
                    pst = conn.prepareStatement(reg);
                    pst.execute();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e);
                } finally {

                    try {
                        rs.close();
                        pst.close();

                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
                Update_table();
            }
        } else {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "One or more required fields are empty", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_update_btnActionPerformed

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        if (!(txtusertype.getSelectedItem().equals("Select") || txtuserid.getText().isEmpty() || txtusername.getText().isEmpty() || txtpassword.getText().isEmpty())) {

            getToolkit().beep();
            int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete account?", "Delete", JOptionPane.YES_NO_OPTION);

            if (p == 0) {
                Date currentDate = GregorianCalendar.getInstance().getTime();
                DateFormat df = DateFormat.getDateInstance();
                String dateString = df.format(currentDate);

                Date d = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String timeString = sdf.format(d);

                String value0 = timeString;
                String value1 = dateString;
                int value = Emp.UserId;

                try {
                    String reg = "insert into logs (User_id, Date, Status) values ('" + value + "','" + value0 + " / " + value1 + "','Staff Account Removed')";
                    pst = conn.prepareStatement(reg);
                    pst.execute();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                String sql = "delete from user where User_id=? ";
                try {
                    pst = conn.prepareStatement(sql);
                    pst.setString(1, txtuserid.getText());
                    pst.execute();

                    getToolkit().beep();
                    JOptionPane.showMessageDialog(null, "Account Removed");

                } catch (HeadlessException | SQLException e) {
                    JOptionPane.showMessageDialog(null, e);
                } finally {

                    try {
                        rs.close();
                        pst.close();

                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
                Update_table();
            }
        } else {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "One or more required fields are empty", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_delete_btnActionPerformed

    private void clear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btnActionPerformed
        txtuserid.setText("");
        txtusername.setText("");
        txtpassword.setText("");
        txtusertype.setSelectedIndex(0);
    }//GEN-LAST:event_clear_btnActionPerformed

    private void staff_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staff_tableMouseClicked
        DefaultTableModel model = (DefaultTableModel) staff_table.getModel();
        int SelectedRowIndex = staff_table.getSelectedRow();

        txtuserid.setText(model.getValueAt(SelectedRowIndex, 0).toString());
        txtusername.setText(model.getValueAt(SelectedRowIndex, 1).toString());
        txtpassword.setText(model.getValueAt(SelectedRowIndex, 2).toString());

        user_type = (model.getValueAt(SelectedRowIndex, 3).toString());
        for (int i = 0; i < txtusertype.getItemCount(); i++) {
            if (txtusertype.getItemAt(i).equalsIgnoreCase(user_type)) {
                txtusertype.setSelectedIndex(i);
            }
        }
    }//GEN-LAST:event_staff_tableMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JButton clear_btn;
    private javax.swing.JButton delete_btn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable staff_table;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtuserid;
    private javax.swing.JTextField txtusername;
    private javax.swing.JComboBox<String> txtusertype;
    private javax.swing.JButton update_btn;
    // End of variables declaration//GEN-END:variables
    private String user_type;
}
