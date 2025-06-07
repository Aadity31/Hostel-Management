package hms.student;

import hms.Profile;
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Color;
import java.awt.Dimension;
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
import java.util.Objects;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public final class Dashboard extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public Dashboard() {
        initComponents();
        setIconImage(new ImageIcon(Objects.requireNonNull(getClass().getResource("/hms/img/HMS.png"))).getImage());
        conn = hms.db.connect();
        setColor(btn_1);
        ind_1.setOpaque(true);
        resetColor(new JPanel[]{btn_2, btn_3, btn_4, btn_5, btn_6}, new JPanel[]{ind_2, ind_3, ind_4, ind_5, ind_6});
        currentDate();
        shotime();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2,
                size.height / 2 - getHeight() / 2);
        desktop_pane.removeAll();
        Inner_Dashboard d1 = new Inner_Dashboard();
        desktop_pane.add(d1).setVisible(true);
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        side_pane = new javax.swing.JPanel();
        btn_1 = new javax.swing.JPanel();
        ind_1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btn_2 = new javax.swing.JPanel();
        ind_3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btn_3 = new javax.swing.JPanel();
        ind_4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btn_4 = new javax.swing.JPanel();
        ind_2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btn_5 = new javax.swing.JPanel();
        ind_5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btn_6 = new javax.swing.JPanel();
        ind_6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtabout = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnprofile = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        desktop_pane = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        side_pane.setBackground(new java.awt.Color(25, 27, 82));
        side_pane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_1.setBackground(new java.awt.Color(25, 27, 82));
        btn_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_1MousePressed(evt);
            }
        });

        ind_1.setOpaque(false);
        ind_1.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_1Layout = new javax.swing.GroupLayout(ind_1);
        ind_1.setLayout(ind_1Layout);
        ind_1Layout.setHorizontalGroup(
            ind_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_1Layout.setVerticalGroup(
            ind_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/img/dashboard_icon.png"))); // NOI18N
        jLabel8.setText(" Dashboard");

        javax.swing.GroupLayout btn_1Layout = new javax.swing.GroupLayout(btn_1);
        btn_1.setLayout(btn_1Layout);
        btn_1Layout.setHorizontalGroup(
            btn_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_1Layout.createSequentialGroup()
                .addComponent(ind_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel8)
                .addGap(0, 91, Short.MAX_VALUE))
        );
        btn_1Layout.setVerticalGroup(
            btn_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_1Layout.createSequentialGroup()
                .addComponent(ind_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_pane.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 250, -1));

        btn_2.setBackground(new java.awt.Color(25, 27, 82));
        btn_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_2MousePressed(evt);
            }
        });

        ind_3.setOpaque(false);
        ind_3.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_3Layout = new javax.swing.GroupLayout(ind_3);
        ind_3.setLayout(ind_3Layout);
        ind_3Layout.setHorizontalGroup(
            ind_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_3Layout.setVerticalGroup(
            ind_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/img/room_icon.png"))); // NOI18N
        jLabel10.setText(" Room Details");

        javax.swing.GroupLayout btn_2Layout = new javax.swing.GroupLayout(btn_2);
        btn_2.setLayout(btn_2Layout);
        btn_2Layout.setHorizontalGroup(
            btn_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_2Layout.createSequentialGroup()
                .addComponent(ind_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel10)
                .addGap(0, 70, Short.MAX_VALUE))
        );
        btn_2Layout.setVerticalGroup(
            btn_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_2Layout.createSequentialGroup()
                .addComponent(ind_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_pane.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 60, 250, -1));

        btn_3.setBackground(new java.awt.Color(25, 27, 82));
        btn_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_3MousePressed(evt);
            }
        });

        ind_4.setOpaque(false);
        ind_4.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_4Layout = new javax.swing.GroupLayout(ind_4);
        ind_4.setLayout(ind_4Layout);
        ind_4Layout.setHorizontalGroup(
            ind_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_4Layout.setVerticalGroup(
            ind_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/img/users_icon.png"))); // NOI18N
        jLabel11.setText(" Registration");

        javax.swing.GroupLayout btn_3Layout = new javax.swing.GroupLayout(btn_3);
        btn_3.setLayout(btn_3Layout);
        btn_3Layout.setHorizontalGroup(
            btn_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_3Layout.createSequentialGroup()
                .addComponent(ind_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel11)
                .addGap(0, 79, Short.MAX_VALUE))
        );
        btn_3Layout.setVerticalGroup(
            btn_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_3Layout.createSequentialGroup()
                .addComponent(ind_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_pane.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 110, 250, -1));

        btn_4.setBackground(new java.awt.Color(25, 27, 82));
        btn_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_4MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_4MouseReleased(evt);
            }
        });

        ind_2.setOpaque(false);
        ind_2.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_2Layout = new javax.swing.GroupLayout(ind_2);
        ind_2.setLayout(ind_2Layout);
        ind_2Layout.setHorizontalGroup(
            ind_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_2Layout.setVerticalGroup(
            ind_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/img/dollar_icon.png"))); // NOI18N
        jLabel9.setText(" Student Fees");

        javax.swing.GroupLayout btn_4Layout = new javax.swing.GroupLayout(btn_4);
        btn_4.setLayout(btn_4Layout);
        btn_4Layout.setHorizontalGroup(
            btn_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_4Layout.createSequentialGroup()
                .addComponent(ind_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel9)
                .addGap(0, 74, Short.MAX_VALUE))
        );
        btn_4Layout.setVerticalGroup(
            btn_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_4Layout.createSequentialGroup()
                .addComponent(ind_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_pane.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 160, 250, -1));

        btn_5.setBackground(new java.awt.Color(25, 27, 82));
        btn_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_5MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_5MouseReleased(evt);
            }
        });

        ind_5.setOpaque(false);
        ind_5.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_5Layout = new javax.swing.GroupLayout(ind_5);
        ind_5.setLayout(ind_5Layout);
        ind_5Layout.setHorizontalGroup(
            ind_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_5Layout.setVerticalGroup(
            ind_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/img/info_icon.png"))); // NOI18N
        jLabel12.setText(" Hostel Rules");

        javax.swing.GroupLayout btn_5Layout = new javax.swing.GroupLayout(btn_5);
        btn_5.setLayout(btn_5Layout);
        btn_5Layout.setHorizontalGroup(
            btn_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_5Layout.createSequentialGroup()
                .addComponent(ind_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel12)
                .addGap(0, 77, Short.MAX_VALUE))
        );
        btn_5Layout.setVerticalGroup(
            btn_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_5Layout.createSequentialGroup()
                .addComponent(ind_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_pane.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 210, 250, -1));

        btn_6.setBackground(new java.awt.Color(25, 27, 82));
        btn_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_6MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_6MouseReleased(evt);
            }
        });

        ind_6.setOpaque(false);
        ind_6.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_6Layout = new javax.swing.GroupLayout(ind_6);
        ind_6.setLayout(ind_6Layout);
        ind_6Layout.setHorizontalGroup(
            ind_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_6Layout.setVerticalGroup(
            ind_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/img/contact_icon.png"))); // NOI18N
        jLabel13.setText(" Hostel Contacts");

        javax.swing.GroupLayout btn_6Layout = new javax.swing.GroupLayout(btn_6);
        btn_6.setLayout(btn_6Layout);
        btn_6Layout.setHorizontalGroup(
            btn_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_6Layout.createSequentialGroup()
                .addComponent(ind_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel13)
                .addGap(0, 49, Short.MAX_VALUE))
        );
        btn_6Layout.setVerticalGroup(
            btn_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_6Layout.createSequentialGroup()
                .addComponent(ind_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_pane.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 260, 250, -1));

        jPanel3.setBackground(new java.awt.Color(14, 86, 81));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtabout.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtabout.setForeground(new java.awt.Color(255, 255, 255));
        txtabout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtabout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/img/uparrow_icon.png"))); // NOI18N
        txtabout.setText("About HMS ");
        txtabout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtabout.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        txtabout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtaboutMouseClicked(evt);
            }
        });
        jPanel3.add(txtabout, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 30));

        side_pane.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 240, 60));

        getContentPane().add(side_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 240, 560));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/img/hms_header.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 16, -1, 70));

        btnprofile.setBackground(new java.awt.Color(0, 166, 80));
        btnprofile.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnprofile.setForeground(new java.awt.Color(255, 255, 255));
        btnprofile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/img/profile_icon.png"))); // NOI18N
        btnprofile.setText("Profile");
        btnprofile.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnprofile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprofileActionPerformed(evt);
            }
        });
        jPanel1.add(btnprofile, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 30, 146, 47));

        btnlogout.setBackground(new java.awt.Color(236, 29, 37));
        btnlogout.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnlogout.setForeground(new java.awt.Color(255, 255, 255));
        btnlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/img/logout_icon.png"))); // NOI18N
        btnlogout.setText(" Log out");
        btnlogout.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnlogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 30, 144, 47));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 100));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout desktop_paneLayout = new javax.swing.GroupLayout(desktop_pane);
        desktop_pane.setLayout(desktop_paneLayout);
        desktop_paneLayout.setHorizontalGroup(
            desktop_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1070, Short.MAX_VALUE)
        );
        desktop_paneLayout.setVerticalGroup(
            desktop_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        jPanel2.add(desktop_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 1060, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MousePressed
        setColor(btn_1);
        ind_1.setOpaque(true);
        resetColor(new JPanel[]{btn_4, btn_2, btn_3, btn_5, btn_6}, new JPanel[]{ind_2, ind_3, ind_4, ind_5, ind_6});

        desktop_pane.removeAll();
        Inner_Dashboard d1 = new Inner_Dashboard();
        desktop_pane.add(d1).setVisible(true);
    }//GEN-LAST:event_btn_1MousePressed

    private void btn_4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_4MouseReleased
        setColor(btn_4);
        ind_2.setOpaque(true);
        resetColor(new JPanel[]{btn_1, btn_2, btn_3, btn_5, btn_6}, new JPanel[]{ind_4, ind_3, ind_1, ind_5, ind_6});
    }//GEN-LAST:event_btn_4MouseReleased

    private void btn_2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MousePressed
        setColor(btn_2);
        ind_3.setOpaque(true);
        resetColor(new JPanel[]{btn_4, btn_1, btn_3, btn_5, btn_6}, new JPanel[]{ind_2, ind_1, ind_4, ind_5, ind_6});
    }//GEN-LAST:event_btn_2MousePressed

    private void btn_3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3MousePressed
        setColor(btn_3);
        ind_4.setOpaque(true);
        resetColor(new JPanel[]{btn_4, btn_2, btn_1, btn_5, btn_6}, new JPanel[]{ind_3, ind_2, ind_1, ind_5, ind_6});
    }//GEN-LAST:event_btn_3MousePressed

    private void btn_5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_5MouseReleased
        setColor(btn_5);
        ind_5.setOpaque(true);
        resetColor(new JPanel[]{btn_1, btn_2, btn_3, btn_4, btn_6}, new JPanel[]{ind_1, ind_2, ind_3, ind_4, ind_6});
    }//GEN-LAST:event_btn_5MouseReleased

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        getToolkit().beep();
        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "Logout", JOptionPane.YES_NO_OPTION);
        if (option == 0) {
            hms.Login j = new hms.Login();
            j.setVisible(true);
            this.dispose();

            try {
                Date currentDate = GregorianCalendar.getInstance().getTime();
                DateFormat df = DateFormat.getDateInstance();
                String dateString = df.format(currentDate);

                Date d = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String timeString = sdf.format(d);

                String value0 = timeString;
                String values = dateString;

                int value = hms.Emp.UserId;
                String reg = "insert into logs (User_id,Date,Status) values ('" + value + "','" + value0 + " / " + values + "','Logged out')";
                pst = conn.prepareStatement(reg);
                pst.execute();
                this.dispose();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {

                try {
                    pst.close();

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btn_6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_6MouseReleased
        setColor(btn_6);
        ind_6.setOpaque(true);
        resetColor(new JPanel[]{btn_1, btn_2, btn_3, btn_4, btn_5}, new JPanel[]{ind_1, ind_2, ind_3, ind_4, ind_5});
    }//GEN-LAST:event_btn_6MouseReleased

    private void txtaboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtaboutMouseClicked
        hms.About j = new hms.About();
        j.setVisible(true);
    }//GEN-LAST:event_txtaboutMouseClicked

    private void btn_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MouseClicked
        desktop_pane.removeAll();
        Inner_Dashboard d1 = new Inner_Dashboard();
        desktop_pane.add(d1).setVisible(true);
    }//GEN-LAST:event_btn_1MouseClicked

    private void btn_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MouseClicked
        desktop_pane.removeAll();
        Rooms r = new Rooms();
        desktop_pane.add(r).setVisible(true);
    }//GEN-LAST:event_btn_2MouseClicked

    private void btnprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprofileActionPerformed
        Profile p = new Profile();
        p.setVisible(true);
    }//GEN-LAST:event_btnprofileActionPerformed

    private void btn_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3MouseClicked
        desktop_pane.removeAll();
        Student stu = new Student();
        desktop_pane.add(stu).setVisible(true);
    }//GEN-LAST:event_btn_3MouseClicked

    private void btn_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_5MouseClicked
        desktop_pane.removeAll();
        Rules rule = new Rules();
        desktop_pane.add(rule).setVisible(true);
    }//GEN-LAST:event_btn_5MouseClicked

    private void btn_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_6MouseClicked
        desktop_pane.removeAll();
        Contact con = new Contact();
        desktop_pane.add(con).setVisible(true);
    }//GEN-LAST:event_btn_6MouseClicked

    private void btn_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_4MouseClicked
        desktop_pane.removeAll();
        Fees fee = new Fees();
        desktop_pane.add(fee).setVisible(true);
    }//GEN-LAST:event_btn_4MouseClicked

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
                new Dashboard().setVisible(true);
            }
        });
    }

    private void setColor(JPanel pane) {
        pane.setBackground(new Color(45, 48, 145));
    }

    private void resetColor(JPanel[] pane, JPanel[] indicators) {
        for (int i = 0; i < pane.length; i++) {
            pane[i].setBackground(new Color(25, 27, 82));

        }
        for (int i = 0; i < indicators.length; i++) {
            indicators[i].setOpaque(false);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_1;
    private javax.swing.JPanel btn_2;
    private javax.swing.JPanel btn_3;
    private javax.swing.JPanel btn_4;
    private javax.swing.JPanel btn_5;
    private javax.swing.JPanel btn_6;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnprofile;
    private javax.swing.JDesktopPane desktop_pane;
    private javax.swing.JPanel ind_1;
    private javax.swing.JPanel ind_2;
    private javax.swing.JPanel ind_3;
    private javax.swing.JPanel ind_4;
    private javax.swing.JPanel ind_5;
    private javax.swing.JPanel ind_6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel side_pane;
    private javax.swing.JLabel txtabout;
    // End of variables declaration//GEN-END:variables
}
