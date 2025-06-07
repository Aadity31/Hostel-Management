package hms.student;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import javax.swing.Timer;

public final class Contact extends javax.swing.JInternalFrame {

    public Contact() {
        initComponents();
        setFrameIcon(null);
        currentDate();
        showTime();
        addText();
    }

    public static String now(String dateFormat) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        return sdf.format(cal.getTime());
    }

    public void currentDate() {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM dd yyyy");
        // Use this string to set to a label if needed
        String dateString = sdf.format(d);
        System.out.println("Current Date: " + dateString); // For debugging
    }

    public void showTime() {
        new Timer(1000, (ActionEvent e) -> {
            Date d = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
            String time = sdf.format(d);
            System.out.println("Current Time: " + time); // For debugging or future label update
        }).start();
    }

    public void addText() {
        String myText1 = "If you have any question or need further information, please feel free to contact us. "
                + "Our dedicated team is here to assist you with any inquiries related to our programs, admissions "
                + "and services. We look forward to helping you on your educational journey.";
        txt_para.setText("<html>" + myText1 + "</html>");

        String myText2 = "Graphic Era Hill University, Clementown, Dehradun, Uttarakhand";
        txt_location.setText("<html>" + myText2 + "</html>");
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_para = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_location = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(251, 251, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(251, 251, 251));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/img/NIIBS_Map.png")));
        jPanel8.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -150, 1110, 490));

        txt_para.setFont(new java.awt.Font("Tahoma", 0, 15));
        txt_para.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel8.add(txt_para, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 970, 130));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/img/map_icon.png")));
        jLabel2.setText(" Location");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 110, -1));

        txt_location.setFont(new java.awt.Font("Tahoma", 0, 12));
        jPanel2.add(txt_location, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 290, 40));

        jPanel8.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, 320, 100));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 18));
        jLabel3.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/hms/img/telephone_icon.png"))));
        jLabel3.setText(" Phone");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 110, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 24));
        jLabel6.setText("+8755832353");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 190, 30));

        jPanel8.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 310, 100));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel4.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/hms/img/email_icon.png"))));
        jLabel4.setText(" Email");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 110, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel7.setText("rawdirathore@gmail.com");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 220, 30));

        jPanel8.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 310, 100));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 1020, 510));

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

        pack();
    }

    // Variables declaration
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel txt_location;
    private javax.swing.JLabel txt_para;
    // End of variables declaration
}
