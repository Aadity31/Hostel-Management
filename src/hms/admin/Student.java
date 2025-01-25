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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public final class Student extends javax.swing.JInternalFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public Student() {
        initComponents();
        setFrameIcon(null);
        conn = hms.db.connect();
        txtname.requestFocus();
        currentDate();
        shotime();
        Fillcombobox();
        tableHeader();
        Update_table();
        student_table.setAutoCreateRowSorter(true);
        Toolkit toolkit = getToolkit();
    }

    public static String now(String dateFormat) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        return sdf.format(cal.getTime());
    }

    public void currentDate() {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd");
    }

    public void shotime() {
        new Timer(0, (ActionEvent e) -> {
            Date d = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss:a");
        }).start();
    }

    public void tableHeader() {
        JTableHeader header1 = student_table.getTableHeader();
        header1.setFont(new Font("Tahoma", Font.BOLD, 13));
    }

    private void Fillcombobox() {

        try {
            String sql = "select * from rooms where Room_status='Available'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                String roomno = rs.getString("Room_id");
                txtroomcom.addItem(roomno);
            }
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

    private void Update_table() {

        try {
            String sql = "select * from student";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            student_table.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
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

    private static final String EMAIL_PATTERN
            = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

    private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtguardian = new javax.swing.JTextField();
        txtgencom = new javax.swing.JComboBox<>();
        txtaddress = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtroomcom = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtstuid = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtstuyear = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtnic = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtcontact = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        txtemgcontact = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtprogramme = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        clear_btn = new javax.swing.JButton();
        delete_btn = new javax.swing.JButton();
        update_btn = new javax.swing.JButton();
        add_btn = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        student_table = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(251, 251, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(251, 251, 251));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Students", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(32, 40, 53))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(32, 40, 53));
        jLabel7.setText("Gender:");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 70, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(32, 40, 53));
        jLabel6.setText("Address:");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, 31));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(32, 40, 53));
        jLabel8.setText("Guardian Name:");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, 30));
        jPanel7.add(txtguardian, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 290, 30));

        txtgencom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female" }));
        jPanel7.add(txtgencom, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 290, 30));

        txtaddress.setToolTipText("");
        jPanel7.add(txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 290, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(32, 40, 53));
        jLabel9.setText("Room No:");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 70, 30));

        txtroomcom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jPanel7.add(txtroomcom, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 290, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(32, 40, 53));
        jLabel11.setText("Name:");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, 31));

        txtname.setToolTipText("");
        jPanel7.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 290, 30));
        jPanel7.add(txtstuid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 290, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(32, 40, 53));
        jLabel12.setText("Student ID:");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, 30));
        jPanel7.add(txtstuyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 290, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(32, 40, 53));
        jLabel13.setText("Study Year:");
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, 30));
        jPanel7.add(txtnic, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 290, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(32, 40, 53));
        jLabel14.setText("NIC/Passport:");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(32, 40, 53));
        jLabel15.setText("Contact No:");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, -1, 30));

        txtcontact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcontactKeyReleased(evt);
            }
        });
        jPanel7.add(txtcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 290, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(32, 40, 53));
        jLabel16.setText("Email:");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, -1, 30));

        txtemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtemailFocusLost(evt);
            }
        });
        jPanel7.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 290, 30));

        txtemgcontact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtemgcontactKeyReleased(evt);
            }
        });
        jPanel7.add(txtemgcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 290, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(32, 40, 53));
        jLabel17.setText("Emg Contact:");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 100, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(32, 40, 53));
        jLabel18.setText("Study Programme:");
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 140, 30));
        jPanel7.add(txtprogramme, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, 290, 30));

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
                .addGap(523, 523, 523)
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

        jPanel7.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 1010, 60));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 1010, 320));

        jPanel8.setBackground(new java.awt.Color(251, 251, 251));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(32, 40, 53))); // NOI18N
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        student_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Address", "Gender", "Guardian", "Student ID", "Study Year", "NIC/Passport", "Contact No", "Email", "Emg Contact", "Study Programme", "Room No"
            }
        ));
        student_table.getTableHeader().setReorderingAllowed(false);
        student_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                student_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(student_table);

        jPanel8.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 41, 970, 120));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 1010, 180));

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
                .addGap(0, 396, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btnActionPerformed
        txtname.setText("");
        txtaddress.setText("");
        txtcontact.setText("");
        txtemail.setText("");
        txtemgcontact.setText("");
        txtguardian.setText("");
        txtnic.setText("");
        txtprogramme.setText("");
        txtstuid.setText("");
        txtstuyear.setText("");
        txtgencom.setSelectedIndex(0);
        txtroomcom.setSelectedIndex(0);
    }//GEN-LAST:event_clear_btnActionPerformed

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        if (!(txtname.getText().isEmpty() || txtaddress.getText().isEmpty() || txtcontact.getText().isEmpty() || txtguardian.getText().isEmpty() || txtemgcontact.getText().isEmpty()
                || txtnic.getText().isEmpty() || txtprogramme.getText().isEmpty() || txtstuid.getText().isEmpty() || txtstuyear.getText().isEmpty() || txtemail.getText().isEmpty()
                || txtgencom.getSelectedItem().equals("Select") || txtroomcom.getSelectedItem().equals("Select"))) {
            if (txtcontact.getText().length() == 10 && txtemgcontact.getText().length() == 10) {
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
                        String reg = "insert into logs (User_id, Date, Status) values ('" + value + "','" + value0 + " / " + value1 + "','Student Details Deleted')";
                        pst = conn.prepareStatement(reg);
                        pst.execute();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                    String sql = "delete from student where Student_id=? ";
                    try {
                        pst = conn.prepareStatement(sql);
                        pst.setString(1, txtstuid.getText());
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
                JOptionPane.showMessageDialog(null, "Enter valid contact number", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "One or more required fields are empty", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_delete_btnActionPerformed

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
        if (!(txtname.getText().isEmpty() || txtaddress.getText().isEmpty() || txtcontact.getText().isEmpty() || txtguardian.getText().isEmpty() || txtemgcontact.getText().isEmpty()
                || txtnic.getText().isEmpty() || txtprogramme.getText().isEmpty() || txtstuid.getText().isEmpty() || txtstuyear.getText().isEmpty() || txtemail.getText().isEmpty()
                || txtgencom.getSelectedItem().equals("Select") || txtroomcom.getSelectedItem().equals("Select"))) {
            if (txtcontact.getText().length() == 10 && txtemgcontact.getText().length() == 10) {
                getToolkit().beep();
                int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to update?", "Update Record", JOptionPane.YES_NO_OPTION);
                if (p == 0) {

                    try {
                        String value1 = txtname.getText();
                        String value2 = txtaddress.getText();
                        String value3 = txtgencom.getSelectedItem().toString();
                        String value4 = txtguardian.getText();
                        String value5 = txtstuid.getText();
                        String value6 = txtstuyear.getText();
                        String value7 = txtnic.getText();
                        String value8 = txtcontact.getText();
                        String value9 = txtemail.getText();
                        String value10 = txtemgcontact.getText();
                        String value11 = txtprogramme.getText();
                        String value12 = txtroomcom.getSelectedItem().toString();

                        String sql = "update student set Name='" + value1 + "',	Address='" + value2 + "', Gender='" + value3 + "', "
                                + "Guardian='" + value4 + "',Student_id='" + value5 + "',Study_year='" + value6 + "',NIC= '" + value7 + "', "
                                + "Contact_no='" + value8 + "',Email ='" + value9 + "',	Emg_contact='" + value10 + "',Programme= '" + value11 + "',Room_no='" + value12 + "'"
                                + "where Student_id='" + value5 + "' ";

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
                        String reg = "insert into logs (User_id, Date, Status) values ('" + value + "','" + value0 + " / " + values + "','Student Details Updated')";
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
                JOptionPane.showMessageDialog(null, "Enter valid contact number", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "One or more required fields are empty", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_update_btnActionPerformed

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        if (!(txtname.getText().isEmpty() || txtaddress.getText().isEmpty() || txtcontact.getText().isEmpty() || txtguardian.getText().isEmpty() || txtemgcontact.getText().isEmpty()
                || txtnic.getText().isEmpty() || txtprogramme.getText().isEmpty() || txtstuid.getText().isEmpty() || txtstuyear.getText().isEmpty() || txtemail.getText().isEmpty()
                || txtgencom.getSelectedItem().equals("Select") || txtroomcom.getSelectedItem().equals("Select"))) {
            if (txtcontact.getText().length() == 10 && txtemgcontact.getText().length() == 10) {

                try {
                    String sql = "insert into student"
                            + "(Name,Address,Gender,Guardian,Student_id,Study_year,NIC,Contact_no,Email,Emg_contact,Programme,Room_no) values (?,?,?,?,?,?,?,?,?,?,?,?)";

                    pst = conn.prepareStatement(sql);
                    pst.setString(1, txtname.getText());
                    pst.setString(2, txtaddress.getText());
                    pst.setString(3, txtgencom.getSelectedItem().toString());
                    pst.setString(4, txtguardian.getText());
                    pst.setString(5, txtstuid.getText());
                    pst.setString(6, txtstuyear.getText());
                    pst.setString(7, txtnic.getText());
                    pst.setString(8, txtcontact.getText());
                    pst.setString(9, txtemail.getText());
                    pst.setString(10, txtemgcontact.getText());
                    pst.setString(11, txtprogramme.getText());
                    pst.setString(12, txtroomcom.getSelectedItem().toString());

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
                    String reg = "insert into logs (User_id, Date, Status) values ('" + value + "','" + value0 + " / " + value1 + "','New Student Added')";
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
                JOptionPane.showMessageDialog(null, "Enter valid contact number", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "One or more required fields are empty", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_add_btnActionPerformed

    private void student_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_student_tableMouseClicked
        DefaultTableModel model = (DefaultTableModel) student_table.getModel();
        int SelectedRowIndex = student_table.getSelectedRow();

        txtname.setText(model.getValueAt(SelectedRowIndex, 0).toString());
        txtaddress.setText(model.getValueAt(SelectedRowIndex, 1).toString());

        gender = (model.getValueAt(SelectedRowIndex, 2).toString());
        for (int i = 0; i < txtgencom.getItemCount(); i++) {
            if (txtgencom.getItemAt(i).equalsIgnoreCase(gender)) {
                txtgencom.setSelectedIndex(i);
            }
        }

        txtguardian.setText(model.getValueAt(SelectedRowIndex, 3).toString());
        txtstuid.setText(model.getValueAt(SelectedRowIndex, 4).toString());
        txtstuyear.setText(model.getValueAt(SelectedRowIndex, 5).toString());
        txtnic.setText(model.getValueAt(SelectedRowIndex, 6).toString());
        txtcontact.setText(model.getValueAt(SelectedRowIndex, 7).toString());
        txtemail.setText(model.getValueAt(SelectedRowIndex, 8).toString());
        txtemgcontact.setText(model.getValueAt(SelectedRowIndex, 9).toString());
        txtprogramme.setText(model.getValueAt(SelectedRowIndex, 10).toString());

        room_no = (model.getValueAt(SelectedRowIndex, 11).toString());
        for (int i = 0; i < txtroomcom.getItemCount(); i++) {
            if (txtroomcom.getItemAt(i).equalsIgnoreCase(room_no)) {
                txtroomcom.setSelectedIndex(i);
            }
        }
    }//GEN-LAST:event_student_tableMouseClicked

    private void txtcontactKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontactKeyReleased
        try {
            int i = Integer.parseInt(txtcontact.getText());

        } catch (NumberFormatException e) {
            getToolkit().beep();
            txtcontact.setText("");
            JOptionPane.showMessageDialog(null, "You can add numbers only", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtcontactKeyReleased

    private void txtemgcontactKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemgcontactKeyReleased
        try {
            int i = Integer.parseInt(txtemgcontact.getText());

        } catch (NumberFormatException e) {
            getToolkit().beep();
            txtemgcontact.setText("");
            JOptionPane.showMessageDialog(null, "You can add numbers only", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtemgcontactKeyReleased

    private void txtemailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemailFocusLost
        String email = txtemail.getText();
        Matcher matcher = pattern.matcher(email);

        if (!(matcher.matches())) {
            getToolkit().beep();
            txtemail.setText("");
            JOptionPane.showMessageDialog(null, "Enter valid email", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtemailFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JButton clear_btn;
    private javax.swing.JButton delete_btn;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable student_table;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtcontact;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtemgcontact;
    private javax.swing.JComboBox<String> txtgencom;
    private javax.swing.JTextField txtguardian;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnic;
    private javax.swing.JTextField txtprogramme;
    private javax.swing.JComboBox<String> txtroomcom;
    private javax.swing.JTextField txtstuid;
    private javax.swing.JTextField txtstuyear;
    private javax.swing.JButton update_btn;
    // End of variables declaration//GEN-END:variables
    private String gender;
    private String room_no;
}
