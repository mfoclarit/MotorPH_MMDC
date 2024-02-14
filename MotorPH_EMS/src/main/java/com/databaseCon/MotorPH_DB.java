package com.databaseCon;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class MotorPH_DB {
    public static Connection con = null;

    public static void loadConnection() {
        String url = "jdbc:mysql://localhost:3306/emp_msdb";
        String root = "root";
        String pass = "Password@123";

        try {
            con = DriverManager.getConnection(url, root, pass);

            if (con != null) {
                JOptionPane.showMessageDialog(null, "Database is Successfully Connected");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error in Database" + e);
        }
    }
}
