package hms.admin;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.DocumentException;
import static com.itextpdf.text.Element.ALIGN_CENTER;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import hms.Emp;
import java.awt.Component;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import net.proteanit.sql.DbUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public final class All_Student extends javax.swing.JInternalFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public All_Student() {
        initComponents();
        setFrameIcon(null);
        conn = hms.db.connect();
        currentDate();
        shotime();
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
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM dd yyyy");
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

    static class Chooser extends JFileChooser {

        protected JDialog createDialog(Component parent)
                throws HeadlessException {
            JDialog dlg = super.createDialog(parent);
            dlg.setLocation(500, 300);
            return dlg;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        btnreset = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        student_table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnpdf = new javax.swing.JButton();
        btnexcel = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(251, 251, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(251, 251, 251));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(32, 40, 53))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(32, 40, 53));
        jLabel2.setText("Student ID: ");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 30, 90, 40));

        txt_search.setToolTipText("Type here to search");
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });
        jPanel4.add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 750, 37));

        btnreset.setText("Reset");
        btnreset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        jPanel4.add(btnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 30, 102, 38));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 1010, 90));

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
        student_table.setEnabled(false);
        student_table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(student_table);

        jPanel8.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 41, 970, 290));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 1010, 350));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnpdf.setText("Export as Pdf");
        btnpdf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnpdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpdfActionPerformed(evt);
            }
        });
        jPanel2.add(btnpdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 140, 38));

        btnexcel.setText("Export to Excel");
        btnexcel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnexcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcelActionPerformed(evt);
            }
        });
        jPanel2.add(btnexcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 150, 38));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 1010, 60));

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

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        Update_table();
        txt_search.setText("");
    }//GEN-LAST:event_btnresetActionPerformed

    private void btnpdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpdfActionPerformed
        String path = "";
        Chooser j = new Chooser();
        j.setDialogTitle("Export as Pdf");
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("PDF FILE", "pdf");
        j.setFileFilter(fnef);
        int pdfChooser = j.showSaveDialog(this);

        if (pdfChooser == JFileChooser.APPROVE_OPTION) {
            path = j.getSelectedFile().getPath();

            com.itextpdf.text.Font blueFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12, com.itextpdf.text.Font.NORMAL, new BaseColor(25, 27, 82));
            com.itextpdf.text.Document doc = new com.itextpdf.text.Document(PageSize.A4.rotate());
            Calendar cal = new GregorianCalendar();
            int month = cal.get(Calendar.MONTH);
            int year = cal.get(Calendar.YEAR);
            int day = cal.get(Calendar.DAY_OF_MONTH);

            try {
                PdfWriter.getInstance((com.itextpdf.text.Document) doc, new FileOutputStream(path + ".pdf"));
                doc.open();

                doc.add(new Paragraph((new Chunk("Student Details Report" + "\n", blueFont))));
                doc.add(new Paragraph((year) + "." + (month + 1) + "." + day));
                PdfPTable tb1 = new PdfPTable(12);
                tb1.setHorizontalAlignment(ALIGN_CENTER);
                tb1.setWidthPercentage(100);
                tb1.setSpacingBefore(10f);
                tb1.setSpacingAfter(10f);

                PdfPCell cell = new PdfPCell(new Paragraph("Student Details"));
                cell.setColspan(12);
                cell.setHorizontalAlignment(ALIGN_CENTER);
                cell.setBackgroundColor(new BaseColor(0, 166, 80));
                cell.setPadding(10.0f);
                tb1.addCell(cell);

                PdfPCell cell2 = new PdfPCell(new Paragraph("Name"));
                cell2.setColspan(1);
                cell2.setBackgroundColor(BaseColor.LIGHT_GRAY);
                cell2.setPadding(5.0f);
                tb1.addCell(cell2);

                PdfPCell cell3 = new PdfPCell(new Paragraph("Address"));
                cell3.setColspan(1);
                cell3.setBackgroundColor(BaseColor.LIGHT_GRAY);
                cell3.setPadding(5.0f);
                tb1.addCell(cell3);

                PdfPCell cell4 = new PdfPCell(new Paragraph("Gender"));
                cell4.setColspan(1);
                cell4.setBackgroundColor(BaseColor.LIGHT_GRAY);
                cell4.setPadding(5.0f);
                tb1.addCell(cell4);

                PdfPCell cell5 = new PdfPCell(new Paragraph("Guardian"));
                cell5.setColspan(1);
                cell5.setBackgroundColor(BaseColor.LIGHT_GRAY);
                cell5.setPadding(5.0f);
                tb1.addCell(cell5);

                PdfPCell cell6 = new PdfPCell(new Paragraph("Student_id"));
                cell6.setColspan(1);
                cell6.setBackgroundColor(BaseColor.LIGHT_GRAY);
                cell6.setPadding(5.0f);
                tb1.addCell(cell6);

                PdfPCell cell7 = new PdfPCell(new Paragraph("Study_year"));
                cell7.setColspan(1);
                cell7.setBackgroundColor(BaseColor.LIGHT_GRAY);
                cell7.setPadding(5.0f);
                tb1.addCell(cell7);

                PdfPCell cell8 = new PdfPCell(new Paragraph("NIC"));
                cell8.setColspan(1);
                cell8.setBackgroundColor(BaseColor.LIGHT_GRAY);
                cell8.setPadding(5.0f);
                tb1.addCell(cell8);

                PdfPCell cell9 = new PdfPCell(new Paragraph("Contact_no"));
                cell9.setColspan(1);
                cell9.setBackgroundColor(BaseColor.LIGHT_GRAY);
                cell9.setPadding(5.0f);
                tb1.addCell(cell9);

                PdfPCell cell10 = new PdfPCell(new Paragraph("Email"));
                cell10.setColspan(1);
                cell10.setBackgroundColor(BaseColor.LIGHT_GRAY);
                cell10.setPadding(5.0f);
                tb1.addCell(cell10);

                PdfPCell cell11 = new PdfPCell(new Paragraph("Emg_contact"));
                cell11.setColspan(1);
                cell11.setBackgroundColor(BaseColor.LIGHT_GRAY);
                cell11.setPadding(5.0f);
                tb1.addCell(cell11);

                PdfPCell cell12 = new PdfPCell(new Paragraph("Programme"));
                cell12.setColspan(1);
                cell12.setBackgroundColor(BaseColor.LIGHT_GRAY);
                cell12.setPadding(5.0f);
                tb1.addCell(cell12);

                PdfPCell cell13 = new PdfPCell(new Paragraph("Room_no"));
                cell13.setColspan(1);
                cell13.setBackgroundColor(BaseColor.LIGHT_GRAY);
                cell13.setPadding(5.0f);
                tb1.addCell(cell13);

                for (int i = 0; i < student_table.getRowCount(); i++) {

                    String name = student_table.getValueAt(i, 0).toString();
                    String address = student_table.getValueAt(i, 1).toString();
                    String gender = student_table.getValueAt(i, 2).toString();
                    String guardian = student_table.getValueAt(i, 3).toString();
                    String id = student_table.getValueAt(i, 4).toString();
                    String study_year = student_table.getValueAt(i, 5).toString();
                    String nic = student_table.getValueAt(i, 6).toString();
                    String contact_no = student_table.getValueAt(i, 7).toString();
                    String email = student_table.getValueAt(i, 8).toString();
                    String emg_contact = student_table.getValueAt(i, 9).toString();
                    String programme = student_table.getValueAt(i, 10).toString();
                    String room_no = student_table.getValueAt(i, 11).toString();

                    tb1.addCell(name);
                    tb1.addCell(address);
                    tb1.addCell(gender);
                    tb1.addCell(guardian);
                    tb1.addCell(id);
                    tb1.addCell(study_year);
                    tb1.addCell(nic);
                    tb1.addCell(contact_no);
                    tb1.addCell(email);
                    tb1.addCell(emg_contact);
                    tb1.addCell(programme);
                    tb1.addCell(room_no);
                }
                doc.add(tb1);
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Export Successfully");
            } catch (FileNotFoundException | DocumentException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
            doc.close();

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
                String reg = "insert into logs (User_id,Date,Status) values ('" + value + "','" + value0 + " / " + values + "','Export student details as PDF')";
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
        }
    }//GEN-LAST:event_btnpdfActionPerformed

    private void btnexcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcelActionPerformed
        FileOutputStream excelFOU = null;
        BufferedOutputStream excelBOU = null;
        XSSFWorkbook excelJTableExport = null;

        DefaultTableModel model = (DefaultTableModel) student_table.getModel();

        Chooser excelFileChooser = new Chooser();
        excelFileChooser.setDialogTitle("Export to Excel");
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("EXCEL FILE", "xls", "xlsx", "xlsm");
        excelFileChooser.setFileFilter(fnef);
        int excelChooser = excelFileChooser.showSaveDialog(this);

        if (excelChooser == JFileChooser.APPROVE_OPTION) {

            try {
                excelJTableExport = new XSSFWorkbook();
                XSSFSheet excelSheet = excelJTableExport.createSheet("Student Details Report");

                excelSheet.setColumnWidth(1, 8000);
                excelSheet.setColumnWidth(2, 4000);
                excelSheet.setColumnWidth(3, 10000);
                excelSheet.setColumnWidth(4, 10000);
                excelSheet.setColumnWidth(5, 4000);
                excelSheet.setColumnWidth(6, 4000);
                excelSheet.setColumnWidth(7, 4000);
                excelSheet.setColumnWidth(8, 8000);
                excelSheet.setColumnWidth(9, 4000);
                excelSheet.setColumnWidth(10, 4000);
                excelSheet.setColumnWidth(11, 4000);
                excelSheet.setColumnWidth(12, 4000);

                XSSFRow header = excelSheet.createRow(0);

                for (int i = 0; i < model.getColumnCount(); i++) {
                    XSSFCell cell = header.createCell(i);
                    cell.setCellValue(model.getColumnName(i));
                }

                for (int i = 0; i < model.getRowCount(); i++) {

                    XSSFRow excelRow = excelSheet.createRow(i + 1);

                    for (int j = 0; j < model.getColumnCount(); j++) {
                        XSSFCell excelCell = excelRow.createCell(j);
                        excelCell.setCellValue(model.getValueAt(i, j).toString());
                    }
                }
                excelFOU = new FileOutputStream(excelFileChooser.getSelectedFile() + ".xlsx");
                excelBOU = new BufferedOutputStream(excelFOU);
                excelJTableExport.write(excelBOU);
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Export Successfully");

            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, e);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {
                try {
                    if (excelBOU != null) {
                        excelBOU.close();
                    }
                    if (excelFOU != null) {
                        excelFOU.close();
                    }
                    if (excelJTableExport != null) {
                        excelJTableExport.close();
                    }
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, e);
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
                String reg = "insert into logs (User_id,Date,Status) values ('" + value + "','" + value0 + " / " + values + "','Export student details to Excel')";
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
        }

    }//GEN-LAST:event_btnexcelActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        try {

            String sql = "select * from student where Student_id=? ";

            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_search.getText());
            rs = pst.executeQuery();
            student_table.setModel(DbUtils.resultSetToTableModel(rs));

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
    }//GEN-LAST:event_txt_searchKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexcel;
    private javax.swing.JButton btnpdf;
    private javax.swing.JButton btnreset;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable student_table;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
