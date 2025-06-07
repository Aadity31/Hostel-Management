package hms.student;

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
import java.text.ParseException;
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

public final class Fees extends javax.swing.JInternalFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public Fees() {
        initComponents();
        setFrameIcon(null);
        conn = hms.db.connect();
        currentDate();
        shotime();
        tableHeader();
        Update_table();
        txtname.requestFocus();
        fees_table.setAutoCreateRowSorter(true);
        Toolkit toolkit = getToolkit();
    }

    public void tableHeader() {
        JTableHeader header1 = fees_table.getTableHeader();
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
        
        String tmp = Emp.UserName;
        
        try {
            String sql = "select * from fees where Student_id=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, tmp);
            rs = pst.executeQuery();
            fees_table.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtstuid = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtmonth = new javax.swing.JComboBox<>();
        txtinvoice = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        add_date = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        txtamount = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        clear_btn = new javax.swing.JButton();
        add_btn = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        fees_table = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnpdf = new javax.swing.JButton();
        btnexcel = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        txt_search = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(251, 251, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(251, 251, 251));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Fees", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(32, 40, 53))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(32, 40, 53));
        jLabel6.setText("Student ID:");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 80, 31));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(32, 40, 53));
        jLabel8.setText("Name:");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 60, 30));
        jPanel7.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 290, 30));

        txtstuid.setToolTipText("No need to add. System automatic generated.");
        jPanel7.add(txtstuid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 290, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(32, 40, 53));
        jLabel10.setText("Month:");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 60, 30));

        txtmonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jPanel7.add(txtmonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, 290, 30));
        jPanel7.add(txtinvoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 290, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(32, 40, 53));
        jLabel11.setText("Invoice No:");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 80, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(32, 40, 53));
        jLabel9.setText("Date:");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 50, 30));
        jPanel7.add(add_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 290, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(32, 40, 53));
        jLabel12.setText("Amount:");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 70, 30));
        jPanel7.add(txtamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 290, 30));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        clear_btn.setText("Clear");
        clear_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btnActionPerformed(evt);
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
                .addGap(754, 754, 754)
                .addComponent(add_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clear_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel7.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1010, 60));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -4, 1010, 220));

        jPanel8.setBackground(new java.awt.Color(251, 251, 251));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Payment Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(32, 40, 53))); // NOI18N
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fees_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Student_id", "Name", "Date", "Month", "Invoice_no", "Amount"
            }
        ));
        fees_table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(fees_table);

        jPanel8.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 41, 970, 160));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnpdf.setText("Export as Pdf");
        btnpdf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnpdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpdfActionPerformed(evt);
            }
        });
        jPanel3.add(btnpdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 140, 38));

        btnexcel.setText("Export to Excel");
        btnexcel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnexcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcelActionPerformed(evt);
            }
        });
        jPanel3.add(btnexcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 150, 38));

        btnreset.setText("Reset");
        btnreset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        jPanel3.add(btnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 102, 38));

        txt_search.setToolTipText("Type here to search");
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });
        jPanel3.add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 310, 37));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(32, 40, 53));
        jLabel2.setText("Search by Month: ");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 130, 40));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 40, 60));

        jPanel8.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 1010, 60));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 1010, 280));

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
        if (!(txtstuid.getText().isEmpty() || txtname.getText().isEmpty() || add_date.getDate() == null || txtmonth.getSelectedItem().equals("Select") || txtinvoice.getText().isEmpty() || txtamount.getText().isEmpty())) {
            try {
                String sql = "insert into fees"
                        + "(Student_id,Name,Date,Month,Invoice_no,Amount) values (?,?,?,?,?,?)";

                pst = conn.prepareStatement(sql);
                pst.setString(1, txtstuid.getText());
                pst.setString(2, txtname.getText());

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
                String date = sdf.format(add_date.getDate());

                pst.setString(3, date);
                pst.setString(4, txtmonth.getSelectedItem().toString());
                pst.setString(5, txtinvoice.getText());
                pst.setString(6, txtamount.getText());

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

                String reg = "insert into logs (User_id, Date, Status) values ('" + value + "','" + value0 + " / " + value1 + "','New Payments Added')";
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

    private void clear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btnActionPerformed
        txtstuid.setText("");
        txtname.setText("");
        add_date.setDate(null);
        txtinvoice.setText("");
        txtamount.setText("");
        txtmonth.setSelectedIndex(0);
    }//GEN-LAST:event_clear_btnActionPerformed

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

                doc.add(new Paragraph((new Chunk("Student Payment Details Report" + "\n", blueFont))));
                doc.add(new Paragraph((year) + "." + (month + 1) + "." + day));
                PdfPTable tb1 = new PdfPTable(6);
                tb1.setHorizontalAlignment(ALIGN_CENTER);
                tb1.setWidthPercentage(100);
                tb1.setSpacingBefore(10f);
                tb1.setSpacingAfter(10f);

                PdfPCell cell = new PdfPCell(new Paragraph("Student Payments"));
                cell.setColspan(6);
                cell.setHorizontalAlignment(ALIGN_CENTER);
                cell.setBackgroundColor(new BaseColor(0, 166, 80));
                cell.setPadding(10.0f);
                tb1.addCell(cell);

                PdfPCell cell2 = new PdfPCell(new Paragraph("Student_id"));
                cell2.setColspan(1);
                cell2.setBackgroundColor(BaseColor.LIGHT_GRAY);
                cell2.setPadding(5.0f);
                tb1.addCell(cell2);

                PdfPCell cell3 = new PdfPCell(new Paragraph("Name"));
                cell3.setColspan(1);
                cell3.setBackgroundColor(BaseColor.LIGHT_GRAY);
                cell3.setPadding(5.0f);
                tb1.addCell(cell3);

                PdfPCell cell4 = new PdfPCell(new Paragraph("Date"));
                cell4.setColspan(1);
                cell4.setBackgroundColor(BaseColor.LIGHT_GRAY);
                cell4.setPadding(5.0f);
                tb1.addCell(cell4);

                PdfPCell cell5 = new PdfPCell(new Paragraph("Month"));
                cell5.setColspan(1);
                cell5.setBackgroundColor(BaseColor.LIGHT_GRAY);
                cell5.setPadding(5.0f);
                tb1.addCell(cell5);

                PdfPCell cell6 = new PdfPCell(new Paragraph("Invoice_no"));
                cell6.setColspan(1);
                cell6.setBackgroundColor(BaseColor.LIGHT_GRAY);
                cell6.setPadding(5.0f);
                tb1.addCell(cell6);

                PdfPCell cell7 = new PdfPCell(new Paragraph("Amount"));
                cell7.setColspan(1);
                cell7.setBackgroundColor(BaseColor.LIGHT_GRAY);
                cell7.setPadding(5.0f);
                tb1.addCell(cell7);

                for (int i = 0; i < fees_table.getRowCount(); i++) {

                    String id = fees_table.getValueAt(i, 0).toString();
                    String name = fees_table.getValueAt(i, 1).toString();
                    String paydate = fees_table.getValueAt(i, 2).toString();
                    String mon = fees_table.getValueAt(i, 3).toString();
                    String invoice_no = fees_table.getValueAt(i, 4).toString();
                    String amount = fees_table.getValueAt(i, 5).toString();

                    tb1.addCell(id);
                    tb1.addCell(name);
                    tb1.addCell(paydate);
                    tb1.addCell(mon);
                    tb1.addCell(invoice_no);
                    tb1.addCell(amount);
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
                String reg = "insert into logs (User_id,Date,Status) values ('" + value + "','" + value0 + " / " + values + "','Export payment details as PDF')";
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

        DefaultTableModel model = (DefaultTableModel) fees_table.getModel();

        Chooser excelFileChooser = new Chooser();
        excelFileChooser.setDialogTitle("Export to Excel");
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("EXCEL FILE", "xls", "xlsx", "xlsm");
        excelFileChooser.setFileFilter(fnef);
        int excelChooser = excelFileChooser.showSaveDialog(this);

        if (excelChooser == JFileChooser.APPROVE_OPTION) {

            try {
                excelJTableExport = new XSSFWorkbook();
                XSSFSheet excelSheet = excelJTableExport.createSheet("Student Payment Details Report");

                excelSheet.setColumnWidth(0, 8000);
                excelSheet.setColumnWidth(1, 4000);
                excelSheet.setColumnWidth(2, 4000);
                excelSheet.setColumnWidth(3, 4000);
                excelSheet.setColumnWidth(4, 4000);
                excelSheet.setColumnWidth(5, 4000);
                excelSheet.setColumnWidth(6, 4000);

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
                String reg = "insert into logs (User_id,Date,Status) values ('" + value + "','" + value0 + " / " + values + "','Export payment details to Excel')";
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
        
        String tmp = Emp.UserName;
        
        try {
            String sql = "select * from fees where Student_id=? AND Month=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, tmp);
            pst.setString(2, txt_search.getText());
            rs = pst.executeQuery();
            fees_table.setModel(DbUtils.resultSetToTableModel(rs));

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

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        Update_table();
        txt_search.setText("");
    }//GEN-LAST:event_btnresetActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private com.toedter.calendar.JDateChooser add_date;
    private javax.swing.JButton btnexcel;
    private javax.swing.JButton btnpdf;
    private javax.swing.JButton btnreset;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear_btn;
    private javax.swing.JTable fees_table;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txtamount;
    private javax.swing.JTextField txtinvoice;
    private javax.swing.JComboBox<String> txtmonth;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtstuid;
    // End of variables declaration//GEN-END:variables
    private String month;
}
