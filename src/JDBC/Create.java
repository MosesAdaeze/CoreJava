package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {

    public static void main(String[] args) {
        // Open a connection
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/NIIT", "root", "");
            Statement statement = conn.createStatement();
        ) {
            String sql = "CREATE TABLE STUDENTDB " +
                    "( id INTEGER not NULL, " +
                    " firstname VARCHAR(255), " +
                    " lastname VARCHAR(255), " +
                    " student_age INTEGER, " +
                    " PRIMARY KEY ( id ))";

            statement.executeUpdate(sql);
            System.out.println("Created table in given database...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
