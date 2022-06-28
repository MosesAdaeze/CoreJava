package JDBC;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class Connect {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = null;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/NIIT", "root", "");
            System.out.print("Database is connected !");
            conn.close();
        } catch (Exception e) {
            System.out.print("Database was unable to connect");
            e.printStackTrace();
        }
    }
}
