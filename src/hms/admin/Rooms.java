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

public final class Rooms extends javax.swing.JInternalFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public Rooms() {
        initComponents();
        setFrameIcon(null);
        conn = hms.db.connect();
        currentDate();
        shotime();
        tableHeader();
        Update_table();
        txtroomtype.requestFocus();
        txtroomid.setEnabled(false);
        room_table.setAutoCreateRowSorter(true);
        Toolkit toolkit = getToolkit();
    }

    public void tableHeader() {
        JTableHeader header1 = room_table.getTableHeader();
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
            String sql = "select * from rooms";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            room_table.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
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
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtcapacity = new javax.swing.JTextField();
        txtroomtype = new javax.swing.JComboBox<>();
        txtroomid = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtstatus = new javax.swing.JComboBox<>();
        txtfacility = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        clear_btn = new javax.swing.JButton();
        delete_btn = new javax.swing.JButton();
        update_btn = new javax.swing.JButton();
        add_btn = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        room_table = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(251, 251, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(251, 251, 251));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Rooms", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(32, 40, 53))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(32, 40, 53));
        jLabel7.setText("Room Type:");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(32, 40, 53));
        jLabel6.setText("Room ID:");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, 31));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(32, 40, 53));
        jLabel8.setText("Capacity:");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, 30));
        jPanel7.add(txtcapacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 290, 30));

        txtroomtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Single", "Shared" }));
        jPanel7.add(txtroomtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 290, 30));

        txtroomid.setToolTipText("No need to add. System automatic generated.");
        jPanel7.add(txtroomid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 290, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(32, 40, 53));
        jLabel9.setText("Facility:");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, -1, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(32, 40, 53));
        jLabel10.setText("Room Status:");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, -1, 30));

        txtstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Available", "Full" }));
        jPanel7.add(txtstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 290, 30));

        txtfacility.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "AC", "Non AC" }));
        jPanel7.add(txtfacility, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 290, 30));

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
                .addGap(528, 528, 528)
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

        jPanel7.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 1010, 60));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -4, 1010, 240));

        jPanel8.setBackground(new java.awt.Color(251, 251, 251));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Room Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(32, 40, 53))); // NOI18N
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        room_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Room_id	", "Room Type", "Capacity", "Facility", "Room Status	 "
            }
        ));
        room_table.getTableHeader().setReorderingAllowed(false);
        room_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                room_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(room_table);

        jPanel8.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 41, 970, 200));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 1010, 260));

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
        if (!(txtroomtype.getSelectedItem().equals("Select") || txtcapacity.getText().isEmpty() || txtfacility.getSelectedItem().equals("Select") || txtstatus.getSelectedItem().equals("Select"))) {
            try {
                String sql = "insert into rooms"
                        + "(Room_type,Capacity,Facility,Room_status) values (?,?,?,?)";

                pst = conn.prepareStatement(sql);
                pst.setString(1, txtroomtype.getSelectedItem().toString());
                pst.setString(2, txtcapacity.getText());
                pst.setString(3, txtfacility.getSelectedItem().toString());
                pst.setString(4, txtstatus.getSelectedItem().toString());

                pst.execute();
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Data is saved successfully");

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

                String reg = "insert into logs (User_id, Date, Status) values ('" + value + "','" + value0 + " / " + value1 + "','New Room Added')";
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
        if (!(txtroomid.getText().isEmpty() || txtroomtype.getSelectedItem().equals("Select") || txtcapacity.getText().isEmpty() || txtfacility.getSelectedItem().equals("Select") || txtstatus.getSelectedItem().equals("Select"))) {

            getToolkit().beep();
            int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to update?", "Update Record", JOptionPane.YES_NO_OPTION);

            if (p == 0) {

                try {

                    String value1 = txtroomid.getText();
                    String value2 = txtroomtype.getSelectedItem().toString();
                    String value3 = txtcapacity.getText();
                    String value4 = txtfacility.getSelectedItem().toString();
                    String value5 = txtstatus.getSelectedItem().toString();

                    String sql = "update rooms set Room_id='" + value1 + "',Room_type='" + value2 + "', Capacity='" + value3 + "', "
                            + "Facility='" + value4 + "',Room_status='" + value5 + "'"
                            + "where Room_id='" + value1 + "' ";

                    pst = conn.prepareStatement(sql);
                    pst.execute();
                    getToolkit().beep();
                    JOptionPane.showMessageDialog(null, "Record Updated");

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
                    String reg = "insert into logs (User_id, Date, Status) values ('" + value + "','" + value0 + " / " + values + "','Room Details Updated')";
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
        if (!(txtroomid.getText().isEmpty() || txtroomtype.getSelectedItem().equals("Select") || txtcapacity.getText().isEmpty() || txtfacility.getSelectedItem().equals("Select") || txtstatus.getSelectedItem().equals("Select"))) {

            getToolkit().beep();
            int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete record?", "Delete", JOptionPane.YES_NO_OPTION);

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
                    String reg = "insert into logs (User_id, Date, Status) values ('" + value + "','" + value0 + " / " + value1 + "','Room Removed')";
                    pst = conn.prepareStatement(reg);
                    pst.execute();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                String sql = "delete from rooms where Room_id=? ";
                try {
                    pst = conn.prepareStatement(sql);
                    pst.setString(1, txtroomid.getText());
                    pst.execute();

                    getToolkit().beep();
                    JOptionPane.showMessageDialog(null, "Record Deleted");

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
        txtroomid.setText("");
        txtcapacity.setText("");
        txtroomtype.setSelectedIndex(0);
        txtfacility.setSelectedIndex(0);
        txtstatus.setSelectedIndex(0);
    }//GEN-LAST:event_clear_btnActionPerformed

    private void room_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_room_tableMouseClicked
        DefaultTableModel model = (DefaultTableModel) room_table.getModel();
        int SelectedRowIndex = room_table.getSelectedRow();

        txtroomid.setText(model.getValueAt(SelectedRowIndex, 0).toString());

        room_type = (model.getValueAt(SelectedRowIndex, 1).toString());
        for (int i = 0; i < txtroomtype.getItemCount(); i++) {
            if (txtroomtype.getItemAt(i).equalsIgnoreCase(room_type)) {
                txtroomtype.setSelectedIndex(i);
            }
        }

        txtcapacity.setText(model.getValueAt(SelectedRowIndex, 2).toString());

        facility = (model.getValueAt(SelectedRowIndex, 3).toString());
        for (int i = 0; i < txtfacility.getItemCount(); i++) {
            if (txtfacility.getItemAt(i).equalsIgnoreCase(facility)) {
                txtfacility.setSelectedIndex(i);
            }
        }

        room_status = (model.getValueAt(SelectedRowIndex, 4).toString());
        for (int i = 0; i < txtstatus.getItemCount(); i++) {
            if (txtstatus.getItemAt(i).equalsIgnoreCase(room_status)) {
                txtstatus.setSelectedIndex(i);
            }
        }
    }//GEN-LAST:event_room_tableMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JButton clear_btn;
    private javax.swing.JButton delete_btn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable room_table;
    private javax.swing.JTextField txtcapacity;
    private javax.swing.JComboBox<String> txtfacility;
    private javax.swing.JTextField txtroomid;
    private javax.swing.JComboBox<String> txtroomtype;
    private javax.swing.JComboBox<String> txtstatus;
    private javax.swing.JButton update_btn;
    // End of variables declaration//GEN-END:variables
    private String room_type;
    private String facility;
    private String room_status;
}
