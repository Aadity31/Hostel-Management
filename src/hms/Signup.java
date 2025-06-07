package hms;

import com.formdev.flatlaf.FlatIntelliJLaf;

import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Signup extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public Signup() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/hms/img/HMS.png")).getImage());
        conn = db.connect();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2,
                size.height / 2 - getHeight() / 2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_register = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        disable1 = new javax.swing.JLabel();
        show1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtcompassword = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        disable2 = new javax.swing.JLabel();
        show2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comb_usertype = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign up");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/hms/img/Login Img.png")))); // NOI18N

        btn_register.setBackground(new java.awt.Color(0, 166, 80));
        btn_register.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_register.setForeground(new java.awt.Color(255, 255, 255));
        btn_register.setText("Sign up");
        btn_register.setBorder(null);
        btn_register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segue UI", Font.PLAIN, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Password");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/hms/img/user_icon.png")))); // NOI18N

        jLabel17.setFont(new java.awt.Font("Segue UI", Font.PLAIN, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 153, 153));
        jLabel17.setText("Username");

        txtpassword.setFont(txtpassword.getFont().deriveFont((float)18));
        txtpassword.setForeground(new java.awt.Color(94, 94, 94));
        txtpassword.setBorder(null);
        txtpassword.setEchoChar((char)8226);

        jLabel12.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("_________________________________________");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("_________________________________________");

        txtusername.setFont(txtusername.getFont().deriveFont((float)18));
        txtusername.setForeground(new java.awt.Color(94, 94, 94));
        txtusername.setBorder(null);

        disable1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        disable1.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/hms/img/invisible_icon.png")))); // NOI18N
        disable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        disable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disable1MouseClicked(evt);
            }
        });

        show1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show1.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/hms/img/eye_icon.png")))); // NOI18N
        show1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                show1MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Back to sign in");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(45, 48, 145));
        jLabel5.setText("New User Registration");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("_________________________________________");

        txtcompassword.setFont(txtcompassword.getFont().deriveFont((float)18));
        txtcompassword.setForeground(new java.awt.Color(94, 94, 94));
        txtcompassword.setBorder(null);
        txtcompassword.setEchoChar((char)8226);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Comfirm password");

        disable2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        disable2.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/hms/img/invisible_icon.png")))); // NOI18N
        disable2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        disable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disable2MouseClicked(evt);
            }
        });

        show2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show2.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/hms/img/eye_icon.png")))); // NOI18N
        show2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                show2MouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 153, 153));
        jLabel18.setText("User type");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/hms/img/usertype_icon.png")))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/hms/img/back_icon.png")))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        comb_usertype.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        comb_usertype.setForeground(new java.awt.Color(94, 94, 94));
        comb_usertype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Student" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                                    .addComponent(txtcompassword, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(disable1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(show1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(disable2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(show2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(comb_usertype, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel10))
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btn_register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(120, 120, 120))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addGap(34, 34, 34)
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
                    .addComponent(disable1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(show1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcompassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(disable2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(show2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comb_usertype, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_register, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void disable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disable1MouseClicked
        txtpassword.setEchoChar((char) 0);
        disable1.setVisible(false);
        disable1.setEnabled(false);
        show1.setEnabled(true);
        show1.setEnabled(true);
    }//GEN-LAST:event_disable1MouseClicked

    private void show1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show1MouseClicked
        txtpassword.setEchoChar((char) 8226);
        disable1.setVisible(true);
        disable1.setEnabled(true);
        show1.setEnabled(false);
        show1.setEnabled(false);
    }//GEN-LAST:event_show1MouseClicked

    private void disable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disable2MouseClicked
        txtcompassword.setEchoChar((char) 0);
        disable2.setVisible(false);
        disable2.setEnabled(false);
        show2.setEnabled(true);
        show2.setEnabled(true);
    }//GEN-LAST:event_disable2MouseClicked

    private void show2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show2MouseClicked
        txtcompassword.setEchoChar((char) 8226);
        disable2.setVisible(true);
        disable2.setEnabled(true);
        show2.setEnabled(false);
        show2.setEnabled(false);
    }//GEN-LAST:event_show2MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setVisible(false);
        Login object = new Login();
        object.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
        String username = txtusername.getText();
        if (!username.matches("^[a-zA-Z0-9]+$")) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Username can only contain letters and numbers", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtusername.getText().isEmpty()) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Please Enter Username", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (txtpassword.getText().isEmpty()) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Please Enter Password", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!txtpassword.getText().equals(txtcompassword.getText())) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Password Not Matched", "Error", JOptionPane.ERROR_MESSAGE);
        } else if ((comb_usertype.getSelectedItem().equals("Select"))) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Please Select Usertype", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {


                String confirmpass = txtcompassword.getText();
                String usertype = comb_usertype.getSelectedItem().toString();

                pst = conn.prepareStatement("insert into user(Username,Password,User_type)values(?,?,?)");
                pst.setString(1, username);
                pst.setString(2, confirmpass);
                pst.setString(3, usertype);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Account Created", "Sucsses", JOptionPane.INFORMATION_MESSAGE);
                txtusername.setText("");
                txtpassword.setText("");
                txtcompassword.setText("");
                comb_usertype.setSelectedIndex(0);
                txtusername.requestFocus();

            } catch (SQLException ex) {
                Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            Date currentDate = GregorianCalendar.getInstance().getTime();
            DateFormat df = DateFormat.getDateInstance();
            String dateString = df.format(currentDate);

            Date d = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            String timeString = sdf.format(d);

            String value0 = timeString;
            String values = dateString;

            int value = Emp.UserId;
            String reg = "insert into logs (User_id,Date,Status) values ('" + value + "','" + value0 + " / " + values + "','New account created')";
            pst = conn.prepareStatement(reg);
            pst.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {

            try {
                pst.close();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btn_registerActionPerformed

    public static void main(String[] args) {

        try {
            FlatIntelliJLaf.registerCustomDefaultsSource("hms.style");
            FlatIntelliJLaf.setup();
        } catch (Exception e) {
            e.printStackTrace();
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_register;
    private javax.swing.JComboBox<String> comb_usertype;
    private javax.swing.JLabel disable1;
    private javax.swing.JLabel disable2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel show1;
    private javax.swing.JLabel show2;
    private javax.swing.JPasswordField txtcompassword;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
