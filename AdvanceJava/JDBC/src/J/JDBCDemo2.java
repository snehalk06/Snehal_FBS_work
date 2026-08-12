package J;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo2 {

    public static void main(String[] args) throws SQLException {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Class imported successfully");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/snehalrevision",
                    "root",
                    "snehal06");

            Statement stmt = con.createStatement();
            System.out.println("Connection established successfully");

            ResultSet rs = stmt.executeQuery("select * from employee");

            // ResultSetMetaData object
            ResultSetMetaData meta = rs.getMetaData();

            System.out.println("Total Columns : " + meta.getColumnCount());

            System.out.println("\nColumn Details:");
            for (int i = 1; i <= meta.getColumnCount(); i++) {
                System.out.println(
                        "Column Name : " + meta.getColumnName(i)
                        + " | Data Type : " + meta.getColumnTypeName(i));
            }

            System.out.println("\nEmployee Data:");

            while (rs.next()) {
                System.out.print(rs.getInt(1) + " ");
                System.out.print(rs.getString(2) + " ");
                System.out.print(rs.getBoolean(3) + "\n");
            }

            con.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}