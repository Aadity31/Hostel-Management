package hms.student;

import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.Timer;

public final class Rules extends javax.swing.JInternalFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public Rules() {
        initComponents();
        setFrameIcon(null);
        conn = hms.db.connect();
        currentDate();
        shotime();
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(251, 251, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(251, 251, 251));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hostel Rules", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(32, 40, 53))); // NOI18N
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextPane1.setEditable(false);
        jTextPane1.setBorder(null);
        jTextPane1.setText(" \n  Hostel management rules aim to create a secure, comfortable, and respectful environment for residents, particularly students and workers.\n\n  1. Entry and Exit Rules\n\n   - Set a curfew for residents; late entry may require permission.\n   - Allow visitors only during specific hours and in common areas.\n   - Use entry cards for security at the gate.\n\n  2. Room and Property Management\n\n   - Maintain cleanliness in personal and shared spaces with regular inspections.\n   - Prohibit alterations to room structures, such as painting or adding shelves.\n   - Limit appliances in rooms to ensure safety and energy efficiency.\n\n  3. Code of Conduct\n\n   - Respect fellow residents’ privacy and property; harassment is not tolerated.\n   - Enforce a no-smoking and no-alcohol rule in designated areas.\n   - Implement noise restrictions, especially during study hours and at night.\n\n  4. Safety and Security\n\n   - Prohibit weapons, flammable materials, and narcotics.\n   - Outline fire safety procedures and provide emergency contact numbers.\n   - Report suspicious activities to management immediately.\n\n  5. Penalties and Enforcement\n\n   - Impose fines, warnings, or expulsion for rule violations.\n   - Hold regular meetings to keep residents informed about rules.\n\n  While rules differ across institutions, their goal remains the same: to foster a safe and organized living environment for everyone.\n");
        jScrollPane1.setViewportView(jTextPane1);

        jPanel8.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 970, 460));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 1010, 510));

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
    private String month;
}
