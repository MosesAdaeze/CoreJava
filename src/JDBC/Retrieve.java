package JDBC;

import java.sql.*;

public class Retrieve {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = null;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/NIIT", "root", "");
//            System.out.print("Database is connected !");

            String query = "select * from user";
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("username");
                String email = resultSet.getString("email");
                boolean gender = resultSet.getBoolean("gender");

                System.out.printf("%-10s%-20s%-20s%-10s\n", id, name, email ,  gender);
            }

            conn.close();
        }
        catch (Exception e) {
            System.out.print("Database was unable to connect");
            e.printStackTrace();
        }
    }
}
