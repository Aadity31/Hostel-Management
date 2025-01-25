package hms;

import java.sql.*;
import javax.swing.JOptionPane;

public class db {

    public static Connection connect() {

        Connection conn = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/hms_db?" + "autoReconnect=true&useSSL=false", "root", "");
            return conn;

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Database Conncetion Problem.", "Warning", JOptionPane.WARNING_MESSAGE);
            return null;
        }

    }
}
