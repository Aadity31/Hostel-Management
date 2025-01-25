package hms;

import com.formdev.flatlaf.FlatIntelliJLaf;
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
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public final class Profile extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public Profile() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/hms/img/HMS.png")).getImage());
        conn = db.connect();
        Toolkit toolkit = getToolkit();
        txtuserid.setText(String.valueOf(Emp.UserId));
        get_data();
        currentDate();
        shotime();
        txtuserid.setEnabled(false);
        txtusertype.setEnabled(false);
        txtusername.requestFocus();
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

    private void get_data() {

        String tmp = txtuserid.getText();
        String sql = "select * from user where User_id=?";

        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, tmp);
            rs = pst.executeQuery();

            if (rs.next()) {

                String add1 = rs.getString("User_id");
                txtuserid.setText(add1);

                String add2 = rs.getString("Username");
                txtusername.setText(add2);
                username.setText(add2);

                String add3 = rs.getString("Password");
                txtpassword.setText(add3);

                String add4 = rs.getString("User_type");
                txtusertype.setText(add4);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {

            try {
                rs.close();
                pst.close();

            } catch (SQLException e) {

            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtusertype = new javax.swing.JTextField();
        txtpassword = new javax.swing.JTextField();
        txtusername = new javax.swing.JTextField();
        txtuserid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        update_btn = new javax.swing.JButton();
        clear_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("User Profile");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(251, 251, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(32, 40, 53));
        jLabel6.setText("User ID:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 60, 31));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(32, 40, 53));
        jLabel8.setText("Username:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 90, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(32, 40, 53));
        jLabel11.setText("Password:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 80, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(32, 40, 53));
        jLabel10.setText("User type:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 80, 30));
        jPanel1.add(txtusertype, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 290, 30));
        jPanel1.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 290, 30));
        jPanel1.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 290, 30));

        txtuserid.setToolTipText("No need to add. System automatic generated.");
        jPanel1.add(txtuserid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 290, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/img/user_img.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        username.setBackground(new java.awt.Color(0, 34, 66));
        username.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        username.setForeground(new java.awt.Color(0, 166, 80));
        username.setText("User");
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 34, 66));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Welcome,");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 500, 30));

        update_btn.setText("Update");
        update_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });
        jPanel1.add(update_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 99, 38));

        clear_btn.setText("Clear");
        clear_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btnActionPerformed(evt);
            }
        });
        jPanel1.add(clear_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 102, 38));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
        if (!(txtuserid.getText().isEmpty() || txtusername.getText().isEmpty() || txtpassword.getText().isEmpty() || txtusertype.getText().isEmpty())) {

            getToolkit().beep();
            int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to update?", "Update Account", JOptionPane.YES_NO_OPTION);

            if (p == 0) {

                try {

                    String value1 = txtuserid.getText();
                    String value2 = txtusername.getText();
                    String value3 = txtpassword.getText();
                    String value4 = txtusertype.getText();

                    String sql = "update user set User_id='" + value1 + "',Username='" + value2 + "', Password='" + value3 + "', "
                            + "	User_type='" + value4 + "'"
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
                    String reg = "insert into logs (User_id, Date, Status) values ('" + value + "','" + value0 + " / " + values + "','User Account Updated')";
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
                get_data();
            }
        } else {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "One or more required fields are empty", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_update_btnActionPerformed

    private void clear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btnActionPerformed
        txtuserid.setText("");
        txtusername.setText("");
        txtpassword.setText("");
        txtusertype.setText("");
    }//GEN-LAST:event_clear_btnActionPerformed

    public static void main(String args[]) {
        try {
            FlatIntelliJLaf.registerCustomDefaultsSource("hms.style");
            FlatIntelliJLaf.setup();
        } catch (Exception e) {
            e.printStackTrace();
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtuserid;
    private javax.swing.JTextField txtusername;
    private javax.swing.JTextField txtusertype;
    private javax.swing.JButton update_btn;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
