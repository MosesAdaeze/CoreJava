package JDBC.Batch;

import java.sql.*;

public class BookInfo {
    public static void main(String[] args) {
        try {
            //Initialize and load type 4 JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Connect to data source using library DSN
            Connection conn = null;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/NIIT", "root", "");

            Statement stmt = conn.createStatement();
            conn.setAutoCommit(false);

            //Add insert statement into batch
            stmt.addBatch("INSERT INTO studentdb (id, firstname, lastname, student_age) VALUES ('004', 'Kane', 'Abel', '18')");
            stmt.addBatch("INSERT INTO studentdb (id, firstname, lastname, student_age) VALUES ('005', 'Lucy', 'Ethan', '20')");
            stmt.addBatch("INSERT INTO studentdb (id, firstname, lastname, student_age) VALUES ('006', 'Florence', 'Susan', '19')");

            //Executing a batch using executeBatch() method
            int[] results = stmt.executeBatch();
            System.out.println("");
            System.out.println("Using Statement Object");
            System.out.println("--------------------");
            for (int i = 0; i < results.length; i++) {
                System.out.println("Rows affected by" + (i + 1) + "INSERT statement: " + results[i]);
            }

            //use the preparedstatement object to perform batch updates
            PreparedStatement ps = conn.prepareStatement("INSERT INTO studentdb (id, firstname, lastname, student_age) VALUES (?, ?, ?, ?)");

            System.out.println("");
            System.out.println("------------------------");
            System.out.println("Using preparedStatement object");
            System.out.println("------------------------------");

            //Specify the values for the placeholders

            ps.setString(1, "007");
            ps.setInt(2, 547);
            ps.setString(3, "008");
            ps.setString(4, "009");

            ps.addBatch();

            ps.setString(1, "010");
            ps.setInt(2, 350);
            ps.setString(3, "011");
            ps.setString(4, "012");

            //Add the SQL statement to the batch
            ps.addBatch();

            //Execute the batch of SQL statements
            int[] numUpdates = ps.executeBatch();
            for (int i = 0; i < numUpdates.length; i++) {
                System.out.println("ROws affected by " + (i + 1) + "INSERT statement: " + numUpdates[i]);
            }

            //commit the INSERT statement in the batch
            conn.commit();

//        }catch(Exception e) {
//                System.out.println("Error : " + bue);
//            }catch(Exception e) {
//                System.out.println("Error : " + sqle);
            }catch(Exception e) {
                System.out.println("Error : " + e );
//            }catch (BatchUpdateException bue) {
//            System.out.println();
        }
    }
}
