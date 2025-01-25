package hms;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
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

public final class Login extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public Login() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/hms/img/HMS.png")).getImage());
        currentDate();
        shotime();
        conn = db.connect();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2,
                size.height / 2 - getHeight() / 2);
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_login = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        disable = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        signup = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        comb_usertype = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log in");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/img/Login Img.png"))); // NOI18N

        btn_login.setBackground(new java.awt.Color(0, 166, 80));
        btn_login.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("Log in");
        btn_login.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btn_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Password");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/img/user_icon.png"))); // NOI18N

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 153, 153));
        jLabel17.setText("Username");

        txtpassword.setFont(txtpassword.getFont().deriveFont((float)18));
        txtpassword.setForeground(new java.awt.Color(94, 94, 94));
        txtpassword.setBorder(null);
        txtpassword.setEchoChar((char)8226);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("_________________________________________");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("_________________________________________");

        txtusername.setFont(txtusername.getFont().deriveFont((float)18));
        txtusername.setForeground(new java.awt.Color(94, 94, 94));
        txtusername.setBorder(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/img/HMS Logo.png"))); // NOI18N

        disable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        disable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/img/invisible_icon.png"))); // NOI18N
        disable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        disable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disableMouseClicked(evt);
            }
        });

        show.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/img/eye_icon.png"))); // NOI18N
        show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });

        signup.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        signup.setForeground(new java.awt.Color(0, 166, 80));
        signup.setText("Sign up");
        signup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signupMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Don't have an account?");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 153, 153));
        jLabel18.setText("User type");

        comb_usertype.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        comb_usertype.setForeground(new java.awt.Color(94, 94, 94));
        comb_usertype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Admin", "Staff", "Student" }));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/img/usertype_icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(disable, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btn_login, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(comb_usertype, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGap(1, 1, 1)))
                                .addGap(0, 1, Short.MAX_VALUE)))
                        .addGap(84, 84, 84))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signup)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel3)
                .addGap(42, 42, 42)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(disable, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comb_usertype, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signup)
                    .addComponent(jLabel4))
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void disableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disableMouseClicked
        txtpassword.setEchoChar((char) 0);
        disable.setVisible(false);
        disable.setEnabled(false);
        show.setEnabled(true);
        show.setEnabled(true);
    }//GEN-LAST:event_disableMouseClicked

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        txtpassword.setEchoChar((char) 8226);
        disable.setVisible(true);
        disable.setEnabled(true);
        show.setEnabled(false);
        show.setEnabled(false);
    }//GEN-LAST:event_showMouseClicked

    private void signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseClicked
        this.setVisible(false);
        Signup object = new Signup();
        object.setVisible(true);
    }//GEN-LAST:event_signupMouseClicked

    private void signupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseEntered
        signup.setForeground(new java.awt.Color(0, 232, 112));
    }//GEN-LAST:event_signupMouseEntered

    private void signupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseExited
        signup.setForeground(new java.awt.Color(0, 166, 80));
    }//GEN-LAST:event_signupMouseExited

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        if (!(txtusername.getText().isEmpty() || txtpassword.getText().isEmpty() || comb_usertype.getSelectedItem().equals("Select"))) {
            String sql = "select User_id,Username,Password,User_type from user Where (Username =? and Password =? and User_type =?)";

            try {
                int count = 0;

                pst = conn.prepareStatement(sql);

                pst.setString(1, txtusername.getText());
                pst.setString(2, txtpassword.getText());
                pst.setString(3, comb_usertype.getSelectedItem().toString());

                rs = pst.executeQuery();
                {
                }
                while (rs.next()) {
                    int id = rs.getInt(1);
                    String un = rs.getString(2);
                    Emp.UserId = id;
                    Emp.UserName = un;
                    count = count + 1;
                }

                String access = (comb_usertype.getSelectedItem().toString());

                if (("Admin".equals(access))) {

                    if (count == 1) {

                        hms.admin.Dashboard j = new hms.admin.Dashboard();
                        j.setVisible(true);

                        this.dispose();

                        Date currentDate = GregorianCalendar.getInstance().getTime();
                        DateFormat df = DateFormat.getDateInstance();
                        String dateString = df.format(currentDate);

                        Date d = new Date();
                        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                        String timeString = sdf.format(d);

                        String value0 = timeString;
                        String values = dateString;

                        int value = Emp.UserId;
                        String reg = "insert into logs (User_id,Date,Status) values ('" + value + "','" + value0 + " / " + values + "','Logged in')";
                        pst = conn.prepareStatement(reg);
                        pst.execute();
                        this.dispose();
                    } else if (count > 1) {
                        getToolkit().beep();
                        JOptionPane.showMessageDialog(null, "Duplicate Username or Password Access denied", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else {
                        getToolkit().beep();
                        JOptionPane.showMessageDialog(null, "Username, Password or Usertype is not correct", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else if (("Staff".equals(access))) {

                    if (count == 1) {

                        hms.staff.Dashboard j = new hms.staff.Dashboard();
                        j.setVisible(true);

                        this.dispose();

                        Date currentDate = GregorianCalendar.getInstance().getTime();
                        DateFormat df = DateFormat.getDateInstance();
                        String dateString = df.format(currentDate);

                        Date d = new Date();
                        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                        String timeString = sdf.format(d);

                        String value0 = timeString;
                        String values = dateString;

                        int value = Emp.UserId;
                        String reg = "insert into logs (User_id,Date,Status) values ('" + value + "','" + value0 + " / " + values + "','Logged in')";
                        pst = conn.prepareStatement(reg);
                        pst.execute();
                        this.dispose();

                    } else if (count > 1) {
                        getToolkit().beep();
                        JOptionPane.showMessageDialog(null, "Duplicate Username or Password Access denied", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else {
                        getToolkit().beep();
                        JOptionPane.showMessageDialog(null, "Username, Password or Usertype is not correct", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else if (("Student".equals(access))) {

                    if (count == 1) {

                        hms.student.Dashboard j = new hms.student.Dashboard();
                        j.setVisible(true);

                        this.dispose();

                        Date currentDate = GregorianCalendar.getInstance().getTime();
                        DateFormat df = DateFormat.getDateInstance();
                        String dateString = df.format(currentDate);

                        Date d = new Date();
                        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                        String timeString = sdf.format(d);

                        String value0 = timeString;
                        String values = dateString;

                        int value = Emp.UserId;
                        String reg = "insert into logs (User_id,Date,Status) values ('" + value + "','" + value0 + " / " + values + "','Logged in')";
                        pst = conn.prepareStatement(reg);
                        pst.execute();
                        this.dispose();

                    } else if (count > 1) {
                        getToolkit().beep();
                        JOptionPane.showMessageDialog(null, "Duplicate Username or Password Access denied", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else {
                        getToolkit().beep();
                        JOptionPane.showMessageDialog(null, "Username, Password or Usertype is not correct", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
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
        } else {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "One or more required fields are empty", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_loginActionPerformed

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
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JComboBox<String> comb_usertype;
    private javax.swing.JLabel disable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel show;
    private javax.swing.JLabel signup;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
