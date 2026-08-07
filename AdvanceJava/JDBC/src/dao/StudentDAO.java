package dao;

import java.sql.*;
import model.Student;

public class StudentDAO {

    Connection con = DBConnection.getConnection();

    public void addStudent(Student s) {

        try {

            String query =
            "insert into student values(?,?,?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setInt(1, s.getRollno());
            ps.setString(2, s.getName());
            ps.setDouble(3, s.getMarks());
            ps.setString(4, s.getMobno());
            ps.setString(5, s.getAddress());
            ps.setDate(6, s.getDob());

            ps.executeUpdate();

            System.out.println("Student Added");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewStudents() {

        try {

            String query =
            "select * from student";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ResultSet rs =
                    ps.executeQuery();

            while(rs.next()) {

                System.out.println(
                        rs.getInt(1)+" "
                      + rs.getString(2)+" "
                      + rs.getDouble(3)+" "
                      + rs.getString(4)+" "
                      + rs.getString(5)+" "
                      + rs.getDate(6));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent(int rollno) {

        try {

            String query =
            "delete from student where rollno=?";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setInt(1, rollno);

            ps.executeUpdate();

            System.out.println("Deleted");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateMarks(int rollno,double marks) {

        try {

            String query =
            "update student set marks=? where rollno=?";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setDouble(1, marks);
            ps.setInt(2, rollno);

            ps.executeUpdate();

            System.out.println("Updated");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void birthdayWish() {

        try {

            String query =
            "SELECT name,mobno FROM student "
          + "WHERE MONTH(dob)=MONTH(CURDATE()) "
          + "AND DAY(dob)=DAY(CURDATE())";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ResultSet rs =
                    ps.executeQuery();

            while(rs.next()) {

                System.out.println(
                "SMS Sent To : "
                + rs.getString("mobno"));

                System.out.println(
                "Happy Birthday "
                + rs.getString("name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}